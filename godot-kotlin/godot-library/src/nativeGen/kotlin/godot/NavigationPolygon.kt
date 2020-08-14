// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.VariantArray
import godot.icalls._icall_Long
import godot.icalls._icall_PoolIntArray_Long
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_PoolVector2Array_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_PoolVector2Array
import godot.icalls._icall_Unit_PoolIntArray
import godot.icalls._icall_Unit_PoolVector2Array
import godot.icalls._icall_Unit_PoolVector2Array_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class NavigationPolygon : Resource() {
  open var vertices: PoolVector2Array
    get() {
      val mb = getMethodBind("NavigationPolygon","get_vertices")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationPolygon","set_vertices")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("NavigationPolygon", "NavigationPolygon")

  open fun _getOutlines(): VariantArray {
    throw NotImplementedError("_get_outlines is not implemented for NavigationPolygon")
  }

  open fun _getPolygons(): VariantArray {
    throw NotImplementedError("_get_polygons is not implemented for NavigationPolygon")
  }

  open fun _setOutlines(outlines: VariantArray) {
  }

  open fun _setPolygons(polygons: VariantArray) {
  }

  open fun addOutline(outline: PoolVector2Array) {
    val mb = getMethodBind("NavigationPolygon","add_outline")
    _icall_Unit_PoolVector2Array( mb, this.ptr, outline)
  }

  open fun addOutlineAtIndex(outline: PoolVector2Array, index: Long) {
    val mb = getMethodBind("NavigationPolygon","add_outline_at_index")
    _icall_Unit_PoolVector2Array_Long( mb, this.ptr, outline, index)
  }

  open fun addPolygon(polygon: PoolIntArray) {
    val mb = getMethodBind("NavigationPolygon","add_polygon")
    _icall_Unit_PoolIntArray( mb, this.ptr, polygon)
  }

  open fun clearOutlines() {
    val mb = getMethodBind("NavigationPolygon","clear_outlines")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearPolygons() {
    val mb = getMethodBind("NavigationPolygon","clear_polygons")
    _icall_Unit( mb, this.ptr)
  }

  open fun getOutline(idx: Long): PoolVector2Array {
    val mb = getMethodBind("NavigationPolygon","get_outline")
    return _icall_PoolVector2Array_Long( mb, this.ptr, idx)
  }

  open fun getOutlineCount(): Long {
    val mb = getMethodBind("NavigationPolygon","get_outline_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPolygon(idx: Long): PoolIntArray {
    val mb = getMethodBind("NavigationPolygon","get_polygon")
    return _icall_PoolIntArray_Long( mb, this.ptr, idx)
  }

  open fun getPolygonCount(): Long {
    val mb = getMethodBind("NavigationPolygon","get_polygon_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVertices(): PoolVector2Array {
    val mb = getMethodBind("NavigationPolygon","get_vertices")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun makePolygonsFromOutlines() {
    val mb = getMethodBind("NavigationPolygon","make_polygons_from_outlines")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeOutline(idx: Long) {
    val mb = getMethodBind("NavigationPolygon","remove_outline")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun setOutline(idx: Long, outline: PoolVector2Array) {
    val mb = getMethodBind("NavigationPolygon","set_outline")
    _icall_Unit_Long_PoolVector2Array( mb, this.ptr, idx, outline)
  }

  open fun setVertices(vertices: PoolVector2Array) {
    val mb = getMethodBind("NavigationPolygon","set_vertices")
    _icall_Unit_PoolVector2Array( mb, this.ptr, vertices)
  }
}
