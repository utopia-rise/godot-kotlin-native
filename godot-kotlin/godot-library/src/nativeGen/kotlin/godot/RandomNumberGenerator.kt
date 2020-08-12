// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Double_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class RandomNumberGenerator internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var seed: Long
    get() {
      val mb = getMethodBind("RandomNumberGenerator","get_seed")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RandomNumberGenerator","set_seed")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("RandomNumberGenerator", "RandomNumberGenerator")
        }

  }

  open fun getSeed(): Long {
    val mb = getMethodBind("RandomNumberGenerator","get_seed")
    return _icall_Long( mb, this.ptr)
  }

  open fun randf(): Double {
    val mb = getMethodBind("RandomNumberGenerator","randf")
    return _icall_Double( mb, this.ptr)
  }

  open fun randfRange(from: Double, to: Double): Double {
    val mb = getMethodBind("RandomNumberGenerator","randf_range")
    return _icall_Double_Double_Double( mb, this.ptr, from, to)
  }

  open fun randfn(mean: Double = 0.0, deviation: Double = 1.0): Double {
    val mb = getMethodBind("RandomNumberGenerator","randfn")
    return _icall_Double_Double_Double( mb, this.ptr, mean, deviation)
  }

  open fun randi(): Long {
    val mb = getMethodBind("RandomNumberGenerator","randi")
    return _icall_Long( mb, this.ptr)
  }

  open fun randiRange(from: Long, to: Long): Long {
    val mb = getMethodBind("RandomNumberGenerator","randi_range")
    return _icall_Long_Long_Long( mb, this.ptr, from, to)
  }

  open fun randomize() {
    val mb = getMethodBind("RandomNumberGenerator","randomize")
    _icall_Unit( mb, this.ptr)
  }

  open fun setSeed(seed: Long) {
    val mb = getMethodBind("RandomNumberGenerator","set_seed")
    _icall_Unit_Long( mb, this.ptr, seed)
  }
}
