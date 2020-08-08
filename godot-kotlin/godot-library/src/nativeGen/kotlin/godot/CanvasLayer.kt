package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Transform2D
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Node
import godot.icalls._icall_RID
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class CanvasLayer internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  open var customViewport: Node
    get() {
      val mb = getMethodBind("CanvasLayer","get_custom_viewport")
      return _icall_Node(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_custom_viewport")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var followViewportEnable: Boolean
    get() {
      val mb = getMethodBind("CanvasLayer","is_following_viewport")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_follow_viewport")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var followViewportScale: Double
    get() {
      val mb = getMethodBind("CanvasLayer","get_follow_viewport_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_follow_viewport_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var layer: Long
    get() {
      val mb = getMethodBind("CanvasLayer","get_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("CanvasLayer","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var rotation: Double
    get() {
      val mb = getMethodBind("CanvasLayer","get_rotation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_rotation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rotationDegrees: Double
    get() {
      val mb = getMethodBind("CanvasLayer","get_rotation_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_rotation_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var scale: Vector2
    get() {
      val mb = getMethodBind("CanvasLayer","get_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var transform: Transform2D
    get() {
      val mb = getMethodBind("CanvasLayer","get_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasLayer","set_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CanvasLayer", "CanvasLayer")
        }

  }

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun scale(schedule: Vector2.() -> Unit): Vector2 = scale.apply{
      schedule(this)
      scale = this
  }


  open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  open fun getCanvas(): RID {
    val mb = getMethodBind("CanvasLayer","get_canvas")
    return _icall_RID( mb, this.ptr)
  }

  open fun getCustomViewport(): Node {
    val mb = getMethodBind("CanvasLayer","get_custom_viewport")
    return _icall_Node( mb, this.ptr)
  }

  open fun getFollowViewportScale(): Double {
    val mb = getMethodBind("CanvasLayer","get_follow_viewport_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLayer(): Long {
    val mb = getMethodBind("CanvasLayer","get_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("CanvasLayer","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRotation(): Double {
    val mb = getMethodBind("CanvasLayer","get_rotation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRotationDegrees(): Double {
    val mb = getMethodBind("CanvasLayer","get_rotation_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getScale(): Vector2 {
    val mb = getMethodBind("CanvasLayer","get_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTransform(): Transform2D {
    val mb = getMethodBind("CanvasLayer","get_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun isFollowingViewport(): Boolean {
    val mb = getMethodBind("CanvasLayer","is_following_viewport")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCustomViewport(viewport: Node) {
    val mb = getMethodBind("CanvasLayer","set_custom_viewport")
    _icall_Unit_Object( mb, this.ptr, viewport)
  }

  open fun setFollowViewport(enable: Boolean) {
    val mb = getMethodBind("CanvasLayer","set_follow_viewport")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFollowViewportScale(scale: Double) {
    val mb = getMethodBind("CanvasLayer","set_follow_viewport_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setLayer(layer: Long) {
    val mb = getMethodBind("CanvasLayer","set_layer")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("CanvasLayer","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setRotation(radians: Double) {
    val mb = getMethodBind("CanvasLayer","set_rotation")
    _icall_Unit_Double( mb, this.ptr, radians)
  }

  open fun setRotationDegrees(degrees: Double) {
    val mb = getMethodBind("CanvasLayer","set_rotation_degrees")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setScale(scale: Vector2) {
    val mb = getMethodBind("CanvasLayer","set_scale")
    _icall_Unit_Vector2( mb, this.ptr, scale)
  }

  open fun setTransform(transform: Transform2D) {
    val mb = getMethodBind("CanvasLayer","set_transform")
    _icall_Unit_Transform2D( mb, this.ptr, transform)
  }

  companion object
}
