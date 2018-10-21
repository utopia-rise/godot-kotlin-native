@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Camera2D : Node2D {
    constructor() : super("Camera2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AnchorMode(val id: Long) {
        ANCHOR_MODE_FIXED_TOP_LEFT(0),
        ANCHOR_MODE_DRAG_CENTER(1),
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
        infix fun from(other: Node2D): Camera2D = Camera2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Camera2D = Camera2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Camera2D = Camera2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Camera2D = Camera2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Camera2D = fromVariant(Camera2D(""), other)


        // Constants
        const val ANCHOR_MODE_FIXED_TOP_LEFT: Long = 0
        const val ANCHOR_MODE_DRAG_CENTER: Long = 1


    }


    // Properties
    open var offset: Vector2
        get() = _icall_Vector2(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var anchorMode: Long
        get() = _icall_Long(getAnchorModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAnchorModeMethodBind, this.rawMemory, value)


    open var rotating: Boolean
        get() = _icall_Boolean(isRotatingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRotatingMethodBind, this.rawMemory, value)


    open val current: Boolean
        get() = _icall_Boolean(isCurrentMethodBind, this.rawMemory)


    open var zoom: Vector2
        get() = _icall_Vector2(getZoomMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setZoomMethodBind, this.rawMemory, value)
    open fun zoom(shedule: (Vector2) -> Unit): Vector2 = zoom.apply {
        shedule(this)
        zoom = this
    }


    open var customViewport: Viewport
        get() = _icall_Viewport(getCustomViewportMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCustomViewportMethodBind, this.rawMemory, value)


    open var limitLeft: Long
        get() = _icall_Long_Long(getLimitMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setLimitMethodBind, this.rawMemory, 0, value)


    open var limitTop: Long
        get() = _icall_Long_Long(getLimitMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setLimitMethodBind, this.rawMemory, 1, value)


    open var limitRight: Long
        get() = _icall_Long_Long(getLimitMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setLimitMethodBind, this.rawMemory, 2, value)


    open var limitBottom: Long
        get() = _icall_Long_Long(getLimitMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setLimitMethodBind, this.rawMemory, 3, value)


    open var limitSmoothed: Boolean
        get() = _icall_Boolean(isLimitSmoothingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLimitSmoothingEnabledMethodBind, this.rawMemory, value)


    open var dragMarginHEnabled: Boolean
        get() = _icall_Boolean(isHDragEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHDragEnabledMethodBind, this.rawMemory, value)


    open var dragMarginVEnabled: Boolean
        get() = _icall_Boolean(isVDragEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setVDragEnabledMethodBind, this.rawMemory, value)


    open var smoothingEnabled: Boolean
        get() = _icall_Boolean(isFollowSmoothingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnableFollowSmoothingMethodBind, this.rawMemory, value)


    open var smoothingSpeed: Double
        get() = _icall_Double(getFollowSmoothingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFollowSmoothingMethodBind, this.rawMemory, value)


    open var offsetV: Double
        get() = _icall_Double(getVOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, value)


    open var offsetH: Double
        get() = _icall_Double(getHOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, value)


    open var dragMarginLeft: Double
        get() = _icall_Double_Long(getDragMarginMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setDragMarginMethodBind, this.rawMemory, 0, value)


    open var dragMarginTop: Double
        get() = _icall_Double_Long(getDragMarginMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setDragMarginMethodBind, this.rawMemory, 1, value)


    open var dragMarginRight: Double
        get() = _icall_Double_Long(getDragMarginMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setDragMarginMethodBind, this.rawMemory, 2, value)


    open var dragMarginBottom: Double
        get() = _icall_Double_Long(getDragMarginMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setDragMarginMethodBind, this.rawMemory, 3, value)


    open var editorDrawScreen: Boolean
        get() = _icall_Boolean(isScreenDrawingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setScreenDrawingEnabledMethodBind, this.rawMemory, value)


    open var editorDrawLimits: Boolean
        get() = _icall_Boolean(isLimitDrawingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLimitDrawingEnabledMethodBind, this.rawMemory, value)


    open var editorDrawDragMargin: Boolean
        get() = _icall_Boolean(isMarginDrawingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setMarginDrawingEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val setAnchorModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_anchor_mode") }
    open fun setAnchorMode(anchorMode: Long) {
        _icall_Unit_Long(setAnchorModeMethodBind, this.rawMemory, anchorMode)
    }


    private val getAnchorModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_anchor_mode") }
    open fun getAnchorMode(): Camera2D.AnchorMode {
        return Camera2D.AnchorMode.fromInt(_icall_Long(getAnchorModeMethodBind, this.rawMemory))
    }


    private val setRotatingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_rotating") }
    open fun setRotating(rotating: Boolean) {
        _icall_Unit_Boolean(setRotatingMethodBind, this.rawMemory, rotating)
    }


    private val isRotatingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_rotating") }
    open fun isRotating(): Boolean {
        return _icall_Boolean(isRotatingMethodBind, this.rawMemory)
    }


    private val makeCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "make_current") }
    open fun makeCurrent() {
        _icall_Unit(makeCurrentMethodBind, this.rawMemory)
    }


    private val clearCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "clear_current") }
    open fun clearCurrent() {
        _icall_Unit(clearCurrentMethodBind, this.rawMemory)
    }


    open fun _make_current(arg0: Object) {
    }


    open fun _update_scroll() {
    }


    open fun _set_current(current: Boolean) {
    }


    private val isCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_current") }
    open fun isCurrent(): Boolean {
        return _icall_Boolean(isCurrentMethodBind, this.rawMemory)
    }


    private val setLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_limit") }
    open fun setLimit(margin: Long, limit: Long) {
        _icall_Unit_Long_Long(setLimitMethodBind, this.rawMemory, margin, limit)
    }


    private val getLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_limit") }
    open fun getLimit(margin: Long): Long {
        return _icall_Long_Long(getLimitMethodBind, this.rawMemory, margin)
    }


    private val setLimitSmoothingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_limit_smoothing_enabled") }
    open fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean) {
        _icall_Unit_Boolean(setLimitSmoothingEnabledMethodBind, this.rawMemory, limitSmoothingEnabled)
    }


    private val isLimitSmoothingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_limit_smoothing_enabled") }
    open fun isLimitSmoothingEnabled(): Boolean {
        return _icall_Boolean(isLimitSmoothingEnabledMethodBind, this.rawMemory)
    }


    private val setVDragEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_v_drag_enabled") }
    open fun setVDragEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setVDragEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isVDragEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_v_drag_enabled") }
    open fun isVDragEnabled(): Boolean {
        return _icall_Boolean(isVDragEnabledMethodBind, this.rawMemory)
    }


    private val setHDragEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_h_drag_enabled") }
    open fun setHDragEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setHDragEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isHDragEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_h_drag_enabled") }
    open fun isHDragEnabled(): Boolean {
        return _icall_Boolean(isHDragEnabledMethodBind, this.rawMemory)
    }


    private val setVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_v_offset") }
    open fun setVOffset(ofs: Double) {
        _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, ofs)
    }


    private val getVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_v_offset") }
    open fun getVOffset(): Double {
        return _icall_Double(getVOffsetMethodBind, this.rawMemory)
    }


    private val setHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_h_offset") }
    open fun setHOffset(ofs: Double) {
        _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, ofs)
    }


    private val getHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_h_offset") }
    open fun getHOffset(): Double {
        return _icall_Double(getHOffsetMethodBind, this.rawMemory)
    }


    private val setDragMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_drag_margin") }
    open fun setDragMargin(margin: Long, dragMargin: Double) {
        _icall_Unit_Long_Double(setDragMarginMethodBind, this.rawMemory, margin, dragMargin)
    }


    private val getDragMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_drag_margin") }
    open fun getDragMargin(margin: Long): Double {
        return _icall_Double_Long(getDragMarginMethodBind, this.rawMemory, margin)
    }


    private val getCameraPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_camera_position") }
    open fun getCameraPosition(): Vector2 {
        return _icall_Vector2(getCameraPositionMethodBind, this.rawMemory)
    }


    private val getCameraScreenCenterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_camera_screen_center") }
    open fun getCameraScreenCenter(): Vector2 {
        return _icall_Vector2(getCameraScreenCenterMethodBind, this.rawMemory)
    }


    private val setZoomMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_zoom") }
    open fun setZoom(zoom: Vector2) {
        _icall_Unit_Vector2(setZoomMethodBind, this.rawMemory, zoom)
    }


    private val getZoomMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_zoom") }
    open fun getZoom(): Vector2 {
        return _icall_Vector2(getZoomMethodBind, this.rawMemory)
    }


    private val setCustomViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_custom_viewport") }
    open fun setCustomViewport(viewport: Object) {
        _icall_Unit_Object(setCustomViewportMethodBind, this.rawMemory, viewport)
    }


    private val getCustomViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_custom_viewport") }
    open fun getCustomViewport(): Node {
        return _icall_Node(getCustomViewportMethodBind, this.rawMemory)
    }


    private val setFollowSmoothingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_follow_smoothing") }
    open fun setFollowSmoothing(followSmoothing: Double) {
        _icall_Unit_Double(setFollowSmoothingMethodBind, this.rawMemory, followSmoothing)
    }


    private val getFollowSmoothingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "get_follow_smoothing") }
    open fun getFollowSmoothing(): Double {
        return _icall_Double(getFollowSmoothingMethodBind, this.rawMemory)
    }


    private val setEnableFollowSmoothingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_enable_follow_smoothing") }
    open fun setEnableFollowSmoothing(followSmoothing: Boolean) {
        _icall_Unit_Boolean(setEnableFollowSmoothingMethodBind, this.rawMemory, followSmoothing)
    }


    private val isFollowSmoothingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_follow_smoothing_enabled") }
    open fun isFollowSmoothingEnabled(): Boolean {
        return _icall_Boolean(isFollowSmoothingEnabledMethodBind, this.rawMemory)
    }


    private val forceUpdateScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "force_update_scroll") }
    open fun forceUpdateScroll() {
        _icall_Unit(forceUpdateScrollMethodBind, this.rawMemory)
    }


    private val resetSmoothingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "reset_smoothing") }
    open fun resetSmoothing() {
        _icall_Unit(resetSmoothingMethodBind, this.rawMemory)
    }


    private val alignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "align") }
    open fun align() {
        _icall_Unit(alignMethodBind, this.rawMemory)
    }


    open fun _set_old_smoothing(followSmoothing: Double) {
    }


    private val setScreenDrawingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_screen_drawing_enabled") }
    open fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean) {
        _icall_Unit_Boolean(setScreenDrawingEnabledMethodBind, this.rawMemory, screenDrawingEnabled)
    }


    private val isScreenDrawingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_screen_drawing_enabled") }
    open fun isScreenDrawingEnabled(): Boolean {
        return _icall_Boolean(isScreenDrawingEnabledMethodBind, this.rawMemory)
    }


    private val setLimitDrawingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_limit_drawing_enabled") }
    open fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean) {
        _icall_Unit_Boolean(setLimitDrawingEnabledMethodBind, this.rawMemory, limitDrawingEnabled)
    }


    private val isLimitDrawingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_limit_drawing_enabled") }
    open fun isLimitDrawingEnabled(): Boolean {
        return _icall_Boolean(isLimitDrawingEnabledMethodBind, this.rawMemory)
    }


    private val setMarginDrawingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "set_margin_drawing_enabled") }
    open fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean) {
        _icall_Unit_Boolean(setMarginDrawingEnabledMethodBind, this.rawMemory, marginDrawingEnabled)
    }


    private val isMarginDrawingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera2D", "is_margin_drawing_enabled") }
    open fun isMarginDrawingEnabled(): Boolean {
        return _icall_Boolean(isMarginDrawingEnabledMethodBind, this.rawMemory)
    }


}
