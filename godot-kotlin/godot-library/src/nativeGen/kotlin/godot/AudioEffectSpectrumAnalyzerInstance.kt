// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import godot.icalls._icall_Vector2_Double_Double_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class AudioEffectSpectrumAnalyzerInstance internal constructor(
  _ignore: Any?
) : AudioEffectInstance(_ignore) {
  internal constructor() : this(null)

  open fun getMagnitudeForFrequencyRange(
    fromHz: Double,
    toHz: Double,
    mode: Long = 1
  ): Vector2 {
    val mb =
        getMethodBind("AudioEffectSpectrumAnalyzerInstance","get_magnitude_for_frequency_range")
    return _icall_Vector2_Double_Double_Long( mb, this.ptr, fromHz, toHz, mode)
  }

  enum class MagnitudeMode(
    id: Long
  ) {
    MAGNITUDE_AVERAGE(0),

    MAGNITUDE_MAX(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MAGNITUDE_AVERAGE: Long = 0

    final const val MAGNITUDE_MAX: Long = 1
  }
}
