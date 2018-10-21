@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Mesh : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BlendShapeMode(val id: Long) {
        BLEND_SHAPE_MODE_NORMALIZED(0),
        BLEND_SHAPE_MODE_RELATIVE(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class PrimitiveType(val id: Long) {
        PRIMITIVE_POINTS(0),
        PRIMITIVE_LINES(1),
        PRIMITIVE_LINE_STRIP(2),
        PRIMITIVE_LINE_LOOP(3),
        PRIMITIVE_TRIANGLES(4),
        PRIMITIVE_TRIANGLE_STRIP(5),
        PRIMITIVE_TRIANGLE_FAN(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ArrayFormat(val id: Long) {
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
        ARRAY_FLAG_USE_16_BIT_BONES(524288),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ArrayType(val id: Long) {
        ARRAY_VERTEX(0),
        ARRAY_NORMAL(1),
        ARRAY_TANGENT(2),
        ARRAY_COLOR(3),
        ARRAY_TEX_UV(4),
        ARRAY_TEX_UV2(5),
        ARRAY_BONES(6),
        ARRAY_WEIGHTS(7),
        ARRAY_INDEX(8),
        ARRAY_MAX(9),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): Mesh = Mesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Mesh = Mesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Mesh = Mesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Mesh = fromVariant(Mesh(""), other)


        // Constants
        const val PRIMITIVE_POINTS: Long = 0
        const val PRIMITIVE_LINES: Long = 1
        const val PRIMITIVE_LINE_STRIP: Long = 2
        const val PRIMITIVE_LINE_LOOP: Long = 3
        const val PRIMITIVE_TRIANGLES: Long = 4
        const val PRIMITIVE_TRIANGLE_STRIP: Long = 5
        const val PRIMITIVE_TRIANGLE_FAN: Long = 6
        const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0
        const val BLEND_SHAPE_MODE_RELATIVE: Long = 1
        const val ARRAY_FORMAT_VERTEX: Long = 1
        const val ARRAY_FORMAT_NORMAL: Long = 2
        const val ARRAY_FORMAT_TANGENT: Long = 4
        const val ARRAY_FORMAT_COLOR: Long = 8
        const val ARRAY_FORMAT_TEX_UV: Long = 16
        const val ARRAY_FORMAT_TEX_UV2: Long = 32
        const val ARRAY_FORMAT_BONES: Long = 64
        const val ARRAY_FORMAT_WEIGHTS: Long = 128
        const val ARRAY_FORMAT_INDEX: Long = 256
        const val ARRAY_COMPRESS_BASE: Long = 9
        const val ARRAY_COMPRESS_VERTEX: Long = 512
        const val ARRAY_COMPRESS_NORMAL: Long = 1024
        const val ARRAY_COMPRESS_TANGENT: Long = 2048
        const val ARRAY_COMPRESS_COLOR: Long = 4096
        const val ARRAY_COMPRESS_TEX_UV: Long = 8192
        const val ARRAY_COMPRESS_TEX_UV2: Long = 16384
        const val ARRAY_COMPRESS_BONES: Long = 32768
        const val ARRAY_COMPRESS_WEIGHTS: Long = 65536
        const val ARRAY_COMPRESS_INDEX: Long = 131072
        const val ARRAY_FLAG_USE_2D_VERTICES: Long = 262144
        const val ARRAY_FLAG_USE_16_BIT_BONES: Long = 524288
        const val ARRAY_COMPRESS_DEFAULT: Long = 97280
        const val ARRAY_VERTEX: Long = 0
        const val ARRAY_NORMAL: Long = 1
        const val ARRAY_TANGENT: Long = 2
        const val ARRAY_COLOR: Long = 3
        const val ARRAY_TEX_UV: Long = 4
        const val ARRAY_TEX_UV2: Long = 5
        const val ARRAY_BONES: Long = 6
        const val ARRAY_WEIGHTS: Long = 7
        const val ARRAY_INDEX: Long = 8
        const val ARRAY_MAX: Long = 9


    }


    // Properties
    open var lightmapSizeHint: Vector2
        get() = _icall_Vector2(getLightmapSizeHintMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setLightmapSizeHintMethodBind, this.rawMemory, value)
    open fun lightmapSizeHint(shedule: (Vector2) -> Unit): Vector2 = lightmapSizeHint.apply {
        shedule(this)
        lightmapSizeHint = this
    }




    // Methods
    private val setLightmapSizeHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "set_lightmap_size_hint") }
    open fun setLightmapSizeHint(size: Vector2) {
        _icall_Unit_Vector2(setLightmapSizeHintMethodBind, this.rawMemory, size)
    }


    private val getLightmapSizeHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "get_lightmap_size_hint") }
    open fun getLightmapSizeHint(): Vector2 {
        return _icall_Vector2(getLightmapSizeHintMethodBind, this.rawMemory)
    }


    private val createTrimeshShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "create_trimesh_shape") }
    open fun createTrimeshShape(): Shape {
        return _icall_Shape(createTrimeshShapeMethodBind, this.rawMemory)
    }


    private val createConvexShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "create_convex_shape") }
    open fun createConvexShape(): Shape {
        return _icall_Shape(createConvexShapeMethodBind, this.rawMemory)
    }


    private val createOutlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "create_outline") }
    open fun createOutline(margin: Double): Mesh {
        return _icall_Mesh_Double(createOutlineMethodBind, this.rawMemory, margin)
    }


    private val getFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "get_faces") }
    open fun getFaces(): PoolVector3Array {
        return _icall_PoolVector3Array(getFacesMethodBind, this.rawMemory)
    }


    private val generateTriangleMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("Mesh", "generate_triangle_mesh") }
    open fun generateTriangleMesh(): TriangleMesh {
        return _icall_TriangleMesh(generateTriangleMeshMethodBind, this.rawMemory)
    }


}
