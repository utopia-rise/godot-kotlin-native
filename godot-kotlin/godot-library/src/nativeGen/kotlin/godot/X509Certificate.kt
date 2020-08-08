package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class X509Certificate internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("X509Certificate", "X509Certificate")
        }

  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("X509Certificate","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun save(path: String): GodotError {
    val mb = getMethodBind("X509Certificate","save")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  companion object
}
