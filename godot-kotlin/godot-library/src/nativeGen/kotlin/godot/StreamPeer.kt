package godot

import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_PoolByteArray
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Variant_Boolean
import godot.icalls._icall_VariantArray_Long
import godot.icalls._icall_VariantArray_PoolByteArray
import godot.icalls._icall_Variant_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class StreamPeer internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var bigEndian: Boolean
    get() {
      val mb = getMethodBind("StreamPeer","is_big_endian_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StreamPeer","set_big_endian")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun get16(): Long {
    val mb = getMethodBind("StreamPeer","get_16")
    return _icall_Long( mb, this.ptr)
  }

  open fun get32(): Long {
    val mb = getMethodBind("StreamPeer","get_32")
    return _icall_Long( mb, this.ptr)
  }

  open fun get64(): Long {
    val mb = getMethodBind("StreamPeer","get_64")
    return _icall_Long( mb, this.ptr)
  }

  open fun get8(): Long {
    val mb = getMethodBind("StreamPeer","get_8")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAvailableBytes(): Long {
    val mb = getMethodBind("StreamPeer","get_available_bytes")
    return _icall_Long( mb, this.ptr)
  }

  open fun getData(bytes: Long): VariantArray {
    val mb = getMethodBind("StreamPeer","get_data")
    return _icall_VariantArray_Long( mb, this.ptr, bytes)
  }

  open fun getDouble(): Double {
    val mb = getMethodBind("StreamPeer","get_double")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFloat(): Double {
    val mb = getMethodBind("StreamPeer","get_float")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPartialData(bytes: Long): VariantArray {
    val mb = getMethodBind("StreamPeer","get_partial_data")
    return _icall_VariantArray_Long( mb, this.ptr, bytes)
  }

  open fun getString(bytes: Long = -1): String {
    val mb = getMethodBind("StreamPeer","get_string")
    return _icall_String_Long( mb, this.ptr, bytes)
  }

  open fun getU16(): Long {
    val mb = getMethodBind("StreamPeer","get_u16")
    return _icall_Long( mb, this.ptr)
  }

  open fun getU32(): Long {
    val mb = getMethodBind("StreamPeer","get_u32")
    return _icall_Long( mb, this.ptr)
  }

  open fun getU64(): Long {
    val mb = getMethodBind("StreamPeer","get_u64")
    return _icall_Long( mb, this.ptr)
  }

  open fun getU8(): Long {
    val mb = getMethodBind("StreamPeer","get_u8")
    return _icall_Long( mb, this.ptr)
  }

  open fun getUtf8String(bytes: Long = -1): String {
    val mb = getMethodBind("StreamPeer","get_utf8_string")
    return _icall_String_Long( mb, this.ptr, bytes)
  }

  open fun getVar(allowObjects: Boolean = false): Variant {
    val mb = getMethodBind("StreamPeer","get_var")
    return _icall_Variant_Boolean( mb, this.ptr, allowObjects)
  }

  open fun isBigEndianEnabled(): Boolean {
    val mb = getMethodBind("StreamPeer","is_big_endian_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun put16(value: Long) {
    val mb = getMethodBind("StreamPeer","put_16")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun put32(value: Long) {
    val mb = getMethodBind("StreamPeer","put_32")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun put64(value: Long) {
    val mb = getMethodBind("StreamPeer","put_64")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun put8(value: Long) {
    val mb = getMethodBind("StreamPeer","put_8")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun putData(data: PoolByteArray): GodotError {
    val mb = getMethodBind("StreamPeer","put_data")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, data).toUInt())
  }

  open fun putDouble(value: Double) {
    val mb = getMethodBind("StreamPeer","put_double")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun putFloat(value: Double) {
    val mb = getMethodBind("StreamPeer","put_float")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun putPartialData(data: PoolByteArray): VariantArray {
    val mb = getMethodBind("StreamPeer","put_partial_data")
    return _icall_VariantArray_PoolByteArray( mb, this.ptr, data)
  }

  open fun putString(value: String) {
    val mb = getMethodBind("StreamPeer","put_string")
    _icall_Unit_String( mb, this.ptr, value)
  }

  open fun putU16(value: Long) {
    val mb = getMethodBind("StreamPeer","put_u16")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun putU32(value: Long) {
    val mb = getMethodBind("StreamPeer","put_u32")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun putU64(value: Long) {
    val mb = getMethodBind("StreamPeer","put_u64")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun putU8(value: Long) {
    val mb = getMethodBind("StreamPeer","put_u8")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun putUtf8String(value: String) {
    val mb = getMethodBind("StreamPeer","put_utf8_string")
    _icall_Unit_String( mb, this.ptr, value)
  }

  open fun putVar(value: Variant, fullObjects: Boolean = false) {
    val mb = getMethodBind("StreamPeer","put_var")
    _icall_Unit_Variant_Boolean( mb, this.ptr, value, fullObjects)
  }

  open fun setBigEndian(enable: Boolean) {
    val mb = getMethodBind("StreamPeer","set_big_endian")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  companion object
}
