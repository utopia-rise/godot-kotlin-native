// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.core.Variant
import godot.internal.utils.getConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class ResourceFormatLoader internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ResourceFormatLoader", "ResourceFormatLoader")
        }

  }

  open fun get_dependencies(path: String, addTypes: String) {
  }

  open fun get_recognized_extensions(): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatLoader")
  }

  open fun get_resource_type(path: String): String {
    throw NotImplementedError("get_resource_type is not implemented for ResourceFormatLoader")
  }

  open fun handles_type(typename: String): Boolean {
    throw NotImplementedError("handles_type is not implemented for ResourceFormatLoader")
  }

  open fun load(path: String, originalPath: String): Variant {
    throw NotImplementedError("load is not implemented for ResourceFormatLoader")
  }

  open fun rename_dependencies(path: String, renames: String): Long {
    throw NotImplementedError("rename_dependencies is not implemented for ResourceFormatLoader")
  }
}
