package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Material
import godot.icalls._icall_Mesh
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class CSGMesh internal constructor(
  _ignore: Any?
) : CSGPrimitive(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CSGMesh", "CSGMesh")
        }

  }

  open fun _mesh_changed() {
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
