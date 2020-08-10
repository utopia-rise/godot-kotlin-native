package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long_Object_Object_nObject
import godot.icalls._icall_PacketPeerDTLS_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class DTLSServer internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("DTLSServer", "DTLSServer")
        }

  }

  open fun setup(
    key: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    val mb = getMethodBind("DTLSServer","setup")
    return GodotError.byValue( _icall_Long_Object_Object_nObject( mb, this.ptr, key, certificate,
        chain).toUInt())
  }

  open fun takeConnection(udpPeer: PacketPeerUDP): PacketPeerDTLS {
    val mb = getMethodBind("DTLSServer","take_connection")
    return _icall_PacketPeerDTLS_Object( mb, this.ptr, udpPeer)
  }
}
