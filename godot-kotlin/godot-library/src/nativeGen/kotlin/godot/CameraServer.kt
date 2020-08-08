package godot

import godot.core.Godot
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_CameraFeed_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_VariantArray
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Long
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object CameraServer : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("CameraServer".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton CameraServer" }
        this@CameraServer.ptr = ptr
    }
  }

  final const val FEED_CBCR_IMAGE: Long = 1

  final const val FEED_RGBA_IMAGE: Long = 0

  final const val FEED_YCBCR_IMAGE: Long = 0

  final const val FEED_Y_IMAGE: Long = 0

  val cameraFeedAdded: Signal1<Long> by signal("id")

  val cameraFeedRemoved: Signal1<Long> by signal("id")

  fun addFeed(feed: CameraFeed) {
    val mb = getMethodBind("CameraServer","add_feed")
    _icall_Unit_Object( mb, this.ptr, feed)
  }

  fun feeds(): VariantArray {
    val mb = getMethodBind("CameraServer","feeds")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getFeed(index: Long): CameraFeed {
    val mb = getMethodBind("CameraServer","get_feed")
    return _icall_CameraFeed_Long( mb, this.ptr, index)
  }

  fun getFeedCount(): Long {
    val mb = getMethodBind("CameraServer","get_feed_count")
    return _icall_Long( mb, this.ptr)
  }

  fun removeFeed(feed: CameraFeed) {
    val mb = getMethodBind("CameraServer","remove_feed")
    _icall_Unit_Object( mb, this.ptr, feed)
  }

  enum class FeedImage(
    id: Long
  ) {
    FEED_RGBA_IMAGE(0),

    FEED_YCBCR_IMAGE(0),

    FEED_Y_IMAGE(0),

    FEED_CBCR_IMAGE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
