// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class SphereMesh internal constructor(
  _ignore: Any?
) : PrimitiveMesh(_ignore) {
  open var height: Double
    get() {
      val mb = getMethodBind("SphereMesh","get_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereMesh","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var isHemisphere: Boolean
    get() {
      val mb = getMethodBind("SphereMesh","get_is_hemisphere")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereMesh","set_is_hemisphere")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var radialSegments: Long
    get() {
      val mb = getMethodBind("SphereMesh","get_radial_segments")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereMesh","set_radial_segments")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var radius: Double
    get() {
      val mb = getMethodBind("SphereMesh","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereMesh","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rings: Long
    get() {
      val mb = getMethodBind("SphereMesh","get_rings")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereMesh","set_rings")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("SphereMesh", "SphereMesh")
        }

  }

  open fun getHeight(): Double {
    val mb = getMethodBind("SphereMesh","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getIsHemisphere(): Boolean {
    val mb = getMethodBind("SphereMesh","get_is_hemisphere")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getRadialSegments(): Long {
    val mb = getMethodBind("SphereMesh","get_radial_segments")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRadius(): Double {
    val mb = getMethodBind("SphereMesh","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRings(): Long {
    val mb = getMethodBind("SphereMesh","get_rings")
    return _icall_Long( mb, this.ptr)
  }

  open fun setHeight(height: Double) {
    val mb = getMethodBind("SphereMesh","set_height")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setIsHemisphere(isHemisphere: Boolean) {
    val mb = getMethodBind("SphereMesh","set_is_hemisphere")
    _icall_Unit_Boolean( mb, this.ptr, isHemisphere)
  }

  open fun setRadialSegments(radialSegments: Long) {
    val mb = getMethodBind("SphereMesh","set_radial_segments")
    _icall_Unit_Long( mb, this.ptr, radialSegments)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("SphereMesh","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setRings(rings: Long) {
    val mb = getMethodBind("SphereMesh","set_rings")
    _icall_Unit_Long( mb, this.ptr, rings)
  }
}
