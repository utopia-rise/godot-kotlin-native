@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TCP_Server : Reference {
    constructor() : super("TCP_Server")
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
        infix fun from(other: Reference): TCP_Server = TCP_Server("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TCP_Server = TCP_Server("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TCP_Server = fromVariant(TCP_Server(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val listenMethodBind: CPointer<godot_method_bind> by lazy { getMB("TCP_Server", "listen") }
    open fun listen(port: Int, bindAddress: String = "*"): GodotError {
        return GodotError.fromInt(_icall_Int_Int_String(listenMethodBind, this.rawMemory, port, bindAddress))
    }


    private val isConnectionAvailableMethodBind: CPointer<godot_method_bind> by lazy { getMB("TCP_Server", "is_connection_available") }
    open fun isConnectionAvailable(): Boolean {
        return _icall_Boolean(isConnectionAvailableMethodBind, this.rawMemory)
    }


    private val takeConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TCP_Server", "take_connection") }
    open fun takeConnection(): StreamPeerTCP {
        return _icall_StreamPeerTCP(takeConnectionMethodBind, this.rawMemory)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("TCP_Server", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


}
