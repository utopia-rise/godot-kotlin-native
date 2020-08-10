// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.WebSocketPeer
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class WebSocketPeer internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebSocketPeer", "WebSocketPeer")
        }

  }

  open fun close(code: Long = 1000, reason: String = "") {
    val mb = getMethodBind("WebSocketPeer","close")
    _icall_Unit_Long_String( mb, this.ptr, code, reason)
  }

  open fun getConnectedHost(): String {
    val mb = getMethodBind("WebSocketPeer","get_connected_host")
    return _icall_String( mb, this.ptr)
  }

  open fun getConnectedPort(): Long {
    val mb = getMethodBind("WebSocketPeer","get_connected_port")
    return _icall_Long( mb, this.ptr)
  }

  open fun getWriteMode(): WebSocketPeer.WriteMode {
    val mb = getMethodBind("WebSocketPeer","get_write_mode")
    return WebSocketPeer.WriteMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isConnectedToHost(): Boolean {
    val mb = getMethodBind("WebSocketPeer","is_connected_to_host")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setNoDelay(enabled: Boolean) {
    val mb = getMethodBind("WebSocketPeer","set_no_delay")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setWriteMode(mode: Long) {
    val mb = getMethodBind("WebSocketPeer","set_write_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun wasStringPacket(): Boolean {
    val mb = getMethodBind("WebSocketPeer","was_string_packet")
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

  companion object {
    final const val WRITE_MODE_BINARY: Long = 1

    final const val WRITE_MODE_TEXT: Long = 0
  }
}
