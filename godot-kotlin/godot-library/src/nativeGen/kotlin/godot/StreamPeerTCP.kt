// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.StreamPeerTCP
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class StreamPeerTCP : StreamPeer() {
  override fun __new(): COpaquePointer = invokeConstructor("StreamPeerTCP", "StreamPeerTCP")

  open fun connectToHost(host: String, port: Long): GodotError {
    val mb = getMethodBind("StreamPeerTCP","connect_to_host")
    return GodotError.byValue( _icall_Long_String_Long( mb, this.ptr, host, port).toUInt())
  }

  open fun disconnectFromHost() {
    val mb = getMethodBind("StreamPeerTCP","disconnect_from_host")
    _icall_Unit( mb, this.ptr)
  }

  open fun getConnectedHost(): String {
    val mb = getMethodBind("StreamPeerTCP","get_connected_host")
    return _icall_String( mb, this.ptr)
  }

  open fun getConnectedPort(): Long {
    val mb = getMethodBind("StreamPeerTCP","get_connected_port")
    return _icall_Long( mb, this.ptr)
  }

  open fun getStatus(): StreamPeerTCP.Status {
    val mb = getMethodBind("StreamPeerTCP","get_status")
    return StreamPeerTCP.Status.from( _icall_Long( mb, this.ptr))
  }

  open fun isConnectedToHost(): Boolean {
    val mb = getMethodBind("StreamPeerTCP","is_connected_to_host")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setNoDelay(enabled: Boolean) {
    val mb = getMethodBind("StreamPeerTCP","set_no_delay")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  enum class Status(
    id: Long
  ) {
    STATUS_NONE(0),

    STATUS_CONNECTING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3);

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
