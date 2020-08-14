// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector3
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class CubeMesh : PrimitiveMesh() {
  open var size: Vector3
    get() {
      val mb = getMethodBind("CubeMesh","get_size")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CubeMesh","set_size")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var subdivideDepth: Long
    get() {
      val mb = getMethodBind("CubeMesh","get_subdivide_depth")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CubeMesh","set_subdivide_depth")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var subdivideHeight: Long
    get() {
      val mb = getMethodBind("CubeMesh","get_subdivide_height")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CubeMesh","set_subdivide_height")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var subdivideWidth: Long
    get() {
      val mb = getMethodBind("CubeMesh","get_subdivide_width")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CubeMesh","set_subdivide_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CubeMesh", "CubeMesh")

  open fun size(schedule: Vector3.() -> Unit): Vector3 = size.apply{
      schedule(this)
      size = this
  }


  open fun getSize(): Vector3 {
    val mb = getMethodBind("CubeMesh","get_size")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getSubdivideDepth(): Long {
    val mb = getMethodBind("CubeMesh","get_subdivide_depth")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSubdivideHeight(): Long {
    val mb = getMethodBind("CubeMesh","get_subdivide_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSubdivideWidth(): Long {
    val mb = getMethodBind("CubeMesh","get_subdivide_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun setSize(size: Vector3) {
    val mb = getMethodBind("CubeMesh","set_size")
    _icall_Unit_Vector3( mb, this.ptr, size)
  }

  open fun setSubdivideDepth(divisions: Long) {
    val mb = getMethodBind("CubeMesh","set_subdivide_depth")
    _icall_Unit_Long( mb, this.ptr, divisions)
  }

  open fun setSubdivideHeight(divisions: Long) {
    val mb = getMethodBind("CubeMesh","set_subdivide_height")
    _icall_Unit_Long( mb, this.ptr, divisions)
  }

  open fun setSubdivideWidth(subdivide: Long) {
    val mb = getMethodBind("CubeMesh","set_subdivide_width")
    _icall_Unit_Long( mb, this.ptr, subdivide)
  }
}
