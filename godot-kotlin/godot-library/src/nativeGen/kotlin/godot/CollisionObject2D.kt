package godot

import godot.core.RID
import godot.core.Signal0
import godot.core.Signal3
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Long_Object
import godot.icalls._icall_Object_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Shape2D_Long_Long
import godot.icalls._icall_Transform2D_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Transform2D
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class CollisionObject2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val inputEvent: Signal3<Node, InputEvent, Long> by signal("viewport", "event", "shape_idx")

  val mouseEntered: Signal0 by signal()

  val mouseExited: Signal0 by signal()

  open var inputPickable: Boolean
    get() {
      val mb = getMethodBind("CollisionObject2D","is_pickable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionObject2D","set_pickable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _input_event(
    viewport: Object,
    event: InputEvent,
    shapeIdx: Long
  ) {
  }

  open fun createShapeOwner(owner: Object): Long {
    val mb = getMethodBind("CollisionObject2D","create_shape_owner")
    return _icall_Long_Object( mb, this.ptr, owner)
  }

  open fun getRid(): RID {
    val mb = getMethodBind("CollisionObject2D","get_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getShapeOwnerOneWayCollisionMargin(ownerId: Long): Double {
    val mb = getMethodBind("CollisionObject2D","get_shape_owner_one_way_collision_margin")
    return _icall_Double_Long( mb, this.ptr, ownerId)
  }

  open fun getShapeOwners(): VariantArray {
    val mb = getMethodBind("CollisionObject2D","get_shape_owners")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun isPickable(): Boolean {
    val mb = getMethodBind("CollisionObject2D","is_pickable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    val mb = getMethodBind("CollisionObject2D","is_shape_owner_disabled")
    return _icall_Boolean_Long( mb, this.ptr, ownerId)
  }

  open fun isShapeOwnerOneWayCollisionEnabled(ownerId: Long): Boolean {
    val mb = getMethodBind("CollisionObject2D","is_shape_owner_one_way_collision_enabled")
    return _icall_Boolean_Long( mb, this.ptr, ownerId)
  }

  open fun removeShapeOwner(ownerId: Long) {
    val mb = getMethodBind("CollisionObject2D","remove_shape_owner")
    _icall_Unit_Long( mb, this.ptr, ownerId)
  }

  open fun setPickable(enabled: Boolean) {
    val mb = getMethodBind("CollisionObject2D","set_pickable")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun shapeFindOwner(shapeIndex: Long): Long {
    val mb = getMethodBind("CollisionObject2D","shape_find_owner")
    return _icall_Long_Long( mb, this.ptr, shapeIndex)
  }

  open fun shapeOwnerAddShape(ownerId: Long, shape: Shape2D) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_add_shape")
    _icall_Unit_Long_Object( mb, this.ptr, ownerId, shape)
  }

  open fun shapeOwnerClearShapes(ownerId: Long) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_clear_shapes")
    _icall_Unit_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerGetOwner(ownerId: Long): Object {
    val mb = getMethodBind("CollisionObject2D","shape_owner_get_owner")
    return _icall_Object_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape2D {
    val mb = getMethodBind("CollisionObject2D","shape_owner_get_shape")
    return _icall_Shape2D_Long_Long( mb, this.ptr, ownerId, shapeId)
  }

  open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    val mb = getMethodBind("CollisionObject2D","shape_owner_get_shape_count")
    return _icall_Long_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    val mb = getMethodBind("CollisionObject2D","shape_owner_get_shape_index")
    return _icall_Long_Long_Long( mb, this.ptr, ownerId, shapeId)
  }

  open fun shapeOwnerGetTransform(ownerId: Long): Transform2D {
    val mb = getMethodBind("CollisionObject2D","shape_owner_get_transform")
    return _icall_Transform2D_Long( mb, this.ptr, ownerId)
  }

  open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_remove_shape")
    _icall_Unit_Long_Long( mb, this.ptr, ownerId, shapeId)
  }

  open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_set_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, ownerId, disabled)
  }

  open fun shapeOwnerSetOneWayCollision(ownerId: Long, enable: Boolean) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_set_one_way_collision")
    _icall_Unit_Long_Boolean( mb, this.ptr, ownerId, enable)
  }

  open fun shapeOwnerSetOneWayCollisionMargin(ownerId: Long, margin: Double) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_set_one_way_collision_margin")
    _icall_Unit_Long_Double( mb, this.ptr, ownerId, margin)
  }

  open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform2D) {
    val mb = getMethodBind("CollisionObject2D","shape_owner_set_transform")
    _icall_Unit_Long_Transform2D( mb, this.ptr, ownerId, transform)
  }
}
