@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Button : BaseButton {
    constructor() : super("Button")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TextAlign(val id: Long) {
        ALIGN_LEFT(0),
        ALIGN_CENTER(1),
        ALIGN_RIGHT(2),
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
        infix fun from(other: BaseButton): Button = Button("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): Button = Button("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Button = Button("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Button = Button("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Button = Button("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Button = fromVariant(Button(""), other)


        // Constants
        const val ALIGN_LEFT: Long = 0
        const val ALIGN_CENTER: Long = 1
        const val ALIGN_RIGHT: Long = 2


    }


    // Properties
    open var text: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var icon: Texture
        get() = _icall_Texture(getButtonIconMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setButtonIconMethodBind, this.rawMemory, value)


    open var flat: Boolean
        get() = _icall_Boolean(isFlatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFlatMethodBind, this.rawMemory, value)


    open var clipText: Boolean
        get() = _icall_Boolean(getClipTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setClipTextMethodBind, this.rawMemory, value)


    open var align: Long
        get() = _icall_Long(getTextAlignMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTextAlignMethodBind, this.rawMemory, value)




    // Methods
    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


    private val setButtonIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "set_button_icon") }
    open fun setButtonIcon(texture: Texture) {
        _icall_Unit_Object(setButtonIconMethodBind, this.rawMemory, texture)
    }


    private val getButtonIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "get_button_icon") }
    open fun getButtonIcon(): Texture {
        return _icall_Texture(getButtonIconMethodBind, this.rawMemory)
    }


    private val setFlatMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "set_flat") }
    open fun setFlat(enabled: Boolean) {
        _icall_Unit_Boolean(setFlatMethodBind, this.rawMemory, enabled)
    }


    private val setClipTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "set_clip_text") }
    open fun setClipText(enabled: Boolean) {
        _icall_Unit_Boolean(setClipTextMethodBind, this.rawMemory, enabled)
    }


    private val getClipTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "get_clip_text") }
    open fun getClipText(): Boolean {
        return _icall_Boolean(getClipTextMethodBind, this.rawMemory)
    }


    private val setTextAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "set_text_align") }
    open fun setTextAlign(align: Long) {
        _icall_Unit_Long(setTextAlignMethodBind, this.rawMemory, align)
    }


    private val getTextAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "get_text_align") }
    open fun getTextAlign(): Button.TextAlign {
        return Button.TextAlign.fromInt(_icall_Long(getTextAlignMethodBind, this.rawMemory))
    }


    private val isFlatMethodBind: CPointer<godot_method_bind> by lazy { getMB("Button", "is_flat") }
    open fun isFlat(): Boolean {
        return _icall_Boolean(isFlatMethodBind, this.rawMemory)
    }


}
