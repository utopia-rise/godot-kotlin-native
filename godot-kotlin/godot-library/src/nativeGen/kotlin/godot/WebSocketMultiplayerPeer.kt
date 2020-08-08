package godot

import godot.core.GodotError
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Long_Long_Long_Long_Long
import godot.icalls._icall_WebSocketPeer_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class WebSocketMultiplayerPeer internal constructor(
  _ignore: Any?
) : NetworkedMultiplayerPeer(_ignore) {
  val peerPacket: Signal1<Long> by signal("peer_source")

  internal constructor() : this(null)

  open fun getPeer(peerId: Long): WebSocketPeer {
    val mb = getMethodBind("WebSocketMultiplayerPeer","get_peer")
    return _icall_WebSocketPeer_Long( mb, this.ptr, peerId)
  }

  open fun setBuffers(
    inputBufferSizeKb: Long,
    inputMaxPackets: Long,
    outputBufferSizeKb: Long,
    outputMaxPackets: Long
  ): GodotError {
    val mb = getMethodBind("WebSocketMultiplayerPeer","set_buffers")
    return GodotError.byValue( _icall_Long_Long_Long_Long_Long( mb, this.ptr, inputBufferSizeKb,
        inputMaxPackets, outputBufferSizeKb, outputMaxPackets).toUInt())
  }

  companion object
}
