// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Unit

open class SegmentShape2D internal constructor(
  _ignore: Any?
) : Shape2D(_ignore) {
  open var a: Vector2
    get() {
      val mb = getMethodBind("SegmentShape2D","get_a")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SegmentShape2D","set_a")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var b: Vector2
    get() {
      val mb = getMethodBind("SegmentShape2D","get_b")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SegmentShape2D","set_b")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("SegmentShape2D", "SegmentShape2D")
        }

  }

  open fun a(schedule: Vector2.() -> Unit): Vector2 = a.apply{
      schedule(this)
      a = this
  }


  open fun b(schedule: Vector2.() -> Unit): Vector2 = b.apply{
      schedule(this)
      b = this
  }


  open fun getA(): Vector2 {
    val mb = getMethodBind("SegmentShape2D","get_a")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getB(): Vector2 {
    val mb = getMethodBind("SegmentShape2D","get_b")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setA(a: Vector2) {
    val mb = getMethodBind("SegmentShape2D","set_a")
    _icall_Unit_Vector2( mb, this.ptr, a)
  }

  open fun setB(b: Vector2) {
    val mb = getMethodBind("SegmentShape2D","set_b")
    _icall_Unit_Vector2( mb, this.ptr, b)
  }
}
