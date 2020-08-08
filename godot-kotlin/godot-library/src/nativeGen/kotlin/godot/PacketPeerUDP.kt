package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_String_Long
import godot.icalls._icall_Long_String_Long
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class PacketPeerUDP internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PacketPeerUDP", "PacketPeerUDP")
        }

  }

  open fun close() {
    val mb = getMethodBind("PacketPeerUDP","close")
    _icall_Unit( mb, this.ptr)
  }

  open fun connectToHost(host: String, port: Long): GodotError {
    val mb = getMethodBind("PacketPeerUDP","connect_to_host")
    return GodotError.byValue( _icall_Long_String_Long( mb, this.ptr, host, port).toUInt())
  }

  open fun getPacketIp(): String {
    val mb = getMethodBind("PacketPeerUDP","get_packet_ip")
    return _icall_String( mb, this.ptr)
  }

  open fun getPacketPort(): Long {
    val mb = getMethodBind("PacketPeerUDP","get_packet_port")
    return _icall_Long( mb, this.ptr)
  }

  open fun isConnectedToHost(): Boolean {
    val mb = getMethodBind("PacketPeerUDP","is_connected_to_host")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isListening(): Boolean {
    val mb = getMethodBind("PacketPeerUDP","is_listening")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    val mb = getMethodBind("PacketPeerUDP","join_multicast_group")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, multicastAddress,
        interfaceName).toUInt())
  }

  open fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    val mb = getMethodBind("PacketPeerUDP","leave_multicast_group")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, multicastAddress,
        interfaceName).toUInt())
  }

  open fun listen(
    port: Long,
    bindAddress: String = "*",
    recvBufSize: Long = 65536
  ): GodotError {
    val mb = getMethodBind("PacketPeerUDP","listen")
    return GodotError.byValue( _icall_Long_Long_String_Long( mb, this.ptr, port, bindAddress,
        recvBufSize).toUInt())
  }

  open fun setBroadcastEnabled(enabled: Boolean) {
    val mb = getMethodBind("PacketPeerUDP","set_broadcast_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setDestAddress(host: String, port: Long): GodotError {
    val mb = getMethodBind("PacketPeerUDP","set_dest_address")
    return GodotError.byValue( _icall_Long_String_Long( mb, this.ptr, host, port).toUInt())
  }

  open fun wait(): GodotError {
    val mb = getMethodBind("PacketPeerUDP","wait")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  companion object
}
