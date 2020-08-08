package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class ParallaxLayer internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var motionMirroring: Vector2
    get() {
      val mb = getMethodBind("ParallaxLayer","get_mirroring")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxLayer","set_mirroring")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var motionOffset: Vector2
    get() {
      val mb = getMethodBind("ParallaxLayer","get_motion_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxLayer","set_motion_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var motionScale: Vector2
    get() {
      val mb = getMethodBind("ParallaxLayer","get_motion_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxLayer","set_motion_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ParallaxLayer", "ParallaxLayer")
        }

  }

  open fun motionMirroring(schedule: Vector2.() -> Unit): Vector2 = motionMirroring.apply{
      schedule(this)
      motionMirroring = this
  }


  open fun motionOffset(schedule: Vector2.() -> Unit): Vector2 = motionOffset.apply{
      schedule(this)
      motionOffset = this
  }


  open fun motionScale(schedule: Vector2.() -> Unit): Vector2 = motionScale.apply{
      schedule(this)
      motionScale = this
  }


  open fun getMirroring(): Vector2 {
    val mb = getMethodBind("ParallaxLayer","get_mirroring")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMotionOffset(): Vector2 {
    val mb = getMethodBind("ParallaxLayer","get_motion_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMotionScale(): Vector2 {
    val mb = getMethodBind("ParallaxLayer","get_motion_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setMirroring(mirror: Vector2) {
    val mb = getMethodBind("ParallaxLayer","set_mirroring")
    _icall_Unit_Vector2( mb, this.ptr, mirror)
  }

  open fun setMotionOffset(offset: Vector2) {
    val mb = getMethodBind("ParallaxLayer","set_motion_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setMotionScale(scale: Vector2) {
    val mb = getMethodBind("ParallaxLayer","set_motion_scale")
    _icall_Unit_Vector2( mb, this.ptr, scale)
  }

  companion object
}
