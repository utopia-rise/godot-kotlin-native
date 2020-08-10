package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Material
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class CSGBox internal constructor(
  _ignore: Any?
) : CSGPrimitive(_ignore) {
  open var depth: Double
    get() {
      val mb = getMethodBind("CSGBox","get_depth")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGBox","set_depth")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var height: Double
    get() {
      val mb = getMethodBind("CSGBox","get_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGBox","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var material: Material
    get() {
      val mb = getMethodBind("CSGBox","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGBox","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var width: Double
    get() {
      val mb = getMethodBind("CSGBox","get_width")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGBox","set_width")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CSGBox", "CSGBox")
        }

  }

  open fun getDepth(): Double {
    val mb = getMethodBind("CSGBox","get_depth")
    return _icall_Double( mb, this.ptr)
  }

  open fun getHeight(): Double {
    val mb = getMethodBind("CSGBox","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CSGBox","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getWidth(): Double {
    val mb = getMethodBind("CSGBox","get_width")
    return _icall_Double( mb, this.ptr)
  }

  open fun setDepth(depth: Double) {
    val mb = getMethodBind("CSGBox","set_depth")
    _icall_Unit_Double( mb, this.ptr, depth)
  }

  open fun setHeight(height: Double) {
    val mb = getMethodBind("CSGBox","set_height")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CSGBox","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setWidth(width: Double) {
    val mb = getMethodBind("CSGBox","set_width")
    _icall_Unit_Double( mb, this.ptr, width)
  }
}
