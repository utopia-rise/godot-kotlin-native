@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Resource : Reference {
    constructor() : super("Resource")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val CHANGED: String = "changed"
        }
    }


    companion object {
        infix fun from(other: Reference): Resource = Resource("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Resource = Resource("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Resource = fromVariant(Resource(""), other)


        // Constants


    }


    // Properties
    open var resourceLocalToScene: Boolean
        get() = _icall_Boolean(isLocalToSceneMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLocalToSceneMethodBind, this.rawMemory, value)


    open var resourcePath: String
        get() = _icall_String(getPathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setPathMethodBind, this.rawMemory, value)


    open var resourceName: String
        get() = _icall_String(getNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setNameMethodBind, this.rawMemory, value)




    // Methods
    open fun _setup_local_to_scene() {
    }


    private val setPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "set_path") }
    open fun setPath(path: String) {
        _icall_Unit_String(setPathMethodBind, this.rawMemory, path)
    }


    private val takeOverPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "take_over_path") }
    open fun takeOverPath(path: String) {
        _icall_Unit_String(takeOverPathMethodBind, this.rawMemory, path)
    }


    private val getPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "get_path") }
    open fun getPath(): String {
        return _icall_String(getPathMethodBind, this.rawMemory)
    }


    private val setNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "set_name") }
    open fun setName(name: String) {
        _icall_Unit_String(setNameMethodBind, this.rawMemory, name)
    }


    private val getNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "get_name") }
    open fun getName(): String {
        return _icall_String(getNameMethodBind, this.rawMemory)
    }


    private val getRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "get_rid") }
    open fun getRid(): RID {
        return _icall_RID(getRidMethodBind, this.rawMemory)
    }


    private val setLocalToSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "set_local_to_scene") }
    open fun setLocalToScene(enable: Boolean) {
        _icall_Unit_Boolean(setLocalToSceneMethodBind, this.rawMemory, enable)
    }


    private val isLocalToSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "is_local_to_scene") }
    open fun isLocalToScene(): Boolean {
        return _icall_Boolean(isLocalToSceneMethodBind, this.rawMemory)
    }


    private val getLocalSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "get_local_scene") }
    open fun getLocalScene(): Node {
        return _icall_Node(getLocalSceneMethodBind, this.rawMemory)
    }


    private val setupLocalToSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "setup_local_to_scene") }
    open fun setupLocalToScene() {
        _icall_Unit(setupLocalToSceneMethodBind, this.rawMemory)
    }


    private val duplicateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Resource", "duplicate") }
    open fun duplicate(subresources: Boolean = false): Resource {
        return _icall_Resource_Boolean(duplicateMethodBind, this.rawMemory, subresources)
    }


}
