// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Transform2D
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Transform2D
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Bone2D : Node2D() {
  open var defaultLength: Double
    get() {
      val mb = getMethodBind("Bone2D","get_default_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Bone2D","set_default_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rest: Transform2D
    get() {
      val mb = getMethodBind("Bone2D","get_rest")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Bone2D","set_rest")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Bone2D", "Bone2D")

  open fun rest(schedule: Transform2D.() -> Unit): Transform2D = rest.apply{
      schedule(this)
      rest = this
  }


  open fun applyRest() {
    val mb = getMethodBind("Bone2D","apply_rest")
    _icall_Unit( mb, this.ptr)
  }

  open fun getDefaultLength(): Double {
    val mb = getMethodBind("Bone2D","get_default_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getIndexInSkeleton(): Long {
    val mb = getMethodBind("Bone2D","get_index_in_skeleton")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRest(): Transform2D {
    val mb = getMethodBind("Bone2D","get_rest")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getSkeletonRest(): Transform2D {
    val mb = getMethodBind("Bone2D","get_skeleton_rest")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun setDefaultLength(defaultLength: Double) {
    val mb = getMethodBind("Bone2D","set_default_length")
    _icall_Unit_Double( mb, this.ptr, defaultLength)
  }

  open fun setRest(rest: Transform2D) {
    val mb = getMethodBind("Bone2D","set_rest")
    _icall_Unit_Transform2D( mb, this.ptr, rest)
  }
}
