// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.StreamPeerSSL
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Object_Boolean_String_nObject
import godot.icalls._icall_Long_Object_Object_Object_nObject
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class StreamPeerSSL internal constructor(
  _ignore: Any?
) : StreamPeer(_ignore) {
  open var blockingHandshake: Boolean
    get() {
      val mb = getMethodBind("StreamPeerSSL","is_blocking_handshake_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StreamPeerSSL","set_blocking_handshake_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("StreamPeerSSL", "StreamPeerSSL")
        }

  }

  open fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    val mb = getMethodBind("StreamPeerSSL","accept_stream")
    return GodotError.byValue( _icall_Long_Object_Object_Object_nObject( mb, this.ptr, stream,
        privateKey, certificate, chain).toUInt())
  }

  open fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    val mb = getMethodBind("StreamPeerSSL","connect_to_stream")
    return GodotError.byValue( _icall_Long_Object_Boolean_String_nObject( mb, this.ptr, stream,
        validateCerts, forHostname, validCertificate).toUInt())
  }

  open fun disconnectFromStream() {
    val mb = getMethodBind("StreamPeerSSL","disconnect_from_stream")
    _icall_Unit( mb, this.ptr)
  }

  open fun getStatus(): StreamPeerSSL.Status {
    val mb = getMethodBind("StreamPeerSSL","get_status")
    return StreamPeerSSL.Status.from( _icall_Long( mb, this.ptr))
  }

  open fun isBlockingHandshakeEnabled(): Boolean {
    val mb = getMethodBind("StreamPeerSSL","is_blocking_handshake_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun poll() {
    val mb = getMethodBind("StreamPeerSSL","poll")
    _icall_Unit( mb, this.ptr)
  }

  open fun setBlockingHandshakeEnabled(enabled: Boolean) {
    val mb = getMethodBind("StreamPeerSSL","set_blocking_handshake_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
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
