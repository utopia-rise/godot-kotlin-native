// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.RID
import godot.icalls._icall_RID
import godot.icalls._icall_Skin
import godot.internal.utils.getMethodBind

open class SkinReference internal constructor() : Reference() {
  open fun _skinChanged() {
  }

  open fun getSkeleton(): RID {
    val mb = getMethodBind("SkinReference","get_skeleton")
    return _icall_RID( mb, this.ptr)
  }

  open fun getSkin(): Skin {
    val mb = getMethodBind("SkinReference","get_skin")
    return _icall_Skin( mb, this.ptr)
  }
}
