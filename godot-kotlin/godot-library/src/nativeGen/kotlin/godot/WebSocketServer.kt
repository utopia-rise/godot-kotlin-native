package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_CryptoKey
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_PoolStringArray_Boolean
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long_Long_String
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_X509Certificate
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class WebSocketServer internal constructor(
  _ignore: Any?
) : WebSocketMultiplayerPeer(_ignore) {
  val clientCloseRequest: Signal3<Long, Long, String> by signal("id", "code", "reason")

  val clientConnected: Signal2<Long, String> by signal("id", "protocol")

  val clientDisconnected: Signal2<Long, Boolean> by signal("id", "was_clean_close")

  val dataReceived: Signal1<Long> by signal("id")

  open var bindIp: String
    get() {
      val mb = getMethodBind("WebSocketServer","get_bind_ip")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebSocketServer","set_bind_ip")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var caChain: X509Certificate
    get() {
      val mb = getMethodBind("WebSocketServer","get_ca_chain")
      return _icall_X509Certificate(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebSocketServer","set_ca_chain")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var privateKey: CryptoKey
    get() {
      val mb = getMethodBind("WebSocketServer","get_private_key")
      return _icall_CryptoKey(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebSocketServer","set_private_key")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var sslCertificate: X509Certificate
    get() {
      val mb = getMethodBind("WebSocketServer","get_ssl_certificate")
      return _icall_X509Certificate(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebSocketServer","set_ssl_certificate")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebSocketServer", "WebSocketServer")
        }

  }

  open fun disconnectPeer(
    id: Long,
    code: Long = 1000,
    reason: String = ""
  ) {
    val mb = getMethodBind("WebSocketServer","disconnect_peer")
    _icall_Unit_Long_Long_String( mb, this.ptr, id, code, reason)
  }

  open fun getBindIp(): String {
    val mb = getMethodBind("WebSocketServer","get_bind_ip")
    return _icall_String( mb, this.ptr)
  }

  open fun getCaChain(): X509Certificate {
    val mb = getMethodBind("WebSocketServer","get_ca_chain")
    return _icall_X509Certificate( mb, this.ptr)
  }

  open fun getPeerAddress(id: Long): String {
    val mb = getMethodBind("WebSocketServer","get_peer_address")
    return _icall_String_Long( mb, this.ptr, id)
  }

  open fun getPeerPort(id: Long): Long {
    val mb = getMethodBind("WebSocketServer","get_peer_port")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun getPrivateKey(): CryptoKey {
    val mb = getMethodBind("WebSocketServer","get_private_key")
    return _icall_CryptoKey( mb, this.ptr)
  }

  open fun getSslCertificate(): X509Certificate {
    val mb = getMethodBind("WebSocketServer","get_ssl_certificate")
    return _icall_X509Certificate( mb, this.ptr)
  }

  open fun hasPeer(id: Long): Boolean {
    val mb = getMethodBind("WebSocketServer","has_peer")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun isListening(): Boolean {
    val mb = getMethodBind("WebSocketServer","is_listening")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun listen(
    port: Long,
    protocols: PoolStringArray = PoolStringArray(),
    gdMpApi: Boolean = false
  ): GodotError {
    val mb = getMethodBind("WebSocketServer","listen")
    return GodotError.byValue( _icall_Long_Long_PoolStringArray_Boolean( mb, this.ptr, port,
        protocols, gdMpApi).toUInt())
  }

  open fun setBindIp(arg0: String) {
    val mb = getMethodBind("WebSocketServer","set_bind_ip")
    _icall_Unit_String( mb, this.ptr, arg0)
  }

  open fun setCaChain(arg0: X509Certificate) {
    val mb = getMethodBind("WebSocketServer","set_ca_chain")
    _icall_Unit_Object( mb, this.ptr, arg0)
  }

  open fun setPrivateKey(arg0: CryptoKey) {
    val mb = getMethodBind("WebSocketServer","set_private_key")
    _icall_Unit_Object( mb, this.ptr, arg0)
  }

  open fun setSslCertificate(arg0: X509Certificate) {
    val mb = getMethodBind("WebSocketServer","set_ssl_certificate")
    _icall_Unit_Object( mb, this.ptr, arg0)
  }

  open fun stop() {
    val mb = getMethodBind("WebSocketServer","stop")
    _icall_Unit( mb, this.ptr)
  }
}
