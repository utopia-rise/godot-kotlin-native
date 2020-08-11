// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Particles
import godot.core.AABB
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_AABB
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Material
import godot.icalls._icall_Mesh_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_AABB
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Particles internal constructor(
  _ignore: Any?
) : GeometryInstance(_ignore) {
  open var amount: Long
    get() {
      val mb = getMethodBind("Particles","get_amount")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_amount")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var drawOrder: Long
    get() {
      val mb = getMethodBind("Particles","get_draw_order")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_draw_order")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var drawPass1: Mesh
    get() {
      val mb = getMethodBind("Particles","get_draw_pass_mesh")
      return _icall_Mesh_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_draw_pass_mesh")
      _icall_Unit_Long_Object(mb, this.ptr, 0, value)
    }

  open var drawPass2: Mesh
    get() {
      val mb = getMethodBind("Particles","get_draw_pass_mesh")
      return _icall_Mesh_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_draw_pass_mesh")
      _icall_Unit_Long_Object(mb, this.ptr, 1, value)
    }

  open var drawPass3: Mesh
    get() {
      val mb = getMethodBind("Particles","get_draw_pass_mesh")
      return _icall_Mesh_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_draw_pass_mesh")
      _icall_Unit_Long_Object(mb, this.ptr, 2, value)
    }

  open var drawPass4: Mesh
    get() {
      val mb = getMethodBind("Particles","get_draw_pass_mesh")
      return _icall_Mesh_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_draw_pass_mesh")
      _icall_Unit_Long_Object(mb, this.ptr, 3, value)
    }

  open var drawPasses: Long
    get() {
      val mb = getMethodBind("Particles","get_draw_passes")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_draw_passes")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emitting: Boolean
    get() {
      val mb = getMethodBind("Particles","is_emitting")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_emitting")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var explosiveness: Double
    get() {
      val mb = getMethodBind("Particles","get_explosiveness_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_explosiveness_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fixedFps: Long
    get() {
      val mb = getMethodBind("Particles","get_fixed_fps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_fixed_fps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var fractDelta: Boolean
    get() {
      val mb = getMethodBind("Particles","get_fractional_delta")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_fractional_delta")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var lifetime: Double
    get() {
      val mb = getMethodBind("Particles","get_lifetime")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_lifetime")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var localCoords: Boolean
    get() {
      val mb = getMethodBind("Particles","get_use_local_coordinates")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_use_local_coordinates")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var oneShot: Boolean
    get() {
      val mb = getMethodBind("Particles","get_one_shot")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_one_shot")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var preprocess: Double
    get() {
      val mb = getMethodBind("Particles","get_pre_process_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_pre_process_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var processMaterial: Material
    get() {
      val mb = getMethodBind("Particles","get_process_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_process_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var randomness: Double
    get() {
      val mb = getMethodBind("Particles","get_randomness_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_randomness_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var speedScale: Double
    get() {
      val mb = getMethodBind("Particles","get_speed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_speed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var visibilityAabb: AABB
    get() {
      val mb = getMethodBind("Particles","get_visibility_aabb")
      return _icall_AABB(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles","set_visibility_aabb")
      _icall_Unit_AABB(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Particles", "Particles")
        }

  }

  open fun visibilityAabb(schedule: AABB.() -> Unit): AABB = visibilityAabb.apply{
      schedule(this)
      visibilityAabb = this
  }


  open fun captureAabb(): AABB {
    val mb = getMethodBind("Particles","capture_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getAmount(): Long {
    val mb = getMethodBind("Particles","get_amount")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDrawOrder(): Particles.DrawOrder {
    val mb = getMethodBind("Particles","get_draw_order")
    return Particles.DrawOrder.from( _icall_Long( mb, this.ptr))
  }

  open fun getDrawPassMesh(pass: Long): Mesh {
    val mb = getMethodBind("Particles","get_draw_pass_mesh")
    return _icall_Mesh_Long( mb, this.ptr, pass)
  }

  open fun getDrawPasses(): Long {
    val mb = getMethodBind("Particles","get_draw_passes")
    return _icall_Long( mb, this.ptr)
  }

  open fun getExplosivenessRatio(): Double {
    val mb = getMethodBind("Particles","get_explosiveness_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFixedFps(): Long {
    val mb = getMethodBind("Particles","get_fixed_fps")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFractionalDelta(): Boolean {
    val mb = getMethodBind("Particles","get_fractional_delta")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getLifetime(): Double {
    val mb = getMethodBind("Particles","get_lifetime")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOneShot(): Boolean {
    val mb = getMethodBind("Particles","get_one_shot")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getPreProcessTime(): Double {
    val mb = getMethodBind("Particles","get_pre_process_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getProcessMaterial(): Material {
    val mb = getMethodBind("Particles","get_process_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getRandomnessRatio(): Double {
    val mb = getMethodBind("Particles","get_randomness_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpeedScale(): Double {
    val mb = getMethodBind("Particles","get_speed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getUseLocalCoordinates(): Boolean {
    val mb = getMethodBind("Particles","get_use_local_coordinates")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getVisibilityAabb(): AABB {
    val mb = getMethodBind("Particles","get_visibility_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun isEmitting(): Boolean {
    val mb = getMethodBind("Particles","is_emitting")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun restart() {
    val mb = getMethodBind("Particles","restart")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAmount(amount: Long) {
    val mb = getMethodBind("Particles","set_amount")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setDrawOrder(order: Long) {
    val mb = getMethodBind("Particles","set_draw_order")
    _icall_Unit_Long( mb, this.ptr, order)
  }

  open fun setDrawPassMesh(pass: Long, mesh: Mesh) {
    val mb = getMethodBind("Particles","set_draw_pass_mesh")
    _icall_Unit_Long_Object( mb, this.ptr, pass, mesh)
  }

  open fun setDrawPasses(passes: Long) {
    val mb = getMethodBind("Particles","set_draw_passes")
    _icall_Unit_Long( mb, this.ptr, passes)
  }

  open fun setEmitting(emitting: Boolean) {
    val mb = getMethodBind("Particles","set_emitting")
    _icall_Unit_Boolean( mb, this.ptr, emitting)
  }

  open fun setExplosivenessRatio(ratio: Double) {
    val mb = getMethodBind("Particles","set_explosiveness_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setFixedFps(fps: Long) {
    val mb = getMethodBind("Particles","set_fixed_fps")
    _icall_Unit_Long( mb, this.ptr, fps)
  }

  open fun setFractionalDelta(enable: Boolean) {
    val mb = getMethodBind("Particles","set_fractional_delta")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setLifetime(secs: Double) {
    val mb = getMethodBind("Particles","set_lifetime")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  open fun setOneShot(enable: Boolean) {
    val mb = getMethodBind("Particles","set_one_shot")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPreProcessTime(secs: Double) {
    val mb = getMethodBind("Particles","set_pre_process_time")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  open fun setProcessMaterial(material: Material) {
    val mb = getMethodBind("Particles","set_process_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setRandomnessRatio(ratio: Double) {
    val mb = getMethodBind("Particles","set_randomness_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setSpeedScale(scale: Double) {
    val mb = getMethodBind("Particles","set_speed_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setUseLocalCoordinates(enable: Boolean) {
    val mb = getMethodBind("Particles","set_use_local_coordinates")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setVisibilityAabb(aabb: AABB) {
    val mb = getMethodBind("Particles","set_visibility_aabb")
    _icall_Unit_AABB( mb, this.ptr, aabb)
  }

  enum class DrawOrder(
    id: Long
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1),

    DRAW_ORDER_VIEW_DEPTH(2);

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

    final const val DRAW_ORDER_VIEW_DEPTH: Long = 2

    final const val MAX_DRAW_PASSES: Long = 4
  }
}
