package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class EncodedObjectAsID internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var objectId: Long
    get() {
      val mb = getMethodBind("EncodedObjectAsID","get_object_id")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EncodedObjectAsID","set_object_id")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("EncodedObjectAsID", "EncodedObjectAsID")
        }

  }

  open fun getObjectId(): Long {
    val mb = getMethodBind("EncodedObjectAsID","get_object_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun setObjectId(id: Long) {
    val mb = getMethodBind("EncodedObjectAsID","set_object_id")
    _icall_Unit_Long( mb, this.ptr, id)
  }
}
