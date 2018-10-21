@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptTypeCast : VisualScriptNode {
    constructor() : super("VisualScriptTypeCast")
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
        infix fun from(other: VisualScriptNode): VisualScriptTypeCast = VisualScriptTypeCast("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptTypeCast = VisualScriptTypeCast("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptTypeCast = VisualScriptTypeCast("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptTypeCast = VisualScriptTypeCast("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptTypeCast = fromVariant(VisualScriptTypeCast(""), other)


        // Constants


    }


    // Properties
    open var baseType: String
        get() = _icall_String(getBaseTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, value)


    open var baseScript: String
        get() = _icall_String(getBaseScriptMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, value)




    // Methods
    private val setBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptTypeCast", "set_base_type") }
    open fun setBaseType(type: String) {
        _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, type)
    }


    private val getBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptTypeCast", "get_base_type") }
    open fun getBaseType(): String {
        return _icall_String(getBaseTypeMethodBind, this.rawMemory)
    }


    private val setBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptTypeCast", "set_base_script") }
    open fun setBaseScript(path: String) {
        _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, path)
    }


    private val getBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptTypeCast", "get_base_script") }
    open fun getBaseScript(): String {
        return _icall_String(getBaseScriptMethodBind, this.rawMemory)
    }


}
