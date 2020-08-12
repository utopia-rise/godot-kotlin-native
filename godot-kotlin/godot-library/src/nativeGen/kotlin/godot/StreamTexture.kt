// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Long_String
import godot.icalls._icall_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class StreamTexture : Texture() {
  open val loadPath: String
    get() {
      val mb = getMethodBind("StreamTexture","get_load_path")
      return _icall_String(mb, this.ptr)
    }

  override fun __new(): COpaquePointer = invokeConstructor("StreamTexture", "StreamTexture")

  open fun getLoadPath(): String {
    val mb = getMethodBind("StreamTexture","get_load_path")
    return _icall_String( mb, this.ptr)
  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("StreamTexture","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }
}
