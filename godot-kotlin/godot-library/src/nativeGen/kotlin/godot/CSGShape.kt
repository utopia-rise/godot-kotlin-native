package godot

import godot.CSGShape
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class CSGShape internal constructor(
  _ignore: Any?
) : GeometryInstance(_ignore) {
  open var calculateTangents: Boolean
    get() {
      val mb = getMethodBind("CSGShape","is_calculating_tangents")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGShape","set_calculate_tangents")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("CSGShape","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGShape","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("CSGShape","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGShape","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var operation: Long
    get() {
      val mb = getMethodBind("CSGShape","get_operation")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGShape","set_operation")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var snap: Double
    get() {
      val mb = getMethodBind("CSGShape","get_snap")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGShape","set_snap")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var useCollision: Boolean
    get() {
      val mb = getMethodBind("CSGShape","is_using_collision")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGShape","set_use_collision")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _update_shape() {
  }

  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("CSGShape","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    val mb = getMethodBind("CSGShape","get_collision_layer_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("CSGShape","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("CSGShape","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getMeshes(): VariantArray {
    val mb = getMethodBind("CSGShape","get_meshes")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getOperation(): CSGShape.Operation {
    val mb = getMethodBind("CSGShape","get_operation")
    return CSGShape.Operation.from( _icall_Long( mb, this.ptr))
  }

  open fun getSnap(): Double {
    val mb = getMethodBind("CSGShape","get_snap")
    return _icall_Double( mb, this.ptr)
  }

  open fun isCalculatingTangents(): Boolean {
    val mb = getMethodBind("CSGShape","is_calculating_tangents")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRootShape(): Boolean {
    val mb = getMethodBind("CSGShape","is_root_shape")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingCollision(): Boolean {
    val mb = getMethodBind("CSGShape","is_using_collision")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCalculateTangents(enabled: Boolean) {
    val mb = getMethodBind("CSGShape","set_calculate_tangents")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setCollisionLayer(layer: Long) {
    val mb = getMethodBind("CSGShape","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("CSGShape","set_collision_layer_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("CSGShape","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("CSGShape","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setOperation(operation: Long) {
    val mb = getMethodBind("CSGShape","set_operation")
    _icall_Unit_Long( mb, this.ptr, operation)
  }

  open fun setSnap(snap: Double) {
    val mb = getMethodBind("CSGShape","set_snap")
    _icall_Unit_Double( mb, this.ptr, snap)
  }

  open fun setUseCollision(operation: Boolean) {
    val mb = getMethodBind("CSGShape","set_use_collision")
    _icall_Unit_Boolean( mb, this.ptr, operation)
  }

  enum class Operation(
    id: Long
  ) {
    OPERATION_UNION(0),

    OPERATION_INTERSECTION(1),

    OPERATION_SUBTRACTION(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val OPERATION_INTERSECTION: Long = 1

    final const val OPERATION_SUBTRACTION: Long = 2

    final const val OPERATION_UNION: Long = 0
  }
}
