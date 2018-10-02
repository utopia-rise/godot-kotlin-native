@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptOperator : VisualScriptNode {
    constructor() : super("VisualScriptOperator")
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
        infix fun from(other: VisualScriptNode): VisualScriptOperator = VisualScriptOperator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptOperator = VisualScriptOperator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptOperator = VisualScriptOperator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptOperator = VisualScriptOperator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptOperator = fromVariant(VisualScriptOperator(""), other)


        // Constants


    }


    // Properties
    open var operator: Int
        get() = _icall_Int(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setOperatorMethodBind, this.rawMemory, value)


    open var type: Int
        get() = _icall_Int(getTypedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTypedMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptOperator", "set_operator") }
    open fun setOperator(op: Int) {
        _icall_Unit_Int(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptOperator", "get_operator") }
    open fun getOperator(): Variant.Operator {
        return Variant.Operator.fromInt(_icall_Int(getOperatorMethodBind, this.rawMemory))
    }


    private val setTypedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptOperator", "set_typed") }
    open fun setTyped(type: Int) {
        _icall_Unit_Int(setTypedMethodBind, this.rawMemory, type)
    }


    private val getTypedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptOperator", "get_typed") }
    open fun getTyped(): Variant.Type {
        return Variant.Type.fromInt(_icall_Int(getTypedMethodBind, this.rawMemory))
    }


}
