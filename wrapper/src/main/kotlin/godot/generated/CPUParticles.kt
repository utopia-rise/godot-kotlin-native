@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CPUParticles : GeometryInstance {
    constructor() : super("CPUParticles")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Flags(val id: Long) {
        FLAG_ALIGN_Y_TO_VELOCITY(0),
        FLAG_ROTATE_Y(1),
        FLAG_MAX(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EmissionShape(val id: Long) {
        EMISSION_SHAPE_POINT(0),
        EMISSION_SHAPE_SPHERE(1),
        EMISSION_SHAPE_BOX(2),
        EMISSION_SHAPE_POINTS(3),
        EMISSION_SHAPE_DIRECTED_POINTS(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Parameter(val id: Long) {
        PARAM_INITIAL_LINEAR_VELOCITY(0),
        PARAM_ANGULAR_VELOCITY(1),
        PARAM_LINEAR_ACCEL(2),
        PARAM_RADIAL_ACCEL(3),
        PARAM_TANGENTIAL_ACCEL(4),
        PARAM_DAMPING(5),
        PARAM_ANGLE(6),
        PARAM_SCALE(7),
        PARAM_HUE_VARIATION(8),
        PARAM_ANIM_SPEED(9),
        PARAM_ANIM_OFFSET(10),
        PARAM_MAX(11),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
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
        infix fun from(other: GeometryInstance): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CPUParticles = fromVariant(CPUParticles(""), other)


        // Constants
        const val DRAW_ORDER_INDEX: Long = 0
        const val DRAW_ORDER_LIFETIME: Long = 1
        const val DRAW_ORDER_VIEW_DEPTH: Long = 2
        const val PARAM_INITIAL_LINEAR_VELOCITY: Long = 0
        const val PARAM_ANGULAR_VELOCITY: Long = 1
        const val PARAM_LINEAR_ACCEL: Long = 2
        const val PARAM_RADIAL_ACCEL: Long = 3
        const val PARAM_TANGENTIAL_ACCEL: Long = 4
        const val PARAM_DAMPING: Long = 5
        const val PARAM_ANGLE: Long = 6
        const val PARAM_SCALE: Long = 7
        const val PARAM_HUE_VARIATION: Long = 8
        const val PARAM_ANIM_SPEED: Long = 9
        const val PARAM_ANIM_OFFSET: Long = 10
        const val PARAM_MAX: Long = 11
        const val FLAG_ALIGN_Y_TO_VELOCITY: Long = 0
        const val FLAG_ROTATE_Y: Long = 1
        const val FLAG_MAX: Long = 4
        const val EMISSION_SHAPE_POINT: Long = 0
        const val EMISSION_SHAPE_SPHERE: Long = 1
        const val EMISSION_SHAPE_BOX: Long = 2
        const val EMISSION_SHAPE_POINTS: Long = 3
        const val EMISSION_SHAPE_DIRECTED_POINTS: Long = 4


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


    open var localCoords: Boolean
        get() = _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, value)


    open var drawOrder: Long
        get() = _icall_Long(getDrawOrderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDrawOrderMethodBind, this.rawMemory, value)


    open var mesh: Mesh
        get() = _icall_Mesh(getMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMeshMethodBind, this.rawMemory, value)


    open var emissionShape: Long
        get() = _icall_Long(getEmissionShapeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setEmissionShapeMethodBind, this.rawMemory, value)


    open var emissionSphereRadius: Double
        get() = _icall_Double(getEmissionSphereRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEmissionSphereRadiusMethodBind, this.rawMemory, value)


    open var emissionBoxExtents: Vector3
        get() = _icall_Vector3(getEmissionBoxExtentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setEmissionBoxExtentsMethodBind, this.rawMemory, value)
    open fun emissionBoxExtents(shedule: (Vector3) -> Unit): Vector3 = emissionBoxExtents.apply {
        shedule(this)
        emissionBoxExtents = this
    }


    open var emissionPoints: PoolVector3Array
        get() = _icall_PoolVector3Array(getEmissionPointsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector3Array(setEmissionPointsMethodBind, this.rawMemory, value)


    open var emissionNormals: PoolVector3Array
        get() = _icall_PoolVector3Array(getEmissionNormalsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector3Array(setEmissionNormalsMethodBind, this.rawMemory, value)


    open var emissionColors: PoolColorArray
        get() = _icall_PoolColorArray(getEmissionColorsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolColorArray(setEmissionColorsMethodBind, this.rawMemory, value)


    open var flagAlignY: Boolean
        get() = _icall_Boolean_Long(getParticleFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setParticleFlagMethodBind, this.rawMemory, 0, value)


    open var flagRotateY: Boolean
        get() = _icall_Boolean_Long(getParticleFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setParticleFlagMethodBind, this.rawMemory, 1, value)


    open var flagDisableZ: Boolean
        get() = _icall_Boolean_Long(getParticleFlagMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setParticleFlagMethodBind, this.rawMemory, 2, value)


    open var spread: Double
        get() = _icall_Double(getSpreadMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpreadMethodBind, this.rawMemory, value)


    open var flatness: Double
        get() = _icall_Double(getFlatnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFlatnessMethodBind, this.rawMemory, value)


    open var gravity: Vector3
        get() = _icall_Vector3(getGravityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setGravityMethodBind, this.rawMemory, value)
    open fun gravity(shedule: (Vector3) -> Unit): Vector3 = gravity.apply {
        shedule(this)
        gravity = this
    }


    open var initialVelocity: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 0, value)


    open var initialVelocityRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 0, value)


    open var angularVelocity: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 1, value)


    open var angularVelocityRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 1, value)


    open var angularVelocityCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 1, value)


    open var linearAccel: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 2, value)


    open var linearAccelRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 2, value)


    open var linearAccelCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 2, value)


    open var radialAccel: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 3, value)


    open var radialAccelRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 3, value)


    open var radialAccelCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 3, value)


    open var tangentialAccel: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 4, value)


    open var tangentialAccelRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 4, value)


    open var tangentialAccelCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 4, value)


    open var damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 5, value)


    open var dampingRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 5, value)


    open var dampingCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 5, value)


    open var angle: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 6, value)


    open var angleRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 6, value)


    open var angleCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 6, value)


    open var _scale: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 7, value)


    open var scaleRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 7, value)


    open var scaleCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 7, value)


    open var color: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }


    open var colorRamp: GradientTexture
        get() = _icall_GradientTexture(getColorRampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setColorRampMethodBind, this.rawMemory, value)


    open var hueVariation: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 8, value)


    open var hueVariationRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 8, value)


    open var hueVariationCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 8, value)


    open var animSpeed: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 9, value)


    open var animSpeedRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 9, value)


    open var animSpeedCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 9, value)


    open var animOffset: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 10, value)


    open var animOffsetRandom: Double
        get() = _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, 10, value)


    open var animOffsetCurve: Curve
        get() = _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, 10, value)


    open var animLoop: Boolean
        get() = _icall_Boolean_Long(getParticleFlagMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Boolean(setParticleFlagMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emitting") }
    open fun setEmitting(emitting: Boolean) {
        _icall_Unit_Boolean(setEmittingMethodBind, this.rawMemory, emitting)
    }


    private val setAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_amount") }
    open fun setAmount(amount: Long) {
        _icall_Unit_Long(setAmountMethodBind, this.rawMemory, amount)
    }


    private val setLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_lifetime") }
    open fun setLifetime(secs: Double) {
        _icall_Unit_Double(setLifetimeMethodBind, this.rawMemory, secs)
    }


    private val setOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_one_shot") }
    open fun setOneShot(enable: Boolean) {
        _icall_Unit_Boolean(setOneShotMethodBind, this.rawMemory, enable)
    }


    private val setPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_pre_process_time") }
    open fun setPreProcessTime(secs: Double) {
        _icall_Unit_Double(setPreProcessTimeMethodBind, this.rawMemory, secs)
    }


    private val setExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_explosiveness_ratio") }
    open fun setExplosivenessRatio(ratio: Double) {
        _icall_Unit_Double(setExplosivenessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_randomness_ratio") }
    open fun setRandomnessRatio(ratio: Double) {
        _icall_Unit_Double(setRandomnessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_use_local_coordinates") }
    open fun setUseLocalCoordinates(enable: Boolean) {
        _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, enable)
    }


    private val setFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_fixed_fps") }
    open fun setFixedFps(fps: Long) {
        _icall_Unit_Long(setFixedFpsMethodBind, this.rawMemory, fps)
    }


    private val setFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_fractional_delta") }
    open fun setFractionalDelta(enable: Boolean) {
        _icall_Unit_Boolean(setFractionalDeltaMethodBind, this.rawMemory, enable)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_speed_scale") }
    open fun setSpeedScale(scale: Double) {
        _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, scale)
    }


    private val isEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "is_emitting") }
    open fun isEmitting(): Boolean {
        return _icall_Boolean(isEmittingMethodBind, this.rawMemory)
    }


    private val getAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_amount") }
    open fun getAmount(): Long {
        return _icall_Long(getAmountMethodBind, this.rawMemory)
    }


    private val getLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_lifetime") }
    open fun getLifetime(): Double {
        return _icall_Double(getLifetimeMethodBind, this.rawMemory)
    }


    private val getOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_one_shot") }
    open fun getOneShot(): Boolean {
        return _icall_Boolean(getOneShotMethodBind, this.rawMemory)
    }


    private val getPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_pre_process_time") }
    open fun getPreProcessTime(): Double {
        return _icall_Double(getPreProcessTimeMethodBind, this.rawMemory)
    }


    private val getExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_explosiveness_ratio") }
    open fun getExplosivenessRatio(): Double {
        return _icall_Double(getExplosivenessRatioMethodBind, this.rawMemory)
    }


    private val getRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_randomness_ratio") }
    open fun getRandomnessRatio(): Double {
        return _icall_Double(getRandomnessRatioMethodBind, this.rawMemory)
    }


    private val getUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_use_local_coordinates") }
    open fun getUseLocalCoordinates(): Boolean {
        return _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
    }


    private val getFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_fixed_fps") }
    open fun getFixedFps(): Long {
        return _icall_Long(getFixedFpsMethodBind, this.rawMemory)
    }


    private val getFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_fractional_delta") }
    open fun getFractionalDelta(): Boolean {
        return _icall_Boolean(getFractionalDeltaMethodBind, this.rawMemory)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_speed_scale") }
    open fun getSpeedScale(): Double {
        return _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
    }


    private val setDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_draw_order") }
    open fun setDrawOrder(order: Long) {
        _icall_Unit_Long(setDrawOrderMethodBind, this.rawMemory, order)
    }


    private val getDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_draw_order") }
    open fun getDrawOrder(): CPUParticles.DrawOrder {
        return CPUParticles.DrawOrder.fromInt(_icall_Long(getDrawOrderMethodBind, this.rawMemory))
    }


    private val setMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_mesh") }
    open fun setMesh(mesh: Mesh) {
        _icall_Unit_Object(setMeshMethodBind, this.rawMemory, mesh)
    }


    private val getMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_mesh") }
    open fun getMesh(): Mesh {
        return _icall_Mesh(getMeshMethodBind, this.rawMemory)
    }


    private val restartMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "restart") }
    open fun restart() {
        _icall_Unit(restartMethodBind, this.rawMemory)
    }


    private val setSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_spread") }
    open fun setSpread(degrees: Double) {
        _icall_Unit_Double(setSpreadMethodBind, this.rawMemory, degrees)
    }


    private val getSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_spread") }
    open fun getSpread(): Double {
        return _icall_Double(getSpreadMethodBind, this.rawMemory)
    }


    private val setFlatnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_flatness") }
    open fun setFlatness(amount: Double) {
        _icall_Unit_Double(setFlatnessMethodBind, this.rawMemory, amount)
    }


    private val getFlatnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_flatness") }
    open fun getFlatness(): Double {
        return _icall_Double(getFlatnessMethodBind, this.rawMemory)
    }


    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_param") }
    open fun setParam(param: Long, value: Double) {
        _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_param") }
    open fun getParam(param: Long): Double {
        return _icall_Double_Long(getParamMethodBind, this.rawMemory, param)
    }


    private val setParamRandomnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_param_randomness") }
    open fun setParamRandomness(param: Long, randomness: Double) {
        _icall_Unit_Long_Double(setParamRandomnessMethodBind, this.rawMemory, param, randomness)
    }


    private val getParamRandomnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_param_randomness") }
    open fun getParamRandomness(param: Long): Double {
        return _icall_Double_Long(getParamRandomnessMethodBind, this.rawMemory, param)
    }


    private val setParamCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_param_curve") }
    open fun setParamCurve(param: Long, curve: Curve) {
        _icall_Unit_Long_Object(setParamCurveMethodBind, this.rawMemory, param, curve)
    }


    private val getParamCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_param_curve") }
    open fun getParamCurve(param: Long): Curve {
        return _icall_Curve_Long(getParamCurveMethodBind, this.rawMemory, param)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


    private val setColorRampMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_color_ramp") }
    open fun setColorRamp(ramp: Gradient) {
        _icall_Unit_Object(setColorRampMethodBind, this.rawMemory, ramp)
    }


    private val getColorRampMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_color_ramp") }
    open fun getColorRamp(): Gradient {
        return _icall_Gradient(getColorRampMethodBind, this.rawMemory)
    }


    private val setParticleFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_particle_flag") }
    open fun setParticleFlag(flag: Long, enable: Boolean) {
        _icall_Unit_Long_Boolean(setParticleFlagMethodBind, this.rawMemory, flag, enable)
    }


    private val getParticleFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_particle_flag") }
    open fun getParticleFlag(flag: Long): Boolean {
        return _icall_Boolean_Long(getParticleFlagMethodBind, this.rawMemory, flag)
    }


    private val setEmissionShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_shape") }
    open fun setEmissionShape(shape: Long) {
        _icall_Unit_Long(setEmissionShapeMethodBind, this.rawMemory, shape)
    }


    private val getEmissionShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_shape") }
    open fun getEmissionShape(): CPUParticles.EmissionShape {
        return CPUParticles.EmissionShape.fromInt(_icall_Long(getEmissionShapeMethodBind, this.rawMemory))
    }


    private val setEmissionSphereRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_sphere_radius") }
    open fun setEmissionSphereRadius(radius: Double) {
        _icall_Unit_Double(setEmissionSphereRadiusMethodBind, this.rawMemory, radius)
    }


    private val getEmissionSphereRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_sphere_radius") }
    open fun getEmissionSphereRadius(): Double {
        return _icall_Double(getEmissionSphereRadiusMethodBind, this.rawMemory)
    }


    private val setEmissionBoxExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_box_extents") }
    open fun setEmissionBoxExtents(extents: Vector3) {
        _icall_Unit_Vector3(setEmissionBoxExtentsMethodBind, this.rawMemory, extents)
    }


    private val getEmissionBoxExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_box_extents") }
    open fun getEmissionBoxExtents(): Vector3 {
        return _icall_Vector3(getEmissionBoxExtentsMethodBind, this.rawMemory)
    }


    private val setEmissionPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_points") }
    open fun setEmissionPoints(array: PoolVector3Array) {
        _icall_Unit_PoolVector3Array(setEmissionPointsMethodBind, this.rawMemory, array)
    }


    private val getEmissionPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_points") }
    open fun getEmissionPoints(): PoolVector3Array {
        return _icall_PoolVector3Array(getEmissionPointsMethodBind, this.rawMemory)
    }


    private val setEmissionNormalsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_normals") }
    open fun setEmissionNormals(array: PoolVector3Array) {
        _icall_Unit_PoolVector3Array(setEmissionNormalsMethodBind, this.rawMemory, array)
    }


    private val getEmissionNormalsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_normals") }
    open fun getEmissionNormals(): PoolVector3Array {
        return _icall_PoolVector3Array(getEmissionNormalsMethodBind, this.rawMemory)
    }


    private val setEmissionColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_colors") }
    open fun setEmissionColors(array: PoolColorArray) {
        _icall_Unit_PoolColorArray(setEmissionColorsMethodBind, this.rawMemory, array)
    }


    private val getEmissionColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_colors") }
    open fun getEmissionColors(): PoolColorArray {
        return _icall_PoolColorArray(getEmissionColorsMethodBind, this.rawMemory)
    }


    private val getGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_gravity") }
    open fun getGravity(): Vector3 {
        return _icall_Vector3(getGravityMethodBind, this.rawMemory)
    }


    private val setGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_gravity") }
    open fun setGravity(accelVec: Vector3) {
        _icall_Unit_Vector3(setGravityMethodBind, this.rawMemory, accelVec)
    }


    private val convertFromParticlesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "convert_from_particles") }
    open fun convertFromParticles(particles: Object) {
        _icall_Unit_Object(convertFromParticlesMethodBind, this.rawMemory, particles)
    }


    open fun _update_render_thread() {
    }


}
