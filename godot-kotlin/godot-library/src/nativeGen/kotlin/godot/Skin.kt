package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Transform
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Transform_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_Transform
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class Skin internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Skin", "Skin")
        }

  }

  open fun addBind(bone: Long, pose: Transform) {
    val mb = getMethodBind("Skin","add_bind")
    _icall_Unit_Long_Transform( mb, this.ptr, bone, pose)
  }

  open fun clearBinds() {
    val mb = getMethodBind("Skin","clear_binds")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBindBone(bindIndex: Long): Long {
    val mb = getMethodBind("Skin","get_bind_bone")
    return _icall_Long_Long( mb, this.ptr, bindIndex)
  }

  open fun getBindCount(): Long {
    val mb = getMethodBind("Skin","get_bind_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBindName(bindIndex: Long): String {
    val mb = getMethodBind("Skin","get_bind_name")
    return _icall_String_Long( mb, this.ptr, bindIndex)
  }

  open fun getBindPose(bindIndex: Long): Transform {
    val mb = getMethodBind("Skin","get_bind_pose")
    return _icall_Transform_Long( mb, this.ptr, bindIndex)
  }

  open fun setBindBone(bindIndex: Long, bone: Long) {
    val mb = getMethodBind("Skin","set_bind_bone")
    _icall_Unit_Long_Long( mb, this.ptr, bindIndex, bone)
  }

  open fun setBindCount(bindCount: Long) {
    val mb = getMethodBind("Skin","set_bind_count")
    _icall_Unit_Long( mb, this.ptr, bindCount)
  }

  open fun setBindName(bindIndex: Long, name: String) {
    val mb = getMethodBind("Skin","set_bind_name")
    _icall_Unit_Long_String( mb, this.ptr, bindIndex, name)
  }

  open fun setBindPose(bindIndex: Long, pose: Transform) {
    val mb = getMethodBind("Skin","set_bind_pose")
    _icall_Unit_Long_Transform( mb, this.ptr, bindIndex, pose)
  }
}
