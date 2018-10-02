@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Label : Control {
    constructor() : super("Label")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Align(val id: Long) {
        ALIGN_LEFT(0),
        ALIGN_CENTER(1),
        ALIGN_RIGHT(2),
        ALIGN_FILL(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class VAlign(val id: Long) {
        VALIGN_TOP(0),
        VALIGN_CENTER(1),
        VALIGN_BOTTOM(2),
        VALIGN_FILL(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Control): Label = Label("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Label = Label("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Label = Label("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Label = Label("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Label = fromVariant(Label(""), other)


        // Constants
        const val ALIGN_LEFT: Long = 0
        const val ALIGN_CENTER: Long = 1
        const val ALIGN_RIGHT: Long = 2
        const val ALIGN_FILL: Long = 3
        const val VALIGN_TOP: Long = 0
        const val VALIGN_CENTER: Long = 1
        const val VALIGN_BOTTOM: Long = 2
        const val VALIGN_FILL: Long = 3


    }


    // Properties
    open var text: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var align: Long
        get() = _icall_Long(getAlignMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAlignMethodBind, this.rawMemory, value)


    open var valign: Long
        get() = _icall_Long(getValignMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setValignMethodBind, this.rawMemory, value)


    open var autowrap: Boolean
        get() = _icall_Boolean(hasAutowrapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutowrapMethodBind, this.rawMemory, value)


    open var clipText: Boolean
        get() = _icall_Boolean(isClippingTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setClipTextMethodBind, this.rawMemory, value)


    open var uppercase: Boolean
        get() = _icall_Boolean(isUppercaseMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUppercaseMethodBind, this.rawMemory, value)


    open var visibleCharacters: Long
        get() = _icall_Long(getVisibleCharactersMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVisibleCharactersMethodBind, this.rawMemory, value)


    open var percentVisible: Double
        get() = _icall_Double(getPercentVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPercentVisibleMethodBind, this.rawMemory, value)


    open var linesSkipped: Long
        get() = _icall_Long(getLinesSkippedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLinesSkippedMethodBind, this.rawMemory, value)


    open var maxLinesVisible: Long
        get() = _icall_Long(getMaxLinesVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMaxLinesVisibleMethodBind, this.rawMemory, value)




    // Methods
    private val setAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_align") }
    open fun setAlign(align: Long) {
        _icall_Unit_Long(setAlignMethodBind, this.rawMemory, align)
    }


    private val getAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_align") }
    open fun getAlign(): Label.Align {
        return Label.Align.fromInt(_icall_Long(getAlignMethodBind, this.rawMemory))
    }


    private val setValignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_valign") }
    open fun setValign(valign: Long) {
        _icall_Unit_Long(setValignMethodBind, this.rawMemory, valign)
    }


    private val getValignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_valign") }
    open fun getValign(): Label.VAlign {
        return Label.VAlign.fromInt(_icall_Long(getValignMethodBind, this.rawMemory))
    }


    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


    private val setAutowrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_autowrap") }
    open fun setAutowrap(enable: Boolean) {
        _icall_Unit_Boolean(setAutowrapMethodBind, this.rawMemory, enable)
    }


    private val hasAutowrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "has_autowrap") }
    open fun hasAutowrap(): Boolean {
        return _icall_Boolean(hasAutowrapMethodBind, this.rawMemory)
    }


    private val setClipTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_clip_text") }
    open fun setClipText(enable: Boolean) {
        _icall_Unit_Boolean(setClipTextMethodBind, this.rawMemory, enable)
    }


    private val isClippingTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "is_clipping_text") }
    open fun isClippingText(): Boolean {
        return _icall_Boolean(isClippingTextMethodBind, this.rawMemory)
    }


    private val setUppercaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_uppercase") }
    open fun setUppercase(enable: Boolean) {
        _icall_Unit_Boolean(setUppercaseMethodBind, this.rawMemory, enable)
    }


    private val isUppercaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "is_uppercase") }
    open fun isUppercase(): Boolean {
        return _icall_Boolean(isUppercaseMethodBind, this.rawMemory)
    }


    private val getLineHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_line_height") }
    open fun getLineHeight(): Long {
        return _icall_Long(getLineHeightMethodBind, this.rawMemory)
    }


    private val getLineCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_line_count") }
    open fun getLineCount(): Long {
        return _icall_Long(getLineCountMethodBind, this.rawMemory)
    }


    private val getVisibleLineCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_visible_line_count") }
    open fun getVisibleLineCount(): Long {
        return _icall_Long(getVisibleLineCountMethodBind, this.rawMemory)
    }


    private val getTotalCharacterCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_total_character_count") }
    open fun getTotalCharacterCount(): Long {
        return _icall_Long(getTotalCharacterCountMethodBind, this.rawMemory)
    }


    private val setVisibleCharactersMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_visible_characters") }
    open fun setVisibleCharacters(amount: Long) {
        _icall_Unit_Long(setVisibleCharactersMethodBind, this.rawMemory, amount)
    }


    private val getVisibleCharactersMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_visible_characters") }
    open fun getVisibleCharacters(): Long {
        return _icall_Long(getVisibleCharactersMethodBind, this.rawMemory)
    }


    private val setPercentVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_percent_visible") }
    open fun setPercentVisible(percentVisible: Double) {
        _icall_Unit_Double(setPercentVisibleMethodBind, this.rawMemory, percentVisible)
    }


    private val getPercentVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_percent_visible") }
    open fun getPercentVisible(): Double {
        return _icall_Double(getPercentVisibleMethodBind, this.rawMemory)
    }


    private val setLinesSkippedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_lines_skipped") }
    open fun setLinesSkipped(linesSkipped: Long) {
        _icall_Unit_Long(setLinesSkippedMethodBind, this.rawMemory, linesSkipped)
    }


    private val getLinesSkippedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_lines_skipped") }
    open fun getLinesSkipped(): Long {
        return _icall_Long(getLinesSkippedMethodBind, this.rawMemory)
    }


    private val setMaxLinesVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "set_max_lines_visible") }
    open fun setMaxLinesVisible(linesVisible: Long) {
        _icall_Unit_Long(setMaxLinesVisibleMethodBind, this.rawMemory, linesVisible)
    }


    private val getMaxLinesVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Label", "get_max_lines_visible") }
    open fun getMaxLinesVisible(): Long {
        return _icall_Long(getMaxLinesVisibleMethodBind, this.rawMemory)
    }


}
