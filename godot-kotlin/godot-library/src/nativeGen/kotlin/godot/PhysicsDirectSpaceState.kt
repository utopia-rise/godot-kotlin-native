package godot

import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.Vector3
import godot.icalls._icall_Dictionary_Object
import godot.icalls._icall_Dictionary_Vector3_Vector3_VariantArray_Long_Boolean_Boolean
import godot.icalls._icall_VariantArray_Object_Long
import godot.icalls._icall_VariantArray_Object_Vector3
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class PhysicsDirectSpaceState internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  internal constructor() : this(null)

  open fun castMotion(shape: PhysicsShapeQueryParameters, motion: Vector3): VariantArray {
    val mb = getMethodBind("PhysicsDirectSpaceState","cast_motion")
    return _icall_VariantArray_Object_Vector3( mb, this.ptr, shape, motion)
  }

  open fun collideShape(shape: PhysicsShapeQueryParameters, maxResults: Long = 32): VariantArray {
    val mb = getMethodBind("PhysicsDirectSpaceState","collide_shape")
    return _icall_VariantArray_Object_Long( mb, this.ptr, shape, maxResults)
  }

  open fun getRestInfo(shape: PhysicsShapeQueryParameters): Dictionary {
    val mb = getMethodBind("PhysicsDirectSpaceState","get_rest_info")
    return _icall_Dictionary_Object( mb, this.ptr, shape)
  }

  open fun intersectRay(
    from: Vector3,
    to: Vector3,
    exclude: VariantArray = VariantArray(),
    collisionMask: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary {
    val mb = getMethodBind("PhysicsDirectSpaceState","intersect_ray")
    return _icall_Dictionary_Vector3_Vector3_VariantArray_Long_Boolean_Boolean( mb, this.ptr, from,
        to, exclude, collisionMask, collideWithBodies, collideWithAreas)
  }

  open fun intersectShape(shape: PhysicsShapeQueryParameters, maxResults: Long = 32): VariantArray {
    val mb = getMethodBind("PhysicsDirectSpaceState","intersect_shape")
    return _icall_VariantArray_Object_Long( mb, this.ptr, shape, maxResults)
  }

  companion object
}
