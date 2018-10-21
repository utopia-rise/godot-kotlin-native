@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Control : CanvasItem {
    constructor() : super("Control")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Anchor(val id: Long) {
        ANCHOR_BEGIN(0),
        ANCHOR_END(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class FocusMode(val id: Long) {
        FOCUS_NONE(0),
        FOCUS_CLICK(1),
        FOCUS_ALL(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LayoutPresetMode(val id: Long) {
        PRESET_MODE_MINSIZE(0),
        PRESET_MODE_KEEP_WIDTH(1),
        PRESET_MODE_KEEP_HEIGHT(2),
        PRESET_MODE_KEEP_SIZE(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class MouseFilter(val id: Long) {
        MOUSE_FILTER_STOP(0),
        MOUSE_FILTER_PASS(1),
        MOUSE_FILTER_IGNORE(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CursorShape(val id: Long) {
        CURSOR_ARROW(0),
        CURSOR_IBEAM(1),
        CURSOR_POINTING_HAND(2),
        CURSOR_CROSS(3),
        CURSOR_WAIT(4),
        CURSOR_BUSY(5),
        CURSOR_DRAG(6),
        CURSOR_CAN_DROP(7),
        CURSOR_FORBIDDEN(8),
        CURSOR_VSIZE(9),
        CURSOR_HSIZE(10),
        CURSOR_BDIAGSIZE(11),
        CURSOR_FDIAGSIZE(12),
        CURSOR_MOVE(13),
        CURSOR_VSPLIT(14),
        CURSOR_HSPLIT(15),
        CURSOR_HELP(16),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class GrowDirection(val id: Long) {
        GROW_DIRECTION_BEGIN(0),
        GROW_DIRECTION_END(1),
        GROW_DIRECTION_BOTH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class SizeFlags(val id: Long) {
        SIZE_FILL(1),
        SIZE_EXPAND(2),
        SIZE_EXPAND_FILL(3),
        SIZE_SHRINK_CENTER(4),
        SIZE_SHRINK_END(8),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LayoutPreset(val id: Long) {
        PRESET_TOP_LEFT(0),
        PRESET_TOP_RIGHT(1),
        PRESET_BOTTOM_LEFT(2),
        PRESET_BOTTOM_RIGHT(3),
        PRESET_CENTER_LEFT(4),
        PRESET_CENTER_TOP(5),
        PRESET_CENTER_RIGHT(6),
        PRESET_CENTER_BOTTOM(7),
        PRESET_CENTER(8),
        PRESET_LEFT_WIDE(9),
        PRESET_TOP_WIDE(10),
        PRESET_RIGHT_WIDE(11),
        PRESET_BOTTOM_WIDE(12),
        PRESET_VCENTER_WIDE(13),
        PRESET_HCENTER_WIDE(14),
        PRESET_WIDE(15),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val MOUSE_EXITED: String = "mouse_exited"
            const val GUI_INPUT: String = "gui_input"
            const val MODAL_CLOSED: String = "modal_closed"
            const val FOCUS_ENTERED: String = "focus_entered"
            const val RESIZED: String = "resized"
            const val MINIMUM_SIZE_CHANGED: String = "minimum_size_changed"
            const val MOUSE_ENTERED: String = "mouse_entered"
            const val SIZE_FLAGS_CHANGED: String = "size_flags_changed"
            const val FOCUS_EXITED: String = "focus_exited"
        }
    }


    companion object {
        infix fun from(other: CanvasItem): Control = Control("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Control = Control("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Control = Control("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Control = fromVariant(Control(""), other)


        // Constants
        const val FOCUS_NONE: Long = 0
        const val FOCUS_CLICK: Long = 1
        const val FOCUS_ALL: Long = 2
        const val NOTIFICATION_RESIZED: Long = 40
        const val NOTIFICATION_MOUSE_ENTER: Long = 41
        const val NOTIFICATION_MOUSE_EXIT: Long = 42
        const val NOTIFICATION_FOCUS_ENTER: Long = 43
        const val NOTIFICATION_FOCUS_EXIT: Long = 44
        const val NOTIFICATION_THEME_CHANGED: Long = 45
        const val NOTIFICATION_MODAL_CLOSE: Long = 46
        const val NOTIFICATION_SCROLL_BEGIN: Long = 47
        const val NOTIFICATION_SCROLL_END: Long = 48
        const val CURSOR_ARROW: Long = 0
        const val CURSOR_IBEAM: Long = 1
        const val CURSOR_POINTING_HAND: Long = 2
        const val CURSOR_CROSS: Long = 3
        const val CURSOR_WAIT: Long = 4
        const val CURSOR_BUSY: Long = 5
        const val CURSOR_DRAG: Long = 6
        const val CURSOR_CAN_DROP: Long = 7
        const val CURSOR_FORBIDDEN: Long = 8
        const val CURSOR_VSIZE: Long = 9
        const val CURSOR_HSIZE: Long = 10
        const val CURSOR_BDIAGSIZE: Long = 11
        const val CURSOR_FDIAGSIZE: Long = 12
        const val CURSOR_MOVE: Long = 13
        const val CURSOR_VSPLIT: Long = 14
        const val CURSOR_HSPLIT: Long = 15
        const val CURSOR_HELP: Long = 16
        const val PRESET_TOP_LEFT: Long = 0
        const val PRESET_TOP_RIGHT: Long = 1
        const val PRESET_BOTTOM_LEFT: Long = 2
        const val PRESET_BOTTOM_RIGHT: Long = 3
        const val PRESET_CENTER_LEFT: Long = 4
        const val PRESET_CENTER_TOP: Long = 5
        const val PRESET_CENTER_RIGHT: Long = 6
        const val PRESET_CENTER_BOTTOM: Long = 7
        const val PRESET_CENTER: Long = 8
        const val PRESET_LEFT_WIDE: Long = 9
        const val PRESET_TOP_WIDE: Long = 10
        const val PRESET_RIGHT_WIDE: Long = 11
        const val PRESET_BOTTOM_WIDE: Long = 12
        const val PRESET_VCENTER_WIDE: Long = 13
        const val PRESET_HCENTER_WIDE: Long = 14
        const val PRESET_WIDE: Long = 15
        const val PRESET_MODE_MINSIZE: Long = 0
        const val PRESET_MODE_KEEP_WIDTH: Long = 1
        const val PRESET_MODE_KEEP_HEIGHT: Long = 2
        const val PRESET_MODE_KEEP_SIZE: Long = 3
        const val SIZE_FILL: Long = 1
        const val SIZE_EXPAND: Long = 2
        const val SIZE_EXPAND_FILL: Long = 3
        const val SIZE_SHRINK_CENTER: Long = 4
        const val SIZE_SHRINK_END: Long = 8
        const val MOUSE_FILTER_STOP: Long = 0
        const val MOUSE_FILTER_PASS: Long = 1
        const val MOUSE_FILTER_IGNORE: Long = 2
        const val GROW_DIRECTION_BEGIN: Long = 0
        const val GROW_DIRECTION_END: Long = 1
        const val GROW_DIRECTION_BOTH: Long = 2
        const val ANCHOR_BEGIN: Long = 0
        const val ANCHOR_END: Long = 1


    }


    // Properties
    open val anchorLeft: Double
        get() = _icall_Double_Long(getAnchorMethodBind, this.rawMemory, 0)


    open val anchorTop: Double
        get() = _icall_Double_Long(getAnchorMethodBind, this.rawMemory, 1)


    open val anchorRight: Double
        get() = _icall_Double_Long(getAnchorMethodBind, this.rawMemory, 2)


    open val anchorBottom: Double
        get() = _icall_Double_Long(getAnchorMethodBind, this.rawMemory, 3)


    open var marginLeft: Long
        get() = _icall_Long_Long(getMarginMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setMarginMethodBind, this.rawMemory, 0, value)


    open var marginTop: Long
        get() = _icall_Long_Long(getMarginMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setMarginMethodBind, this.rawMemory, 1, value)


    open var marginRight: Long
        get() = _icall_Long_Long(getMarginMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setMarginMethodBind, this.rawMemory, 2, value)


    open var marginBottom: Long
        get() = _icall_Long_Long(getMarginMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setMarginMethodBind, this.rawMemory, 3, value)


    open var growHorizontal: Long
        get() = _icall_Long(getHGrowDirectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHGrowDirectionMethodBind, this.rawMemory, value)


    open var growVertical: Long
        get() = _icall_Long(getVGrowDirectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVGrowDirectionMethodBind, this.rawMemory, value)


    open var rectPosition: Vector2
        get() = _icall_Vector2(getPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, value)
    open fun rectPosition(shedule: (Vector2) -> Unit): Vector2 = rectPosition.apply {
        shedule(this)
        rectPosition = this
    }


    open var rectGlobalPosition: Vector2
        get() = _icall_Vector2(getGlobalPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setGlobalPositionMethodBind, this.rawMemory, value)
    open fun rectGlobalPosition(shedule: (Vector2) -> Unit): Vector2 = rectGlobalPosition.apply {
        shedule(this)
        rectGlobalPosition = this
    }


    open var rectSize: Vector2
        get() = _icall_Vector2(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, value)
    open fun rectSize(shedule: (Vector2) -> Unit): Vector2 = rectSize.apply {
        shedule(this)
        rectSize = this
    }


    open var rectMinSize: Vector2
        get() = _icall_Vector2(getCustomMinimumSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setCustomMinimumSizeMethodBind, this.rawMemory, value)
    open fun rectMinSize(shedule: (Vector2) -> Unit): Vector2 = rectMinSize.apply {
        shedule(this)
        rectMinSize = this
    }


    open var rectRotation: Double
        get() = _icall_Double(getRotationDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRotationDegreesMethodBind, this.rawMemory, value)


    open var rectScale: Vector2
        get() = _icall_Vector2(getScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScaleMethodBind, this.rawMemory, value)
    open fun rectScale(shedule: (Vector2) -> Unit): Vector2 = rectScale.apply {
        shedule(this)
        rectScale = this
    }


    open var rectPivotOffset: Vector2
        get() = _icall_Vector2(getPivotOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setPivotOffsetMethodBind, this.rawMemory, value)
    open fun rectPivotOffset(shedule: (Vector2) -> Unit): Vector2 = rectPivotOffset.apply {
        shedule(this)
        rectPivotOffset = this
    }


    open var rectClipContent: Boolean
        get() = _icall_Boolean(isClippingContentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setClipContentsMethodBind, this.rawMemory, value)


    open var hintTooltip: String
        get() = throw UninitializedPropertyAccessException("Cannot access property hintTooltip: has no getter")
        set(value) = _icall_Unit_String(setTooltipMethodBind, this.rawMemory, value)


    open var focusNeighbourLeft: NodePath
        get() = _icall_NodePath_Long(getFocusNeighbourMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_NodePath(setFocusNeighbourMethodBind, this.rawMemory, 0, value)


    open var focusNeighbourTop: NodePath
        get() = _icall_NodePath_Long(getFocusNeighbourMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_NodePath(setFocusNeighbourMethodBind, this.rawMemory, 1, value)


    open var focusNeighbourRight: NodePath
        get() = _icall_NodePath_Long(getFocusNeighbourMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_NodePath(setFocusNeighbourMethodBind, this.rawMemory, 2, value)


    open var focusNeighbourBottom: NodePath
        get() = _icall_NodePath_Long(getFocusNeighbourMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_NodePath(setFocusNeighbourMethodBind, this.rawMemory, 3, value)


    open var focusNext: NodePath
        get() = _icall_NodePath(getFocusNextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setFocusNextMethodBind, this.rawMemory, value)


    open var focusPrevious: NodePath
        get() = _icall_NodePath(getFocusPreviousMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setFocusPreviousMethodBind, this.rawMemory, value)


    open var focusMode: Long
        get() = _icall_Long(getFocusModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFocusModeMethodBind, this.rawMemory, value)


    open var mouseFilter: Long
        get() = _icall_Long(getMouseFilterMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMouseFilterMethodBind, this.rawMemory, value)


    open var mouseDefaultCursorShape: Long
        get() = _icall_Long(getDefaultCursorShapeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDefaultCursorShapeMethodBind, this.rawMemory, value)


    open var sizeFlagsHorizontal: Long
        get() = _icall_Long(getHSizeFlagsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHSizeFlagsMethodBind, this.rawMemory, value)


    open var sizeFlagsVertical: Long
        get() = _icall_Long(getVSizeFlagsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVSizeFlagsMethodBind, this.rawMemory, value)


    open var sizeFlagsStretchRatio: Double
        get() = _icall_Double(getStretchRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setStretchRatioMethodBind, this.rawMemory, value)


    open var theme: Theme
        get() = _icall_Theme(getThemeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setThemeMethodBind, this.rawMemory, value)




    // Methods
    open fun _gui_input(event: InputEvent) {
    }


    open fun _get_minimum_size(): Vector2 {
        throw NotImplementedError("_get_minimum_size is not implemented for Control")
    }


    open fun get_drag_data(position: Vector2): Object {
        throw NotImplementedError("get_drag_data is not implemented for Control")
    }


    open fun can_drop_data(position: Vector2, data: Variant): Boolean {
        throw NotImplementedError("can_drop_data is not implemented for Control")
    }


    open fun drop_data(position: Vector2, data: Variant) {
    }


    open fun has_point(point: Vector2): Boolean {
        throw NotImplementedError("has_point is not implemented for Control")
    }


    open fun _size_changed() {
    }


    open fun _update_minimum_size() {
    }


    private val acceptEventMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "accept_event") }
    open fun acceptEvent() {
        _icall_Unit(acceptEventMethodBind, this.rawMemory)
    }


    private val getMinimumSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_minimum_size") }
    open fun getMinimumSize(): Vector2 {
        return _icall_Vector2(getMinimumSizeMethodBind, this.rawMemory)
    }


    private val getCombinedMinimumSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_combined_minimum_size") }
    open fun getCombinedMinimumSize(): Vector2 {
        return _icall_Vector2(getCombinedMinimumSizeMethodBind, this.rawMemory)
    }


    private val setAnchorsPresetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_anchors_preset") }
    open fun setAnchorsPreset(preset: Long, keepMargin: Boolean = false) {
        _icall_Unit_Long_Boolean(setAnchorsPresetMethodBind, this.rawMemory, preset, keepMargin)
    }


    private val setMarginsPresetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_margins_preset") }
    open fun setMarginsPreset(preset: Long, resizeMode: Long = 0, margin: Long = 0) {
        _icall_Unit_Long_Long_Long(setMarginsPresetMethodBind, this.rawMemory, preset, resizeMode, margin)
    }


    private val setAnchorsAndMarginsPresetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_anchors_and_margins_preset") }
    open fun setAnchorsAndMarginsPreset(preset: Long, resizeMode: Long = 0, margin: Long = 0) {
        _icall_Unit_Long_Long_Long(setAnchorsAndMarginsPresetMethodBind, this.rawMemory, preset, resizeMode, margin)
    }


    private val setAnchorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_anchor") }
    open fun setAnchor(margin: Long, anchor: Double, keepMargin: Boolean = false, pushOppositeAnchor: Boolean = true) {
        _icall_Unit_Long_Double_Boolean_Boolean(setAnchorMethodBind, this.rawMemory, margin, anchor, keepMargin, pushOppositeAnchor)
    }


    open fun _set_anchor(margin: Long, anchor: Double) {
    }


    private val getAnchorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_anchor") }
    open fun getAnchor(margin: Long): Double {
        return _icall_Double_Long(getAnchorMethodBind, this.rawMemory, margin)
    }


    private val setMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_margin") }
    open fun setMargin(margin: Long, offset: Double) {
        _icall_Unit_Long_Double(setMarginMethodBind, this.rawMemory, margin, offset)
    }


    private val setAnchorAndMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_anchor_and_margin") }
    open fun setAnchorAndMargin(margin: Long, anchor: Double, offset: Double, pushOppositeAnchor: Boolean = false) {
        _icall_Unit_Long_Double_Double_Boolean(setAnchorAndMarginMethodBind, this.rawMemory, margin, anchor, offset, pushOppositeAnchor)
    }


    private val setBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_begin") }
    open fun setBegin(position: Vector2) {
        _icall_Unit_Vector2(setBeginMethodBind, this.rawMemory, position)
    }


    private val setEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_end") }
    open fun setEnd(position: Vector2) {
        _icall_Unit_Vector2(setEndMethodBind, this.rawMemory, position)
    }


    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_size") }
    open fun setSize(size: Vector2) {
        _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, size)
    }


    private val setCustomMinimumSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_custom_minimum_size") }
    open fun setCustomMinimumSize(size: Vector2) {
        _icall_Unit_Vector2(setCustomMinimumSizeMethodBind, this.rawMemory, size)
    }


    private val setGlobalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_global_position") }
    open fun setGlobalPosition(position: Vector2) {
        _icall_Unit_Vector2(setGlobalPositionMethodBind, this.rawMemory, position)
    }


    private val setRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_rotation") }
    open fun setRotation(radians: Double) {
        _icall_Unit_Double(setRotationMethodBind, this.rawMemory, radians)
    }


    private val setRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_rotation_degrees") }
    open fun setRotationDegrees(degrees: Double) {
        _icall_Unit_Double(setRotationDegreesMethodBind, this.rawMemory, degrees)
    }


    private val setScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_scale") }
    open fun setScale(scale: Vector2) {
        _icall_Unit_Vector2(setScaleMethodBind, this.rawMemory, scale)
    }


    private val setPivotOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_pivot_offset") }
    open fun setPivotOffset(pivotOffset: Vector2) {
        _icall_Unit_Vector2(setPivotOffsetMethodBind, this.rawMemory, pivotOffset)
    }


    private val getMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_margin") }
    open fun getMargin(margin: Long): Double {
        return _icall_Double_Long(getMarginMethodBind, this.rawMemory, margin)
    }


    private val getBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_begin") }
    open fun getBegin(): Vector2 {
        return _icall_Vector2(getBeginMethodBind, this.rawMemory)
    }


    private val getEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_end") }
    open fun getEnd(): Vector2 {
        return _icall_Vector2(getEndMethodBind, this.rawMemory)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


    private val getRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_rotation") }
    open fun getRotation(): Double {
        return _icall_Double(getRotationMethodBind, this.rawMemory)
    }


    private val getRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_rotation_degrees") }
    open fun getRotationDegrees(): Double {
        return _icall_Double(getRotationDegreesMethodBind, this.rawMemory)
    }


    private val getScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_scale") }
    open fun getScale(): Vector2 {
        return _icall_Vector2(getScaleMethodBind, this.rawMemory)
    }


    private val getPivotOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_pivot_offset") }
    open fun getPivotOffset(): Vector2 {
        return _icall_Vector2(getPivotOffsetMethodBind, this.rawMemory)
    }


    private val getCustomMinimumSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_custom_minimum_size") }
    open fun getCustomMinimumSize(): Vector2 {
        return _icall_Vector2(getCustomMinimumSizeMethodBind, this.rawMemory)
    }


    private val getParentAreaSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_parent_area_size") }
    open fun getParentAreaSize(): Vector2 {
        return _icall_Vector2(getParentAreaSizeMethodBind, this.rawMemory)
    }


    private val getGlobalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_global_position") }
    open fun getGlobalPosition(): Vector2 {
        return _icall_Vector2(getGlobalPositionMethodBind, this.rawMemory)
    }


    private val getRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_rect") }
    open fun getRect(): Rect2 {
        return _icall_Rect2(getRectMethodBind, this.rawMemory)
    }


    private val getGlobalRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_global_rect") }
    open fun getGlobalRect(): Rect2 {
        return _icall_Rect2(getGlobalRectMethodBind, this.rawMemory)
    }


    private val showModalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "show_modal") }
    open fun showModal(exclusive: Boolean = false) {
        _icall_Unit_Boolean(showModalMethodBind, this.rawMemory, exclusive)
    }


    private val setFocusModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_focus_mode") }
    open fun setFocusMode(mode: Long) {
        _icall_Unit_Long(setFocusModeMethodBind, this.rawMemory, mode)
    }


    private val getFocusModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_focus_mode") }
    open fun getFocusMode(): Control.FocusMode {
        return Control.FocusMode.fromInt(_icall_Long(getFocusModeMethodBind, this.rawMemory))
    }


    private val hasFocusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_focus") }
    open fun hasFocus(): Boolean {
        return _icall_Boolean(hasFocusMethodBind, this.rawMemory)
    }


    private val grabFocusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "grab_focus") }
    open fun grabFocus() {
        _icall_Unit(grabFocusMethodBind, this.rawMemory)
    }


    private val releaseFocusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "release_focus") }
    open fun releaseFocus() {
        _icall_Unit(releaseFocusMethodBind, this.rawMemory)
    }


    private val getFocusOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_focus_owner") }
    open fun getFocusOwner(): Control {
        return _icall_Control(getFocusOwnerMethodBind, this.rawMemory)
    }


    private val setHSizeFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_h_size_flags") }
    open fun setHSizeFlags(flags: Long) {
        _icall_Unit_Long(setHSizeFlagsMethodBind, this.rawMemory, flags)
    }


    private val getHSizeFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_h_size_flags") }
    open fun getHSizeFlags(): Long {
        return _icall_Long(getHSizeFlagsMethodBind, this.rawMemory)
    }


    private val setStretchRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_stretch_ratio") }
    open fun setStretchRatio(ratio: Double) {
        _icall_Unit_Double(setStretchRatioMethodBind, this.rawMemory, ratio)
    }


    private val getStretchRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_stretch_ratio") }
    open fun getStretchRatio(): Double {
        return _icall_Double(getStretchRatioMethodBind, this.rawMemory)
    }


    private val setVSizeFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_v_size_flags") }
    open fun setVSizeFlags(flags: Long) {
        _icall_Unit_Long(setVSizeFlagsMethodBind, this.rawMemory, flags)
    }


    private val getVSizeFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_v_size_flags") }
    open fun getVSizeFlags(): Long {
        return _icall_Long(getVSizeFlagsMethodBind, this.rawMemory)
    }


    private val setThemeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_theme") }
    open fun setTheme(theme: Theme) {
        _icall_Unit_Object(setThemeMethodBind, this.rawMemory, theme)
    }


    private val getThemeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_theme") }
    open fun getTheme(): Theme {
        return _icall_Theme(getThemeMethodBind, this.rawMemory)
    }


    private val addIconOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "add_icon_override") }
    open fun addIconOverride(name: String, texture: Texture) {
        _icall_Unit_String_Object(addIconOverrideMethodBind, this.rawMemory, name, texture)
    }


    private val addShaderOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "add_shader_override") }
    open fun addShaderOverride(name: String, shader: Shader) {
        _icall_Unit_String_Object(addShaderOverrideMethodBind, this.rawMemory, name, shader)
    }


    private val addStyleboxOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "add_stylebox_override") }
    open fun addStyleboxOverride(name: String, stylebox: StyleBox) {
        _icall_Unit_String_Object(addStyleboxOverrideMethodBind, this.rawMemory, name, stylebox)
    }


    private val addFontOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "add_font_override") }
    open fun addFontOverride(name: String, font: Font) {
        _icall_Unit_String_Object(addFontOverrideMethodBind, this.rawMemory, name, font)
    }


    private val addColorOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "add_color_override") }
    open fun addColorOverride(name: String, color: Color) {
        _icall_Unit_String_Color(addColorOverrideMethodBind, this.rawMemory, name, color)
    }


    private val addConstantOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "add_constant_override") }
    open fun addConstantOverride(name: String, constant: Long) {
        _icall_Unit_String_Long(addConstantOverrideMethodBind, this.rawMemory, name, constant)
    }


    private val getIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_icon") }
    open fun getIcon(name: String, type: String = ""): Texture {
        return _icall_Texture_String_String(getIconMethodBind, this.rawMemory, name, type)
    }


    private val getStyleboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_stylebox") }
    open fun getStylebox(name: String, type: String = ""): StyleBox {
        return _icall_StyleBox_String_String(getStyleboxMethodBind, this.rawMemory, name, type)
    }


    private val getFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_font") }
    open fun getFont(name: String, type: String = ""): Font {
        return _icall_Font_String_String(getFontMethodBind, this.rawMemory, name, type)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_color") }
    open fun getColor(name: String, type: String = ""): Color {
        return _icall_Color_String_String(getColorMethodBind, this.rawMemory, name, type)
    }


    private val getConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_constant") }
    open fun getConstant(name: String, type: String = ""): Long {
        return _icall_Long_String_String(getConstantMethodBind, this.rawMemory, name, type)
    }


    private val hasIconOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_icon_override") }
    open fun hasIconOverride(name: String): Boolean {
        return _icall_Boolean_String(hasIconOverrideMethodBind, this.rawMemory, name)
    }


    private val hasShaderOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_shader_override") }
    open fun hasShaderOverride(name: String): Boolean {
        return _icall_Boolean_String(hasShaderOverrideMethodBind, this.rawMemory, name)
    }


    private val hasStyleboxOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_stylebox_override") }
    open fun hasStyleboxOverride(name: String): Boolean {
        return _icall_Boolean_String(hasStyleboxOverrideMethodBind, this.rawMemory, name)
    }


    private val hasFontOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_font_override") }
    open fun hasFontOverride(name: String): Boolean {
        return _icall_Boolean_String(hasFontOverrideMethodBind, this.rawMemory, name)
    }


    private val hasColorOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_color_override") }
    open fun hasColorOverride(name: String): Boolean {
        return _icall_Boolean_String(hasColorOverrideMethodBind, this.rawMemory, name)
    }


    private val hasConstantOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_constant_override") }
    open fun hasConstantOverride(name: String): Boolean {
        return _icall_Boolean_String(hasConstantOverrideMethodBind, this.rawMemory, name)
    }


    private val hasIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_icon") }
    open fun hasIcon(name: String, type: String = ""): Boolean {
        return _icall_Boolean_String_String(hasIconMethodBind, this.rawMemory, name, type)
    }


    private val hasStyleboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_stylebox") }
    open fun hasStylebox(name: String, type: String = ""): Boolean {
        return _icall_Boolean_String_String(hasStyleboxMethodBind, this.rawMemory, name, type)
    }


    private val hasFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_font") }
    open fun hasFont(name: String, type: String = ""): Boolean {
        return _icall_Boolean_String_String(hasFontMethodBind, this.rawMemory, name, type)
    }


    private val hasColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_color") }
    open fun hasColor(name: String, type: String = ""): Boolean {
        return _icall_Boolean_String_String(hasColorMethodBind, this.rawMemory, name, type)
    }


    private val hasConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "has_constant") }
    open fun hasConstant(name: String, type: String = ""): Boolean {
        return _icall_Boolean_String_String(hasConstantMethodBind, this.rawMemory, name, type)
    }


    private val getParentControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_parent_control") }
    open fun getParentControl(): Control {
        return _icall_Control(getParentControlMethodBind, this.rawMemory)
    }


    private val setHGrowDirectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_h_grow_direction") }
    open fun setHGrowDirection(direction: Long) {
        _icall_Unit_Long(setHGrowDirectionMethodBind, this.rawMemory, direction)
    }


    private val getHGrowDirectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_h_grow_direction") }
    open fun getHGrowDirection(): Control.GrowDirection {
        return Control.GrowDirection.fromInt(_icall_Long(getHGrowDirectionMethodBind, this.rawMemory))
    }


    private val setVGrowDirectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_v_grow_direction") }
    open fun setVGrowDirection(direction: Long) {
        _icall_Unit_Long(setVGrowDirectionMethodBind, this.rawMemory, direction)
    }


    private val getVGrowDirectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_v_grow_direction") }
    open fun getVGrowDirection(): Control.GrowDirection {
        return Control.GrowDirection.fromInt(_icall_Long(getVGrowDirectionMethodBind, this.rawMemory))
    }


    private val setTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_tooltip") }
    open fun setTooltip(tooltip: String) {
        _icall_Unit_String(setTooltipMethodBind, this.rawMemory, tooltip)
    }


    private val getTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_tooltip") }
    open fun getTooltip(atPosition: Vector2 = Vector2(0, 0)): String {
        return _icall_String_Vector2(getTooltipMethodBind, this.rawMemory, atPosition)
    }


    open fun _get_tooltip(): String {
        throw NotImplementedError("_get_tooltip is not implemented for Control")
    }


    private val setDefaultCursorShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_default_cursor_shape") }
    open fun setDefaultCursorShape(shape: Long) {
        _icall_Unit_Long(setDefaultCursorShapeMethodBind, this.rawMemory, shape)
    }


    private val getDefaultCursorShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_default_cursor_shape") }
    open fun getDefaultCursorShape(): Control.CursorShape {
        return Control.CursorShape.fromInt(_icall_Long(getDefaultCursorShapeMethodBind, this.rawMemory))
    }


    private val getCursorShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_cursor_shape") }
    open fun getCursorShape(position: Vector2 = Vector2(0, 0)): Control.CursorShape {
        return Control.CursorShape.fromInt(_icall_Long_Vector2(getCursorShapeMethodBind, this.rawMemory, position))
    }


    private val setFocusNeighbourMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_focus_neighbour") }
    open fun setFocusNeighbour(margin: Long, neighbour: NodePath) {
        _icall_Unit_Long_NodePath(setFocusNeighbourMethodBind, this.rawMemory, margin, neighbour)
    }


    private val getFocusNeighbourMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_focus_neighbour") }
    open fun getFocusNeighbour(margin: Long): NodePath {
        return _icall_NodePath_Long(getFocusNeighbourMethodBind, this.rawMemory, margin)
    }


    private val setFocusNextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_focus_next") }
    open fun setFocusNext(next: NodePath) {
        _icall_Unit_NodePath(setFocusNextMethodBind, this.rawMemory, next)
    }


    private val getFocusNextMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_focus_next") }
    open fun getFocusNext(): NodePath {
        return _icall_NodePath(getFocusNextMethodBind, this.rawMemory)
    }


    private val setFocusPreviousMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_focus_previous") }
    open fun setFocusPrevious(previous: NodePath) {
        _icall_Unit_NodePath(setFocusPreviousMethodBind, this.rawMemory, previous)
    }


    private val getFocusPreviousMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_focus_previous") }
    open fun getFocusPrevious(): NodePath {
        return _icall_NodePath(getFocusPreviousMethodBind, this.rawMemory)
    }


    private val forceDragMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "force_drag") }
    open fun forceDrag(data: Variant, preview: Object) {
        _icall_Unit_Variant_Object(forceDragMethodBind, this.rawMemory, data, preview)
    }


    private val setMouseFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_mouse_filter") }
    open fun setMouseFilter(filter: Long) {
        _icall_Unit_Long(setMouseFilterMethodBind, this.rawMemory, filter)
    }


    private val getMouseFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "get_mouse_filter") }
    open fun getMouseFilter(): Control.MouseFilter {
        return Control.MouseFilter.fromInt(_icall_Long(getMouseFilterMethodBind, this.rawMemory))
    }


    private val setClipContentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_clip_contents") }
    open fun setClipContents(enable: Boolean) {
        _icall_Unit_Boolean(setClipContentsMethodBind, this.rawMemory, enable)
    }


    private val isClippingContentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "is_clipping_contents") }
    open fun isClippingContents(): Boolean {
        return _icall_Boolean(isClippingContentsMethodBind, this.rawMemory)
    }


    private val grabClickFocusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "grab_click_focus") }
    open fun grabClickFocus() {
        _icall_Unit(grabClickFocusMethodBind, this.rawMemory)
    }


    private val setDragForwardingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_drag_forwarding") }
    open fun setDragForwarding(target: Object) {
        _icall_Unit_Object(setDragForwardingMethodBind, this.rawMemory, target)
    }


    private val setDragPreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "set_drag_preview") }
    open fun setDragPreview(control: Object) {
        _icall_Unit_Object(setDragPreviewMethodBind, this.rawMemory, control)
    }


    private val warpMouseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "warp_mouse") }
    open fun warpMouse(toPosition: Vector2) {
        _icall_Unit_Vector2(warpMouseMethodBind, this.rawMemory, toPosition)
    }


    private val minimumSizeChangedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Control", "minimum_size_changed") }
    open fun minimumSizeChanged() {
        _icall_Unit(minimumSizeChangedMethodBind, this.rawMemory)
    }


    open fun _theme_changed() {
    }


    open fun _font_changed() {
    }


}
