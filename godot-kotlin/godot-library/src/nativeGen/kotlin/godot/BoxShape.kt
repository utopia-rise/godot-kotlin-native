// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class BoxShape internal constructor(
  _ignore: Any?
) : Shape(_ignore) {
  open var extents: Vector3
    get() {
      val mb = getMethodBind("BoxShape","get_extents")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BoxShape","set_extents")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("BoxShape", "BoxShape")
        }

  }

  open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  open fun getExtents(): Vector3 {
    val mb = getMethodBind("BoxShape","get_extents")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun setExtents(extents: Vector3) {
    val mb = getMethodBind("BoxShape","set_extents")
    _icall_Unit_Vector3( mb, this.ptr, extents)
  }
}
