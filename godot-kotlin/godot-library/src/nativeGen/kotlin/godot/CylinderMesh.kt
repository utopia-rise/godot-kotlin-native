// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class CylinderMesh : PrimitiveMesh() {
  open var bottomRadius: Double
    get() {
      val mb = getMethodBind("CylinderMesh","get_bottom_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CylinderMesh","set_bottom_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var height: Double
    get() {
      val mb = getMethodBind("CylinderMesh","get_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CylinderMesh","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var radialSegments: Long
    get() {
      val mb = getMethodBind("CylinderMesh","get_radial_segments")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CylinderMesh","set_radial_segments")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rings: Long
    get() {
      val mb = getMethodBind("CylinderMesh","get_rings")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CylinderMesh","set_rings")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var topRadius: Double
    get() {
      val mb = getMethodBind("CylinderMesh","get_top_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CylinderMesh","set_top_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CylinderMesh", "CylinderMesh")

  open fun getBottomRadius(): Double {
    val mb = getMethodBind("CylinderMesh","get_bottom_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getHeight(): Double {
    val mb = getMethodBind("CylinderMesh","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRadialSegments(): Long {
    val mb = getMethodBind("CylinderMesh","get_radial_segments")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRings(): Long {
    val mb = getMethodBind("CylinderMesh","get_rings")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTopRadius(): Double {
    val mb = getMethodBind("CylinderMesh","get_top_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun setBottomRadius(radius: Double) {
    val mb = getMethodBind("CylinderMesh","set_bottom_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setHeight(height: Double) {
    val mb = getMethodBind("CylinderMesh","set_height")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setRadialSegments(segments: Long) {
    val mb = getMethodBind("CylinderMesh","set_radial_segments")
    _icall_Unit_Long( mb, this.ptr, segments)
  }

  open fun setRings(rings: Long) {
    val mb = getMethodBind("CylinderMesh","set_rings")
    _icall_Unit_Long( mb, this.ptr, rings)
  }

  open fun setTopRadius(radius: Double) {
    val mb = getMethodBind("CylinderMesh","set_top_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }
}
