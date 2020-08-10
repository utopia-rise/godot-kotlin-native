// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError

open class PackedDataContainerRef internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun _is_dictionary(): Boolean {
    throw NotImplementedError("_is_dictionary is not implemented for PackedDataContainerRef")
  }

  open fun _iter_get(arg0: Variant): Variant {
    throw NotImplementedError("_iter_get is not implemented for PackedDataContainerRef")
  }

  open fun _iter_init(arg0: VariantArray): Variant {
    throw NotImplementedError("_iter_init is not implemented for PackedDataContainerRef")
  }

  open fun _iter_next(arg0: VariantArray): Variant {
    throw NotImplementedError("_iter_next is not implemented for PackedDataContainerRef")
  }

  open fun size(): Long {
    val mb = getMethodBind("PackedDataContainerRef","size")
    return _icall_Long( mb, this.ptr)
  }
}
