@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ScrollContainer : Container {
    constructor() : super("ScrollContainer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SCROLL_STARTED: String = "scroll_started"
            const val SCROLL_ENDED: String = "scroll_ended"
        }
    }


    companion object {
        infix fun from(other: Container): ScrollContainer = ScrollContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ScrollContainer = ScrollContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ScrollContainer = ScrollContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ScrollContainer = ScrollContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ScrollContainer = ScrollContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ScrollContainer = fromVariant(ScrollContainer(""), other)


        // Constants


    }


    // Properties
    open var scrollHorizontalEnabled: Boolean
        get() = _icall_Boolean(isHScrollEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnableHScrollMethodBind, this.rawMemory, value)


    open var scrollHorizontal: Int
        get() = _icall_Int(getHScrollMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setHScrollMethodBind, this.rawMemory, value)


    open var scrollVerticalEnabled: Boolean
        get() = _icall_Boolean(isVScrollEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnableVScrollMethodBind, this.rawMemory, value)


    open var scrollVertical: Int
        get() = _icall_Int(getVScrollMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setVScrollMethodBind, this.rawMemory, value)


    open var scrollDeadzone: Int
        get() = _icall_Int(getDeadzoneMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDeadzoneMethodBind, this.rawMemory, value)




    // Methods
    open fun _scroll_moved(arg0: Float) {
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    private val setEnableHScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "set_enable_h_scroll") }
    open fun setEnableHScroll(enable: Boolean) {
        _icall_Unit_Boolean(setEnableHScrollMethodBind, this.rawMemory, enable)
    }


    private val isHScrollEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "is_h_scroll_enabled") }
    open fun isHScrollEnabled(): Boolean {
        return _icall_Boolean(isHScrollEnabledMethodBind, this.rawMemory)
    }


    private val setEnableVScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "set_enable_v_scroll") }
    open fun setEnableVScroll(enable: Boolean) {
        _icall_Unit_Boolean(setEnableVScrollMethodBind, this.rawMemory, enable)
    }


    private val isVScrollEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "is_v_scroll_enabled") }
    open fun isVScrollEnabled(): Boolean {
        return _icall_Boolean(isVScrollEnabledMethodBind, this.rawMemory)
    }


    open fun _update_scrollbar_position() {
    }


    private val setHScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "set_h_scroll") }
    open fun setHScroll(value: Int) {
        _icall_Unit_Int(setHScrollMethodBind, this.rawMemory, value)
    }


    private val getHScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "get_h_scroll") }
    open fun getHScroll(): Int {
        return _icall_Int(getHScrollMethodBind, this.rawMemory)
    }


    private val setVScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "set_v_scroll") }
    open fun setVScroll(value: Int) {
        _icall_Unit_Int(setVScrollMethodBind, this.rawMemory, value)
    }


    private val getVScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "get_v_scroll") }
    open fun getVScroll(): Int {
        return _icall_Int(getVScrollMethodBind, this.rawMemory)
    }


    private val setDeadzoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "set_deadzone") }
    open fun setDeadzone(deadzone: Int) {
        _icall_Unit_Int(setDeadzoneMethodBind, this.rawMemory, deadzone)
    }


    private val getDeadzoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "get_deadzone") }
    open fun getDeadzone(): Int {
        return _icall_Int(getDeadzoneMethodBind, this.rawMemory)
    }


    private val getHScrollbarMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "get_h_scrollbar") }
    open fun getHScrollbar(): HScrollBar {
        return _icall_HScrollBar(getHScrollbarMethodBind, this.rawMemory)
    }


    private val getVScrollbarMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollContainer", "get_v_scrollbar") }
    open fun getVScrollbar(): VScrollBar {
        return _icall_VScrollBar(getVScrollbarMethodBind, this.rawMemory)
    }


}
