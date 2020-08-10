// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector3Array
import godot.icalls._icall_PoolVector3Array
import godot.icalls._icall_Unit_PoolVector3Array
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class ConcavePolygonShape internal constructor(
  _ignore: Any?
) : Shape(_ignore) {
  open var data: PoolVector3Array
    get() {
      val mb = getMethodBind("ConcavePolygonShape","get_faces")
      return _icall_PoolVector3Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ConcavePolygonShape","set_faces")
      _icall_Unit_PoolVector3Array(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ConcavePolygonShape", "ConcavePolygonShape")
        }

  }

  open fun getFaces(): PoolVector3Array {
    val mb = getMethodBind("ConcavePolygonShape","get_faces")
    return _icall_PoolVector3Array( mb, this.ptr)
  }

  open fun setFaces(faces: PoolVector3Array) {
    val mb = getMethodBind("ConcavePolygonShape","set_faces")
    _icall_Unit_PoolVector3Array( mb, this.ptr, faces)
  }
}
