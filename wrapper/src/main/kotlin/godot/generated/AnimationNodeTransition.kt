@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeTransition : AnimationNode {
    constructor() : super("AnimationNodeTransition")
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
        infix fun from(other: AnimationNode): AnimationNodeTransition = AnimationNodeTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeTransition = AnimationNodeTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeTransition = AnimationNodeTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeTransition = AnimationNodeTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeTransition = fromVariant(AnimationNodeTransition(""), other)


        // Constants


    }


    // Properties
    open var inputCount: Long
        get() = _icall_Long(getEnabledInputsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setEnabledInputsMethodBind, this.rawMemory, value)


    open var current: Long
        get() = _icall_Long(getCurrentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCurrentMethodBind, this.rawMemory, value)


    open var xfadeTime: Double
        get() = _icall_Double(getCrossFadeTimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCrossFadeTimeMethodBind, this.rawMemory, value)


    open var input0_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 0, value)


    open var input0_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 0, value)


    open var input1_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 1, value)


    open var input1_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 1, value)


    open var input2_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 2, value)


    open var input2_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 2, value)


    open var input3_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 3, value)


    open var input3_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 3, value)


    open var input4_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 4, value)


    open var input4_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 4, value)


    open var input5_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 5, value)


    open var input5_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 5, value)


    open var input6_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 6, value)


    open var input6_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 6, value)


    open var input7_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 7, value)


    open var input7_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 7, value)


    open var input8_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 8, value)


    open var input8_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 8, value)


    open var input9_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 9, value)


    open var input9_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 9, value)


    open var input10_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 10, value)


    open var input10_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 10, value)


    open var input11_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 11, value)


    open var input11_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 11, value)


    open var input12_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 12, value)


    open var input12_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 12, value)


    open var input13_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 13, value)


    open var input13_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 13, value)


    open var input14_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 14, value)


    open var input14_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 14, value)


    open var input15_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 15, value)


    open var input15_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 15, value)


    open var input16_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 16, value)


    open var input16_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 16, value)


    open var input17_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 17, value)


    open var input17_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 17, value)


    open var input18_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 18, value)


    open var input18_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 18, value)


    open var input19_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 19, value)


    open var input19_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 19, value)


    open var input20_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 20, value)


    open var input20_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 20, value)


    open var input21_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 21, value)


    open var input21_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 21, value)


    open var input22_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 22)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 22, value)


    open var input22_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 22)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 22, value)


    open var input23_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 23)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 23, value)


    open var input23_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 23)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 23, value)


    open var input24_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 24)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 24, value)


    open var input24_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 24)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 24, value)


    open var input25_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 25)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 25, value)


    open var input25_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 25)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 25, value)


    open var input26_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 26)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 26, value)


    open var input26_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 26)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 26, value)


    open var input27_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 27)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 27, value)


    open var input27_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 27)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 27, value)


    open var input28_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 28)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 28, value)


    open var input28_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 28)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 28, value)


    open var input29_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 29)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 29, value)


    open var input29_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 29)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 29, value)


    open var input30_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 30)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 30, value)


    open var input30_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 30)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 30, value)


    open var input31_name: String
        get() = _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, 31)
        set(value) = _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, 31, value)


    open var input31_autoAdvance: Boolean
        get() = _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, 31)
        set(value) = _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, 31, value)




    // Methods
    private val setEnabledInputsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "set_enabled_inputs") }
    open fun setEnabledInputs(amount: Long) {
        _icall_Unit_Long(setEnabledInputsMethodBind, this.rawMemory, amount)
    }


    private val getEnabledInputsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "get_enabled_inputs") }
    open fun getEnabledInputs(): Long {
        return _icall_Long(getEnabledInputsMethodBind, this.rawMemory)
    }


    private val setInputAsAutoAdvanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "set_input_as_auto_advance") }
    open fun setInputAsAutoAdvance(input: Long, enable: Boolean) {
        _icall_Unit_Long_Boolean(setInputAsAutoAdvanceMethodBind, this.rawMemory, input, enable)
    }


    private val isInputSetAsAutoAdvanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "is_input_set_as_auto_advance") }
    open fun isInputSetAsAutoAdvance(input: Long): Boolean {
        return _icall_Boolean_Long(isInputSetAsAutoAdvanceMethodBind, this.rawMemory, input)
    }


    private val setInputCaptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "set_input_caption") }
    open fun setInputCaption(input: Long, caption: String) {
        _icall_Unit_Long_String(setInputCaptionMethodBind, this.rawMemory, input, caption)
    }


    private val getInputCaptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "get_input_caption") }
    open fun getInputCaption(input: Long): String {
        return _icall_String_Long(getInputCaptionMethodBind, this.rawMemory, input)
    }


    private val setCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "set_current") }
    open fun setCurrent(index: Long) {
        _icall_Unit_Long(setCurrentMethodBind, this.rawMemory, index)
    }


    private val getCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "get_current") }
    open fun getCurrent(): Long {
        return _icall_Long(getCurrentMethodBind, this.rawMemory)
    }


    private val setCrossFadeTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "set_cross_fade_time") }
    open fun setCrossFadeTime(time: Double) {
        _icall_Unit_Double(setCrossFadeTimeMethodBind, this.rawMemory, time)
    }


    private val getCrossFadeTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTransition", "get_cross_fade_time") }
    open fun getCrossFadeTime(): Double {
        return _icall_Double(getCrossFadeTimeMethodBind, this.rawMemory)
    }


}
