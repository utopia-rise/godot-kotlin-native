package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_VariantArray
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Physics2DShapeQueryParameters internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var collideWithAreas: Boolean
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","is_collide_with_areas_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_collide_with_areas")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collideWithBodies: Boolean
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","is_collide_with_bodies_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_collide_with_bodies")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var exclude: VariantArray
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","get_exclude")
      return _icall_VariantArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_exclude")
      _icall_Unit_VariantArray(mb, this.ptr, value)
    }

  open var margin: Double
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","get_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var motion: Vector2
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","get_motion")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_motion")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var shapeRid: RID
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","get_shape_rid")
      return _icall_RID(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_shape_rid")
      _icall_Unit_RID(mb, this.ptr, value)
    }

  open var transform: Transform2D
    get() {
      val mb = getMethodBind("Physics2DShapeQueryParameters","get_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DShapeQueryParameters","set_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Physics2DShapeQueryParameters",
            "Physics2DShapeQueryParameters")
        }

  }

  open fun motion(schedule: Vector2.() -> Unit): Vector2 = motion.apply{
      schedule(this)
      motion = this
  }


  open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("Physics2DShapeQueryParameters","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getExclude(): VariantArray {
    val mb = getMethodBind("Physics2DShapeQueryParameters","get_exclude")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getMargin(): Double {
    val mb = getMethodBind("Physics2DShapeQueryParameters","get_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMotion(): Vector2 {
    val mb = getMethodBind("Physics2DShapeQueryParameters","get_motion")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getShapeRid(): RID {
    val mb = getMethodBind("Physics2DShapeQueryParameters","get_shape_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getTransform(): Transform2D {
    val mb = getMethodBind("Physics2DShapeQueryParameters","get_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun isCollideWithAreasEnabled(): Boolean {
    val mb = getMethodBind("Physics2DShapeQueryParameters","is_collide_with_areas_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCollideWithBodiesEnabled(): Boolean {
    val mb = getMethodBind("Physics2DShapeQueryParameters","is_collide_with_bodies_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCollideWithAreas(enable: Boolean) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_collide_with_areas")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollideWithBodies(enable: Boolean) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_collide_with_bodies")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollisionLayer(collisionLayer: Long) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, collisionLayer)
  }

  open fun setExclude(exclude: VariantArray) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_exclude")
    _icall_Unit_VariantArray( mb, this.ptr, exclude)
  }

  open fun setMargin(margin: Double) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setMotion(motion: Vector2) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_motion")
    _icall_Unit_Vector2( mb, this.ptr, motion)
  }

  open fun setShape(shape: Resource) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_shape")
    _icall_Unit_Object( mb, this.ptr, shape)
  }

  open fun setShapeRid(shape: RID) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_shape_rid")
    _icall_Unit_RID( mb, this.ptr, shape)
  }

  open fun setTransform(transform: Transform2D) {
    val mb = getMethodBind("Physics2DShapeQueryParameters","set_transform")
    _icall_Unit_Transform2D( mb, this.ptr, transform)
  }
}
