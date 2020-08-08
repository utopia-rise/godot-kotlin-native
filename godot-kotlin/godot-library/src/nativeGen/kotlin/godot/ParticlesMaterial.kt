package godot

import godot.ParticlesMaterial
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color
import godot.icalls._icall_CurveTexture
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_GradientTexture
import godot.icalls._icall_Long
import godot.icalls._icall_Texture
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class ParticlesMaterial internal constructor(
  _ignore: Any?
) : Material(_ignore) {
  open var angle: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var angleCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 7, value)
    }

  open var angleRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var angularVelocity: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var angularVelocityCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 1, value)
    }

  open var angularVelocityRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var animOffset: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 11, value)
    }

  open var animOffsetCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 11, value)
    }

  open var animOffsetRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 11, value)
    }

  open var animSpeed: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 10, value)
    }

  open var animSpeedCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 10, value)
    }

  open var animSpeedRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 10, value)
    }

  open var color: Color
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var colorRamp: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_color_ramp")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_color_ramp")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var damping: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var dampingCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 6, value)
    }

  open var dampingRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var direction: Vector3
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_direction")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_direction")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var emissionBoxExtents: Vector3
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_box_extents")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_box_extents")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var emissionColorTexture: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_color_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_color_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var emissionNormalTexture: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_normal_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_normal_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var emissionPointCount: Long
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_point_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_point_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emissionPointTexture: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_point_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_point_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var emissionShape: Long
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_shape")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_shape")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emissionSphereRadius: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_emission_sphere_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_emission_sphere_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var flagAlignY: Boolean
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var flagDisableZ: Boolean
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var flagRotateY: Boolean
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var flatness: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_flatness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_flatness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gravity: Vector3
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_gravity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_gravity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var hueVariation: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var hueVariationCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 9, value)
    }

  open var hueVariationRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var initialVelocity: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var initialVelocityRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var lifetimeRandomness: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_lifetime_randomness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_lifetime_randomness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearAccel: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var linearAccelCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 3, value)
    }

  open var linearAccelRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var orbitVelocity: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var orbitVelocityCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 2, value)
    }

  open var orbitVelocityRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var radialAccel: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var radialAccelCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 4, value)
    }

  open var radialAccelRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var scale: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var scaleCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 8, value)
    }

  open var scaleRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var spread: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_spread")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_spread")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tangentialAccel: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var tangentialAccelCurve: Texture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_texture")
      return _icall_Texture_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 5, value)
    }

  open var tangentialAccelRandom: Double
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var trailColorModifier: GradientTexture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_trail_color_modifier")
      return _icall_GradientTexture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_trail_color_modifier")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var trailDivisor: Long
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_trail_divisor")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_trail_divisor")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var trailSizeModifier: CurveTexture
    get() {
      val mb = getMethodBind("ParticlesMaterial","get_trail_size_modifier")
      return _icall_CurveTexture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParticlesMaterial","set_trail_size_modifier")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ParticlesMaterial", "ParticlesMaterial")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun direction(schedule: Vector3.() -> Unit): Vector3 = direction.apply{
      schedule(this)
      direction = this
  }


  open fun emissionBoxExtents(schedule: Vector3.() -> Unit): Vector3 = emissionBoxExtents.apply{
      schedule(this)
      emissionBoxExtents = this
  }


  open fun gravity(schedule: Vector3.() -> Unit): Vector3 = gravity.apply{
      schedule(this)
      gravity = this
  }


  open fun getColor(): Color {
    val mb = getMethodBind("ParticlesMaterial","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getColorRamp(): Texture {
    val mb = getMethodBind("ParticlesMaterial","get_color_ramp")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getDirection(): Vector3 {
    val mb = getMethodBind("ParticlesMaterial","get_direction")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getEmissionBoxExtents(): Vector3 {
    val mb = getMethodBind("ParticlesMaterial","get_emission_box_extents")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getEmissionColorTexture(): Texture {
    val mb = getMethodBind("ParticlesMaterial","get_emission_color_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getEmissionNormalTexture(): Texture {
    val mb = getMethodBind("ParticlesMaterial","get_emission_normal_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getEmissionPointCount(): Long {
    val mb = getMethodBind("ParticlesMaterial","get_emission_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEmissionPointTexture(): Texture {
    val mb = getMethodBind("ParticlesMaterial","get_emission_point_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getEmissionShape(): ParticlesMaterial.EmissionShape {
    val mb = getMethodBind("ParticlesMaterial","get_emission_shape")
    return ParticlesMaterial.EmissionShape.from( _icall_Long( mb, this.ptr))
  }

  open fun getEmissionSphereRadius(): Double {
    val mb = getMethodBind("ParticlesMaterial","get_emission_sphere_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFlag(flag: Long): Boolean {
    val mb = getMethodBind("ParticlesMaterial","get_flag")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getFlatness(): Double {
    val mb = getMethodBind("ParticlesMaterial","get_flatness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGravity(): Vector3 {
    val mb = getMethodBind("ParticlesMaterial","get_gravity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getLifetimeRandomness(): Double {
    val mb = getMethodBind("ParticlesMaterial","get_lifetime_randomness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("ParticlesMaterial","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getParamRandomness(param: Long): Double {
    val mb = getMethodBind("ParticlesMaterial","get_param_randomness")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getParamTexture(param: Long): Texture {
    val mb = getMethodBind("ParticlesMaterial","get_param_texture")
    return _icall_Texture_Long( mb, this.ptr, param)
  }

  open fun getSpread(): Double {
    val mb = getMethodBind("ParticlesMaterial","get_spread")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTrailColorModifier(): GradientTexture {
    val mb = getMethodBind("ParticlesMaterial","get_trail_color_modifier")
    return _icall_GradientTexture( mb, this.ptr)
  }

  open fun getTrailDivisor(): Long {
    val mb = getMethodBind("ParticlesMaterial","get_trail_divisor")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTrailSizeModifier(): CurveTexture {
    val mb = getMethodBind("ParticlesMaterial","get_trail_size_modifier")
    return _icall_CurveTexture( mb, this.ptr)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("ParticlesMaterial","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setColorRamp(ramp: Texture) {
    val mb = getMethodBind("ParticlesMaterial","set_color_ramp")
    _icall_Unit_Object( mb, this.ptr, ramp)
  }

  open fun setDirection(degrees: Vector3) {
    val mb = getMethodBind("ParticlesMaterial","set_direction")
    _icall_Unit_Vector3( mb, this.ptr, degrees)
  }

  open fun setEmissionBoxExtents(extents: Vector3) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_box_extents")
    _icall_Unit_Vector3( mb, this.ptr, extents)
  }

  open fun setEmissionColorTexture(texture: Texture) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_color_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setEmissionNormalTexture(texture: Texture) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_normal_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setEmissionPointCount(pointCount: Long) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_point_count")
    _icall_Unit_Long( mb, this.ptr, pointCount)
  }

  open fun setEmissionPointTexture(texture: Texture) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_point_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setEmissionShape(shape: Long) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_shape")
    _icall_Unit_Long( mb, this.ptr, shape)
  }

  open fun setEmissionSphereRadius(radius: Double) {
    val mb = getMethodBind("ParticlesMaterial","set_emission_sphere_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setFlag(flag: Long, enable: Boolean) {
    val mb = getMethodBind("ParticlesMaterial","set_flag")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, enable)
  }

  open fun setFlatness(amount: Double) {
    val mb = getMethodBind("ParticlesMaterial","set_flatness")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setGravity(accelVec: Vector3) {
    val mb = getMethodBind("ParticlesMaterial","set_gravity")
    _icall_Unit_Vector3( mb, this.ptr, accelVec)
  }

  open fun setLifetimeRandomness(randomness: Double) {
    val mb = getMethodBind("ParticlesMaterial","set_lifetime_randomness")
    _icall_Unit_Double( mb, this.ptr, randomness)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("ParticlesMaterial","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  open fun setParamRandomness(param: Long, randomness: Double) {
    val mb = getMethodBind("ParticlesMaterial","set_param_randomness")
    _icall_Unit_Long_Double( mb, this.ptr, param, randomness)
  }

  open fun setParamTexture(param: Long, texture: Texture) {
    val mb = getMethodBind("ParticlesMaterial","set_param_texture")
    _icall_Unit_Long_Object( mb, this.ptr, param, texture)
  }

  open fun setSpread(degrees: Double) {
    val mb = getMethodBind("ParticlesMaterial","set_spread")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setTrailColorModifier(texture: GradientTexture) {
    val mb = getMethodBind("ParticlesMaterial","set_trail_color_modifier")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setTrailDivisor(divisor: Long) {
    val mb = getMethodBind("ParticlesMaterial","set_trail_divisor")
    _icall_Unit_Long( mb, this.ptr, divisor)
  }

  open fun setTrailSizeModifier(texture: CurveTexture) {
    val mb = getMethodBind("ParticlesMaterial","set_trail_size_modifier")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_ALIGN_Y_TO_VELOCITY(0),

    FLAG_ROTATE_Y(1),

    FLAG_DISABLE_Z(2),

    FLAG_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EmissionShape(
    id: Long
  ) {
    EMISSION_SHAPE_POINT(0),

    EMISSION_SHAPE_SPHERE(1),

    EMISSION_SHAPE_BOX(2),

    EMISSION_SHAPE_POINTS(3),

    EMISSION_SHAPE_DIRECTED_POINTS(4),

    EMISSION_SHAPE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Parameter(
    id: Long
  ) {
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

    PARAM_MAX(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val EMISSION_SHAPE_BOX: Long = 2

    final const val EMISSION_SHAPE_DIRECTED_POINTS: Long = 4

    final const val EMISSION_SHAPE_MAX: Long = 5

    final const val EMISSION_SHAPE_POINT: Long = 0

    final const val EMISSION_SHAPE_POINTS: Long = 3

    final const val EMISSION_SHAPE_SPHERE: Long = 1

    final const val FLAG_ALIGN_Y_TO_VELOCITY: Long = 0

    final const val FLAG_DISABLE_Z: Long = 2

    final const val FLAG_MAX: Long = 3

    final const val FLAG_ROTATE_Y: Long = 1

    final const val PARAM_ANGLE: Long = 7

    final const val PARAM_ANGULAR_VELOCITY: Long = 1

    final const val PARAM_ANIM_OFFSET: Long = 11

    final const val PARAM_ANIM_SPEED: Long = 10

    final const val PARAM_DAMPING: Long = 6

    final const val PARAM_HUE_VARIATION: Long = 9

    final const val PARAM_INITIAL_LINEAR_VELOCITY: Long = 0

    final const val PARAM_LINEAR_ACCEL: Long = 3

    final const val PARAM_MAX: Long = 12

    final const val PARAM_ORBIT_VELOCITY: Long = 2

    final const val PARAM_RADIAL_ACCEL: Long = 4

    final const val PARAM_SCALE: Long = 8

    final const val PARAM_TANGENTIAL_ACCEL: Long = 5
  }
}
