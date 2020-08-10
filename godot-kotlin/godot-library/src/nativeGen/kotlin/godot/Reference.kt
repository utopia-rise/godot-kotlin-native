// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean

open class Reference internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Reference", "Reference")
        }

  }

  open fun initRef(): Boolean {
    val mb = getMethodBind("Reference","init_ref")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun reference(): Boolean {
    val mb = getMethodBind("Reference","reference")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun unreference(): Boolean {
    val mb = getMethodBind("Reference","unreference")
    return _icall_Boolean( mb, this.ptr)
  }
}
