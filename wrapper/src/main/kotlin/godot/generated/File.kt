@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class File : Reference {
    constructor() : super("File")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class CompressionMode(val id: Int) {
        COMPRESSION_FASTLZ(0),
        COMPRESSION_DEFLATE(1),
        COMPRESSION_ZSTD(2),
        COMPRESSION_GZIP(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ModeFlags(val id: Int) {
        READ(1),
        WRITE(2),
        READ_WRITE(3),
        WRITE_READ(7),
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
        infix fun from(other: Reference): File = File("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): File = File("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): File = fromVariant(File(""), other)


        // Constants
        const val READ: Int = 1
        const val WRITE: Int = 2
        const val READ_WRITE: Int = 3
        const val WRITE_READ: Int = 7
        const val COMPRESSION_FASTLZ: Int = 0
        const val COMPRESSION_DEFLATE: Int = 1
        const val COMPRESSION_ZSTD: Int = 2
        const val COMPRESSION_GZIP: Int = 3


    }


    // Properties
    open var endianSwap: Boolean
        get() = _icall_Boolean(getEndianSwapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEndianSwapMethodBind, this.rawMemory, value)




    // Methods
    private val openEncryptedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "open_encrypted") }
    open fun openEncrypted(path: String, modeFlags: Int, key: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int_PoolByteArray(openEncryptedMethodBind, this.rawMemory, path, modeFlags, key))
    }


    private val openEncryptedWithPassMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "open_encrypted_with_pass") }
    open fun openEncryptedWithPass(path: String, modeFlags: Int, pass: String): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int_String(openEncryptedWithPassMethodBind, this.rawMemory, path, modeFlags, pass))
    }


    private val openCompressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "open_compressed") }
    open fun openCompressed(path: String, modeFlags: Int, compressionMode: Int = 0): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int_Int(openCompressedMethodBind, this.rawMemory, path, modeFlags, compressionMode))
    }


    private val openMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "open") }
    open fun open(path: String, flags: Int): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int(openMethodBind, this.rawMemory, path, flags))
    }


    private val closeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "close") }
    open fun close() {
        _icall_Unit(closeMethodBind, this.rawMemory)
    }


    private val getPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_path") }
    open fun getPath(): String {
        return _icall_String(getPathMethodBind, this.rawMemory)
    }


    private val getPathAbsoluteMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_path_absolute") }
    open fun getPathAbsolute(): String {
        return _icall_String(getPathAbsoluteMethodBind, this.rawMemory)
    }


    private val isOpenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "is_open") }
    open fun isOpen(): Boolean {
        return _icall_Boolean(isOpenMethodBind, this.rawMemory)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "seek") }
    open fun seek(position: Int) {
        _icall_Unit_Int(seekMethodBind, this.rawMemory, position)
    }


    private val seekEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "seek_end") }
    open fun seekEnd(position: Int = 0) {
        _icall_Unit_Int(seekEndMethodBind, this.rawMemory, position)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_position") }
    open fun getPosition(): Int {
        return _icall_Int(getPositionMethodBind, this.rawMemory)
    }


    private val getLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_len") }
    open fun getLen(): Int {
        return _icall_Int(getLenMethodBind, this.rawMemory)
    }


    private val eofReachedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "eof_reached") }
    open fun eofReached(): Boolean {
        return _icall_Boolean(eofReachedMethodBind, this.rawMemory)
    }


    private val get8MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_8") }
    open fun get8(): Int {
        return _icall_Int(get8MethodBind, this.rawMemory)
    }


    private val get16MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_16") }
    open fun get16(): Int {
        return _icall_Int(get16MethodBind, this.rawMemory)
    }


    private val get32MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_32") }
    open fun get32(): Int {
        return _icall_Int(get32MethodBind, this.rawMemory)
    }


    private val get64MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_64") }
    open fun get64(): Int {
        return _icall_Int(get64MethodBind, this.rawMemory)
    }


    private val getFloatMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_float") }
    open fun getFloat(): Float {
        return _icall_Float(getFloatMethodBind, this.rawMemory)
    }


    private val getDoubleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_double") }
    open fun getDouble(): Float {
        return _icall_Float(getDoubleMethodBind, this.rawMemory)
    }


    private val getRealMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_real") }
    open fun getReal(): Float {
        return _icall_Float(getRealMethodBind, this.rawMemory)
    }


    private val getBufferMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_buffer") }
    open fun getBuffer(len: Int): PoolByteArray {
        return _icall_PoolByteArray_Int(getBufferMethodBind, this.rawMemory, len)
    }


    private val getLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_line") }
    open fun getLine(): String {
        return _icall_String(getLineMethodBind, this.rawMemory)
    }


    private val getAsTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_as_text") }
    open fun getAsText(): String {
        return _icall_String(getAsTextMethodBind, this.rawMemory)
    }


    private val getMd5MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_md5") }
    open fun getMd5(path: String): String {
        return _icall_String_String(getMd5MethodBind, this.rawMemory, path)
    }


    private val getSha256MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_sha256") }
    open fun getSha256(path: String): String {
        return _icall_String_String(getSha256MethodBind, this.rawMemory, path)
    }


    private val getEndianSwapMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_endian_swap") }
    open fun getEndianSwap(): Boolean {
        return _icall_Boolean(getEndianSwapMethodBind, this.rawMemory)
    }


    private val setEndianSwapMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "set_endian_swap") }
    open fun setEndianSwap(enable: Boolean) {
        _icall_Unit_Boolean(setEndianSwapMethodBind, this.rawMemory, enable)
    }


    private val getErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_error") }
    open fun getError(): GodotError {
        return GodotError.fromInt(_icall_Int(getErrorMethodBind, this.rawMemory))
    }


    private val getVarMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_var") }
    open fun getVar(): Variant {
        return _icall_Variant(getVarMethodBind, this.rawMemory)
    }


    private val getCsvLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_csv_line") }
    open fun getCsvLine(delim: String = ","): PoolStringArray {
        return _icall_PoolStringArray_String(getCsvLineMethodBind, this.rawMemory, delim)
    }


    private val store8MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_8") }
    open fun store8(value: Int) {
        _icall_Unit_Int(store8MethodBind, this.rawMemory, value)
    }


    private val store16MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_16") }
    open fun store16(value: Int) {
        _icall_Unit_Int(store16MethodBind, this.rawMemory, value)
    }


    private val store32MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_32") }
    open fun store32(value: Int) {
        _icall_Unit_Int(store32MethodBind, this.rawMemory, value)
    }


    private val store64MethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_64") }
    open fun store64(value: Int) {
        _icall_Unit_Int(store64MethodBind, this.rawMemory, value)
    }


    private val storeFloatMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_float") }
    open fun storeFloat(value: Float) {
        _icall_Unit_Float(storeFloatMethodBind, this.rawMemory, value)
    }


    private val storeDoubleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_double") }
    open fun storeDouble(value: Float) {
        _icall_Unit_Float(storeDoubleMethodBind, this.rawMemory, value)
    }


    private val storeRealMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_real") }
    open fun storeReal(value: Float) {
        _icall_Unit_Float(storeRealMethodBind, this.rawMemory, value)
    }


    private val storeBufferMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_buffer") }
    open fun storeBuffer(buffer: PoolByteArray) {
        _icall_Unit_PoolByteArray(storeBufferMethodBind, this.rawMemory, buffer)
    }


    private val storeLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_line") }
    open fun storeLine(line: String) {
        _icall_Unit_String(storeLineMethodBind, this.rawMemory, line)
    }


    private val storeStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_string") }
    open fun storeString(string: String) {
        _icall_Unit_String(storeStringMethodBind, this.rawMemory, string)
    }


    private val storeVarMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_var") }
    open fun storeVar(value: Variant) {
        _icall_Unit_Variant(storeVarMethodBind, this.rawMemory, value)
    }


    private val storePascalStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "store_pascal_string") }
    open fun storePascalString(string: String) {
        _icall_Unit_String(storePascalStringMethodBind, this.rawMemory, string)
    }


    private val getPascalStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_pascal_string") }
    open fun getPascalString(): String {
        return _icall_String(getPascalStringMethodBind, this.rawMemory)
    }


    private val fileExistsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "file_exists") }
    open fun fileExists(path: String): Boolean {
        return _icall_Boolean_String(fileExistsMethodBind, this.rawMemory, path)
    }


    private val getModifiedTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_File", "get_modified_time") }
    open fun getModifiedTime(file: String): Int {
        return _icall_Int_String(getModifiedTimeMethodBind, this.rawMemory, file)
    }


}
