@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptLocalVarSet : VisualScriptNode {
    constructor() : super("VisualScriptLocalVarSet")
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
        infix fun from(other: VisualScriptNode): VisualScriptLocalVarSet = VisualScriptLocalVarSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptLocalVarSet = VisualScriptLocalVarSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptLocalVarSet = VisualScriptLocalVarSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptLocalVarSet = VisualScriptLocalVarSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptLocalVarSet = fromVariant(VisualScriptLocalVarSet(""), other)


        // Constants


    }


    // Properties
    open var varName: String
        get() = _icall_String(getVarNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setVarNameMethodBind, this.rawMemory, value)


    open var type: Long
        get() = _icall_Long(getVarTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVarTypeMethodBind, this.rawMemory, value)




    // Methods
    private val setVarNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptLocalVarSet", "set_var_name") }
    open fun setVarName(name: String) {
        _icall_Unit_String(setVarNameMethodBind, this.rawMemory, name)
    }


    private val getVarNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptLocalVarSet", "get_var_name") }
    open fun getVarName(): String {
        return _icall_String(getVarNameMethodBind, this.rawMemory)
    }


    private val setVarTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptLocalVarSet", "set_var_type") }
    open fun setVarType(type: Long) {
        _icall_Unit_Long(setVarTypeMethodBind, this.rawMemory, type)
    }


    private val getVarTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptLocalVarSet", "get_var_type") }
    open fun getVarType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getVarTypeMethodBind, this.rawMemory))
    }


}
