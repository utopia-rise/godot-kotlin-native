// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Long
import godot.icalls._icall_Resource
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class ResourceInteractiveLoader internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun getResource(): Resource {
    val mb = getMethodBind("ResourceInteractiveLoader","get_resource")
    return _icall_Resource( mb, this.ptr)
  }

  open fun getStage(): Long {
    val mb = getMethodBind("ResourceInteractiveLoader","get_stage")
    return _icall_Long( mb, this.ptr)
  }

  open fun getStageCount(): Long {
    val mb = getMethodBind("ResourceInteractiveLoader","get_stage_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun poll(): GodotError {
    val mb = getMethodBind("ResourceInteractiveLoader","poll")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun wait(): GodotError {
    val mb = getMethodBind("ResourceInteractiveLoader","wait")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }
}
