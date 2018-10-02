@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GraphNode : Container {
    constructor() : super("GraphNode")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Overlay(val id: Int) {
        OVERLAY_DISABLED(0),
        OVERLAY_BREAKPOINT(1),
        OVERLAY_POSITION(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val RAISE_REQUEST: String = "raise_request"
            const val CLOSE_REQUEST: String = "close_request"
            const val DRAGGED: String = "dragged"
            const val OFFSET_CHANGED: String = "offset_changed"
            const val RESIZE_REQUEST: String = "resize_request"
        }
    }


    companion object {
        infix fun from(other: Container): GraphNode = GraphNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): GraphNode = GraphNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): GraphNode = GraphNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GraphNode = GraphNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GraphNode = GraphNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GraphNode = fromVariant(GraphNode(""), other)


        // Constants
        const val OVERLAY_DISABLED: Int = 0
        const val OVERLAY_BREAKPOINT: Int = 1
        const val OVERLAY_POSITION: Int = 2


    }


    // Properties
    open var title: String
        get() = _icall_String(getTitleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTitleMethodBind, this.rawMemory, value)


    open var offset: Vector2
        get() = _icall_Vector2(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var showClose: Boolean
        get() = _icall_Boolean(isCloseButtonVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShowCloseButtonMethodBind, this.rawMemory, value)


    open var resizable: Boolean
        get() = _icall_Boolean(isResizableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setResizableMethodBind, this.rawMemory, value)


    open var selected: Boolean
        get() = _icall_Boolean(isSelectedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSelectedMethodBind, this.rawMemory, value)


    open var comment: Boolean
        get() = _icall_Boolean(isCommentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCommentMethodBind, this.rawMemory, value)


    open var overlay: Int
        get() = _icall_Int(getOverlayMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setOverlayMethodBind, this.rawMemory, value)




    // Methods
    private val setTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_title") }
    open fun setTitle(title: String) {
        _icall_Unit_String(setTitleMethodBind, this.rawMemory, title)
    }


    private val getTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_title") }
    open fun getTitle(): String {
        return _icall_String(getTitleMethodBind, this.rawMemory)
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    private val setSlotMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_slot") }
    open fun setSlot(idx: Int, enableLeft: Boolean, typeLeft: Int, colorLeft: Color, enableRight: Boolean, typeRight: Int, colorRight: Color, customLeft: Texture, customRight: Texture) {
        _icall_Unit_Int_Boolean_Int_Color_Boolean_Int_Color_Object_Object(setSlotMethodBind, this.rawMemory, idx, enableLeft, typeLeft, colorLeft, enableRight, typeRight, colorRight, customLeft, customRight)
    }


    private val clearSlotMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "clear_slot") }
    open fun clearSlot(idx: Int) {
        _icall_Unit_Int(clearSlotMethodBind, this.rawMemory, idx)
    }


    private val clearAllSlotsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "clear_all_slots") }
    open fun clearAllSlots() {
        _icall_Unit(clearAllSlotsMethodBind, this.rawMemory)
    }


    private val isSlotEnabledLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "is_slot_enabled_left") }
    open fun isSlotEnabledLeft(idx: Int): Boolean {
        return _icall_Boolean_Int(isSlotEnabledLeftMethodBind, this.rawMemory, idx)
    }


    private val getSlotTypeLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_slot_type_left") }
    open fun getSlotTypeLeft(idx: Int): Int {
        return _icall_Int_Int(getSlotTypeLeftMethodBind, this.rawMemory, idx)
    }


    private val getSlotColorLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_slot_color_left") }
    open fun getSlotColorLeft(idx: Int): Color {
        return _icall_Color_Int(getSlotColorLeftMethodBind, this.rawMemory, idx)
    }


    private val isSlotEnabledRightMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "is_slot_enabled_right") }
    open fun isSlotEnabledRight(idx: Int): Boolean {
        return _icall_Boolean_Int(isSlotEnabledRightMethodBind, this.rawMemory, idx)
    }


    private val getSlotTypeRightMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_slot_type_right") }
    open fun getSlotTypeRight(idx: Int): Int {
        return _icall_Int_Int(getSlotTypeRightMethodBind, this.rawMemory, idx)
    }


    private val getSlotColorRightMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_slot_color_right") }
    open fun getSlotColorRight(idx: Int): Color {
        return _icall_Color_Int(getSlotColorRightMethodBind, this.rawMemory, idx)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val setCommentMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_comment") }
    open fun setComment(comment: Boolean) {
        _icall_Unit_Boolean(setCommentMethodBind, this.rawMemory, comment)
    }


    private val isCommentMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "is_comment") }
    open fun isComment(): Boolean {
        return _icall_Boolean(isCommentMethodBind, this.rawMemory)
    }


    private val setResizableMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_resizable") }
    open fun setResizable(resizable: Boolean) {
        _icall_Unit_Boolean(setResizableMethodBind, this.rawMemory, resizable)
    }


    private val isResizableMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "is_resizable") }
    open fun isResizable(): Boolean {
        return _icall_Boolean(isResizableMethodBind, this.rawMemory)
    }


    private val setSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_selected") }
    open fun setSelected(selected: Boolean) {
        _icall_Unit_Boolean(setSelectedMethodBind, this.rawMemory, selected)
    }


    private val isSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "is_selected") }
    open fun isSelected(): Boolean {
        return _icall_Boolean(isSelectedMethodBind, this.rawMemory)
    }


    private val getConnectionOutputCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_output_count") }
    open fun getConnectionOutputCount(): Int {
        return _icall_Int(getConnectionOutputCountMethodBind, this.rawMemory)
    }


    private val getConnectionInputCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_input_count") }
    open fun getConnectionInputCount(): Int {
        return _icall_Int(getConnectionInputCountMethodBind, this.rawMemory)
    }


    private val getConnectionOutputPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_output_position") }
    open fun getConnectionOutputPosition(idx: Int): Vector2 {
        return _icall_Vector2_Int(getConnectionOutputPositionMethodBind, this.rawMemory, idx)
    }


    private val getConnectionOutputTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_output_type") }
    open fun getConnectionOutputType(idx: Int): Int {
        return _icall_Int_Int(getConnectionOutputTypeMethodBind, this.rawMemory, idx)
    }


    private val getConnectionOutputColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_output_color") }
    open fun getConnectionOutputColor(idx: Int): Color {
        return _icall_Color_Int(getConnectionOutputColorMethodBind, this.rawMemory, idx)
    }


    private val getConnectionInputPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_input_position") }
    open fun getConnectionInputPosition(idx: Int): Vector2 {
        return _icall_Vector2_Int(getConnectionInputPositionMethodBind, this.rawMemory, idx)
    }


    private val getConnectionInputTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_input_type") }
    open fun getConnectionInputType(idx: Int): Int {
        return _icall_Int_Int(getConnectionInputTypeMethodBind, this.rawMemory, idx)
    }


    private val getConnectionInputColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_connection_input_color") }
    open fun getConnectionInputColor(idx: Int): Color {
        return _icall_Color_Int(getConnectionInputColorMethodBind, this.rawMemory, idx)
    }


    private val setShowCloseButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_show_close_button") }
    open fun setShowCloseButton(show: Boolean) {
        _icall_Unit_Boolean(setShowCloseButtonMethodBind, this.rawMemory, show)
    }


    private val isCloseButtonVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "is_close_button_visible") }
    open fun isCloseButtonVisible(): Boolean {
        return _icall_Boolean(isCloseButtonVisibleMethodBind, this.rawMemory)
    }


    private val setOverlayMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "set_overlay") }
    open fun setOverlay(overlay: Int) {
        _icall_Unit_Int(setOverlayMethodBind, this.rawMemory, overlay)
    }


    private val getOverlayMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphNode", "get_overlay") }
    open fun getOverlay(): GraphNode.Overlay {
        return GraphNode.Overlay.fromInt(_icall_Int(getOverlayMethodBind, this.rawMemory))
    }


}
