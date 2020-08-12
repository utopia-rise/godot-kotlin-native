// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_NavigationPolygon
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean

open class NavigationPolygonInstance internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("NavigationPolygonInstance", "NavigationPolygonInstance")
        }

  }

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
