package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.Variant
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_Long
import godot.icalls._icall_Long_String_Long_Long
import godot.icalls._icall_Long_String_Long_PoolByteArray
import godot.icalls._icall_Long_String_Long_String
import godot.icalls._icall_PoolByteArray_Long
import godot.icalls._icall_PoolStringArray_String
import godot.icalls._icall_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolByteArray
import godot.icalls._icall_Unit_PoolStringArray_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Variant_Boolean
import godot.icalls._icall_Variant_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class File internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var endianSwap: Boolean
    get() {
      val mb = getMethodBind("_File","get_endian_swap")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_File","set_endian_swap")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("File", "_File")
        }

  }

  open fun close() {
    val mb = getMethodBind("_File","close")
    _icall_Unit( mb, this.ptr)
  }

  open fun eofReached(): Boolean {
    val mb = getMethodBind("_File","eof_reached")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun fileExists(path: String): Boolean {
    val mb = getMethodBind("_File","file_exists")
    return _icall_Boolean_String( mb, this.ptr, path)
  }

  open fun get16(): Long {
    val mb = getMethodBind("_File","get_16")
    return _icall_Long( mb, this.ptr)
  }

  open fun get32(): Long {
    val mb = getMethodBind("_File","get_32")
    return _icall_Long( mb, this.ptr)
  }

  open fun get64(): Long {
    val mb = getMethodBind("_File","get_64")
    return _icall_Long( mb, this.ptr)
  }

  open fun get8(): Long {
    val mb = getMethodBind("_File","get_8")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAsText(): String {
    val mb = getMethodBind("_File","get_as_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getBuffer(len: Long): PoolByteArray {
    val mb = getMethodBind("_File","get_buffer")
    return _icall_PoolByteArray_Long( mb, this.ptr, len)
  }

  open fun getCsvLine(delim: String = ","): PoolStringArray {
    val mb = getMethodBind("_File","get_csv_line")
    return _icall_PoolStringArray_String( mb, this.ptr, delim)
  }

  open fun getDouble(): Double {
    val mb = getMethodBind("_File","get_double")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEndianSwap(): Boolean {
    val mb = getMethodBind("_File","get_endian_swap")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getError(): GodotError {
    val mb = getMethodBind("_File","get_error")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun getFloat(): Double {
    val mb = getMethodBind("_File","get_float")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLen(): Long {
    val mb = getMethodBind("_File","get_len")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLine(): String {
    val mb = getMethodBind("_File","get_line")
    return _icall_String( mb, this.ptr)
  }

  open fun getMd5(path: String): String {
    val mb = getMethodBind("_File","get_md5")
    return _icall_String_String( mb, this.ptr, path)
  }

  open fun getModifiedTime(file: String): Long {
    val mb = getMethodBind("_File","get_modified_time")
    return _icall_Long_String( mb, this.ptr, file)
  }

  open fun getPascalString(): String {
    val mb = getMethodBind("_File","get_pascal_string")
    return _icall_String( mb, this.ptr)
  }

  open fun getPath(): String {
    val mb = getMethodBind("_File","get_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getPathAbsolute(): String {
    val mb = getMethodBind("_File","get_path_absolute")
    return _icall_String( mb, this.ptr)
  }

  open fun getPosition(): Long {
    val mb = getMethodBind("_File","get_position")
    return _icall_Long( mb, this.ptr)
  }

  open fun getReal(): Double {
    val mb = getMethodBind("_File","get_real")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSha256(path: String): String {
    val mb = getMethodBind("_File","get_sha256")
    return _icall_String_String( mb, this.ptr, path)
  }

  open fun getVar(allowObjects: Boolean = false): Variant {
    val mb = getMethodBind("_File","get_var")
    return _icall_Variant_Boolean( mb, this.ptr, allowObjects)
  }

  open fun isOpen(): Boolean {
    val mb = getMethodBind("_File","is_open")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun open(path: String, flags: Long): GodotError {
    val mb = getMethodBind("_File","open")
    return GodotError.byValue( _icall_Long_String_Long( mb, this.ptr, path, flags).toUInt())
  }

  open fun openCompressed(
    path: String,
    modeFlags: Long,
    compressionMode: Long = 0
  ): GodotError {
    val mb = getMethodBind("_File","open_compressed")
    return GodotError.byValue( _icall_Long_String_Long_Long( mb, this.ptr, path, modeFlags,
        compressionMode).toUInt())
  }

  open fun openEncrypted(
    path: String,
    modeFlags: Long,
    key: PoolByteArray
  ): GodotError {
    val mb = getMethodBind("_File","open_encrypted")
    return GodotError.byValue( _icall_Long_String_Long_PoolByteArray( mb, this.ptr, path, modeFlags,
        key).toUInt())
  }

  open fun openEncryptedWithPass(
    path: String,
    modeFlags: Long,
    pass: String
  ): GodotError {
    val mb = getMethodBind("_File","open_encrypted_with_pass")
    return GodotError.byValue( _icall_Long_String_Long_String( mb, this.ptr, path, modeFlags,
        pass).toUInt())
  }

  open fun seek(position: Long) {
    val mb = getMethodBind("_File","seek")
    _icall_Unit_Long( mb, this.ptr, position)
  }

  open fun seekEnd(position: Long = 0) {
    val mb = getMethodBind("_File","seek_end")
    _icall_Unit_Long( mb, this.ptr, position)
  }

  open fun setEndianSwap(enable: Boolean) {
    val mb = getMethodBind("_File","set_endian_swap")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun store16(value: Long) {
    val mb = getMethodBind("_File","store_16")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun store32(value: Long) {
    val mb = getMethodBind("_File","store_32")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun store64(value: Long) {
    val mb = getMethodBind("_File","store_64")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun store8(value: Long) {
    val mb = getMethodBind("_File","store_8")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun storeBuffer(buffer: PoolByteArray) {
    val mb = getMethodBind("_File","store_buffer")
    _icall_Unit_PoolByteArray( mb, this.ptr, buffer)
  }

  open fun storeCsvLine(values: PoolStringArray, delim: String = ",") {
    val mb = getMethodBind("_File","store_csv_line")
    _icall_Unit_PoolStringArray_String( mb, this.ptr, values, delim)
  }

  open fun storeDouble(value: Double) {
    val mb = getMethodBind("_File","store_double")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun storeFloat(value: Double) {
    val mb = getMethodBind("_File","store_float")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun storeLine(line: String) {
    val mb = getMethodBind("_File","store_line")
    _icall_Unit_String( mb, this.ptr, line)
  }

  open fun storePascalString(string: String) {
    val mb = getMethodBind("_File","store_pascal_string")
    _icall_Unit_String( mb, this.ptr, string)
  }

  open fun storeReal(value: Double) {
    val mb = getMethodBind("_File","store_real")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun storeString(string: String) {
    val mb = getMethodBind("_File","store_string")
    _icall_Unit_String( mb, this.ptr, string)
  }

  open fun storeVar(value: Variant, fullObjects: Boolean = false) {
    val mb = getMethodBind("_File","store_var")
    _icall_Unit_Variant_Boolean( mb, this.ptr, value, fullObjects)
  }

  enum class CompressionMode(
    id: Long
  ) {
    COMPRESSION_FASTLZ(0),

    COMPRESSION_DEFLATE(1),

    COMPRESSION_ZSTD(2),

    COMPRESSION_GZIP(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ModeFlags(
    id: Long
  ) {
    READ(1),

    WRITE(2),

    READ_WRITE(3),

    WRITE_READ(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COMPRESSION_DEFLATE: Long = 1

    final const val COMPRESSION_FASTLZ: Long = 0

    final const val COMPRESSION_GZIP: Long = 3

    final const val COMPRESSION_ZSTD: Long = 2

    final const val READ: Long = 1

    final const val READ_WRITE: Long = 3

    final const val WRITE: Long = 2

    final const val WRITE_READ: Long = 7
  }
}
