@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ParticlesMaterial : Material {
    constructor() : super("ParticlesMaterial")
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
        PARAM_ORBIT_VELOCITY(2),
        PARAM_LINEAR_ACCEL(3),
        PARAM_RADIAL_ACCEL(4),
        PARAM_TANGENTIAL_ACCEL(5),
        PARAM_DAMPING(6),
        PARAM_ANGLE(7),
        PARAM_SCALE(8),
        PARAM_HUE_VARIATION(9),
        PARAM_ANIM_SPEED(10),
        PARAM_ANIM_OFFSET(11),
        PARAM_MAX(12),
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
        infix fun from(other: Material): ParticlesMaterial = ParticlesMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ParticlesMaterial = ParticlesMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ParticlesMaterial = ParticlesMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ParticlesMaterial = ParticlesMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ParticlesMaterial = fromVariant(ParticlesMaterial(""), other)


        // Constants
        const val PARAM_INITIAL_LINEAR_VELOCITY: Int = 0
        const val PARAM_ANGULAR_VELOCITY: Int = 1
        const val PARAM_ORBIT_VELOCITY: Int = 2
        const val PARAM_LINEAR_ACCEL: Int = 3
        const val PARAM_RADIAL_ACCEL: Int = 4
        const val PARAM_TANGENTIAL_ACCEL: Int = 5
        const val PARAM_DAMPING: Int = 6
        const val PARAM_ANGLE: Int = 7
        const val PARAM_SCALE: Int = 8
        const val PARAM_HUE_VARIATION: Int = 9
        const val PARAM_ANIM_SPEED: Int = 10
        const val PARAM_ANIM_OFFSET: Int = 11
        const val PARAM_MAX: Int = 12
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
    open var trailDivisor: Int
        get() = _icall_Int(getTrailDivisorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTrailDivisorMethodBind, this.rawMemory, value)


    open var trailSizeModifier: CurveTexture
        get() = _icall_CurveTexture(getTrailSizeModifierMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTrailSizeModifierMethodBind, this.rawMemory, value)


    open var trailColorModifier: GradientTexture
        get() = _icall_GradientTexture(getTrailColorModifierMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTrailColorModifierMethodBind, this.rawMemory, value)


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


    open var emissionPointTexture: Texture
        get() = _icall_Texture(getEmissionPointTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEmissionPointTextureMethodBind, this.rawMemory, value)


    open var emissionNormalTexture: Texture
        get() = _icall_Texture(getEmissionNormalTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEmissionNormalTextureMethodBind, this.rawMemory, value)


    open var emissionColorTexture: Texture
        get() = _icall_Texture(getEmissionColorTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEmissionColorTextureMethodBind, this.rawMemory, value)


    open var emissionPointCount: Int
        get() = _icall_Int(getEmissionPointCountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setEmissionPointCountMethodBind, this.rawMemory, value)


    open var flagAlignY: Boolean
        get() = _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, 0, value)


    open var flagRotateY: Boolean
        get() = _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, 1, value)


    open var flagDisableZ: Boolean
        get() = _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, 2, value)


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


    open var angularVelocityCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 1, value)


    open var orbitVelocity: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 2, value)


    open var orbitVelocityRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 2, value)


    open var orbitVelocityCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 2, value)


    open var linearAccel: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 3, value)


    open var linearAccelRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 3, value)


    open var linearAccelCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 3, value)


    open var radialAccel: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 4, value)


    open var radialAccelRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 4, value)


    open var radialAccelCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 4, value)


    open var tangentialAccel: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 5, value)


    open var tangentialAccelRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 5, value)


    open var tangentialAccelCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 5, value)


    open var damping: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 6, value)


    open var dampingRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 6, value)


    open var dampingCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 6, value)


    open var angle: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 7, value)


    open var angleRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 7, value)


    open var angleCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 7, value)


    open var scale: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 8, value)


    open var scaleRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 8, value)


    open var scaleCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 8, value)


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
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 9, value)


    open var hueVariationRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 9, value)


    open var hueVariationCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 9, value)


    open var animSpeed: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 10, value)


    open var animSpeedRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 10, value)


    open var animSpeedCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 10, value)


    open var animOffset: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 11, value)


    open var animOffsetRandom: Float
        get() = _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, 11, value)


    open var animOffsetCurve: CurveTexture
        get() = _icall_CurveTexture_Int(getParamTextureMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, 11, value)


    open var animLoop: Boolean
        get() = _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_spread") }
    open fun setSpread(degrees: Float) {
        _icall_Unit_Float(setSpreadMethodBind, this.rawMemory, degrees)
    }


    private val getSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_spread") }
    open fun getSpread(): Float {
        return _icall_Float(getSpreadMethodBind, this.rawMemory)
    }


    private val setFlatnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_flatness") }
    open fun setFlatness(amount: Float) {
        _icall_Unit_Float(setFlatnessMethodBind, this.rawMemory, amount)
    }


    private val getFlatnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_flatness") }
    open fun getFlatness(): Float {
        return _icall_Float(getFlatnessMethodBind, this.rawMemory)
    }


    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_param") }
    open fun setParam(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_param") }
    open fun getParam(param: Int): Float {
        return _icall_Float_Int(getParamMethodBind, this.rawMemory, param)
    }


    private val setParamRandomnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_param_randomness") }
    open fun setParamRandomness(param: Int, randomness: Float) {
        _icall_Unit_Int_Float(setParamRandomnessMethodBind, this.rawMemory, param, randomness)
    }


    private val getParamRandomnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_param_randomness") }
    open fun getParamRandomness(param: Int): Float {
        return _icall_Float_Int(getParamRandomnessMethodBind, this.rawMemory, param)
    }


    private val setParamTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_param_texture") }
    open fun setParamTexture(param: Int, texture: Texture) {
        _icall_Unit_Int_Object(setParamTextureMethodBind, this.rawMemory, param, texture)
    }


    private val getParamTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_param_texture") }
    open fun getParamTexture(param: Int): Texture {
        return _icall_Texture_Int(getParamTextureMethodBind, this.rawMemory, param)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


    private val setColorRampMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_color_ramp") }
    open fun setColorRamp(ramp: Texture) {
        _icall_Unit_Object(setColorRampMethodBind, this.rawMemory, ramp)
    }


    private val getColorRampMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_color_ramp") }
    open fun getColorRamp(): Texture {
        return _icall_Texture(getColorRampMethodBind, this.rawMemory)
    }


    private val setFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_flag") }
    open fun setFlag(flag: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, flag, enable)
    }


    private val getFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_flag") }
    open fun getFlag(flag: Int): Boolean {
        return _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, flag)
    }


    private val setEmissionShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_shape") }
    open fun setEmissionShape(shape: Int) {
        _icall_Unit_Int(setEmissionShapeMethodBind, this.rawMemory, shape)
    }


    private val getEmissionShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_shape") }
    open fun getEmissionShape(): ParticlesMaterial.EmissionShape {
        return ParticlesMaterial.EmissionShape.fromInt(_icall_Int(getEmissionShapeMethodBind, this.rawMemory))
    }


    private val setEmissionSphereRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_sphere_radius") }
    open fun setEmissionSphereRadius(radius: Float) {
        _icall_Unit_Float(setEmissionSphereRadiusMethodBind, this.rawMemory, radius)
    }


    private val getEmissionSphereRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_sphere_radius") }
    open fun getEmissionSphereRadius(): Float {
        return _icall_Float(getEmissionSphereRadiusMethodBind, this.rawMemory)
    }


    private val setEmissionBoxExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_box_extents") }
    open fun setEmissionBoxExtents(extents: Vector3) {
        _icall_Unit_Vector3(setEmissionBoxExtentsMethodBind, this.rawMemory, extents)
    }


    private val getEmissionBoxExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_box_extents") }
    open fun getEmissionBoxExtents(): Vector3 {
        return _icall_Vector3(getEmissionBoxExtentsMethodBind, this.rawMemory)
    }


    private val setEmissionPointTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_point_texture") }
    open fun setEmissionPointTexture(texture: Texture) {
        _icall_Unit_Object(setEmissionPointTextureMethodBind, this.rawMemory, texture)
    }


    private val getEmissionPointTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_point_texture") }
    open fun getEmissionPointTexture(): Texture {
        return _icall_Texture(getEmissionPointTextureMethodBind, this.rawMemory)
    }


    private val setEmissionNormalTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_normal_texture") }
    open fun setEmissionNormalTexture(texture: Texture) {
        _icall_Unit_Object(setEmissionNormalTextureMethodBind, this.rawMemory, texture)
    }


    private val getEmissionNormalTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_normal_texture") }
    open fun getEmissionNormalTexture(): Texture {
        return _icall_Texture(getEmissionNormalTextureMethodBind, this.rawMemory)
    }


    private val setEmissionColorTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_color_texture") }
    open fun setEmissionColorTexture(texture: Texture) {
        _icall_Unit_Object(setEmissionColorTextureMethodBind, this.rawMemory, texture)
    }


    private val getEmissionColorTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_color_texture") }
    open fun getEmissionColorTexture(): Texture {
        return _icall_Texture(getEmissionColorTextureMethodBind, this.rawMemory)
    }


    private val setEmissionPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_emission_point_count") }
    open fun setEmissionPointCount(pointCount: Int) {
        _icall_Unit_Int(setEmissionPointCountMethodBind, this.rawMemory, pointCount)
    }


    private val getEmissionPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_emission_point_count") }
    open fun getEmissionPointCount(): Int {
        return _icall_Int(getEmissionPointCountMethodBind, this.rawMemory)
    }


    private val setTrailDivisorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_trail_divisor") }
    open fun setTrailDivisor(divisor: Int) {
        _icall_Unit_Int(setTrailDivisorMethodBind, this.rawMemory, divisor)
    }


    private val getTrailDivisorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_trail_divisor") }
    open fun getTrailDivisor(): Int {
        return _icall_Int(getTrailDivisorMethodBind, this.rawMemory)
    }


    private val setTrailSizeModifierMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_trail_size_modifier") }
    open fun setTrailSizeModifier(texture: CurveTexture) {
        _icall_Unit_Object(setTrailSizeModifierMethodBind, this.rawMemory, texture)
    }


    private val getTrailSizeModifierMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_trail_size_modifier") }
    open fun getTrailSizeModifier(): CurveTexture {
        return _icall_CurveTexture(getTrailSizeModifierMethodBind, this.rawMemory)
    }


    private val setTrailColorModifierMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_trail_color_modifier") }
    open fun setTrailColorModifier(texture: GradientTexture) {
        _icall_Unit_Object(setTrailColorModifierMethodBind, this.rawMemory, texture)
    }


    private val getTrailColorModifierMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_trail_color_modifier") }
    open fun getTrailColorModifier(): GradientTexture {
        return _icall_GradientTexture(getTrailColorModifierMethodBind, this.rawMemory)
    }


    private val getGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "get_gravity") }
    open fun getGravity(): Vector3 {
        return _icall_Vector3(getGravityMethodBind, this.rawMemory)
    }


    private val setGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParticlesMaterial", "set_gravity") }
    open fun setGravity(accelVec: Vector3) {
        _icall_Unit_Vector3(setGravityMethodBind, this.rawMemory, accelVec)
    }


}
