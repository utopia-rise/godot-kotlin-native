// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long_Long_String
import godot.icalls._icall_PacketPeerUDP
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class UDPServer internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("UDPServer", "UDPServer")
        }

  }

  open fun isConnectionAvailable(): Boolean {
    val mb = getMethodBind("UDPServer","is_connection_available")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isListening(): Boolean {
    val mb = getMethodBind("UDPServer","is_listening")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun listen(port: Long, bindAddress: String = "*"): GodotError {
    val mb = getMethodBind("UDPServer","listen")
    return GodotError.byValue( _icall_Long_Long_String( mb, this.ptr, port, bindAddress).toUInt())
  }

  open fun stop() {
    val mb = getMethodBind("UDPServer","stop")
    _icall_Unit( mb, this.ptr)
  }

  open fun takeConnection(): PacketPeerUDP {
    val mb = getMethodBind("UDPServer","take_connection")
    return _icall_PacketPeerUDP( mb, this.ptr)
  }
}
