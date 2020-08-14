// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolVector3Array
import godot.icalls._icall_PoolVector3Array
import godot.icalls._icall_Unit_PoolVector3Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class ConcavePolygonShape : Shape() {
  open var data: PoolVector3Array
    get() {
      val mb = getMethodBind("ConcavePolygonShape","get_faces")
      return _icall_PoolVector3Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ConcavePolygonShape","set_faces")
      _icall_Unit_PoolVector3Array(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ConcavePolygonShape",
      "ConcavePolygonShape")

  open fun getFaces(): PoolVector3Array {
    val mb = getMethodBind("ConcavePolygonShape","get_faces")
    return _icall_PoolVector3Array( mb, this.ptr)
  }

  open fun setFaces(faces: PoolVector3Array) {
    val mb = getMethodBind("ConcavePolygonShape","set_faces")
    _icall_Unit_PoolVector3Array( mb, this.ptr, faces)
  }
}
