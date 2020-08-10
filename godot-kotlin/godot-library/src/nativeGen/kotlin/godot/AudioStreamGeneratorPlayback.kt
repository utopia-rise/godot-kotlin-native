// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolVector2Array
import godot.core.Vector2
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_PoolVector2Array
import godot.icalls._icall_Boolean_Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class AudioStreamGeneratorPlayback internal constructor(
  _ignore: Any?
) : AudioStreamPlaybackResampled(_ignore) {
  internal constructor() : this(null)

  open fun canPushBuffer(amount: Long): Boolean {
    val mb = getMethodBind("AudioStreamGeneratorPlayback","can_push_buffer")
    return _icall_Boolean_Long( mb, this.ptr, amount)
  }

  open fun clearBuffer() {
    val mb = getMethodBind("AudioStreamGeneratorPlayback","clear_buffer")
    _icall_Unit( mb, this.ptr)
  }

  open fun getFramesAvailable(): Long {
    val mb = getMethodBind("AudioStreamGeneratorPlayback","get_frames_available")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSkips(): Long {
    val mb = getMethodBind("AudioStreamGeneratorPlayback","get_skips")
    return _icall_Long( mb, this.ptr)
  }

  open fun pushBuffer(frames: PoolVector2Array): Boolean {
    val mb = getMethodBind("AudioStreamGeneratorPlayback","push_buffer")
    return _icall_Boolean_PoolVector2Array( mb, this.ptr, frames)
  }

  open fun pushFrame(frame: Vector2): Boolean {
    val mb = getMethodBind("AudioStreamGeneratorPlayback","push_frame")
    return _icall_Boolean_Vector2( mb, this.ptr, frame)
  }
}
