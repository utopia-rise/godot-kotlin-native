// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_NavigationMesh
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class NavigationMeshInstance : Spatial() {
  open var enabled: Boolean
    get() {
      val mb = getMethodBind("NavigationMeshInstance","is_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMeshInstance","set_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var navmesh: NavigationMesh
    get() {
      val mb = getMethodBind("NavigationMeshInstance","get_navigation_mesh")
      return _icall_NavigationMesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMeshInstance","set_navigation_mesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("NavigationMeshInstance",
      "NavigationMeshInstance")

  open fun getNavigationMesh(): NavigationMesh {
    val mb = getMethodBind("NavigationMeshInstance","get_navigation_mesh")
    return _icall_NavigationMesh( mb, this.ptr)
  }

  open fun isEnabled(): Boolean {
    val mb = getMethodBind("NavigationMeshInstance","is_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setEnabled(enabled: Boolean) {
    val mb = getMethodBind("NavigationMeshInstance","set_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setNavigationMesh(navmesh: NavigationMesh) {
    val mb = getMethodBind("NavigationMeshInstance","set_navigation_mesh")
    _icall_Unit_Object( mb, this.ptr, navmesh)
  }
}
