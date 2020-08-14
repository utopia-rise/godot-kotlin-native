// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.DirectionalLight
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class DirectionalLight : Light() {
  open var directionalShadowBlendSplits: Boolean
    get() {
      val mb = getMethodBind("DirectionalLight","is_blend_splits_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DirectionalLight","set_blend_splits")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var directionalShadowDepthRange: Long
    get() {
      val mb = getMethodBind("DirectionalLight","get_shadow_depth_range")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DirectionalLight","set_shadow_depth_range")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var directionalShadowMode: Long
    get() {
      val mb = getMethodBind("DirectionalLight","get_shadow_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DirectionalLight","set_shadow_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("DirectionalLight", "DirectionalLight")

  open fun getShadowDepthRange(): DirectionalLight.ShadowDepthRange {
    val mb = getMethodBind("DirectionalLight","get_shadow_depth_range")
    return DirectionalLight.ShadowDepthRange.from( _icall_Long( mb, this.ptr))
  }

  open fun getShadowMode(): DirectionalLight.ShadowMode {
    val mb = getMethodBind("DirectionalLight","get_shadow_mode")
    return DirectionalLight.ShadowMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isBlendSplitsEnabled(): Boolean {
    val mb = getMethodBind("DirectionalLight","is_blend_splits_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBlendSplits(enabled: Boolean) {
    val mb = getMethodBind("DirectionalLight","set_blend_splits")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setShadowDepthRange(mode: Long) {
    val mb = getMethodBind("DirectionalLight","set_shadow_depth_range")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setShadowMode(mode: Long) {
    val mb = getMethodBind("DirectionalLight","set_shadow_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class ShadowMode(
    id: Long
  ) {
    SHADOW_ORTHOGONAL(0),

    SHADOW_PARALLEL_2_SPLITS(1),

    SHADOW_PARALLEL_4_SPLITS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowDepthRange(
    id: Long
  ) {
    SHADOW_DEPTH_RANGE_STABLE(0),

    SHADOW_DEPTH_RANGE_OPTIMIZED(1);

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
