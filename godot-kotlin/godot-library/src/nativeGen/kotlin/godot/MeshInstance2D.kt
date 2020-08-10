package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Mesh
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class MeshInstance2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val textureChanged: Signal0 by signal()

  open var mesh: Mesh
    get() {
      val mb = getMethodBind("MeshInstance2D","get_mesh")
      return _icall_Mesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshInstance2D","set_mesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var normalMap: Texture
    get() {
      val mb = getMethodBind("MeshInstance2D","get_normal_map")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshInstance2D","set_normal_map")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("MeshInstance2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshInstance2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MeshInstance2D", "MeshInstance2D")
        }

  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("MeshInstance2D","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun getNormalMap(): Texture {
    val mb = getMethodBind("MeshInstance2D","get_normal_map")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("MeshInstance2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun setMesh(mesh: Mesh) {
    val mb = getMethodBind("MeshInstance2D","set_mesh")
    _icall_Unit_Object( mb, this.ptr, mesh)
  }

  open fun setNormalMap(normalMap: Texture) {
    val mb = getMethodBind("MeshInstance2D","set_normal_map")
    _icall_Unit_Object( mb, this.ptr, normalMap)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("MeshInstance2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }
}
