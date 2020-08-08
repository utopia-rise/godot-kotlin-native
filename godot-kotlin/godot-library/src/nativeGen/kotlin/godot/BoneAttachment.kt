package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class BoneAttachment internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var boneName: String
    get() {
      val mb = getMethodBind("BoneAttachment","get_bone_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BoneAttachment","set_bone_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("BoneAttachment", "BoneAttachment")
        }

  }

  open fun getBoneName(): String {
    val mb = getMethodBind("BoneAttachment","get_bone_name")
    return _icall_String( mb, this.ptr)
  }

  open fun setBoneName(boneName: String) {
    val mb = getMethodBind("BoneAttachment","set_bone_name")
    _icall_Unit_String( mb, this.ptr, boneName)
  }

  companion object
}
