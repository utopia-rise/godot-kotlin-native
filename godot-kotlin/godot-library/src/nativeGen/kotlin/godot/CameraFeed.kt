package godot

import godot.CameraFeed
import godot.core.Godot.shouldInitPtr
import godot.core.Transform2D
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Transform2D
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class CameraFeed internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var feedIsActive: Boolean
    get() {
      val mb = getMethodBind("CameraFeed","is_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CameraFeed","set_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var feedTransform: Transform2D
    get() {
      val mb = getMethodBind("CameraFeed","get_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CameraFeed","set_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CameraFeed", "CameraFeed")
        }

  }

  open fun feedTransform(schedule: Transform2D.() -> Unit): Transform2D = feedTransform.apply{
      schedule(this)
      feedTransform = this
  }


  open fun _allocate_texture(
    width: Long,
    height: Long,
    format: Long,
    textureType: Long,
    dataType: Long
  ) {
  }

  open fun _set_RGB_img(rgbImg: Image) {
  }

  open fun _set_YCbCr_img(ycbcrImg: Image) {
  }

  open fun _set_YCbCr_imgs(yImg: Image, cbcrImg: Image) {
  }

  open fun _set_name(name: String) {
  }

  open fun _set_position(position: Long) {
  }

  open fun getId(): Long {
    val mb = getMethodBind("CameraFeed","get_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getName(): String {
    val mb = getMethodBind("CameraFeed","get_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getPosition(): CameraFeed.FeedPosition {
    val mb = getMethodBind("CameraFeed","get_position")
    return CameraFeed.FeedPosition.from( _icall_Long( mb, this.ptr))
  }

  open fun getTransform(): Transform2D {
    val mb = getMethodBind("CameraFeed","get_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun isActive(): Boolean {
    val mb = getMethodBind("CameraFeed","is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setActive(active: Boolean) {
    val mb = getMethodBind("CameraFeed","set_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  open fun setTransform(transform: Transform2D) {
    val mb = getMethodBind("CameraFeed","set_transform")
    _icall_Unit_Transform2D( mb, this.ptr, transform)
  }

  enum class FeedDataType(
    id: Long
  ) {
    FEED_NOIMAGE(0),

    FEED_RGB(1),

    FEED_YCBCR(2),

    FEED_YCBCR_SEP(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class FeedPosition(
    id: Long
  ) {
    FEED_UNSPECIFIED(0),

    FEED_FRONT(1),

    FEED_BACK(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FEED_BACK: Long = 2

    final const val FEED_FRONT: Long = 1

    final const val FEED_NOIMAGE: Long = 0

    final const val FEED_RGB: Long = 1

    final const val FEED_UNSPECIFIED: Long = 0

    final const val FEED_YCBCR: Long = 2

    final const val FEED_YCBCR_SEP: Long = 3
  }
}
