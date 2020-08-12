// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Physics2DServer
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.Variant
import godot.core.Vector2
import godot.icalls._icall_Boolean_RID
import godot.icalls._icall_Boolean_RID_Transform2D_Vector2_Boolean_Double_nObject
import godot.icalls._icall_Double_RID_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_RID
import godot.icalls._icall_Physics2DDirectBodyState_RID
import godot.icalls._icall_Physics2DDirectSpaceState_RID
import godot.icalls._icall_RID
import godot.icalls._icall_RID_RID
import godot.icalls._icall_RID_RID_Long
import godot.icalls._icall_RID_Vector2_RID_RID
import godot.icalls._icall_RID_Vector2_Vector2_RID_RID
import godot.icalls._icall_RID_Vector2_Vector2_Vector2_RID_RID
import godot.icalls._icall_Transform2D_RID
import godot.icalls._icall_Transform2D_RID_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_RID_Boolean
import godot.icalls._icall_Unit_RID_Double
import godot.icalls._icall_Unit_RID_Long
import godot.icalls._icall_Unit_RID_Long_Boolean
import godot.icalls._icall_Unit_RID_Long_Boolean_Double
import godot.icalls._icall_Unit_RID_Long_Double
import godot.icalls._icall_Unit_RID_Long_RID
import godot.icalls._icall_Unit_RID_Long_Transform2D
import godot.icalls._icall_Unit_RID_Long_Variant
import godot.icalls._icall_Unit_RID_Object_String
import godot.icalls._icall_Unit_RID_Object_String_nVariant
import godot.icalls._icall_Unit_RID_RID
import godot.icalls._icall_Unit_RID_RID_Transform2D_Boolean
import godot.icalls._icall_Unit_RID_Transform2D
import godot.icalls._icall_Unit_RID_Variant
import godot.icalls._icall_Unit_RID_Vector2
import godot.icalls._icall_Unit_RID_Vector2_Vector2
import godot.icalls._icall_Variant_RID
import godot.icalls._icall_Variant_RID_Long
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object Physics2DServer : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("Physics2DServer".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton Physics2DServer" }
        this@Physics2DServer.ptr = ptr
    }
  }

  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false
  ) {
    val mb = getMethodBind("Physics2DServer","area_add_shape")
    _icall_Unit_RID_RID_Transform2D_Boolean( mb, this.ptr, area, shape, transform, disabled)
  }

  fun areaAttachCanvasInstanceId(area: RID, id: Long) {
    val mb = getMethodBind("Physics2DServer","area_attach_canvas_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, area, id)
  }

  fun areaAttachObjectInstanceId(area: RID, id: Long) {
    val mb = getMethodBind("Physics2DServer","area_attach_object_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, area, id)
  }

  fun areaClearShapes(area: RID) {
    val mb = getMethodBind("Physics2DServer","area_clear_shapes")
    _icall_Unit_RID( mb, this.ptr, area)
  }

  fun areaCreate(): RID {
    val mb = getMethodBind("Physics2DServer","area_create")
    return _icall_RID( mb, this.ptr)
  }

  fun areaGetCanvasInstanceId(area: RID): Long {
    val mb = getMethodBind("Physics2DServer","area_get_canvas_instance_id")
    return _icall_Long_RID( mb, this.ptr, area)
  }

  fun areaGetObjectInstanceId(area: RID): Long {
    val mb = getMethodBind("Physics2DServer","area_get_object_instance_id")
    return _icall_Long_RID( mb, this.ptr, area)
  }

  fun areaGetParam(area: RID, param: Long): Variant {
    val mb = getMethodBind("Physics2DServer","area_get_param")
    return _icall_Variant_RID_Long( mb, this.ptr, area, param)
  }

  fun areaGetShape(area: RID, shapeIdx: Long): RID {
    val mb = getMethodBind("Physics2DServer","area_get_shape")
    return _icall_RID_RID_Long( mb, this.ptr, area, shapeIdx)
  }

  fun areaGetShapeCount(area: RID): Long {
    val mb = getMethodBind("Physics2DServer","area_get_shape_count")
    return _icall_Long_RID( mb, this.ptr, area)
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform2D {
    val mb = getMethodBind("Physics2DServer","area_get_shape_transform")
    return _icall_Transform2D_RID_Long( mb, this.ptr, area, shapeIdx)
  }

  fun areaGetSpace(area: RID): RID {
    val mb = getMethodBind("Physics2DServer","area_get_space")
    return _icall_RID_RID( mb, this.ptr, area)
  }

  fun areaGetSpaceOverrideMode(area: RID): Physics2DServer.AreaSpaceOverrideMode {
    val mb = getMethodBind("Physics2DServer","area_get_space_override_mode")
    return Physics2DServer.AreaSpaceOverrideMode.from( _icall_Long_RID( mb, this.ptr, area))
  }

  fun areaGetTransform(area: RID): Transform2D {
    val mb = getMethodBind("Physics2DServer","area_get_transform")
    return _icall_Transform2D_RID( mb, this.ptr, area)
  }

  fun areaRemoveShape(area: RID, shapeIdx: Long) {
    val mb = getMethodBind("Physics2DServer","area_remove_shape")
    _icall_Unit_RID_Long( mb, this.ptr, area, shapeIdx)
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val mb = getMethodBind("Physics2DServer","area_set_area_monitor_callback")
    _icall_Unit_RID_Object_String( mb, this.ptr, area, receiver, method)
  }

  fun areaSetCollisionLayer(area: RID, layer: Long) {
    val mb = getMethodBind("Physics2DServer","area_set_collision_layer")
    _icall_Unit_RID_Long( mb, this.ptr, area, layer)
  }

  fun areaSetCollisionMask(area: RID, mask: Long) {
    val mb = getMethodBind("Physics2DServer","area_set_collision_mask")
    _icall_Unit_RID_Long( mb, this.ptr, area, mask)
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val mb = getMethodBind("Physics2DServer","area_set_monitor_callback")
    _icall_Unit_RID_Object_String( mb, this.ptr, area, receiver, method)
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    val mb = getMethodBind("Physics2DServer","area_set_monitorable")
    _icall_Unit_RID_Boolean( mb, this.ptr, area, monitorable)
  }

  fun areaSetParam(
    area: RID,
    param: Long,
    value: Variant
  ) {
    val mb = getMethodBind("Physics2DServer","area_set_param")
    _icall_Unit_RID_Long_Variant( mb, this.ptr, area, param, value)
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    val mb = getMethodBind("Physics2DServer","area_set_shape")
    _icall_Unit_RID_Long_RID( mb, this.ptr, area, shapeIdx, shape)
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    val mb = getMethodBind("Physics2DServer","area_set_shape_disabled")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, area, shapeIdx, disabled)
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Long,
    transform: Transform2D
  ) {
    val mb = getMethodBind("Physics2DServer","area_set_shape_transform")
    _icall_Unit_RID_Long_Transform2D( mb, this.ptr, area, shapeIdx, transform)
  }

  fun areaSetSpace(area: RID, space: RID) {
    val mb = getMethodBind("Physics2DServer","area_set_space")
    _icall_Unit_RID_RID( mb, this.ptr, area, space)
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
    val mb = getMethodBind("Physics2DServer","area_set_space_override_mode")
    _icall_Unit_RID_Long( mb, this.ptr, area, mode)
  }

  fun areaSetTransform(area: RID, transform: Transform2D) {
    val mb = getMethodBind("Physics2DServer","area_set_transform")
    _icall_Unit_RID_Transform2D( mb, this.ptr, area, transform)
  }

  fun bodyAddCentralForce(body: RID, force: Vector2) {
    val mb = getMethodBind("Physics2DServer","body_add_central_force")
    _icall_Unit_RID_Vector2( mb, this.ptr, body, force)
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    val mb = getMethodBind("Physics2DServer","body_add_collision_exception")
    _icall_Unit_RID_RID( mb, this.ptr, body, exceptedBody)
  }

  fun bodyAddForce(
    body: RID,
    offset: Vector2,
    force: Vector2
  ) {
    val mb = getMethodBind("Physics2DServer","body_add_force")
    _icall_Unit_RID_Vector2_Vector2( mb, this.ptr, body, offset, force)
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D = Transform2D(),
    disabled: Boolean = false
  ) {
    val mb = getMethodBind("Physics2DServer","body_add_shape")
    _icall_Unit_RID_RID_Transform2D_Boolean( mb, this.ptr, body, shape, transform, disabled)
  }

  fun bodyAddTorque(body: RID, torque: Double) {
    val mb = getMethodBind("Physics2DServer","body_add_torque")
    _icall_Unit_RID_Double( mb, this.ptr, body, torque)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector2) {
    val mb = getMethodBind("Physics2DServer","body_apply_central_impulse")
    _icall_Unit_RID_Vector2( mb, this.ptr, body, impulse)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector2,
    impulse: Vector2
  ) {
    val mb = getMethodBind("Physics2DServer","body_apply_impulse")
    _icall_Unit_RID_Vector2_Vector2( mb, this.ptr, body, position, impulse)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Double) {
    val mb = getMethodBind("Physics2DServer","body_apply_torque_impulse")
    _icall_Unit_RID_Double( mb, this.ptr, body, impulse)
  }

  fun bodyAttachCanvasInstanceId(body: RID, id: Long) {
    val mb = getMethodBind("Physics2DServer","body_attach_canvas_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, body, id)
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Long) {
    val mb = getMethodBind("Physics2DServer","body_attach_object_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, body, id)
  }

  fun bodyClearShapes(body: RID) {
    val mb = getMethodBind("Physics2DServer","body_clear_shapes")
    _icall_Unit_RID( mb, this.ptr, body)
  }

  fun bodyCreate(): RID {
    val mb = getMethodBind("Physics2DServer","body_create")
    return _icall_RID( mb, this.ptr)
  }

  fun bodyGetCanvasInstanceId(body: RID): Long {
    val mb = getMethodBind("Physics2DServer","body_get_canvas_instance_id")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetCollisionLayer(body: RID): Long {
    val mb = getMethodBind("Physics2DServer","body_get_collision_layer")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetCollisionMask(body: RID): Long {
    val mb = getMethodBind("Physics2DServer","body_get_collision_mask")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetContinuousCollisionDetectionMode(body: RID): Physics2DServer.CCDMode {
    val mb = getMethodBind("Physics2DServer","body_get_continuous_collision_detection_mode")
    return Physics2DServer.CCDMode.from( _icall_Long_RID( mb, this.ptr, body))
  }

  fun bodyGetDirectState(body: RID): Physics2DDirectBodyState {
    val mb = getMethodBind("Physics2DServer","body_get_direct_state")
    return _icall_Physics2DDirectBodyState_RID( mb, this.ptr, body)
  }

  fun bodyGetMaxContactsReported(body: RID): Long {
    val mb = getMethodBind("Physics2DServer","body_get_max_contacts_reported")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetMode(body: RID): Physics2DServer.BodyMode {
    val mb = getMethodBind("Physics2DServer","body_get_mode")
    return Physics2DServer.BodyMode.from( _icall_Long_RID( mb, this.ptr, body))
  }

  fun bodyGetObjectInstanceId(body: RID): Long {
    val mb = getMethodBind("Physics2DServer","body_get_object_instance_id")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetParam(body: RID, param: Long): Double {
    val mb = getMethodBind("Physics2DServer","body_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, body, param)
  }

  fun bodyGetShape(body: RID, shapeIdx: Long): RID {
    val mb = getMethodBind("Physics2DServer","body_get_shape")
    return _icall_RID_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodyGetShapeCount(body: RID): Long {
    val mb = getMethodBind("Physics2DServer","body_get_shape_count")
    return _icall_Long_RID( mb, this.ptr, body)
  }

  fun bodyGetShapeMetadata(body: RID, shapeIdx: Long): Variant {
    val mb = getMethodBind("Physics2DServer","body_get_shape_metadata")
    return _icall_Variant_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform2D {
    val mb = getMethodBind("Physics2DServer","body_get_shape_transform")
    return _icall_Transform2D_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodyGetSpace(body: RID): RID {
    val mb = getMethodBind("Physics2DServer","body_get_space")
    return _icall_RID_RID( mb, this.ptr, body)
  }

  fun bodyGetState(body: RID, state: Long): Variant {
    val mb = getMethodBind("Physics2DServer","body_get_state")
    return _icall_Variant_RID_Long( mb, this.ptr, body, state)
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    val mb = getMethodBind("Physics2DServer","body_is_omitting_force_integration")
    return _icall_Boolean_RID( mb, this.ptr, body)
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    val mb = getMethodBind("Physics2DServer","body_remove_collision_exception")
    _icall_Unit_RID_RID( mb, this.ptr, body, exceptedBody)
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Long) {
    val mb = getMethodBind("Physics2DServer","body_remove_shape")
    _icall_Unit_RID_Long( mb, this.ptr, body, shapeIdx)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
    val mb = getMethodBind("Physics2DServer","body_set_axis_velocity")
    _icall_Unit_RID_Vector2( mb, this.ptr, body, axisVelocity)
  }

  fun bodySetCollisionLayer(body: RID, layer: Long) {
    val mb = getMethodBind("Physics2DServer","body_set_collision_layer")
    _icall_Unit_RID_Long( mb, this.ptr, body, layer)
  }

  fun bodySetCollisionMask(body: RID, mask: Long) {
    val mb = getMethodBind("Physics2DServer","body_set_collision_mask")
    _icall_Unit_RID_Long( mb, this.ptr, body, mask)
  }

  fun bodySetContinuousCollisionDetectionMode(body: RID, mode: Long) {
    val mb = getMethodBind("Physics2DServer","body_set_continuous_collision_detection_mode")
    _icall_Unit_RID_Long( mb, this.ptr, body, mode)
  }

  fun bodySetForceIntegrationCallback(
    body: RID,
    receiver: Object,
    method: String,
    userdata: Variant? = null
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_force_integration_callback")
    _icall_Unit_RID_Object_String_nVariant( mb, this.ptr, body, receiver, method, userdata)
  }

  fun bodySetMaxContactsReported(body: RID, amount: Long) {
    val mb = getMethodBind("Physics2DServer","body_set_max_contacts_reported")
    _icall_Unit_RID_Long( mb, this.ptr, body, amount)
  }

  fun bodySetMode(body: RID, mode: Long) {
    val mb = getMethodBind("Physics2DServer","body_set_mode")
    _icall_Unit_RID_Long( mb, this.ptr, body, mode)
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    val mb = getMethodBind("Physics2DServer","body_set_omit_force_integration")
    _icall_Unit_RID_Boolean( mb, this.ptr, body, enable)
  }

  fun bodySetParam(
    body: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, body, param, value)
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Long,
    shape: RID
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_shape")
    _icall_Unit_RID_Long_RID( mb, this.ptr, body, shapeIdx, shape)
  }

  fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Long,
    enable: Boolean,
    margin: Double
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_shape_as_one_way_collision")
    _icall_Unit_RID_Long_Boolean_Double( mb, this.ptr, body, shapeIdx, enable, margin)
  }

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Long,
    disabled: Boolean
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_shape_disabled")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, body, shapeIdx, disabled)
  }

  fun bodySetShapeMetadata(
    body: RID,
    shapeIdx: Long,
    metadata: Variant
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_shape_metadata")
    _icall_Unit_RID_Long_Variant( mb, this.ptr, body, shapeIdx, metadata)
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Long,
    transform: Transform2D
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_shape_transform")
    _icall_Unit_RID_Long_Transform2D( mb, this.ptr, body, shapeIdx, transform)
  }

  fun bodySetSpace(body: RID, space: RID) {
    val mb = getMethodBind("Physics2DServer","body_set_space")
    _icall_Unit_RID_RID( mb, this.ptr, body, space)
  }

  fun bodySetState(
    body: RID,
    state: Long,
    value: Variant
  ) {
    val mb = getMethodBind("Physics2DServer","body_set_state")
    _icall_Unit_RID_Long_Variant( mb, this.ptr, body, state, value)
  }

  fun bodyTestMotion(
    body: RID,
    from: Transform2D,
    motion: Vector2,
    infiniteInertia: Boolean,
    margin: Double = 0.08,
    result: Physics2DTestMotionResult? = null
  ): Boolean {
    val mb = getMethodBind("Physics2DServer","body_test_motion")
    return _icall_Boolean_RID_Transform2D_Vector2_Boolean_Double_nObject( mb, this.ptr, body, from,
        motion, infiniteInertia, margin, result)
  }

  fun capsuleShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","capsule_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun circleShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","circle_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun concavePolygonShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","concave_polygon_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun convexPolygonShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","convex_polygon_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun dampedSpringJointCreate(
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID = RID()
  ): RID {
    val mb = getMethodBind("Physics2DServer","damped_spring_joint_create")
    return _icall_RID_Vector2_Vector2_RID_RID( mb, this.ptr, anchorA, anchorB, bodyA, bodyB)
  }

  fun dampedStringJointGetParam(joint: RID, param: Long): Double {
    val mb = getMethodBind("Physics2DServer","damped_string_joint_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, joint, param)
  }

  fun dampedStringJointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("Physics2DServer","damped_string_joint_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, joint, param, value)
  }

  fun freeRid(rid: RID) {
    val mb = getMethodBind("Physics2DServer","free_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  fun getProcessInfo(processInfo: Long): Long {
    val mb = getMethodBind("Physics2DServer","get_process_info")
    return _icall_Long_Long( mb, this.ptr, processInfo)
  }

  fun grooveJointCreate(
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID = RID(),
    bodyB: RID = RID()
  ): RID {
    val mb = getMethodBind("Physics2DServer","groove_joint_create")
    return _icall_RID_Vector2_Vector2_Vector2_RID_RID( mb, this.ptr, groove1A, groove2A, anchorB,
        bodyA, bodyB)
  }

  fun jointGetParam(joint: RID, param: Long): Double {
    val mb = getMethodBind("Physics2DServer","joint_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, joint, param)
  }

  fun jointGetType(joint: RID): Physics2DServer.JointType {
    val mb = getMethodBind("Physics2DServer","joint_get_type")
    return Physics2DServer.JointType.from( _icall_Long_RID( mb, this.ptr, joint))
  }

  fun jointSetParam(
    joint: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("Physics2DServer","joint_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, joint, param, value)
  }

  fun lineShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","line_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun pinJointCreate(
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID = RID()
  ): RID {
    val mb = getMethodBind("Physics2DServer","pin_joint_create")
    return _icall_RID_Vector2_RID_RID( mb, this.ptr, anchor, bodyA, bodyB)
  }

  fun rayShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","ray_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun rectangleShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","rectangle_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun segmentShapeCreate(): RID {
    val mb = getMethodBind("Physics2DServer","segment_shape_create")
    return _icall_RID( mb, this.ptr)
  }

  fun setActive(active: Boolean) {
    val mb = getMethodBind("Physics2DServer","set_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  fun shapeGetData(shape: RID): Variant {
    val mb = getMethodBind("Physics2DServer","shape_get_data")
    return _icall_Variant_RID( mb, this.ptr, shape)
  }

  fun shapeGetType(shape: RID): Physics2DServer.ShapeType {
    val mb = getMethodBind("Physics2DServer","shape_get_type")
    return Physics2DServer.ShapeType.from( _icall_Long_RID( mb, this.ptr, shape))
  }

  fun shapeSetData(shape: RID, data: Variant) {
    val mb = getMethodBind("Physics2DServer","shape_set_data")
    _icall_Unit_RID_Variant( mb, this.ptr, shape, data)
  }

  fun spaceCreate(): RID {
    val mb = getMethodBind("Physics2DServer","space_create")
    return _icall_RID( mb, this.ptr)
  }

  fun spaceGetDirectState(space: RID): Physics2DDirectSpaceState {
    val mb = getMethodBind("Physics2DServer","space_get_direct_state")
    return _icall_Physics2DDirectSpaceState_RID( mb, this.ptr, space)
  }

  fun spaceGetParam(space: RID, param: Long): Double {
    val mb = getMethodBind("Physics2DServer","space_get_param")
    return _icall_Double_RID_Long( mb, this.ptr, space, param)
  }

  fun spaceIsActive(space: RID): Boolean {
    val mb = getMethodBind("Physics2DServer","space_is_active")
    return _icall_Boolean_RID( mb, this.ptr, space)
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    val mb = getMethodBind("Physics2DServer","space_set_active")
    _icall_Unit_RID_Boolean( mb, this.ptr, space, active)
  }

  fun spaceSetParam(
    space: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("Physics2DServer","space_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, space, param, value)
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

  enum class DampedStringParam(
    id: Long
  ) {
    DAMPED_STRING_REST_LENGTH(0),

    DAMPED_STRING_STIFFNESS(1),

    DAMPED_STRING_DAMPING(2);

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
    SHAPE_LINE(0),

    SHAPE_RAY(1),

    SHAPE_SEGMENT(2),

    SHAPE_CIRCLE(3),

    SHAPE_RECTANGLE(4),

    SHAPE_CAPSULE(5),

    SHAPE_CONVEX_POLYGON(6),

    SHAPE_CONCAVE_POLYGON(7),

    SHAPE_CUSTOM(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class JointParam(
    id: Long
  ) {
    JOINT_PARAM_BIAS(0),

    JOINT_PARAM_MAX_BIAS(1),

    JOINT_PARAM_MAX_FORCE(2);

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

    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(6),

    SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(7);

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

    JOINT_GROOVE(1),

    JOINT_DAMPED_SPRING(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CCDMode(
    id: Long
  ) {
    CCD_MODE_DISABLED(0),

    CCD_MODE_CAST_RAY(1),

    CCD_MODE_CAST_SHAPE(2);

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

    BODY_PARAM_INERTIA(3),

    BODY_PARAM_GRAVITY_SCALE(4),

    BODY_PARAM_LINEAR_DAMP(5),

    BODY_PARAM_ANGULAR_DAMP(6),

    BODY_PARAM_MAX(7);

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
