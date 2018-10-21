@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Particles2D : Node2D {
    constructor() : super("Particles2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DrawOrder(val id: Long) {
        DRAW_ORDER_INDEX(0),
        DRAW_ORDER_LIFETIME(1),
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
        infix fun from(other: Node2D): Particles2D = Particles2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Particles2D = Particles2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Particles2D = Particles2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Particles2D = Particles2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Particles2D = fromVariant(Particles2D(""), other)


        // Constants
        const val DRAW_ORDER_INDEX: Long = 0
        const val DRAW_ORDER_LIFETIME: Long = 1


    }


    // Properties
    open var emitting: Boolean
        get() = _icall_Boolean(isEmittingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEmittingMethodBind, this.rawMemory, value)


    open var amount: Long
        get() = _icall_Long(getAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAmountMethodBind, this.rawMemory, value)


    open var lifetime: Double
        get() = _icall_Double(getLifetimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLifetimeMethodBind, this.rawMemory, value)


    open var oneShot: Boolean
        get() = _icall_Boolean(getOneShotMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setOneShotMethodBind, this.rawMemory, value)


    open var preprocess: Double
        get() = _icall_Double(getPreProcessTimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPreProcessTimeMethodBind, this.rawMemory, value)


    open var speedScale: Double
        get() = _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, value)


    open var explosiveness: Double
        get() = _icall_Double(getExplosivenessRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setExplosivenessRatioMethodBind, this.rawMemory, value)


    open var randomness: Double
        get() = _icall_Double(getRandomnessRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRandomnessRatioMethodBind, this.rawMemory, value)


    open var fixedFps: Long
        get() = _icall_Long(getFixedFpsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFixedFpsMethodBind, this.rawMemory, value)


    open var fractDelta: Boolean
        get() = _icall_Boolean(getFractionalDeltaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFractionalDeltaMethodBind, this.rawMemory, value)


    open var visibilityRect: AABB
        get() = _icall_AABB(getVisibilityRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_AABB(setVisibilityRectMethodBind, this.rawMemory, value)
    open fun visibilityRect(shedule: (AABB) -> Unit): AABB = visibilityRect.apply {
        shedule(this)
        visibilityRect = this
    }


    open var localCoords: Boolean
        get() = _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, value)


    open var drawOrder: Long
        get() = _icall_Long(getDrawOrderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDrawOrderMethodBind, this.rawMemory, value)


    open var processMaterial: Material
        get() = _icall_Material(getProcessMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setProcessMaterialMethodBind, this.rawMemory, value)


    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var normalMap: Texture
        get() = _icall_Texture(getNormalMapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, value)


    open var hFrames: Long
        get() = _icall_Long(getHFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHFramesMethodBind, this.rawMemory, value)


    open var vFrames: Long
        get() = _icall_Long(getVFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVFramesMethodBind, this.rawMemory, value)




    // Methods
    private val setEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_emitting") }
    open fun setEmitting(emitting: Boolean) {
        _icall_Unit_Boolean(setEmittingMethodBind, this.rawMemory, emitting)
    }


    private val setAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_amount") }
    open fun setAmount(amount: Long) {
        _icall_Unit_Long(setAmountMethodBind, this.rawMemory, amount)
    }


    private val setLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_lifetime") }
    open fun setLifetime(secs: Double) {
        _icall_Unit_Double(setLifetimeMethodBind, this.rawMemory, secs)
    }


    private val setOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_one_shot") }
    open fun setOneShot(secs: Boolean) {
        _icall_Unit_Boolean(setOneShotMethodBind, this.rawMemory, secs)
    }


    private val setPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_pre_process_time") }
    open fun setPreProcessTime(secs: Double) {
        _icall_Unit_Double(setPreProcessTimeMethodBind, this.rawMemory, secs)
    }


    private val setExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_explosiveness_ratio") }
    open fun setExplosivenessRatio(ratio: Double) {
        _icall_Unit_Double(setExplosivenessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_randomness_ratio") }
    open fun setRandomnessRatio(ratio: Double) {
        _icall_Unit_Double(setRandomnessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setVisibilityRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_visibility_rect") }
    open fun setVisibilityRect(aabb: Rect2) {
        _icall_Unit_Rect2(setVisibilityRectMethodBind, this.rawMemory, aabb)
    }


    private val setUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_use_local_coordinates") }
    open fun setUseLocalCoordinates(enable: Boolean) {
        _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, enable)
    }


    private val setFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_fixed_fps") }
    open fun setFixedFps(fps: Long) {
        _icall_Unit_Long(setFixedFpsMethodBind, this.rawMemory, fps)
    }


    private val setFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_fractional_delta") }
    open fun setFractionalDelta(enable: Boolean) {
        _icall_Unit_Boolean(setFractionalDeltaMethodBind, this.rawMemory, enable)
    }


    private val setProcessMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_process_material") }
    open fun setProcessMaterial(material: Material) {
        _icall_Unit_Object(setProcessMaterialMethodBind, this.rawMemory, material)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_speed_scale") }
    open fun setSpeedScale(scale: Double) {
        _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, scale)
    }


    private val isEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "is_emitting") }
    open fun isEmitting(): Boolean {
        return _icall_Boolean(isEmittingMethodBind, this.rawMemory)
    }


    private val getAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_amount") }
    open fun getAmount(): Long {
        return _icall_Long(getAmountMethodBind, this.rawMemory)
    }


    private val getLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_lifetime") }
    open fun getLifetime(): Double {
        return _icall_Double(getLifetimeMethodBind, this.rawMemory)
    }


    private val getOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_one_shot") }
    open fun getOneShot(): Boolean {
        return _icall_Boolean(getOneShotMethodBind, this.rawMemory)
    }


    private val getPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_pre_process_time") }
    open fun getPreProcessTime(): Double {
        return _icall_Double(getPreProcessTimeMethodBind, this.rawMemory)
    }


    private val getExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_explosiveness_ratio") }
    open fun getExplosivenessRatio(): Double {
        return _icall_Double(getExplosivenessRatioMethodBind, this.rawMemory)
    }


    private val getRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_randomness_ratio") }
    open fun getRandomnessRatio(): Double {
        return _icall_Double(getRandomnessRatioMethodBind, this.rawMemory)
    }


    private val getVisibilityRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_visibility_rect") }
    open fun getVisibilityRect(): Rect2 {
        return _icall_Rect2(getVisibilityRectMethodBind, this.rawMemory)
    }


    private val getUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_use_local_coordinates") }
    open fun getUseLocalCoordinates(): Boolean {
        return _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
    }


    private val getFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_fixed_fps") }
    open fun getFixedFps(): Long {
        return _icall_Long(getFixedFpsMethodBind, this.rawMemory)
    }


    private val getFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_fractional_delta") }
    open fun getFractionalDelta(): Boolean {
        return _icall_Boolean(getFractionalDeltaMethodBind, this.rawMemory)
    }


    private val getProcessMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_process_material") }
    open fun getProcessMaterial(): Material {
        return _icall_Material(getProcessMaterialMethodBind, this.rawMemory)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_speed_scale") }
    open fun getSpeedScale(): Double {
        return _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
    }


    private val setDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_draw_order") }
    open fun setDrawOrder(order: Long) {
        _icall_Unit_Long(setDrawOrderMethodBind, this.rawMemory, order)
    }


    private val getDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_draw_order") }
    open fun getDrawOrder(): Particles2D.DrawOrder {
        return Particles2D.DrawOrder.fromInt(_icall_Long(getDrawOrderMethodBind, this.rawMemory))
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_normal_map") }
    open fun setNormalMap(texture: Texture) {
        _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, texture)
    }


    private val getNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_normal_map") }
    open fun getNormalMap(): Texture {
        return _icall_Texture(getNormalMapMethodBind, this.rawMemory)
    }


    private val captureRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "capture_rect") }
    open fun captureRect(): Rect2 {
        return _icall_Rect2(captureRectMethodBind, this.rawMemory)
    }


    private val setVFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_v_frames") }
    open fun setVFrames(frames: Long) {
        _icall_Unit_Long(setVFramesMethodBind, this.rawMemory, frames)
    }


    private val getVFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_v_frames") }
    open fun getVFrames(): Long {
        return _icall_Long(getVFramesMethodBind, this.rawMemory)
    }


    private val setHFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "set_h_frames") }
    open fun setHFrames(frames: Long) {
        _icall_Unit_Long(setHFramesMethodBind, this.rawMemory, frames)
    }


    private val getHFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "get_h_frames") }
    open fun getHFrames(): Long {
        return _icall_Long(getHFramesMethodBind, this.rawMemory)
    }


    private val restartMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles2D", "restart") }
    open fun restart() {
        _icall_Unit(restartMethodBind, this.rawMemory)
    }


}
