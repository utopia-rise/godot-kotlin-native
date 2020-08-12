// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_OpenSimplexNoise
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.UninitializedPropertyAccessException

open class NoiseTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var asNormalmap: Boolean
    get() {
      val mb = getMethodBind("NoiseTexture","is_normalmap")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NoiseTexture","set_as_normalmap")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bumpStrength: Double
    get() {
      val mb = getMethodBind("NoiseTexture","get_bump_strength")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NoiseTexture","set_bump_strength")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var height: Long
    get() {
      throw UninitializedPropertyAccessException("Cannot access property height: has no getter")
    }
    set(value) {
      val mb = getMethodBind("NoiseTexture","set_height")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var noise: OpenSimplexNoise
    get() {
      val mb = getMethodBind("NoiseTexture","get_noise")
      return _icall_OpenSimplexNoise(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NoiseTexture","set_noise")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var seamless: Boolean
    get() {
      val mb = getMethodBind("NoiseTexture","get_seamless")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NoiseTexture","set_seamless")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var width: Long
    get() {
      throw UninitializedPropertyAccessException("Cannot access property width: has no getter")
    }
    set(value) {
      val mb = getMethodBind("NoiseTexture","set_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("NoiseTexture", "NoiseTexture")
        }

  }

  open fun _generateTexture(): Image {
    throw NotImplementedError("_generate_texture is not implemented for NoiseTexture")
  }

  open fun _queueUpdate() {
  }

  open fun _threadDone(image: Image) {
  }

  open fun _updateTexture() {
  }

  open fun getBumpStrength(): Double {
    val mb = getMethodBind("NoiseTexture","get_bump_strength")
    return _icall_Double( mb, this.ptr)
  }

  open fun getNoise(): OpenSimplexNoise {
    val mb = getMethodBind("NoiseTexture","get_noise")
    return _icall_OpenSimplexNoise( mb, this.ptr)
  }

  open fun getSeamless(): Boolean {
    val mb = getMethodBind("NoiseTexture","get_seamless")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isNormalmap(): Boolean {
    val mb = getMethodBind("NoiseTexture","is_normalmap")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAsNormalmap(asNormalmap: Boolean) {
    val mb = getMethodBind("NoiseTexture","set_as_normalmap")
    _icall_Unit_Boolean( mb, this.ptr, asNormalmap)
  }

  open fun setBumpStrength(bumpStrength: Double) {
    val mb = getMethodBind("NoiseTexture","set_bump_strength")
    _icall_Unit_Double( mb, this.ptr, bumpStrength)
  }

  open fun setHeight(height: Long) {
    val mb = getMethodBind("NoiseTexture","set_height")
    _icall_Unit_Long( mb, this.ptr, height)
  }

  open fun setNoise(noise: OpenSimplexNoise) {
    val mb = getMethodBind("NoiseTexture","set_noise")
    _icall_Unit_Object( mb, this.ptr, noise)
  }

  open fun setSeamless(seamless: Boolean) {
    val mb = getMethodBind("NoiseTexture","set_seamless")
    _icall_Unit_Boolean( mb, this.ptr, seamless)
  }

  open fun setWidth(width: Long) {
    val mb = getMethodBind("NoiseTexture","set_width")
    _icall_Unit_Long( mb, this.ptr, width)
  }
}
