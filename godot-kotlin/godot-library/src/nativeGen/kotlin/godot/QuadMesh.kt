package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class QuadMesh internal constructor(
  _ignore: Any?
) : PrimitiveMesh(_ignore) {
  open var size: Vector2
    get() {
      val mb = getMethodBind("QuadMesh","get_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("QuadMesh","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("QuadMesh", "QuadMesh")
        }

  }

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun getSize(): Vector2 {
    val mb = getMethodBind("QuadMesh","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("QuadMesh","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }
}
