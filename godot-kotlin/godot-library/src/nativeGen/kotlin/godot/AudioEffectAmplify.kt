// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class AudioEffectAmplify : AudioEffect() {
  open var volumeDb: Double
    get() {
      val mb = getMethodBind("AudioEffectAmplify","get_volume_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectAmplify","set_volume_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AudioEffectAmplify",
      "AudioEffectAmplify")

  open fun getVolumeDb(): Double {
    val mb = getMethodBind("AudioEffectAmplify","get_volume_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun setVolumeDb(volume: Double) {
    val mb = getMethodBind("AudioEffectAmplify","set_volume_db")
    _icall_Unit_Double( mb, this.ptr, volume)
  }
}
