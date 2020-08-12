// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.ReflectionProbe
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class ReflectionProbe internal constructor(
  _ignore: Any?
) : VisualInstance(_ignore) {
  open var boxProjection: Boolean
    get() {
      val mb = getMethodBind("ReflectionProbe","is_box_projection_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_enable_box_projection")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var cullMask: Long
    get() {
      val mb = getMethodBind("ReflectionProbe","get_cull_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_cull_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var enableShadows: Boolean
    get() {
      val mb = getMethodBind("ReflectionProbe","are_shadows_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_enable_shadows")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var extents: Vector3
    get() {
      val mb = getMethodBind("ReflectionProbe","get_extents")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_extents")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var intensity: Double
    get() {
      val mb = getMethodBind("ReflectionProbe","get_intensity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_intensity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var interiorAmbientColor: Color
    get() {
      val mb = getMethodBind("ReflectionProbe","get_interior_ambient")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_interior_ambient")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var interiorAmbientContrib: Double
    get() {
      val mb = getMethodBind("ReflectionProbe","get_interior_ambient_probe_contribution")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_interior_ambient_probe_contribution")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var interiorAmbientEnergy: Double
    get() {
      val mb = getMethodBind("ReflectionProbe","get_interior_ambient_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_interior_ambient_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var interiorEnable: Boolean
    get() {
      val mb = getMethodBind("ReflectionProbe","is_set_as_interior")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_as_interior")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var maxDistance: Double
    get() {
      val mb = getMethodBind("ReflectionProbe","get_max_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_max_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var originOffset: Vector3
    get() {
      val mb = getMethodBind("ReflectionProbe","get_origin_offset")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_origin_offset")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var updateMode: Long
    get() {
      val mb = getMethodBind("ReflectionProbe","get_update_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReflectionProbe","set_update_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ReflectionProbe", "ReflectionProbe")
        }

  }

  open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  open fun interiorAmbientColor(schedule: Color.() -> Unit): Color = interiorAmbientColor.apply{
      schedule(this)
      interiorAmbientColor = this
  }


  open fun originOffset(schedule: Vector3.() -> Unit): Vector3 = originOffset.apply{
      schedule(this)
      originOffset = this
  }


  open fun areShadowsEnabled(): Boolean {
    val mb = getMethodBind("ReflectionProbe","are_shadows_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCullMask(): Long {
    val mb = getMethodBind("ReflectionProbe","get_cull_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getExtents(): Vector3 {
    val mb = getMethodBind("ReflectionProbe","get_extents")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getIntensity(): Double {
    val mb = getMethodBind("ReflectionProbe","get_intensity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getInteriorAmbient(): Color {
    val mb = getMethodBind("ReflectionProbe","get_interior_ambient")
    return _icall_Color( mb, this.ptr)
  }

  open fun getInteriorAmbientEnergy(): Double {
    val mb = getMethodBind("ReflectionProbe","get_interior_ambient_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getInteriorAmbientProbeContribution(): Double {
    val mb = getMethodBind("ReflectionProbe","get_interior_ambient_probe_contribution")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaxDistance(): Double {
    val mb = getMethodBind("ReflectionProbe","get_max_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOriginOffset(): Vector3 {
    val mb = getMethodBind("ReflectionProbe","get_origin_offset")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getUpdateMode(): ReflectionProbe.UpdateMode {
    val mb = getMethodBind("ReflectionProbe","get_update_mode")
    return ReflectionProbe.UpdateMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isBoxProjectionEnabled(): Boolean {
    val mb = getMethodBind("ReflectionProbe","is_box_projection_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSetAsInterior(): Boolean {
    val mb = getMethodBind("ReflectionProbe","is_set_as_interior")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAsInterior(enable: Boolean) {
    val mb = getMethodBind("ReflectionProbe","set_as_interior")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCullMask(layers: Long) {
    val mb = getMethodBind("ReflectionProbe","set_cull_mask")
    _icall_Unit_Long( mb, this.ptr, layers)
  }

  open fun setEnableBoxProjection(enable: Boolean) {
    val mb = getMethodBind("ReflectionProbe","set_enable_box_projection")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setEnableShadows(enable: Boolean) {
    val mb = getMethodBind("ReflectionProbe","set_enable_shadows")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setExtents(extents: Vector3) {
    val mb = getMethodBind("ReflectionProbe","set_extents")
    _icall_Unit_Vector3( mb, this.ptr, extents)
  }

  open fun setIntensity(intensity: Double) {
    val mb = getMethodBind("ReflectionProbe","set_intensity")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setInteriorAmbient(ambient: Color) {
    val mb = getMethodBind("ReflectionProbe","set_interior_ambient")
    _icall_Unit_Color( mb, this.ptr, ambient)
  }

  open fun setInteriorAmbientEnergy(ambientEnergy: Double) {
    val mb = getMethodBind("ReflectionProbe","set_interior_ambient_energy")
    _icall_Unit_Double( mb, this.ptr, ambientEnergy)
  }

  open fun setInteriorAmbientProbeContribution(ambientProbeContribution: Double) {
    val mb = getMethodBind("ReflectionProbe","set_interior_ambient_probe_contribution")
    _icall_Unit_Double( mb, this.ptr, ambientProbeContribution)
  }

  open fun setMaxDistance(maxDistance: Double) {
    val mb = getMethodBind("ReflectionProbe","set_max_distance")
    _icall_Unit_Double( mb, this.ptr, maxDistance)
  }

  open fun setOriginOffset(originOffset: Vector3) {
    val mb = getMethodBind("ReflectionProbe","set_origin_offset")
    _icall_Unit_Vector3( mb, this.ptr, originOffset)
  }

  open fun setUpdateMode(mode: Long) {
    val mb = getMethodBind("ReflectionProbe","set_update_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class UpdateMode(
    id: Long
  ) {
    UPDATE_ONCE(0),

    UPDATE_ALWAYS(1);

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
