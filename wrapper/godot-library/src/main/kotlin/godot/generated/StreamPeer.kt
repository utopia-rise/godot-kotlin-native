@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StreamPeer : Reference {
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
        infix fun from(other: Reference): StreamPeer = StreamPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StreamPeer = StreamPeer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StreamPeer = fromVariant(StreamPeer(""), other)


        // Constants


    }


    // Properties
    open var bigEndian: Boolean
        get() = _icall_Boolean(isBigEndianEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setBigEndianMethodBind, this.rawMemory, value)




    // Methods
    private val putDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_data") }
    open fun putData(data: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Long_PoolByteArray(putDataMethodBind, this.rawMemory, data))
    }


    private val putPartialDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_partial_data") }
    open fun putPartialData(data: PoolByteArray): GDArray {
        return _icall_GDArray_PoolByteArray(putPartialDataMethodBind, this.rawMemory, data)
    }


    private val getDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_data") }
    open fun getData(bytes: Long): GDArray {
        return _icall_GDArray_Long(getDataMethodBind, this.rawMemory, bytes)
    }


    private val getPartialDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_partial_data") }
    open fun getPartialData(bytes: Long): GDArray {
        return _icall_GDArray_Long(getPartialDataMethodBind, this.rawMemory, bytes)
    }


    private val getAvailableBytesMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_available_bytes") }
    open fun getAvailableBytes(): Long {
        return _icall_Long(getAvailableBytesMethodBind, this.rawMemory)
    }


    private val setBigEndianMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "set_big_endian") }
    open fun setBigEndian(enable: Boolean) {
        _icall_Unit_Boolean(setBigEndianMethodBind, this.rawMemory, enable)
    }


    private val isBigEndianEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "is_big_endian_enabled") }
    open fun isBigEndianEnabled(): Boolean {
        return _icall_Boolean(isBigEndianEnabledMethodBind, this.rawMemory)
    }


    private val put8MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_8") }
    open fun put8(value: Long) {
        _icall_Unit_Long(put8MethodBind, this.rawMemory, value)
    }


    private val putU8MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_u8") }
    open fun putU8(value: Long) {
        _icall_Unit_Long(putU8MethodBind, this.rawMemory, value)
    }


    private val put16MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_16") }
    open fun put16(value: Long) {
        _icall_Unit_Long(put16MethodBind, this.rawMemory, value)
    }


    private val putU16MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_u16") }
    open fun putU16(value: Long) {
        _icall_Unit_Long(putU16MethodBind, this.rawMemory, value)
    }


    private val put32MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_32") }
    open fun put32(value: Long) {
        _icall_Unit_Long(put32MethodBind, this.rawMemory, value)
    }


    private val putU32MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_u32") }
    open fun putU32(value: Long) {
        _icall_Unit_Long(putU32MethodBind, this.rawMemory, value)
    }


    private val put64MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_64") }
    open fun put64(value: Long) {
        _icall_Unit_Long(put64MethodBind, this.rawMemory, value)
    }


    private val putU64MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_u64") }
    open fun putU64(value: Long) {
        _icall_Unit_Long(putU64MethodBind, this.rawMemory, value)
    }


    private val putFloatMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_float") }
    open fun putFloat(value: Double) {
        _icall_Unit_Double(putFloatMethodBind, this.rawMemory, value)
    }


    private val putDoubleMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_double") }
    open fun putDouble(value: Double) {
        _icall_Unit_Double(putDoubleMethodBind, this.rawMemory, value)
    }


    private val putUtf8StringMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_utf8_string") }
    open fun putUtf8String(value: String) {
        _icall_Unit_String(putUtf8StringMethodBind, this.rawMemory, value)
    }


    private val putVarMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "put_var") }
    open fun putVar(value: Variant) {
        _icall_Unit_Variant(putVarMethodBind, this.rawMemory, value)
    }


    private val get8MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_8") }
    open fun get8(): Long {
        return _icall_Long(get8MethodBind, this.rawMemory)
    }


    private val getU8MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_u8") }
    open fun getU8(): Long {
        return _icall_Long(getU8MethodBind, this.rawMemory)
    }


    private val get16MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_16") }
    open fun get16(): Long {
        return _icall_Long(get16MethodBind, this.rawMemory)
    }


    private val getU16MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_u16") }
    open fun getU16(): Long {
        return _icall_Long(getU16MethodBind, this.rawMemory)
    }


    private val get32MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_32") }
    open fun get32(): Long {
        return _icall_Long(get32MethodBind, this.rawMemory)
    }


    private val getU32MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_u32") }
    open fun getU32(): Long {
        return _icall_Long(getU32MethodBind, this.rawMemory)
    }


    private val get64MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_64") }
    open fun get64(): Long {
        return _icall_Long(get64MethodBind, this.rawMemory)
    }


    private val getU64MethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_u64") }
    open fun getU64(): Long {
        return _icall_Long(getU64MethodBind, this.rawMemory)
    }


    private val getFloatMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_float") }
    open fun getFloat(): Double {
        return _icall_Double(getFloatMethodBind, this.rawMemory)
    }


    private val getDoubleMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_double") }
    open fun getDouble(): Double {
        return _icall_Double(getDoubleMethodBind, this.rawMemory)
    }


    private val getStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_string") }
    open fun getString(bytes: Long): String {
        return _icall_String_Long(getStringMethodBind, this.rawMemory, bytes)
    }


    private val getUtf8StringMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_utf8_string") }
    open fun getUtf8String(bytes: Long): String {
        return _icall_String_Long(getUtf8StringMethodBind, this.rawMemory, bytes)
    }


    private val getVarMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeer", "get_var") }
    open fun getVar(): Variant {
        return _icall_Variant(getVarMethodBind, this.rawMemory)
    }


}
