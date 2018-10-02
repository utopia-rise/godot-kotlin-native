@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class LinkButton : BaseButton {
    constructor() : super("LinkButton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class UnderlineMode(val id: Int) {
        UNDERLINE_MODE_ALWAYS(0),
        UNDERLINE_MODE_ON_HOVER(1),
        UNDERLINE_MODE_NEVER(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: BaseButton): LinkButton = LinkButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): LinkButton = LinkButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): LinkButton = LinkButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): LinkButton = LinkButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): LinkButton = LinkButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): LinkButton = fromVariant(LinkButton(""), other)


        // Constants
        const val UNDERLINE_MODE_ALWAYS: Int = 0
        const val UNDERLINE_MODE_ON_HOVER: Int = 1
        const val UNDERLINE_MODE_NEVER: Int = 2


    }


    // Properties
    open var text: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var underline: Int
        get() = _icall_Int(getUnderlineModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setUnderlineModeMethodBind, this.rawMemory, value)




    // Methods
    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("LinkButton", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("LinkButton", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


    private val setUnderlineModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("LinkButton", "set_underline_mode") }
    open fun setUnderlineMode(underlineMode: Int) {
        _icall_Unit_Int(setUnderlineModeMethodBind, this.rawMemory, underlineMode)
    }


    private val getUnderlineModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("LinkButton", "get_underline_mode") }
    open fun getUnderlineMode(): LinkButton.UnderlineMode {
        return LinkButton.UnderlineMode.fromInt(_icall_Int(getUnderlineModeMethodBind, this.rawMemory))
    }


}
