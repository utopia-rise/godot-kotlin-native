package godot

import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class Range internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val changed: Signal0 by signal()

  val valueChanged: Signal1<Double> by signal("value")

  open var allowGreater: Boolean
    get() {
      val mb = getMethodBind("Range","is_greater_allowed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_allow_greater")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var allowLesser: Boolean
    get() {
      val mb = getMethodBind("Range","is_lesser_allowed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_allow_lesser")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var expEdit: Boolean
    get() {
      val mb = getMethodBind("Range","is_ratio_exp")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_exp_ratio")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var maxValue: Double
    get() {
      val mb = getMethodBind("Range","get_max")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_max")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var minValue: Double
    get() {
      val mb = getMethodBind("Range","get_min")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_min")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var page: Double
    get() {
      val mb = getMethodBind("Range","get_page")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_page")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ratio: Double
    get() {
      val mb = getMethodBind("Range","get_as_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_as_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rounded: Boolean
    get() {
      val mb = getMethodBind("Range","is_using_rounded_values")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_use_rounded_values")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var step: Double
    get() {
      val mb = getMethodBind("Range","get_step")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_step")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var value: Double
    get() {
      val mb = getMethodBind("Range","get_value")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Range","set_value")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getAsRatio(): Double {
    val mb = getMethodBind("Range","get_as_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMax(): Double {
    val mb = getMethodBind("Range","get_max")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMin(): Double {
    val mb = getMethodBind("Range","get_min")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPage(): Double {
    val mb = getMethodBind("Range","get_page")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStep(): Double {
    val mb = getMethodBind("Range","get_step")
    return _icall_Double( mb, this.ptr)
  }

  open fun getValue(): Double {
    val mb = getMethodBind("Range","get_value")
    return _icall_Double( mb, this.ptr)
  }

  open fun isGreaterAllowed(): Boolean {
    val mb = getMethodBind("Range","is_greater_allowed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isLesserAllowed(): Boolean {
    val mb = getMethodBind("Range","is_lesser_allowed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRatioExp(): Boolean {
    val mb = getMethodBind("Range","is_ratio_exp")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingRoundedValues(): Boolean {
    val mb = getMethodBind("Range","is_using_rounded_values")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAllowGreater(allow: Boolean) {
    val mb = getMethodBind("Range","set_allow_greater")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setAllowLesser(allow: Boolean) {
    val mb = getMethodBind("Range","set_allow_lesser")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setAsRatio(value: Double) {
    val mb = getMethodBind("Range","set_as_ratio")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun setExpRatio(enabled: Boolean) {
    val mb = getMethodBind("Range","set_exp_ratio")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setMax(maximum: Double) {
    val mb = getMethodBind("Range","set_max")
    _icall_Unit_Double( mb, this.ptr, maximum)
  }

  open fun setMin(minimum: Double) {
    val mb = getMethodBind("Range","set_min")
    _icall_Unit_Double( mb, this.ptr, minimum)
  }

  open fun setPage(pagesize: Double) {
    val mb = getMethodBind("Range","set_page")
    _icall_Unit_Double( mb, this.ptr, pagesize)
  }

  open fun setStep(step: Double) {
    val mb = getMethodBind("Range","set_step")
    _icall_Unit_Double( mb, this.ptr, step)
  }

  open fun setUseRoundedValues(enabled: Boolean) {
    val mb = getMethodBind("Range","set_use_rounded_values")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setValue(value: Double) {
    val mb = getMethodBind("Range","set_value")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun share(with: Node) {
    val mb = getMethodBind("Range","share")
    _icall_Unit_Object( mb, this.ptr, with)
  }

  open fun unshare() {
    val mb = getMethodBind("Range","unshare")
    _icall_Unit( mb, this.ptr)
  }

  companion object
}
