// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class CSGCylinder : CSGPrimitive() {
  open var cone: Boolean
    get() {
      val mb = getMethodBind("CSGCylinder","is_cone")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGCylinder","set_cone")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var height: Double
    get() {
      val mb = getMethodBind("CSGCylinder","get_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGCylinder","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var material: Material
    get() {
      val mb = getMethodBind("CSGCylinder","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGCylinder","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var radius: Double
    get() {
      val mb = getMethodBind("CSGCylinder","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGCylinder","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sides: Long
    get() {
      val mb = getMethodBind("CSGCylinder","get_sides")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGCylinder","set_sides")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var smoothFaces: Boolean
    get() {
      val mb = getMethodBind("CSGCylinder","get_smooth_faces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGCylinder","set_smooth_faces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CSGCylinder", "CSGCylinder")

  open fun getHeight(): Double {
    val mb = getMethodBind("CSGCylinder","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CSGCylinder","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getRadius(): Double {
    val mb = getMethodBind("CSGCylinder","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSides(): Long {
    val mb = getMethodBind("CSGCylinder","get_sides")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSmoothFaces(): Boolean {
    val mb = getMethodBind("CSGCylinder","get_smooth_faces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCone(): Boolean {
    val mb = getMethodBind("CSGCylinder","is_cone")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCone(cone: Boolean) {
    val mb = getMethodBind("CSGCylinder","set_cone")
    _icall_Unit_Boolean( mb, this.ptr, cone)
  }

  open fun setHeight(height: Double) {
    val mb = getMethodBind("CSGCylinder","set_height")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CSGCylinder","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("CSGCylinder","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setSides(sides: Long) {
    val mb = getMethodBind("CSGCylinder","set_sides")
    _icall_Unit_Long( mb, this.ptr, sides)
  }

  open fun setSmoothFaces(smoothFaces: Boolean) {
    val mb = getMethodBind("CSGCylinder","set_smooth_faces")
    _icall_Unit_Boolean( mb, this.ptr, smoothFaces)
  }
}
