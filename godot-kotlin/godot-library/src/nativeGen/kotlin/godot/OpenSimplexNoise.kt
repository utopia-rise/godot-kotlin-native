package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.core.Vector3
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Double
import godot.icalls._icall_Double_Double_Double
import godot.icalls._icall_Double_Double_Double_Double
import godot.icalls._icall_Double_Double_Double_Double_Double
import godot.icalls._icall_Double_Vector2
import godot.icalls._icall_Double_Vector3
import godot.icalls._icall_Image_Long
import godot.icalls._icall_Image_Long_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class OpenSimplexNoise internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var lacunarity: Double
    get() {
      val mb = getMethodBind("OpenSimplexNoise","get_lacunarity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OpenSimplexNoise","set_lacunarity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var octaves: Long
    get() {
      val mb = getMethodBind("OpenSimplexNoise","get_octaves")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OpenSimplexNoise","set_octaves")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var period: Double
    get() {
      val mb = getMethodBind("OpenSimplexNoise","get_period")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OpenSimplexNoise","set_period")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var persistence: Double
    get() {
      val mb = getMethodBind("OpenSimplexNoise","get_persistence")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OpenSimplexNoise","set_persistence")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var seed: Long
    get() {
      val mb = getMethodBind("OpenSimplexNoise","get_seed")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OpenSimplexNoise","set_seed")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("OpenSimplexNoise", "OpenSimplexNoise")
        }

  }

  open fun getImage(width: Long, height: Long): Image {
    val mb = getMethodBind("OpenSimplexNoise","get_image")
    return _icall_Image_Long_Long( mb, this.ptr, width, height)
  }

  open fun getLacunarity(): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_lacunarity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getNoise1d(x: Double): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_noise_1d")
    return _icall_Double_Double( mb, this.ptr, x)
  }

  open fun getNoise2d(x: Double, y: Double): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_noise_2d")
    return _icall_Double_Double_Double( mb, this.ptr, x, y)
  }

  open fun getNoise2dv(pos: Vector2): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_noise_2dv")
    return _icall_Double_Vector2( mb, this.ptr, pos)
  }

  open fun getNoise3d(
    x: Double,
    y: Double,
    z: Double
  ): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_noise_3d")
    return _icall_Double_Double_Double_Double( mb, this.ptr, x, y, z)
  }

  open fun getNoise3dv(pos: Vector3): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_noise_3dv")
    return _icall_Double_Vector3( mb, this.ptr, pos)
  }

  open fun getNoise4d(
    x: Double,
    y: Double,
    z: Double,
    w: Double
  ): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_noise_4d")
    return _icall_Double_Double_Double_Double_Double( mb, this.ptr, x, y, z, w)
  }

  open fun getOctaves(): Long {
    val mb = getMethodBind("OpenSimplexNoise","get_octaves")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPeriod(): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_period")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPersistence(): Double {
    val mb = getMethodBind("OpenSimplexNoise","get_persistence")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSeamlessImage(size: Long): Image {
    val mb = getMethodBind("OpenSimplexNoise","get_seamless_image")
    return _icall_Image_Long( mb, this.ptr, size)
  }

  open fun getSeed(): Long {
    val mb = getMethodBind("OpenSimplexNoise","get_seed")
    return _icall_Long( mb, this.ptr)
  }

  open fun setLacunarity(lacunarity: Double) {
    val mb = getMethodBind("OpenSimplexNoise","set_lacunarity")
    _icall_Unit_Double( mb, this.ptr, lacunarity)
  }

  open fun setOctaves(octaveCount: Long) {
    val mb = getMethodBind("OpenSimplexNoise","set_octaves")
    _icall_Unit_Long( mb, this.ptr, octaveCount)
  }

  open fun setPeriod(period: Double) {
    val mb = getMethodBind("OpenSimplexNoise","set_period")
    _icall_Unit_Double( mb, this.ptr, period)
  }

  open fun setPersistence(persistence: Double) {
    val mb = getMethodBind("OpenSimplexNoise","set_persistence")
    _icall_Unit_Double( mb, this.ptr, persistence)
  }

  open fun setSeed(seed: Long) {
    val mb = getMethodBind("OpenSimplexNoise","set_seed")
    _icall_Unit_Long( mb, this.ptr, seed)
  }
}
