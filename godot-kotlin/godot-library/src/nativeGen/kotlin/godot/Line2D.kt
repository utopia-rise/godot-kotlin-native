// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Line2D
import godot.core.Color
import godot.core.PoolVector2Array
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Curve
import godot.icalls._icall_Double
import godot.icalls._icall_Gradient
import godot.icalls._icall_Long
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolVector2Array
import godot.icalls._icall_Unit_Vector2_Long
import godot.icalls._icall_Vector2_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Line2D : Node2D() {
  open var antialiased: Boolean
    get() {
      val mb = getMethodBind("Line2D","get_antialiased")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_antialiased")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var beginCapMode: Long
    get() {
      val mb = getMethodBind("Line2D","get_begin_cap_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_begin_cap_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var defaultColor: Color
    get() {
      val mb = getMethodBind("Line2D","get_default_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_default_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var endCapMode: Long
    get() {
      val mb = getMethodBind("Line2D","get_end_cap_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_end_cap_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var gradient: Gradient
    get() {
      val mb = getMethodBind("Line2D","get_gradient")
      return _icall_Gradient(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_gradient")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var jointMode: Long
    get() {
      val mb = getMethodBind("Line2D","get_joint_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_joint_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var points: PoolVector2Array
    get() {
      val mb = getMethodBind("Line2D","get_points")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_points")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  open var roundPrecision: Long
    get() {
      val mb = getMethodBind("Line2D","get_round_precision")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_round_precision")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var sharpLimit: Double
    get() {
      val mb = getMethodBind("Line2D","get_sharp_limit")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_sharp_limit")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("Line2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureMode: Long
    get() {
      val mb = getMethodBind("Line2D","get_texture_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_texture_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var width: Double
    get() {
      val mb = getMethodBind("Line2D","get_width")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_width")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var widthCurve: Curve
    get() {
      val mb = getMethodBind("Line2D","get_curve")
      return _icall_Curve(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Line2D","set_curve")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Line2D", "Line2D")

  open fun defaultColor(schedule: Color.() -> Unit): Color = defaultColor.apply{
      schedule(this)
      defaultColor = this
  }


  open fun _curveChanged() {
  }

  open fun _gradientChanged() {
  }

  open fun addPoint(position: Vector2, atPosition: Long = -1) {
    val mb = getMethodBind("Line2D","add_point")
    _icall_Unit_Vector2_Long( mb, this.ptr, position, atPosition)
  }

  open fun clearPoints() {
    val mb = getMethodBind("Line2D","clear_points")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAntialiased(): Boolean {
    val mb = getMethodBind("Line2D","get_antialiased")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getBeginCapMode(): Line2D.LineCapMode {
    val mb = getMethodBind("Line2D","get_begin_cap_mode")
    return Line2D.LineCapMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getCurve(): Curve {
    val mb = getMethodBind("Line2D","get_curve")
    return _icall_Curve( mb, this.ptr)
  }

  open fun getDefaultColor(): Color {
    val mb = getMethodBind("Line2D","get_default_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getEndCapMode(): Line2D.LineCapMode {
    val mb = getMethodBind("Line2D","get_end_cap_mode")
    return Line2D.LineCapMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getGradient(): Gradient {
    val mb = getMethodBind("Line2D","get_gradient")
    return _icall_Gradient( mb, this.ptr)
  }

  open fun getJointMode(): Line2D.LineJointMode {
    val mb = getMethodBind("Line2D","get_joint_mode")
    return Line2D.LineJointMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("Line2D","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointPosition(i: Long): Vector2 {
    val mb = getMethodBind("Line2D","get_point_position")
    return _icall_Vector2_Long( mb, this.ptr, i)
  }

  open fun getPoints(): PoolVector2Array {
    val mb = getMethodBind("Line2D","get_points")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getRoundPrecision(): Long {
    val mb = getMethodBind("Line2D","get_round_precision")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSharpLimit(): Double {
    val mb = getMethodBind("Line2D","get_sharp_limit")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("Line2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTextureMode(): Line2D.LineTextureMode {
    val mb = getMethodBind("Line2D","get_texture_mode")
    return Line2D.LineTextureMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getWidth(): Double {
    val mb = getMethodBind("Line2D","get_width")
    return _icall_Double( mb, this.ptr)
  }

  open fun removePoint(i: Long) {
    val mb = getMethodBind("Line2D","remove_point")
    _icall_Unit_Long( mb, this.ptr, i)
  }

  open fun setAntialiased(antialiased: Boolean) {
    val mb = getMethodBind("Line2D","set_antialiased")
    _icall_Unit_Boolean( mb, this.ptr, antialiased)
  }

  open fun setBeginCapMode(mode: Long) {
    val mb = getMethodBind("Line2D","set_begin_cap_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setCurve(curve: Curve) {
    val mb = getMethodBind("Line2D","set_curve")
    _icall_Unit_Object( mb, this.ptr, curve)
  }

  open fun setDefaultColor(color: Color) {
    val mb = getMethodBind("Line2D","set_default_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setEndCapMode(mode: Long) {
    val mb = getMethodBind("Line2D","set_end_cap_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setGradient(color: Gradient) {
    val mb = getMethodBind("Line2D","set_gradient")
    _icall_Unit_Object( mb, this.ptr, color)
  }

  open fun setJointMode(mode: Long) {
    val mb = getMethodBind("Line2D","set_joint_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPointPosition(i: Long, position: Vector2) {
    val mb = getMethodBind("Line2D","set_point_position")
    _icall_Unit_Long_Vector2( mb, this.ptr, i, position)
  }

  open fun setPoints(points: PoolVector2Array) {
    val mb = getMethodBind("Line2D","set_points")
    _icall_Unit_PoolVector2Array( mb, this.ptr, points)
  }

  open fun setRoundPrecision(precision: Long) {
    val mb = getMethodBind("Line2D","set_round_precision")
    _icall_Unit_Long( mb, this.ptr, precision)
  }

  open fun setSharpLimit(limit: Double) {
    val mb = getMethodBind("Line2D","set_sharp_limit")
    _icall_Unit_Double( mb, this.ptr, limit)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("Line2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setTextureMode(mode: Long) {
    val mb = getMethodBind("Line2D","set_texture_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setWidth(width: Double) {
    val mb = getMethodBind("Line2D","set_width")
    _icall_Unit_Double( mb, this.ptr, width)
  }

  enum class LineTextureMode(
    id: Long
  ) {
    LINE_TEXTURE_NONE(0),

    LINE_TEXTURE_TILE(1),

    LINE_TEXTURE_STRETCH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LineCapMode(
    id: Long
  ) {
    LINE_CAP_NONE(0),

    LINE_CAP_BOX(1),

    LINE_CAP_ROUND(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LineJointMode(
    id: Long
  ) {
    LINE_JOINT_SHARP(0),

    LINE_JOINT_BEVEL(1),

    LINE_JOINT_ROUND(2);

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
