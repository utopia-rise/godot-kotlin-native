// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_NavigationPolygon
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class NavigationPolygonInstance : Node2D() {
  open var enabled: Boolean
    get() {
      val mb = getMethodBind("NavigationPolygonInstance","is_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationPolygonInstance","set_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var navpoly: NavigationPolygon
    get() {
      val mb = getMethodBind("NavigationPolygonInstance","get_navigation_polygon")
      return _icall_NavigationPolygon(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationPolygonInstance","set_navigation_polygon")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("NavigationPolygonInstance",
      "NavigationPolygonInstance")

  open fun _navpolyChanged() {
  }

  open fun getNavigationPolygon(): NavigationPolygon {
    val mb = getMethodBind("NavigationPolygonInstance","get_navigation_polygon")
    return _icall_NavigationPolygon( mb, this.ptr)
  }

  open fun isEnabled(): Boolean {
    val mb = getMethodBind("NavigationPolygonInstance","is_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setEnabled(enabled: Boolean) {
    val mb = getMethodBind("NavigationPolygonInstance","set_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setNavigationPolygon(navpoly: NavigationPolygon) {
    val mb = getMethodBind("NavigationPolygonInstance","set_navigation_polygon")
    _icall_Unit_Object( mb, this.ptr, navpoly)
  }
}
