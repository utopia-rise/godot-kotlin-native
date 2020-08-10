// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean_Transform2D_Object_Transform2D
import godot.icalls._icall_Boolean_Transform2D_Vector2_Object_Transform2D_Vector2
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_VariantArray_Transform2D_Object_Transform2D
import godot.icalls._icall_VariantArray_Transform2D_Vector2_Object_Transform2D_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class Shape2D internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var customSolverBias: Double
    get() {
      val mb = getMethodBind("Shape2D","get_custom_solver_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Shape2D","set_custom_solver_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun collide(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): Boolean {
    val mb = getMethodBind("Shape2D","collide")
    return _icall_Boolean_Transform2D_Object_Transform2D( mb, this.ptr, localXform, withShape,
        shapeXform)
  }

  open fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): VariantArray {
    val mb = getMethodBind("Shape2D","collide_and_get_contacts")
    return _icall_VariantArray_Transform2D_Object_Transform2D( mb, this.ptr, localXform, withShape,
        shapeXform)
  }

  open fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): Boolean {
    val mb = getMethodBind("Shape2D","collide_with_motion")
    return _icall_Boolean_Transform2D_Vector2_Object_Transform2D_Vector2( mb, this.ptr, localXform,
        localMotion, withShape, shapeXform, shapeMotion)
  }

  open fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): VariantArray {
    val mb = getMethodBind("Shape2D","collide_with_motion_and_get_contacts")
    return _icall_VariantArray_Transform2D_Vector2_Object_Transform2D_Vector2( mb, this.ptr,
        localXform, localMotion, withShape, shapeXform, shapeMotion)
  }

  open fun getCustomSolverBias(): Double {
    val mb = getMethodBind("Shape2D","get_custom_solver_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun setCustomSolverBias(bias: Double) {
    val mb = getMethodBind("Shape2D","set_custom_solver_bias")
    _icall_Unit_Double( mb, this.ptr, bias)
  }
}
