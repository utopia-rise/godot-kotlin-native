package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Transform2D
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Transform2D_Object
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Double_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit

open class Node2D internal constructor(
  _ignore: Any?
) : CanvasItem(_ignore) {
  open var globalPosition: Vector2
    get() {
      val mb = getMethodBind("Node2D","get_global_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_global_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var globalRotation: Double
    get() {
      val mb = getMethodBind("Node2D","get_global_rotation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_global_rotation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var globalRotationDegrees: Double
    get() {
      val mb = getMethodBind("Node2D","get_global_rotation_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_global_rotation_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var globalScale: Vector2
    get() {
      val mb = getMethodBind("Node2D","get_global_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_global_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var globalTransform: Transform2D
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property globalTransform: has no getter")
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_global_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  open var position: Vector2
    get() {
      val mb = getMethodBind("Node2D","get_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var rotation: Double
    get() {
      val mb = getMethodBind("Node2D","get_rotation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_rotation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rotationDegrees: Double
    get() {
      val mb = getMethodBind("Node2D","get_rotation_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_rotation_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var scale: Vector2
    get() {
      val mb = getMethodBind("Node2D","get_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var skew: Double
    get() {
      val mb = getMethodBind("Node2D","get_skew")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_skew")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var skewDegrees: Double
    get() {
      val mb = getMethodBind("Node2D","get_skew_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_skew_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var transform: Transform2D
    get() {
      throw UninitializedPropertyAccessException("Cannot access property transform: has no getter")
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  open var zAsRelative: Boolean
    get() {
      val mb = getMethodBind("Node2D","is_z_relative")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_z_as_relative")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var zIndex: Long
    get() {
      val mb = getMethodBind("Node2D","get_z_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node2D","set_z_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Node2D", "Node2D")
        }

  }

  open fun globalPosition(schedule: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      schedule(this)
      globalPosition = this
  }


  open fun globalScale(schedule: Vector2.() -> Unit): Vector2 = globalScale.apply{
      schedule(this)
      globalScale = this
  }


  open fun globalTransform(schedule: Transform2D.() -> Unit): Transform2D = globalTransform.apply{
      schedule(this)
      globalTransform = this
  }


  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }


  open fun scale(schedule: Vector2.() -> Unit): Vector2 = scale.apply{
      schedule(this)
      scale = this
  }


  open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  open fun applyScale(ratio: Vector2) {
    val mb = getMethodBind("Node2D","apply_scale")
    _icall_Unit_Vector2( mb, this.ptr, ratio)
  }

  open fun getAngleTo(point: Vector2): Double {
    val mb = getMethodBind("Node2D","get_angle_to")
    return _icall_Double_Vector2( mb, this.ptr, point)
  }

  open fun getGlobalPosition(): Vector2 {
    val mb = getMethodBind("Node2D","get_global_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getGlobalRotation(): Double {
    val mb = getMethodBind("Node2D","get_global_rotation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlobalRotationDegrees(): Double {
    val mb = getMethodBind("Node2D","get_global_rotation_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlobalScale(): Vector2 {
    val mb = getMethodBind("Node2D","get_global_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getPosition(): Vector2 {
    val mb = getMethodBind("Node2D","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRelativeTransformToParent(parent: Node): Transform2D {
    val mb = getMethodBind("Node2D","get_relative_transform_to_parent")
    return _icall_Transform2D_Object( mb, this.ptr, parent)
  }

  open fun getRotation(): Double {
    val mb = getMethodBind("Node2D","get_rotation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRotationDegrees(): Double {
    val mb = getMethodBind("Node2D","get_rotation_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getScale(): Vector2 {
    val mb = getMethodBind("Node2D","get_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSkew(): Double {
    val mb = getMethodBind("Node2D","get_skew")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSkewDegrees(): Double {
    val mb = getMethodBind("Node2D","get_skew_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getZIndex(): Long {
    val mb = getMethodBind("Node2D","get_z_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun globalTranslate(offset: Vector2) {
    val mb = getMethodBind("Node2D","global_translate")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun isZRelative(): Boolean {
    val mb = getMethodBind("Node2D","is_z_relative")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun lookAt(point: Vector2) {
    val mb = getMethodBind("Node2D","look_at")
    _icall_Unit_Vector2( mb, this.ptr, point)
  }

  open fun moveLocalX(delta: Double, scaled: Boolean = false) {
    val mb = getMethodBind("Node2D","move_local_x")
    _icall_Unit_Double_Boolean( mb, this.ptr, delta, scaled)
  }

  open fun moveLocalY(delta: Double, scaled: Boolean = false) {
    val mb = getMethodBind("Node2D","move_local_y")
    _icall_Unit_Double_Boolean( mb, this.ptr, delta, scaled)
  }

  open fun rotate(radians: Double) {
    val mb = getMethodBind("Node2D","rotate")
    _icall_Unit_Double( mb, this.ptr, radians)
  }

  open fun setGlobalPosition(position: Vector2) {
    val mb = getMethodBind("Node2D","set_global_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun setGlobalRotation(radians: Double) {
    val mb = getMethodBind("Node2D","set_global_rotation")
    _icall_Unit_Double( mb, this.ptr, radians)
  }

  open fun setGlobalRotationDegrees(degrees: Double) {
    val mb = getMethodBind("Node2D","set_global_rotation_degrees")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setGlobalScale(scale: Vector2) {
    val mb = getMethodBind("Node2D","set_global_scale")
    _icall_Unit_Vector2( mb, this.ptr, scale)
  }

  open fun setGlobalTransform(xform: Transform2D) {
    val mb = getMethodBind("Node2D","set_global_transform")
    _icall_Unit_Transform2D( mb, this.ptr, xform)
  }

  open fun setPosition(position: Vector2) {
    val mb = getMethodBind("Node2D","set_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun setRotation(radians: Double) {
    val mb = getMethodBind("Node2D","set_rotation")
    _icall_Unit_Double( mb, this.ptr, radians)
  }

  open fun setRotationDegrees(degrees: Double) {
    val mb = getMethodBind("Node2D","set_rotation_degrees")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setScale(scale: Vector2) {
    val mb = getMethodBind("Node2D","set_scale")
    _icall_Unit_Vector2( mb, this.ptr, scale)
  }

  open fun setSkew(radians: Double) {
    val mb = getMethodBind("Node2D","set_skew")
    _icall_Unit_Double( mb, this.ptr, radians)
  }

  open fun setSkewDegrees(degrees: Double) {
    val mb = getMethodBind("Node2D","set_skew_degrees")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setTransform(xform: Transform2D) {
    val mb = getMethodBind("Node2D","set_transform")
    _icall_Unit_Transform2D( mb, this.ptr, xform)
  }

  open fun setZAsRelative(enable: Boolean) {
    val mb = getMethodBind("Node2D","set_z_as_relative")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setZIndex(zIndex: Long) {
    val mb = getMethodBind("Node2D","set_z_index")
    _icall_Unit_Long( mb, this.ptr, zIndex)
  }

  open fun toGlobal(localPoint: Vector2): Vector2 {
    val mb = getMethodBind("Node2D","to_global")
    return _icall_Vector2_Vector2( mb, this.ptr, localPoint)
  }

  open fun toLocal(globalPoint: Vector2): Vector2 {
    val mb = getMethodBind("Node2D","to_local")
    return _icall_Vector2_Vector2( mb, this.ptr, globalPoint)
  }

  open fun translate(offset: Vector2) {
    val mb = getMethodBind("Node2D","translate")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  companion object
}
