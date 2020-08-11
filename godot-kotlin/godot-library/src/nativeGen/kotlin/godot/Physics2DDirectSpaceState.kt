// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Dictionary_Object
import godot.icalls._icall_Dictionary_Vector2_Vector2_VariantArray_Long_Boolean_Boolean
import godot.icalls._icall_VariantArray_Object
import godot.icalls._icall_VariantArray_Object_Long
import godot.icalls._icall_VariantArray_Vector2_Long_Long_VariantArray_Long_Boolean_Boolean
import godot.icalls._icall_VariantArray_Vector2_Long_VariantArray_Long_Boolean_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class Physics2DDirectSpaceState internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  internal constructor() : this(null)

  open fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray {
    val mb = getMethodBind("Physics2DDirectSpaceState","cast_motion")
    return _icall_VariantArray_Object( mb, this.ptr, shape)
  }

  open fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32): VariantArray {
    val mb = getMethodBind("Physics2DDirectSpaceState","collide_shape")
    return _icall_VariantArray_Object_Long( mb, this.ptr, shape, maxResults)
  }

  open fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary {
    val mb = getMethodBind("Physics2DDirectSpaceState","get_rest_info")
    return _icall_Dictionary_Object( mb, this.ptr, shape)
  }

  open fun intersectPoint(
    point: Vector2,
    maxResults: Long = 32,
    exclude: VariantArray = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray {
    val mb = getMethodBind("Physics2DDirectSpaceState","intersect_point")
    return _icall_VariantArray_Vector2_Long_VariantArray_Long_Boolean_Boolean( mb, this.ptr, point,
        maxResults, exclude, collisionLayer, collideWithBodies, collideWithAreas)
  }

  open fun intersectPointOnCanvas(
    point: Vector2,
    canvasInstanceId: Long,
    maxResults: Long = 32,
    exclude: VariantArray = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): VariantArray {
    val mb = getMethodBind("Physics2DDirectSpaceState","intersect_point_on_canvas")
    return _icall_VariantArray_Vector2_Long_Long_VariantArray_Long_Boolean_Boolean( mb, this.ptr,
        point, canvasInstanceId, maxResults, exclude, collisionLayer, collideWithBodies,
        collideWithAreas)
  }

  open fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray = VariantArray(),
    collisionLayer: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary {
    val mb = getMethodBind("Physics2DDirectSpaceState","intersect_ray")
    return _icall_Dictionary_Vector2_Vector2_VariantArray_Long_Boolean_Boolean( mb, this.ptr, from,
        to, exclude, collisionLayer, collideWithBodies, collideWithAreas)
  }

  open fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32):
      VariantArray {
    val mb = getMethodBind("Physics2DDirectSpaceState","intersect_shape")
    return _icall_VariantArray_Object_Long( mb, this.ptr, shape, maxResults)
  }
}
