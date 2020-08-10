// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Shape2D
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class CollisionShape2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var disabled: Boolean
    get() {
      val mb = getMethodBind("CollisionShape2D","is_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionShape2D","set_disabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var oneWayCollision: Boolean
    get() {
      val mb = getMethodBind("CollisionShape2D","is_one_way_collision_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionShape2D","set_one_way_collision")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var oneWayCollisionMargin: Double
    get() {
      val mb = getMethodBind("CollisionShape2D","get_one_way_collision_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionShape2D","set_one_way_collision_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var shape: Shape2D
    get() {
      val mb = getMethodBind("CollisionShape2D","get_shape")
      return _icall_Shape2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionShape2D","set_shape")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CollisionShape2D", "CollisionShape2D")
        }

  }

  open fun _shape_changed() {
  }

  open fun getOneWayCollisionMargin(): Double {
    val mb = getMethodBind("CollisionShape2D","get_one_way_collision_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getShape(): Shape2D {
    val mb = getMethodBind("CollisionShape2D","get_shape")
    return _icall_Shape2D( mb, this.ptr)
  }

  open fun isDisabled(): Boolean {
    val mb = getMethodBind("CollisionShape2D","is_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOneWayCollisionEnabled(): Boolean {
    val mb = getMethodBind("CollisionShape2D","is_one_way_collision_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDisabled(disabled: Boolean) {
    val mb = getMethodBind("CollisionShape2D","set_disabled")
    _icall_Unit_Boolean( mb, this.ptr, disabled)
  }

  open fun setOneWayCollision(enabled: Boolean) {
    val mb = getMethodBind("CollisionShape2D","set_one_way_collision")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setOneWayCollisionMargin(margin: Double) {
    val mb = getMethodBind("CollisionShape2D","set_one_way_collision_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setShape(shape: Shape2D) {
    val mb = getMethodBind("CollisionShape2D","set_shape")
    _icall_Unit_Object( mb, this.ptr, shape)
  }
}
