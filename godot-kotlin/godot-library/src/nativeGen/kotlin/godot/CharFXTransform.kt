// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Dictionary
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Dictionary
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class CharFXTransform : Reference() {
  open var absoluteIndex: Long
    get() {
      val mb = getMethodBind("CharFXTransform","get_absolute_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_absolute_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var character: Long
    get() {
      val mb = getMethodBind("CharFXTransform","get_character")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_character")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var color: Color
    get() {
      val mb = getMethodBind("CharFXTransform","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var elapsedTime: Double
    get() {
      val mb = getMethodBind("CharFXTransform","get_elapsed_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_elapsed_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var env: Dictionary
    get() {
      val mb = getMethodBind("CharFXTransform","get_environment")
      return _icall_Dictionary(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_environment")
      _icall_Unit_Dictionary(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("CharFXTransform","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var relativeIndex: Long
    get() {
      val mb = getMethodBind("CharFXTransform","get_relative_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_relative_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var visible: Boolean
    get() {
      val mb = getMethodBind("CharFXTransform","is_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CharFXTransform","set_visibility")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CharFXTransform", "CharFXTransform")

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun getAbsoluteIndex(): Long {
    val mb = getMethodBind("CharFXTransform","get_absolute_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCharacter(): Long {
    val mb = getMethodBind("CharFXTransform","get_character")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColor(): Color {
    val mb = getMethodBind("CharFXTransform","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getElapsedTime(): Double {
    val mb = getMethodBind("CharFXTransform","get_elapsed_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEnvironment(): Dictionary {
    val mb = getMethodBind("CharFXTransform","get_environment")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("CharFXTransform","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRelativeIndex(): Long {
    val mb = getMethodBind("CharFXTransform","get_relative_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun isVisible(): Boolean {
    val mb = getMethodBind("CharFXTransform","is_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAbsoluteIndex(index: Long) {
    val mb = getMethodBind("CharFXTransform","set_absolute_index")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setCharacter(character: Long) {
    val mb = getMethodBind("CharFXTransform","set_character")
    _icall_Unit_Long( mb, this.ptr, character)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("CharFXTransform","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setElapsedTime(time: Double) {
    val mb = getMethodBind("CharFXTransform","set_elapsed_time")
    _icall_Unit_Double( mb, this.ptr, time)
  }

  open fun setEnvironment(environment: Dictionary) {
    val mb = getMethodBind("CharFXTransform","set_environment")
    _icall_Unit_Dictionary( mb, this.ptr, environment)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("CharFXTransform","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setRelativeIndex(index: Long) {
    val mb = getMethodBind("CharFXTransform","set_relative_index")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setVisibility(visibility: Boolean) {
    val mb = getMethodBind("CharFXTransform","set_visibility")
    _icall_Unit_Boolean( mb, this.ptr, visibility)
  }
}
