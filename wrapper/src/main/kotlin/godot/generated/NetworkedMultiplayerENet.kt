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

    enum class CompressionMode(val id: Long) {
        COMPRESS_NONE(0),
        COMPRESS_RANGE_CODER(1),
        COMPRESS_FASTLZ(2),
        COMPRESS_ZLIB(3),
        COMPRESS_ZSTD(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
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
        const val COMPRESS_NONE: Long = 0
        const val COMPRESS_RANGE_CODER: Long = 1
        const val COMPRESS_FASTLZ: Long = 2
        const val COMPRESS_ZLIB: Long = 3
        const val COMPRESS_ZSTD: Long = 4


    }


    // Properties
    open var compressionMode: Long
        get() = _icall_Long(getCompressionModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCompressionModeMethodBind, this.rawMemory, value)


    open var transferChannel: Long
        get() = _icall_Long(getTransferChannelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTransferChannelMethodBind, this.rawMemory, value)


    open var channelCount: Long
        get() = _icall_Long(getChannelCountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setChannelCountMethodBind, this.rawMemory, value)


    open var alwaysOrdered: Boolean
        get() = _icall_Boolean(isAlwaysOrderedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAlwaysOrderedMethodBind, this.rawMemory, value)




    // Methods
    private val createServerMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "create_server") }
    open fun createServer(port: Long, maxClients: Long = 32, inBandwidth: Long = 0, outBandwidth: Long = 0): GodotError {
        return GodotError.fromInt(_icall_Long_Long_Long_Long_Long(createServerMethodBind, this.rawMemory, port, maxClients, inBandwidth, outBandwidth))
    }


    private val createClientMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "create_client") }
    open fun createClient(address: String, port: Long, inBandwidth: Long = 0, outBandwidth: Long = 0, clientPort: Long = 0): GodotError {
        return GodotError.fromInt(_icall_Long_String_Long_Long_Long_Long(createClientMethodBind, this.rawMemory, address, port, inBandwidth, outBandwidth, clientPort))
    }


    private val closeConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "close_connection") }
    open fun closeConnection(waitUsec: Long = 100) {
        _icall_Unit_Long(closeConnectionMethodBind, this.rawMemory, waitUsec)
    }


    private val disconnectPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "disconnect_peer") }
    open fun disconnectPeer(id: Long, now: Boolean = false) {
        _icall_Unit_Long_Boolean(disconnectPeerMethodBind, this.rawMemory, id, now)
    }


    private val setCompressionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_compression_mode") }
    open fun setCompressionMode(mode: Long) {
        _icall_Unit_Long(setCompressionModeMethodBind, this.rawMemory, mode)
    }


    private val getCompressionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_compression_mode") }
    open fun getCompressionMode(): NetworkedMultiplayerENet.CompressionMode {
        return NetworkedMultiplayerENet.CompressionMode.fromInt(_icall_Long(getCompressionModeMethodBind, this.rawMemory))
    }


    private val setBindIpMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_bind_ip") }
    open fun setBindIp(ip: String) {
        _icall_Unit_String(setBindIpMethodBind, this.rawMemory, ip)
    }


    private val getPeerAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_peer_address") }
    open fun getPeerAddress(id: Long): String {
        return _icall_String_Long(getPeerAddressMethodBind, this.rawMemory, id)
    }


    private val getPeerPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_peer_port") }
    open fun getPeerPort(id: Long): Long {
        return _icall_Long_Long(getPeerPortMethodBind, this.rawMemory, id)
    }


    private val getPacketChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_packet_channel") }
    open fun getPacketChannel(): Long {
        return _icall_Long(getPacketChannelMethodBind, this.rawMemory)
    }


    private val getLastPacketChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_last_packet_channel") }
    open fun getLastPacketChannel(): Long {
        return _icall_Long(getLastPacketChannelMethodBind, this.rawMemory)
    }


    private val setTransferChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_transfer_channel") }
    open fun setTransferChannel(channel: Long) {
        _icall_Unit_Long(setTransferChannelMethodBind, this.rawMemory, channel)
    }


    private val getTransferChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_transfer_channel") }
    open fun getTransferChannel(): Long {
        return _icall_Long(getTransferChannelMethodBind, this.rawMemory)
    }


    private val setChannelCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "set_channel_count") }
    open fun setChannelCount(channels: Long) {
        _icall_Unit_Long(setChannelCountMethodBind, this.rawMemory, channels)
    }


    private val getChannelCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NetworkedMultiplayerENet", "get_channel_count") }
    open fun getChannelCount(): Long {
        return _icall_Long(getChannelCountMethodBind, this.rawMemory)
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
