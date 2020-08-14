// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolVector2Array
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class CollisionPolygon : Spatial() {
  open var depth: Double
    get() {
      val mb = getMethodBind("CollisionPolygon","get_depth")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon","set_depth")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var disabled: Boolean
    get() {
      val mb = getMethodBind("CollisionPolygon","is_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon","set_disabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var polygon: PoolVector2Array
    get() {
      val mb = getMethodBind("CollisionPolygon","get_polygon")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon","set_polygon")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CollisionPolygon", "CollisionPolygon")

  open fun _isEditable3dPolygon(): Boolean {
    throw NotImplementedError("_is_editable_3d_polygon is not implemented for CollisionPolygon")
  }

  open fun getDepth(): Double {
    val mb = getMethodBind("CollisionPolygon","get_depth")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPolygon(): PoolVector2Array {
    val mb = getMethodBind("CollisionPolygon","get_polygon")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun isDisabled(): Boolean {
    val mb = getMethodBind("CollisionPolygon","is_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDepth(depth: Double) {
    val mb = getMethodBind("CollisionPolygon","set_depth")
    _icall_Unit_Double( mb, this.ptr, depth)
  }

  open fun setDisabled(disabled: Boolean) {
    val mb = getMethodBind("CollisionPolygon","set_disabled")
    _icall_Unit_Boolean( mb, this.ptr, disabled)
  }

  open fun setPolygon(polygon: PoolVector2Array) {
    val mb = getMethodBind("CollisionPolygon","set_polygon")
    _icall_Unit_PoolVector2Array( mb, this.ptr, polygon)
  }
}
