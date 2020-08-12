// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.AABB
import godot.core.VariantArray
import godot.icalls._icall_AABB
import godot.icalls._icall_Boolean
import godot.icalls._icall_Material
import godot.icalls._icall_Unit_AABB
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Unit

open class PrimitiveMesh internal constructor() : Mesh() {
  open var customAabb: AABB
    get() {
      val mb = getMethodBind("PrimitiveMesh","get_custom_aabb")
      return _icall_AABB(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrimitiveMesh","set_custom_aabb")
      _icall_Unit_AABB(mb, this.ptr, value)
    }

  open var flipFaces: Boolean
    get() {
      val mb = getMethodBind("PrimitiveMesh","get_flip_faces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrimitiveMesh","set_flip_faces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var material: Material
    get() {
      val mb = getMethodBind("PrimitiveMesh","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PrimitiveMesh","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open fun customAabb(schedule: AABB.() -> Unit): AABB = customAabb.apply{
      schedule(this)
      customAabb = this
  }


  open fun _update() {
  }

  open fun getCustomAabb(): AABB {
    val mb = getMethodBind("PrimitiveMesh","get_custom_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getFlipFaces(): Boolean {
    val mb = getMethodBind("PrimitiveMesh","get_flip_faces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("PrimitiveMesh","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getMeshArrays(): VariantArray {
    val mb = getMethodBind("PrimitiveMesh","get_mesh_arrays")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun setCustomAabb(aabb: AABB) {
    val mb = getMethodBind("PrimitiveMesh","set_custom_aabb")
    _icall_Unit_AABB( mb, this.ptr, aabb)
  }

  open fun setFlipFaces(flipFaces: Boolean) {
    val mb = getMethodBind("PrimitiveMesh","set_flip_faces")
    _icall_Unit_Boolean( mb, this.ptr, flipFaces)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("PrimitiveMesh","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }
}
