package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class AudioEffectEQ internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectEQ", "AudioEffectEQ")
        }

  }

  open fun getBandCount(): Long {
    val mb = getMethodBind("AudioEffectEQ","get_band_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBandGainDb(bandIdx: Long): Double {
    val mb = getMethodBind("AudioEffectEQ","get_band_gain_db")
    return _icall_Double_Long( mb, this.ptr, bandIdx)
  }

  open fun setBandGainDb(bandIdx: Long, volumeDb: Double) {
    val mb = getMethodBind("AudioEffectEQ","set_band_gain_db")
    _icall_Unit_Long_Double( mb, this.ptr, bandIdx, volumeDb)
  }

  companion object
}
