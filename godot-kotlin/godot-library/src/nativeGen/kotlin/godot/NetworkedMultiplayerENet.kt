package godot

import godot.NetworkedMultiplayerENet
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Long_Long_Long
import godot.icalls._icall_Long_String_Long_Long_Long_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class NetworkedMultiplayerENet internal constructor(
  _ignore: Any?
) : NetworkedMultiplayerPeer(_ignore) {
  open var alwaysOrdered: Boolean
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","is_always_ordered")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_always_ordered")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var channelCount: Long
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","get_channel_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_channel_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var compressionMode: Long
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","get_compression_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_compression_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dtlsVerify: Boolean
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","is_dtls_verify_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_dtls_verify_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var serverRelay: Boolean
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","is_server_relay_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_server_relay_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var transferChannel: Long
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","get_transfer_channel")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_transfer_channel")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var useDtls: Boolean
    get() {
      val mb = getMethodBind("NetworkedMultiplayerENet","is_dtls_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerENet","set_dtls_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("NetworkedMultiplayerENet", "NetworkedMultiplayerENet")
        }

  }

  open fun closeConnection(waitUsec: Long = 100) {
    val mb = getMethodBind("NetworkedMultiplayerENet","close_connection")
    _icall_Unit_Long( mb, this.ptr, waitUsec)
  }

  open fun createClient(
    address: String,
    port: Long,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0,
    clientPort: Long = 0
  ): GodotError {
    val mb = getMethodBind("NetworkedMultiplayerENet","create_client")
    return GodotError.byValue( _icall_Long_String_Long_Long_Long_Long( mb, this.ptr, address, port,
        inBandwidth, outBandwidth, clientPort).toUInt())
  }

  open fun createServer(
    port: Long,
    maxClients: Long = 32,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0
  ): GodotError {
    val mb = getMethodBind("NetworkedMultiplayerENet","create_server")
    return GodotError.byValue( _icall_Long_Long_Long_Long_Long( mb, this.ptr, port, maxClients,
        inBandwidth, outBandwidth).toUInt())
  }

  open fun disconnectPeer(id: Long, now: Boolean = false) {
    val mb = getMethodBind("NetworkedMultiplayerENet","disconnect_peer")
    _icall_Unit_Long_Boolean( mb, this.ptr, id, now)
  }

  open fun getChannelCount(): Long {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_channel_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCompressionMode(): NetworkedMultiplayerENet.CompressionMode {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_compression_mode")
    return NetworkedMultiplayerENet.CompressionMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getLastPacketChannel(): Long {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_last_packet_channel")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPacketChannel(): Long {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_packet_channel")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPeerAddress(id: Long): String {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_peer_address")
    return _icall_String_Long( mb, this.ptr, id)
  }

  open fun getPeerPort(id: Long): Long {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_peer_port")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun getTransferChannel(): Long {
    val mb = getMethodBind("NetworkedMultiplayerENet","get_transfer_channel")
    return _icall_Long( mb, this.ptr)
  }

  open fun isAlwaysOrdered(): Boolean {
    val mb = getMethodBind("NetworkedMultiplayerENet","is_always_ordered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDtlsEnabled(): Boolean {
    val mb = getMethodBind("NetworkedMultiplayerENet","is_dtls_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDtlsVerifyEnabled(): Boolean {
    val mb = getMethodBind("NetworkedMultiplayerENet","is_dtls_verify_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isServerRelayEnabled(): Boolean {
    val mb = getMethodBind("NetworkedMultiplayerENet","is_server_relay_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAlwaysOrdered(ordered: Boolean) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_always_ordered")
    _icall_Unit_Boolean( mb, this.ptr, ordered)
  }

  open fun setBindIp(ip: String) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_bind_ip")
    _icall_Unit_String( mb, this.ptr, ip)
  }

  open fun setChannelCount(channels: Long) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_channel_count")
    _icall_Unit_Long( mb, this.ptr, channels)
  }

  open fun setCompressionMode(mode: Long) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_compression_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setDtlsCertificate(certificate: X509Certificate) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_dtls_certificate")
    _icall_Unit_Object( mb, this.ptr, certificate)
  }

  open fun setDtlsEnabled(enabled: Boolean) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_dtls_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setDtlsKey(key: CryptoKey) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_dtls_key")
    _icall_Unit_Object( mb, this.ptr, key)
  }

  open fun setDtlsVerifyEnabled(enabled: Boolean) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_dtls_verify_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setServerRelayEnabled(enabled: Boolean) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_server_relay_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setTransferChannel(channel: Long) {
    val mb = getMethodBind("NetworkedMultiplayerENet","set_transfer_channel")
    _icall_Unit_Long( mb, this.ptr, channel)
  }

  enum class CompressionMode(
    id: Long
  ) {
    COMPRESS_NONE(0),

    COMPRESS_RANGE_CODER(1),

    COMPRESS_FASTLZ(2),

    COMPRESS_ZLIB(3),

    COMPRESS_ZSTD(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COMPRESS_FASTLZ: Long = 2

    final const val COMPRESS_NONE: Long = 0

    final const val COMPRESS_RANGE_CODER: Long = 1

    final const val COMPRESS_ZLIB: Long = 3

    final const val COMPRESS_ZSTD: Long = 4
  }
}
