// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.ProceduralSky
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class ProceduralSky internal constructor(
  _ignore: Any?
) : Sky(_ignore) {
  open var groundBottomColor: Color
    get() {
      val mb = getMethodBind("ProceduralSky","get_ground_bottom_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_ground_bottom_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var groundCurve: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_ground_curve")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_ground_curve")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var groundEnergy: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_ground_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_ground_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var groundHorizonColor: Color
    get() {
      val mb = getMethodBind("ProceduralSky","get_ground_horizon_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_ground_horizon_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var skyCurve: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sky_curve")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sky_curve")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var skyEnergy: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sky_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sky_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var skyHorizonColor: Color
    get() {
      val mb = getMethodBind("ProceduralSky","get_sky_horizon_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sky_horizon_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var skyTopColor: Color
    get() {
      val mb = getMethodBind("ProceduralSky","get_sky_top_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sky_top_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var sunAngleMax: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_angle_max")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_angle_max")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sunAngleMin: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_angle_min")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_angle_min")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sunColor: Color
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var sunCurve: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_curve")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_curve")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sunEnergy: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sunLatitude: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_latitude")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_latitude")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sunLongitude: Double
    get() {
      val mb = getMethodBind("ProceduralSky","get_sun_longitude")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_sun_longitude")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var textureSize: Long
    get() {
      val mb = getMethodBind("ProceduralSky","get_texture_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProceduralSky","set_texture_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ProceduralSky", "ProceduralSky")
        }

  }

  open fun groundBottomColor(schedule: Color.() -> Unit): Color = groundBottomColor.apply{
      schedule(this)
      groundBottomColor = this
  }


  open fun groundHorizonColor(schedule: Color.() -> Unit): Color = groundHorizonColor.apply{
      schedule(this)
      groundHorizonColor = this
  }


  open fun skyHorizonColor(schedule: Color.() -> Unit): Color = skyHorizonColor.apply{
      schedule(this)
      skyHorizonColor = this
  }


  open fun skyTopColor(schedule: Color.() -> Unit): Color = skyTopColor.apply{
      schedule(this)
      skyTopColor = this
  }


  open fun sunColor(schedule: Color.() -> Unit): Color = sunColor.apply{
      schedule(this)
      sunColor = this
  }


  open fun _threadDone(image: Image) {
  }

  open fun _updateSky() {
  }

  open fun getGroundBottomColor(): Color {
    val mb = getMethodBind("ProceduralSky","get_ground_bottom_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getGroundCurve(): Double {
    val mb = getMethodBind("ProceduralSky","get_ground_curve")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGroundEnergy(): Double {
    val mb = getMethodBind("ProceduralSky","get_ground_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGroundHorizonColor(): Color {
    val mb = getMethodBind("ProceduralSky","get_ground_horizon_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getSkyCurve(): Double {
    val mb = getMethodBind("ProceduralSky","get_sky_curve")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSkyEnergy(): Double {
    val mb = getMethodBind("ProceduralSky","get_sky_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSkyHorizonColor(): Color {
    val mb = getMethodBind("ProceduralSky","get_sky_horizon_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getSkyTopColor(): Color {
    val mb = getMethodBind("ProceduralSky","get_sky_top_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getSunAngleMax(): Double {
    val mb = getMethodBind("ProceduralSky","get_sun_angle_max")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSunAngleMin(): Double {
    val mb = getMethodBind("ProceduralSky","get_sun_angle_min")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSunColor(): Color {
    val mb = getMethodBind("ProceduralSky","get_sun_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getSunCurve(): Double {
    val mb = getMethodBind("ProceduralSky","get_sun_curve")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSunEnergy(): Double {
    val mb = getMethodBind("ProceduralSky","get_sun_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSunLatitude(): Double {
    val mb = getMethodBind("ProceduralSky","get_sun_latitude")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSunLongitude(): Double {
    val mb = getMethodBind("ProceduralSky","get_sun_longitude")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTextureSize(): ProceduralSky.TextureSize {
    val mb = getMethodBind("ProceduralSky","get_texture_size")
    return ProceduralSky.TextureSize.from( _icall_Long( mb, this.ptr))
  }

  open fun setGroundBottomColor(color: Color) {
    val mb = getMethodBind("ProceduralSky","set_ground_bottom_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setGroundCurve(curve: Double) {
    val mb = getMethodBind("ProceduralSky","set_ground_curve")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setGroundEnergy(energy: Double) {
    val mb = getMethodBind("ProceduralSky","set_ground_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setGroundHorizonColor(color: Color) {
    val mb = getMethodBind("ProceduralSky","set_ground_horizon_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setSkyCurve(curve: Double) {
    val mb = getMethodBind("ProceduralSky","set_sky_curve")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setSkyEnergy(energy: Double) {
    val mb = getMethodBind("ProceduralSky","set_sky_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setSkyHorizonColor(color: Color) {
    val mb = getMethodBind("ProceduralSky","set_sky_horizon_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setSkyTopColor(color: Color) {
    val mb = getMethodBind("ProceduralSky","set_sky_top_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setSunAngleMax(degrees: Double) {
    val mb = getMethodBind("ProceduralSky","set_sun_angle_max")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setSunAngleMin(degrees: Double) {
    val mb = getMethodBind("ProceduralSky","set_sun_angle_min")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setSunColor(color: Color) {
    val mb = getMethodBind("ProceduralSky","set_sun_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setSunCurve(curve: Double) {
    val mb = getMethodBind("ProceduralSky","set_sun_curve")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setSunEnergy(energy: Double) {
    val mb = getMethodBind("ProceduralSky","set_sun_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setSunLatitude(degrees: Double) {
    val mb = getMethodBind("ProceduralSky","set_sun_latitude")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setSunLongitude(degrees: Double) {
    val mb = getMethodBind("ProceduralSky","set_sun_longitude")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setTextureSize(size: Long) {
    val mb = getMethodBind("ProceduralSky","set_texture_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  enum class TextureSize(
    id: Long
  ) {
    TEXTURE_SIZE_256(0),

    TEXTURE_SIZE_512(1),

    TEXTURE_SIZE_1024(2),

    TEXTURE_SIZE_2048(3),

    TEXTURE_SIZE_4096(4),

    TEXTURE_SIZE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
