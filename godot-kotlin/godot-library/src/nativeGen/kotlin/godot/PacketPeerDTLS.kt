// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.PacketPeerDTLS
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Object_Boolean_String_nObject
import godot.icalls._icall_Unit
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class PacketPeerDTLS internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PacketPeerDTLS", "PacketPeerDTLS")
        }

  }

  open fun connectToPeer(
    packetPeer: PacketPeerUDP,
    validateCerts: Boolean = true,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    val mb = getMethodBind("PacketPeerDTLS","connect_to_peer")
    return GodotError.byValue( _icall_Long_Object_Boolean_String_nObject( mb, this.ptr, packetPeer,
        validateCerts, forHostname, validCertificate).toUInt())
  }

  open fun disconnectFromPeer() {
    val mb = getMethodBind("PacketPeerDTLS","disconnect_from_peer")
    _icall_Unit( mb, this.ptr)
  }

  open fun getStatus(): PacketPeerDTLS.Status {
    val mb = getMethodBind("PacketPeerDTLS","get_status")
    return PacketPeerDTLS.Status.from( _icall_Long( mb, this.ptr))
  }

  open fun poll() {
    val mb = getMethodBind("PacketPeerDTLS","poll")
    _icall_Unit( mb, this.ptr)
  }

  enum class Status(
    id: Long
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_HANDSHAKING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3),

    STATUS_ERROR_HOSTNAME_MISMATCH(4);

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
