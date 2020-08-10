// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_PoolStringArray_Boolean_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_X509Certificate
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class WebSocketClient internal constructor(
  _ignore: Any?
) : WebSocketMultiplayerPeer(_ignore) {
  val connectionClosed: Signal1<Boolean> by signal("was_clean_close")

  val connectionError: Signal0 by signal()

  val connectionEstablished: Signal1<String> by signal("protocol")

  val dataReceived: Signal0 by signal()

  val serverCloseRequest: Signal2<Long, String> by signal("code", "reason")

  open var trustedSslCertificate: X509Certificate
    get() {
      val mb = getMethodBind("WebSocketClient","get_trusted_ssl_certificate")
      return _icall_X509Certificate(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebSocketClient","set_trusted_ssl_certificate")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var verifySsl: Boolean
    get() {
      val mb = getMethodBind("WebSocketClient","is_verify_ssl_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WebSocketClient","set_verify_ssl_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebSocketClient", "WebSocketClient")
        }

  }

  open fun connectToUrl(
    url: String,
    protocols: PoolStringArray = PoolStringArray(),
    gdMpApi: Boolean = false,
    customHeaders: PoolStringArray = PoolStringArray()
  ): GodotError {
    val mb = getMethodBind("WebSocketClient","connect_to_url")
    return GodotError.byValue( _icall_Long_String_PoolStringArray_Boolean_PoolStringArray( mb,
        this.ptr, url, protocols, gdMpApi, customHeaders).toUInt())
  }

  open fun disconnectFromHost(code: Long = 1000, reason: String = "") {
    val mb = getMethodBind("WebSocketClient","disconnect_from_host")
    _icall_Unit_Long_String( mb, this.ptr, code, reason)
  }

  open fun getConnectedHost(): String {
    val mb = getMethodBind("WebSocketClient","get_connected_host")
    return _icall_String( mb, this.ptr)
  }

  open fun getConnectedPort(): Long {
    val mb = getMethodBind("WebSocketClient","get_connected_port")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTrustedSslCertificate(): X509Certificate {
    val mb = getMethodBind("WebSocketClient","get_trusted_ssl_certificate")
    return _icall_X509Certificate( mb, this.ptr)
  }

  open fun isVerifySslEnabled(): Boolean {
    val mb = getMethodBind("WebSocketClient","is_verify_ssl_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setTrustedSslCertificate(arg0: X509Certificate) {
    val mb = getMethodBind("WebSocketClient","set_trusted_ssl_certificate")
    _icall_Unit_Object( mb, this.ptr, arg0)
  }

  open fun setVerifySslEnabled(enabled: Boolean) {
    val mb = getMethodBind("WebSocketClient","set_verify_ssl_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }
}
