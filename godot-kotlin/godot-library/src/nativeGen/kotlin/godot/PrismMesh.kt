package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class PrismMesh internal constructor(
  _ignore: Any?
) : PrimitiveMesh(_ignore) {
  open var leftToRight: Double
    get() {
      val mb = getMethodBind("PrismMesh","get_left_to_right")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrismMesh","set_left_to_right")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var size: Vector3
    get() {
      val mb = getMethodBind("PrismMesh","get_size")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrismMesh","set_size")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var subdivideDepth: Long
    get() {
      val mb = getMethodBind("PrismMesh","get_subdivide_depth")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrismMesh","set_subdivide_depth")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var subdivideHeight: Long
    get() {
      val mb = getMethodBind("PrismMesh","get_subdivide_height")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrismMesh","set_subdivide_height")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var subdivideWidth: Long
    get() {
      val mb = getMethodBind("PrismMesh","get_subdivide_width")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrismMesh","set_subdivide_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PrismMesh", "PrismMesh")
        }

  }

  open fun size(schedule: Vector3.() -> Unit): Vector3 = size.apply{
      schedule(this)
      size = this
  }


  open fun getLeftToRight(): Double {
    val mb = getMethodBind("PrismMesh","get_left_to_right")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSize(): Vector3 {
    val mb = getMethodBind("PrismMesh","get_size")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getSubdivideDepth(): Long {
    val mb = getMethodBind("PrismMesh","get_subdivide_depth")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSubdivideHeight(): Long {
    val mb = getMethodBind("PrismMesh","get_subdivide_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSubdivideWidth(): Long {
    val mb = getMethodBind("PrismMesh","get_subdivide_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun setLeftToRight(leftToRight: Double) {
    val mb = getMethodBind("PrismMesh","set_left_to_right")
    _icall_Unit_Double( mb, this.ptr, leftToRight)
  }

  open fun setSize(size: Vector3) {
    val mb = getMethodBind("PrismMesh","set_size")
    _icall_Unit_Vector3( mb, this.ptr, size)
  }

  open fun setSubdivideDepth(segments: Long) {
    val mb = getMethodBind("PrismMesh","set_subdivide_depth")
    _icall_Unit_Long( mb, this.ptr, segments)
  }

  open fun setSubdivideHeight(segments: Long) {
    val mb = getMethodBind("PrismMesh","set_subdivide_height")
    _icall_Unit_Long( mb, this.ptr, segments)
  }

  open fun setSubdivideWidth(segments: Long) {
    val mb = getMethodBind("PrismMesh","set_subdivide_width")
    _icall_Unit_Long( mb, this.ptr, segments)
  }

  companion object
}
