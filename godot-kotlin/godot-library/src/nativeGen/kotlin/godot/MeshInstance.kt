package godot

import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.icalls._icall_Long
import godot.icalls._icall_Material_Long
import godot.icalls._icall_Mesh
import godot.icalls._icall_NodePath
import godot.icalls._icall_Skin
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class MeshInstance internal constructor(
  _ignore: Any?
) : GeometryInstance(_ignore) {
  open var mesh: Mesh
    get() {
      val mb = getMethodBind("MeshInstance","get_mesh")
      return _icall_Mesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshInstance","set_mesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var skeleton: NodePath
    get() {
      val mb = getMethodBind("MeshInstance","get_skeleton_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshInstance","set_skeleton_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var skin: Skin
    get() {
      val mb = getMethodBind("MeshInstance","get_skin")
      return _icall_Skin(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshInstance","set_skin")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MeshInstance", "MeshInstance")
        }

  }

  open fun _mesh_changed() {
  }

  open fun createConvexCollision() {
    val mb = getMethodBind("MeshInstance","create_convex_collision")
    _icall_Unit( mb, this.ptr)
  }

  open fun createDebugTangents() {
    val mb = getMethodBind("MeshInstance","create_debug_tangents")
    _icall_Unit( mb, this.ptr)
  }

  open fun createTrimeshCollision() {
    val mb = getMethodBind("MeshInstance","create_trimesh_collision")
    _icall_Unit( mb, this.ptr)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("MeshInstance","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun getSkeletonPath(): NodePath {
    val mb = getMethodBind("MeshInstance","get_skeleton_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getSkin(): Skin {
    val mb = getMethodBind("MeshInstance","get_skin")
    return _icall_Skin( mb, this.ptr)
  }

  open fun getSurfaceMaterial(surface: Long): Material {
    val mb = getMethodBind("MeshInstance","get_surface_material")
    return _icall_Material_Long( mb, this.ptr, surface)
  }

  open fun getSurfaceMaterialCount(): Long {
    val mb = getMethodBind("MeshInstance","get_surface_material_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun setMesh(mesh: Mesh) {
    val mb = getMethodBind("MeshInstance","set_mesh")
    _icall_Unit_Object( mb, this.ptr, mesh)
  }

  open fun setSkeletonPath(skeletonPath: NodePath) {
    val mb = getMethodBind("MeshInstance","set_skeleton_path")
    _icall_Unit_NodePath( mb, this.ptr, skeletonPath)
  }

  open fun setSkin(skin: Skin) {
    val mb = getMethodBind("MeshInstance","set_skin")
    _icall_Unit_Object( mb, this.ptr, skin)
  }

  open fun setSurfaceMaterial(surface: Long, material: Material) {
    val mb = getMethodBind("MeshInstance","set_surface_material")
    _icall_Unit_Long_Object( mb, this.ptr, surface, material)
  }
}
