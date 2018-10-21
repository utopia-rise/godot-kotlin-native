@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ResourcePreloader : Node {
    constructor() : super("ResourcePreloader")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Node): ResourcePreloader = ResourcePreloader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ResourcePreloader = ResourcePreloader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ResourcePreloader = fromVariant(ResourcePreloader(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _set_resources(arg0: GDArray) {
    }


    open fun _get_resources(): GDArray {
        throw NotImplementedError("_get_resources is not implemented for ResourcePreloader")
    }


    private val addResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourcePreloader", "add_resource") }
    open fun addResource(name: String, resource: Resource) {
        _icall_Unit_String_Object(addResourceMethodBind, this.rawMemory, name, resource)
    }


    private val removeResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourcePreloader", "remove_resource") }
    open fun removeResource(name: String) {
        _icall_Unit_String(removeResourceMethodBind, this.rawMemory, name)
    }


    private val renameResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourcePreloader", "rename_resource") }
    open fun renameResource(name: String, newname: String) {
        _icall_Unit_String_String(renameResourceMethodBind, this.rawMemory, name, newname)
    }


    private val hasResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourcePreloader", "has_resource") }
    open fun hasResource(name: String): Boolean {
        return _icall_Boolean_String(hasResourceMethodBind, this.rawMemory, name)
    }


    private val getResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourcePreloader", "get_resource") }
    open fun getResource(name: String): Resource {
        return _icall_Resource_String(getResourceMethodBind, this.rawMemory, name)
    }


    private val getResourceListMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourcePreloader", "get_resource_list") }
    open fun getResourceList(): PoolStringArray {
        return _icall_PoolStringArray(getResourceListMethodBind, this.rawMemory)
    }


}
