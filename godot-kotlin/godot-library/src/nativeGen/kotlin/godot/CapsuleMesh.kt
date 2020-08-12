// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class CapsuleMesh internal constructor(
  _ignore: Any?
) : PrimitiveMesh(_ignore) {
  open var midHeight: Double
    get() {
      val mb = getMethodBind("CapsuleMesh","get_mid_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CapsuleMesh","set_mid_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var radialSegments: Long
    get() {
      val mb = getMethodBind("CapsuleMesh","get_radial_segments")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CapsuleMesh","set_radial_segments")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var radius: Double
    get() {
      val mb = getMethodBind("CapsuleMesh","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CapsuleMesh","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rings: Long
    get() {
      val mb = getMethodBind("CapsuleMesh","get_rings")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CapsuleMesh","set_rings")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("CapsuleMesh", "CapsuleMesh")
        }

  }

  open fun getMidHeight(): Double {
    val mb = getMethodBind("CapsuleMesh","get_mid_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRadialSegments(): Long {
    val mb = getMethodBind("CapsuleMesh","get_radial_segments")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRadius(): Double {
    val mb = getMethodBind("CapsuleMesh","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRings(): Long {
    val mb = getMethodBind("CapsuleMesh","get_rings")
    return _icall_Long( mb, this.ptr)
  }

  open fun setMidHeight(midHeight: Double) {
    val mb = getMethodBind("CapsuleMesh","set_mid_height")
    _icall_Unit_Double( mb, this.ptr, midHeight)
  }

  open fun setRadialSegments(segments: Long) {
    val mb = getMethodBind("CapsuleMesh","set_radial_segments")
    _icall_Unit_Long( mb, this.ptr, segments)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("CapsuleMesh","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setRings(rings: Long) {
    val mb = getMethodBind("CapsuleMesh","set_rings")
    _icall_Unit_Long( mb, this.ptr, rings)
  }
}
