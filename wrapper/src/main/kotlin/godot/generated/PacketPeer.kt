@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PacketPeer : Reference {
    private constructor() : super("")
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
        infix fun from(other: Reference): PacketPeer = PacketPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PacketPeer = PacketPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PacketPeer = fromVariant(PacketPeer(""), other)


        // Constants


    }


    // Properties
    open var allowObjectDecoding: Boolean
        get() = _icall_Boolean(isObjectDecodingAllowedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAllowObjectDecodingMethodBind, this.rawMemory, value)




    // Methods
    private val getVarMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "get_var") }
    open fun getVar(): Variant {
        return _icall_Variant(getVarMethodBind, this.rawMemory)
    }


    private val putVarMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "put_var") }
    open fun putVar(_var: Variant): GodotError {
        return GodotError.fromInt(_icall_Long_Variant(putVarMethodBind, this.rawMemory, _var))
    }


    private val getPacketMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "get_packet") }
    open fun getPacket(): PoolByteArray {
        return _icall_PoolByteArray(getPacketMethodBind, this.rawMemory)
    }


    private val putPacketMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "put_packet") }
    open fun putPacket(buffer: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Long_PoolByteArray(putPacketMethodBind, this.rawMemory, buffer))
    }


    private val getPacketErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "get_packet_error") }
    open fun getPacketError(): GodotError {
        return GodotError.fromInt(_icall_Long(getPacketErrorMethodBind, this.rawMemory))
    }


    private val getAvailablePacketCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "get_available_packet_count") }
    open fun getAvailablePacketCount(): Long {
        return _icall_Long(getAvailablePacketCountMethodBind, this.rawMemory)
    }


    private val setAllowObjectDecodingMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "set_allow_object_decoding") }
    open fun setAllowObjectDecoding(enable: Boolean) {
        _icall_Unit_Boolean(setAllowObjectDecodingMethodBind, this.rawMemory, enable)
    }


    private val isObjectDecodingAllowedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeer", "is_object_decoding_allowed") }
    open fun isObjectDecodingAllowed(): Boolean {
        return _icall_Boolean(isObjectDecodingAllowedMethodBind, this.rawMemory)
    }


}
