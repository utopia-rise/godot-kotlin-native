// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_MultiMesh
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class MultiMeshInstance : GeometryInstance() {
  open var multimesh: MultiMesh
    get() {
      val mb = getMethodBind("MultiMeshInstance","get_multimesh")
      return _icall_MultiMesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMeshInstance","set_multimesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("MultiMeshInstance", "MultiMeshInstance")

  open fun getMultimesh(): MultiMesh {
    val mb = getMethodBind("MultiMeshInstance","get_multimesh")
    return _icall_MultiMesh( mb, this.ptr)
  }

  open fun setMultimesh(multimesh: MultiMesh) {
    val mb = getMethodBind("MultiMeshInstance","set_multimesh")
    _icall_Unit_Object( mb, this.ptr, multimesh)
  }
}
