@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Skeleton : Spatial {
    constructor() : super("Skeleton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Spatial): Skeleton = Skeleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Skeleton = Skeleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Skeleton = Skeleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Skeleton = fromVariant(Skeleton(""), other)


        // Constants
        const val NOTIFICATION_UPDATE_SKELETON: Long = 50


    }


    // Properties


    // Methods
    private val addBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "add_bone") }
    open fun addBone(name: String) {
        _icall_Unit_String(addBoneMethodBind, this.rawMemory, name)
    }


    private val findBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "find_bone") }
    open fun findBone(name: String): Long {
        return _icall_Long_String(findBoneMethodBind, this.rawMemory, name)
    }


    private val getBoneNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_name") }
    open fun getBoneName(boneIdx: Long): String {
        return _icall_String_Long(getBoneNameMethodBind, this.rawMemory, boneIdx)
    }


    private val getBoneParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_parent") }
    open fun getBoneParent(boneIdx: Long): Long {
        return _icall_Long_Long(getBoneParentMethodBind, this.rawMemory, boneIdx)
    }


    private val setBoneParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "set_bone_parent") }
    open fun setBoneParent(boneIdx: Long, parentIdx: Long) {
        _icall_Unit_Long_Long(setBoneParentMethodBind, this.rawMemory, boneIdx, parentIdx)
    }


    private val getBoneCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_count") }
    open fun getBoneCount(): Long {
        return _icall_Long(getBoneCountMethodBind, this.rawMemory)
    }


    private val unparentBoneAndRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "unparent_bone_and_rest") }
    open fun unparentBoneAndRest(boneIdx: Long) {
        _icall_Unit_Long(unparentBoneAndRestMethodBind, this.rawMemory, boneIdx)
    }


    private val getBoneRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_rest") }
    open fun getBoneRest(boneIdx: Long): Transform {
        return _icall_Transform_Long(getBoneRestMethodBind, this.rawMemory, boneIdx)
    }


    private val setBoneRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "set_bone_rest") }
    open fun setBoneRest(boneIdx: Long, rest: Transform) {
        _icall_Unit_Long_Transform(setBoneRestMethodBind, this.rawMemory, boneIdx, rest)
    }


    private val setBoneDisableRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "set_bone_disable_rest") }
    open fun setBoneDisableRest(boneIdx: Long, disable: Boolean) {
        _icall_Unit_Long_Boolean(setBoneDisableRestMethodBind, this.rawMemory, boneIdx, disable)
    }


    private val isBoneRestDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "is_bone_rest_disabled") }
    open fun isBoneRestDisabled(boneIdx: Long): Boolean {
        return _icall_Boolean_Long(isBoneRestDisabledMethodBind, this.rawMemory, boneIdx)
    }


    private val bindChildNodeToBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "bind_child_node_to_bone") }
    open fun bindChildNodeToBone(boneIdx: Long, node: Object) {
        _icall_Unit_Long_Object(bindChildNodeToBoneMethodBind, this.rawMemory, boneIdx, node)
    }


    private val unbindChildNodeFromBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "unbind_child_node_from_bone") }
    open fun unbindChildNodeFromBone(boneIdx: Long, node: Object) {
        _icall_Unit_Long_Object(unbindChildNodeFromBoneMethodBind, this.rawMemory, boneIdx, node)
    }


    private val getBoundChildNodesToBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bound_child_nodes_to_bone") }
    open fun getBoundChildNodesToBone(boneIdx: Long): GDArray {
        return _icall_GDArray_Long(getBoundChildNodesToBoneMethodBind, this.rawMemory, boneIdx)
    }


    private val clearBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "clear_bones") }
    open fun clearBones() {
        _icall_Unit(clearBonesMethodBind, this.rawMemory)
    }


    private val getBonePoseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_pose") }
    open fun getBonePose(boneIdx: Long): Transform {
        return _icall_Transform_Long(getBonePoseMethodBind, this.rawMemory, boneIdx)
    }


    private val setBonePoseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "set_bone_pose") }
    open fun setBonePose(boneIdx: Long, pose: Transform) {
        _icall_Unit_Long_Transform(setBonePoseMethodBind, this.rawMemory, boneIdx, pose)
    }


    private val setBoneGlobalPoseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "set_bone_global_pose") }
    open fun setBoneGlobalPose(boneIdx: Long, pose: Transform) {
        _icall_Unit_Long_Transform(setBoneGlobalPoseMethodBind, this.rawMemory, boneIdx, pose)
    }


    private val getBoneGlobalPoseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_global_pose") }
    open fun getBoneGlobalPose(boneIdx: Long): Transform {
        return _icall_Transform_Long(getBoneGlobalPoseMethodBind, this.rawMemory, boneIdx)
    }


    private val getBoneCustomPoseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_custom_pose") }
    open fun getBoneCustomPose(boneIdx: Long): Transform {
        return _icall_Transform_Long(getBoneCustomPoseMethodBind, this.rawMemory, boneIdx)
    }


    private val setBoneCustomPoseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "set_bone_custom_pose") }
    open fun setBoneCustomPose(boneIdx: Long, customPose: Transform) {
        _icall_Unit_Long_Transform(setBoneCustomPoseMethodBind, this.rawMemory, boneIdx, customPose)
    }


    private val getBoneTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "get_bone_transform") }
    open fun getBoneTransform(boneIdx: Long): Transform {
        return _icall_Transform_Long(getBoneTransformMethodBind, this.rawMemory, boneIdx)
    }


    private val physicalBonesStopSimulationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "physical_bones_stop_simulation") }
    open fun physicalBonesStopSimulation() {
        _icall_Unit(physicalBonesStopSimulationMethodBind, this.rawMemory)
    }


    private val physicalBonesStartSimulationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "physical_bones_start_simulation") }
    open fun physicalBonesStartSimulation(bones: GDArray = GDArray()) {
        _icall_Unit_GDArray(physicalBonesStartSimulationMethodBind, this.rawMemory, bones)
    }


    private val physicalBonesAddCollisionExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "physical_bones_add_collision_exception") }
    open fun physicalBonesAddCollisionException(exception: RID) {
        _icall_Unit_RID(physicalBonesAddCollisionExceptionMethodBind, this.rawMemory, exception)
    }


    private val physicalBonesRemoveCollisionExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton", "physical_bones_remove_collision_exception") }
    open fun physicalBonesRemoveCollisionException(exception: RID) {
        _icall_Unit_RID(physicalBonesRemoveCollisionExceptionMethodBind, this.rawMemory, exception)
    }


}
