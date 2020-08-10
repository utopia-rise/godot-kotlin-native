// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolByteArray
import godot.icalls._icall_Long
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_StreamPeerBuffer
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolByteArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class StreamPeerBuffer internal constructor(
  _ignore: Any?
) : StreamPeer(_ignore) {
  open var dataArray: PoolByteArray
    get() {
      val mb = getMethodBind("StreamPeerBuffer","get_data_array")
      return _icall_PoolByteArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StreamPeerBuffer","set_data_array")
      _icall_Unit_PoolByteArray(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StreamPeerBuffer", "StreamPeerBuffer")
        }

  }

  open fun clear() {
    val mb = getMethodBind("StreamPeerBuffer","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun duplicate(): StreamPeerBuffer {
    val mb = getMethodBind("StreamPeerBuffer","duplicate")
    return _icall_StreamPeerBuffer( mb, this.ptr)
  }

  open fun getDataArray(): PoolByteArray {
    val mb = getMethodBind("StreamPeerBuffer","get_data_array")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun getPosition(): Long {
    val mb = getMethodBind("StreamPeerBuffer","get_position")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSize(): Long {
    val mb = getMethodBind("StreamPeerBuffer","get_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun resize(size: Long) {
    val mb = getMethodBind("StreamPeerBuffer","resize")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun seek(position: Long) {
    val mb = getMethodBind("StreamPeerBuffer","seek")
    _icall_Unit_Long( mb, this.ptr, position)
  }

  open fun setDataArray(data: PoolByteArray) {
    val mb = getMethodBind("StreamPeerBuffer","set_data_array")
    _icall_Unit_PoolByteArray( mb, this.ptr, data)
  }
}
