// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class StyleBoxLine internal constructor(
  _ignore: Any?
) : StyleBox(_ignore) {
  open var color: Color
    get() {
      val mb = getMethodBind("StyleBoxLine","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxLine","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var growBegin: Double
    get() {
      val mb = getMethodBind("StyleBoxLine","get_grow_begin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxLine","set_grow_begin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var growEnd: Double
    get() {
      val mb = getMethodBind("StyleBoxLine","get_grow_end")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxLine","set_grow_end")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var thickness: Long
    get() {
      val mb = getMethodBind("StyleBoxLine","get_thickness")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxLine","set_thickness")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var vertical: Boolean
    get() {
      val mb = getMethodBind("StyleBoxLine","is_vertical")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StyleBoxLine","set_vertical")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("StyleBoxLine", "StyleBoxLine")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun getColor(): Color {
    val mb = getMethodBind("StyleBoxLine","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getGrowBegin(): Double {
    val mb = getMethodBind("StyleBoxLine","get_grow_begin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGrowEnd(): Double {
    val mb = getMethodBind("StyleBoxLine","get_grow_end")
    return _icall_Double( mb, this.ptr)
  }

  open fun getThickness(): Long {
    val mb = getMethodBind("StyleBoxLine","get_thickness")
    return _icall_Long( mb, this.ptr)
  }

  open fun isVertical(): Boolean {
    val mb = getMethodBind("StyleBoxLine","is_vertical")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("StyleBoxLine","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setGrowBegin(offset: Double) {
    val mb = getMethodBind("StyleBoxLine","set_grow_begin")
    _icall_Unit_Double( mb, this.ptr, offset)
  }

  open fun setGrowEnd(offset: Double) {
    val mb = getMethodBind("StyleBoxLine","set_grow_end")
    _icall_Unit_Double( mb, this.ptr, offset)
  }

  open fun setThickness(thickness: Long) {
    val mb = getMethodBind("StyleBoxLine","set_thickness")
    _icall_Unit_Long( mb, this.ptr, thickness)
  }

  open fun setVertical(vertical: Boolean) {
    val mb = getMethodBind("StyleBoxLine","set_vertical")
    _icall_Unit_Boolean( mb, this.ptr, vertical)
  }
}
