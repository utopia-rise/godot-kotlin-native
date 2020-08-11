// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Transform
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_Transform
import godot.icalls._icall_Unit_VariantArray
import godot.icalls._icall_VariantArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class PhysicsShapeQueryParameters internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var collideWithAreas: Boolean
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","is_collide_with_areas_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_collide_with_areas")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collideWithBodies: Boolean
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","is_collide_with_bodies_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_collide_with_bodies")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var exclude: VariantArray
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","get_exclude")
      return _icall_VariantArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_exclude")
      _icall_Unit_VariantArray(mb, this.ptr, value)
    }

  open var margin: Double
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","get_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var shapeRid: RID
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","get_shape_rid")
      return _icall_RID(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_shape_rid")
      _icall_Unit_RID(mb, this.ptr, value)
    }

  open var transform: Transform
    get() {
      val mb = getMethodBind("PhysicsShapeQueryParameters","get_transform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsShapeQueryParameters","set_transform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PhysicsShapeQueryParameters", "PhysicsShapeQueryParameters")
        }

  }

  open fun transform(schedule: Transform.() -> Unit): Transform = transform.apply{
      schedule(this)
      transform = this
  }


  open fun getCollisionMask(): Long {
    val mb = getMethodBind("PhysicsShapeQueryParameters","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getExclude(): VariantArray {
    val mb = getMethodBind("PhysicsShapeQueryParameters","get_exclude")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getMargin(): Double {
    val mb = getMethodBind("PhysicsShapeQueryParameters","get_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getShapeRid(): RID {
    val mb = getMethodBind("PhysicsShapeQueryParameters","get_shape_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getTransform(): Transform {
    val mb = getMethodBind("PhysicsShapeQueryParameters","get_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun isCollideWithAreasEnabled(): Boolean {
    val mb = getMethodBind("PhysicsShapeQueryParameters","is_collide_with_areas_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCollideWithBodiesEnabled(): Boolean {
    val mb = getMethodBind("PhysicsShapeQueryParameters","is_collide_with_bodies_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCollideWithAreas(enable: Boolean) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_collide_with_areas")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollideWithBodies(enable: Boolean) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_collide_with_bodies")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollisionMask(collisionMask: Long) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, collisionMask)
  }

  open fun setExclude(exclude: VariantArray) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_exclude")
    _icall_Unit_VariantArray( mb, this.ptr, exclude)
  }

  open fun setMargin(margin: Double) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setShape(shape: Resource) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_shape")
    _icall_Unit_Object( mb, this.ptr, shape)
  }

  open fun setShapeRid(shape: RID) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_shape_rid")
    _icall_Unit_RID( mb, this.ptr, shape)
  }

  open fun setTransform(transform: Transform) {
    val mb = getMethodBind("PhysicsShapeQueryParameters","set_transform")
    _icall_Unit_Transform( mb, this.ptr, transform)
  }
}
