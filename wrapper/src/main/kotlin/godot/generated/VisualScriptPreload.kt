@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptPreload : VisualScriptNode {
    constructor() : super("VisualScriptPreload")
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
        infix fun from(other: VisualScriptNode): VisualScriptPreload = VisualScriptPreload("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptPreload = VisualScriptPreload("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptPreload = VisualScriptPreload("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptPreload = VisualScriptPreload("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptPreload = fromVariant(VisualScriptPreload(""), other)


        // Constants


    }


    // Properties
    open var resource: Resource
        get() = _icall_Resource(getPreloadMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setPreloadMethodBind, this.rawMemory, value)




    // Methods
    private val setPreloadMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPreload", "set_preload") }
    open fun setPreload(resource: Resource) {
        _icall_Unit_Object(setPreloadMethodBind, this.rawMemory, resource)
    }


    private val getPreloadMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPreload", "get_preload") }
    open fun getPreload(): Resource {
        return _icall_Resource(getPreloadMethodBind, this.rawMemory)
    }


}
