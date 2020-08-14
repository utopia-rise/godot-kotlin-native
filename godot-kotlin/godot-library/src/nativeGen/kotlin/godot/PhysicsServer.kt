// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.PhysicsServer
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
import godot.core.Vector3
import godot.icalls._icall_Boolean_RID
import godot.icalls._icall_Boolean_RID_Long
import godot.icalls._icall_Boolean_RID_Long_Long
import godot.icalls._icall_Double_RID
import godot.icalls._icall_Double_RID_Long
import godot.icalls._icall_Double_RID_Long_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_RID
import godot.icalls._icall_PhysicsDirectBodyState_RID
import godot.icalls._icall_PhysicsDirectSpaceState_RID
import godot.icalls._icall_RID
import godot.icalls._icall_RID_Long
import godot.icalls._icall_RID_Long_Boolean
import godot.icalls._icall_RID_RID
import godot.icalls._icall_RID_RID_Long
import godot.icalls._icall_RID_RID_Transform_RID_Transform
import godot.icalls._icall_RID_RID_Vector3_RID_Vector3
import godot.icalls._icall_Transform_RID
import godot.icalls._icall_Transform_RID_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_RID_Boolean
import godot.icalls._icall_Unit_RID_Double
import godot.icalls._icall_Unit_RID_Long
import godot.icalls._icall_Unit_RID_Long_Boolean
import godot.icalls._icall_Unit_RID_Long_Double
import godot.icalls._icall_Unit_RID_Long_Long_Boolean
import godot.icalls._icall_Unit_RID_Long_Long_Double
import godot.icalls._icall_Unit_RID_Long_RID
import godot.icalls._icall_Unit_RID_Long_Transform
import godot.icalls._icall_Unit_RID_Long_Variant
import godot.icalls._icall_Unit_RID_Object_String
import godot.icalls._icall_Unit_RID_Object_String_nVariant
import godot.icalls._icall_Unit_RID_RID
import godot.icalls._icall_Unit_RID_RID_Transform_Boolean
import godot.icalls._icall_Unit_RID_Transform
import godot.icalls._icall_Unit_RID_Variant
import godot.icalls._icall_Unit_RID_Vector3
import godot.icalls._icall_Unit_RID_Vector3_Vector3
import godot.icalls._icall_Variant_RID
import godot.icalls._icall_Variant_RID_Long
import godot.icalls._icall_Vector3_RID
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object PhysicsServer : Object() {
  override fun __new(): COpaquePointer = memScoped {
      val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("PhysicsServer".cstr.ptr)
      requireNotNull(ptr) { "No instance found for singleton PhysicsServer" }
      ptr
  }

  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform = Transform(),
    disabled: Boolean = false
  ) {
    val mb = getMethodBind("PhysicsServer","area_add_shape")
    _icall_Unit_RID_RID_Transform_Boolean( mb, this.ptr, area, shape, transform, disabled)
  }

  fun areaAttachObjectInstanceId(area: RID, id: Long) {
    val mb = getMethodBind("PhysicsServer","area_attach_object_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, area, id)
  }

  fun areaClearShapes(area: RID) {
    val mb = getMethodBind("PhysicsServer","area_clear_shapes")
    _icall_Unit_RID( mb, this.ptr, area)
  }

  fun areaCreate(): RID {
    val mb = getMethodBind("PhysicsServer","area_create")
    return _icall_RID( mb, this.ptr)
  }

  fun areaGetObjectInstanceId(area: RID): Long {
    val mb = getMethodBind("PhysicsServer","area_get_object_instance_id")
    return _icall_Long_RID( mb, this.ptr, area)
  }

  fun areaGetParam(area: RID, param: Long): Variant {
    val mb = getMethodBind("PhysicsServer","area_get_param")
    return _icall_Variant_RID_Long( mb, this.ptr, area, param)
  }

  fun areaGetShape(area: RID, shapeIdx: Long): RID {
    val mb = getMethodBind("PhysicsServer","area_get_shape")
    return _icall_RID_RID_Long( mb, this.ptr, area, shapeIdx)
  }

  fun areaGetShapeCount(area: RID): Long {
    val mb = getMethodBind("PhysicsServer","area_get_shape_count")
    return _icall_Long_RID( mb, this.ptr, area)
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform {
    val mb = getMethodBind("PhysicsServer","area_get_shape_transform")
    return _icall_Transform_RID_Long( mb, this.ptr, area, shapeIdx)
  }

  fun areaGetSpace(area: RID): RID {
    val mb = getMethodBind("PhysicsServer","area_get_space")
    return _icall_RID_RID( mb, this.ptr, area)
  }

  fun areaGetSpaceOverrideMode(area: RID): PhysicsServer.AreaSpaceOverrideMode {
    val mb = getMethodBind("PhysicsServer","area_get_space_override_mode")
    return PhysicsServer.AreaSpaceOverrideMode.from( _icall_Long_RID( mb, this.ptr, area))
  }

  fun areaGetTransform(area: RID): Transform {
    val mb = getMethodBind("PhysicsServer","area_get_transform")
    return _icall_Transform_RID( mb, this.ptr, area)
  }

  fun areaIsRayPickable(area: RID): Boolean {
    val mb = getMethodBind("PhysicsServer","area_is_ray_pickable")
    return _icall_Boolean_RID( mb, this.ptr, area)
  }

  fun areaRemoveShape(area: RID, shapeIdx: Long) {
    val mb = getMethodBind("PhysicsServer","area_remove_shape")
    _icall_Unit_RID_Long( mb, this.ptr, area, shapeIdx)
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val mb = getMethodBind("PhysicsServer","area_set_area_monitor_callback")
    _icall_Unit_RID_Object_String( mb, this.ptr, area, receiver, method)
  }

  fun areaSetCollisionLayer(area: RID, layer: Long) {
    val mb = getMethodBind("PhysicsServer","area_set_collision_layer")
    _icall_Unit_RID_Long( mb, this.ptr, area, layer)
  }

  fun areaSetCollisionMask(area: RID, mask: Long) {
    val mb = getMethodBind("PhysicsServer","area_set_collision_mask")
    _icall_Unit_RID_Long( mb, this.ptr, area, mask)
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val mb = getMethodBind("PhysicsServer","area_set_monitor_callback")
    _icall_Unit_RID_Object_String( mb, this.ptr, area, receiver, method)
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    val mb = getMethodBind("PhysicsServer","area_set_monitorable")
    _icall_Unit_RID_Boolean( mb, this.ptr, area, monitorable)
  }

  fun areaSetParam(
    area: RID,
    param: Long,
    value: Variant
  ) {
    val mb = getMethodBind("PhysicsServer","area_set_param")
    _icall_Unit_RID_Long_Variant( mb, this.ptr, area, param, value)
  }

  fun areaSetRayPickable(area: RID, enable: Boolean) {
    val mb = getMethodBind("PhysicsServer","area_set_ray_pickable")
    _icall_Unit_RID_Boolean( mb, this.ptr, area, enable)
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    val mb = getMethodBind("PhysicsServer","area_set_shape")
    _icall_Unit_RID_Long_RID( mb, this.ptr, area, shapeIdx, shape)
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    val mb = getMethodBind("PhysicsServer","area_set_shape_disabled")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, area, shapeIdx, disabled)
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform
  ) {
    val mb = getMethodBind("PhysicsServer","area_set_shape_transform")
    _icall_Unit_RID_Long_Transform( mb, this.ptr, area, shapeIdx, transform)
  }

  fun areaSetSpace(area: RID, space: RID) {
    val mb = getMethodBind("PhysicsServer","area_set_space")
    _icall_Unit_RID_RID( mb, this.ptr, area, space)
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
    val mb = getMethodBind("PhysicsServer","area_set_space_override_mode")
    _icall_Unit_RID_Long( mb, this.ptr, area, mode)
  }

  fun areaSetTransform(area: RID, transform: Transform) {
    val mb = getMethodBind("PhysicsServer","area_set_transform")
    _icall_Unit_RID_Transform( mb, this.ptr, area, transform)
  }

  fun bodyAddCentralForce(body: RID, force: Vector3) {
    val mb = getMethodBind("PhysicsServer","body_add_central_force")
    _icall_Unit_RID_Vector3( mb, this.ptr, body, force)
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    val mb = getMethodBind("PhysicsServer","body_add_collision_exception")
    _icall_Unit_RID_RID( mb, this.ptr, body, exceptedBody)
  }

  fun bodyAddForce(
    body: RID,
    force: Vector3,
    position: Vector3
  ) {
    val mb = getMethodBind("PhysicsServer","body_add_force")
    _icall_Unit_RID_Vector3_Vector3( mb, this.ptr, body, force, position)
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform = Transform(),
    disabled: Boolean = false
  ) {
    val mb = getMethodBind("PhysicsServer","body_add_shape")
    _icall_Unit_RID_RID_Transform_Boolean( mb, this.ptr, body, shape, transform, disabled)
  }

  fun bodyAddTorque(body: RID, torque: Vector3) {
    val mb = getMethodBind("PhysicsServer","body_add_torque")
    _icall_Unit_RID_Vector3( mb, this.ptr, body, torque)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector3) {
    val mb = getMethodBind("PhysicsServer","body_apply_central_impulse")
    _icall_Unit_RID_Vector3( mb, this.ptr, body, impulse)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector3,
    impulse: Vector3
  ) {
    val mb = getMethodBind("PhysicsServer","body_apply_impulse")
    _icall_Unit_RID_Vector3_Vector3( mb, this.ptr, body, position, impulse)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
    val mb = getMethodBind("PhysicsServer","body_apply_torque_impulse")
    _icall_Unit_RID_Vector3( mb, this.ptr, body, impulse)
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    val mb = getMethodBind("PhysicsServer","body_attach_object_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, body, id)
  }

  fun bodyClearShapes(body: RID) {
    val mb = getMethodBind("PhysicsServer","body_clear_shapes")
    _icall_Unit_RID( mb, this.ptr, body)
  }

  fun bodyCreate(mode: Long = 2, initSleeping: Boolean = false): RID {
    val mb = getMethodBind("PhysicsServer","body_create")
    return _icall_RID_Long_Boolean( mb, this.ptr, mode, initSleeping)
  }

  fun bodyGetCollisionLayer(body: RID): Long {
    val mb = getMethodBind("PhysicsServer","body_get_collision_layer")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetCollisionMask(body: RID): Long {
    val mb = getMethodBind("PhysicsServer","body_get_collision_mask")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetDirectState(body: RID): PhysicsDirectBodyState {
    val mb = getMethodBind("PhysicsServer","body_get_direct_state")
    return _icall_PhysicsDirectBodyState_RID( mb, this.ptr, body)
  }

  fun bodyGetKinematicSafeMargin(body: RID): Double {
    val mb = getMethodBind("PhysicsServer","body_get_kinematic_safe_margin")
    return _icall_Double_RID( mb, this.ptr, body)
  }

  fun bodyGetMaxContactsReported(body: RID): Long {
    val mb = getMethodBind("PhysicsServer","body_get_max_contacts_reported")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetMode(body: RID): PhysicsServer.BodyMode {
    val mb = getMethodBind("PhysicsServer","body_get_mode")
    return PhysicsServer.BodyMode.from( _icall_Long_RID( mb, this.ptr, body))
  }

  fun bodyGetObjectInstanceId(body: RID): Long {
    val mb = getMethodBind("PhysicsServer","body_get_object_instance_id")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetParam(body: RID, param: Long): Double {
    val mb = getMethodBind("PhysicsServer","body_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, body, param)
  }

  fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    val mb = getMethodBind("PhysicsServer","body_get_shape")
    return _icall_RID_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodyGetShapeCount(body: RID): Long {
    val mb = getMethodBind("PhysicsServer","body_get_shape_count")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform {
    val mb = getMethodBind("PhysicsServer","body_get_shape_transform")
    return _icall_Transform_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodyGetSpace(body: RID): RID {
    val mb = getMethodBind("PhysicsServer","body_get_space")
    return _icall_RID_RID( mb, this.ptr, body)
  }

  fun bodyGetState(body: RID, state: Long): Variant {
    val mb = getMethodBind("PhysicsServer","body_get_state")
    return _icall_Variant_RID_Long( mb, this.ptr, body, state)
  }

  fun bodyIsAxisLocked(body: RID, axis: Long): Boolean {
    val mb = getMethodBind("PhysicsServer","body_is_axis_locked")
    return _icall_Boolean_RID_Long( mb, this.ptr, body, axis)
  }

  fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    val mb = getMethodBind("PhysicsServer","body_is_continuous_collision_detection_enabled")
    return _icall_Boolean_RID( mb, this.ptr, body)
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    val mb = getMethodBind("PhysicsServer","body_is_omitting_force_integration")
    return _icall_Boolean_RID( mb, this.ptr, body)
  }

  fun bodyIsRayPickable(body: RID): Boolean {
    val mb = getMethodBind("PhysicsServer","body_is_ray_pickable")
    return _icall_Boolean_RID( mb, this.ptr, body)
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    val mb = getMethodBind("PhysicsServer","body_remove_collision_exception")
    _icall_Unit_RID_RID( mb, this.ptr, body, exceptedBody)
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Long) {
    val mb = getMethodBind("PhysicsServer","body_remove_shape")
    _icall_Unit_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodySetAxisLock(
    body: RID,
    axis: Long,
    lock: Boolean
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_axis_lock")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, body, axis, lock)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
    val mb = getMethodBind("PhysicsServer","body_set_axis_velocity")
    _icall_Unit_RID_Vector3( mb, this.ptr, body, axisVelocity)
  }

  fun bodySetCollisionLayer(body: RID, layer: Long) {
    val mb = getMethodBind("PhysicsServer","body_set_collision_layer")
    _icall_Unit_RID_Long( mb, this.ptr, body, layer)
  }

  fun bodySetCollisionMask(body: RID, mask: Long) {
    val mb = getMethodBind("PhysicsServer","body_set_collision_mask")
    _icall_Unit_RID_Long( mb, this.ptr, body, mask)
  }

  fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
    val mb = getMethodBind("PhysicsServer","body_set_enable_continuous_collision_detection")
    _icall_Unit_RID_Boolean( mb, this.ptr, body, enable)
  }

  fun bodySetForceIntegrationCallback(
    body: RID,
    receiver: Object,
    method: String,
    userdata: Variant? = null
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_force_integration_callback")
    _icall_Unit_RID_Object_String_nVariant( mb, this.ptr, body, receiver, method, userdata)
  }

  fun bodySetKinematicSafeMargin(body: RID, margin: Double) {
    val mb = getMethodBind("PhysicsServer","body_set_kinematic_safe_margin")
    _icall_Unit_RID_Double( mb, this.ptr, body, margin)
  }

  fun bodySetMaxContactsReported(body: RID, amount: Long) {
    val mb = getMethodBind("PhysicsServer","body_set_max_contacts_reported")
    _icall_Unit_RID_Long( mb, this.ptr, body, amount)
  }

  fun bodySetMode(body: RID, mode: Long) {
    val mb = getMethodBind("PhysicsServer","body_set_mode")
    _icall_Unit_RID_Long( mb, this.ptr, body, mode)
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    val mb = getMethodBind("PhysicsServer","body_set_omit_force_integration")
    _icall_Unit_RID_Boolean( mb, this.ptr, body, enable)
  }

  fun bodySetParam(
    body: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, body, param, value)
  }

  fun bodySetRayPickable(body: RID, enable: Boolean) {
    val mb = getMethodBind("PhysicsServer","body_set_ray_pickable")
    _icall_Unit_RID_Boolean( mb, this.ptr, body, enable)
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_shape")
    _icall_Unit_RID_Long_RID( mb, this.ptr, body, shapeIdx, shape)
  }

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_shape_disabled")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, body, shapeIdx, disabled)
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_shape_transform")
    _icall_Unit_RID_Long_Transform( mb, this.ptr, body, shapeIdx, transform)
  }

  fun bodySetSpace(body: RID, space: RID) {
    val mb = getMethodBind("PhysicsServer","body_set_space")
    _icall_Unit_RID_RID( mb, this.ptr, body, space)
  }

  fun bodySetState(
    body: RID,
    state: Long,
    value: Variant
  ) {
    val mb = getMethodBind("PhysicsServer","body_set_state")
    _icall_Unit_RID_Long_Variant( mb, this.ptr, body, state, value)
  }

  fun coneTwistJointGetParam(joint: RID, param: Long): Double {
    val mb = getMethodBind("PhysicsServer","cone_twist_joint_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, joint, param)
  }

  fun coneTwistJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","cone_twist_joint_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, joint, param, value)
  }

  fun freeRid(rid: RID) {
    val mb = getMethodBind("PhysicsServer","free_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  fun generic6dofJointGetFlag(
    joint: RID,
    axis: Long,
    flag: Long
  ): Boolean {
    val mb = getMethodBind("PhysicsServer","generic_6dof_joint_get_flag")
    return _icall_Boolean_RID_Long_Long( mb, this.ptr, joint, axis, flag)
  }

  fun generic6dofJointGetParam(
    joint: RID,
    axis: Long,
    param: Long
  ): Double {
    val mb = getMethodBind("PhysicsServer","generic_6dof_joint_get_param")
    return _icall_Double_RID_Long_Long( mb, this.ptr, joint, axis, param)
  }

  fun generic6dofJointSetFlag(
    joint: RID,
    axis: Long,
    flag: Long,
    enable: Boolean
  ) {
    val mb = getMethodBind("PhysicsServer","generic_6dof_joint_set_flag")
    _icall_Unit_RID_Long_Long_Boolean( mb, this.ptr, joint, axis, flag, enable)
  }

  fun generic6dofJointSetParam(
    joint: RID,
    axis: Long,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","generic_6dof_joint_set_param")
    _icall_Unit_RID_Long_Long_Double( mb, this.ptr, joint, axis, param, value)
  }

  fun getProcessInfo(processInfo: Long): Long {
    val mb = getMethodBind("PhysicsServer","get_process_info")
    return _icall_Long_Long( mb, this.ptr, processInfo)
  }

  fun hingeJointGetFlag(joint: RID, flag: Long): Boolean {
    val mb = getMethodBind("PhysicsServer","hinge_joint_get_flag")
    return _icall_Boolean_RID_Long( mb, this.ptr, joint, flag)
  }

  fun hingeJointGetParam(joint: RID, param: Long): Double {
    val mb = getMethodBind("PhysicsServer","hinge_joint_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, joint, param)
  }

  fun hingeJointSetFlag(
    joint: RID,
    flag: Long,
    enabled: Boolean
  ) {
    val mb = getMethodBind("PhysicsServer","hinge_joint_set_flag")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, joint, flag, enabled)
  }

  fun hingeJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","hinge_joint_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, joint, param, value)
  }

  fun jointCreateConeTwist(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val mb = getMethodBind("PhysicsServer","joint_create_cone_twist")
    return _icall_RID_RID_Transform_RID_Transform( mb, this.ptr, bodyA, localRefA, bodyB, localRefB)
  }

  fun jointCreateGeneric6dof(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val mb = getMethodBind("PhysicsServer","joint_create_generic_6dof")
    return _icall_RID_RID_Transform_RID_Transform( mb, this.ptr, bodyA, localRefA, bodyB, localRefB)
  }

  fun jointCreateHinge(
    bodyA: RID,
    hingeA: Transform,
    bodyB: RID,
    hingeB: Transform
  ): RID {
    val mb = getMethodBind("PhysicsServer","joint_create_hinge")
    return _icall_RID_RID_Transform_RID_Transform( mb, this.ptr, bodyA, hingeA, bodyB, hingeB)
  }

  fun jointCreatePin(
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3
  ): RID {
    val mb = getMethodBind("PhysicsServer","joint_create_pin")
    return _icall_RID_RID_Vector3_RID_Vector3( mb, this.ptr, bodyA, localA, bodyB, localB)
  }

  fun jointCreateSlider(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val mb = getMethodBind("PhysicsServer","joint_create_slider")
    return _icall_RID_RID_Transform_RID_Transform( mb, this.ptr, bodyA, localRefA, bodyB, localRefB)
  }

  fun jointGetSolverPriority(joint: RID): Long {
    val mb = getMethodBind("PhysicsServer","joint_get_solver_priority")
    return _icall_Long_RID( mb, this.ptr, joint)
  }

  fun jointGetType(joint: RID): PhysicsServer.JointType {
    val mb = getMethodBind("PhysicsServer","joint_get_type")
    return PhysicsServer.JointType.from( _icall_Long_RID( mb, this.ptr, joint))
  }

  fun jointSetSolverPriority(joint: RID, priority: Long) {
    val mb = getMethodBind("PhysicsServer","joint_set_solver_priority")
    _icall_Unit_RID_Long( mb, this.ptr, joint, priority)
  }

  fun pinJointGetLocalA(joint: RID): Vector3 {
    val mb = getMethodBind("PhysicsServer","pin_joint_get_local_a")
    return _icall_Vector3_RID( mb, this.ptr, joint)
  }

  fun pinJointGetLocalB(joint: RID): Vector3 {
    val mb = getMethodBind("PhysicsServer","pin_joint_get_local_b")
    return _icall_Vector3_RID( mb, this.ptr, joint)
  }

  fun pinJointGetParam(joint: RID, param: Long): Double {
    val mb = getMethodBind("PhysicsServer","pin_joint_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, joint, param)
  }

  fun pinJointSetLocalA(joint: RID, localA: Vector3) {
    val mb = getMethodBind("PhysicsServer","pin_joint_set_local_a")
    _icall_Unit_RID_Vector3( mb, this.ptr, joint, localA)
  }

  fun pinJointSetLocalB(joint: RID, localB: Vector3) {
    val mb = getMethodBind("PhysicsServer","pin_joint_set_local_b")
    _icall_Unit_RID_Vector3( mb, this.ptr, joint, localB)
  }

  fun pinJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","pin_joint_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, joint, param, value)
  }

  fun setActive(active: Boolean) {
    val mb = getMethodBind("PhysicsServer","set_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  fun shapeCreate(type: Long): RID {
    val mb = getMethodBind("PhysicsServer","shape_create")
    return _icall_RID_Long( mb, this.ptr, type)
  }

  fun shapeGetData(shape: RID): Variant {
    val mb = getMethodBind("PhysicsServer","shape_get_data")
    return _icall_Variant_RID( mb, this.ptr, shape)
  }

  fun shapeGetType(shape: RID): PhysicsServer.ShapeType {
    val mb = getMethodBind("PhysicsServer","shape_get_type")
    return PhysicsServer.ShapeType.from( _icall_Long_RID( mb, this.ptr, shape))
  }

  fun shapeSetData(shape: RID, data: Variant) {
    val mb = getMethodBind("PhysicsServer","shape_set_data")
    _icall_Unit_RID_Variant( mb, this.ptr, shape, data)
  }

  fun sliderJointGetParam(joint: RID, param: Long): Double {
    val mb = getMethodBind("PhysicsServer","slider_joint_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, joint, param)
  }

  fun sliderJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","slider_joint_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, joint, param, value)
  }

  fun spaceCreate(): RID {
    val mb = getMethodBind("PhysicsServer","space_create")
    return _icall_RID( mb, this.ptr)
  }

  fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState {
    val mb = getMethodBind("PhysicsServer","space_get_direct_state")
    return _icall_PhysicsDirectSpaceState_RID( mb, this.ptr, space)
  }

  fun spaceGetParam(space: RID, param: Long): Double {
    val mb = getMethodBind("PhysicsServer","space_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, space, param)
  }

  fun spaceIsActive(space: RID): Boolean {
    val mb = getMethodBind("PhysicsServer","space_is_active")
    return _icall_Boolean_RID( mb, this.ptr, space)
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    val mb = getMethodBind("PhysicsServer","space_set_active")
    _icall_Unit_RID_Boolean( mb, this.ptr, space, active)
  }

  fun spaceSetParam(
    space: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("PhysicsServer","space_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, space, param, value)
  }

  enum class BodyAxis(
    id: Long
  ) {
    BODY_AXIS_LINEAR_X(1),

    BODY_AXIS_LINEAR_Y(2),

    BODY_AXIS_LINEAR_Z(4),

    BODY_AXIS_ANGULAR_X(8),

    BODY_AXIS_ANGULAR_Y(16),

    BODY_AXIS_ANGULAR_Z(32);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ProcessInfo(
    id: Long
  ) {
    INFO_ACTIVE_OBJECTS(0),

    INFO_COLLISION_PAIRS(1),

    INFO_ISLAND_COUNT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AreaBodyStatus(
    id: Long
  ) {
    AREA_BODY_ADDED(0),

    AREA_BODY_REMOVED(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BodyMode(
    id: Long
  ) {
    BODY_MODE_STATIC(0),

    BODY_MODE_KINEMATIC(1),

    BODY_MODE_RIGID(2),

    BODY_MODE_CHARACTER(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShapeType(
    id: Long
  ) {
    SHAPE_PLANE(0),

    SHAPE_RAY(1),

    SHAPE_SPHERE(2),

    SHAPE_BOX(3),

    SHAPE_CAPSULE(4),

    SHAPE_CYLINDER(5),

    SHAPE_CONVEX_POLYGON(6),

    SHAPE_CONCAVE_POLYGON(7),

    SHAPE_HEIGHTMAP(8),

    SHAPE_CUSTOM(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PinJointParam(
    id: Long
  ) {
    PIN_JOINT_BIAS(0),

    PIN_JOINT_DAMPING(1),

    PIN_JOINT_IMPULSE_CLAMP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SpaceParameter(
    id: Long
  ) {
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),

    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),

    SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION(2),

    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),

    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),

    SPACE_PARAM_BODY_TIME_TO_SLEEP(5),

    SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO(6),

    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),

    SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ConeTwistJointParam(
    id: Long
  ) {
    CONE_TWIST_JOINT_SWING_SPAN(0),

    CONE_TWIST_JOINT_TWIST_SPAN(1),

    CONE_TWIST_JOINT_BIAS(2),

    CONE_TWIST_JOINT_SOFTNESS(3),

    CONE_TWIST_JOINT_RELAXATION(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class JointType(
    id: Long
  ) {
    JOINT_PIN(0),

    JOINT_HINGE(1),

    JOINT_SLIDER(2),

    JOINT_CONE_TWIST(3),

    JOINT_6DOF(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BodyState(
    id: Long
  ) {
    BODY_STATE_TRANSFORM(0),

    BODY_STATE_LINEAR_VELOCITY(1),

    BODY_STATE_ANGULAR_VELOCITY(2),

    BODY_STATE_SLEEPING(3),

    BODY_STATE_CAN_SLEEP(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BodyParameter(
    id: Long
  ) {
    BODY_PARAM_BOUNCE(0),

    BODY_PARAM_FRICTION(1),

    BODY_PARAM_MASS(2),

    BODY_PARAM_GRAVITY_SCALE(3),

    BODY_PARAM_LINEAR_DAMP(4),

    BODY_PARAM_ANGULAR_DAMP(5),

    BODY_PARAM_MAX(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class G6DOFJointAxisParam(
    id: Long
  ) {
    G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),

    G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),

    G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    G6DOF_JOINT_LINEAR_RESTITUTION(3),

    G6DOF_JOINT_LINEAR_DAMPING(4),

    G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY(5),

    G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT(6),

    G6DOF_JOINT_ANGULAR_LOWER_LIMIT(10),

    G6DOF_JOINT_ANGULAR_UPPER_LIMIT(11),

    G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS(12),

    G6DOF_JOINT_ANGULAR_DAMPING(13),

    G6DOF_JOINT_ANGULAR_RESTITUTION(14),

    G6DOF_JOINT_ANGULAR_FORCE_LIMIT(15),

    G6DOF_JOINT_ANGULAR_ERP(16),

    G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(17),

    G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT(18);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SliderJointParam(
    id: Long
  ) {
    SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),

    SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),

    SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),

    SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),

    SLIDER_JOINT_LINEAR_MOTION_SOFTNESS(5),

    SLIDER_JOINT_LINEAR_MOTION_RESTITUTION(6),

    SLIDER_JOINT_LINEAR_MOTION_DAMPING(7),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS(8),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION(9),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING(10),

    SLIDER_JOINT_ANGULAR_LIMIT_UPPER(11),

    SLIDER_JOINT_ANGULAR_LIMIT_LOWER(12),

    SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS(13),

    SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION(14),

    SLIDER_JOINT_ANGULAR_LIMIT_DAMPING(15),

    SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS(16),

    SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION(17),

    SLIDER_JOINT_ANGULAR_MOTION_DAMPING(18),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS(19),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION(20),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING(21),

    SLIDER_JOINT_MAX(22);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class HingeJointParam(
    id: Long
  ) {
    HINGE_JOINT_BIAS(0),

    HINGE_JOINT_LIMIT_UPPER(1),

    HINGE_JOINT_LIMIT_LOWER(2),

    HINGE_JOINT_LIMIT_BIAS(3),

    HINGE_JOINT_LIMIT_SOFTNESS(4),

    HINGE_JOINT_LIMIT_RELAXATION(5),

    HINGE_JOINT_MOTOR_TARGET_VELOCITY(6),

    HINGE_JOINT_MOTOR_MAX_IMPULSE(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class G6DOFJointAxisFlag(
    id: Long
  ) {
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),

    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),

    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),

    G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class HingeJointFlag(
    id: Long
  ) {
    HINGE_JOINT_FLAG_USE_LIMIT(0),

    HINGE_JOINT_FLAG_ENABLE_MOTOR(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AreaSpaceOverrideMode(
    id: Long
  ) {
    AREA_SPACE_OVERRIDE_DISABLED(0),

    AREA_SPACE_OVERRIDE_COMBINE(1),

    AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),

    AREA_SPACE_OVERRIDE_REPLACE(3),

    AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AreaParameter(
    id: Long
  ) {
    AREA_PARAM_GRAVITY(0),

    AREA_PARAM_GRAVITY_VECTOR(1),

    AREA_PARAM_GRAVITY_IS_POINT(2),

    AREA_PARAM_GRAVITY_DISTANCE_SCALE(3),

    AREA_PARAM_GRAVITY_POINT_ATTENUATION(4),

    AREA_PARAM_LINEAR_DAMP(5),

    AREA_PARAM_ANGULAR_DAMP(6),

    AREA_PARAM_PRIORITY(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
