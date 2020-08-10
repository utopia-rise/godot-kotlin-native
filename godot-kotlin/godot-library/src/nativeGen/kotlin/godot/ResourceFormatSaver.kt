package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.internal.utils.getConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class ResourceFormatSaver internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ResourceFormatSaver", "ResourceFormatSaver")
        }

  }

  open fun get_recognized_extensions(resource: Resource): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatSaver")
  }

  open fun recognize(resource: Resource): Boolean {
    throw NotImplementedError("recognize is not implemented for ResourceFormatSaver")
  }

  open fun save(
    path: String,
    resource: Resource,
    flags: Long
  ): Long {
    throw NotImplementedError("save is not implemented for ResourceFormatSaver")
  }
}
