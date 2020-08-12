// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class VideoStreamTheora : VideoStream() {
  open var file: String
    get() {
      val mb = getMethodBind("VideoStreamTheora","get_file")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoStreamTheora","set_file")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VideoStreamTheora", "VideoStreamTheora")

  open fun getFile(): String {
    val mb = getMethodBind("VideoStreamTheora","get_file")
    return _icall_String( mb, this.ptr)
  }

  open fun setFile(file: String) {
    val mb = getMethodBind("VideoStreamTheora","set_file")
    _icall_Unit_String( mb, this.ptr, file)
  }
}
