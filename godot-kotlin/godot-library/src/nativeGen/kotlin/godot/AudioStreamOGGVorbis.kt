package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolByteArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_PoolByteArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class AudioStreamOGGVorbis internal constructor(
  _ignore: Any?
) : AudioStream(_ignore) {
  open var data: PoolByteArray
    get() {
      val mb = getMethodBind("AudioStreamOGGVorbis","get_data")
      return _icall_PoolByteArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamOGGVorbis","set_data")
      _icall_Unit_PoolByteArray(mb, this.ptr, value)
    }

  open var loop: Boolean
    get() {
      val mb = getMethodBind("AudioStreamOGGVorbis","has_loop")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamOGGVorbis","set_loop")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var loopOffset: Double
    get() {
      val mb = getMethodBind("AudioStreamOGGVorbis","get_loop_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamOGGVorbis","set_loop_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioStreamOGGVorbis", "AudioStreamOGGVorbis")
        }

  }

  open fun getData(): PoolByteArray {
    val mb = getMethodBind("AudioStreamOGGVorbis","get_data")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun getLoopOffset(): Double {
    val mb = getMethodBind("AudioStreamOGGVorbis","get_loop_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun hasLoop(): Boolean {
    val mb = getMethodBind("AudioStreamOGGVorbis","has_loop")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setData(data: PoolByteArray) {
    val mb = getMethodBind("AudioStreamOGGVorbis","set_data")
    _icall_Unit_PoolByteArray( mb, this.ptr, data)
  }

  open fun setLoop(enable: Boolean) {
    val mb = getMethodBind("AudioStreamOGGVorbis","set_loop")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setLoopOffset(seconds: Double) {
    val mb = getMethodBind("AudioStreamOGGVorbis","set_loop_offset")
    _icall_Unit_Double( mb, this.ptr, seconds)
  }
}
