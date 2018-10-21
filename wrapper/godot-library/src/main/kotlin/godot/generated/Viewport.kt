@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Viewport : Node {
    constructor() : super("Viewport")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ClearMode(val id: Long) {
        CLEAR_MODE_ALWAYS(0),
        CLEAR_MODE_NEVER(1),
        CLEAR_MODE_ONLY_NEXT_FRAME(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class RenderInfo(val id: Long) {
        RENDER_INFO_OBJECTS_IN_FRAME(0),
        RENDER_INFO_VERTICES_IN_FRAME(1),
        RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),
        RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),
        RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),
        RENDER_INFO_DRAW_CALLS_IN_FRAME(5),
        RENDER_INFO_MAX(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Usage(val id: Long) {
        USAGE_2D(0),
        USAGE_2D_NO_SAMPLING(1),
        USAGE_3D(2),
        USAGE_3D_NO_EFFECTS(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DebugDraw(val id: Long) {
        DEBUG_DRAW_DISABLED(0),
        DEBUG_DRAW_UNSHADED(1),
        DEBUG_DRAW_OVERDRAW(2),
        DEBUG_DRAW_WIREFRAME(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShadowAtlasQuadrantSubdiv(val id: Long) {
        SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),
        SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),
        SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),
        SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),
        SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),
        SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),
        SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),
        SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class UpdateMode(val id: Long) {
        UPDATE_DISABLED(0),
        UPDATE_ONCE(1),
        UPDATE_WHEN_VISIBLE(2),
        UPDATE_ALWAYS(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class MSAA(val id: Long) {
        MSAA_DISABLED(0),
        MSAA_2X(1),
        MSAA_4X(2),
        MSAA_8X(3),
        MSAA_16X(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val SIZE_CHANGED: String = "size_changed"
        }
    }


    companion object {
        infix fun from(other: Node): Viewport = Viewport("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Viewport = Viewport("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Viewport = fromVariant(Viewport(""), other)


        // Constants
        const val UPDATE_DISABLED: Long = 0
        const val UPDATE_ONCE: Long = 1
        const val UPDATE_WHEN_VISIBLE: Long = 2
        const val UPDATE_ALWAYS: Long = 3
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Long = 0
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Long = 1
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Long = 2
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Long = 3
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Long = 4
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Long = 5
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Long = 6
        const val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Long = 7
        const val RENDER_INFO_OBJECTS_IN_FRAME: Long = 0
        const val RENDER_INFO_VERTICES_IN_FRAME: Long = 1
        const val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2
        const val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3
        const val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4
        const val RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5
        const val RENDER_INFO_MAX: Long = 6
        const val DEBUG_DRAW_DISABLED: Long = 0
        const val DEBUG_DRAW_UNSHADED: Long = 1
        const val DEBUG_DRAW_OVERDRAW: Long = 2
        const val DEBUG_DRAW_WIREFRAME: Long = 3
        const val MSAA_DISABLED: Long = 0
        const val MSAA_2X: Long = 1
        const val MSAA_4X: Long = 2
        const val MSAA_8X: Long = 3
        const val MSAA_16X: Long = 4
        const val USAGE_2D: Long = 0
        const val USAGE_2D_NO_SAMPLING: Long = 1
        const val USAGE_3D: Long = 2
        const val USAGE_3D_NO_EFFECTS: Long = 3
        const val CLEAR_MODE_ALWAYS: Long = 0
        const val CLEAR_MODE_NEVER: Long = 1
        const val CLEAR_MODE_ONLY_NEXT_FRAME: Long = 2


    }


    // Properties
    open var arvr: Boolean
        get() = _icall_Boolean(useArvrMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseArvrMethodBind, this.rawMemory, value)


    open var size: Vector2
        get() = _icall_Vector2(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, value)
    open fun size(shedule: (Vector2) -> Unit): Vector2 = size.apply {
        shedule(this)
        size = this
    }


    open var ownWorld: Boolean
        get() = _icall_Boolean(isUsingOwnWorldMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseOwnWorldMethodBind, this.rawMemory, value)


    open var world: World
        get() = _icall_World(getWorldMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setWorldMethodBind, this.rawMemory, value)


    open var world2d: World2D
        get() = _icall_World2D(getWorld2dMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setWorld2dMethodBind, this.rawMemory, value)


    open var transparentBg: Boolean
        get() = _icall_Boolean(hasTransparentBackgroundMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTransparentBackgroundMethodBind, this.rawMemory, value)


    open var msaa: Long
        get() = _icall_Long(getMsaaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMsaaMethodBind, this.rawMemory, value)


    open var hdr: Boolean
        get() = _icall_Boolean(getHdrMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHdrMethodBind, this.rawMemory, value)


    open var disable3d: Boolean
        get() = _icall_Boolean(is3dDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisable3dMethodBind, this.rawMemory, value)


    open var keep3dLinear: Boolean
        get() = _icall_Boolean(getKeep3dLinearMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setKeep3dLinearMethodBind, this.rawMemory, value)


    open var usage: Long
        get() = _icall_Long(getUsageMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setUsageMethodBind, this.rawMemory, value)


    open var debugDraw: Long
        get() = _icall_Long(getDebugDrawMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDebugDrawMethodBind, this.rawMemory, value)


    open var renderTargetVFlip: Boolean
        get() = _icall_Boolean(getVflipMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setVflipMethodBind, this.rawMemory, value)


    open var renderTargetClearMode: Long
        get() = _icall_Long(getClearModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setClearModeMethodBind, this.rawMemory, value)


    open var renderTargetUpdateMode: Long
        get() = _icall_Long(getUpdateModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setUpdateModeMethodBind, this.rawMemory, value)


    open var audioListenerEnable2d: Boolean
        get() = _icall_Boolean(isAudioListener2dMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAsAudioListener2dMethodBind, this.rawMemory, value)


    open var audioListenerEnable3d: Boolean
        get() = _icall_Boolean(isAudioListenerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAsAudioListenerMethodBind, this.rawMemory, value)


    open var physicsObjectPicking: Boolean
        get() = _icall_Boolean(getPhysicsObjectPickingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPhysicsObjectPickingMethodBind, this.rawMemory, value)


    open var guiDisableInput: Boolean
        get() = _icall_Boolean(isInputDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisableInputMethodBind, this.rawMemory, value)


    open var guiSnapControlsToPixels: Boolean
        get() = _icall_Boolean(isSnapControlsToPixelsEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSnapControlsToPixelsMethodBind, this.rawMemory, value)


    open var shadowAtlasSize: Long
        get() = _icall_Long(getShadowAtlasSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setShadowAtlasSizeMethodBind, this.rawMemory, value)


    open var shadowAtlasQuad0: Long
        get() = _icall_Long_Long(getShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Long(setShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 0, value)


    open var shadowAtlasQuad1: Long
        get() = _icall_Long_Long(getShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Long(setShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 1, value)


    open var shadowAtlasQuad2: Long
        get() = _icall_Long_Long(getShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Long(setShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 2, value)


    open var shadowAtlasQuad3: Long
        get() = _icall_Long_Long(getShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Long(setShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, 3, value)


    open var canvasTransform: Transform2D
        get() = _icall_Transform2D(getCanvasTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setCanvasTransformMethodBind, this.rawMemory, value)
    open fun canvasTransform(shedule: (Transform2D) -> Unit): Transform2D = canvasTransform.apply {
        shedule(this)
        canvasTransform = this
    }


    open var globalCanvasTransform: Transform2D
        get() = _icall_Transform2D(getGlobalCanvasTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setGlobalCanvasTransformMethodBind, this.rawMemory, value)
    open fun globalCanvasTransform(shedule: (Transform2D) -> Unit): Transform2D = globalCanvasTransform.apply {
        shedule(this)
        globalCanvasTransform = this
    }




    // Methods
    private val setUseArvrMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_use_arvr") }
    open fun setUseArvr(use: Boolean) {
        _icall_Unit_Boolean(setUseArvrMethodBind, this.rawMemory, use)
    }


    private val useArvrMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "use_arvr") }
    open fun useArvr(): Boolean {
        return _icall_Boolean(useArvrMethodBind, this.rawMemory)
    }


    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_size") }
    open fun setSize(size: Vector2) {
        _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, size)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


    private val setWorld2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_world_2d") }
    open fun setWorld2d(world2d: World2D) {
        _icall_Unit_Object(setWorld2dMethodBind, this.rawMemory, world2d)
    }


    private val getWorld2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_world_2d") }
    open fun getWorld2d(): World2D {
        return _icall_World2D(getWorld2dMethodBind, this.rawMemory)
    }


    private val findWorld2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "find_world_2d") }
    open fun findWorld2d(): World2D {
        return _icall_World2D(findWorld2dMethodBind, this.rawMemory)
    }


    private val setWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_world") }
    open fun setWorld(world: World) {
        _icall_Unit_Object(setWorldMethodBind, this.rawMemory, world)
    }


    private val getWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_world") }
    open fun getWorld(): World {
        return _icall_World(getWorldMethodBind, this.rawMemory)
    }


    private val findWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "find_world") }
    open fun findWorld(): World {
        return _icall_World(findWorldMethodBind, this.rawMemory)
    }


    private val setCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_canvas_transform") }
    open fun setCanvasTransform(xform: Transform2D) {
        _icall_Unit_Transform2D(setCanvasTransformMethodBind, this.rawMemory, xform)
    }


    private val getCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_canvas_transform") }
    open fun getCanvasTransform(): Transform2D {
        return _icall_Transform2D(getCanvasTransformMethodBind, this.rawMemory)
    }


    private val setGlobalCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_global_canvas_transform") }
    open fun setGlobalCanvasTransform(xform: Transform2D) {
        _icall_Unit_Transform2D(setGlobalCanvasTransformMethodBind, this.rawMemory, xform)
    }


    private val getGlobalCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_global_canvas_transform") }
    open fun getGlobalCanvasTransform(): Transform2D {
        return _icall_Transform2D(getGlobalCanvasTransformMethodBind, this.rawMemory)
    }


    private val getFinalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_final_transform") }
    open fun getFinalTransform(): Transform2D {
        return _icall_Transform2D(getFinalTransformMethodBind, this.rawMemory)
    }


    private val getVisibleRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_visible_rect") }
    open fun getVisibleRect(): Rect2 {
        return _icall_Rect2(getVisibleRectMethodBind, this.rawMemory)
    }


    private val setTransparentBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_transparent_background") }
    open fun setTransparentBackground(enable: Boolean) {
        _icall_Unit_Boolean(setTransparentBackgroundMethodBind, this.rawMemory, enable)
    }


    private val hasTransparentBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "has_transparent_background") }
    open fun hasTransparentBackground(): Boolean {
        return _icall_Boolean(hasTransparentBackgroundMethodBind, this.rawMemory)
    }


    open fun _vp_input(arg0: InputEvent) {
    }


    open fun _vp_input_text(text: String) {
    }


    open fun _vp_unhandled_input(arg0: InputEvent) {
    }


    private val setSizeOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_size_override") }
    open fun setSizeOverride(enable: Boolean, size: Vector2 = Vector2(-1, -1), margin: Vector2 = Vector2(0, 0)) {
        _icall_Unit_Boolean_Vector2_Vector2(setSizeOverrideMethodBind, this.rawMemory, enable, size, margin)
    }


    private val getSizeOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_size_override") }
    open fun getSizeOverride(): Vector2 {
        return _icall_Vector2(getSizeOverrideMethodBind, this.rawMemory)
    }


    private val isSizeOverrideEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_size_override_enabled") }
    open fun isSizeOverrideEnabled(): Boolean {
        return _icall_Boolean(isSizeOverrideEnabledMethodBind, this.rawMemory)
    }


    private val setSizeOverrideStretchMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_size_override_stretch") }
    open fun setSizeOverrideStretch(enabled: Boolean) {
        _icall_Unit_Boolean(setSizeOverrideStretchMethodBind, this.rawMemory, enabled)
    }


    private val isSizeOverrideStretchEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_size_override_stretch_enabled") }
    open fun isSizeOverrideStretchEnabled(): Boolean {
        return _icall_Boolean(isSizeOverrideStretchEnabledMethodBind, this.rawMemory)
    }


    private val setVflipMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_vflip") }
    open fun setVflip(enable: Boolean) {
        _icall_Unit_Boolean(setVflipMethodBind, this.rawMemory, enable)
    }


    private val getVflipMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_vflip") }
    open fun getVflip(): Boolean {
        return _icall_Boolean(getVflipMethodBind, this.rawMemory)
    }


    private val setClearModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_clear_mode") }
    open fun setClearMode(mode: Long) {
        _icall_Unit_Long(setClearModeMethodBind, this.rawMemory, mode)
    }


    private val getClearModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_clear_mode") }
    open fun getClearMode(): Viewport.ClearMode {
        return Viewport.ClearMode.fromInt(_icall_Long(getClearModeMethodBind, this.rawMemory))
    }


    private val setUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_update_mode") }
    open fun setUpdateMode(mode: Long) {
        _icall_Unit_Long(setUpdateModeMethodBind, this.rawMemory, mode)
    }


    private val getUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_update_mode") }
    open fun getUpdateMode(): Viewport.UpdateMode {
        return Viewport.UpdateMode.fromInt(_icall_Long(getUpdateModeMethodBind, this.rawMemory))
    }


    private val setMsaaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_msaa") }
    open fun setMsaa(msaa: Long) {
        _icall_Unit_Long(setMsaaMethodBind, this.rawMemory, msaa)
    }


    private val getMsaaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_msaa") }
    open fun getMsaa(): Viewport.MSAA {
        return Viewport.MSAA.fromInt(_icall_Long(getMsaaMethodBind, this.rawMemory))
    }


    private val setHdrMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_hdr") }
    open fun setHdr(enable: Boolean) {
        _icall_Unit_Boolean(setHdrMethodBind, this.rawMemory, enable)
    }


    private val getHdrMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_hdr") }
    open fun getHdr(): Boolean {
        return _icall_Boolean(getHdrMethodBind, this.rawMemory)
    }


    private val setUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_usage") }
    open fun setUsage(usage: Long) {
        _icall_Unit_Long(setUsageMethodBind, this.rawMemory, usage)
    }


    private val getUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_usage") }
    open fun getUsage(): Viewport.Usage {
        return Viewport.Usage.fromInt(_icall_Long(getUsageMethodBind, this.rawMemory))
    }


    private val setDebugDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_debug_draw") }
    open fun setDebugDraw(debugDraw: Long) {
        _icall_Unit_Long(setDebugDrawMethodBind, this.rawMemory, debugDraw)
    }


    private val getDebugDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_debug_draw") }
    open fun getDebugDraw(): Viewport.DebugDraw {
        return Viewport.DebugDraw.fromInt(_icall_Long(getDebugDrawMethodBind, this.rawMemory))
    }


    private val getRenderInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_render_info") }
    open fun getRenderInfo(info: Long): Long {
        return _icall_Long_Long(getRenderInfoMethodBind, this.rawMemory, info)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_texture") }
    open fun getTexture(): ViewportTexture {
        return _icall_ViewportTexture(getTextureMethodBind, this.rawMemory)
    }


    private val setPhysicsObjectPickingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_physics_object_picking") }
    open fun setPhysicsObjectPicking(enable: Boolean) {
        _icall_Unit_Boolean(setPhysicsObjectPickingMethodBind, this.rawMemory, enable)
    }


    private val getPhysicsObjectPickingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_physics_object_picking") }
    open fun getPhysicsObjectPicking(): Boolean {
        return _icall_Boolean(getPhysicsObjectPickingMethodBind, this.rawMemory)
    }


    private val getViewportRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_viewport_rid") }
    open fun getViewportRid(): RID {
        return _icall_RID(getViewportRidMethodBind, this.rawMemory)
    }


    private val inputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "input") }
    open fun input(localEvent: InputEvent) {
        _icall_Unit_Object(inputMethodBind, this.rawMemory, localEvent)
    }


    private val unhandledInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "unhandled_input") }
    open fun unhandledInput(localEvent: InputEvent) {
        _icall_Unit_Object(unhandledInputMethodBind, this.rawMemory, localEvent)
    }


    private val updateWorldsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "update_worlds") }
    open fun updateWorlds() {
        _icall_Unit(updateWorldsMethodBind, this.rawMemory)
    }


    private val setUseOwnWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_use_own_world") }
    open fun setUseOwnWorld(enable: Boolean) {
        _icall_Unit_Boolean(setUseOwnWorldMethodBind, this.rawMemory, enable)
    }


    private val isUsingOwnWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_using_own_world") }
    open fun isUsingOwnWorld(): Boolean {
        return _icall_Boolean(isUsingOwnWorldMethodBind, this.rawMemory)
    }


    private val getCameraMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_camera") }
    open fun getCamera(): Camera {
        return _icall_Camera(getCameraMethodBind, this.rawMemory)
    }


    private val setAsAudioListenerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_as_audio_listener") }
    open fun setAsAudioListener(enable: Boolean) {
        _icall_Unit_Boolean(setAsAudioListenerMethodBind, this.rawMemory, enable)
    }


    private val isAudioListenerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_audio_listener") }
    open fun isAudioListener(): Boolean {
        return _icall_Boolean(isAudioListenerMethodBind, this.rawMemory)
    }


    private val setAsAudioListener2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_as_audio_listener_2d") }
    open fun setAsAudioListener2d(enable: Boolean) {
        _icall_Unit_Boolean(setAsAudioListener2dMethodBind, this.rawMemory, enable)
    }


    private val isAudioListener2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_audio_listener_2d") }
    open fun isAudioListener2d(): Boolean {
        return _icall_Boolean(isAudioListener2dMethodBind, this.rawMemory)
    }


    private val setAttachToScreenRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_attach_to_screen_rect") }
    open fun setAttachToScreenRect(rect: Rect2) {
        _icall_Unit_Rect2(setAttachToScreenRectMethodBind, this.rawMemory, rect)
    }


    private val getMousePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_mouse_position") }
    open fun getMousePosition(): Vector2 {
        return _icall_Vector2(getMousePositionMethodBind, this.rawMemory)
    }


    private val warpMouseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "warp_mouse") }
    open fun warpMouse(toPosition: Vector2) {
        _icall_Unit_Vector2(warpMouseMethodBind, this.rawMemory, toPosition)
    }


    private val guiHasModalStackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "gui_has_modal_stack") }
    open fun guiHasModalStack(): Boolean {
        return _icall_Boolean(guiHasModalStackMethodBind, this.rawMemory)
    }


    private val guiGetDragDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "gui_get_drag_data") }
    open fun guiGetDragData(): Variant {
        return _icall_Variant(guiGetDragDataMethodBind, this.rawMemory)
    }


    private val setDisableInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_disable_input") }
    open fun setDisableInput(disable: Boolean) {
        _icall_Unit_Boolean(setDisableInputMethodBind, this.rawMemory, disable)
    }


    private val isInputDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_input_disabled") }
    open fun isInputDisabled(): Boolean {
        return _icall_Boolean(isInputDisabledMethodBind, this.rawMemory)
    }


    private val setDisable3dMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_disable_3d") }
    open fun setDisable3d(disable: Boolean) {
        _icall_Unit_Boolean(setDisable3dMethodBind, this.rawMemory, disable)
    }


    private val is3dDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_3d_disabled") }
    open fun is3dDisabled(): Boolean {
        return _icall_Boolean(is3dDisabledMethodBind, this.rawMemory)
    }


    private val setKeep3dLinearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_keep_3d_linear") }
    open fun setKeep3dLinear(keep3dLinear: Boolean) {
        _icall_Unit_Boolean(setKeep3dLinearMethodBind, this.rawMemory, keep3dLinear)
    }


    private val getKeep3dLinearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_keep_3d_linear") }
    open fun getKeep3dLinear(): Boolean {
        return _icall_Boolean(getKeep3dLinearMethodBind, this.rawMemory)
    }


    open fun _gui_show_tooltip() {
    }


    open fun _gui_remove_focus() {
    }


    open fun _post_gui_grab_click_focus() {
    }


    private val setShadowAtlasSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_shadow_atlas_size") }
    open fun setShadowAtlasSize(size: Long) {
        _icall_Unit_Long(setShadowAtlasSizeMethodBind, this.rawMemory, size)
    }


    private val getShadowAtlasSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_shadow_atlas_size") }
    open fun getShadowAtlasSize(): Long {
        return _icall_Long(getShadowAtlasSizeMethodBind, this.rawMemory)
    }


    private val setSnapControlsToPixelsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_snap_controls_to_pixels") }
    open fun setSnapControlsToPixels(enabled: Boolean) {
        _icall_Unit_Boolean(setSnapControlsToPixelsMethodBind, this.rawMemory, enabled)
    }


    private val isSnapControlsToPixelsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "is_snap_controls_to_pixels_enabled") }
    open fun isSnapControlsToPixelsEnabled(): Boolean {
        return _icall_Boolean(isSnapControlsToPixelsEnabledMethodBind, this.rawMemory)
    }


    private val setShadowAtlasQuadrantSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "set_shadow_atlas_quadrant_subdiv") }
    open fun setShadowAtlasQuadrantSubdiv(quadrant: Long, subdiv: Long) {
        _icall_Unit_Long_Long(setShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, quadrant, subdiv)
    }


    private val getShadowAtlasQuadrantSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("Viewport", "get_shadow_atlas_quadrant_subdiv") }
    open fun getShadowAtlasQuadrantSubdiv(quadrant: Long): Viewport.ShadowAtlasQuadrantSubdiv {
        return Viewport.ShadowAtlasQuadrantSubdiv.fromInt(_icall_Long_Long(getShadowAtlasQuadrantSubdivMethodBind, this.rawMemory, quadrant))
    }


    open fun _subwindow_visibility_changed() {
    }


}
