@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NetworkedMultiplayerPeer : PacketPeer {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ConnectionStatus(val id: Int) {
        CONNECTION_DISCONNECTED(0),
        CONNECTION_CONNECTING(1),
        CONNECTION_CONNECTED(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class TransferMode(val id: Int) {
        TRANSFER_MODE_UNRELIABLE(0),
        TRANSFER_MODE_UNRELIABLE_ORDERED(1),
        TRANSFER_MODE_RELIABLE(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val CONNECTION_FAILED: String = "connection_failed"
            const val CONNECTION_SUCCEEDED: String = "connection_succeeded"
            const val PEER_DISCONNECTED: String = "peer_disconnected"
            const val PEER_CONNECTED: String = "peer_connected"
            const val SERVER_DISCONNECTED: String = "server_disconnected"
        }
    }


    companion object {
        infix fun from(other: PacketPeer): NetworkedMultiplayerPeer = NetworkedMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): NetworkedMultiplayerPeer = NetworkedMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NetworkedMultiplayerPeer = NetworkedMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NetworkedMultiplayerPeer = fromVariant(NetworkedMultiplayerPeer(""), other)


        // Constants
        const val TRANSFER_MODE_UNRELIABLE: Int = 0
        const val TRANSFER_MODE_UNRELIABLE_ORDERED: Int = 1
        const val TRANSFER_MODE_RELIABLE: Int = 2
        const val CONNECTION_DISCONNECTED: Int = 0
        const val CONNECTION_CONNECTING: Int = 1
        const val CONNECTION_CONNECTED: Int = 2
        const val TARGET_PEER_BROADCAST: Int = 0
        const val TARGET_PEER_SERVER: Int = 1


    }


    // Properties
    open var refuseNewConnections: Boolean
        get() = _icall_Boolean(isRefusingNewConnectionsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRefuseNewConnectionsMethodBind, this.rawMemory, value)


    open var transferMode: Int
        get() = _icall_Int(getTransferModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTransferModeMethodBind, this.rawMemory, value)




    // Methods
    private val setTransferModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "set_transfer_mode") }
    open fun setTransferMode(mode: Int) {
        _icall_Unit_Int(setTransferModeMethodBind, this.rawMemory, mode)
    }


    private val getTransferModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "get_transfer_mode") }
    open fun getTransferMode(): NetworkedMultiplayerPeer.TransferMode {
        return NetworkedMultiplayerPeer.TransferMode.fromInt(_icall_Int(getTransferModeMethodBind, this.rawMemory))
    }


    private val setTargetPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "set_target_peer") }
    open fun setTargetPeer(id: Int) {
        _icall_Unit_Int(setTargetPeerMethodBind, this.rawMemory, id)
    }


    private val getPacketPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "get_packet_peer") }
    open fun getPacketPeer(): Int {
        return _icall_Int(getPacketPeerMethodBind, this.rawMemory)
    }


    private val pollMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "poll") }
    open fun poll() {
        _icall_Unit(pollMethodBind, this.rawMemory)
    }


    private val getConnectionStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "get_connection_status") }
    open fun getConnectionStatus(): NetworkedMultiplayerPeer.ConnectionStatus {
        return NetworkedMultiplayerPeer.ConnectionStatus.fromInt(_icall_Int(getConnectionStatusMethodBind, this.rawMemory))
    }


    private val getUniqueIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "get_unique_id") }
    open fun getUniqueId(): Int {
        return _icall_Int(getUniqueIdMethodBind, this.rawMemory)
    }


    private val setRefuseNewConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "set_refuse_new_connections") }
    open fun setRefuseNewConnections(enable: Boolean) {
        _icall_Unit_Boolean(setRefuseNewConnectionsMethodBind, this.rawMemory, enable)
    }


    private val isRefusingNewConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerPeer", "is_refusing_new_connections") }
    open fun isRefusingNewConnections(): Boolean {
        return _icall_Boolean(isRefusingNewConnectionsMethodBind, this.rawMemory)
    }


}
