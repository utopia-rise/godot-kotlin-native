// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Material
import godot.icalls._icall_Mesh
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class CSGMesh : CSGPrimitive() {
  open var material: Material
    get() {
      val mb = getMethodBind("CSGMesh","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGMesh","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var mesh: Mesh
    get() {
      val mb = getMethodBind("CSGMesh","get_mesh")
      return _icall_Mesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGMesh","set_mesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CSGMesh", "CSGMesh")

  open fun _meshChanged() {
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CSGMesh","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("CSGMesh","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CSGMesh","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setMesh(mesh: Mesh) {
    val mb = getMethodBind("CSGMesh","set_mesh")
    _icall_Unit_Object( mb, this.ptr, mesh)
  }
}
