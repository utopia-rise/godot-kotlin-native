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
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class CSGTorus internal constructor(
  _ignore: Any?
) : CSGPrimitive(_ignore) {
  open var innerRadius: Double
    get() {
      val mb = getMethodBind("CSGTorus","get_inner_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGTorus","set_inner_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var material: Material
    get() {
      val mb = getMethodBind("CSGTorus","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGTorus","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var outerRadius: Double
    get() {
      val mb = getMethodBind("CSGTorus","get_outer_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGTorus","set_outer_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ringSides: Long
    get() {
      val mb = getMethodBind("CSGTorus","get_ring_sides")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGTorus","set_ring_sides")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var sides: Long
    get() {
      val mb = getMethodBind("CSGTorus","get_sides")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGTorus","set_sides")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var smoothFaces: Boolean
    get() {
      val mb = getMethodBind("CSGTorus","get_smooth_faces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGTorus","set_smooth_faces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CSGTorus", "CSGTorus")
        }

  }

  open fun getInnerRadius(): Double {
    val mb = getMethodBind("CSGTorus","get_inner_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CSGTorus","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getOuterRadius(): Double {
    val mb = getMethodBind("CSGTorus","get_outer_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRingSides(): Long {
    val mb = getMethodBind("CSGTorus","get_ring_sides")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSides(): Long {
    val mb = getMethodBind("CSGTorus","get_sides")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSmoothFaces(): Boolean {
    val mb = getMethodBind("CSGTorus","get_smooth_faces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setInnerRadius(radius: Double) {
    val mb = getMethodBind("CSGTorus","set_inner_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CSGTorus","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setOuterRadius(radius: Double) {
    val mb = getMethodBind("CSGTorus","set_outer_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setRingSides(sides: Long) {
    val mb = getMethodBind("CSGTorus","set_ring_sides")
    _icall_Unit_Long( mb, this.ptr, sides)
  }

  open fun setSides(sides: Long) {
    val mb = getMethodBind("CSGTorus","set_sides")
    _icall_Unit_Long( mb, this.ptr, sides)
  }

  open fun setSmoothFaces(smoothFaces: Boolean) {
    val mb = getMethodBind("CSGTorus","set_smooth_faces")
    _icall_Unit_Boolean( mb, this.ptr, smoothFaces)
  }
}
