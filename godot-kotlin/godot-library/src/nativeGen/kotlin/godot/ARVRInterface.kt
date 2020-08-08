package godot

import godot.ARVRInterface
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class ARVRInterface internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var arIsAnchorDetectionEnabled: Boolean
    get() {
      val mb = getMethodBind("ARVRInterface","get_anchor_detection_is_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRInterface","set_anchor_detection_is_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var interfaceIsInitialized: Boolean
    get() {
      val mb = getMethodBind("ARVRInterface","is_initialized")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRInterface","set_is_initialized")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var interfaceIsPrimary: Boolean
    get() {
      val mb = getMethodBind("ARVRInterface","is_primary")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRInterface","set_is_primary")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getAnchorDetectionIsEnabled(): Boolean {
    val mb = getMethodBind("ARVRInterface","get_anchor_detection_is_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCameraFeedId(): Long {
    val mb = getMethodBind("ARVRInterface","get_camera_feed_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCapabilities(): Long {
    val mb = getMethodBind("ARVRInterface","get_capabilities")
    return _icall_Long( mb, this.ptr)
  }

  open fun getName(): String {
    val mb = getMethodBind("ARVRInterface","get_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getRenderTargetsize(): Vector2 {
    val mb = getMethodBind("ARVRInterface","get_render_targetsize")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTrackingStatus(): ARVRInterface.Tracking_status {
    val mb = getMethodBind("ARVRInterface","get_tracking_status")
    return ARVRInterface.Tracking_status.from( _icall_Long( mb, this.ptr))
  }

  open fun initialize(): Boolean {
    val mb = getMethodBind("ARVRInterface","initialize")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInitialized(): Boolean {
    val mb = getMethodBind("ARVRInterface","is_initialized")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPrimary(): Boolean {
    val mb = getMethodBind("ARVRInterface","is_primary")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isStereo(): Boolean {
    val mb = getMethodBind("ARVRInterface","is_stereo")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAnchorDetectionIsEnabled(enable: Boolean) {
    val mb = getMethodBind("ARVRInterface","set_anchor_detection_is_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setIsInitialized(initialized: Boolean) {
    val mb = getMethodBind("ARVRInterface","set_is_initialized")
    _icall_Unit_Boolean( mb, this.ptr, initialized)
  }

  open fun setIsPrimary(enable: Boolean) {
    val mb = getMethodBind("ARVRInterface","set_is_primary")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun uninitialize() {
    val mb = getMethodBind("ARVRInterface","uninitialize")
    _icall_Unit( mb, this.ptr)
  }

  enum class Tracking_status(
    id: Long
  ) {
    ARVR_NORMAL_TRACKING(0),

    ARVR_EXCESSIVE_MOTION(1),

    ARVR_INSUFFICIENT_FEATURES(2),

    ARVR_UNKNOWN_TRACKING(3),

    ARVR_NOT_TRACKING(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Eyes(
    id: Long
  ) {
    EYE_MONO(0),

    EYE_LEFT(1),

    EYE_RIGHT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Capabilities(
    id: Long
  ) {
    ARVR_NONE(0),

    ARVR_MONO(1),

    ARVR_STEREO(2),

    ARVR_AR(4),

    ARVR_EXTERNAL(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ARVR_AR: Long = 4

    final const val ARVR_EXCESSIVE_MOTION: Long = 1

    final const val ARVR_EXTERNAL: Long = 8

    final const val ARVR_INSUFFICIENT_FEATURES: Long = 2

    final const val ARVR_MONO: Long = 1

    final const val ARVR_NONE: Long = 0

    final const val ARVR_NORMAL_TRACKING: Long = 0

    final const val ARVR_NOT_TRACKING: Long = 4

    final const val ARVR_STEREO: Long = 2

    final const val ARVR_UNKNOWN_TRACKING: Long = 3

    final const val EYE_LEFT: Long = 1

    final const val EYE_MONO: Long = 0

    final const val EYE_RIGHT: Long = 2
  }
}
