@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WebSocketServer : WebSocketMultiplayerPeer {
    constructor() : super("WebSocketServer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val DATA_RECEIVED: String = "data_received"
            const val CLIENT_CONNECTED: String = "client_connected"
            const val CLIENT_DISCONNECTED: String = "client_disconnected"
        }
    }


    companion object {
        infix fun from(other: WebSocketMultiplayerPeer): WebSocketServer = WebSocketServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: NetworkedMultiplayerPeer): WebSocketServer = WebSocketServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: PacketPeer): WebSocketServer = WebSocketServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): WebSocketServer = WebSocketServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WebSocketServer = WebSocketServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WebSocketServer = fromVariant(WebSocketServer(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val isListeningMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "is_listening") }
    open fun isListening(): Boolean {
        return _icall_Boolean(isListeningMethodBind, this.rawMemory)
    }


    private val listenMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "listen") }
    open fun listen(port: Int, protocols: PoolStringArray = PoolStringArray(), gdMpApi: Boolean = false): GodotError {
        return GodotError.fromInt(_icall_Int_Int_PoolStringArray_Boolean(listenMethodBind, this.rawMemory, port, protocols, gdMpApi))
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val hasPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "has_peer") }
    open fun hasPeer(id: Int): Boolean {
        return _icall_Boolean_Int(hasPeerMethodBind, this.rawMemory, id)
    }


    private val getPeerAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "get_peer_address") }
    open fun getPeerAddress(id: Int): String {
        return _icall_String_Int(getPeerAddressMethodBind, this.rawMemory, id)
    }


    private val getPeerPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "get_peer_port") }
    open fun getPeerPort(id: Int): Int {
        return _icall_Int_Int(getPeerPortMethodBind, this.rawMemory, id)
    }


    private val disconnectPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketServer", "disconnect_peer") }
    open fun disconnectPeer(id: Int) {
        _icall_Unit_Int(disconnectPeerMethodBind, this.rawMemory, id)
    }


}
