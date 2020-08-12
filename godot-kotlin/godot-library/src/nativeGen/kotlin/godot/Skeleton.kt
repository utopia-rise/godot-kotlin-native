// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Transform
import godot.core.VariantArray
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_SkinReference_Object
import godot.icalls._icall_String_Long
import godot.icalls._icall_Transform_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Transform
import godot.icalls._icall_Unit_Long_Transform_Double_Boolean
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_VariantArray
import godot.icalls._icall_VariantArray_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class Skeleton internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Skeleton", "Skeleton")
        }

  }

  open fun addBone(name: String) {
    val mb = getMethodBind("Skeleton","add_bone")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun bindChildNodeToBone(boneIdx: Long, node: Node) {
    val mb = getMethodBind("Skeleton","bind_child_node_to_bone")
    _icall_Unit_Long_Object( mb, this.ptr, boneIdx, node)
  }

  open fun clearBones() {
    val mb = getMethodBind("Skeleton","clear_bones")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearBonesGlobalPoseOverride() {
    val mb = getMethodBind("Skeleton","clear_bones_global_pose_override")
    _icall_Unit( mb, this.ptr)
  }

  open fun findBone(name: String): Long {
    val mb = getMethodBind("Skeleton","find_bone")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun getBoneCount(): Long {
    val mb = getMethodBind("Skeleton","get_bone_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBoneCustomPose(boneIdx: Long): Transform {
    val mb = getMethodBind("Skeleton","get_bone_custom_pose")
    return _icall_Transform_Long( mb, this.ptr, boneIdx)
  }

  open fun getBoneGlobalPose(boneIdx: Long): Transform {
    val mb = getMethodBind("Skeleton","get_bone_global_pose")
    return _icall_Transform_Long( mb, this.ptr, boneIdx)
  }

  open fun getBoneName(boneIdx: Long): String {
    val mb = getMethodBind("Skeleton","get_bone_name")
    return _icall_String_Long( mb, this.ptr, boneIdx)
  }

  open fun getBoneParent(boneIdx: Long): Long {
    val mb = getMethodBind("Skeleton","get_bone_parent")
    return _icall_Long_Long( mb, this.ptr, boneIdx)
  }

  open fun getBonePose(boneIdx: Long): Transform {
    val mb = getMethodBind("Skeleton","get_bone_pose")
    return _icall_Transform_Long( mb, this.ptr, boneIdx)
  }

  open fun getBoneRest(boneIdx: Long): Transform {
    val mb = getMethodBind("Skeleton","get_bone_rest")
    return _icall_Transform_Long( mb, this.ptr, boneIdx)
  }

  open fun getBoundChildNodesToBone(boneIdx: Long): VariantArray {
    val mb = getMethodBind("Skeleton","get_bound_child_nodes_to_bone")
    return _icall_VariantArray_Long( mb, this.ptr, boneIdx)
  }

  open fun isBoneRestDisabled(boneIdx: Long): Boolean {
    val mb = getMethodBind("Skeleton","is_bone_rest_disabled")
    return _icall_Boolean_Long( mb, this.ptr, boneIdx)
  }

  open fun localizeRests() {
    val mb = getMethodBind("Skeleton","localize_rests")
    _icall_Unit( mb, this.ptr)
  }

  open fun physicalBonesAddCollisionException(exception: RID) {
    val mb = getMethodBind("Skeleton","physical_bones_add_collision_exception")
    _icall_Unit_RID( mb, this.ptr, exception)
  }

  open fun physicalBonesRemoveCollisionException(exception: RID) {
    val mb = getMethodBind("Skeleton","physical_bones_remove_collision_exception")
    _icall_Unit_RID( mb, this.ptr, exception)
  }

  open fun physicalBonesStartSimulation(bones: VariantArray = VariantArray()) {
    val mb = getMethodBind("Skeleton","physical_bones_start_simulation")
    _icall_Unit_VariantArray( mb, this.ptr, bones)
  }

  open fun physicalBonesStopSimulation() {
    val mb = getMethodBind("Skeleton","physical_bones_stop_simulation")
    _icall_Unit( mb, this.ptr)
  }

  open fun registerSkin(skin: Skin): SkinReference {
    val mb = getMethodBind("Skeleton","register_skin")
    return _icall_SkinReference_Object( mb, this.ptr, skin)
  }

  open fun setBoneCustomPose(boneIdx: Long, customPose: Transform) {
    val mb = getMethodBind("Skeleton","set_bone_custom_pose")
    _icall_Unit_Long_Transform( mb, this.ptr, boneIdx, customPose)
  }

  open fun setBoneDisableRest(boneIdx: Long, disable: Boolean) {
    val mb = getMethodBind("Skeleton","set_bone_disable_rest")
    _icall_Unit_Long_Boolean( mb, this.ptr, boneIdx, disable)
  }

  open fun setBoneGlobalPoseOverride(
    boneIdx: Long,
    pose: Transform,
    amount: Double,
    persistent: Boolean = false
  ) {
    val mb = getMethodBind("Skeleton","set_bone_global_pose_override")
    _icall_Unit_Long_Transform_Double_Boolean( mb, this.ptr, boneIdx, pose, amount, persistent)
  }

  open fun setBoneParent(boneIdx: Long, parentIdx: Long) {
    val mb = getMethodBind("Skeleton","set_bone_parent")
    _icall_Unit_Long_Long( mb, this.ptr, boneIdx, parentIdx)
  }

  open fun setBonePose(boneIdx: Long, pose: Transform) {
    val mb = getMethodBind("Skeleton","set_bone_pose")
    _icall_Unit_Long_Transform( mb, this.ptr, boneIdx, pose)
  }

  open fun setBoneRest(boneIdx: Long, rest: Transform) {
    val mb = getMethodBind("Skeleton","set_bone_rest")
    _icall_Unit_Long_Transform( mb, this.ptr, boneIdx, rest)
  }

  open fun unbindChildNodeFromBone(boneIdx: Long, node: Node) {
    val mb = getMethodBind("Skeleton","unbind_child_node_from_bone")
    _icall_Unit_Long_Object( mb, this.ptr, boneIdx, node)
  }

  open fun unparentBoneAndRest(boneIdx: Long) {
    val mb = getMethodBind("Skeleton","unparent_bone_and_rest")
    _icall_Unit_Long( mb, this.ptr, boneIdx)
  }

  companion object {
    final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }
}
