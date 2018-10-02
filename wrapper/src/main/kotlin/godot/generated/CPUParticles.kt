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

    enum class Flags(val id: Int) {
        FLAG_ALIGN_Y_TO_VELOCITY(0),
        FLAG_ROTATE_Y(1),
        FLAG_MAX(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EmissionShape(val id: Int) {
        EMISSION_SHAPE_POINT(0),
        EMISSION_SHAPE_SPHERE(1),
        EMISSION_SHAPE_BOX(2),
        EMISSION_SHAPE_POINTS(3),
        EMISSION_SHAPE_DIRECTED_POINTS(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Parameter(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class DrawOrder(val id: Int) {
        DRAW_ORDER_INDEX(0),
        DRAW_ORDER_LIFETIME(1),
        DRAW_ORDER_VIEW_DEPTH(2),
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
        infix fun from(other: GeometryInstance): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CPUParticles = CPUParticles("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CPUParticles = fromVariant(CPUParticles(""), other)


        // Constants
        const val DRAW_ORDER_INDEX: Int = 0
        const val DRAW_ORDER_LIFETIME: Int = 1
        const val DRAW_ORDER_VIEW_DEPTH: Int = 2
        const val PARAM_INITIAL_LINEAR_VELOCITY: Int = 0
        const val PARAM_ANGULAR_VELOCITY: Int = 1
        const val PARAM_LINEAR_ACCEL: Int = 2
        const val PARAM_RADIAL_ACCEL: Int = 3
        const val PARAM_TANGENTIAL_ACCEL: Int = 4
        const val PARAM_DAMPING: Int = 5
        const val PARAM_ANGLE: Int = 6
        const val PARAM_SCALE: Int = 7
        const val PARAM_HUE_VARIATION: Int = 8
        const val PARAM_ANIM_SPEED: Int = 9
        const val PARAM_ANIM_OFFSET: Int = 10
        const val PARAM_MAX: Int = 11
        const val FLAG_ALIGN_Y_TO_VELOCITY: Int = 0
        const val FLAG_ROTATE_Y: Int = 1
        const val FLAG_MAX: Int = 4
        const val EMISSION_SHAPE_POINT: Int = 0
        const val EMISSION_SHAPE_SPHERE: Int = 1
        const val EMISSION_SHAPE_BOX: Int = 2
        const val EMISSION_SHAPE_POINTS: Int = 3
        const val EMISSION_SHAPE_DIRECTED_POINTS: Int = 4


    }


    // Properties
    open var emitting: Boolean
        get() = _icall_Boolean(isEmittingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEmittingMethodBind, this.rawMemory, value)


    open var amount: Int
        get() = _icall_Int(getAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAmountMethodBind, this.rawMemory, value)


    open var lifetime: Float
        get() = _icall_Float(getLifetimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setLifetimeMethodBind, this.rawMemory, value)


    open var oneShot: Boolean
        get() = _icall_Boolean(getOneShotMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setOneShotMethodBind, this.rawMemory, value)


    open var preprocess: Float
        get() = _icall_Float(getPreProcessTimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPreProcessTimeMethodBind, this.rawMemory, value)


    open var speedScale: Float
        get() = _icall_Float(getSpeedScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSpeedScaleMethodBind, this.rawMemory, value)


    open var explosiveness: Float
        get() = _icall_Float(getExplosivenessRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setExplosivenessRatioMethodBind, this.rawMemory, value)


    open var randomness: Float
        get() = _icall_Float(getRandomnessRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRandomnessRatioMethodBind, this.rawMemory, value)


    open var fixedFps: Int
        get() = _icall_Int(getFixedFpsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFixedFpsMethodBind, this.rawMemory, value)


    open var fractDelta: Boolean
        get() = _icall_Boolean(getFractionalDeltaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFractionalDeltaMethodBind, this.rawMemory, value)


    open var localCoords: Boolean
        get() = _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, value)


    open var drawOrder: Int
        get() = _icall_Int(getDrawOrderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDrawOrderMethodBind, this.rawMemory, value)


    open var mesh: Mesh
        get() = _icall_Mesh(getMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMeshMethodBind, this.rawMemory, value)


    open var emissionShape: Int
        get() = _icall_Int(getEmissionShapeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setEmissionShapeMethodBind, this.rawMemory, value)


    open var emissionSphereRadius: Float
        get() = _icall_Float(getEmissionSphereRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setEmissionSphereRadiusMethodBind, this.rawMemory, value)


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
        get() = _icall_Boolean_Int(getParticleFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setParticleFlagMethodBind, this.rawMemory, 0, value)


    open var flagRotateY: Boolean
        get() = _icall_Boolean_Int(getParticleFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setParticleFlagMethodBind, this.rawMemory, 1, value)


    open var flagDisableZ: Boolean
        get() = _icall_Boolean_Int(getParticleFlagMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setParticleFlagMethodBind, this.rawMemory, 2, value)


    open var spread: Float
        get() = _icall_Float(getSpreadMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSpreadMethodBind, this.rawMemory, value)


    open var flatness: Float
        get() = _icall_Float(getFlatnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFlatnessMethodBind, this.rawMemory, value)


    open var gravity: Vector3
        get() = _icall_Vector3(getGravityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setGravityMethodBind, this.rawMemory, value)
    open fun gravity(shedule: (Vector3) -> Unit): Vector3 = gravity.apply {
        shedule(this)
        gravity = this
    }


    open var initialVelocity: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 0, value)


    open var initialVelocityRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 0, value)


    open var angularVelocity: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 1, value)


    open var angularVelocityRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 1, value)


    open var angularVelocityCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 1, value)


    open var linearAccel: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 2, value)


    open var linearAccelRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 2, value)


    open var linearAccelCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 2, value)


    open var radialAccel: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 3, value)


    open var radialAccelRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 3, value)


    open var radialAccelCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 3, value)


    open var tangentialAccel: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 4, value)


    open var tangentialAccelRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 4, value)


    open var tangentialAccelCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 4, value)


    open var damping: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 5, value)


    open var dampingRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 5, value)


    open var dampingCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 5, value)


    open var angle: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 6, value)


    open var angleRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 6, value)


    open var angleCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 6, value)


    open var _scale: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 7, value)


    open var scaleRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 7, value)


    open var scaleCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 7, value)


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


    open var hueVariation: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 8, value)


    open var hueVariationRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 8, value)


    open var hueVariationCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 8, value)


    open var animSpeed: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 9, value)


    open var animSpeedRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 9, value)


    open var animSpeedCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 9, value)


    open var animOffset: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 10, value)


    open var animOffsetRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 10, value)


    open var animOffsetCurve: Curve
        get() = _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, 10, value)


    open var animLoop: Boolean
        get() = _icall_Boolean_Int(getParticleFlagMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Boolean(setParticleFlagMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emitting") }
    open fun setEmitting(emitting: Boolean) {
        _icall_Unit_Boolean(setEmittingMethodBind, this.rawMemory, emitting)
    }


    private val setAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_amount") }
    open fun setAmount(amount: Int) {
        _icall_Unit_Int(setAmountMethodBind, this.rawMemory, amount)
    }


    private val setLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_lifetime") }
    open fun setLifetime(secs: Float) {
        _icall_Unit_Float(setLifetimeMethodBind, this.rawMemory, secs)
    }


    private val setOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_one_shot") }
    open fun setOneShot(enable: Boolean) {
        _icall_Unit_Boolean(setOneShotMethodBind, this.rawMemory, enable)
    }


    private val setPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_pre_process_time") }
    open fun setPreProcessTime(secs: Float) {
        _icall_Unit_Float(setPreProcessTimeMethodBind, this.rawMemory, secs)
    }


    private val setExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_explosiveness_ratio") }
    open fun setExplosivenessRatio(ratio: Float) {
        _icall_Unit_Float(setExplosivenessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_randomness_ratio") }
    open fun setRandomnessRatio(ratio: Float) {
        _icall_Unit_Float(setRandomnessRatioMethodBind, this.rawMemory, ratio)
    }


    private val setUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_use_local_coordinates") }
    open fun setUseLocalCoordinates(enable: Boolean) {
        _icall_Unit_Boolean(setUseLocalCoordinatesMethodBind, this.rawMemory, enable)
    }


    private val setFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_fixed_fps") }
    open fun setFixedFps(fps: Int) {
        _icall_Unit_Int(setFixedFpsMethodBind, this.rawMemory, fps)
    }


    private val setFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_fractional_delta") }
    open fun setFractionalDelta(enable: Boolean) {
        _icall_Unit_Boolean(setFractionalDeltaMethodBind, this.rawMemory, enable)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_speed_scale") }
    open fun setSpeedScale(scale: Float) {
        _icall_Unit_Float(setSpeedScaleMethodBind, this.rawMemory, scale)
    }


    private val isEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "is_emitting") }
    open fun isEmitting(): Boolean {
        return _icall_Boolean(isEmittingMethodBind, this.rawMemory)
    }


    private val getAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_amount") }
    open fun getAmount(): Int {
        return _icall_Int(getAmountMethodBind, this.rawMemory)
    }


    private val getLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_lifetime") }
    open fun getLifetime(): Float {
        return _icall_Float(getLifetimeMethodBind, this.rawMemory)
    }


    private val getOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_one_shot") }
    open fun getOneShot(): Boolean {
        return _icall_Boolean(getOneShotMethodBind, this.rawMemory)
    }


    private val getPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_pre_process_time") }
    open fun getPreProcessTime(): Float {
        return _icall_Float(getPreProcessTimeMethodBind, this.rawMemory)
    }


    private val getExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_explosiveness_ratio") }
    open fun getExplosivenessRatio(): Float {
        return _icall_Float(getExplosivenessRatioMethodBind, this.rawMemory)
    }


    private val getRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_randomness_ratio") }
    open fun getRandomnessRatio(): Float {
        return _icall_Float(getRandomnessRatioMethodBind, this.rawMemory)
    }


    private val getUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_use_local_coordinates") }
    open fun getUseLocalCoordinates(): Boolean {
        return _icall_Boolean(getUseLocalCoordinatesMethodBind, this.rawMemory)
    }


    private val getFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_fixed_fps") }
    open fun getFixedFps(): Int {
        return _icall_Int(getFixedFpsMethodBind, this.rawMemory)
    }


    private val getFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_fractional_delta") }
    open fun getFractionalDelta(): Boolean {
        return _icall_Boolean(getFractionalDeltaMethodBind, this.rawMemory)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_speed_scale") }
    open fun getSpeedScale(): Float {
        return _icall_Float(getSpeedScaleMethodBind, this.rawMemory)
    }


    private val setDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_draw_order") }
    open fun setDrawOrder(order: Int) {
        _icall_Unit_Int(setDrawOrderMethodBind, this.rawMemory, order)
    }


    private val getDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_draw_order") }
    open fun getDrawOrder(): CPUParticles.DrawOrder {
        return CPUParticles.DrawOrder.fromInt(_icall_Int(getDrawOrderMethodBind, this.rawMemory))
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
    open fun setSpread(degrees: Float) {
        _icall_Unit_Float(setSpreadMethodBind, this.rawMemory, degrees)
    }


    private val getSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_spread") }
    open fun getSpread(): Float {
        return _icall_Float(getSpreadMethodBind, this.rawMemory)
    }


    private val setFlatnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_flatness") }
    open fun setFlatness(amount: Float) {
        _icall_Unit_Float(setFlatnessMethodBind, this.rawMemory, amount)
    }


    private val getFlatnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_flatness") }
    open fun getFlatness(): Float {
        return _icall_Float(getFlatnessMethodBind, this.rawMemory)
    }


    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_param") }
    open fun setParam(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_param") }
    open fun getParam(param: Int): Float {
        return _icall_Float_Int(getParamMethodBind, this.rawMemory, param)
    }


    private val setParamRandomnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_param_randomness") }
    open fun setParamRandomness(param: Int, randomness: Float) {
        _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, param, randomness)
    }


    private val getParamRandomnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_param_randomness") }
    open fun getParamRandomness(param: Int): Float {
        return _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, param)
    }


    private val setParamCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_param_curve") }
    open fun setParamCurve(param: Int, curve: Curve) {
        _icall_Unit_Int_Object(setParamCurveMethodBind, this.rawMemory, param, curve)
    }


    private val getParamCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_param_curve") }
    open fun getParamCurve(param: Int): Curve {
        return _icall_Curve_Int(getParamCurveMethodBind, this.rawMemory, param)
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
    open fun setParticleFlag(flag: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setParticleFlagMethodBind, this.rawMemory, flag, enable)
    }


    private val getParticleFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_particle_flag") }
    open fun getParticleFlag(flag: Int): Boolean {
        return _icall_Boolean_Int(getParticleFlagMethodBind, this.rawMemory, flag)
    }


    private val setEmissionShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_shape") }
    open fun setEmissionShape(shape: Int) {
        _icall_Unit_Int(setEmissionShapeMethodBind, this.rawMemory, shape)
    }


    private val getEmissionShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_shape") }
    open fun getEmissionShape(): CPUParticles.EmissionShape {
        return CPUParticles.EmissionShape.fromInt(_icall_Int(getEmissionShapeMethodBind, this.rawMemory))
    }


    private val setEmissionSphereRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "set_emission_sphere_radius") }
    open fun setEmissionSphereRadius(radius: Float) {
        _icall_Unit_Float(setEmissionSphereRadiusMethodBind, this.rawMemory, radius)
    }


    private val getEmissionSphereRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CPUParticles", "get_emission_sphere_radius") }
    open fun getEmissionSphereRadius(): Float {
        return _icall_Float(getEmissionSphereRadiusMethodBind, this.rawMemory)
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
