// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_MultiMesh
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class MultiMeshInstance2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val textureChanged: Signal0 by signal()

  open var multimesh: MultiMesh
    get() {
      val mb = getMethodBind("MultiMeshInstance2D","get_multimesh")
      return _icall_MultiMesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMeshInstance2D","set_multimesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var normalMap: Texture
    get() {
      val mb = getMethodBind("MultiMeshInstance2D","get_normal_map")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMeshInstance2D","set_normal_map")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("MultiMeshInstance2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMeshInstance2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MultiMeshInstance2D", "MultiMeshInstance2D")
        }

  }

  open fun getMultimesh(): MultiMesh {
    val mb = getMethodBind("MultiMeshInstance2D","get_multimesh")
    return _icall_MultiMesh( mb, this.ptr)
  }

  open fun getNormalMap(): Texture {
    val mb = getMethodBind("MultiMeshInstance2D","get_normal_map")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("MultiMeshInstance2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun setMultimesh(multimesh: MultiMesh) {
    val mb = getMethodBind("MultiMeshInstance2D","set_multimesh")
    _icall_Unit_Object( mb, this.ptr, multimesh)
  }

  open fun setNormalMap(normalMap: Texture) {
    val mb = getMethodBind("MultiMeshInstance2D","set_normal_map")
    _icall_Unit_Object( mb, this.ptr, normalMap)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("MultiMeshInstance2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }
}
