package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_StreamPeer
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class PacketPeerStream internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  open var inputBufferMaxSize: Long
    get() {
      val mb = getMethodBind("PacketPeerStream","get_input_buffer_max_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PacketPeerStream","set_input_buffer_max_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var outputBufferMaxSize: Long
    get() {
      val mb = getMethodBind("PacketPeerStream","get_output_buffer_max_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PacketPeerStream","set_output_buffer_max_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var streamPeer: StreamPeer
    get() {
      val mb = getMethodBind("PacketPeerStream","get_stream_peer")
      return _icall_StreamPeer(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PacketPeerStream","set_stream_peer")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PacketPeerStream", "PacketPeerStream")
        }

  }

  open fun getInputBufferMaxSize(): Long {
    val mb = getMethodBind("PacketPeerStream","get_input_buffer_max_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getOutputBufferMaxSize(): Long {
    val mb = getMethodBind("PacketPeerStream","get_output_buffer_max_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getStreamPeer(): StreamPeer {
    val mb = getMethodBind("PacketPeerStream","get_stream_peer")
    return _icall_StreamPeer( mb, this.ptr)
  }

  open fun setInputBufferMaxSize(maxSizeBytes: Long) {
    val mb = getMethodBind("PacketPeerStream","set_input_buffer_max_size")
    _icall_Unit_Long( mb, this.ptr, maxSizeBytes)
  }

  open fun setOutputBufferMaxSize(maxSizeBytes: Long) {
    val mb = getMethodBind("PacketPeerStream","set_output_buffer_max_size")
    _icall_Unit_Long( mb, this.ptr, maxSizeBytes)
  }

  open fun setStreamPeer(peer: StreamPeer) {
    val mb = getMethodBind("PacketPeerStream","set_stream_peer")
    _icall_Unit_Object( mb, this.ptr, peer)
  }

  companion object
}
