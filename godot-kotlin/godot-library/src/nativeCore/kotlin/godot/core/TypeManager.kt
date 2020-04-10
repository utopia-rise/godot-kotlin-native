package godot.core

import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

// TODO: remove when the class generator is done.
open class Object(__ignore: String?) {
    constructor(): this(null) {
        if (Godot.shouldInitPtr()) {
            // call godot constructor here
        }
    }

    internal lateinit var ptr: COpaquePointer

    fun getClass(): String = ""
}
object ClassDB {
    fun getParentClass(cls: String): String = ""
}

internal object TypeManager {
    private val tags = AtomicReference(mutableListOf<COpaquePointer>().freeze())

    /**
     * Register a user defined type.
     */
    fun registerUserType(nativescriptHandle: COpaquePointer, className: String, factory: () -> Object) {
        val ref = createAndRegisterTag(factory)
        memScoped {
            checkNotNull(Godot.nativescript11.godot_nativescript_set_type_tag)(nativescriptHandle, className.cstr.ptr, ref)
        }
    }

    /**
     * Register an engine type (i.e Node, Spatial, etc ...).
     */
    fun registerEngineType(className: String, factory: () -> Object) {
        val ref = createAndRegisterTag(factory)
        memScoped {
            checkNotNull(Godot.nativescript11.godot_nativescript_set_global_type_tag)(Godot.languageIndex, className.cstr.ptr, ref)
        }
    }

    /**
     * Must be called when binding is exiting, this method will cleanup all native resources used by this class.
     */
    fun dispose() {
        // stable refs need manual cleanup
        tags.value.map { it.asStableRef<() -> Object>() }
            .forEach { it.dispose() }
    }

    /**
     * Wrap a native pointer to godot object into the appropriate kotlin type.  Returns a generic [godot.core.Object]
     * if [ptr] does not have any tag information.
     */
    fun wrap(ptr: COpaquePointer): Object {
        val tag = getTagFromInstancePtr(ptr)
        val factory = tag ?: { Godot.noInitZone { Object(null) } }
        val instance = factory()
        instance.ptr = ptr
        return instance
    }

    private fun createAndRegisterTag(factory: () -> Object): COpaquePointer {
        val tag = StableRef.create(factory).asCPointer()
        val copy = mutableListOf<COpaquePointer>()
        copy.addAll(tags.value)
        copy.add(tag)
        return tag
    }

    private fun getTagFromInstancePtr(ptr: COpaquePointer): (() -> Object)? {
        return memScoped {
            val obj = Godot.noInitZone { Object() }
            obj.ptr = ptr
            val className = obj.getClass()
            // user defined type
            // this should be first otherwise casting to a user defined type won't work!
            var tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_type_tag)(ptr)
            // engine type
            if (tag == null) {
                tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_global_type_tag)(Godot.languageIndex, className.cstr.ptr)
            }
            // parent class of an engine type (this is here for types not exposed by gdnative)
            // traverse the type hierarchy to find a tag that we can use
            if (tag == null) {
                var parentClass = ClassDB.getParentClass(className)
                while (parentClass.isNotEmpty()) {
                    tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_global_type_tag)(Godot.languageIndex, parentClass.cstr.ptr)
                    if (tag != null) {
                        break
                    }
                    parentClass = ClassDB.getParentClass(parentClass)
                }
            }
            return tag?.asStableRef<() -> Object>()?.get()
        }
    }
}