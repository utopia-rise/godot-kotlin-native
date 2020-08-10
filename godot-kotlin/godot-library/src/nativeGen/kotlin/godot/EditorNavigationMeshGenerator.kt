// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Object
import godot.internal.utils.getMethodBind
import kotlin.Any

open class EditorNavigationMeshGenerator internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  internal constructor() : this(null)

  open fun bake(navMesh: NavigationMesh, rootNode: Node) {
    val mb = getMethodBind("EditorNavigationMeshGenerator","bake")
    _icall_Unit_Object_Object( mb, this.ptr, navMesh, rootNode)
  }

  open fun clear(navMesh: NavigationMesh) {
    val mb = getMethodBind("EditorNavigationMeshGenerator","clear")
    _icall_Unit_Object( mb, this.ptr, navMesh)
  }
}
