// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class QuadMesh : PrimitiveMesh() {
  open var size: Vector2
    get() {
      val mb = getMethodBind("QuadMesh","get_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("QuadMesh","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("QuadMesh", "QuadMesh")

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
