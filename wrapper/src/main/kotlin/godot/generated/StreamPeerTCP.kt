@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StreamPeerTCP : StreamPeer {
    constructor() : super("StreamPeerTCP")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Status(val id: Long) {
        STATUS_NONE(0),
        STATUS_CONNECTING(1),
        STATUS_CONNECTED(2),
        STATUS_ERROR(3),
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
        infix fun from(other: StreamPeer): StreamPeerTCP = StreamPeerTCP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StreamPeerTCP = StreamPeerTCP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StreamPeerTCP = StreamPeerTCP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StreamPeerTCP = fromVariant(StreamPeerTCP(""), other)


        // Constants
        const val STATUS_NONE: Long = 0
        const val STATUS_CONNECTING: Long = 1
        const val STATUS_CONNECTED: Long = 2
        const val STATUS_ERROR: Long = 3


    }


    // Properties


    // Methods
    private val connectToHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "connect_to_host") }
    open fun connectToHost(host: String, port: Long): GodotError {
        return GodotError.fromInt(_icall_Long_String_Long(connectToHostMethodBind, this.rawMemory, host, port))
    }


    private val isConnectedToHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "is_connected_to_host") }
    open fun isConnectedToHost(): Boolean {
        return _icall_Boolean(isConnectedToHostMethodBind, this.rawMemory)
    }


    private val getStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "get_status") }
    open fun getStatus(): StreamPeerTCP.Status {
        return StreamPeerTCP.Status.fromInt(_icall_Long(getStatusMethodBind, this.rawMemory))
    }


    private val getConnectedHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "get_connected_host") }
    open fun getConnectedHost(): String {
        return _icall_String(getConnectedHostMethodBind, this.rawMemory)
    }


    private val getConnectedPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "get_connected_port") }
    open fun getConnectedPort(): Long {
        return _icall_Long(getConnectedPortMethodBind, this.rawMemory)
    }


    private val disconnectFromHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "disconnect_from_host") }
    open fun disconnectFromHost() {
        _icall_Unit(disconnectFromHostMethodBind, this.rawMemory)
    }


    private val setNoDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerTCP", "set_no_delay") }
    open fun setNoDelay(enabled: Boolean) {
        _icall_Unit_Boolean(setNoDelayMethodBind, this.rawMemory, enabled)
    }


}
