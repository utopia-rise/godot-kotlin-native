@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptClassConstant : VisualScriptNode {
    constructor() : super("VisualScriptClassConstant")
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
        infix fun from(other: VisualScriptNode): VisualScriptClassConstant = VisualScriptClassConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptClassConstant = VisualScriptClassConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptClassConstant = VisualScriptClassConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptClassConstant = VisualScriptClassConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptClassConstant = fromVariant(VisualScriptClassConstant(""), other)


        // Constants


    }


    // Properties
    open var baseType: String
        get() = _icall_String(getBaseTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, value)


    open var constant: String
        get() = _icall_String(getClassConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setClassConstantMethodBind, this.rawMemory, value)




    // Methods
    private val setClassConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptClassConstant", "set_class_constant") }
    open fun setClassConstant(name: String) {
        _icall_Unit_String(setClassConstantMethodBind, this.rawMemory, name)
    }


    private val getClassConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptClassConstant", "get_class_constant") }
    open fun getClassConstant(): String {
        return _icall_String(getClassConstantMethodBind, this.rawMemory)
    }


    private val setBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptClassConstant", "set_base_type") }
    open fun setBaseType(name: String) {
        _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, name)
    }


    private val getBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptClassConstant", "get_base_type") }
    open fun getBaseType(): String {
        return _icall_String(getBaseTypeMethodBind, this.rawMemory)
    }


}
