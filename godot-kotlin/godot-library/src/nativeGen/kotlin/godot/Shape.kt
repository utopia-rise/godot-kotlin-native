// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import kotlin.Double

open class Shape internal constructor() : Resource() {
  open var margin: Double
    get() {
      val mb = getMethodBind("Shape","get_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Shape","set_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open fun getMargin(): Double {
    val mb = getMethodBind("Shape","get_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun setMargin(margin: Double) {
    val mb = getMethodBind("Shape","set_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }
}
