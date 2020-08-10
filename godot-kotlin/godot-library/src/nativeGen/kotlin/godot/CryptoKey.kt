// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class CryptoKey internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CryptoKey", "CryptoKey")
        }

  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("CryptoKey","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun save(path: String): GodotError {
    val mb = getMethodBind("CryptoKey","save")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }
}
