// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class ProxyTexture : Texture() {
  open var base: Texture
    get() {
      val mb = getMethodBind("ProxyTexture","get_base")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProxyTexture","set_base")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ProxyTexture", "ProxyTexture")

  open fun getBase(): Texture {
    val mb = getMethodBind("ProxyTexture","get_base")
    return _icall_Texture( mb, this.ptr)
  }

  open fun setBase(base: Texture) {
    val mb = getMethodBind("ProxyTexture","set_base")
    _icall_Unit_Object( mb, this.ptr, base)
  }
}
