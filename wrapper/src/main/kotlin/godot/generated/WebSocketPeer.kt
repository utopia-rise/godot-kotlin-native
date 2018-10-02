@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WebSocketPeer : PacketPeer {
    constructor() : super("WebSocketPeer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class WriteMode(val id: Int) {
        WRITE_MODE_TEXT(0),
        WRITE_MODE_BINARY(1),
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
        infix fun from(other: PacketPeer): WebSocketPeer = WebSocketPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): WebSocketPeer = WebSocketPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WebSocketPeer = WebSocketPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WebSocketPeer = fromVariant(WebSocketPeer(""), other)


        // Constants
        const val WRITE_MODE_TEXT: Int = 0
        const val WRITE_MODE_BINARY: Int = 1


    }


    // Properties


    // Methods
    private val getWriteModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "get_write_mode") }
    open fun getWriteMode(): WebSocketPeer.WriteMode {
        return WebSocketPeer.WriteMode.fromInt(_icall_Int(getWriteModeMethodBind, this.rawMemory))
    }


    private val setWriteModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "set_write_mode") }
    open fun setWriteMode(mode: Int) {
        _icall_Unit_Int(setWriteModeMethodBind, this.rawMemory, mode)
    }


    private val isConnectedToHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "is_connected_to_host") }
    open fun isConnectedToHost(): Boolean {
        return _icall_Boolean(isConnectedToHostMethodBind, this.rawMemory)
    }


    private val wasStringPacketMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "was_string_packet") }
    open fun wasStringPacket(): Boolean {
        return _icall_Boolean(wasStringPacketMethodBind, this.rawMemory)
    }


    private val closeMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "close") }
    open fun close() {
        _icall_Unit(closeMethodBind, this.rawMemory)
    }


    private val getConnectedHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "get_connected_host") }
    open fun getConnectedHost(): String {
        return _icall_String(getConnectedHostMethodBind, this.rawMemory)
    }


    private val getConnectedPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("WebSocketPeer", "get_connected_port") }
    open fun getConnectedPort(): Int {
        return _icall_Int(getConnectedPortMethodBind, this.rawMemory)
    }


}
