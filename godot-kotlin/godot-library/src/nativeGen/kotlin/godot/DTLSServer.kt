// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Long_Object_Object_nObject
import godot.icalls._icall_PacketPeerDTLS_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class DTLSServer : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("DTLSServer", "DTLSServer")

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
