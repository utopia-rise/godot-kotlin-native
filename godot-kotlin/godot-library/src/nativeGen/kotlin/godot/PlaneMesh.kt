package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.Unit

open class PlaneMesh internal constructor(
  _ignore: Any?
) : PrimitiveMesh(_ignore) {
  open var size: Vector2
    get() {
      val mb = getMethodBind("PlaneMesh","get_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PlaneMesh","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var subdivideDepth: Long
    get() {
      val mb = getMethodBind("PlaneMesh","get_subdivide_depth")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PlaneMesh","set_subdivide_depth")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var subdivideWidth: Long
    get() {
      val mb = getMethodBind("PlaneMesh","get_subdivide_width")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PlaneMesh","set_subdivide_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PlaneMesh", "PlaneMesh")
        }

  }

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun getSize(): Vector2 {
    val mb = getMethodBind("PlaneMesh","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSubdivideDepth(): Long {
    val mb = getMethodBind("PlaneMesh","get_subdivide_depth")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSubdivideWidth(): Long {
    val mb = getMethodBind("PlaneMesh","get_subdivide_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("PlaneMesh","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setSubdivideDepth(subdivide: Long) {
    val mb = getMethodBind("PlaneMesh","set_subdivide_depth")
    _icall_Unit_Long( mb, this.ptr, subdivide)
  }

  open fun setSubdivideWidth(subdivide: Long) {
    val mb = getMethodBind("PlaneMesh","set_subdivide_width")
    _icall_Unit_Long( mb, this.ptr, subdivide)
  }
}
