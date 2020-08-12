// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AnimationNodeOneShot
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class AnimationNodeOneShot internal constructor(
  _ignore: Any?
) : AnimationNode(_ignore) {
  open var autorestart: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeOneShot","has_autorestart")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeOneShot","set_autorestart")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var autorestartDelay: Double
    get() {
      val mb = getMethodBind("AnimationNodeOneShot","get_autorestart_delay")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeOneShot","set_autorestart_delay")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var autorestartRandomDelay: Double
    get() {
      val mb = getMethodBind("AnimationNodeOneShot","get_autorestart_random_delay")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeOneShot","set_autorestart_random_delay")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fadeinTime: Double
    get() {
      val mb = getMethodBind("AnimationNodeOneShot","get_fadein_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeOneShot","set_fadein_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fadeoutTime: Double
    get() {
      val mb = getMethodBind("AnimationNodeOneShot","get_fadeout_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeOneShot","set_fadeout_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sync: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeOneShot","is_using_sync")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeOneShot","set_use_sync")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("AnimationNodeOneShot", "AnimationNodeOneShot")
        }

  }

  open fun getAutorestartDelay(): Double {
    val mb = getMethodBind("AnimationNodeOneShot","get_autorestart_delay")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAutorestartRandomDelay(): Double {
    val mb = getMethodBind("AnimationNodeOneShot","get_autorestart_random_delay")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFadeinTime(): Double {
    val mb = getMethodBind("AnimationNodeOneShot","get_fadein_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFadeoutTime(): Double {
    val mb = getMethodBind("AnimationNodeOneShot","get_fadeout_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMixMode(): AnimationNodeOneShot.MixMode {
    val mb = getMethodBind("AnimationNodeOneShot","get_mix_mode")
    return AnimationNodeOneShot.MixMode.from( _icall_Long( mb, this.ptr))
  }

  open fun hasAutorestart(): Boolean {
    val mb = getMethodBind("AnimationNodeOneShot","has_autorestart")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingSync(): Boolean {
    val mb = getMethodBind("AnimationNodeOneShot","is_using_sync")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAutorestart(enable: Boolean) {
    val mb = getMethodBind("AnimationNodeOneShot","set_autorestart")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setAutorestartDelay(enable: Double) {
    val mb = getMethodBind("AnimationNodeOneShot","set_autorestart_delay")
    _icall_Unit_Double( mb, this.ptr, enable)
  }

  open fun setAutorestartRandomDelay(enable: Double) {
    val mb = getMethodBind("AnimationNodeOneShot","set_autorestart_random_delay")
    _icall_Unit_Double( mb, this.ptr, enable)
  }

  open fun setFadeinTime(time: Double) {
    val mb = getMethodBind("AnimationNodeOneShot","set_fadein_time")
    _icall_Unit_Double( mb, this.ptr, time)
  }

  open fun setFadeoutTime(time: Double) {
    val mb = getMethodBind("AnimationNodeOneShot","set_fadeout_time")
    _icall_Unit_Double( mb, this.ptr, time)
  }

  open fun setMixMode(mode: Long) {
    val mb = getMethodBind("AnimationNodeOneShot","set_mix_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setUseSync(enable: Boolean) {
    val mb = getMethodBind("AnimationNodeOneShot","set_use_sync")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class MixMode(
    id: Long
  ) {
    MIX_MODE_BLEND(0),

    MIX_MODE_ADD(1);

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
