@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PacketPeerUDP : PacketPeer {
    constructor() : super("PacketPeerUDP")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: PacketPeer): PacketPeerUDP = PacketPeerUDP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PacketPeerUDP = PacketPeerUDP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PacketPeerUDP = PacketPeerUDP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PacketPeerUDP = fromVariant(PacketPeerUDP(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val listenMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "listen") }
    open fun listen(port: Long, bindAddress: String = "*", recvBufSize: Long = 65536): GodotError {
        return GodotError.fromInt(_icall_Long_Long_String_Long(listenMethodBind, this.rawMemory, port, bindAddress, recvBufSize))
    }


    private val closeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "close") }
    open fun close() {
        _icall_Unit(closeMethodBind, this.rawMemory)
    }


    private val waitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "wait") }
    open fun wait(): GodotError {
        return GodotError.fromInt(_icall_Long(waitMethodBind, this.rawMemory))
    }


    private val isListeningMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "is_listening") }
    open fun isListening(): Boolean {
        return _icall_Boolean(isListeningMethodBind, this.rawMemory)
    }


    private val getPacketIpMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "get_packet_ip") }
    open fun getPacketIp(): String {
        return _icall_String(getPacketIpMethodBind, this.rawMemory)
    }


    private val getPacketPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "get_packet_port") }
    open fun getPacketPort(): Long {
        return _icall_Long(getPacketPortMethodBind, this.rawMemory)
    }


    private val setDestAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerUDP", "set_dest_address") }
    open fun setDestAddress(host: String, port: Long): GodotError {
        return GodotError.fromInt(_icall_Long_String_Long(setDestAddressMethodBind, this.rawMemory, host, port))
    }


}
