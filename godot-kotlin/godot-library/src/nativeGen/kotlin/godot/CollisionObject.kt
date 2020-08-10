// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.RID
import godot.core.Signal0
import godot.core.Signal5
import godot.core.Transform
import godot.core.VariantArray
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Long_Object
import godot.icalls._icall_Object_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Shape_Long_Long
import godot.icalls._icall_Transform_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Transform
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class CollisionObject internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  val inputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Long> by signal("camera", "event",
      "click_position", "click_normal", "shape_idx")

  val mouseEntered: Signal0 by signal()

  val mouseExited: Signal0 by signal()

  open var inputCaptureOnDrag: Boolean
    get() {
      val mb = getMethodBind("CollisionObject","get_capture_input_on_drag")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionObject","set_capture_input_on_drag")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var inputRayPickable: Boolean
    get() {
      val mb = getMethodBind("CollisionObject","is_ray_pickable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionObject","set_ray_pickable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _input_event(
    camera: Object,
    event: InputEvent,
    clickPosition: Vector3,
    clickNormal: Vector3,
    shapeIdx: Long
  ) {
  }

  open fun createShapeOwner(owner: Object): Long {
    val mb = getMethodBind("CollisionObject","create_shape_owner")
    return _icall_Long_Object( mb, this.ptr, owner)
  }

  open fun getCaptureInputOnDrag(): Boolean {
    val mb = getMethodBind("CollisionObject","get_capture_input_on_drag")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getRid(): RID {
    val mb = getMethodBind("CollisionObject","get_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getShapeOwners(): VariantArray {
    val mb = getMethodBind("CollisionObject","get_shape_owners")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun isRayPickable(): Boolean {
    val mb = getMethodBind("CollisionObject","is_ray_pickable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    val mb = getMethodBind("CollisionObject","is_shape_owner_disabled")
    return _icall_Boolean_Long( mb, this.ptr, ownerId)
  }

  open fun removeShapeOwner(ownerId: Long) {
    val mb = getMethodBind("CollisionObject","remove_shape_owner")
    _icall_Unit_Long( mb, this.ptr, ownerId)
  }

  open fun setCaptureInputOnDrag(enable: Boolean) {
    val mb = getMethodBind("CollisionObject","set_capture_input_on_drag")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setRayPickable(rayPickable: Boolean) {
    val mb = getMethodBind("CollisionObject","set_ray_pickable")
    _icall_Unit_Boolean( mb, this.ptr, rayPickable)
  }

  open fun shapeFindOwner(shapeIndex: Long): Long {
    val mb = getMethodBind("CollisionObject","shape_find_owner")
    return _icall_Long_Long( mb, this.ptr, shapeIndex)
  }

  open fun shapeOwnerAddShape(ownerId: Long, shape: Shape) {
    val mb = getMethodBind("CollisionObject","shape_owner_add_shape")
    _icall_Unit_Long_Object( mb, this.ptr, ownerId, shape)
  }

  open fun shapeOwnerClearShapes(ownerId: Long) {
    val mb = getMethodBind("CollisionObject","shape_owner_clear_shapes")
    _icall_Unit_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerGetOwner(ownerId: Long): Object {
    val mb = getMethodBind("CollisionObject","shape_owner_get_owner")
    return _icall_Object_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape {
    val mb = getMethodBind("CollisionObject","shape_owner_get_shape")
    return _icall_Shape_Long_Long( mb, this.ptr, ownerId, shapeId)
  }

  open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    val mb = getMethodBind("CollisionObject","shape_owner_get_shape_count")
    return _icall_Long_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    val mb = getMethodBind("CollisionObject","shape_owner_get_shape_index")
    return _icall_Long_Long_Long( mb, this.ptr, ownerId, shapeId)
  }

  open fun shapeOwnerGetTransform(ownerId: Long): Transform {
    val mb = getMethodBind("CollisionObject","shape_owner_get_transform")
    return _icall_Transform_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
    val mb = getMethodBind("CollisionObject","shape_owner_remove_shape")
    _icall_Unit_Long_Long( mb, this.ptr, ownerId, shapeId)
  }

  open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    val mb = getMethodBind("CollisionObject","shape_owner_set_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, ownerId, disabled)
  }

  open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform) {
    val mb = getMethodBind("CollisionObject","shape_owner_set_transform")
    _icall_Unit_Long_Transform( mb, this.ptr, ownerId, transform)
  }
}
