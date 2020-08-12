// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_NodePath_Long
import godot.icalls._icall_PoolColorArray
import godot.icalls._icall_PoolRealArray_Long
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_NodePath
import godot.icalls._icall_Unit_Long_PoolRealArray
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_NodePath_PoolRealArray
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolColorArray
import godot.icalls._icall_Unit_PoolVector2Array
import godot.icalls._icall_Unit_VariantArray
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Unit

open class Polygon2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var antialiased: Boolean
    get() {
      val mb = getMethodBind("Polygon2D","get_antialiased")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_antialiased")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var color: Color
    get() {
      val mb = getMethodBind("Polygon2D","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var internalVertexCount: Long
    get() {
      val mb = getMethodBind("Polygon2D","get_internal_vertex_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_internal_vertex_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var invertBorder: Double
    get() {
      val mb = getMethodBind("Polygon2D","get_invert_border")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_invert_border")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var invertEnable: Boolean
    get() {
      val mb = getMethodBind("Polygon2D","get_invert")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_invert")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("Polygon2D","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var polygon: PoolVector2Array
    get() {
      val mb = getMethodBind("Polygon2D","get_polygon")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_polygon")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  open var polygons: VariantArray
    get() {
      val mb = getMethodBind("Polygon2D","get_polygons")
      return _icall_VariantArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_polygons")
      _icall_Unit_VariantArray(mb, this.ptr, value)
    }

  open var skeleton: NodePath
    get() {
      val mb = getMethodBind("Polygon2D","get_skeleton")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_skeleton")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("Polygon2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureOffset: Vector2
    get() {
      val mb = getMethodBind("Polygon2D","get_texture_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_texture_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var textureRotation: Double
    get() {
      val mb = getMethodBind("Polygon2D","get_texture_rotation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_texture_rotation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var textureRotationDegrees: Double
    get() {
      val mb = getMethodBind("Polygon2D","get_texture_rotation_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_texture_rotation_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var textureScale: Vector2
    get() {
      val mb = getMethodBind("Polygon2D","get_texture_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_texture_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var uv: PoolVector2Array
    get() {
      val mb = getMethodBind("Polygon2D","get_uv")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_uv")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  open var vertexColors: PoolColorArray
    get() {
      val mb = getMethodBind("Polygon2D","get_vertex_colors")
      return _icall_PoolColorArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Polygon2D","set_vertex_colors")
      _icall_Unit_PoolColorArray(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Polygon2D", "Polygon2D")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun textureOffset(schedule: Vector2.() -> Unit): Vector2 = textureOffset.apply{
      schedule(this)
      textureOffset = this
  }


  open fun textureScale(schedule: Vector2.() -> Unit): Vector2 = textureScale.apply{
      schedule(this)
      textureScale = this
  }


  open fun _getBones(): VariantArray {
    throw NotImplementedError("_get_bones is not implemented for Polygon2D")
  }

  open fun _setBones(bones: VariantArray) {
  }

  open fun _skeletonBoneSetupChanged() {
  }

  open fun addBone(path: NodePath, weights: PoolRealArray) {
    val mb = getMethodBind("Polygon2D","add_bone")
    _icall_Unit_NodePath_PoolRealArray( mb, this.ptr, path, weights)
  }

  open fun clearBones() {
    val mb = getMethodBind("Polygon2D","clear_bones")
    _icall_Unit( mb, this.ptr)
  }

  open fun eraseBone(index: Long) {
    val mb = getMethodBind("Polygon2D","erase_bone")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun getAntialiased(): Boolean {
    val mb = getMethodBind("Polygon2D","get_antialiased")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getBoneCount(): Long {
    val mb = getMethodBind("Polygon2D","get_bone_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBonePath(index: Long): NodePath {
    val mb = getMethodBind("Polygon2D","get_bone_path")
    return _icall_NodePath_Long( mb, this.ptr, index)
  }

  open fun getBoneWeights(index: Long): PoolRealArray {
    val mb = getMethodBind("Polygon2D","get_bone_weights")
    return _icall_PoolRealArray_Long( mb, this.ptr, index)
  }

  open fun getColor(): Color {
    val mb = getMethodBind("Polygon2D","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getInternalVertexCount(): Long {
    val mb = getMethodBind("Polygon2D","get_internal_vertex_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInvert(): Boolean {
    val mb = getMethodBind("Polygon2D","get_invert")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getInvertBorder(): Double {
    val mb = getMethodBind("Polygon2D","get_invert_border")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("Polygon2D","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getPolygon(): PoolVector2Array {
    val mb = getMethodBind("Polygon2D","get_polygon")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getPolygons(): VariantArray {
    val mb = getMethodBind("Polygon2D","get_polygons")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getSkeleton(): NodePath {
    val mb = getMethodBind("Polygon2D","get_skeleton")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("Polygon2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTextureOffset(): Vector2 {
    val mb = getMethodBind("Polygon2D","get_texture_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTextureRotation(): Double {
    val mb = getMethodBind("Polygon2D","get_texture_rotation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTextureRotationDegrees(): Double {
    val mb = getMethodBind("Polygon2D","get_texture_rotation_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTextureScale(): Vector2 {
    val mb = getMethodBind("Polygon2D","get_texture_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getUv(): PoolVector2Array {
    val mb = getMethodBind("Polygon2D","get_uv")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getVertexColors(): PoolColorArray {
    val mb = getMethodBind("Polygon2D","get_vertex_colors")
    return _icall_PoolColorArray( mb, this.ptr)
  }

  open fun setAntialiased(antialiased: Boolean) {
    val mb = getMethodBind("Polygon2D","set_antialiased")
    _icall_Unit_Boolean( mb, this.ptr, antialiased)
  }

  open fun setBonePath(index: Long, path: NodePath) {
    val mb = getMethodBind("Polygon2D","set_bone_path")
    _icall_Unit_Long_NodePath( mb, this.ptr, index, path)
  }

  open fun setBoneWeights(index: Long, weights: PoolRealArray) {
    val mb = getMethodBind("Polygon2D","set_bone_weights")
    _icall_Unit_Long_PoolRealArray( mb, this.ptr, index, weights)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("Polygon2D","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setInternalVertexCount(internalVertexCount: Long) {
    val mb = getMethodBind("Polygon2D","set_internal_vertex_count")
    _icall_Unit_Long( mb, this.ptr, internalVertexCount)
  }

  open fun setInvert(invert: Boolean) {
    val mb = getMethodBind("Polygon2D","set_invert")
    _icall_Unit_Boolean( mb, this.ptr, invert)
  }

  open fun setInvertBorder(invertBorder: Double) {
    val mb = getMethodBind("Polygon2D","set_invert_border")
    _icall_Unit_Double( mb, this.ptr, invertBorder)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("Polygon2D","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setPolygon(polygon: PoolVector2Array) {
    val mb = getMethodBind("Polygon2D","set_polygon")
    _icall_Unit_PoolVector2Array( mb, this.ptr, polygon)
  }

  open fun setPolygons(polygons: VariantArray) {
    val mb = getMethodBind("Polygon2D","set_polygons")
    _icall_Unit_VariantArray( mb, this.ptr, polygons)
  }

  open fun setSkeleton(skeleton: NodePath) {
    val mb = getMethodBind("Polygon2D","set_skeleton")
    _icall_Unit_NodePath( mb, this.ptr, skeleton)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("Polygon2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setTextureOffset(textureOffset: Vector2) {
    val mb = getMethodBind("Polygon2D","set_texture_offset")
    _icall_Unit_Vector2( mb, this.ptr, textureOffset)
  }

  open fun setTextureRotation(textureRotation: Double) {
    val mb = getMethodBind("Polygon2D","set_texture_rotation")
    _icall_Unit_Double( mb, this.ptr, textureRotation)
  }

  open fun setTextureRotationDegrees(textureRotation: Double) {
    val mb = getMethodBind("Polygon2D","set_texture_rotation_degrees")
    _icall_Unit_Double( mb, this.ptr, textureRotation)
  }

  open fun setTextureScale(textureScale: Vector2) {
    val mb = getMethodBind("Polygon2D","set_texture_scale")
    _icall_Unit_Vector2( mb, this.ptr, textureScale)
  }

  open fun setUv(uv: PoolVector2Array) {
    val mb = getMethodBind("Polygon2D","set_uv")
    _icall_Unit_PoolVector2Array( mb, this.ptr, uv)
  }

  open fun setVertexColors(vertexColors: PoolColorArray) {
    val mb = getMethodBind("Polygon2D","set_vertex_colors")
    _icall_Unit_PoolColorArray( mb, this.ptr, vertexColors)
  }
}
