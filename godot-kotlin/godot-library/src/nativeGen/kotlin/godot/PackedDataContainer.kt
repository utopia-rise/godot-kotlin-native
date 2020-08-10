// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Variant
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError

open class PackedDataContainer internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PackedDataContainer", "PackedDataContainer")
        }

  }

  open fun _get_data(): PoolByteArray {
    throw NotImplementedError("_get_data is not implemented for PackedDataContainer")
  }

  open fun _iter_get(arg0: Variant): Variant {
    throw NotImplementedError("_iter_get is not implemented for PackedDataContainer")
  }

  open fun _iter_init(arg0: VariantArray): Variant {
    throw NotImplementedError("_iter_init is not implemented for PackedDataContainer")
  }

  open fun _iter_next(arg0: VariantArray): Variant {
    throw NotImplementedError("_iter_next is not implemented for PackedDataContainer")
  }

  open fun _set_data(arg0: PoolByteArray) {
  }

  open fun pack(value: Variant): GodotError {
    val mb = getMethodBind("PackedDataContainer","pack")
    return GodotError.byValue( _icall_Long_Variant( mb, this.ptr, value).toUInt())
  }

  open fun size(): Long {
    val mb = getMethodBind("PackedDataContainer","size")
    return _icall_Long( mb, this.ptr)
  }
}
