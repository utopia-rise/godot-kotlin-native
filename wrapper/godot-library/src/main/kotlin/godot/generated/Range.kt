@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
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
    open var minValue: Double
        get() = _icall_Double(getMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMinMethodBind, this.rawMemory, value)


    open var maxValue: Double
        get() = _icall_Double(getMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMaxMethodBind, this.rawMemory, value)


    open var step: Double
        get() = _icall_Double(getStepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setStepMethodBind, this.rawMemory, value)


    open var page: Double
        get() = _icall_Double(getPageMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPageMethodBind, this.rawMemory, value)


    open var value: Double
        get() = _icall_Double(getValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setValueMethodBind, this.rawMemory, value)


    open var ratio: Double
        get() = _icall_Double(getAsRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAsRatioMethodBind, this.rawMemory, value)


    open var expEdit: Boolean
        get() = _icall_Boolean(isRatioExpMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpRatioMethodBind, this.rawMemory, value)


    open var rounded: Boolean
        get() = _icall_Boolean(isUsingRoundedValuesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseRoundedValuesMethodBind, this.rawMemory, value)


    open var allowGreater: Double
        get() = _icall_Double(isGreaterAllowedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAllowGreaterMethodBind, this.rawMemory, value)


    open var allowLesser: Double
        get() = _icall_Double(isLesserAllowedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAllowLesserMethodBind, this.rawMemory, value)




    // Methods
    private val getValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_value") }
    open fun getValue(): Double {
        return _icall_Double(getValueMethodBind, this.rawMemory)
    }


    private val getMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_min") }
    open fun getMin(): Double {
        return _icall_Double(getMinMethodBind, this.rawMemory)
    }


    private val getMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_max") }
    open fun getMax(): Double {
        return _icall_Double(getMaxMethodBind, this.rawMemory)
    }


    private val getStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_step") }
    open fun getStep(): Double {
        return _icall_Double(getStepMethodBind, this.rawMemory)
    }


    private val getPageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_page") }
    open fun getPage(): Double {
        return _icall_Double(getPageMethodBind, this.rawMemory)
    }


    private val getAsRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "get_as_ratio") }
    open fun getAsRatio(): Double {
        return _icall_Double(getAsRatioMethodBind, this.rawMemory)
    }


    private val setValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_value") }
    open fun setValue(value: Double) {
        _icall_Unit_Double(setValueMethodBind, this.rawMemory, value)
    }


    private val setMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_min") }
    open fun setMin(minimum: Double) {
        _icall_Unit_Double(setMinMethodBind, this.rawMemory, minimum)
    }


    private val setMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_max") }
    open fun setMax(maximum: Double) {
        _icall_Unit_Double(setMaxMethodBind, this.rawMemory, maximum)
    }


    private val setStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_step") }
    open fun setStep(step: Double) {
        _icall_Unit_Double(setStepMethodBind, this.rawMemory, step)
    }


    private val setPageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_page") }
    open fun setPage(pagesize: Double) {
        _icall_Unit_Double(setPageMethodBind, this.rawMemory, pagesize)
    }


    private val setAsRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Range", "set_as_ratio") }
    open fun setAsRatio(value: Double) {
        _icall_Unit_Double(setAsRatioMethodBind, this.rawMemory, value)
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
