// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.CSGPolygon
import godot.core.NodePath
import godot.core.PoolVector2Array
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Material
import godot.icalls._icall_NodePath
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class CSGPolygon : CSGPrimitive() {
  open var depth: Double
    get() {
      val mb = getMethodBind("CSGPolygon","get_depth")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_depth")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var material: Material
    get() {
      val mb = getMethodBind("CSGPolygon","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("CSGPolygon","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var pathContinuousU: Boolean
    get() {
      val mb = getMethodBind("CSGPolygon","is_path_continuous_u")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_path_continuous_u")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pathInterval: Double
    get() {
      val mb = getMethodBind("CSGPolygon","get_path_interval")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_path_interval")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var pathJoined: Boolean
    get() {
      val mb = getMethodBind("CSGPolygon","is_path_joined")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_path_joined")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pathLocal: Boolean
    get() {
      val mb = getMethodBind("CSGPolygon","is_path_local")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_path_local")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pathNode: NodePath
    get() {
      val mb = getMethodBind("CSGPolygon","get_path_node")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_path_node")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var pathRotation: Long
    get() {
      val mb = getMethodBind("CSGPolygon","get_path_rotation")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_path_rotation")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var polygon: PoolVector2Array
    get() {
      val mb = getMethodBind("CSGPolygon","get_polygon")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_polygon")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  open var smoothFaces: Boolean
    get() {
      val mb = getMethodBind("CSGPolygon","get_smooth_faces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_smooth_faces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var spinDegrees: Double
    get() {
      val mb = getMethodBind("CSGPolygon","get_spin_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_spin_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var spinSides: Long
    get() {
      val mb = getMethodBind("CSGPolygon","get_spin_sides")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPolygon","set_spin_sides")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CSGPolygon", "CSGPolygon")

  open fun _hasEditable3dPolygonNoDepth(): Boolean {
    throw NotImplementedError("_has_editable_3d_polygon_no_depth is not implemented for CSGPolygon")
  }

  open fun _isEditable3dPolygon(): Boolean {
    throw NotImplementedError("_is_editable_3d_polygon is not implemented for CSGPolygon")
  }

  open fun _pathChanged() {
  }

  open fun _pathExited() {
  }

  open fun getDepth(): Double {
    val mb = getMethodBind("CSGPolygon","get_depth")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CSGPolygon","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getMode(): CSGPolygon.Mode {
    val mb = getMethodBind("CSGPolygon","get_mode")
    return CSGPolygon.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPathInterval(): Double {
    val mb = getMethodBind("CSGPolygon","get_path_interval")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPathNode(): NodePath {
    val mb = getMethodBind("CSGPolygon","get_path_node")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getPathRotation(): CSGPolygon.PathRotation {
    val mb = getMethodBind("CSGPolygon","get_path_rotation")
    return CSGPolygon.PathRotation.from( _icall_Long( mb, this.ptr))
  }

  open fun getPolygon(): PoolVector2Array {
    val mb = getMethodBind("CSGPolygon","get_polygon")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getSmoothFaces(): Boolean {
    val mb = getMethodBind("CSGPolygon","get_smooth_faces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getSpinDegrees(): Double {
    val mb = getMethodBind("CSGPolygon","get_spin_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpinSides(): Long {
    val mb = getMethodBind("CSGPolygon","get_spin_sides")
    return _icall_Long( mb, this.ptr)
  }

  open fun isPathContinuousU(): Boolean {
    val mb = getMethodBind("CSGPolygon","is_path_continuous_u")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPathJoined(): Boolean {
    val mb = getMethodBind("CSGPolygon","is_path_joined")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPathLocal(): Boolean {
    val mb = getMethodBind("CSGPolygon","is_path_local")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDepth(depth: Double) {
    val mb = getMethodBind("CSGPolygon","set_depth")
    _icall_Unit_Double( mb, this.ptr, depth)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CSGPolygon","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("CSGPolygon","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPathContinuousU(enable: Boolean) {
    val mb = getMethodBind("CSGPolygon","set_path_continuous_u")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPathInterval(distance: Double) {
    val mb = getMethodBind("CSGPolygon","set_path_interval")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setPathJoined(enable: Boolean) {
    val mb = getMethodBind("CSGPolygon","set_path_joined")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPathLocal(enable: Boolean) {
    val mb = getMethodBind("CSGPolygon","set_path_local")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPathNode(path: NodePath) {
    val mb = getMethodBind("CSGPolygon","set_path_node")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }

  open fun setPathRotation(mode: Long) {
    val mb = getMethodBind("CSGPolygon","set_path_rotation")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPolygon(polygon: PoolVector2Array) {
    val mb = getMethodBind("CSGPolygon","set_polygon")
    _icall_Unit_PoolVector2Array( mb, this.ptr, polygon)
  }

  open fun setSmoothFaces(smoothFaces: Boolean) {
    val mb = getMethodBind("CSGPolygon","set_smooth_faces")
    _icall_Unit_Boolean( mb, this.ptr, smoothFaces)
  }

  open fun setSpinDegrees(degrees: Double) {
    val mb = getMethodBind("CSGPolygon","set_spin_degrees")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setSpinSides(spinSides: Long) {
    val mb = getMethodBind("CSGPolygon","set_spin_sides")
    _icall_Unit_Long( mb, this.ptr, spinSides)
  }

  enum class PathRotation(
    id: Long
  ) {
    PATH_ROTATION_POLYGON(0),

    PATH_ROTATION_PATH(1),

    PATH_ROTATION_PATH_FOLLOW(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Mode(
    id: Long
  ) {
    MODE_DEPTH(0),

    MODE_SPIN(1),

    MODE_PATH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
