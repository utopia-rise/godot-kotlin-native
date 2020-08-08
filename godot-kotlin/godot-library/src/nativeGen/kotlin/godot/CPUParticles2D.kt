package godot

import godot.CPUParticles2D
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color
import godot.icalls._icall_Curve_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Gradient
import godot.icalls._icall_Long
import godot.icalls._icall_PoolColorArray
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolColorArray
import godot.icalls._icall_Unit_PoolVector2Array
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class CPUParticles2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var amount: Long
    get() {
      val mb = getMethodBind("CPUParticles2D","get_amount")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_amount")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var angle: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var angleCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 7, value)
    }

  open var angleRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var angularVelocity: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var angularVelocityCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 1, value)
    }

  open var angularVelocityRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var animOffset: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 11, value)
    }

  open var animOffsetCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 11, value)
    }

  open var animOffsetRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 11, value)
    }

  open var animSpeed: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 10, value)
    }

  open var animSpeedCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 10, value)
    }

  open var animSpeedRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 10, value)
    }

  open var color: Color
    get() {
      val mb = getMethodBind("CPUParticles2D","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var colorRamp: Gradient
    get() {
      val mb = getMethodBind("CPUParticles2D","get_color_ramp")
      return _icall_Gradient(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_color_ramp")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var damping: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var dampingCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 6, value)
    }

  open var dampingRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var direction: Vector2
    get() {
      val mb = getMethodBind("CPUParticles2D","get_direction")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_direction")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var drawOrder: Long
    get() {
      val mb = getMethodBind("CPUParticles2D","get_draw_order")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_draw_order")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emissionColors: PoolColorArray
    get() {
      val mb = getMethodBind("CPUParticles2D","get_emission_colors")
      return _icall_PoolColorArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emission_colors")
      _icall_Unit_PoolColorArray(mb, this.ptr, value)
    }

  open var emissionNormals: PoolVector2Array
    get() {
      val mb = getMethodBind("CPUParticles2D","get_emission_normals")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emission_normals")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  open var emissionPoints: PoolVector2Array
    get() {
      val mb = getMethodBind("CPUParticles2D","get_emission_points")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emission_points")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  open var emissionRectExtents: Vector2
    get() {
      val mb = getMethodBind("CPUParticles2D","get_emission_rect_extents")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emission_rect_extents")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var emissionShape: Long
    get() {
      val mb = getMethodBind("CPUParticles2D","get_emission_shape")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emission_shape")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emissionSphereRadius: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_emission_sphere_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emission_sphere_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var emitting: Boolean
    get() {
      val mb = getMethodBind("CPUParticles2D","is_emitting")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_emitting")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var explosiveness: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_explosiveness_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_explosiveness_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fixedFps: Long
    get() {
      val mb = getMethodBind("CPUParticles2D","get_fixed_fps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_fixed_fps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var flagAlignY: Boolean
    get() {
      val mb = getMethodBind("CPUParticles2D","get_particle_flag")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_particle_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var fractDelta: Boolean
    get() {
      val mb = getMethodBind("CPUParticles2D","get_fractional_delta")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_fractional_delta")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var gravity: Vector2
    get() {
      val mb = getMethodBind("CPUParticles2D","get_gravity")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_gravity")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var hueVariation: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var hueVariationCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 9, value)
    }

  open var hueVariationRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var initialVelocity: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var initialVelocityRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var lifetime: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_lifetime")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_lifetime")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var lifetimeRandomness: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_lifetime_randomness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_lifetime_randomness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearAccel: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var linearAccelCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 3, value)
    }

  open var linearAccelRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var localCoords: Boolean
    get() {
      val mb = getMethodBind("CPUParticles2D","get_use_local_coordinates")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_use_local_coordinates")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var normalmap: Texture
    get() {
      val mb = getMethodBind("CPUParticles2D","get_normalmap")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_normalmap")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var oneShot: Boolean
    get() {
      val mb = getMethodBind("CPUParticles2D","get_one_shot")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_one_shot")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var orbitVelocity: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var orbitVelocityCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 2, value)
    }

  open var orbitVelocityRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var preprocess: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_pre_process_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_pre_process_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var radialAccel: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var radialAccelCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 4, value)
    }

  open var radialAccelRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var randomness: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_randomness_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_randomness_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var scaleAmount: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var scaleAmountCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 8, value)
    }

  open var scaleAmountRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var speedScale: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_speed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_speed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var spread: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_spread")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_spread")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tangentialAccel: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var tangentialAccelCurve: Curve
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_curve")
      return _icall_Curve_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_curve")
      _icall_Unit_Long_Object(mb, this.ptr, 5, value)
    }

  open var tangentialAccelRandom: Double
    get() {
      val mb = getMethodBind("CPUParticles2D","get_param_randomness")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_param_randomness")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("CPUParticles2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CPUParticles2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CPUParticles2D", "CPUParticles2D")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun direction(schedule: Vector2.() -> Unit): Vector2 = direction.apply{
      schedule(this)
      direction = this
  }


  open fun emissionRectExtents(schedule: Vector2.() -> Unit): Vector2 = emissionRectExtents.apply{
      schedule(this)
      emissionRectExtents = this
  }


  open fun gravity(schedule: Vector2.() -> Unit): Vector2 = gravity.apply{
      schedule(this)
      gravity = this
  }


  open fun _texture_changed() {
  }

  open fun _update_render_thread() {
  }

  open fun convertFromParticles(particles: Node) {
    val mb = getMethodBind("CPUParticles2D","convert_from_particles")
    _icall_Unit_Object( mb, this.ptr, particles)
  }

  open fun getAmount(): Long {
    val mb = getMethodBind("CPUParticles2D","get_amount")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColor(): Color {
    val mb = getMethodBind("CPUParticles2D","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getColorRamp(): Gradient {
    val mb = getMethodBind("CPUParticles2D","get_color_ramp")
    return _icall_Gradient( mb, this.ptr)
  }

  open fun getDirection(): Vector2 {
    val mb = getMethodBind("CPUParticles2D","get_direction")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getDrawOrder(): CPUParticles2D.DrawOrder {
    val mb = getMethodBind("CPUParticles2D","get_draw_order")
    return CPUParticles2D.DrawOrder.from( _icall_Long( mb, this.ptr))
  }

  open fun getEmissionColors(): PoolColorArray {
    val mb = getMethodBind("CPUParticles2D","get_emission_colors")
    return _icall_PoolColorArray( mb, this.ptr)
  }

  open fun getEmissionNormals(): PoolVector2Array {
    val mb = getMethodBind("CPUParticles2D","get_emission_normals")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getEmissionPoints(): PoolVector2Array {
    val mb = getMethodBind("CPUParticles2D","get_emission_points")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getEmissionRectExtents(): Vector2 {
    val mb = getMethodBind("CPUParticles2D","get_emission_rect_extents")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getEmissionShape(): CPUParticles2D.EmissionShape {
    val mb = getMethodBind("CPUParticles2D","get_emission_shape")
    return CPUParticles2D.EmissionShape.from( _icall_Long( mb, this.ptr))
  }

  open fun getEmissionSphereRadius(): Double {
    val mb = getMethodBind("CPUParticles2D","get_emission_sphere_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getExplosivenessRatio(): Double {
    val mb = getMethodBind("CPUParticles2D","get_explosiveness_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFixedFps(): Long {
    val mb = getMethodBind("CPUParticles2D","get_fixed_fps")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFractionalDelta(): Boolean {
    val mb = getMethodBind("CPUParticles2D","get_fractional_delta")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getGravity(): Vector2 {
    val mb = getMethodBind("CPUParticles2D","get_gravity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getLifetime(): Double {
    val mb = getMethodBind("CPUParticles2D","get_lifetime")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLifetimeRandomness(): Double {
    val mb = getMethodBind("CPUParticles2D","get_lifetime_randomness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getNormalmap(): Texture {
    val mb = getMethodBind("CPUParticles2D","get_normalmap")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getOneShot(): Boolean {
    val mb = getMethodBind("CPUParticles2D","get_one_shot")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("CPUParticles2D","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getParamCurve(param: Long): Curve {
    val mb = getMethodBind("CPUParticles2D","get_param_curve")
    return _icall_Curve_Long( mb, this.ptr, param)
  }

  open fun getParamRandomness(param: Long): Double {
    val mb = getMethodBind("CPUParticles2D","get_param_randomness")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getParticleFlag(flag: Long): Boolean {
    val mb = getMethodBind("CPUParticles2D","get_particle_flag")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getPreProcessTime(): Double {
    val mb = getMethodBind("CPUParticles2D","get_pre_process_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRandomnessRatio(): Double {
    val mb = getMethodBind("CPUParticles2D","get_randomness_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpeedScale(): Double {
    val mb = getMethodBind("CPUParticles2D","get_speed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpread(): Double {
    val mb = getMethodBind("CPUParticles2D","get_spread")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("CPUParticles2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getUseLocalCoordinates(): Boolean {
    val mb = getMethodBind("CPUParticles2D","get_use_local_coordinates")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEmitting(): Boolean {
    val mb = getMethodBind("CPUParticles2D","is_emitting")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun restart() {
    val mb = getMethodBind("CPUParticles2D","restart")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAmount(amount: Long) {
    val mb = getMethodBind("CPUParticles2D","set_amount")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("CPUParticles2D","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setColorRamp(ramp: Gradient) {
    val mb = getMethodBind("CPUParticles2D","set_color_ramp")
    _icall_Unit_Object( mb, this.ptr, ramp)
  }

  open fun setDirection(direction: Vector2) {
    val mb = getMethodBind("CPUParticles2D","set_direction")
    _icall_Unit_Vector2( mb, this.ptr, direction)
  }

  open fun setDrawOrder(order: Long) {
    val mb = getMethodBind("CPUParticles2D","set_draw_order")
    _icall_Unit_Long( mb, this.ptr, order)
  }

  open fun setEmissionColors(array: PoolColorArray) {
    val mb = getMethodBind("CPUParticles2D","set_emission_colors")
    _icall_Unit_PoolColorArray( mb, this.ptr, array)
  }

  open fun setEmissionNormals(array: PoolVector2Array) {
    val mb = getMethodBind("CPUParticles2D","set_emission_normals")
    _icall_Unit_PoolVector2Array( mb, this.ptr, array)
  }

  open fun setEmissionPoints(array: PoolVector2Array) {
    val mb = getMethodBind("CPUParticles2D","set_emission_points")
    _icall_Unit_PoolVector2Array( mb, this.ptr, array)
  }

  open fun setEmissionRectExtents(extents: Vector2) {
    val mb = getMethodBind("CPUParticles2D","set_emission_rect_extents")
    _icall_Unit_Vector2( mb, this.ptr, extents)
  }

  open fun setEmissionShape(shape: Long) {
    val mb = getMethodBind("CPUParticles2D","set_emission_shape")
    _icall_Unit_Long( mb, this.ptr, shape)
  }

  open fun setEmissionSphereRadius(radius: Double) {
    val mb = getMethodBind("CPUParticles2D","set_emission_sphere_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setEmitting(emitting: Boolean) {
    val mb = getMethodBind("CPUParticles2D","set_emitting")
    _icall_Unit_Boolean( mb, this.ptr, emitting)
  }

  open fun setExplosivenessRatio(ratio: Double) {
    val mb = getMethodBind("CPUParticles2D","set_explosiveness_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setFixedFps(fps: Long) {
    val mb = getMethodBind("CPUParticles2D","set_fixed_fps")
    _icall_Unit_Long( mb, this.ptr, fps)
  }

  open fun setFractionalDelta(enable: Boolean) {
    val mb = getMethodBind("CPUParticles2D","set_fractional_delta")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setGravity(accelVec: Vector2) {
    val mb = getMethodBind("CPUParticles2D","set_gravity")
    _icall_Unit_Vector2( mb, this.ptr, accelVec)
  }

  open fun setLifetime(secs: Double) {
    val mb = getMethodBind("CPUParticles2D","set_lifetime")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  open fun setLifetimeRandomness(random: Double) {
    val mb = getMethodBind("CPUParticles2D","set_lifetime_randomness")
    _icall_Unit_Double( mb, this.ptr, random)
  }

  open fun setNormalmap(normalmap: Texture) {
    val mb = getMethodBind("CPUParticles2D","set_normalmap")
    _icall_Unit_Object( mb, this.ptr, normalmap)
  }

  open fun setOneShot(enable: Boolean) {
    val mb = getMethodBind("CPUParticles2D","set_one_shot")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("CPUParticles2D","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  open fun setParamCurve(param: Long, curve: Curve) {
    val mb = getMethodBind("CPUParticles2D","set_param_curve")
    _icall_Unit_Long_Object( mb, this.ptr, param, curve)
  }

  open fun setParamRandomness(param: Long, randomness: Double) {
    val mb = getMethodBind("CPUParticles2D","set_param_randomness")
    _icall_Unit_Long_Double( mb, this.ptr, param, randomness)
  }

  open fun setParticleFlag(flag: Long, enable: Boolean) {
    val mb = getMethodBind("CPUParticles2D","set_particle_flag")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, enable)
  }

  open fun setPreProcessTime(secs: Double) {
    val mb = getMethodBind("CPUParticles2D","set_pre_process_time")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  open fun setRandomnessRatio(ratio: Double) {
    val mb = getMethodBind("CPUParticles2D","set_randomness_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setSpeedScale(scale: Double) {
    val mb = getMethodBind("CPUParticles2D","set_speed_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setSpread(degrees: Double) {
    val mb = getMethodBind("CPUParticles2D","set_spread")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("CPUParticles2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setUseLocalCoordinates(enable: Boolean) {
    val mb = getMethodBind("CPUParticles2D","set_use_local_coordinates")
    _icall_Unit_Boolean( mb, this.ptr, enable)
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

    EMISSION_SHAPE_RECTANGLE(2),

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

  enum class DrawOrder(
    id: Long
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val DRAW_ORDER_INDEX: Long = 0

    final const val DRAW_ORDER_LIFETIME: Long = 1

    final const val EMISSION_SHAPE_DIRECTED_POINTS: Long = 4

    final const val EMISSION_SHAPE_MAX: Long = 5

    final const val EMISSION_SHAPE_POINT: Long = 0

    final const val EMISSION_SHAPE_POINTS: Long = 3

    final const val EMISSION_SHAPE_RECTANGLE: Long = 2

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
