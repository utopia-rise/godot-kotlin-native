@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptReturn : VisualScriptNode {
    constructor() : super("VisualScriptReturn")
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
        infix fun from(other: VisualScriptNode): VisualScriptReturn = VisualScriptReturn("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptReturn = VisualScriptReturn("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptReturn = VisualScriptReturn("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptReturn = VisualScriptReturn("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptReturn = fromVariant(VisualScriptReturn(""), other)


        // Constants


    }


    // Properties
    open var returnEnabled: Boolean
        get() = _icall_Boolean(isReturnValueEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnableReturnValueMethodBind, this.rawMemory, value)


    open var returnType: Long
        get() = _icall_Long(getReturnTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setReturnTypeMethodBind, this.rawMemory, value)




    // Methods
    private val setReturnTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptReturn", "set_return_type") }
    open fun setReturnType(type: Long) {
        _icall_Unit_Long(setReturnTypeMethodBind, this.rawMemory, type)
    }


    private val getReturnTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptReturn", "get_return_type") }
    open fun getReturnType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getReturnTypeMethodBind, this.rawMemory))
    }


    private val setEnableReturnValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptReturn", "set_enable_return_value") }
    open fun setEnableReturnValue(enable: Boolean) {
        _icall_Unit_Boolean(setEnableReturnValueMethodBind, this.rawMemory, enable)
    }


    private val isReturnValueEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptReturn", "is_return_value_enabled") }
    open fun isReturnValueEnabled(): Boolean {
        return _icall_Boolean(isReturnValueEnabledMethodBind, this.rawMemory)
    }


}
