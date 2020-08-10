// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Transform
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Spatial
import godot.icalls._icall_SpatialGizmo
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Transform
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Unit_Vector3_Double
import godot.icalls._icall_Unit_Vector3_Vector3
import godot.icalls._icall_Unit_Vector3_Vector3_Vector3
import godot.icalls._icall_Vector3
import godot.icalls._icall_Vector3_Vector3
import godot.icalls._icall_World
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Spatial internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val visibilityChanged: Signal0 by signal()

  open var gizmo: SpatialGizmo
    get() {
      val mb = getMethodBind("Spatial","get_gizmo")
      return _icall_SpatialGizmo(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_gizmo")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var globalTransform: Transform
    get() {
      val mb = getMethodBind("Spatial","get_global_transform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_global_transform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  open var rotation: Vector3
    get() {
      val mb = getMethodBind("Spatial","get_rotation")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_rotation")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var rotationDegrees: Vector3
    get() {
      val mb = getMethodBind("Spatial","get_rotation_degrees")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_rotation_degrees")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var scale: Vector3
    get() {
      val mb = getMethodBind("Spatial","get_scale")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_scale")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var transform: Transform
    get() {
      val mb = getMethodBind("Spatial","get_transform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_transform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  open var translation: Vector3
    get() {
      val mb = getMethodBind("Spatial","get_translation")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_translation")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var visible: Boolean
    get() {
      val mb = getMethodBind("Spatial","is_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Spatial","set_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Spatial", "Spatial")
        }

  }

  open fun globalTransform(schedule: Transform.() -> Unit): Transform = globalTransform.apply{
      schedule(this)
      globalTransform = this
  }


  open fun rotation(schedule: Vector3.() -> Unit): Vector3 = rotation.apply{
      schedule(this)
      rotation = this
  }


  open fun rotationDegrees(schedule: Vector3.() -> Unit): Vector3 = rotationDegrees.apply{
      schedule(this)
      rotationDegrees = this
  }


  open fun scale(schedule: Vector3.() -> Unit): Vector3 = scale.apply{
      schedule(this)
      scale = this
  }


  open fun transform(schedule: Transform.() -> Unit): Transform = transform.apply{
      schedule(this)
      transform = this
  }


  open fun translation(schedule: Vector3.() -> Unit): Vector3 = translation.apply{
      schedule(this)
      translation = this
  }


  open fun _update_gizmo() {
  }

  open fun forceUpdateTransform() {
    val mb = getMethodBind("Spatial","force_update_transform")
    _icall_Unit( mb, this.ptr)
  }

  open fun getGizmo(): SpatialGizmo {
    val mb = getMethodBind("Spatial","get_gizmo")
    return _icall_SpatialGizmo( mb, this.ptr)
  }

  open fun getGlobalTransform(): Transform {
    val mb = getMethodBind("Spatial","get_global_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getParentSpatial(): Spatial {
    val mb = getMethodBind("Spatial","get_parent_spatial")
    return _icall_Spatial( mb, this.ptr)
  }

  open fun getRotation(): Vector3 {
    val mb = getMethodBind("Spatial","get_rotation")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getRotationDegrees(): Vector3 {
    val mb = getMethodBind("Spatial","get_rotation_degrees")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getScale(): Vector3 {
    val mb = getMethodBind("Spatial","get_scale")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getTransform(): Transform {
    val mb = getMethodBind("Spatial","get_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getTranslation(): Vector3 {
    val mb = getMethodBind("Spatial","get_translation")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getWorld(): World {
    val mb = getMethodBind("Spatial","get_world")
    return _icall_World( mb, this.ptr)
  }

  open fun globalRotate(axis: Vector3, angle: Double) {
    val mb = getMethodBind("Spatial","global_rotate")
    _icall_Unit_Vector3_Double( mb, this.ptr, axis, angle)
  }

  open fun globalScale(scale: Vector3) {
    val mb = getMethodBind("Spatial","global_scale")
    _icall_Unit_Vector3( mb, this.ptr, scale)
  }

  open fun globalTranslate(offset: Vector3) {
    val mb = getMethodBind("Spatial","global_translate")
    _icall_Unit_Vector3( mb, this.ptr, offset)
  }

  open fun hide() {
    val mb = getMethodBind("Spatial","hide")
    _icall_Unit( mb, this.ptr)
  }

  open fun isLocalTransformNotificationEnabled(): Boolean {
    val mb = getMethodBind("Spatial","is_local_transform_notification_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isScaleDisabled(): Boolean {
    val mb = getMethodBind("Spatial","is_scale_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSetAsToplevel(): Boolean {
    val mb = getMethodBind("Spatial","is_set_as_toplevel")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isTransformNotificationEnabled(): Boolean {
    val mb = getMethodBind("Spatial","is_transform_notification_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVisible(): Boolean {
    val mb = getMethodBind("Spatial","is_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVisibleInTree(): Boolean {
    val mb = getMethodBind("Spatial","is_visible_in_tree")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun lookAt(target: Vector3, up: Vector3) {
    val mb = getMethodBind("Spatial","look_at")
    _icall_Unit_Vector3_Vector3( mb, this.ptr, target, up)
  }

  open fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3
  ) {
    val mb = getMethodBind("Spatial","look_at_from_position")
    _icall_Unit_Vector3_Vector3_Vector3( mb, this.ptr, position, target, up)
  }

  open fun orthonormalize() {
    val mb = getMethodBind("Spatial","orthonormalize")
    _icall_Unit( mb, this.ptr)
  }

  open fun rotate(axis: Vector3, angle: Double) {
    val mb = getMethodBind("Spatial","rotate")
    _icall_Unit_Vector3_Double( mb, this.ptr, axis, angle)
  }

  open fun rotateObjectLocal(axis: Vector3, angle: Double) {
    val mb = getMethodBind("Spatial","rotate_object_local")
    _icall_Unit_Vector3_Double( mb, this.ptr, axis, angle)
  }

  open fun rotateX(angle: Double) {
    val mb = getMethodBind("Spatial","rotate_x")
    _icall_Unit_Double( mb, this.ptr, angle)
  }

  open fun rotateY(angle: Double) {
    val mb = getMethodBind("Spatial","rotate_y")
    _icall_Unit_Double( mb, this.ptr, angle)
  }

  open fun rotateZ(angle: Double) {
    val mb = getMethodBind("Spatial","rotate_z")
    _icall_Unit_Double( mb, this.ptr, angle)
  }

  open fun scaleObjectLocal(scale: Vector3) {
    val mb = getMethodBind("Spatial","scale_object_local")
    _icall_Unit_Vector3( mb, this.ptr, scale)
  }

  open fun setAsToplevel(enable: Boolean) {
    val mb = getMethodBind("Spatial","set_as_toplevel")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDisableScale(disable: Boolean) {
    val mb = getMethodBind("Spatial","set_disable_scale")
    _icall_Unit_Boolean( mb, this.ptr, disable)
  }

  open fun setGizmo(gizmo: SpatialGizmo) {
    val mb = getMethodBind("Spatial","set_gizmo")
    _icall_Unit_Object( mb, this.ptr, gizmo)
  }

  open fun setGlobalTransform(global: Transform) {
    val mb = getMethodBind("Spatial","set_global_transform")
    _icall_Unit_Transform( mb, this.ptr, global)
  }

  open fun setIdentity() {
    val mb = getMethodBind("Spatial","set_identity")
    _icall_Unit( mb, this.ptr)
  }

  open fun setIgnoreTransformNotification(enabled: Boolean) {
    val mb = getMethodBind("Spatial","set_ignore_transform_notification")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setNotifyLocalTransform(enable: Boolean) {
    val mb = getMethodBind("Spatial","set_notify_local_transform")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setNotifyTransform(enable: Boolean) {
    val mb = getMethodBind("Spatial","set_notify_transform")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setRotation(euler: Vector3) {
    val mb = getMethodBind("Spatial","set_rotation")
    _icall_Unit_Vector3( mb, this.ptr, euler)
  }

  open fun setRotationDegrees(eulerDegrees: Vector3) {
    val mb = getMethodBind("Spatial","set_rotation_degrees")
    _icall_Unit_Vector3( mb, this.ptr, eulerDegrees)
  }

  open fun setScale(scale: Vector3) {
    val mb = getMethodBind("Spatial","set_scale")
    _icall_Unit_Vector3( mb, this.ptr, scale)
  }

  open fun setTransform(local: Transform) {
    val mb = getMethodBind("Spatial","set_transform")
    _icall_Unit_Transform( mb, this.ptr, local)
  }

  open fun setTranslation(translation: Vector3) {
    val mb = getMethodBind("Spatial","set_translation")
    _icall_Unit_Vector3( mb, this.ptr, translation)
  }

  open fun setVisible(visible: Boolean) {
    val mb = getMethodBind("Spatial","set_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }

  open fun show() {
    val mb = getMethodBind("Spatial","show")
    _icall_Unit( mb, this.ptr)
  }

  open fun toGlobal(localPoint: Vector3): Vector3 {
    val mb = getMethodBind("Spatial","to_global")
    return _icall_Vector3_Vector3( mb, this.ptr, localPoint)
  }

  open fun toLocal(globalPoint: Vector3): Vector3 {
    val mb = getMethodBind("Spatial","to_local")
    return _icall_Vector3_Vector3( mb, this.ptr, globalPoint)
  }

  open fun translate(offset: Vector3) {
    val mb = getMethodBind("Spatial","translate")
    _icall_Unit_Vector3( mb, this.ptr, offset)
  }

  open fun translateObjectLocal(offset: Vector3) {
    val mb = getMethodBind("Spatial","translate_object_local")
    _icall_Unit_Vector3( mb, this.ptr, offset)
  }

  open fun updateGizmo() {
    val mb = getMethodBind("Spatial","update_gizmo")
    _icall_Unit( mb, this.ptr)
  }

  companion object {
    final const val NOTIFICATION_ENTER_WORLD: Long = 41

    final const val NOTIFICATION_EXIT_WORLD: Long = 42

    final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43
  }
}
