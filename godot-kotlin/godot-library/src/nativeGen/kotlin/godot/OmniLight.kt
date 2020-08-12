// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.OmniLight
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class OmniLight internal constructor(
  _ignore: Any?
) : Light(_ignore) {
  open var omniShadowDetail: Long
    get() {
      val mb = getMethodBind("OmniLight","get_shadow_detail")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OmniLight","set_shadow_detail")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var omniShadowMode: Long
    get() {
      val mb = getMethodBind("OmniLight","get_shadow_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OmniLight","set_shadow_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("OmniLight", "OmniLight")
        }

  }

  open fun getShadowDetail(): OmniLight.ShadowDetail {
    val mb = getMethodBind("OmniLight","get_shadow_detail")
    return OmniLight.ShadowDetail.from( _icall_Long( mb, this.ptr))
  }

  open fun getShadowMode(): OmniLight.ShadowMode {
    val mb = getMethodBind("OmniLight","get_shadow_mode")
    return OmniLight.ShadowMode.from( _icall_Long( mb, this.ptr))
  }

  open fun setShadowDetail(detail: Long) {
    val mb = getMethodBind("OmniLight","set_shadow_detail")
    _icall_Unit_Long( mb, this.ptr, detail)
  }

  open fun setShadowMode(mode: Long) {
    val mb = getMethodBind("OmniLight","set_shadow_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class ShadowMode(
    id: Long
  ) {
    SHADOW_DUAL_PARABOLOID(0),

    SHADOW_CUBE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowDetail(
    id: Long
  ) {
    SHADOW_DETAIL_VERTICAL(0),

    SHADOW_DETAIL_HORIZONTAL(1);

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
