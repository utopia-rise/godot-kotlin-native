@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Particles : GeometryInstance {
    constructor() : super("Particles")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DrawOrder(val id: Long) {
        DRAW_ORDER_INDEX(0),
        DRAW_ORDER_LIFETIME(1),
        DRAW_ORDER_VIEW_DEPTH(2),
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
        infix fun from(other: GeometryInstance): Particles = Particles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): Particles = Particles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): Particles = Particles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Particles = Particles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Particles = Particles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Particles = fromVariant(Particles(""), other)


        // Constants
        const val DRAW_ORDER_INDEX: Long = 0
        const val DRAW_ORDER_LIFETIME: Long = 1
        const val DRAW_ORDER_VIEW_DEPTH: Long = 2
        const val MAX_DRAW_PASSES: Long = 4


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


    open var visibilityAabb: AABB
        get() = _icall_AABB(getVisibilityAabbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_AABB(setVisibilityAabbMethodBind, this.rawMemory, value)
    open fun visibilityAabb(shedule: (AABB) -> Unit): AABB = visibilityAabb.apply {
        shedule(this)
        visibilityAabb = this
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


    open var drawPasses: Long
        get() = _icall_Long(getDrawPassesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDrawPassesMethodBind, this.rawMemory, value)


    open var drawPass1: Mesh
        get() = _icall_Mesh_Long(getDrawPassMeshMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Object(setDrawPassMeshMethodBind, this.rawMemory, 0, value)


    open var drawPass2: Mesh
        get() = _icall_Mesh_Long(getDrawPassMeshMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Object(setDrawPassMeshMethodBind, this.rawMemory, 1, value)


    open var drawPass3: Mesh
        get() = _icall_Mesh_Long(getDrawPassMeshMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Object(setDrawPassMeshMethodBind, this.rawMemory, 2, value)


    open var drawPass4: Mesh
        get() = _icall_Mesh_Long(getDrawPassMeshMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Object(setDrawPassMeshMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_emitting") }
    open fun setEmitting(emitting: Boolean) {
        _icall_Unit_Boolean(setEmittingMethodBind, this.rawMemory, emitting)
    }


    private val setAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_amount") }
    open fun setAmount(amount: Long) {
        _icall_Unit_Long(setAmountMethodBind, this.rawMemory, amount)
    }


    private val setLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_lifetime") }
    open fun setLifetime(secs: Double) {
        _icall_Unit_Double(setLifetimeMethodBind, this.rawMemory, secs)
    }


    private val setOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_one_shot") }
    open fun setOneShot(enable: Boolean) {
        _icall_Unit_Boolean(setOneShotMethodBind, this.rawMemory, enable)
    }


    private val setPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_pre_process_time") }
    open fun setPreProcessTime(secs: Double) {
        _icall_Unit_Double(setPreProcessTimeMethodBind, this.rawMemory, secs)
    }


    private val setExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_explosiveness_ratio") }
    open fun setExplosivenessRatio(ratio: Double) {
        _icall_Unit_Double(setExplosivenessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_randomness_ratio") }
    open fun setRandomnessRatio(ratio: Double) {
        _icall_Unit_Double(setRandomnessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setVisibilityAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_visibility_aabb") }
    open fun setVisibilityAabb(aabb: AABB) {
        _icall_Unit_AABB(setVisibilityAabbMethodBind, this.rawMemory, aabb)
    }


    private val setUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_use_local_coordinates") }
    open fun setUseLocalCoordinates(enable: Boolean) {
        _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, enable)
    }


    private val setFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_fixed_fps") }
    open fun setFixedFps(fps: Long) {
        _icall_Unit_Long(setFixedFpsMethodBind, this.rawMemory, fps)
    }


    private val setFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_fractional_delta") }
    open fun setFractionalDelta(enable: Boolean) {
        _icall_Unit_Boolean(setFractionalDeltaMethodBind, this.rawMemory, enable)
    }


    private val setProcessMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_process_material") }
    open fun setProcessMaterial(material: Material) {
        _icall_Unit_Object(setProcessMaterialMethodBind, this.rawMemory, material)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_speed_scale") }
    open fun setSpeedScale(scale: Double) {
        _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, scale)
    }


    private val isEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "is_emitting") }
    open fun isEmitting(): Boolean {
        return _icall_Boolean(isEmittingMethodBind, this.rawMemory)
    }


    private val getAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_amount") }
    open fun getAmount(): Long {
        return _icall_Long(getAmountMethodBind, this.rawMemory)
    }


    private val getLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_lifetime") }
    open fun getLifetime(): Double {
        return _icall_Double(getLifetimeMethodBind, this.rawMemory)
    }


    private val getOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_one_shot") }
    open fun getOneShot(): Boolean {
        return _icall_Boolean(getOneShotMethodBind, this.rawMemory)
    }


    private val getPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_pre_process_time") }
    open fun getPreProcessTime(): Double {
        return _icall_Double(getPreProcessTimeMethodBind, this.rawMemory)
    }


    private val getExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_explosiveness_ratio") }
    open fun getExplosivenessRatio(): Double {
        return _icall_Double(getExplosivenessRatioMethodBind, this.rawMemory)
    }


    private val getRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_randomness_ratio") }
    open fun getRandomnessRatio(): Double {
        return _icall_Double(getRandomnessRatioMethodBind, this.rawMemory)
    }


    private val getVisibilityAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_visibility_aabb") }
    open fun getVisibilityAabb(): AABB {
        return _icall_AABB(getVisibilityAabbMethodBind, this.rawMemory)
    }


    private val getUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_use_local_coordinates") }
    open fun getUseLocalCoordinates(): Boolean {
        return _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
    }


    private val getFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_fixed_fps") }
    open fun getFixedFps(): Long {
        return _icall_Long(getFixedFpsMethodBind, this.rawMemory)
    }


    private val getFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_fractional_delta") }
    open fun getFractionalDelta(): Boolean {
        return _icall_Boolean(getFractionalDeltaMethodBind, this.rawMemory)
    }


    private val getProcessMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_process_material") }
    open fun getProcessMaterial(): Material {
        return _icall_Material(getProcessMaterialMethodBind, this.rawMemory)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_speed_scale") }
    open fun getSpeedScale(): Double {
        return _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
    }


    private val setDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_draw_order") }
    open fun setDrawOrder(order: Long) {
        _icall_Unit_Long(setDrawOrderMethodBind, this.rawMemory, order)
    }


    private val getDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_draw_order") }
    open fun getDrawOrder(): Particles.DrawOrder {
        return Particles.DrawOrder.fromInt(_icall_Long(getDrawOrderMethodBind, this.rawMemory))
    }


    private val setDrawPassesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_draw_passes") }
    open fun setDrawPasses(passes: Long) {
        _icall_Unit_Long(setDrawPassesMethodBind, this.rawMemory, passes)
    }


    private val setDrawPassMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "set_draw_pass_mesh") }
    open fun setDrawPassMesh(pass: Long, mesh: Mesh) {
        _icall_Unit_Long_Object(setDrawPassMeshMethodBind, this.rawMemory, pass, mesh)
    }


    private val getDrawPassesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_draw_passes") }
    open fun getDrawPasses(): Long {
        return _icall_Long(getDrawPassesMethodBind, this.rawMemory)
    }


    private val getDrawPassMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "get_draw_pass_mesh") }
    open fun getDrawPassMesh(pass: Long): Mesh {
        return _icall_Mesh_Long(getDrawPassMeshMethodBind, this.rawMemory, pass)
    }


    private val restartMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "restart") }
    open fun restart() {
        _icall_Unit(restartMethodBind, this.rawMemory)
    }


    private val captureAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("Particles", "capture_aabb") }
    open fun captureAabb(): AABB {
        return _icall_AABB(captureAabbMethodBind, this.rawMemory)
    }


}
