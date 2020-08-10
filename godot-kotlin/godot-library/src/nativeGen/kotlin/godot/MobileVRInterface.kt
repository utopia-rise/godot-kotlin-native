// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class MobileVRInterface internal constructor(
  _ignore: Any?
) : ARVRInterface(_ignore) {
  open var displayToLens: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_display_to_lens")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_display_to_lens")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var displayWidth: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_display_width")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_display_width")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var eyeHeight: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_eye_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_eye_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var iod: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_iod")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_iod")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var k1: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_k1")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_k1")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var k2: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_k2")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_k2")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var oversample: Double
    get() {
      val mb = getMethodBind("MobileVRInterface","get_oversample")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MobileVRInterface","set_oversample")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MobileVRInterface", "MobileVRInterface")
        }

  }

  open fun getDisplayToLens(): Double {
    val mb = getMethodBind("MobileVRInterface","get_display_to_lens")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDisplayWidth(): Double {
    val mb = getMethodBind("MobileVRInterface","get_display_width")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEyeHeight(): Double {
    val mb = getMethodBind("MobileVRInterface","get_eye_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getIod(): Double {
    val mb = getMethodBind("MobileVRInterface","get_iod")
    return _icall_Double( mb, this.ptr)
  }

  open fun getK1(): Double {
    val mb = getMethodBind("MobileVRInterface","get_k1")
    return _icall_Double( mb, this.ptr)
  }

  open fun getK2(): Double {
    val mb = getMethodBind("MobileVRInterface","get_k2")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOversample(): Double {
    val mb = getMethodBind("MobileVRInterface","get_oversample")
    return _icall_Double( mb, this.ptr)
  }

  open fun setDisplayToLens(displayToLens: Double) {
    val mb = getMethodBind("MobileVRInterface","set_display_to_lens")
    _icall_Unit_Double( mb, this.ptr, displayToLens)
  }

  open fun setDisplayWidth(displayWidth: Double) {
    val mb = getMethodBind("MobileVRInterface","set_display_width")
    _icall_Unit_Double( mb, this.ptr, displayWidth)
  }

  open fun setEyeHeight(eyeHeight: Double) {
    val mb = getMethodBind("MobileVRInterface","set_eye_height")
    _icall_Unit_Double( mb, this.ptr, eyeHeight)
  }

  open fun setIod(iod: Double) {
    val mb = getMethodBind("MobileVRInterface","set_iod")
    _icall_Unit_Double( mb, this.ptr, iod)
  }

  open fun setK1(k: Double) {
    val mb = getMethodBind("MobileVRInterface","set_k1")
    _icall_Unit_Double( mb, this.ptr, k)
  }

  open fun setK2(k: Double) {
    val mb = getMethodBind("MobileVRInterface","set_k2")
    _icall_Unit_Double( mb, this.ptr, k)
  }

  open fun setOversample(oversample: Double) {
    val mb = getMethodBind("MobileVRInterface","set_oversample")
    _icall_Unit_Double( mb, this.ptr, oversample)
  }
}
