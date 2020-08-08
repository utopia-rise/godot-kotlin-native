package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.icalls._icall_Boolean_RID
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Shape
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_RID
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class SpringArm internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var collisionMask: Long
    get() {
      val mb = getMethodBind("SpringArm","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpringArm","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var margin: Double
    get() {
      val mb = getMethodBind("SpringArm","get_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpringArm","set_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var shape: Shape
    get() {
      val mb = getMethodBind("SpringArm","get_shape")
      return _icall_Shape(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpringArm","set_shape")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var springLength: Double
    get() {
      val mb = getMethodBind("SpringArm","get_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpringArm","set_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SpringArm", "SpringArm")
        }

  }

  open fun addExcludedObject(RID: RID) {
    val mb = getMethodBind("SpringArm","add_excluded_object")
    _icall_Unit_RID( mb, this.ptr, RID)
  }

  open fun clearExcludedObjects() {
    val mb = getMethodBind("SpringArm","clear_excluded_objects")
    _icall_Unit( mb, this.ptr)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("SpringArm","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getHitLength(): Double {
    val mb = getMethodBind("SpringArm","get_hit_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLength(): Double {
    val mb = getMethodBind("SpringArm","get_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMargin(): Double {
    val mb = getMethodBind("SpringArm","get_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getShape(): Shape {
    val mb = getMethodBind("SpringArm","get_shape")
    return _icall_Shape( mb, this.ptr)
  }

  open fun removeExcludedObject(RID: RID): Boolean {
    val mb = getMethodBind("SpringArm","remove_excluded_object")
    return _icall_Boolean_RID( mb, this.ptr, RID)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("SpringArm","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setLength(length: Double) {
    val mb = getMethodBind("SpringArm","set_length")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setMargin(margin: Double) {
    val mb = getMethodBind("SpringArm","set_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setShape(shape: Shape) {
    val mb = getMethodBind("SpringArm","set_shape")
    _icall_Unit_Object( mb, this.ptr, shape)
  }

  companion object
}
