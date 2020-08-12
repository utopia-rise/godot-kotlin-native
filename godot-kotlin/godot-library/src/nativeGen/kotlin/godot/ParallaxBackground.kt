// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Transform2D
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

open class ParallaxBackground internal constructor(
  _ignore: Any?
) : CanvasLayer(_ignore) {
  open var scrollBaseOffset: Vector2
    get() {
      val mb = getMethodBind("ParallaxBackground","get_scroll_base_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxBackground","set_scroll_base_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var scrollBaseScale: Vector2
    get() {
      val mb = getMethodBind("ParallaxBackground","get_scroll_base_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxBackground","set_scroll_base_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var scrollIgnoreCameraZoom: Boolean
    get() {
      val mb = getMethodBind("ParallaxBackground","is_ignore_camera_zoom")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxBackground","set_ignore_camera_zoom")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollLimitBegin: Vector2
    get() {
      val mb = getMethodBind("ParallaxBackground","get_limit_begin")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxBackground","set_limit_begin")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var scrollLimitEnd: Vector2
    get() {
      val mb = getMethodBind("ParallaxBackground","get_limit_end")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxBackground","set_limit_end")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var scrollOffset: Vector2
    get() {
      val mb = getMethodBind("ParallaxBackground","get_scroll_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ParallaxBackground","set_scroll_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ParallaxBackground", "ParallaxBackground")
        }

  }

  open fun scrollBaseOffset(schedule: Vector2.() -> Unit): Vector2 = scrollBaseOffset.apply{
      schedule(this)
      scrollBaseOffset = this
  }


  open fun scrollBaseScale(schedule: Vector2.() -> Unit): Vector2 = scrollBaseScale.apply{
      schedule(this)
      scrollBaseScale = this
  }


  open fun scrollLimitBegin(schedule: Vector2.() -> Unit): Vector2 = scrollLimitBegin.apply{
      schedule(this)
      scrollLimitBegin = this
  }


  open fun scrollLimitEnd(schedule: Vector2.() -> Unit): Vector2 = scrollLimitEnd.apply{
      schedule(this)
      scrollLimitEnd = this
  }


  open fun scrollOffset(schedule: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      schedule(this)
      scrollOffset = this
  }


  open fun _cameraMoved(arg0: Transform2D, arg1: Vector2) {
  }

  open fun getLimitBegin(): Vector2 {
    val mb = getMethodBind("ParallaxBackground","get_limit_begin")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getLimitEnd(): Vector2 {
    val mb = getMethodBind("ParallaxBackground","get_limit_end")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getScrollBaseOffset(): Vector2 {
    val mb = getMethodBind("ParallaxBackground","get_scroll_base_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getScrollBaseScale(): Vector2 {
    val mb = getMethodBind("ParallaxBackground","get_scroll_base_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getScrollOffset(): Vector2 {
    val mb = getMethodBind("ParallaxBackground","get_scroll_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun isIgnoreCameraZoom(): Boolean {
    val mb = getMethodBind("ParallaxBackground","is_ignore_camera_zoom")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setIgnoreCameraZoom(ignore: Boolean) {
    val mb = getMethodBind("ParallaxBackground","set_ignore_camera_zoom")
    _icall_Unit_Boolean( mb, this.ptr, ignore)
  }

  open fun setLimitBegin(ofs: Vector2) {
    val mb = getMethodBind("ParallaxBackground","set_limit_begin")
    _icall_Unit_Vector2( mb, this.ptr, ofs)
  }

  open fun setLimitEnd(ofs: Vector2) {
    val mb = getMethodBind("ParallaxBackground","set_limit_end")
    _icall_Unit_Vector2( mb, this.ptr, ofs)
  }

  open fun setScrollBaseOffset(ofs: Vector2) {
    val mb = getMethodBind("ParallaxBackground","set_scroll_base_offset")
    _icall_Unit_Vector2( mb, this.ptr, ofs)
  }

  open fun setScrollBaseScale(scale: Vector2) {
    val mb = getMethodBind("ParallaxBackground","set_scroll_base_scale")
    _icall_Unit_Vector2( mb, this.ptr, scale)
  }

  open fun setScrollOffset(ofs: Vector2) {
    val mb = getMethodBind("ParallaxBackground","set_scroll_offset")
    _icall_Unit_Vector2( mb, this.ptr, ofs)
  }
}
