// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class BoneAttachment : Spatial() {
  open var boneName: String
    get() {
      val mb = getMethodBind("BoneAttachment","get_bone_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BoneAttachment","set_bone_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("BoneAttachment", "BoneAttachment")

  open fun getBoneName(): String {
    val mb = getMethodBind("BoneAttachment","get_bone_name")
    return _icall_String( mb, this.ptr)
  }

  open fun setBoneName(boneName: String) {
    val mb = getMethodBind("BoneAttachment","set_bone_name")
    _icall_Unit_String( mb, this.ptr, boneName)
  }
}
