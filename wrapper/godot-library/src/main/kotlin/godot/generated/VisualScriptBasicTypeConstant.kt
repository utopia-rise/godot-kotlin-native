@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptBasicTypeConstant : VisualScriptNode {
    constructor() : super("VisualScriptBasicTypeConstant")
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
        infix fun from(other: VisualScriptNode): VisualScriptBasicTypeConstant = VisualScriptBasicTypeConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptBasicTypeConstant = VisualScriptBasicTypeConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptBasicTypeConstant = VisualScriptBasicTypeConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptBasicTypeConstant = VisualScriptBasicTypeConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptBasicTypeConstant = fromVariant(VisualScriptBasicTypeConstant(""), other)


        // Constants


    }


    // Properties
    open var basicType: Long
        get() = _icall_Long(getBasicTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBasicTypeMethodBind, this.rawMemory, value)


    open var constant: String
        get() = _icall_String(getBasicTypeConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBasicTypeConstantMethodBind, this.rawMemory, value)




    // Methods
    private val setBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBasicTypeConstant", "set_basic_type") }
    open fun setBasicType(name: Long) {
        _icall_Unit_Long(setBasicTypeMethodBind, this.rawMemory, name)
    }


    private val getBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBasicTypeConstant", "get_basic_type") }
    open fun getBasicType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getBasicTypeMethodBind, this.rawMemory))
    }


    private val setBasicTypeConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBasicTypeConstant", "set_basic_type_constant") }
    open fun setBasicTypeConstant(name: String) {
        _icall_Unit_String(setBasicTypeConstantMethodBind, this.rawMemory, name)
    }


    private val getBasicTypeConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBasicTypeConstant", "get_basic_type_constant") }
    open fun getBasicTypeConstant(): String {
        return _icall_String(getBasicTypeConstantMethodBind, this.rawMemory)
    }


}
