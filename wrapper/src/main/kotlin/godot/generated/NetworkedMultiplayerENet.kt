@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NetworkedMultiplayerENet : NetworkedMultiplayerPeer {
    constructor() : super("NetworkedMultiplayerENet")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class CompressionMode(val id: Int) {
        COMPRESS_NONE(0),
        COMPRESS_RANGE_CODER(1),
        COMPRESS_FASTLZ(2),
        COMPRESS_ZLIB(3),
        COMPRESS_ZSTD(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: NetworkedMultiplayerPeer): NetworkedMultiplayerENet = NetworkedMultiplayerENet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: PacketPeer): NetworkedMultiplayerENet = NetworkedMultiplayerENet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): NetworkedMultiplayerENet = NetworkedMultiplayerENet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NetworkedMultiplayerENet = NetworkedMultiplayerENet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NetworkedMultiplayerENet = fromVariant(NetworkedMultiplayerENet(""), other)


        // Constants
        const val COMPRESS_NONE: Int = 0
        const val COMPRESS_RANGE_CODER: Int = 1
        const val COMPRESS_FASTLZ: Int = 2
        const val COMPRESS_ZLIB: Int = 3
        const val COMPRESS_ZSTD: Int = 4


    }


    // Properties
    open var compressionMode: Int
        get() = _icall_Int(getCompressionModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCompressionModeMethodBind, this.rawMemory, value)


    open var transferChannel: Int
        get() = _icall_Int(getTransferChannelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTransferChannelMethodBind, this.rawMemory, value)


    open var channelCount: Int
        get() = _icall_Int(getChannelCountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setChannelCountMethodBind, this.rawMemory, value)


    open var alwaysOrdered: Boolean
        get() = _icall_Boolean(isAlwaysOrderedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAlwaysOrderedMethodBind, this.rawMemory, value)




    // Methods
    private val createServerMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "create_server") }
    open fun createServer(port: Int, maxClients: Int = 32, inBandwidth: Int = 0, outBandwidth: Int = 0): GodotError {
        return GodotError.fromInt(_icall_Int_Int_Int_Int_Int(createServerMethodBind, this.rawMemory, port, maxClients, inBandwidth, outBandwidth))
    }


    private val createClientMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "create_client") }
    open fun createClient(address: String, port: Int, inBandwidth: Int = 0, outBandwidth: Int = 0, clientPort: Int = 0): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int_Int_Int_Int(createClientMethodBind, this.rawMemory, address, port, inBandwidth, outBandwidth, clientPort))
    }


    private val closeConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "close_connection") }
    open fun closeConnection(waitUsec: Int = 100) {
        _icall_Unit_Int(closeConnectionMethodBind, this.rawMemory, waitUsec)
    }


    private val disconnectPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "disconnect_peer") }
    open fun disconnectPeer(id: Int, now: Boolean = false) {
        _icall_Unit_Int_Boolean(disconnectPeerMethodBind, this.rawMemory, id, now)
    }


    private val setCompressionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_compression_mode") }
    open fun setCompressionMode(mode: Int) {
        _icall_Unit_Int(setCompressionModeMethodBind, this.rawMemory, mode)
    }


    private val getCompressionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_compression_mode") }
    open fun getCompressionMode(): NetworkedMultiplayerENet.CompressionMode {
        return NetworkedMultiplayerENet.CompressionMode.fromInt(_icall_Int(getCompressionModeMethodBind, this.rawMemory))
    }


    private val setBindIpMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_bind_ip") }
    open fun setBindIp(ip: String) {
        _icall_Unit_String(setBindIpMethodBind, this.rawMemory, ip)
    }


    private val getPeerAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_peer_address") }
    open fun getPeerAddress(id: Int): String {
        return _icall_String_Int(getPeerAddressMethodBind, this.rawMemory, id)
    }


    private val getPeerPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_peer_port") }
    open fun getPeerPort(id: Int): Int {
        return _icall_Int_Int(getPeerPortMethodBind, this.rawMemory, id)
    }


    private val getPacketChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_packet_channel") }
    open fun getPacketChannel(): Int {
        return _icall_Int(getPacketChannelMethodBind, this.rawMemory)
    }


    private val getLastPacketChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_last_packet_channel") }
    open fun getLastPacketChannel(): Int {
        return _icall_Int(getLastPacketChannelMethodBind, this.rawMemory)
    }


    private val setTransferChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_transfer_channel") }
    open fun setTransferChannel(channel: Int) {
        _icall_Unit_Int(setTransferChannelMethodBind, this.rawMemory, channel)
    }


    private val getTransferChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_transfer_channel") }
    open fun getTransferChannel(): Int {
        return _icall_Int(getTransferChannelMethodBind, this.rawMemory)
    }


    private val setChannelCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_channel_count") }
    open fun setChannelCount(channels: Int) {
        _icall_Unit_Int(setChannelCountMethodBind, this.rawMemory, channels)
    }


    private val getChannelCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_channel_count") }
    open fun getChannelCount(): Int {
        return _icall_Int(getChannelCountMethodBind, this.rawMemory)
    }


    private val setAlwaysOrderedMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_always_ordered") }
    open fun setAlwaysOrdered(ordered: Boolean) {
        _icall_Unit_Boolean(setAlwaysOrderedMethodBind, this.rawMemory, ordered)
    }


    private val isAlwaysOrderedMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "is_always_ordered") }
    open fun isAlwaysOrdered(): Boolean {
        return _icall_Boolean(isAlwaysOrderedMethodBind, this.rawMemory)
    }


}
