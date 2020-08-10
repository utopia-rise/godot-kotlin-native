package godot

import godot.core.VariantArray
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError

open class PhysicsBody internal constructor(
  _ignore: Any?
) : CollisionObject(_ignore) {
  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("PhysicsBody","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsBody","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("PhysicsBody","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsBody","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _get_layers(): Long {
    throw NotImplementedError("_get_layers is not implemented for PhysicsBody")
  }

  open fun _set_layers(mask: Long) {
  }

  open fun addCollisionExceptionWith(body: Node) {
    val mb = getMethodBind("PhysicsBody","add_collision_exception_with")
    _icall_Unit_Object( mb, this.ptr, body)
  }

  open fun getCollisionExceptions(): VariantArray {
    val mb = getMethodBind("PhysicsBody","get_collision_exceptions")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("PhysicsBody","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    val mb = getMethodBind("PhysicsBody","get_collision_layer_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("PhysicsBody","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("PhysicsBody","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun removeCollisionExceptionWith(body: Node) {
    val mb = getMethodBind("PhysicsBody","remove_collision_exception_with")
    _icall_Unit_Object( mb, this.ptr, body)
  }

  open fun setCollisionLayer(layer: Long) {
    val mb = getMethodBind("PhysicsBody","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("PhysicsBody","set_collision_layer_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("PhysicsBody","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("PhysicsBody","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }
}
