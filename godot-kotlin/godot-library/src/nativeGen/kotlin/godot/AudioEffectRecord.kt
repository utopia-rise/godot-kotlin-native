// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AudioStreamSample
import godot.icalls._icall_AudioStreamSample
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class AudioEffectRecord : AudioEffect() {
  open var format: Long
    get() {
      val mb = getMethodBind("AudioEffectRecord","get_format")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectRecord","set_format")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AudioEffectRecord", "AudioEffectRecord")

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
}
