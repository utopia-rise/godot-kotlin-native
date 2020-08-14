// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Camera
import godot.core.RID
import godot.core.Transform
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Vector3
import godot.icalls._icall_Double
import godot.icalls._icall_Environment
import godot.icalls._icall_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Double_Double_Double
import godot.icalls._icall_Unit_Double_Vector2_Double_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Vector3
import godot.icalls._icall_Vector3_Vector2
import godot.icalls._icall_Vector3_Vector2_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Camera : Spatial() {
  open var cullMask: Long
    get() {
      val mb = getMethodBind("Camera","get_cull_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_cull_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var current: Boolean
    get() {
      val mb = getMethodBind("Camera","is_current")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_current")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dopplerTracking: Long
    get() {
      val mb = getMethodBind("Camera","get_doppler_tracking")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_doppler_tracking")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var environment: Environment
    get() {
      val mb = getMethodBind("Camera","get_environment")
      return _icall_Environment(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_environment")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var far: Double
    get() {
      val mb = getMethodBind("Camera","get_zfar")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_zfar")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fov: Double
    get() {
      val mb = getMethodBind("Camera","get_fov")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_fov")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var frustumOffset: Vector2
    get() {
      val mb = getMethodBind("Camera","get_frustum_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_frustum_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var hOffset: Double
    get() {
      val mb = getMethodBind("Camera","get_h_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_h_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var keepAspect: Long
    get() {
      val mb = getMethodBind("Camera","get_keep_aspect_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_keep_aspect_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var near: Double
    get() {
      val mb = getMethodBind("Camera","get_znear")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_znear")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var projection: Long
    get() {
      val mb = getMethodBind("Camera","get_projection")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_projection")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var size: Double
    get() {
      val mb = getMethodBind("Camera","get_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var vOffset: Double
    get() {
      val mb = getMethodBind("Camera","get_v_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera","set_v_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Camera", "Camera")

  open fun frustumOffset(schedule: Vector2.() -> Unit): Vector2 = frustumOffset.apply{
      schedule(this)
      frustumOffset = this
  }


  open fun clearCurrent(enableNext: Boolean = true) {
    val mb = getMethodBind("Camera","clear_current")
    _icall_Unit_Boolean( mb, this.ptr, enableNext)
  }

  open fun getCameraRid(): RID {
    val mb = getMethodBind("Camera","get_camera_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getCameraTransform(): Transform {
    val mb = getMethodBind("Camera","get_camera_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getCullMask(): Long {
    val mb = getMethodBind("Camera","get_cull_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCullMaskBit(layer: Long): Boolean {
    val mb = getMethodBind("Camera","get_cull_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, layer)
  }

  open fun getDopplerTracking(): Camera.DopplerTracking {
    val mb = getMethodBind("Camera","get_doppler_tracking")
    return Camera.DopplerTracking.from( _icall_Long( mb, this.ptr))
  }

  open fun getEnvironment(): Environment {
    val mb = getMethodBind("Camera","get_environment")
    return _icall_Environment( mb, this.ptr)
  }

  open fun getFov(): Double {
    val mb = getMethodBind("Camera","get_fov")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFrustum(): VariantArray {
    val mb = getMethodBind("Camera","get_frustum")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getFrustumOffset(): Vector2 {
    val mb = getMethodBind("Camera","get_frustum_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getHOffset(): Double {
    val mb = getMethodBind("Camera","get_h_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getKeepAspectMode(): Camera.KeepAspect {
    val mb = getMethodBind("Camera","get_keep_aspect_mode")
    return Camera.KeepAspect.from( _icall_Long( mb, this.ptr))
  }

  open fun getProjection(): Camera.Projection {
    val mb = getMethodBind("Camera","get_projection")
    return Camera.Projection.from( _icall_Long( mb, this.ptr))
  }

  open fun getSize(): Double {
    val mb = getMethodBind("Camera","get_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVOffset(): Double {
    val mb = getMethodBind("Camera","get_v_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getZfar(): Double {
    val mb = getMethodBind("Camera","get_zfar")
    return _icall_Double( mb, this.ptr)
  }

  open fun getZnear(): Double {
    val mb = getMethodBind("Camera","get_znear")
    return _icall_Double( mb, this.ptr)
  }

  open fun isCurrent(): Boolean {
    val mb = getMethodBind("Camera","is_current")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPositionBehind(worldPoint: Vector3): Boolean {
    val mb = getMethodBind("Camera","is_position_behind")
    return _icall_Boolean_Vector3( mb, this.ptr, worldPoint)
  }

  open fun makeCurrent() {
    val mb = getMethodBind("Camera","make_current")
    _icall_Unit( mb, this.ptr)
  }

  open fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    val mb = getMethodBind("Camera","project_local_ray_normal")
    return _icall_Vector3_Vector2( mb, this.ptr, screenPoint)
  }

  open fun projectPosition(screenPoint: Vector2, zDepth: Double): Vector3 {
    val mb = getMethodBind("Camera","project_position")
    return _icall_Vector3_Vector2_Double( mb, this.ptr, screenPoint, zDepth)
  }

  open fun projectRayNormal(screenPoint: Vector2): Vector3 {
    val mb = getMethodBind("Camera","project_ray_normal")
    return _icall_Vector3_Vector2( mb, this.ptr, screenPoint)
  }

  open fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    val mb = getMethodBind("Camera","project_ray_origin")
    return _icall_Vector3_Vector2( mb, this.ptr, screenPoint)
  }

  open fun setCullMask(mask: Long) {
    val mb = getMethodBind("Camera","set_cull_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCullMaskBit(layer: Long, enable: Boolean) {
    val mb = getMethodBind("Camera","set_cull_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, layer, enable)
  }

  open fun setCurrent(arg0: Boolean) {
    val mb = getMethodBind("Camera","set_current")
    _icall_Unit_Boolean( mb, this.ptr, arg0)
  }

  open fun setDopplerTracking(mode: Long) {
    val mb = getMethodBind("Camera","set_doppler_tracking")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setEnvironment(env: Environment) {
    val mb = getMethodBind("Camera","set_environment")
    _icall_Unit_Object( mb, this.ptr, env)
  }

  open fun setFov(arg0: Double) {
    val mb = getMethodBind("Camera","set_fov")
    _icall_Unit_Double( mb, this.ptr, arg0)
  }

  open fun setFrustum(
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ) {
    val mb = getMethodBind("Camera","set_frustum")
    _icall_Unit_Double_Vector2_Double_Double( mb, this.ptr, size, offset, zNear, zFar)
  }

  open fun setFrustumOffset(arg0: Vector2) {
    val mb = getMethodBind("Camera","set_frustum_offset")
    _icall_Unit_Vector2( mb, this.ptr, arg0)
  }

  open fun setHOffset(ofs: Double) {
    val mb = getMethodBind("Camera","set_h_offset")
    _icall_Unit_Double( mb, this.ptr, ofs)
  }

  open fun setKeepAspectMode(mode: Long) {
    val mb = getMethodBind("Camera","set_keep_aspect_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setOrthogonal(
    size: Double,
    zNear: Double,
    zFar: Double
  ) {
    val mb = getMethodBind("Camera","set_orthogonal")
    _icall_Unit_Double_Double_Double( mb, this.ptr, size, zNear, zFar)
  }

  open fun setPerspective(
    fov: Double,
    zNear: Double,
    zFar: Double
  ) {
    val mb = getMethodBind("Camera","set_perspective")
    _icall_Unit_Double_Double_Double( mb, this.ptr, fov, zNear, zFar)
  }

  open fun setProjection(arg0: Long) {
    val mb = getMethodBind("Camera","set_projection")
    _icall_Unit_Long( mb, this.ptr, arg0)
  }

  open fun setSize(arg0: Double) {
    val mb = getMethodBind("Camera","set_size")
    _icall_Unit_Double( mb, this.ptr, arg0)
  }

  open fun setVOffset(ofs: Double) {
    val mb = getMethodBind("Camera","set_v_offset")
    _icall_Unit_Double( mb, this.ptr, ofs)
  }

  open fun setZfar(arg0: Double) {
    val mb = getMethodBind("Camera","set_zfar")
    _icall_Unit_Double( mb, this.ptr, arg0)
  }

  open fun setZnear(arg0: Double) {
    val mb = getMethodBind("Camera","set_znear")
    _icall_Unit_Double( mb, this.ptr, arg0)
  }

  open fun unprojectPosition(worldPoint: Vector3): Vector2 {
    val mb = getMethodBind("Camera","unproject_position")
    return _icall_Vector2_Vector3( mb, this.ptr, worldPoint)
  }

  enum class KeepAspect(
    id: Long
  ) {
    KEEP_WIDTH(0),

    KEEP_HEIGHT(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Projection(
    id: Long
  ) {
    PROJECTION_PERSPECTIVE(0),

    PROJECTION_ORTHOGONAL(1),

    PROJECTION_FRUSTUM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DopplerTracking(
    id: Long
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
