package godot

import godot.GeometryInstance
import godot.core.AABB
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Material
import godot.icalls._icall_Unit_AABB
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class GeometryInstance internal constructor(
  _ignore: Any?
) : VisualInstance(_ignore) {
  open var castShadow: Long
    get() {
      val mb = getMethodBind("GeometryInstance","get_cast_shadows_setting")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_cast_shadows_setting")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var extraCullMargin: Double
    get() {
      val mb = getMethodBind("GeometryInstance","get_extra_cull_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_extra_cull_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var lodMaxDistance: Double
    get() {
      val mb = getMethodBind("GeometryInstance","get_lod_max_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_lod_max_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var lodMaxHysteresis: Double
    get() {
      val mb = getMethodBind("GeometryInstance","get_lod_max_hysteresis")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_lod_max_hysteresis")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var lodMinDistance: Double
    get() {
      val mb = getMethodBind("GeometryInstance","get_lod_min_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_lod_min_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var lodMinHysteresis: Double
    get() {
      val mb = getMethodBind("GeometryInstance","get_lod_min_hysteresis")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_lod_min_hysteresis")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var materialOverride: Material
    get() {
      val mb = getMethodBind("GeometryInstance","get_material_override")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_material_override")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var useInBakedLight: Boolean
    get() {
      val mb = getMethodBind("GeometryInstance","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("GeometryInstance","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  internal constructor() : this(null)

  open fun getCastShadowsSetting(): GeometryInstance.ShadowCastingSetting {
    val mb = getMethodBind("GeometryInstance","get_cast_shadows_setting")
    return GeometryInstance.ShadowCastingSetting.from( _icall_Long( mb, this.ptr))
  }

  open fun getExtraCullMargin(): Double {
    val mb = getMethodBind("GeometryInstance","get_extra_cull_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFlag(flag: Long): Boolean {
    val mb = getMethodBind("GeometryInstance","get_flag")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getLodMaxDistance(): Double {
    val mb = getMethodBind("GeometryInstance","get_lod_max_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLodMaxHysteresis(): Double {
    val mb = getMethodBind("GeometryInstance","get_lod_max_hysteresis")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLodMinDistance(): Double {
    val mb = getMethodBind("GeometryInstance","get_lod_min_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLodMinHysteresis(): Double {
    val mb = getMethodBind("GeometryInstance","get_lod_min_hysteresis")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaterialOverride(): Material {
    val mb = getMethodBind("GeometryInstance","get_material_override")
    return _icall_Material( mb, this.ptr)
  }

  open fun setCastShadowsSetting(shadowCastingSetting: Long) {
    val mb = getMethodBind("GeometryInstance","set_cast_shadows_setting")
    _icall_Unit_Long( mb, this.ptr, shadowCastingSetting)
  }

  open fun setCustomAabb(aabb: AABB) {
    val mb = getMethodBind("GeometryInstance","set_custom_aabb")
    _icall_Unit_AABB( mb, this.ptr, aabb)
  }

  open fun setExtraCullMargin(margin: Double) {
    val mb = getMethodBind("GeometryInstance","set_extra_cull_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setFlag(flag: Long, value: Boolean) {
    val mb = getMethodBind("GeometryInstance","set_flag")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, value)
  }

  open fun setLodMaxDistance(mode: Double) {
    val mb = getMethodBind("GeometryInstance","set_lod_max_distance")
    _icall_Unit_Double( mb, this.ptr, mode)
  }

  open fun setLodMaxHysteresis(mode: Double) {
    val mb = getMethodBind("GeometryInstance","set_lod_max_hysteresis")
    _icall_Unit_Double( mb, this.ptr, mode)
  }

  open fun setLodMinDistance(mode: Double) {
    val mb = getMethodBind("GeometryInstance","set_lod_min_distance")
    _icall_Unit_Double( mb, this.ptr, mode)
  }

  open fun setLodMinHysteresis(mode: Double) {
    val mb = getMethodBind("GeometryInstance","set_lod_min_hysteresis")
    _icall_Unit_Double( mb, this.ptr, mode)
  }

  open fun setMaterialOverride(material: Material) {
    val mb = getMethodBind("GeometryInstance","set_material_override")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    FLAG_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowCastingSetting(
    id: Long
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Long = 1

    final const val FLAG_MAX: Long = 2

    final const val FLAG_USE_BAKED_LIGHT: Long = 0

    final const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2

    final const val SHADOW_CASTING_SETTING_OFF: Long = 0

    final const val SHADOW_CASTING_SETTING_ON: Long = 1

    final const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3
  }
}
