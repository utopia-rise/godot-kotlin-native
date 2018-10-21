@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MultiplayerAPI : Reference {
    constructor() : super("MultiplayerAPI")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class RPCMode(val id: Long) {
        RPC_MODE_DISABLED(0),
        RPC_MODE_REMOTE(1),
        RPC_MODE_SYNC(2),
        RPC_MODE_MASTER(3),
        RPC_MODE_SLAVE(4),
        RPC_MODE_REMOTESYNC(5),
        RPC_MODE_MASTERSYNC(6),
        RPC_MODE_SLAVESYNC(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val CONNECTED_TO_SERVER: String = "connected_to_server"
            const val CONNECTION_FAILED: String = "connection_failed"
            const val NETWORK_PEER_PACKET: String = "network_peer_packet"
            const val NETWORK_PEER_DISCONNECTED: String = "network_peer_disconnected"
            const val NETWORK_PEER_CONNECTED: String = "network_peer_connected"
            const val SERVER_DISCONNECTED: String = "server_disconnected"
        }
    }


    companion object {
        infix fun from(other: Reference): MultiplayerAPI = MultiplayerAPI("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MultiplayerAPI = MultiplayerAPI("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MultiplayerAPI = fromVariant(MultiplayerAPI(""), other)


        // Constants
        const val RPC_MODE_DISABLED: Long = 0
        const val RPC_MODE_REMOTE: Long = 1
        const val RPC_MODE_SYNC: Long = 2
        const val RPC_MODE_MASTER: Long = 3
        const val RPC_MODE_SLAVE: Long = 4
        const val RPC_MODE_REMOTESYNC: Long = 5
        const val RPC_MODE_MASTERSYNC: Long = 6
        const val RPC_MODE_SLAVESYNC: Long = 7


    }


    // Properties
    open var refuseNewNetworkConnections: Boolean
        get() = _icall_Boolean(isRefusingNewNetworkConnectionsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRefuseNewNetworkConnectionsMethodBind, this.rawMemory, value)


    open var networkPeer: NetworkedMultiplayerPeer
        get() = _icall_NetworkedMultiplayerPeer(getNetworkPeerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNetworkPeerMethodBind, this.rawMemory, value)




    // Methods
    private val setRootNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "set_root_node") }
    open fun setRootNode(node: Object) {
        _icall_Unit_Object(setRootNodeMethodBind, this.rawMemory, node)
    }


    private val sendBytesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "send_bytes") }
    open fun sendBytes(bytes: PoolByteArray, id: Long = 0, arg2: Long = 2): GodotError {
        return GodotError.fromInt(_icall_Long_PoolByteArray_Long_Long(sendBytesMethodBind, this.rawMemory, bytes, id, arg2))
    }


    private val hasNetworkPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "has_network_peer") }
    open fun hasNetworkPeer(): Boolean {
        return _icall_Boolean(hasNetworkPeerMethodBind, this.rawMemory)
    }


    private val getNetworkPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "get_network_peer") }
    open fun getNetworkPeer(): NetworkedMultiplayerPeer {
        return _icall_NetworkedMultiplayerPeer(getNetworkPeerMethodBind, this.rawMemory)
    }


    private val getNetworkUniqueIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "get_network_unique_id") }
    open fun getNetworkUniqueId(): Long {
        return _icall_Long(getNetworkUniqueIdMethodBind, this.rawMemory)
    }


    private val isNetworkServerMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "is_network_server") }
    open fun isNetworkServer(): Boolean {
        return _icall_Boolean(isNetworkServerMethodBind, this.rawMemory)
    }


    private val getRpcSenderIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "get_rpc_sender_id") }
    open fun getRpcSenderId(): Long {
        return _icall_Long(getRpcSenderIdMethodBind, this.rawMemory)
    }


    open fun _add_peer(id: Long) {
    }


    open fun _del_peer(id: Long) {
    }


    private val setNetworkPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "set_network_peer") }
    open fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
        _icall_Unit_Object(setNetworkPeerMethodBind, this.rawMemory, peer)
    }


    private val pollMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "poll") }
    open fun poll() {
        _icall_Unit(pollMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    open fun _connected_to_server() {
    }


    open fun _connection_failed() {
    }


    open fun _server_disconnected() {
    }


    private val getNetworkConnectedPeersMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "get_network_connected_peers") }
    open fun getNetworkConnectedPeers(): PoolIntArray {
        return _icall_PoolIntArray(getNetworkConnectedPeersMethodBind, this.rawMemory)
    }


    private val setRefuseNewNetworkConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "set_refuse_new_network_connections") }
    open fun setRefuseNewNetworkConnections(refuse: Boolean) {
        _icall_Unit_Boolean(setRefuseNewNetworkConnectionsMethodBind, this.rawMemory, refuse)
    }


    private val isRefusingNewNetworkConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiplayerAPI", "is_refusing_new_network_connections") }
    open fun isRefusingNewNetworkConnections(): Boolean {
        return _icall_Boolean(isRefusingNewNetworkConnectionsMethodBind, this.rawMemory)
    }


}
