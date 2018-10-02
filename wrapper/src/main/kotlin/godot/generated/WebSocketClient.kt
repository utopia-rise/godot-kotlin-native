@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WebSocketClient : WebSocketMultiplayerPeer {
    constructor() : super("WebSocketClient")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val CONNECTION_ESTABLISHED: String = "connection_established"
            const val DATA_RECEIVED: String = "data_received"
            const val CONNECTION_ERROR: String = "connection_error"
            const val CONNECTION_CLOSED: String = "connection_closed"
        }
    }


    companion object {
        infix fun from(other: WebSocketMultiplayerPeer): WebSocketClient = WebSocketClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: NetworkedMultiplayerPeer): WebSocketClient = WebSocketClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: PacketPeer): WebSocketClient = WebSocketClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): WebSocketClient = WebSocketClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WebSocketClient = WebSocketClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WebSocketClient = fromVariant(WebSocketClient(""), other)


        // Constants


    }


    // Properties
    open var verifySsl: Boolean
        get() = _icall_Boolean(isVerifySslEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setVerifySslEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val connectToUrlMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketClient", "connect_to_url") }
    open fun connectToUrl(url: String, protocols: PoolStringArray = PoolStringArray(), gdMpApi: Boolean = false): GodotError {
        return GodotError.fromInt(_icall_Int_String_PoolStringArray_Boolean(connectToUrlMethodBind, this.rawMemory, url, protocols, gdMpApi))
    }


    private val disconnectFromHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketClient", "disconnect_from_host") }
    open fun disconnectFromHost() {
        _icall_Unit(disconnectFromHostMethodBind, this.rawMemory)
    }


    private val setVerifySslEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketClient", "set_verify_ssl_enabled") }
    open fun setVerifySslEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setVerifySslEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isVerifySslEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketClient", "is_verify_ssl_enabled") }
    open fun isVerifySslEnabled(): Boolean {
        return _icall_Boolean(isVerifySslEnabledMethodBind, this.rawMemory)
    }


}
