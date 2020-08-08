package godot

import godot.core.AABB
import godot.core.PoolVector3Array
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_AABB
import godot.icalls._icall_Long
import godot.icalls._icall_Material_Long
import godot.icalls._icall_Mesh_Double
import godot.icalls._icall_PoolVector3Array
import godot.icalls._icall_Shape
import godot.icalls._icall_TriangleMesh
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray_Long
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Mesh internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var lightmapSizeHint: Vector2
    get() {
      val mb = getMethodBind("Mesh","get_lightmap_size_hint")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Mesh","set_lightmap_size_hint")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun lightmapSizeHint(schedule: Vector2.() -> Unit): Vector2 = lightmapSizeHint.apply{
      schedule(this)
      lightmapSizeHint = this
  }


  open fun createConvexShape(): Shape {
    val mb = getMethodBind("Mesh","create_convex_shape")
    return _icall_Shape( mb, this.ptr)
  }

  open fun createOutline(margin: Double): Mesh {
    val mb = getMethodBind("Mesh","create_outline")
    return _icall_Mesh_Double( mb, this.ptr, margin)
  }

  open fun createTrimeshShape(): Shape {
    val mb = getMethodBind("Mesh","create_trimesh_shape")
    return _icall_Shape( mb, this.ptr)
  }

  open fun generateTriangleMesh(): TriangleMesh {
    val mb = getMethodBind("Mesh","generate_triangle_mesh")
    return _icall_TriangleMesh( mb, this.ptr)
  }

  open fun getAabb(): AABB {
    val mb = getMethodBind("Mesh","get_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getFaces(): PoolVector3Array {
    val mb = getMethodBind("Mesh","get_faces")
    return _icall_PoolVector3Array( mb, this.ptr)
  }

  open fun getLightmapSizeHint(): Vector2 {
    val mb = getMethodBind("Mesh","get_lightmap_size_hint")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSurfaceCount(): Long {
    val mb = getMethodBind("Mesh","get_surface_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun setLightmapSizeHint(size: Vector2) {
    val mb = getMethodBind("Mesh","set_lightmap_size_hint")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun surfaceGetArrays(surfIdx: Long): VariantArray {
    val mb = getMethodBind("Mesh","surface_get_arrays")
    return _icall_VariantArray_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceGetBlendShapeArrays(surfIdx: Long): VariantArray {
    val mb = getMethodBind("Mesh","surface_get_blend_shape_arrays")
    return _icall_VariantArray_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceGetMaterial(surfIdx: Long): Material {
    val mb = getMethodBind("Mesh","surface_get_material")
    return _icall_Material_Long( mb, this.ptr, surfIdx)
  }

  open fun surfaceSetMaterial(surfIdx: Long, material: Material) {
    val mb = getMethodBind("Mesh","surface_set_material")
    _icall_Unit_Long_Object( mb, this.ptr, surfIdx, material)
  }

  enum class BlendShapeMode(
    id: Long
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PrimitiveType(
    id: Long
  ) {
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayFormat(
    id: Long
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_COMPRESS_BASE(9),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);

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
    final const val ARRAY_BONES: Long = 6

    final const val ARRAY_COLOR: Long = 3

    final const val ARRAY_COMPRESS_BASE: Long = 9

    final const val ARRAY_COMPRESS_BONES: Long = 32768

    final const val ARRAY_COMPRESS_COLOR: Long = 4096

    final const val ARRAY_COMPRESS_DEFAULT: Long = 97280

    final const val ARRAY_COMPRESS_INDEX: Long = 131072

    final const val ARRAY_COMPRESS_NORMAL: Long = 1024

    final const val ARRAY_COMPRESS_TANGENT: Long = 2048

    final const val ARRAY_COMPRESS_TEX_UV: Long = 8192

    final const val ARRAY_COMPRESS_TEX_UV2: Long = 16384

    final const val ARRAY_COMPRESS_VERTEX: Long = 512

    final const val ARRAY_COMPRESS_WEIGHTS: Long = 65536

    final const val ARRAY_FLAG_USE_16_BIT_BONES: Long = 524288

    final const val ARRAY_FLAG_USE_2D_VERTICES: Long = 262144

    final const val ARRAY_FORMAT_BONES: Long = 64

    final const val ARRAY_FORMAT_COLOR: Long = 8

    final const val ARRAY_FORMAT_INDEX: Long = 256

    final const val ARRAY_FORMAT_NORMAL: Long = 2

    final const val ARRAY_FORMAT_TANGENT: Long = 4

    final const val ARRAY_FORMAT_TEX_UV: Long = 16

    final const val ARRAY_FORMAT_TEX_UV2: Long = 32

    final const val ARRAY_FORMAT_VERTEX: Long = 1

    final const val ARRAY_FORMAT_WEIGHTS: Long = 128

    final const val ARRAY_INDEX: Long = 8

    final const val ARRAY_MAX: Long = 9

    final const val ARRAY_NORMAL: Long = 1

    final const val ARRAY_TANGENT: Long = 2

    final const val ARRAY_TEX_UV: Long = 4

    final const val ARRAY_TEX_UV2: Long = 5

    final const val ARRAY_VERTEX: Long = 0

    final const val ARRAY_WEIGHTS: Long = 7

    final const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0

    final const val BLEND_SHAPE_MODE_RELATIVE: Long = 1

    final const val PRIMITIVE_LINES: Long = 1

    final const val PRIMITIVE_LINE_LOOP: Long = 3

    final const val PRIMITIVE_LINE_STRIP: Long = 2

    final const val PRIMITIVE_POINTS: Long = 0

    final const val PRIMITIVE_TRIANGLES: Long = 4

    final const val PRIMITIVE_TRIANGLE_FAN: Long = 6

    final const val PRIMITIVE_TRIANGLE_STRIP: Long = 5
  }
}
