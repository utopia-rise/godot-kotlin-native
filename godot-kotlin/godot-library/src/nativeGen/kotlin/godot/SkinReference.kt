package godot

import godot.core.RID
import godot.icalls._icall_RID
import godot.icalls._icall_Skin
import godot.internal.utils.getMethodBind
import kotlin.Any

open class SkinReference internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun _skin_changed() {
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
