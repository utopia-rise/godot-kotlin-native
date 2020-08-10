package godot

import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.Variant
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_PoolByteArray
import godot.icalls._icall_Long_Variant_Boolean
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Variant_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class PacketPeer internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var allowObjectDecoding: Boolean
    get() {
      val mb = getMethodBind("PacketPeer","is_object_decoding_allowed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PacketPeer","set_allow_object_decoding")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var encodeBufferMaxSize: Long
    get() {
      val mb = getMethodBind("PacketPeer","get_encode_buffer_max_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PacketPeer","set_encode_buffer_max_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getAvailablePacketCount(): Long {
    val mb = getMethodBind("PacketPeer","get_available_packet_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEncodeBufferMaxSize(): Long {
    val mb = getMethodBind("PacketPeer","get_encode_buffer_max_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPacket(): PoolByteArray {
    val mb = getMethodBind("PacketPeer","get_packet")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun getPacketError(): GodotError {
    val mb = getMethodBind("PacketPeer","get_packet_error")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun getVar(allowObjects: Boolean = false): Variant {
    val mb = getMethodBind("PacketPeer","get_var")
    return _icall_Variant_Boolean( mb, this.ptr, allowObjects)
  }

  open fun isObjectDecodingAllowed(): Boolean {
    val mb = getMethodBind("PacketPeer","is_object_decoding_allowed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun putPacket(buffer: PoolByteArray): GodotError {
    val mb = getMethodBind("PacketPeer","put_packet")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, buffer).toUInt())
  }

  open fun putVar(_var: Variant, fullObjects: Boolean = false): GodotError {
    val mb = getMethodBind("PacketPeer","put_var")
    return GodotError.byValue( _icall_Long_Variant_Boolean( mb, this.ptr, _var,
        fullObjects).toUInt())
  }

  open fun setAllowObjectDecoding(enable: Boolean) {
    val mb = getMethodBind("PacketPeer","set_allow_object_decoding")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setEncodeBufferMaxSize(maxSize: Long) {
    val mb = getMethodBind("PacketPeer","set_encode_buffer_max_size")
    _icall_Unit_Long( mb, this.ptr, maxSize)
  }
}
