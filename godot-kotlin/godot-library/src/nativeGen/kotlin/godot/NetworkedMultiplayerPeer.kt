package godot

import godot.NetworkedMultiplayerPeer
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class NetworkedMultiplayerPeer internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  val connectionFailed: Signal0 by signal()

  val connectionSucceeded: Signal0 by signal()

  val peerConnected: Signal1<Long> by signal("id")

  val peerDisconnected: Signal1<Long> by signal("id")

  val serverDisconnected: Signal0 by signal()

  open var refuseNewConnections: Boolean
    get() {
      val mb = getMethodBind("NetworkedMultiplayerPeer","is_refusing_new_connections")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerPeer","set_refuse_new_connections")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var transferMode: Long
    get() {
      val mb = getMethodBind("NetworkedMultiplayerPeer","get_transfer_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NetworkedMultiplayerPeer","set_transfer_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getConnectionStatus(): NetworkedMultiplayerPeer.ConnectionStatus {
    val mb = getMethodBind("NetworkedMultiplayerPeer","get_connection_status")
    return NetworkedMultiplayerPeer.ConnectionStatus.from( _icall_Long( mb, this.ptr))
  }

  open fun getPacketPeer(): Long {
    val mb = getMethodBind("NetworkedMultiplayerPeer","get_packet_peer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTransferMode(): NetworkedMultiplayerPeer.TransferMode {
    val mb = getMethodBind("NetworkedMultiplayerPeer","get_transfer_mode")
    return NetworkedMultiplayerPeer.TransferMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getUniqueId(): Long {
    val mb = getMethodBind("NetworkedMultiplayerPeer","get_unique_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun isRefusingNewConnections(): Boolean {
    val mb = getMethodBind("NetworkedMultiplayerPeer","is_refusing_new_connections")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun poll() {
    val mb = getMethodBind("NetworkedMultiplayerPeer","poll")
    _icall_Unit( mb, this.ptr)
  }

  open fun setRefuseNewConnections(enable: Boolean) {
    val mb = getMethodBind("NetworkedMultiplayerPeer","set_refuse_new_connections")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setTargetPeer(id: Long) {
    val mb = getMethodBind("NetworkedMultiplayerPeer","set_target_peer")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun setTransferMode(mode: Long) {
    val mb = getMethodBind("NetworkedMultiplayerPeer","set_transfer_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class ConnectionStatus(
    id: Long
  ) {
    CONNECTION_DISCONNECTED(0),

    CONNECTION_CONNECTING(1),

    CONNECTION_CONNECTED(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TransferMode(
    id: Long
  ) {
    TRANSFER_MODE_UNRELIABLE(0),

    TRANSFER_MODE_UNRELIABLE_ORDERED(1),

    TRANSFER_MODE_RELIABLE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CONNECTION_CONNECTED: Long = 2

    final const val CONNECTION_CONNECTING: Long = 1

    final const val CONNECTION_DISCONNECTED: Long = 0

    final const val TARGET_PEER_BROADCAST: Long = 0

    final const val TARGET_PEER_SERVER: Long = 1

    final const val TRANSFER_MODE_RELIABLE: Long = 2

    final const val TRANSFER_MODE_UNRELIABLE: Long = 0

    final const val TRANSFER_MODE_UNRELIABLE_ORDERED: Long = 1
  }
}
