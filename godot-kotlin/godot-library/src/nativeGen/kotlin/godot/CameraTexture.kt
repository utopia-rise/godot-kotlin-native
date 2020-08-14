// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.CameraServer
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class CameraTexture : Texture() {
  open var cameraFeedId: Long
    get() {
      val mb = getMethodBind("CameraTexture","get_camera_feed_id")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CameraTexture","set_camera_feed_id")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var cameraIsActive: Boolean
    get() {
      val mb = getMethodBind("CameraTexture","get_camera_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CameraTexture","set_camera_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var whichFeed: Long
    get() {
      val mb = getMethodBind("CameraTexture","get_which_feed")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CameraTexture","set_which_feed")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CameraTexture", "CameraTexture")

  open fun getCameraActive(): Boolean {
    val mb = getMethodBind("CameraTexture","get_camera_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCameraFeedId(): Long {
    val mb = getMethodBind("CameraTexture","get_camera_feed_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getWhichFeed(): CameraServer.FeedImage {
    val mb = getMethodBind("CameraTexture","get_which_feed")
    return CameraServer.FeedImage.from( _icall_Long( mb, this.ptr))
  }

  open fun setCameraActive(active: Boolean) {
    val mb = getMethodBind("CameraTexture","set_camera_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  open fun setCameraFeedId(feedId: Long) {
    val mb = getMethodBind("CameraTexture","set_camera_feed_id")
    _icall_Unit_Long( mb, this.ptr, feedId)
  }

  open fun setWhichFeed(whichFeed: Long) {
    val mb = getMethodBind("CameraTexture","set_which_feed")
    _icall_Unit_Long( mb, this.ptr, whichFeed)
  }
}
