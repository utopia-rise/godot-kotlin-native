package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_MultiMesh
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class MultiMeshInstance internal constructor(
  _ignore: Any?
) : GeometryInstance(_ignore) {
  open var multimesh: MultiMesh
    get() {
      val mb = getMethodBind("MultiMeshInstance","get_multimesh")
      return _icall_MultiMesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMeshInstance","set_multimesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MultiMeshInstance", "MultiMeshInstance")
        }

  }

  open fun getMultimesh(): MultiMesh {
    val mb = getMethodBind("MultiMeshInstance","get_multimesh")
    return _icall_MultiMesh( mb, this.ptr)
  }

  open fun setMultimesh(multimesh: MultiMesh) {
    val mb = getMethodBind("MultiMeshInstance","set_multimesh")
    _icall_Unit_Object( mb, this.ptr, multimesh)
  }
}
