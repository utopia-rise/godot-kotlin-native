@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WebSocketMultiplayerPeer : NetworkedMultiplayerPeer {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val PEER_PACKET: String = "peer_packet"
        }
    }


    companion object {
        infix fun from(other: NetworkedMultiplayerPeer): WebSocketMultiplayerPeer = WebSocketMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: PacketPeer): WebSocketMultiplayerPeer = WebSocketMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): WebSocketMultiplayerPeer = WebSocketMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WebSocketMultiplayerPeer = WebSocketMultiplayerPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WebSocketMultiplayerPeer = fromVariant(WebSocketMultiplayerPeer(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketMultiplayerPeer", "get_peer") }
    open fun getPeer(peerId: Long): WebSocketPeer {
        return _icall_WebSocketPeer_Long(getPeerMethodBind, this.rawMemory, peerId)
    }


}
