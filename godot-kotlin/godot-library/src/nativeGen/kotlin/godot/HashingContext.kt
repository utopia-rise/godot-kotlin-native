// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_PoolByteArray
import godot.icalls._icall_PoolByteArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class HashingContext internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("HashingContext", "HashingContext")
        }

  }

  open fun finish(): PoolByteArray {
    val mb = getMethodBind("HashingContext","finish")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun start(type: Long): GodotError {
    val mb = getMethodBind("HashingContext","start")
    return GodotError.byValue( _icall_Long_Long( mb, this.ptr, type).toUInt())
  }

  open fun update(chunk: PoolByteArray): GodotError {
    val mb = getMethodBind("HashingContext","update")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, chunk).toUInt())
  }

  enum class HashType(
    id: Long
  ) {
    HASH_MD5(0),

    HASH_SHA1(1),

    HASH_SHA256(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
