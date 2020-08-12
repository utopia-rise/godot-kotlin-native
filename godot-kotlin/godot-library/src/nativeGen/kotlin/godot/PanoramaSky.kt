// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class PanoramaSky : Sky() {
  open var panorama: Texture
    get() {
      val mb = getMethodBind("PanoramaSky","get_panorama")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PanoramaSky","set_panorama")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("PanoramaSky", "PanoramaSky")

  open fun getPanorama(): Texture {
    val mb = getMethodBind("PanoramaSky","get_panorama")
    return _icall_Texture( mb, this.ptr)
  }

  open fun setPanorama(texture: Texture) {
    val mb = getMethodBind("PanoramaSky","set_panorama")
    _icall_Unit_Object( mb, this.ptr, texture)
  }
}
