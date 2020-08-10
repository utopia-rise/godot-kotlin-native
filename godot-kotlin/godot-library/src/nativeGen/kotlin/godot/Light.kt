// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Light
import godot.core.Color
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Light internal constructor(
  _ignore: Any?
) : VisualInstance(_ignore) {
  open var editorOnly: Boolean
    get() {
      val mb = getMethodBind("Light","is_editor_only")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_editor_only")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var lightBakeMode: Long
    get() {
      val mb = getMethodBind("Light","get_bake_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_bake_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var lightColor: Color
    get() {
      val mb = getMethodBind("Light","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var lightCullMask: Long
    get() {
      val mb = getMethodBind("Light","get_cull_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_cull_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var lightEnergy: Double
    get() {
      val mb = getMethodBind("Light","get_param")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Light","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var lightIndirectEnergy: Double
    get() {
      val mb = getMethodBind("Light","get_param")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Light","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var lightNegative: Boolean
    get() {
      val mb = getMethodBind("Light","is_negative")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_negative")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var lightSpecular: Double
    get() {
      val mb = getMethodBind("Light","get_param")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Light","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var shadowBias: Double
    get() {
      val mb = getMethodBind("Light","get_param")
      return _icall_Double_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("Light","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 13, value)
    }

  open var shadowColor: Color
    get() {
      val mb = getMethodBind("Light","get_shadow_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_shadow_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var shadowContact: Double
    get() {
      val mb = getMethodBind("Light","get_param")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("Light","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var shadowEnabled: Boolean
    get() {
      val mb = getMethodBind("Light","has_shadow")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_shadow")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shadowReverseCullFace: Boolean
    get() {
      val mb = getMethodBind("Light","get_shadow_reverse_cull_face")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light","set_shadow_reverse_cull_face")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun lightColor(schedule: Color.() -> Unit): Color = lightColor.apply{
      schedule(this)
      lightColor = this
  }


  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  open fun getBakeMode(): Light.BakeMode {
    val mb = getMethodBind("Light","get_bake_mode")
    return Light.BakeMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getColor(): Color {
    val mb = getMethodBind("Light","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getCullMask(): Long {
    val mb = getMethodBind("Light","get_cull_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("Light","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getShadowColor(): Color {
    val mb = getMethodBind("Light","get_shadow_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getShadowReverseCullFace(): Boolean {
    val mb = getMethodBind("Light","get_shadow_reverse_cull_face")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun hasShadow(): Boolean {
    val mb = getMethodBind("Light","has_shadow")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEditorOnly(): Boolean {
    val mb = getMethodBind("Light","is_editor_only")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isNegative(): Boolean {
    val mb = getMethodBind("Light","is_negative")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBakeMode(bakeMode: Long) {
    val mb = getMethodBind("Light","set_bake_mode")
    _icall_Unit_Long( mb, this.ptr, bakeMode)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("Light","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setCullMask(cullMask: Long) {
    val mb = getMethodBind("Light","set_cull_mask")
    _icall_Unit_Long( mb, this.ptr, cullMask)
  }

  open fun setEditorOnly(editorOnly: Boolean) {
    val mb = getMethodBind("Light","set_editor_only")
    _icall_Unit_Boolean( mb, this.ptr, editorOnly)
  }

  open fun setNegative(enabled: Boolean) {
    val mb = getMethodBind("Light","set_negative")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("Light","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  open fun setShadow(enabled: Boolean) {
    val mb = getMethodBind("Light","set_shadow")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setShadowColor(shadowColor: Color) {
    val mb = getMethodBind("Light","set_shadow_color")
    _icall_Unit_Color( mb, this.ptr, shadowColor)
  }

  open fun setShadowReverseCullFace(enable: Boolean) {
    val mb = getMethodBind("Light","set_shadow_reverse_cull_face")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class BakeMode(
    id: Long
  ) {
    BAKE_DISABLED(0),

    BAKE_INDIRECT(1),

    BAKE_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Param(
    id: Long
  ) {
    PARAM_ENERGY(0),

    PARAM_INDIRECT_ENERGY(1),

    PARAM_SPECULAR(2),

    PARAM_RANGE(3),

    PARAM_ATTENUATION(4),

    PARAM_SPOT_ANGLE(5),

    PARAM_SPOT_ATTENUATION(6),

    PARAM_CONTACT_SHADOW_SIZE(7),

    PARAM_SHADOW_MAX_DISTANCE(8),

    PARAM_SHADOW_SPLIT_1_OFFSET(9),

    PARAM_SHADOW_SPLIT_2_OFFSET(10),

    PARAM_SHADOW_SPLIT_3_OFFSET(11),

    PARAM_SHADOW_NORMAL_BIAS(12),

    PARAM_SHADOW_BIAS(13),

    PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    PARAM_MAX(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BAKE_ALL: Long = 2

    final const val BAKE_DISABLED: Long = 0

    final const val BAKE_INDIRECT: Long = 1

    final const val PARAM_ATTENUATION: Long = 4

    final const val PARAM_CONTACT_SHADOW_SIZE: Long = 7

    final const val PARAM_ENERGY: Long = 0

    final const val PARAM_INDIRECT_ENERGY: Long = 1

    final const val PARAM_MAX: Long = 15

    final const val PARAM_RANGE: Long = 3

    final const val PARAM_SHADOW_BIAS: Long = 13

    final const val PARAM_SHADOW_BIAS_SPLIT_SCALE: Long = 14

    final const val PARAM_SHADOW_MAX_DISTANCE: Long = 8

    final const val PARAM_SHADOW_NORMAL_BIAS: Long = 12

    final const val PARAM_SHADOW_SPLIT_1_OFFSET: Long = 9

    final const val PARAM_SHADOW_SPLIT_2_OFFSET: Long = 10

    final const val PARAM_SHADOW_SPLIT_3_OFFSET: Long = 11

    final const val PARAM_SPECULAR: Long = 2

    final const val PARAM_SPOT_ANGLE: Long = 5

    final const val PARAM_SPOT_ATTENUATION: Long = 6
  }
}
