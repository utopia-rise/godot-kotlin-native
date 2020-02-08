package godot

import godot.core.CoreType
import godot.core.Variant
import godot.gdnative.godot_get_class_constructor
import godot.gdnative.godot_variant_as_object
import godot.registration.nativeConstructorInvocationFlag
import godot.registration.nonNativeConstructorRawMemory
import kotlinx.cinterop.*
import kotlin.reflect.KFunction1


actual abstract class GodotObject : CoreType {
    private var godotCoreMemory: COpaquePointer? = null


    internal constructor(mem: COpaquePointer) {
        godotCoreMemory = mem.reinterpret<COpaquePointerVar>().pointed.value
    }
    internal constructor(variant: Variant) {
        godotCoreMemory = godot_variant_as_object(variant.nativeValue)
    }
    internal constructor(name: String) {
        if (nativeConstructorInvocationFlag) {
            if (name != "") {
                godot_get_class_constructor(name)?.let {
                    godotCoreMemory = it.reinterpret<CFunction<() -> COpaquePointer>>()()
                    // TODO: put destructor somewhere
                } ?: throw NotImplementedError("There is no constructor for class $name in GD")
            }
        } else {
            nativeConstructorInvocationFlag = true
            godotCoreMemory = nonNativeConstructorRawMemory!!
        }
    }


    override fun isNull(): Boolean = godotCoreMemory == null


    internal val rawMemory: COpaquePointer
        get() = godotCoreMemory ?: throw NullPointerException("Attempt to use null object: $this")


    final override fun getRawMemory(memScope: MemScope): COpaquePointer = rawMemory
    final override fun setRawMemory(mem: COpaquePointer) {
        godotCoreMemory = mem
    }


    actual var __yieldSignalFunction: KFunction1<Array<out Variant>, Unit>? = null
    actual fun __yieldSignalListener(vararg args: Variant) {
        __yieldSignalFunction?.invoke(args)
    }
}
