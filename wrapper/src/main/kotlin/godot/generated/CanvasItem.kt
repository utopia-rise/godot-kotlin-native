@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CanvasItem : Node {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BlendMode(val id: Long) {
        BLEND_MODE_MIX(0),
        BLEND_MODE_ADD(1),
        BLEND_MODE_SUB(2),
        BLEND_MODE_MUL(3),
        BLEND_MODE_PREMULT_ALPHA(4),
        BLEND_MODE_DISABLED(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val ITEM_RECT_CHANGED: String = "item_rect_changed"
            const val DRAW: String = "draw"
            const val VISIBILITY_CHANGED: String = "visibility_changed"
            const val HIDE: String = "hide"
        }
    }


    companion object {
        infix fun from(other: Node): CanvasItem = CanvasItem("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CanvasItem = CanvasItem("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CanvasItem = fromVariant(CanvasItem(""), other)


        // Constants
        const val BLEND_MODE_MIX: Long = 0
        const val BLEND_MODE_ADD: Long = 1
        const val BLEND_MODE_SUB: Long = 2
        const val BLEND_MODE_MUL: Long = 3
        const val BLEND_MODE_PREMULT_ALPHA: Long = 4
        const val BLEND_MODE_DISABLED: Long = 5
        const val NOTIFICATION_TRANSFORM_CHANGED: Long = 29
        const val NOTIFICATION_DRAW: Long = 30
        const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31
        const val NOTIFICATION_ENTER_CANVAS: Long = 32
        const val NOTIFICATION_EXIT_CANVAS: Long = 33


    }


    // Properties
    open var visible: Boolean
        get() = _icall_Boolean(isVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setVisibleMethodBind, this.rawMemory, value)


    open var modulate: Color
        get() = _icall_Color(getModulateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setModulateMethodBind, this.rawMemory, value)
    open fun modulate(shedule: (Color) -> Unit): Color = modulate.apply {
        shedule(this)
        modulate = this
    }


    open var selfModulate: Color
        get() = _icall_Color(getSelfModulateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setSelfModulateMethodBind, this.rawMemory, value)
    open fun selfModulate(shedule: (Color) -> Unit): Color = selfModulate.apply {
        shedule(this)
        selfModulate = this
    }


    open var showBehindParent: Boolean
        get() = _icall_Boolean(isDrawBehindParentEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDrawBehindParentMethodBind, this.rawMemory, value)


    open var lightMask: Long
        get() = _icall_Long(getLightMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLightMaskMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)


    open var useParentMaterial: Boolean
        get() = _icall_Boolean(getUseParentMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseParentMaterialMethodBind, this.rawMemory, value)




    // Methods
    open fun _draw() {
    }


    open fun _toplevel_raise_self() {
    }


    open fun _update_callback() {
    }


    open fun _edit_set_state(state: Dictionary) {
    }


    open fun _edit_get_state(): Dictionary {
        throw NotImplementedError("_edit_get_state is not implemented for CanvasItem")
    }


    open fun _edit_set_position(position: Vector2) {
    }


    open fun _edit_get_position(): Vector2 {
        throw NotImplementedError("_edit_get_position is not implemented for CanvasItem")
    }


    open fun _edit_set_scale(scale: Vector2) {
    }


    open fun _edit_get_scale(): Vector2 {
        throw NotImplementedError("_edit_get_scale is not implemented for CanvasItem")
    }


    open fun _edit_set_rect(rect: Rect2) {
    }


    open fun _edit_get_rect(): Rect2 {
        throw NotImplementedError("_edit_get_rect is not implemented for CanvasItem")
    }


    open fun _edit_use_rect(): Boolean {
        throw NotImplementedError("_edit_use_rect is not implemented for CanvasItem")
    }


    open fun _edit_set_rotation(degrees: Double) {
    }


    open fun _edit_get_rotation(): Double {
        throw NotImplementedError("_edit_get_rotation is not implemented for CanvasItem")
    }


    open fun _edit_use_rotation(): Boolean {
        throw NotImplementedError("_edit_use_rotation is not implemented for CanvasItem")
    }


    open fun _edit_set_pivot(pivot: Vector2) {
    }


    open fun _edit_get_pivot(): Vector2 {
        throw NotImplementedError("_edit_get_pivot is not implemented for CanvasItem")
    }


    open fun _edit_use_pivot(): Boolean {
        throw NotImplementedError("_edit_use_pivot is not implemented for CanvasItem")
    }


    private val getCanvasItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_canvas_item") }
    open fun getCanvasItem(): RID {
        return _icall_RID(getCanvasItemMethodBind, this.rawMemory)
    }


    private val setVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_visible") }
    open fun setVisible(visible: Boolean) {
        _icall_Unit_Boolean(setVisibleMethodBind, this.rawMemory, visible)
    }


    private val isVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "is_visible") }
    open fun isVisible(): Boolean {
        return _icall_Boolean(isVisibleMethodBind, this.rawMemory)
    }


    private val isVisibleInTreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "is_visible_in_tree") }
    open fun isVisibleInTree(): Boolean {
        return _icall_Boolean(isVisibleInTreeMethodBind, this.rawMemory)
    }


    private val showMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "show") }
    open fun show() {
        _icall_Unit(showMethodBind, this.rawMemory)
    }


    private val hideMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "hide") }
    open fun hide() {
        _icall_Unit(hideMethodBind, this.rawMemory)
    }


    private val updateMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "update") }
    open fun update() {
        _icall_Unit(updateMethodBind, this.rawMemory)
    }


    private val setAsToplevelMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_as_toplevel") }
    open fun setAsToplevel(enable: Boolean) {
        _icall_Unit_Boolean(setAsToplevelMethodBind, this.rawMemory, enable)
    }


    private val isSetAsToplevelMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "is_set_as_toplevel") }
    open fun isSetAsToplevel(): Boolean {
        return _icall_Boolean(isSetAsToplevelMethodBind, this.rawMemory)
    }


    private val setLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_light_mask") }
    open fun setLightMask(lightMask: Long) {
        _icall_Unit_Long(setLightMaskMethodBind, this.rawMemory, lightMask)
    }


    private val getLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_light_mask") }
    open fun getLightMask(): Long {
        return _icall_Long(getLightMaskMethodBind, this.rawMemory)
    }


    private val setModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_modulate") }
    open fun setModulate(modulate: Color) {
        _icall_Unit_Color(setModulateMethodBind, this.rawMemory, modulate)
    }


    private val getModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_modulate") }
    open fun getModulate(): Color {
        return _icall_Color(getModulateMethodBind, this.rawMemory)
    }


    private val setSelfModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_self_modulate") }
    open fun setSelfModulate(selfModulate: Color) {
        _icall_Unit_Color(setSelfModulateMethodBind, this.rawMemory, selfModulate)
    }


    private val getSelfModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_self_modulate") }
    open fun getSelfModulate(): Color {
        return _icall_Color(getSelfModulateMethodBind, this.rawMemory)
    }


    private val setDrawBehindParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_draw_behind_parent") }
    open fun setDrawBehindParent(enable: Boolean) {
        _icall_Unit_Boolean(setDrawBehindParentMethodBind, this.rawMemory, enable)
    }


    private val isDrawBehindParentEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "is_draw_behind_parent_enabled") }
    open fun isDrawBehindParentEnabled(): Boolean {
        return _icall_Boolean(isDrawBehindParentEnabledMethodBind, this.rawMemory)
    }


    open fun _set_on_top(onTop: Boolean) {
    }


    open fun _is_on_top(): Boolean {
        throw NotImplementedError("_is_on_top is not implemented for CanvasItem")
    }


    private val drawLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_line") }
    open fun drawLine(from: Vector2, to: Vector2, color: Color, width: Double = 1.0, antialiased: Boolean = false) {
        _icall_Unit_Vector2_Vector2_Color_Double_Boolean(drawLineMethodBind, this.rawMemory, from, to, color, width, antialiased)
    }


    private val drawPolylineMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_polyline") }
    open fun drawPolyline(points: PoolVector2Array, color: Color, width: Double = 1.0, antialiased: Boolean = false) {
        _icall_Unit_PoolVector2Array_Color_Double_Boolean(drawPolylineMethodBind, this.rawMemory, points, color, width, antialiased)
    }


    private val drawPolylineColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_polyline_colors") }
    open fun drawPolylineColors(points: PoolVector2Array, colors: PoolColorArray, width: Double = 1.0, antialiased: Boolean = false) {
        _icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean(drawPolylineColorsMethodBind, this.rawMemory, points, colors, width, antialiased)
    }


    private val drawMultilineMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_multiline") }
    open fun drawMultiline(points: PoolVector2Array, color: Color, width: Double = 1.0, antialiased: Boolean = false) {
        _icall_Unit_PoolVector2Array_Color_Double_Boolean(drawMultilineMethodBind, this.rawMemory, points, color, width, antialiased)
    }


    private val drawMultilineColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_multiline_colors") }
    open fun drawMultilineColors(points: PoolVector2Array, colors: PoolColorArray, width: Double = 1.0, antialiased: Boolean = false) {
        _icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean(drawMultilineColorsMethodBind, this.rawMemory, points, colors, width, antialiased)
    }


    private val drawRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_rect") }
    open fun drawRect(rect: Rect2, color: Color, filled: Boolean = true) {
        _icall_Unit_Rect2_Color_Boolean(drawRectMethodBind, this.rawMemory, rect, color, filled)
    }


    private val drawCircleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_circle") }
    open fun drawCircle(position: Vector2, radius: Double, color: Color) {
        _icall_Unit_Vector2_Double_Color(drawCircleMethodBind, this.rawMemory, position, radius, color)
    }


    private val drawTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_texture") }
    open fun drawTexture(texture: Texture, position: Vector2, modulate: Color = Color(1,1,1,1), normalMap: Texture) {
        _icall_Unit_Object_Vector2_Color_Object(drawTextureMethodBind, this.rawMemory, texture, position, modulate, normalMap)
    }


    private val drawTextureRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_texture_rect") }
    open fun drawTextureRect(texture: Texture, rect: Rect2, tile: Boolean, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: Texture) {
        _icall_Unit_Object_Rect2_Boolean_Color_Boolean_Object(drawTextureRectMethodBind, this.rawMemory, texture, rect, tile, modulate, transpose, normalMap)
    }


    private val drawTextureRectRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_texture_rect_region") }
    open fun drawTextureRectRegion(texture: Texture, rect: Rect2, srcRect: Rect2, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: Texture, clipUv: Boolean = true) {
        _icall_Unit_Object_Rect2_Rect2_Color_Boolean_Object_Boolean(drawTextureRectRegionMethodBind, this.rawMemory, texture, rect, srcRect, modulate, transpose, normalMap, clipUv)
    }


    private val drawStyleBoxMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_style_box") }
    open fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
        _icall_Unit_Object_Rect2(drawStyleBoxMethodBind, this.rawMemory, styleBox, rect)
    }


    private val drawPrimitiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_primitive") }
    open fun drawPrimitive(points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array, texture: Texture, width: Double = 1.0, normalMap: Texture) {
        _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_Object_Double_Object(drawPrimitiveMethodBind, this.rawMemory, points, colors, uvs, texture, width, normalMap)
    }


    private val drawPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_polygon") }
    open fun drawPolygon(points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array = PoolVector2Array(), texture: Texture, normalMap: Texture, antialiased: Boolean = false) {
        _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_Object_Object_Boolean(drawPolygonMethodBind, this.rawMemory, points, colors, uvs, texture, normalMap, antialiased)
    }


    private val drawColoredPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_colored_polygon") }
    open fun drawColoredPolygon(points: PoolVector2Array, color: Color, uvs: PoolVector2Array = PoolVector2Array(), texture: Texture, normalMap: Texture, antialiased: Boolean = false) {
        _icall_Unit_PoolVector2Array_Color_PoolVector2Array_Object_Object_Boolean(drawColoredPolygonMethodBind, this.rawMemory, points, color, uvs, texture, normalMap, antialiased)
    }


    private val drawStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_string") }
    open fun drawString(font: Font, position: Vector2, text: String, modulate: Color = Color(1,1,1,1), clipW: Long = -1) {
        _icall_Unit_Object_Vector2_String_Color_Long(drawStringMethodBind, this.rawMemory, font, position, text, modulate, clipW)
    }


    private val drawCharMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_char") }
    open fun drawChar(font: Font, position: Vector2, char: String, next: String, modulate: Color = Color(1,1,1,1)): Double {
        return _icall_Double_Object_Vector2_String_String_Color(drawCharMethodBind, this.rawMemory, font, position, char, next, modulate)
    }


    private val drawMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_mesh") }
    open fun drawMesh(mesh: Mesh, texture: Texture, normalMap: Texture) {
        _icall_Unit_Object_Object_Object(drawMeshMethodBind, this.rawMemory, mesh, texture, normalMap)
    }


    private val drawMultimeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_multimesh") }
    open fun drawMultimesh(mesh: Mesh, texture: Texture, normalMap: Texture) {
        _icall_Unit_Object_Object_Object(drawMultimeshMethodBind, this.rawMemory, mesh, texture, normalMap)
    }


    private val drawSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_set_transform") }
    open fun drawSetTransform(position: Vector2, rotation: Double, scale: Vector2) {
        _icall_Unit_Vector2_Double_Vector2(drawSetTransformMethodBind, this.rawMemory, position, rotation, scale)
    }


    private val drawSetTransformMatrixMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "draw_set_transform_matrix") }
    open fun drawSetTransformMatrix(xform: Transform2D) {
        _icall_Unit_Transform2D(drawSetTransformMatrixMethodBind, this.rawMemory, xform)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_transform") }
    open fun getTransform(): Transform2D {
        return _icall_Transform2D(getTransformMethodBind, this.rawMemory)
    }


    private val getGlobalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_global_transform") }
    open fun getGlobalTransform(): Transform2D {
        return _icall_Transform2D(getGlobalTransformMethodBind, this.rawMemory)
    }


    private val getGlobalTransformWithCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_global_transform_with_canvas") }
    open fun getGlobalTransformWithCanvas(): Transform2D {
        return _icall_Transform2D(getGlobalTransformWithCanvasMethodBind, this.rawMemory)
    }


    private val getViewportTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_viewport_transform") }
    open fun getViewportTransform(): Transform2D {
        return _icall_Transform2D(getViewportTransformMethodBind, this.rawMemory)
    }


    private val getViewportRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_viewport_rect") }
    open fun getViewportRect(): Rect2 {
        return _icall_Rect2(getViewportRectMethodBind, this.rawMemory)
    }


    private val getCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_canvas_transform") }
    open fun getCanvasTransform(): Transform2D {
        return _icall_Transform2D(getCanvasTransformMethodBind, this.rawMemory)
    }


    private val getLocalMousePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_local_mouse_position") }
    open fun getLocalMousePosition(): Vector2 {
        return _icall_Vector2(getLocalMousePositionMethodBind, this.rawMemory)
    }


    private val getGlobalMousePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_global_mouse_position") }
    open fun getGlobalMousePosition(): Vector2 {
        return _icall_Vector2(getGlobalMousePositionMethodBind, this.rawMemory)
    }


    private val getCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_canvas") }
    open fun getCanvas(): RID {
        return _icall_RID(getCanvasMethodBind, this.rawMemory)
    }


    private val getWorld2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_world_2d") }
    open fun getWorld2d(): World2D {
        return _icall_World2D(getWorld2dMethodBind, this.rawMemory)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


    private val setUseParentMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_use_parent_material") }
    open fun setUseParentMaterial(enable: Boolean) {
        _icall_Unit_Boolean(setUseParentMaterialMethodBind, this.rawMemory, enable)
    }


    private val getUseParentMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "get_use_parent_material") }
    open fun getUseParentMaterial(): Boolean {
        return _icall_Boolean(getUseParentMaterialMethodBind, this.rawMemory)
    }


    private val setNotifyLocalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_notify_local_transform") }
    open fun setNotifyLocalTransform(enable: Boolean) {
        _icall_Unit_Boolean(setNotifyLocalTransformMethodBind, this.rawMemory, enable)
    }


    private val isLocalTransformNotificationEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "is_local_transform_notification_enabled") }
    open fun isLocalTransformNotificationEnabled(): Boolean {
        return _icall_Boolean(isLocalTransformNotificationEnabledMethodBind, this.rawMemory)
    }


    private val setNotifyTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "set_notify_transform") }
    open fun setNotifyTransform(enable: Boolean) {
        _icall_Unit_Boolean(setNotifyTransformMethodBind, this.rawMemory, enable)
    }


    private val isTransformNotificationEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "is_transform_notification_enabled") }
    open fun isTransformNotificationEnabled(): Boolean {
        return _icall_Boolean(isTransformNotificationEnabledMethodBind, this.rawMemory)
    }


    private val makeCanvasPositionLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "make_canvas_position_local") }
    open fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
        return _icall_Vector2_Vector2(makeCanvasPositionLocalMethodBind, this.rawMemory, screenPoint)
    }


    private val makeInputLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItem", "make_input_local") }
    open fun makeInputLocal(event: InputEvent): InputEvent {
        return _icall_InputEvent_Object(makeInputLocalMethodBind, this.rawMemory, event)
    }


}
