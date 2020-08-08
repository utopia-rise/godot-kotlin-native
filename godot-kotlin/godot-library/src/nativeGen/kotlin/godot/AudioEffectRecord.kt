package godot

import godot.AudioStreamSample
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_AudioStreamSample
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class AudioEffectRecord internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var format: Long
    get() {
      val mb = getMethodBind("AudioEffectRecord","get_format")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectRecord","set_format")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectRecord", "AudioEffectRecord")
        }

  }

  open fun getFormat(): AudioStreamSample.Format {
    val mb = getMethodBind("AudioEffectRecord","get_format")
    return AudioStreamSample.Format.from( _icall_Long( mb, this.ptr))
  }

  open fun getRecording(): AudioStreamSample {
    val mb = getMethodBind("AudioEffectRecord","get_recording")
    return _icall_AudioStreamSample( mb, this.ptr)
  }

  open fun isRecordingActive(): Boolean {
    val mb = getMethodBind("AudioEffectRecord","is_recording_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setFormat(format: Long) {
    val mb = getMethodBind("AudioEffectRecord","set_format")
    _icall_Unit_Long( mb, this.ptr, format)
  }

  open fun setRecordingActive(record: Boolean) {
    val mb = getMethodBind("AudioEffectRecord","set_recording_active")
    _icall_Unit_Boolean( mb, this.ptr, record)
  }

  companion object
}
