// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long_String
import godot.icalls._icall_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class StreamTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open val loadPath: String
    get() {
      val mb = getMethodBind("StreamTexture","get_load_path")
      return _icall_String(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StreamTexture", "StreamTexture")
        }

  }

  open fun getLoadPath(): String {
    val mb = getMethodBind("StreamTexture","get_load_path")
    return _icall_String( mb, this.ptr)
  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("StreamTexture","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }
}
