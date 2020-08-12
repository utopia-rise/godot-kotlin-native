// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Particles2D
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Material
import godot.icalls._icall_Rect2
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Particles2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var amount: Long
    get() {
      val mb = getMethodBind("Particles2D","get_amount")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_amount")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var drawOrder: Long
    get() {
      val mb = getMethodBind("Particles2D","get_draw_order")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_draw_order")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emitting: Boolean
    get() {
      val mb = getMethodBind("Particles2D","is_emitting")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_emitting")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var explosiveness: Double
    get() {
      val mb = getMethodBind("Particles2D","get_explosiveness_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_explosiveness_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fixedFps: Long
    get() {
      val mb = getMethodBind("Particles2D","get_fixed_fps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_fixed_fps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var fractDelta: Boolean
    get() {
      val mb = getMethodBind("Particles2D","get_fractional_delta")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_fractional_delta")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var lifetime: Double
    get() {
      val mb = getMethodBind("Particles2D","get_lifetime")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_lifetime")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var localCoords: Boolean
    get() {
      val mb = getMethodBind("Particles2D","get_use_local_coordinates")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_use_local_coordinates")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var normalMap: Texture
    get() {
      val mb = getMethodBind("Particles2D","get_normal_map")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_normal_map")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var oneShot: Boolean
    get() {
      val mb = getMethodBind("Particles2D","get_one_shot")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_one_shot")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var preprocess: Double
    get() {
      val mb = getMethodBind("Particles2D","get_pre_process_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_pre_process_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var processMaterial: Material
    get() {
      val mb = getMethodBind("Particles2D","get_process_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_process_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var randomness: Double
    get() {
      val mb = getMethodBind("Particles2D","get_randomness_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_randomness_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var speedScale: Double
    get() {
      val mb = getMethodBind("Particles2D","get_speed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_speed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("Particles2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var visibilityRect: Rect2
    get() {
      val mb = getMethodBind("Particles2D","get_visibility_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Particles2D","set_visibility_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Particles2D", "Particles2D")
        }

  }

  open fun visibilityRect(schedule: Rect2.() -> Unit): Rect2 = visibilityRect.apply{
      schedule(this)
      visibilityRect = this
  }


  open fun captureRect(): Rect2 {
    val mb = getMethodBind("Particles2D","capture_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getAmount(): Long {
    val mb = getMethodBind("Particles2D","get_amount")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDrawOrder(): Particles2D.DrawOrder {
    val mb = getMethodBind("Particles2D","get_draw_order")
    return Particles2D.DrawOrder.from( _icall_Long( mb, this.ptr))
  }

  open fun getExplosivenessRatio(): Double {
    val mb = getMethodBind("Particles2D","get_explosiveness_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFixedFps(): Long {
    val mb = getMethodBind("Particles2D","get_fixed_fps")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFractionalDelta(): Boolean {
    val mb = getMethodBind("Particles2D","get_fractional_delta")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getLifetime(): Double {
    val mb = getMethodBind("Particles2D","get_lifetime")
    return _icall_Double( mb, this.ptr)
  }

  open fun getNormalMap(): Texture {
    val mb = getMethodBind("Particles2D","get_normal_map")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getOneShot(): Boolean {
    val mb = getMethodBind("Particles2D","get_one_shot")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getPreProcessTime(): Double {
    val mb = getMethodBind("Particles2D","get_pre_process_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getProcessMaterial(): Material {
    val mb = getMethodBind("Particles2D","get_process_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getRandomnessRatio(): Double {
    val mb = getMethodBind("Particles2D","get_randomness_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpeedScale(): Double {
    val mb = getMethodBind("Particles2D","get_speed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("Particles2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getUseLocalCoordinates(): Boolean {
    val mb = getMethodBind("Particles2D","get_use_local_coordinates")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getVisibilityRect(): Rect2 {
    val mb = getMethodBind("Particles2D","get_visibility_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun isEmitting(): Boolean {
    val mb = getMethodBind("Particles2D","is_emitting")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun restart() {
    val mb = getMethodBind("Particles2D","restart")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAmount(amount: Long) {
    val mb = getMethodBind("Particles2D","set_amount")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setDrawOrder(order: Long) {
    val mb = getMethodBind("Particles2D","set_draw_order")
    _icall_Unit_Long( mb, this.ptr, order)
  }

  open fun setEmitting(emitting: Boolean) {
    val mb = getMethodBind("Particles2D","set_emitting")
    _icall_Unit_Boolean( mb, this.ptr, emitting)
  }

  open fun setExplosivenessRatio(ratio: Double) {
    val mb = getMethodBind("Particles2D","set_explosiveness_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setFixedFps(fps: Long) {
    val mb = getMethodBind("Particles2D","set_fixed_fps")
    _icall_Unit_Long( mb, this.ptr, fps)
  }

  open fun setFractionalDelta(enable: Boolean) {
    val mb = getMethodBind("Particles2D","set_fractional_delta")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setLifetime(secs: Double) {
    val mb = getMethodBind("Particles2D","set_lifetime")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  open fun setNormalMap(texture: Texture) {
    val mb = getMethodBind("Particles2D","set_normal_map")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setOneShot(secs: Boolean) {
    val mb = getMethodBind("Particles2D","set_one_shot")
    _icall_Unit_Boolean( mb, this.ptr, secs)
  }

  open fun setPreProcessTime(secs: Double) {
    val mb = getMethodBind("Particles2D","set_pre_process_time")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  open fun setProcessMaterial(material: Material) {
    val mb = getMethodBind("Particles2D","set_process_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setRandomnessRatio(ratio: Double) {
    val mb = getMethodBind("Particles2D","set_randomness_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setSpeedScale(scale: Double) {
    val mb = getMethodBind("Particles2D","set_speed_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("Particles2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setUseLocalCoordinates(enable: Boolean) {
    val mb = getMethodBind("Particles2D","set_use_local_coordinates")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setVisibilityRect(visibilityRect: Rect2) {
    val mb = getMethodBind("Particles2D","set_visibility_rect")
    _icall_Unit_Rect2( mb, this.ptr, visibilityRect)
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

  companion object
}
