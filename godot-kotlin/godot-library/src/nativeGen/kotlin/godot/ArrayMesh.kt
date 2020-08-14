// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Mesh
import godot.core.AABB
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.VariantArray
import godot.icalls._icall_AABB
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_Transform_Double
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_AABB
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long_PoolByteArray
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_VariantArray_VariantArray_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class ArrayMesh : Mesh() {
  open var blendShapeMode: Long
    get() {
      val mb = getMethodBind("ArrayMesh","get_blend_shape_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ArrayMesh","set_blend_shape_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var customAabb: AABB
    get() {
      val mb = getMethodBind("ArrayMesh","get_custom_aabb")
      return _icall_AABB(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ArrayMesh","set_custom_aabb")
      _icall_Unit_AABB(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ArrayMesh", "ArrayMesh")

  open fun customAabb(schedule: AABB.() -> Unit): AABB = customAabb.apply{
      schedule(this)
      customAabb = this
  }


  open fun addBlendShape(name: String) {
    val mb = getMethodBind("ArrayMesh","add_blend_shape")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun addSurfaceFromArrays(
    primitive: Long,
    arrays: VariantArray,
    blendShapes: VariantArray = VariantArray(),
    compressFlags: Long = 97280
  ) {
    val mb = getMethodBind("ArrayMesh","add_surface_from_arrays")
    _icall_Unit_Long_VariantArray_VariantArray_Long( mb, this.ptr, primitive, arrays, blendShapes,
        compressFlags)
  }

  open fun clearBlendShapes() {
    val mb = getMethodBind("ArrayMesh","clear_blend_shapes")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBlendShapeCount(): Long {
    val mb = getMethodBind("ArrayMesh","get_blend_shape_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBlendShapeMode(): Mesh.BlendShapeMode {
    val mb = getMethodBind("ArrayMesh","get_blend_shape_mode")
    return Mesh.BlendShapeMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getBlendShapeName(index: Long): String {
    val mb = getMethodBind("ArrayMesh","get_blend_shape_name")
    return _icall_String_Long( mb, this.ptr, index)
  }

  open fun getCustomAabb(): AABB {
    val mb = getMethodBind("ArrayMesh","get_custom_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun lightmapUnwrap(transform: Transform, texelSize: Double): GodotError {
    val mb = getMethodBind("ArrayMesh","lightmap_unwrap")
    return GodotError.byValue( _icall_Long_Transform_Double( mb, this.ptr, transform,
        texelSize).toUInt())
  }

  open fun regenNormalmaps() {
    val mb = getMethodBind("ArrayMesh","regen_normalmaps")
    _icall_Unit( mb, this.ptr)
  }

  open fun setBlendShapeMode(mode: Long) {
    val mb = getMethodBind("ArrayMesh","set_blend_shape_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setCustomAabb(aabb: AABB) {
    val mb = getMethodBind("ArrayMesh","set_custom_aabb")
    _icall_Unit_AABB( mb, this.ptr, aabb)
  }

  open fun surfaceFindByName(name: String): Long {
    val mb = getMethodBind("ArrayMesh","surface_find_by_name")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun surfaceGetArrayIndexLen(surfIdx: Long): Long {
    val mb = getMethodBind("ArrayMesh","surface_get_array_index_len")
    return _icall_Long_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceGetArrayLen(surfIdx: Long): Long {
    val mb = getMethodBind("ArrayMesh","surface_get_array_len")
    return _icall_Long_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceGetFormat(surfIdx: Long): Long {
    val mb = getMethodBind("ArrayMesh","surface_get_format")
    return _icall_Long_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceGetName(surfIdx: Long): String {
    val mb = getMethodBind("ArrayMesh","surface_get_name")
    return _icall_String_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceGetPrimitiveType(surfIdx: Long): Mesh.PrimitiveType {
    val mb = getMethodBind("ArrayMesh","surface_get_primitive_type")
    return Mesh.PrimitiveType.from( _icall_Long_Long( mb, this.ptr, surfIdx))
  }

  open fun surfaceRemove(surfIdx: Long) {
    val mb = getMethodBind("ArrayMesh","surface_remove")
    _icall_Unit_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceSetName(surfIdx: Long, name: String) {
    val mb = getMethodBind("ArrayMesh","surface_set_name")
    _icall_Unit_Long_String( mb, this.ptr, surfIdx, name)
  }

  open fun surfaceUpdateRegion(
    surfIdx: Long,
    offset: Long,
    data: PoolByteArray
  ) {
    val mb = getMethodBind("ArrayMesh","surface_update_region")
    _icall_Unit_Long_Long_PoolByteArray( mb, this.ptr, surfIdx, offset, data)
  }

  enum class ArrayFormat(
    id: Long
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayType(
    id: Long
  ) {
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ARRAY_WEIGHTS_SIZE: Long = 4

    final const val NO_INDEX_ARRAY: Long = -1
  }
}
