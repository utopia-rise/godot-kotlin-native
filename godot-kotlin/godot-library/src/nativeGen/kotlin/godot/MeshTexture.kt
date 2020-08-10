// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Mesh
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class MeshTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var baseTexture: Texture
    get() {
      val mb = getMethodBind("MeshTexture","get_base_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshTexture","set_base_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var imageSize: Vector2
    get() {
      val mb = getMethodBind("MeshTexture","get_image_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshTexture","set_image_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var mesh: Mesh
    get() {
      val mb = getMethodBind("MeshTexture","get_mesh")
      return _icall_Mesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MeshTexture","set_mesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MeshTexture", "MeshTexture")
        }

  }

  open fun imageSize(schedule: Vector2.() -> Unit): Vector2 = imageSize.apply{
      schedule(this)
      imageSize = this
  }


  open fun getBaseTexture(): Texture {
    val mb = getMethodBind("MeshTexture","get_base_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getImageSize(): Vector2 {
    val mb = getMethodBind("MeshTexture","get_image_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("MeshTexture","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun setBaseTexture(texture: Texture) {
    val mb = getMethodBind("MeshTexture","set_base_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setImageSize(size: Vector2) {
    val mb = getMethodBind("MeshTexture","set_image_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setMesh(mesh: Mesh) {
    val mb = getMethodBind("MeshTexture","set_mesh")
    _icall_Unit_Object( mb, this.ptr, mesh)
  }
}
