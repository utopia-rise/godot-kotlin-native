// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Material
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class CSGSphere internal constructor(
  _ignore: Any?
) : CSGPrimitive(_ignore) {
  open var material: Material
    get() {
      val mb = getMethodBind("CSGSphere","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGSphere","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var radialSegments: Long
    get() {
      val mb = getMethodBind("CSGSphere","get_radial_segments")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGSphere","set_radial_segments")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var radius: Double
    get() {
      val mb = getMethodBind("CSGSphere","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGSphere","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rings: Long
    get() {
      val mb = getMethodBind("CSGSphere","get_rings")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGSphere","set_rings")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var smoothFaces: Boolean
    get() {
      val mb = getMethodBind("CSGSphere","get_smooth_faces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGSphere","set_smooth_faces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("CSGSphere", "CSGSphere")
        }

  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CSGSphere","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getRadialSegments(): Long {
    val mb = getMethodBind("CSGSphere","get_radial_segments")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRadius(): Double {
    val mb = getMethodBind("CSGSphere","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRings(): Long {
    val mb = getMethodBind("CSGSphere","get_rings")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSmoothFaces(): Boolean {
    val mb = getMethodBind("CSGSphere","get_smooth_faces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CSGSphere","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setRadialSegments(radialSegments: Long) {
    val mb = getMethodBind("CSGSphere","set_radial_segments")
    _icall_Unit_Long( mb, this.ptr, radialSegments)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("CSGSphere","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setRings(rings: Long) {
    val mb = getMethodBind("CSGSphere","set_rings")
    _icall_Unit_Long( mb, this.ptr, rings)
  }

  open fun setSmoothFaces(smoothFaces: Boolean) {
    val mb = getMethodBind("CSGSphere","set_smooth_faces")
    _icall_Unit_Boolean( mb, this.ptr, smoothFaces)
  }
}
