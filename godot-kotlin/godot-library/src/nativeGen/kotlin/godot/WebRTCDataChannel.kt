package godot

import godot.WebRTCDataChannel
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class WebRTCDataChannel internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  open var writeMode: Long
    get() {
      val mb = getMethodBind("WebRTCDataChannel","get_write_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebRTCDataChannel","set_write_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun close() {
    val mb = getMethodBind("WebRTCDataChannel","close")
    _icall_Unit( mb, this.ptr)
  }

  open fun getId(): Long {
    val mb = getMethodBind("WebRTCDataChannel","get_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLabel(): String {
    val mb = getMethodBind("WebRTCDataChannel","get_label")
    return _icall_String( mb, this.ptr)
  }

  open fun getMaxPacketLifeTime(): Long {
    val mb = getMethodBind("WebRTCDataChannel","get_max_packet_life_time")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMaxRetransmits(): Long {
    val mb = getMethodBind("WebRTCDataChannel","get_max_retransmits")
    return _icall_Long( mb, this.ptr)
  }

  open fun getProtocol(): String {
    val mb = getMethodBind("WebRTCDataChannel","get_protocol")
    return _icall_String( mb, this.ptr)
  }

  open fun getReadyState(): WebRTCDataChannel.ChannelState {
    val mb = getMethodBind("WebRTCDataChannel","get_ready_state")
    return WebRTCDataChannel.ChannelState.from( _icall_Long( mb, this.ptr))
  }

  open fun getWriteMode(): WebRTCDataChannel.WriteMode {
    val mb = getMethodBind("WebRTCDataChannel","get_write_mode")
    return WebRTCDataChannel.WriteMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isNegotiated(): Boolean {
    val mb = getMethodBind("WebRTCDataChannel","is_negotiated")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOrdered(): Boolean {
    val mb = getMethodBind("WebRTCDataChannel","is_ordered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun poll(): GodotError {
    val mb = getMethodBind("WebRTCDataChannel","poll")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun setWriteMode(writeMode: Long) {
    val mb = getMethodBind("WebRTCDataChannel","set_write_mode")
    _icall_Unit_Long( mb, this.ptr, writeMode)
  }

  open fun wasStringPacket(): Boolean {
    val mb = getMethodBind("WebRTCDataChannel","was_string_packet")
    return _icall_Boolean( mb, this.ptr)
  }

  enum class WriteMode(
    id: Long
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ChannelState(
    id: Long
  ) {
    STATE_CONNECTING(0),

    STATE_OPEN(1),

    STATE_CLOSING(2),

    STATE_CLOSED(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STATE_CLOSED: Long = 3

    final const val STATE_CLOSING: Long = 2

    final const val STATE_CONNECTING: Long = 0

    final const val STATE_OPEN: Long = 1

    final const val WRITE_MODE_BINARY: Long = 1

    final const val WRITE_MODE_TEXT: Long = 0
  }
}
