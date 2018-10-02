@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StreamPeerSSL : StreamPeer {
    constructor() : super("StreamPeerSSL")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Status(val id: Long) {
        STATUS_DISCONNECTED(0),
        STATUS_CONNECTED(2),
        STATUS_ERROR(3),
        STATUS_ERROR_HOSTNAME_MISMATCH(4),
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
        infix fun from(other: StreamPeer): StreamPeerSSL = StreamPeerSSL("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StreamPeerSSL = StreamPeerSSL("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StreamPeerSSL = StreamPeerSSL("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StreamPeerSSL = fromVariant(StreamPeerSSL(""), other)


        // Constants
        const val STATUS_DISCONNECTED: Long = 0
        const val STATUS_CONNECTED: Long = 2
        const val STATUS_ERROR: Long = 3
        const val STATUS_ERROR_HOSTNAME_MISMATCH: Long = 4


    }


    // Properties
    open var blockingHandshake: Boolean
        get() = _icall_Boolean(isBlockingHandshakeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setBlockingHandshakeEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val pollMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "poll") }
    open fun poll() {
        _icall_Unit(pollMethodBind, this.rawMemory)
    }


    private val acceptStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "accept_stream") }
    open fun acceptStream(arg0: StreamPeer): GodotError {
        return GodotError.fromInt(_icall_Long_Object(acceptStreamMethodBind, this.rawMemory, arg0))
    }


    private val connectToStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "connect_to_stream") }
    open fun connectToStream(stream: StreamPeer, validateCerts: Boolean = false, forHostname: String = ""): GodotError {
        return GodotError.fromInt(_icall_Long_Object_Boolean_String(connectToStreamMethodBind, this.rawMemory, stream, validateCerts, forHostname))
    }


    private val getStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "get_status") }
    open fun getStatus(): StreamPeerSSL.Status {
        return StreamPeerSSL.Status.fromInt(_icall_Long(getStatusMethodBind, this.rawMemory))
    }


    private val disconnectFromStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "disconnect_from_stream") }
    open fun disconnectFromStream() {
        _icall_Unit(disconnectFromStreamMethodBind, this.rawMemory)
    }


    private val setBlockingHandshakeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "set_blocking_handshake_enabled") }
    open fun setBlockingHandshakeEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setBlockingHandshakeEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isBlockingHandshakeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerSSL", "is_blocking_handshake_enabled") }
    open fun isBlockingHandshakeEnabled(): Boolean {
        return _icall_Boolean(isBlockingHandshakeEnabledMethodBind, this.rawMemory)
    }


}
