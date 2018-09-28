@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Range : Control {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val VALUE_CHANGED: String = "value_changed"
            const val CHANGED: String = "changed"
        }
    }


    companion object {
        infix fun from(other: Control): Range = Range("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Range = Range("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Range = Range("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Range = Range("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Range = fromVariant(Range(""), other)


        // Constants


    }


    // Properties
    open var minValue: Float
        get() = _icall_Float(getMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMinMethodBind, this.rawMemory, value)


    open var maxValue: Float
        get() = _icall_Float(getMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMaxMethodBind, this.rawMemory, value)


    open var step: Float
        get() = _icall_Float(getStepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setStepMethodBind, this.rawMemory, value)


    open var page: Float
        get() = _icall_Float(getPageMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPageMethodBind, this.rawMemory, value)


    open var value: Float
        get() = _icall_Float(getValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setValueMethodBind, this.rawMemory, value)


    open var ratio: Float
        get() = _icall_Float(getAsRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAsRatioMethodBind, this.rawMemory, value)


    open var expEdit: Boolean
        get() = _icall_Boolean(isRatioExpMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpRatioMethodBind, this.rawMemory, value)


    open var rounded: Boolean
        get() = _icall_Boolean(isUsingRoundedValuesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseRoundedValuesMethodBind, this.rawMemory, value)


    open var allowGreater: Float
        get() = _icall_Float(isGreaterAllowedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAllowGreaterMethodBind, this.rawMemory, value)


    open var allowLesser: Float
        get() = _icall_Float(isLesserAllowedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAllowLesserMethodBind, this.rawMemory, value)




    // Methods
    private val getValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_value") }
    open fun getValue(): Float {
        return _icall_Float(getValueMethodBind, this.rawMemory)
    }


    private val getMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_min") }
    open fun getMin(): Float {
        return _icall_Float(getMinMethodBind, this.rawMemory)
    }


    private val getMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_max") }
    open fun getMax(): Float {
        return _icall_Float(getMaxMethodBind, this.rawMemory)
    }


    private val getStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_step") }
    open fun getStep(): Float {
        return _icall_Float(getStepMethodBind, this.rawMemory)
    }


    private val getPageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_page") }
    open fun getPage(): Float {
        return _icall_Float(getPageMethodBind, this.rawMemory)
    }


    private val getAsRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_as_ratio") }
    open fun getAsRatio(): Float {
        return _icall_Float(getAsRatioMethodBind, this.rawMemory)
    }


    private val setValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_value") }
    open fun setValue(value: Float) {
        _icall_Unit_Float(setValueMethodBind, this.rawMemory, value)
    }


    private val setMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_min") }
    open fun setMin(minimum: Float) {
        _icall_Unit_Float(setMinMethodBind, this.rawMemory, minimum)
    }


    private val setMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_max") }
    open fun setMax(maximum: Float) {
        _icall_Unit_Float(setMaxMethodBind, this.rawMemory, maximum)
    }


    private val setStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_step") }
    open fun setStep(step: Float) {
        _icall_Unit_Float(setStepMethodBind, this.rawMemory, step)
    }


    private val setPageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_page") }
    open fun setPage(pagesize: Float) {
        _icall_Unit_Float(setPageMethodBind, this.rawMemory, pagesize)
    }


    private val setAsRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_as_ratio") }
    open fun setAsRatio(value: Float) {
        _icall_Unit_Float(setAsRatioMethodBind, this.rawMemory, value)
    }


    private val setUseRoundedValuesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_use_rounded_values") }
    open fun setUseRoundedValues(enabled: Boolean) {
        _icall_Unit_Boolean(setUseRoundedValuesMethodBind, this.rawMemory, enabled)
    }


    private val isUsingRoundedValuesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "is_using_rounded_values") }
    open fun isUsingRoundedValues(): Boolean {
        return _icall_Boolean(isUsingRoundedValuesMethodBind, this.rawMemory)
    }


    private val setExpRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_exp_ratio") }
    open fun setExpRatio(enabled: Boolean) {
        _icall_Unit_Boolean(setExpRatioMethodBind, this.rawMemory, enabled)
    }


    private val isRatioExpMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "is_ratio_exp") }
    open fun isRatioExp(): Boolean {
        return _icall_Boolean(isRatioExpMethodBind, this.rawMemory)
    }


    private val setAllowGreaterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_allow_greater") }
    open fun setAllowGreater(allow: Boolean) {
        _icall_Unit_Boolean(setAllowGreaterMethodBind, this.rawMemory, allow)
    }


    private val isGreaterAllowedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "is_greater_allowed") }
    open fun isGreaterAllowed(): Boolean {
        return _icall_Boolean(isGreaterAllowedMethodBind, this.rawMemory)
    }


    private val setAllowLesserMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_allow_lesser") }
    open fun setAllowLesser(allow: Boolean) {
        _icall_Unit_Boolean(setAllowLesserMethodBind, this.rawMemory, allow)
    }


    private val isLesserAllowedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "is_lesser_allowed") }
    open fun isLesserAllowed(): Boolean {
        return _icall_Boolean(isLesserAllowedMethodBind, this.rawMemory)
    }


    private val shareMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "share") }
    open fun share(with: Object) {
        _icall_Unit_Object(shareMethodBind, this.rawMemory, with)
    }


    private val unshareMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "unshare") }
    open fun unshare() {
        _icall_Unit(unshareMethodBind, this.rawMemory)
    }


}
