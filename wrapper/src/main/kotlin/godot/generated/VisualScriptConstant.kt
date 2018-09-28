@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptConstant : VisualScriptNode {
    constructor() : super("VisualScriptConstant")
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
        infix fun from(other: VisualScriptNode): VisualScriptConstant = VisualScriptConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptConstant = VisualScriptConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptConstant = VisualScriptConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptConstant = VisualScriptConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptConstant = fromVariant(VisualScriptConstant(""), other)


        // Constants


    }


    // Properties
    open var type: Int
        get() = _icall_Int(getConstantTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setConstantTypeMethodBind, this.rawMemory, value)


    open var value: Variant
        get() = _icall_Variant(getConstantValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Variant(setConstantValueMethodBind, this.rawMemory, value)




    // Methods
    private val setConstantTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstant", "set_constant_type") }
    open fun setConstantType(type: Int) {
        _icall_Unit_Int(setConstantTypeMethodBind, this.rawMemory, type)
    }


    private val getConstantTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstant", "get_constant_type") }
    open fun getConstantType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Int(getConstantTypeMethodBind, this.rawMemory))
    }


    private val setConstantValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstant", "set_constant_value") }
    open fun setConstantValue(value: Variant) {
        _icall_Unit_Variant(setConstantValueMethodBind, this.rawMemory, value)
    }


    private val getConstantValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstant", "get_constant_value") }
    open fun getConstantValue(): Variant {
        return _icall_Variant(getConstantValueMethodBind, this.rawMemory)
    }


}
