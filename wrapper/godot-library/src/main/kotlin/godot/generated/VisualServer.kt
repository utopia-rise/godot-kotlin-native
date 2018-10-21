@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ReflectionProbeUpdateMode(val id: Long) {
        REFLECTION_PROBE_UPDATE_ONCE(0),
        REFLECTION_PROBE_UPDATE_ALWAYS(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LightDirectionalShadowDepthRangeMode(val id: Long) {
        LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),
        LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
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
        PRIMITIVE_MAX(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EnvironmentSSAOQuality(val id: Long) {
        ENV_SSAO_QUALITY_LOW(0),
        ENV_SSAO_QUALITY_MEDIUM(1),
        ENV_SSAO_QUALITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EnvironmentDOFBlurQuality(val id: Long) {
        ENV_DOF_BLUR_QUALITY_LOW(0),
        ENV_DOF_BLUR_QUALITY_MEDIUM(1),
        ENV_DOF_BLUR_QUALITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class RenderInfo(val id: Long) {
        INFO_OBJECTS_IN_FRAME(0),
        INFO_VERTICES_IN_FRAME(1),
        INFO_MATERIAL_CHANGES_IN_FRAME(2),
        INFO_SHADER_CHANGES_IN_FRAME(3),
        INFO_SURFACE_CHANGES_IN_FRAME(4),
        INFO_DRAW_CALLS_IN_FRAME(5),
        INFO_USAGE_VIDEO_MEM_TOTAL(6),
        INFO_VIDEO_MEM_USED(7),
        INFO_TEXTURE_MEM_USED(8),
        INFO_VERTEX_MEM_USED(9),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class NinePatchAxisMode(val id: Long) {
        NINE_PATCH_STRETCH(0),
        NINE_PATCH_TILE(1),
        NINE_PATCH_TILE_FIT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ViewportRenderInfo(val id: Long) {
        VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),
        VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),
        VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),
        VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),
        VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),
        VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),
        VIEWPORT_RENDER_INFO_MAX(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ViewportClearMode(val id: Long) {
        VIEWPORT_CLEAR_ALWAYS(0),
        VIEWPORT_CLEAR_NEVER(1),
        VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LightOmniShadowDetail(val id: Long) {
        LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),
        LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShaderMode(val id: Long) {
        SHADER_SPATIAL(0),
        SHADER_CANVAS_ITEM(1),
        SHADER_PARTICLES(2),
        SHADER_MAX(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class MultimeshTransformFormat(val id: Long) {
        MULTIMESH_TRANSFORM_2D(0),
        MULTIMESH_TRANSFORM_3D(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShadowCastingSetting(val id: Long) {
        SHADOW_CASTING_SETTING_OFF(0),
        SHADOW_CASTING_SETTING_ON(1),
        SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
        SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ViewportDebugDraw(val id: Long) {
        VIEWPORT_DEBUG_DRAW_DISABLED(0),
        VIEWPORT_DEBUG_DRAW_UNSHADED(1),
        VIEWPORT_DEBUG_DRAW_OVERDRAW(2),
        VIEWPORT_DEBUG_DRAW_WIREFRAME(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ViewportUsage(val id: Long) {
        VIEWPORT_USAGE_2D(0),
        VIEWPORT_USAGE_2D_NO_SAMPLING(1),
        VIEWPORT_USAGE_3D(2),
        VIEWPORT_USAGE_3D_NO_EFFECTS(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EnvironmentBG(val id: Long) {
        ENV_BG_CLEAR_COLOR(0),
        ENV_BG_COLOR(1),
        ENV_BG_SKY(2),
        ENV_BG_COLOR_SKY(3),
        ENV_BG_CANVAS(4),
        ENV_BG_KEEP(5),
        ENV_BG_MAX(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LightOmniShadowMode(val id: Long) {
        LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),
        LIGHT_OMNI_SHADOW_CUBE(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class TextureFlags(val id: Long) {
        TEXTURE_FLAG_MIPMAPS(1),
        TEXTURE_FLAG_REPEAT(2),
        TEXTURE_FLAG_FILTER(4),
        TEXTURE_FLAGS_DEFAULT(7),
        TEXTURE_FLAG_ANISOTROPIC_FILTER(8),
        TEXTURE_FLAG_CONVERT_TO_LINEAR(16),
        TEXTURE_FLAG_MIRRORED_REPEAT(32),
        TEXTURE_FLAG_CUBEMAP(2048),
        TEXTURE_FLAG_USED_FOR_STREAMING(4096),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Features(val id: Long) {
        FEATURE_SHADERS(0),
        FEATURE_MULTITHREADED(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class InstanceType(val id: Long) {
        INSTANCE_NONE(0),
        INSTANCE_MESH(1),
        INSTANCE_MULTIMESH(2),
        INSTANCE_IMMEDIATE(3),
        INSTANCE_PARTICLES(4),
        INSTANCE_LIGHT(5),
        INSTANCE_REFLECTION_PROBE(6),
        INSTANCE_GI_PROBE(7),
        INSTANCE_LIGHTMAP_CAPTURE(8),
        INSTANCE_MAX(9),
        INSTANCE_GEOMETRY_MASK(30),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EnvironmentSSAOBlur(val id: Long) {
        ENV_SSAO_BLUR_DISABLED(0),
        ENV_SSAO_BLUR_1x1(1),
        ENV_SSAO_BLUR_2x2(2),
        ENV_SSAO_BLUR_3x3(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EnvironmentToneMapper(val id: Long) {
        ENV_TONE_MAPPER_LINEAR(0),
        ENV_TONE_MAPPER_REINHARDT(1),
        ENV_TONE_MAPPER_FILMIC(2),
        ENV_TONE_MAPPER_ACES(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EnvironmentGlowBlendMode(val id: Long) {
        GLOW_BLEND_MODE_ADDITIVE(0),
        GLOW_BLEND_MODE_SCREEN(1),
        GLOW_BLEND_MODE_SOFTLIGHT(2),
        GLOW_BLEND_MODE_REPLACE(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class MultimeshColorFormat(val id: Long) {
        MULTIMESH_COLOR_NONE(0),
        MULTIMESH_COLOR_8BIT(1),
        MULTIMESH_COLOR_FLOAT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CanvasLightShadowFilter(val id: Long) {
        CANVAS_LIGHT_FILTER_NONE(0),
        CANVAS_LIGHT_FILTER_PCF3(1),
        CANVAS_LIGHT_FILTER_PCF5(2),
        CANVAS_LIGHT_FILTER_PCF7(3),
        CANVAS_LIGHT_FILTER_PCF9(4),
        CANVAS_LIGHT_FILTER_PCF13(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ScenarioDebugMode(val id: Long) {
        SCENARIO_DEBUG_DISABLED(0),
        SCENARIO_DEBUG_WIREFRAME(1),
        SCENARIO_DEBUG_OVERDRAW(2),
        SCENARIO_DEBUG_SHADELESS(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ViewportUpdateMode(val id: Long) {
        VIEWPORT_UPDATE_DISABLED(0),
        VIEWPORT_UPDATE_ONCE(1),
        VIEWPORT_UPDATE_WHEN_VISIBLE(2),
        VIEWPORT_UPDATE_ALWAYS(3),
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
    enum class ParticlesDrawOrder(val id: Long) {
        PARTICLES_DRAW_ORDER_INDEX(0),
        PARTICLES_DRAW_ORDER_LIFETIME(1),
        PARTICLES_DRAW_ORDER_VIEW_DEPTH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CanvasLightMode(val id: Long) {
        CANVAS_LIGHT_MODE_ADD(0),
        CANVAS_LIGHT_MODE_SUB(1),
        CANVAS_LIGHT_MODE_MIX(2),
        CANVAS_LIGHT_MODE_MASK(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LightDirectionalShadowMode(val id: Long) {
        LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),
        LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),
        LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LightParam(val id: Long) {
        LIGHT_PARAM_ENERGY(0),
        LIGHT_PARAM_SPECULAR(2),
        LIGHT_PARAM_RANGE(3),
        LIGHT_PARAM_ATTENUATION(4),
        LIGHT_PARAM_SPOT_ANGLE(5),
        LIGHT_PARAM_SPOT_ATTENUATION(6),
        LIGHT_PARAM_CONTACT_SHADOW_SIZE(7),
        LIGHT_PARAM_SHADOW_MAX_DISTANCE(8),
        LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(9),
        LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(10),
        LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(11),
        LIGHT_PARAM_SHADOW_NORMAL_BIAS(12),
        LIGHT_PARAM_SHADOW_BIAS(13),
        LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE(14),
        LIGHT_PARAM_MAX(15),
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
    enum class CanvasOccluderPolygonCullMode(val id: Long) {
        CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),
        CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),
        CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class InstanceFlags(val id: Long) {
        INSTANCE_FLAG_USE_BAKED_LIGHT(0),
        INSTANCE_FLAG_MAX(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ViewportMSAA(val id: Long) {
        VIEWPORT_MSAA_DISABLED(0),
        VIEWPORT_MSAA_2X(1),
        VIEWPORT_MSAA_4X(2),
        VIEWPORT_MSAA_8X(3),
        VIEWPORT_MSAA_16X(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class LightType(val id: Long) {
        LIGHT_DIRECTIONAL(0),
        LIGHT_OMNI(1),
        LIGHT_SPOT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CubeMapSide(val id: Long) {
        CUBEMAP_LEFT(0),
        CUBEMAP_RIGHT(1),
        CUBEMAP_BOTTOM(2),
        CUBEMAP_TOP(3),
        CUBEMAP_FRONT(4),
        CUBEMAP_BACK(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val FRAME_POST_DRAW: String = "frame_post_draw"
            const val FRAME_PRE_DRAW: String = "frame_pre_draw"
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): VisualServer = VisualServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualServer = fromVariant(VisualServer(""), other)


        // Constants
        const val NO_INDEX_ARRAY: Long = -1
        const val ARRAY_WEIGHTS_SIZE: Long = 4
        const val CANVAS_ITEM_Z_MIN: Long = -4096
        const val CANVAS_ITEM_Z_MAX: Long = 4096
        const val MAX_GLOW_LEVELS: Long = 7
        const val MAX_CURSORS: Long = 8
        const val MATERIAL_RENDER_PRIORITY_MIN: Long = -128
        const val MATERIAL_RENDER_PRIORITY_MAX: Long = 127
        const val CUBEMAP_LEFT: Long = 0
        const val CUBEMAP_RIGHT: Long = 1
        const val CUBEMAP_BOTTOM: Long = 2
        const val CUBEMAP_TOP: Long = 3
        const val CUBEMAP_FRONT: Long = 4
        const val CUBEMAP_BACK: Long = 5
        const val TEXTURE_FLAG_MIPMAPS: Long = 1
        const val TEXTURE_FLAG_REPEAT: Long = 2
        const val TEXTURE_FLAG_FILTER: Long = 4
        const val TEXTURE_FLAG_ANISOTROPIC_FILTER: Long = 8
        const val TEXTURE_FLAG_CONVERT_TO_LINEAR: Long = 16
        const val TEXTURE_FLAG_MIRRORED_REPEAT: Long = 32
        const val TEXTURE_FLAG_CUBEMAP: Long = 2048
        const val TEXTURE_FLAG_USED_FOR_STREAMING: Long = 4096
        const val TEXTURE_FLAGS_DEFAULT: Long = 7
        const val SHADER_SPATIAL: Long = 0
        const val SHADER_CANVAS_ITEM: Long = 1
        const val SHADER_PARTICLES: Long = 2
        const val SHADER_MAX: Long = 3
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
        const val ARRAY_FORMAT_VERTEX: Long = 1
        const val ARRAY_FORMAT_NORMAL: Long = 2
        const val ARRAY_FORMAT_TANGENT: Long = 4
        const val ARRAY_FORMAT_COLOR: Long = 8
        const val ARRAY_FORMAT_TEX_UV: Long = 16
        const val ARRAY_FORMAT_TEX_UV2: Long = 32
        const val ARRAY_FORMAT_BONES: Long = 64
        const val ARRAY_FORMAT_WEIGHTS: Long = 128
        const val ARRAY_FORMAT_INDEX: Long = 256
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
        const val PRIMITIVE_POINTS: Long = 0
        const val PRIMITIVE_LINES: Long = 1
        const val PRIMITIVE_LINE_STRIP: Long = 2
        const val PRIMITIVE_LINE_LOOP: Long = 3
        const val PRIMITIVE_TRIANGLES: Long = 4
        const val PRIMITIVE_TRIANGLE_STRIP: Long = 5
        const val PRIMITIVE_TRIANGLE_FAN: Long = 6
        const val PRIMITIVE_MAX: Long = 7
        const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0
        const val BLEND_SHAPE_MODE_RELATIVE: Long = 1
        const val LIGHT_DIRECTIONAL: Long = 0
        const val LIGHT_OMNI: Long = 1
        const val LIGHT_SPOT: Long = 2
        const val LIGHT_PARAM_ENERGY: Long = 0
        const val LIGHT_PARAM_SPECULAR: Long = 2
        const val LIGHT_PARAM_RANGE: Long = 3
        const val LIGHT_PARAM_ATTENUATION: Long = 4
        const val LIGHT_PARAM_SPOT_ANGLE: Long = 5
        const val LIGHT_PARAM_SPOT_ATTENUATION: Long = 6
        const val LIGHT_PARAM_CONTACT_SHADOW_SIZE: Long = 7
        const val LIGHT_PARAM_SHADOW_MAX_DISTANCE: Long = 8
        const val LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET: Long = 9
        const val LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET: Long = 10
        const val LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET: Long = 11
        const val LIGHT_PARAM_SHADOW_NORMAL_BIAS: Long = 12
        const val LIGHT_PARAM_SHADOW_BIAS: Long = 13
        const val LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE: Long = 14
        const val LIGHT_PARAM_MAX: Long = 15
        const val LIGHT_OMNI_SHADOW_DUAL_PARABOLOID: Long = 0
        const val LIGHT_OMNI_SHADOW_CUBE: Long = 1
        const val LIGHT_OMNI_SHADOW_DETAIL_VERTICAL: Long = 0
        const val LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL: Long = 1
        const val LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL: Long = 0
        const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS: Long = 1
        const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS: Long = 2
        const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE: Long = 0
        const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED: Long = 1
        const val VIEWPORT_UPDATE_DISABLED: Long = 0
        const val VIEWPORT_UPDATE_ONCE: Long = 1
        const val VIEWPORT_UPDATE_WHEN_VISIBLE: Long = 2
        const val VIEWPORT_UPDATE_ALWAYS: Long = 3
        const val VIEWPORT_CLEAR_ALWAYS: Long = 0
        const val VIEWPORT_CLEAR_NEVER: Long = 1
        const val VIEWPORT_CLEAR_ONLY_NEXT_FRAME: Long = 2
        const val VIEWPORT_MSAA_DISABLED: Long = 0
        const val VIEWPORT_MSAA_2X: Long = 1
        const val VIEWPORT_MSAA_4X: Long = 2
        const val VIEWPORT_MSAA_8X: Long = 3
        const val VIEWPORT_MSAA_16X: Long = 4
        const val VIEWPORT_USAGE_2D: Long = 0
        const val VIEWPORT_USAGE_2D_NO_SAMPLING: Long = 1
        const val VIEWPORT_USAGE_3D: Long = 2
        const val VIEWPORT_USAGE_3D_NO_EFFECTS: Long = 3
        const val VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME: Long = 0
        const val VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME: Long = 1
        const val VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2
        const val VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3
        const val VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4
        const val VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5
        const val VIEWPORT_RENDER_INFO_MAX: Long = 6
        const val VIEWPORT_DEBUG_DRAW_DISABLED: Long = 0
        const val VIEWPORT_DEBUG_DRAW_UNSHADED: Long = 1
        const val VIEWPORT_DEBUG_DRAW_OVERDRAW: Long = 2
        const val VIEWPORT_DEBUG_DRAW_WIREFRAME: Long = 3
        const val SCENARIO_DEBUG_DISABLED: Long = 0
        const val SCENARIO_DEBUG_WIREFRAME: Long = 1
        const val SCENARIO_DEBUG_OVERDRAW: Long = 2
        const val SCENARIO_DEBUG_SHADELESS: Long = 3
        const val INSTANCE_NONE: Long = 0
        const val INSTANCE_MESH: Long = 1
        const val INSTANCE_MULTIMESH: Long = 2
        const val INSTANCE_IMMEDIATE: Long = 3
        const val INSTANCE_PARTICLES: Long = 4
        const val INSTANCE_LIGHT: Long = 5
        const val INSTANCE_REFLECTION_PROBE: Long = 6
        const val INSTANCE_GI_PROBE: Long = 7
        const val INSTANCE_LIGHTMAP_CAPTURE: Long = 8
        const val INSTANCE_MAX: Long = 9
        const val INSTANCE_GEOMETRY_MASK: Long = 30
        const val INSTANCE_FLAG_USE_BAKED_LIGHT: Long = 0
        const val INSTANCE_FLAG_MAX: Long = 1
        const val SHADOW_CASTING_SETTING_OFF: Long = 0
        const val SHADOW_CASTING_SETTING_ON: Long = 1
        const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2
        const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3
        const val NINE_PATCH_STRETCH: Long = 0
        const val NINE_PATCH_TILE: Long = 1
        const val NINE_PATCH_TILE_FIT: Long = 2
        const val CANVAS_LIGHT_MODE_ADD: Long = 0
        const val CANVAS_LIGHT_MODE_SUB: Long = 1
        const val CANVAS_LIGHT_MODE_MIX: Long = 2
        const val CANVAS_LIGHT_MODE_MASK: Long = 3
        const val CANVAS_LIGHT_FILTER_NONE: Long = 0
        const val CANVAS_LIGHT_FILTER_PCF3: Long = 1
        const val CANVAS_LIGHT_FILTER_PCF5: Long = 2
        const val CANVAS_LIGHT_FILTER_PCF7: Long = 3
        const val CANVAS_LIGHT_FILTER_PCF9: Long = 4
        const val CANVAS_LIGHT_FILTER_PCF13: Long = 5
        const val CANVAS_OCCLUDER_POLYGON_CULL_DISABLED: Long = 0
        const val CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE: Long = 1
        const val CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE: Long = 2
        const val INFO_OBJECTS_IN_FRAME: Long = 0
        const val INFO_VERTICES_IN_FRAME: Long = 1
        const val INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2
        const val INFO_SHADER_CHANGES_IN_FRAME: Long = 3
        const val INFO_SURFACE_CHANGES_IN_FRAME: Long = 4
        const val INFO_DRAW_CALLS_IN_FRAME: Long = 5
        const val INFO_USAGE_VIDEO_MEM_TOTAL: Long = 6
        const val INFO_VIDEO_MEM_USED: Long = 7
        const val INFO_TEXTURE_MEM_USED: Long = 8
        const val INFO_VERTEX_MEM_USED: Long = 9
        const val FEATURE_SHADERS: Long = 0
        const val FEATURE_MULTITHREADED: Long = 1
        const val MULTIMESH_TRANSFORM_2D: Long = 0
        const val MULTIMESH_TRANSFORM_3D: Long = 1
        const val MULTIMESH_COLOR_NONE: Long = 0
        const val MULTIMESH_COLOR_8BIT: Long = 1
        const val MULTIMESH_COLOR_FLOAT: Long = 2
        const val REFLECTION_PROBE_UPDATE_ONCE: Long = 0
        const val REFLECTION_PROBE_UPDATE_ALWAYS: Long = 1
        const val PARTICLES_DRAW_ORDER_INDEX: Long = 0
        const val PARTICLES_DRAW_ORDER_LIFETIME: Long = 1
        const val PARTICLES_DRAW_ORDER_VIEW_DEPTH: Long = 2
        const val ENV_BG_CLEAR_COLOR: Long = 0
        const val ENV_BG_COLOR: Long = 1
        const val ENV_BG_SKY: Long = 2
        const val ENV_BG_COLOR_SKY: Long = 3
        const val ENV_BG_CANVAS: Long = 4
        const val ENV_BG_KEEP: Long = 5
        const val ENV_BG_MAX: Long = 6
        const val ENV_DOF_BLUR_QUALITY_LOW: Long = 0
        const val ENV_DOF_BLUR_QUALITY_MEDIUM: Long = 1
        const val ENV_DOF_BLUR_QUALITY_HIGH: Long = 2
        const val GLOW_BLEND_MODE_ADDITIVE: Long = 0
        const val GLOW_BLEND_MODE_SCREEN: Long = 1
        const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2
        const val GLOW_BLEND_MODE_REPLACE: Long = 3
        const val ENV_TONE_MAPPER_LINEAR: Long = 0
        const val ENV_TONE_MAPPER_REINHARDT: Long = 1
        const val ENV_TONE_MAPPER_FILMIC: Long = 2
        const val ENV_TONE_MAPPER_ACES: Long = 3
        const val ENV_SSAO_QUALITY_LOW: Long = 0
        const val ENV_SSAO_QUALITY_MEDIUM: Long = 1
        const val ENV_SSAO_QUALITY_HIGH: Long = 2
        const val ENV_SSAO_BLUR_DISABLED: Long = 0
        const val ENV_SSAO_BLUR_1x1: Long = 1
        const val ENV_SSAO_BLUR_2x2: Long = 2
        const val ENV_SSAO_BLUR_3x3: Long = 3


        private val rawMemory: COpaquePointer by lazy { getSingleton("VisualServer", "VisualServer") }


        // Properties


        // Methods
        private val forceSyncMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "force_sync") }
        fun forceSync() {
            _icall_Unit(forceSyncMethodBind, this.rawMemory)
        }


        private val forceDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "force_draw") }
        fun forceDraw(swapBuffers: Boolean = true) {
            _icall_Unit_Boolean(forceDrawMethodBind, this.rawMemory, swapBuffers)
        }


        private val syncMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "sync") }
        fun sync() {
            _icall_Unit(syncMethodBind, this.rawMemory)
        }


        private val drawMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "draw") }
        fun draw(swapBuffers: Boolean = true) {
            _icall_Unit_Boolean(drawMethodBind, this.rawMemory, swapBuffers)
        }


        private val textureCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_create") }
        fun textureCreate(): RID {
            return _icall_RID(textureCreateMethodBind, this.rawMemory)
        }


        private val textureCreateFromImageMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_create_from_image") }
        fun textureCreateFromImage(image: Image, flags: Long = 7): RID {
            return _icall_RID_Object_Long(textureCreateFromImageMethodBind, this.rawMemory, image, flags)
        }


        private val textureAllocateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_allocate") }
        fun textureAllocate(texture: RID, width: Long, height: Long, format: Long, flags: Long = 7) {
            _icall_Unit_RID_Long_Long_Long_Long(textureAllocateMethodBind, this.rawMemory, texture, width, height, format, flags)
        }


        private val textureSetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_data") }
        fun textureSetData(texture: RID, image: Image, cubeSide: Long = 0) {
            _icall_Unit_RID_Object_Long(textureSetDataMethodBind, this.rawMemory, texture, image, cubeSide)
        }


        private val textureSetDataPartialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_data_partial") }
        fun textureSetDataPartial(texture: RID, image: Image, srcX: Long, srcY: Long, srcW: Long, srcH: Long, dstX: Long, dstY: Long, dstMip: Long, cubeSide: Long = 0) {
            _icall_Unit_RID_Object_Long_Long_Long_Long_Long_Long_Long_Long(textureSetDataPartialMethodBind, this.rawMemory, texture, image, srcX, srcY, srcW, srcH, dstX, dstY, dstMip, cubeSide)
        }


        private val textureGetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_data") }
        fun textureGetData(texture: RID, cubeSide: Long = 0): Image {
            return _icall_Image_RID_Long(textureGetDataMethodBind, this.rawMemory, texture, cubeSide)
        }


        private val textureSetFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_flags") }
        fun textureSetFlags(texture: RID, flags: Long) {
            _icall_Unit_RID_Long(textureSetFlagsMethodBind, this.rawMemory, texture, flags)
        }


        private val textureGetFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_flags") }
        fun textureGetFlags(texture: RID): Long {
            return _icall_Long_RID(textureGetFlagsMethodBind, this.rawMemory, texture)
        }


        private val textureGetFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_format") }
        fun textureGetFormat(texture: RID): Image.Format {
            return Image.Format.fromInt(_icall_Long_RID(textureGetFormatMethodBind, this.rawMemory, texture))
        }


        private val textureGetTexidMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_texid") }
        fun textureGetTexid(texture: RID): Long {
            return _icall_Long_RID(textureGetTexidMethodBind, this.rawMemory, texture)
        }


        private val textureGetWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_width") }
        fun textureGetWidth(texture: RID): Long {
            return _icall_Long_RID(textureGetWidthMethodBind, this.rawMemory, texture)
        }


        private val textureGetHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_height") }
        fun textureGetHeight(texture: RID): Long {
            return _icall_Long_RID(textureGetHeightMethodBind, this.rawMemory, texture)
        }


        private val textureSetSizeOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_size_override") }
        fun textureSetSizeOverride(texture: RID, width: Long, height: Long) {
            _icall_Unit_RID_Long_Long(textureSetSizeOverrideMethodBind, this.rawMemory, texture, width, height)
        }


        private val textureSetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_path") }
        fun textureSetPath(texture: RID, path: String) {
            _icall_Unit_RID_String(textureSetPathMethodBind, this.rawMemory, texture, path)
        }


        private val textureGetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_path") }
        fun textureGetPath(texture: RID): String {
            return _icall_String_RID(textureGetPathMethodBind, this.rawMemory, texture)
        }


        private val textureSetShrinkAllX2OnSetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_shrink_all_x2_on_set_data") }
        fun textureSetShrinkAllX2OnSetData(shrink: Boolean) {
            _icall_Unit_Boolean(textureSetShrinkAllX2OnSetDataMethodBind, this.rawMemory, shrink)
        }


        private val textureDebugUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_debug_usage") }
        fun textureDebugUsage(): GDArray {
            return _icall_GDArray(textureDebugUsageMethodBind, this.rawMemory)
        }


        private val texturesKeepOriginalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "textures_keep_original") }
        fun texturesKeepOriginal(enable: Boolean) {
            _icall_Unit_Boolean(texturesKeepOriginalMethodBind, this.rawMemory, enable)
        }


        private val skyCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "sky_create") }
        fun skyCreate(): RID {
            return _icall_RID(skyCreateMethodBind, this.rawMemory)
        }


        private val skySetTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "sky_set_texture") }
        fun skySetTexture(sky: RID, cubeMap: RID, radianceSize: Long) {
            _icall_Unit_RID_RID_Long(skySetTextureMethodBind, this.rawMemory, sky, cubeMap, radianceSize)
        }


        private val shaderCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "shader_create") }
        fun shaderCreate(): RID {
            return _icall_RID(shaderCreateMethodBind, this.rawMemory)
        }


        private val shaderSetCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "shader_set_code") }
        fun shaderSetCode(shader: RID, code: String) {
            _icall_Unit_RID_String(shaderSetCodeMethodBind, this.rawMemory, shader, code)
        }


        private val shaderGetCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "shader_get_code") }
        fun shaderGetCode(shader: RID): String {
            return _icall_String_RID(shaderGetCodeMethodBind, this.rawMemory, shader)
        }


        private val shaderGetParamListMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "shader_get_param_list") }
        fun shaderGetParamList(shader: RID): GDArray {
            return _icall_GDArray_RID(shaderGetParamListMethodBind, this.rawMemory, shader)
        }


        private val shaderSetDefaultTextureParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "shader_set_default_texture_param") }
        fun shaderSetDefaultTextureParam(shader: RID, name: String, texture: RID) {
            _icall_Unit_RID_String_RID(shaderSetDefaultTextureParamMethodBind, this.rawMemory, shader, name, texture)
        }


        private val shaderGetDefaultTextureParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "shader_get_default_texture_param") }
        fun shaderGetDefaultTextureParam(shader: RID, name: String): RID {
            return _icall_RID_RID_String(shaderGetDefaultTextureParamMethodBind, this.rawMemory, shader, name)
        }


        private val materialCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_create") }
        fun materialCreate(): RID {
            return _icall_RID(materialCreateMethodBind, this.rawMemory)
        }


        private val materialSetShaderMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_set_shader") }
        fun materialSetShader(shaderMaterial: RID, shader: RID) {
            _icall_Unit_RID_RID(materialSetShaderMethodBind, this.rawMemory, shaderMaterial, shader)
        }


        private val materialGetShaderMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_get_shader") }
        fun materialGetShader(shaderMaterial: RID): RID {
            return _icall_RID_RID(materialGetShaderMethodBind, this.rawMemory, shaderMaterial)
        }


        private val materialSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_set_param") }
        fun materialSetParam(material: RID, parameter: String, value: Variant) {
            _icall_Unit_RID_String_Variant(materialSetParamMethodBind, this.rawMemory, material, parameter, value)
        }


        private val materialGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_get_param") }
        fun materialGetParam(material: RID, parameter: String): Variant {
            return _icall_Variant_RID_String(materialGetParamMethodBind, this.rawMemory, material, parameter)
        }


        private val materialSetRenderPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_set_render_priority") }
        fun materialSetRenderPriority(material: RID, priority: Long) {
            _icall_Unit_RID_Long(materialSetRenderPriorityMethodBind, this.rawMemory, material, priority)
        }


        private val materialSetLineWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_set_line_width") }
        fun materialSetLineWidth(material: RID, width: Double) {
            _icall_Unit_RID_Double(materialSetLineWidthMethodBind, this.rawMemory, material, width)
        }


        private val materialSetNextPassMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_set_next_pass") }
        fun materialSetNextPass(material: RID, nextMaterial: RID) {
            _icall_Unit_RID_RID(materialSetNextPassMethodBind, this.rawMemory, material, nextMaterial)
        }


        private val meshCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_create") }
        fun meshCreate(): RID {
            return _icall_RID(meshCreateMethodBind, this.rawMemory)
        }


        private val meshAddSurfaceFromArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_add_surface_from_arrays") }
        fun meshAddSurfaceFromArrays(mesh: RID, primtive: Long, arrays: GDArray, blendShapes: GDArray = GDArray(), compressFormat: Long = 97280) {
            _icall_Unit_RID_Long_GDArray_GDArray_Long(meshAddSurfaceFromArraysMethodBind, this.rawMemory, mesh, primtive, arrays, blendShapes, compressFormat)
        }


        private val meshSetBlendShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_set_blend_shape_count") }
        fun meshSetBlendShapeCount(mesh: RID, amount: Long) {
            _icall_Unit_RID_Long(meshSetBlendShapeCountMethodBind, this.rawMemory, mesh, amount)
        }


        private val meshGetBlendShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_blend_shape_count") }
        fun meshGetBlendShapeCount(mesh: RID): Long {
            return _icall_Long_RID(meshGetBlendShapeCountMethodBind, this.rawMemory, mesh)
        }


        private val meshSetBlendShapeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_set_blend_shape_mode") }
        fun meshSetBlendShapeMode(mesh: RID, mode: Long) {
            _icall_Unit_RID_Long(meshSetBlendShapeModeMethodBind, this.rawMemory, mesh, mode)
        }


        private val meshGetBlendShapeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_blend_shape_mode") }
        fun meshGetBlendShapeMode(mesh: RID): VisualServer.BlendShapeMode {
            return VisualServer.BlendShapeMode.fromInt(_icall_Long_RID(meshGetBlendShapeModeMethodBind, this.rawMemory, mesh))
        }


        private val meshSurfaceSetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_set_material") }
        fun meshSurfaceSetMaterial(mesh: RID, surface: Long, material: RID) {
            _icall_Unit_RID_Long_RID(meshSurfaceSetMaterialMethodBind, this.rawMemory, mesh, surface, material)
        }


        private val meshSurfaceGetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_material") }
        fun meshSurfaceGetMaterial(mesh: RID, surface: Long): RID {
            return _icall_RID_RID_Long(meshSurfaceGetMaterialMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArrayLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_array_len") }
        fun meshSurfaceGetArrayLen(mesh: RID, surface: Long): Long {
            return _icall_Long_RID_Long(meshSurfaceGetArrayLenMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArrayIndexLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_array_index_len") }
        fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Long): Long {
            return _icall_Long_RID_Long(meshSurfaceGetArrayIndexLenMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_array") }
        fun meshSurfaceGetArray(mesh: RID, surface: Long): PoolByteArray {
            return _icall_PoolByteArray_RID_Long(meshSurfaceGetArrayMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetIndexArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_index_array") }
        fun meshSurfaceGetIndexArray(mesh: RID, surface: Long): PoolByteArray {
            return _icall_PoolByteArray_RID_Long(meshSurfaceGetIndexArrayMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_arrays") }
        fun meshSurfaceGetArrays(mesh: RID, surface: Long): GDArray {
            return _icall_GDArray_RID_Long(meshSurfaceGetArraysMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetBlendShapeArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_blend_shape_arrays") }
        fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Long): GDArray {
            return _icall_GDArray_RID_Long(meshSurfaceGetBlendShapeArraysMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_format") }
        fun meshSurfaceGetFormat(mesh: RID, surface: Long): Long {
            return _icall_Long_RID_Long(meshSurfaceGetFormatMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetPrimitiveTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_primitive_type") }
        fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Long): VisualServer.PrimitiveType {
            return VisualServer.PrimitiveType.fromInt(_icall_Long_RID_Long(meshSurfaceGetPrimitiveTypeMethodBind, this.rawMemory, mesh, surface))
        }


        private val meshSurfaceGetAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_aabb") }
        fun meshSurfaceGetAabb(mesh: RID, surface: Long): AABB {
            return _icall_AABB_RID_Long(meshSurfaceGetAabbMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetSkeletonAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_skeleton_aabb") }
        fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Long): GDArray {
            return _icall_GDArray_RID_Long(meshSurfaceGetSkeletonAabbMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshRemoveSurfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_remove_surface") }
        fun meshRemoveSurface(mesh: RID, index: Long) {
            _icall_Unit_RID_Long(meshRemoveSurfaceMethodBind, this.rawMemory, mesh, index)
        }


        private val meshGetSurfaceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_surface_count") }
        fun meshGetSurfaceCount(mesh: RID): Long {
            return _icall_Long_RID(meshGetSurfaceCountMethodBind, this.rawMemory, mesh)
        }


        private val meshSetCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_set_custom_aabb") }
        fun meshSetCustomAabb(mesh: RID, aabb: AABB) {
            _icall_Unit_RID_AABB(meshSetCustomAabbMethodBind, this.rawMemory, mesh, aabb)
        }


        private val meshGetCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_custom_aabb") }
        fun meshGetCustomAabb(mesh: RID): AABB {
            return _icall_AABB_RID(meshGetCustomAabbMethodBind, this.rawMemory, mesh)
        }


        private val meshClearMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_clear") }
        fun meshClear(mesh: RID) {
            _icall_Unit_RID(meshClearMethodBind, this.rawMemory, mesh)
        }


        private val multimeshAllocateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_allocate") }
        fun multimeshAllocate(multimesh: RID, instances: Long, transformFormat: Long, colorFormat: Long, customDataFormat: Long = 0) {
            _icall_Unit_RID_Long_Long_Long_Long(multimeshAllocateMethodBind, this.rawMemory, multimesh, instances, transformFormat, colorFormat, customDataFormat)
        }


        private val multimeshGetInstanceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_get_instance_count") }
        fun multimeshGetInstanceCount(multimesh: RID): Long {
            return _icall_Long_RID(multimeshGetInstanceCountMethodBind, this.rawMemory, multimesh)
        }


        private val multimeshSetMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_set_mesh") }
        fun multimeshSetMesh(multimesh: RID, mesh: RID) {
            _icall_Unit_RID_RID(multimeshSetMeshMethodBind, this.rawMemory, multimesh, mesh)
        }


        private val multimeshInstanceSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_transform") }
        fun multimeshInstanceSetTransform(multimesh: RID, index: Long, transform: Transform) {
            _icall_Unit_RID_Long_Transform(multimeshInstanceSetTransformMethodBind, this.rawMemory, multimesh, index, transform)
        }


        private val multimeshInstanceSetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_transform_2d") }
        fun multimeshInstanceSetTransform2d(multimesh: RID, index: Long, transform: Transform2D) {
            _icall_Unit_RID_Long_Transform2D(multimeshInstanceSetTransform2dMethodBind, this.rawMemory, multimesh, index, transform)
        }


        private val multimeshInstanceSetColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_color") }
        fun multimeshInstanceSetColor(multimesh: RID, index: Long, color: Color) {
            _icall_Unit_RID_Long_Color(multimeshInstanceSetColorMethodBind, this.rawMemory, multimesh, index, color)
        }


        private val multimeshInstanceSetCustomDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_custom_data") }
        fun multimeshInstanceSetCustomData(multimesh: RID, index: Long, customData: Color) {
            _icall_Unit_RID_Long_Color(multimeshInstanceSetCustomDataMethodBind, this.rawMemory, multimesh, index, customData)
        }


        private val multimeshGetMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_get_mesh") }
        fun multimeshGetMesh(multimesh: RID): RID {
            return _icall_RID_RID(multimeshGetMeshMethodBind, this.rawMemory, multimesh)
        }


        private val multimeshGetAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_get_aabb") }
        fun multimeshGetAabb(multimesh: RID): AABB {
            return _icall_AABB_RID(multimeshGetAabbMethodBind, this.rawMemory, multimesh)
        }


        private val multimeshInstanceGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_transform") }
        fun multimeshInstanceGetTransform(multimesh: RID, index: Long): Transform {
            return _icall_Transform_RID_Long(multimeshInstanceGetTransformMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshInstanceGetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_transform_2d") }
        fun multimeshInstanceGetTransform2d(multimesh: RID, index: Long): Transform2D {
            return _icall_Transform2D_RID_Long(multimeshInstanceGetTransform2dMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshInstanceGetColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_color") }
        fun multimeshInstanceGetColor(multimesh: RID, index: Long): Color {
            return _icall_Color_RID_Long(multimeshInstanceGetColorMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshInstanceGetCustomDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_custom_data") }
        fun multimeshInstanceGetCustomData(multimesh: RID, index: Long): Color {
            return _icall_Color_RID_Long(multimeshInstanceGetCustomDataMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshSetVisibleInstancesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_set_visible_instances") }
        fun multimeshSetVisibleInstances(multimesh: RID, visible: Long) {
            _icall_Unit_RID_Long(multimeshSetVisibleInstancesMethodBind, this.rawMemory, multimesh, visible)
        }


        private val multimeshGetVisibleInstancesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_get_visible_instances") }
        fun multimeshGetVisibleInstances(multimesh: RID): Long {
            return _icall_Long_RID(multimeshGetVisibleInstancesMethodBind, this.rawMemory, multimesh)
        }


        private val multimeshSetAsBulkArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_set_as_bulk_array") }
        fun multimeshSetAsBulkArray(multimesh: RID, array: PoolRealArray) {
            _icall_Unit_RID_PoolRealArray(multimeshSetAsBulkArrayMethodBind, this.rawMemory, multimesh, array)
        }


        private val immediateCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_create") }
        fun immediateCreate(): RID {
            return _icall_RID(immediateCreateMethodBind, this.rawMemory)
        }


        private val immediateBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_begin") }
        fun immediateBegin(immediate: RID, primitive: Long, texture: RID = RID()) {
            _icall_Unit_RID_Long_RID(immediateBeginMethodBind, this.rawMemory, immediate, primitive, texture)
        }


        private val immediateVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_vertex") }
        fun immediateVertex(immediate: RID, vertex: Vector3) {
            _icall_Unit_RID_Vector3(immediateVertexMethodBind, this.rawMemory, immediate, vertex)
        }


        private val immediateVertex2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_vertex_2d") }
        fun immediateVertex2d(immediate: RID, vertex: Vector2) {
            _icall_Unit_RID_Vector2(immediateVertex2dMethodBind, this.rawMemory, immediate, vertex)
        }


        private val immediateNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_normal") }
        fun immediateNormal(immediate: RID, normal: Vector3) {
            _icall_Unit_RID_Vector3(immediateNormalMethodBind, this.rawMemory, immediate, normal)
        }


        private val immediateTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_tangent") }
        fun immediateTangent(immediate: RID, tangent: Plane) {
            _icall_Unit_RID_Plane(immediateTangentMethodBind, this.rawMemory, immediate, tangent)
        }


        private val immediateColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_color") }
        fun immediateColor(immediate: RID, color: Color) {
            _icall_Unit_RID_Color(immediateColorMethodBind, this.rawMemory, immediate, color)
        }


        private val immediateUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_uv") }
        fun immediateUv(immediate: RID, texUv: Vector2) {
            _icall_Unit_RID_Vector2(immediateUvMethodBind, this.rawMemory, immediate, texUv)
        }


        private val immediateUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_uv2") }
        fun immediateUv2(immediate: RID, texUv: Vector2) {
            _icall_Unit_RID_Vector2(immediateUv2MethodBind, this.rawMemory, immediate, texUv)
        }


        private val immediateEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_end") }
        fun immediateEnd(immediate: RID) {
            _icall_Unit_RID(immediateEndMethodBind, this.rawMemory, immediate)
        }


        private val immediateClearMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_clear") }
        fun immediateClear(immediate: RID) {
            _icall_Unit_RID(immediateClearMethodBind, this.rawMemory, immediate)
        }


        private val immediateSetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_set_material") }
        fun immediateSetMaterial(immediate: RID, material: RID) {
            _icall_Unit_RID_RID(immediateSetMaterialMethodBind, this.rawMemory, immediate, material)
        }


        private val immediateGetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "immediate_get_material") }
        fun immediateGetMaterial(immediate: RID): RID {
            return _icall_RID_RID(immediateGetMaterialMethodBind, this.rawMemory, immediate)
        }


        private val skeletonCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_create") }
        fun skeletonCreate(): RID {
            return _icall_RID(skeletonCreateMethodBind, this.rawMemory)
        }


        private val skeletonAllocateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_allocate") }
        fun skeletonAllocate(skeleton: RID, bones: Long, is2dSkeleton: Boolean = false) {
            _icall_Unit_RID_Long_Boolean(skeletonAllocateMethodBind, this.rawMemory, skeleton, bones, is2dSkeleton)
        }


        private val skeletonGetBoneCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_get_bone_count") }
        fun skeletonGetBoneCount(skeleton: RID): Long {
            return _icall_Long_RID(skeletonGetBoneCountMethodBind, this.rawMemory, skeleton)
        }


        private val skeletonBoneSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_set_transform") }
        fun skeletonBoneSetTransform(skeleton: RID, bone: Long, transform: Transform) {
            _icall_Unit_RID_Long_Transform(skeletonBoneSetTransformMethodBind, this.rawMemory, skeleton, bone, transform)
        }


        private val skeletonBoneGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_get_transform") }
        fun skeletonBoneGetTransform(skeleton: RID, bone: Long): Transform {
            return _icall_Transform_RID_Long(skeletonBoneGetTransformMethodBind, this.rawMemory, skeleton, bone)
        }


        private val skeletonBoneSetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_set_transform_2d") }
        fun skeletonBoneSetTransform2d(skeleton: RID, bone: Long, transform: Transform2D) {
            _icall_Unit_RID_Long_Transform2D(skeletonBoneSetTransform2dMethodBind, this.rawMemory, skeleton, bone, transform)
        }


        private val skeletonBoneGetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_get_transform_2d") }
        fun skeletonBoneGetTransform2d(skeleton: RID, bone: Long): Transform2D {
            return _icall_Transform2D_RID_Long(skeletonBoneGetTransform2dMethodBind, this.rawMemory, skeleton, bone)
        }


        private val directionalLightCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "directional_light_create") }
        fun directionalLightCreate(): RID {
            return _icall_RID(directionalLightCreateMethodBind, this.rawMemory)
        }


        private val omniLightCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "omni_light_create") }
        fun omniLightCreate(): RID {
            return _icall_RID(omniLightCreateMethodBind, this.rawMemory)
        }


        private val spotLightCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "spot_light_create") }
        fun spotLightCreate(): RID {
            return _icall_RID(spotLightCreateMethodBind, this.rawMemory)
        }


        private val lightSetColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_color") }
        fun lightSetColor(light: RID, color: Color) {
            _icall_Unit_RID_Color(lightSetColorMethodBind, this.rawMemory, light, color)
        }


        private val lightSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_param") }
        fun lightSetParam(light: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(lightSetParamMethodBind, this.rawMemory, light, param, value)
        }


        private val lightSetShadowMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_shadow") }
        fun lightSetShadow(light: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(lightSetShadowMethodBind, this.rawMemory, light, enabled)
        }


        private val lightSetShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_shadow_color") }
        fun lightSetShadowColor(light: RID, color: Color) {
            _icall_Unit_RID_Color(lightSetShadowColorMethodBind, this.rawMemory, light, color)
        }


        private val lightSetProjectorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_projector") }
        fun lightSetProjector(light: RID, texture: RID) {
            _icall_Unit_RID_RID(lightSetProjectorMethodBind, this.rawMemory, light, texture)
        }


        private val lightSetNegativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_negative") }
        fun lightSetNegative(light: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(lightSetNegativeMethodBind, this.rawMemory, light, enable)
        }


        private val lightSetCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_cull_mask") }
        fun lightSetCullMask(light: RID, mask: Long) {
            _icall_Unit_RID_Long(lightSetCullMaskMethodBind, this.rawMemory, light, mask)
        }


        private val lightSetReverseCullFaceModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_reverse_cull_face_mode") }
        fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(lightSetReverseCullFaceModeMethodBind, this.rawMemory, light, enabled)
        }


        private val lightOmniSetShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_omni_set_shadow_mode") }
        fun lightOmniSetShadowMode(light: RID, mode: Long) {
            _icall_Unit_RID_Long(lightOmniSetShadowModeMethodBind, this.rawMemory, light, mode)
        }


        private val lightOmniSetShadowDetailMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_omni_set_shadow_detail") }
        fun lightOmniSetShadowDetail(light: RID, detail: Long) {
            _icall_Unit_RID_Long(lightOmniSetShadowDetailMethodBind, this.rawMemory, light, detail)
        }


        private val lightDirectionalSetShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_directional_set_shadow_mode") }
        fun lightDirectionalSetShadowMode(light: RID, mode: Long) {
            _icall_Unit_RID_Long(lightDirectionalSetShadowModeMethodBind, this.rawMemory, light, mode)
        }


        private val lightDirectionalSetBlendSplitsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_directional_set_blend_splits") }
        fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(lightDirectionalSetBlendSplitsMethodBind, this.rawMemory, light, enable)
        }


        private val lightDirectionalSetShadowDepthRangeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_directional_set_shadow_depth_range_mode") }
        fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Long) {
            _icall_Unit_RID_Long(lightDirectionalSetShadowDepthRangeModeMethodBind, this.rawMemory, light, rangeMode)
        }


        private val reflectionProbeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_create") }
        fun reflectionProbeCreate(): RID {
            return _icall_RID(reflectionProbeCreateMethodBind, this.rawMemory)
        }


        private val reflectionProbeSetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_update_mode") }
        fun reflectionProbeSetUpdateMode(probe: RID, mode: Long) {
            _icall_Unit_RID_Long(reflectionProbeSetUpdateModeMethodBind, this.rawMemory, probe, mode)
        }


        private val reflectionProbeSetIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_intensity") }
        fun reflectionProbeSetIntensity(probe: RID, intensity: Double) {
            _icall_Unit_RID_Double(reflectionProbeSetIntensityMethodBind, this.rawMemory, probe, intensity)
        }


        private val reflectionProbeSetInteriorAmbientMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_interior_ambient") }
        fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color) {
            _icall_Unit_RID_Color(reflectionProbeSetInteriorAmbientMethodBind, this.rawMemory, probe, color)
        }


        private val reflectionProbeSetInteriorAmbientEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_interior_ambient_energy") }
        fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Double) {
            _icall_Unit_RID_Double(reflectionProbeSetInteriorAmbientEnergyMethodBind, this.rawMemory, probe, energy)
        }


        private val reflectionProbeSetInteriorAmbientProbeContributionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_interior_ambient_probe_contribution") }
        fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Double) {
            _icall_Unit_RID_Double(reflectionProbeSetInteriorAmbientProbeContributionMethodBind, this.rawMemory, probe, contrib)
        }


        private val reflectionProbeSetMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_max_distance") }
        fun reflectionProbeSetMaxDistance(probe: RID, distance: Double) {
            _icall_Unit_RID_Double(reflectionProbeSetMaxDistanceMethodBind, this.rawMemory, probe, distance)
        }


        private val reflectionProbeSetExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_extents") }
        fun reflectionProbeSetExtents(probe: RID, extents: Vector3) {
            _icall_Unit_RID_Vector3(reflectionProbeSetExtentsMethodBind, this.rawMemory, probe, extents)
        }


        private val reflectionProbeSetOriginOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_origin_offset") }
        fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3) {
            _icall_Unit_RID_Vector3(reflectionProbeSetOriginOffsetMethodBind, this.rawMemory, probe, offset)
        }


        private val reflectionProbeSetAsInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_as_interior") }
        fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(reflectionProbeSetAsInteriorMethodBind, this.rawMemory, probe, enable)
        }


        private val reflectionProbeSetEnableBoxProjectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_enable_box_projection") }
        fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(reflectionProbeSetEnableBoxProjectionMethodBind, this.rawMemory, probe, enable)
        }


        private val reflectionProbeSetEnableShadowsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_enable_shadows") }
        fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(reflectionProbeSetEnableShadowsMethodBind, this.rawMemory, probe, enable)
        }


        private val reflectionProbeSetCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_cull_mask") }
        fun reflectionProbeSetCullMask(probe: RID, layers: Long) {
            _icall_Unit_RID_Long(reflectionProbeSetCullMaskMethodBind, this.rawMemory, probe, layers)
        }


        private val giProbeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_create") }
        fun giProbeCreate(): RID {
            return _icall_RID(giProbeCreateMethodBind, this.rawMemory)
        }


        private val giProbeSetBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_bounds") }
        fun giProbeSetBounds(probe: RID, bounds: AABB) {
            _icall_Unit_RID_AABB(giProbeSetBoundsMethodBind, this.rawMemory, probe, bounds)
        }


        private val giProbeGetBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_bounds") }
        fun giProbeGetBounds(probe: RID): AABB {
            return _icall_AABB_RID(giProbeGetBoundsMethodBind, this.rawMemory, probe)
        }


        private val giProbeSetCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_cell_size") }
        fun giProbeSetCellSize(probe: RID, range: Double) {
            _icall_Unit_RID_Double(giProbeSetCellSizeMethodBind, this.rawMemory, probe, range)
        }


        private val giProbeGetCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_cell_size") }
        fun giProbeGetCellSize(probe: RID): Double {
            return _icall_Double_RID(giProbeGetCellSizeMethodBind, this.rawMemory, probe)
        }


        private val giProbeSetToCellXformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_to_cell_xform") }
        fun giProbeSetToCellXform(xform: RID, arg1: Transform) {
            _icall_Unit_RID_Transform(giProbeSetToCellXformMethodBind, this.rawMemory, xform, arg1)
        }


        private val giProbeGetToCellXformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_to_cell_xform") }
        fun giProbeGetToCellXform(arg0: RID): Transform {
            return _icall_Transform_RID(giProbeGetToCellXformMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetDynamicDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_dynamic_data") }
        fun giProbeSetDynamicData(data: RID, arg1: PoolIntArray) {
            _icall_Unit_RID_PoolIntArray(giProbeSetDynamicDataMethodBind, this.rawMemory, data, arg1)
        }


        private val giProbeGetDynamicDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_dynamic_data") }
        fun giProbeGetDynamicData(arg0: RID): PoolIntArray {
            return _icall_PoolIntArray_RID(giProbeGetDynamicDataMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_dynamic_range") }
        fun giProbeSetDynamicRange(range: RID, arg1: Long) {
            _icall_Unit_RID_Long(giProbeSetDynamicRangeMethodBind, this.rawMemory, range, arg1)
        }


        private val giProbeGetDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_dynamic_range") }
        fun giProbeGetDynamicRange(arg0: RID): Long {
            return _icall_Long_RID(giProbeGetDynamicRangeMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_energy") }
        fun giProbeSetEnergy(energy: RID, arg1: Double) {
            _icall_Unit_RID_Double(giProbeSetEnergyMethodBind, this.rawMemory, energy, arg1)
        }


        private val giProbeGetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_energy") }
        fun giProbeGetEnergy(arg0: RID): Double {
            return _icall_Double_RID(giProbeGetEnergyMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_bias") }
        fun giProbeSetBias(bias: RID, arg1: Double) {
            _icall_Unit_RID_Double(giProbeSetBiasMethodBind, this.rawMemory, bias, arg1)
        }


        private val giProbeGetBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_bias") }
        fun giProbeGetBias(arg0: RID): Double {
            return _icall_Double_RID(giProbeGetBiasMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_normal_bias") }
        fun giProbeSetNormalBias(bias: RID, arg1: Double) {
            _icall_Unit_RID_Double(giProbeSetNormalBiasMethodBind, this.rawMemory, bias, arg1)
        }


        private val giProbeGetNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_normal_bias") }
        fun giProbeGetNormalBias(arg0: RID): Double {
            return _icall_Double_RID(giProbeGetNormalBiasMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_propagation") }
        fun giProbeSetPropagation(propagation: RID, arg1: Double) {
            _icall_Unit_RID_Double(giProbeSetPropagationMethodBind, this.rawMemory, propagation, arg1)
        }


        private val giProbeGetPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_propagation") }
        fun giProbeGetPropagation(arg0: RID): Double {
            return _icall_Double_RID(giProbeGetPropagationMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_interior") }
        fun giProbeSetInterior(enable: RID, arg1: Boolean) {
            _icall_Unit_RID_Boolean(giProbeSetInteriorMethodBind, this.rawMemory, enable, arg1)
        }


        private val giProbeIsInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_is_interior") }
        fun giProbeIsInterior(arg0: RID): Boolean {
            return _icall_Boolean_RID(giProbeIsInteriorMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetCompressMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_compress") }
        fun giProbeSetCompress(enable: RID, arg1: Boolean) {
            _icall_Unit_RID_Boolean(giProbeSetCompressMethodBind, this.rawMemory, enable, arg1)
        }


        private val giProbeIsCompressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_is_compressed") }
        fun giProbeIsCompressed(arg0: RID): Boolean {
            return _icall_Boolean_RID(giProbeIsCompressedMethodBind, this.rawMemory, arg0)
        }


        private val lightmapCaptureCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_create") }
        fun lightmapCaptureCreate(): RID {
            return _icall_RID(lightmapCaptureCreateMethodBind, this.rawMemory)
        }


        private val lightmapCaptureSetBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_set_bounds") }
        fun lightmapCaptureSetBounds(capture: RID, bounds: AABB) {
            _icall_Unit_RID_AABB(lightmapCaptureSetBoundsMethodBind, this.rawMemory, capture, bounds)
        }


        private val lightmapCaptureGetBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_bounds") }
        fun lightmapCaptureGetBounds(capture: RID): AABB {
            return _icall_AABB_RID(lightmapCaptureGetBoundsMethodBind, this.rawMemory, capture)
        }


        private val lightmapCaptureSetOctreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_set_octree") }
        fun lightmapCaptureSetOctree(capture: RID, octree: PoolByteArray) {
            _icall_Unit_RID_PoolByteArray(lightmapCaptureSetOctreeMethodBind, this.rawMemory, capture, octree)
        }


        private val lightmapCaptureSetOctreeCellTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_set_octree_cell_transform") }
        fun lightmapCaptureSetOctreeCellTransform(capture: RID, xform: Transform) {
            _icall_Unit_RID_Transform(lightmapCaptureSetOctreeCellTransformMethodBind, this.rawMemory, capture, xform)
        }


        private val lightmapCaptureGetOctreeCellTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_octree_cell_transform") }
        fun lightmapCaptureGetOctreeCellTransform(capture: RID): Transform {
            return _icall_Transform_RID(lightmapCaptureGetOctreeCellTransformMethodBind, this.rawMemory, capture)
        }


        private val lightmapCaptureSetOctreeCellSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_set_octree_cell_subdiv") }
        fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Long) {
            _icall_Unit_RID_Long(lightmapCaptureSetOctreeCellSubdivMethodBind, this.rawMemory, capture, subdiv)
        }


        private val lightmapCaptureGetOctreeCellSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_octree_cell_subdiv") }
        fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Long {
            return _icall_Long_RID(lightmapCaptureGetOctreeCellSubdivMethodBind, this.rawMemory, capture)
        }


        private val lightmapCaptureGetOctreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_octree") }
        fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
            return _icall_PoolByteArray_RID(lightmapCaptureGetOctreeMethodBind, this.rawMemory, capture)
        }


        private val lightmapCaptureSetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_set_energy") }
        fun lightmapCaptureSetEnergy(capture: RID, energy: Double) {
            _icall_Unit_RID_Double(lightmapCaptureSetEnergyMethodBind, this.rawMemory, capture, energy)
        }


        private val lightmapCaptureGetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_energy") }
        fun lightmapCaptureGetEnergy(capture: RID): Double {
            return _icall_Double_RID(lightmapCaptureGetEnergyMethodBind, this.rawMemory, capture)
        }


        private val particlesCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_create") }
        fun particlesCreate(): RID {
            return _icall_RID(particlesCreateMethodBind, this.rawMemory)
        }


        private val particlesSetEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_emitting") }
        fun particlesSetEmitting(particles: RID, emitting: Boolean) {
            _icall_Unit_RID_Boolean(particlesSetEmittingMethodBind, this.rawMemory, particles, emitting)
        }


        private val particlesGetEmittingMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_get_emitting") }
        fun particlesGetEmitting(particles: RID): Boolean {
            return _icall_Boolean_RID(particlesGetEmittingMethodBind, this.rawMemory, particles)
        }


        private val particlesSetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_amount") }
        fun particlesSetAmount(particles: RID, amount: Long) {
            _icall_Unit_RID_Long(particlesSetAmountMethodBind, this.rawMemory, particles, amount)
        }


        private val particlesSetLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_lifetime") }
        fun particlesSetLifetime(particles: RID, lifetime: Double) {
            _icall_Unit_RID_Double(particlesSetLifetimeMethodBind, this.rawMemory, particles, lifetime)
        }


        private val particlesSetOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_one_shot") }
        fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
            _icall_Unit_RID_Boolean(particlesSetOneShotMethodBind, this.rawMemory, particles, oneShot)
        }


        private val particlesSetPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_pre_process_time") }
        fun particlesSetPreProcessTime(particles: RID, time: Double) {
            _icall_Unit_RID_Double(particlesSetPreProcessTimeMethodBind, this.rawMemory, particles, time)
        }


        private val particlesSetExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_explosiveness_ratio") }
        fun particlesSetExplosivenessRatio(particles: RID, ratio: Double) {
            _icall_Unit_RID_Double(particlesSetExplosivenessRatioMethodBind, this.rawMemory, particles, ratio)
        }


        private val particlesSetRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_randomness_ratio") }
        fun particlesSetRandomnessRatio(particles: RID, ratio: Double) {
            _icall_Unit_RID_Double(particlesSetRandomnessRatioMethodBind, this.rawMemory, particles, ratio)
        }


        private val particlesSetCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_custom_aabb") }
        fun particlesSetCustomAabb(particles: RID, aabb: AABB) {
            _icall_Unit_RID_AABB(particlesSetCustomAabbMethodBind, this.rawMemory, particles, aabb)
        }


        private val particlesSetSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_speed_scale") }
        fun particlesSetSpeedScale(particles: RID, scale: Double) {
            _icall_Unit_RID_Double(particlesSetSpeedScaleMethodBind, this.rawMemory, particles, scale)
        }


        private val particlesSetUseLocalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_use_local_coordinates") }
        fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(particlesSetUseLocalCoordinatesMethodBind, this.rawMemory, particles, enable)
        }


        private val particlesSetProcessMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_process_material") }
        fun particlesSetProcessMaterial(particles: RID, material: RID) {
            _icall_Unit_RID_RID(particlesSetProcessMaterialMethodBind, this.rawMemory, particles, material)
        }


        private val particlesSetFixedFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_fixed_fps") }
        fun particlesSetFixedFps(particles: RID, fps: Long) {
            _icall_Unit_RID_Long(particlesSetFixedFpsMethodBind, this.rawMemory, particles, fps)
        }


        private val particlesSetFractionalDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_fractional_delta") }
        fun particlesSetFractionalDelta(particles: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(particlesSetFractionalDeltaMethodBind, this.rawMemory, particles, enable)
        }


        private val particlesRestartMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_restart") }
        fun particlesRestart(particles: RID) {
            _icall_Unit_RID(particlesRestartMethodBind, this.rawMemory, particles)
        }


        private val particlesSetDrawOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_draw_order") }
        fun particlesSetDrawOrder(particles: RID, order: Long) {
            _icall_Unit_RID_Long(particlesSetDrawOrderMethodBind, this.rawMemory, particles, order)
        }


        private val particlesSetDrawPassesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_draw_passes") }
        fun particlesSetDrawPasses(particles: RID, count: Long) {
            _icall_Unit_RID_Long(particlesSetDrawPassesMethodBind, this.rawMemory, particles, count)
        }


        private val particlesSetDrawPassMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_draw_pass_mesh") }
        fun particlesSetDrawPassMesh(particles: RID, pass: Long, mesh: RID) {
            _icall_Unit_RID_Long_RID(particlesSetDrawPassMeshMethodBind, this.rawMemory, particles, pass, mesh)
        }


        private val particlesGetCurrentAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_get_current_aabb") }
        fun particlesGetCurrentAabb(particles: RID): AABB {
            return _icall_AABB_RID(particlesGetCurrentAabbMethodBind, this.rawMemory, particles)
        }


        private val particlesSetEmissionTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_emission_transform") }
        fun particlesSetEmissionTransform(particles: RID, transform: Transform) {
            _icall_Unit_RID_Transform(particlesSetEmissionTransformMethodBind, this.rawMemory, particles, transform)
        }


        private val cameraCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_create") }
        fun cameraCreate(): RID {
            return _icall_RID(cameraCreateMethodBind, this.rawMemory)
        }


        private val cameraSetPerspectiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_perspective") }
        fun cameraSetPerspective(camera: RID, fovyDegrees: Double, zNear: Double, zFar: Double) {
            _icall_Unit_RID_Double_Double_Double(cameraSetPerspectiveMethodBind, this.rawMemory, camera, fovyDegrees, zNear, zFar)
        }


        private val cameraSetOrthogonalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_orthogonal") }
        fun cameraSetOrthogonal(camera: RID, size: Double, zNear: Double, zFar: Double) {
            _icall_Unit_RID_Double_Double_Double(cameraSetOrthogonalMethodBind, this.rawMemory, camera, size, zNear, zFar)
        }


        private val cameraSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_transform") }
        fun cameraSetTransform(camera: RID, transform: Transform) {
            _icall_Unit_RID_Transform(cameraSetTransformMethodBind, this.rawMemory, camera, transform)
        }


        private val cameraSetCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_cull_mask") }
        fun cameraSetCullMask(camera: RID, layers: Long) {
            _icall_Unit_RID_Long(cameraSetCullMaskMethodBind, this.rawMemory, camera, layers)
        }


        private val cameraSetEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_environment") }
        fun cameraSetEnvironment(camera: RID, env: RID) {
            _icall_Unit_RID_RID(cameraSetEnvironmentMethodBind, this.rawMemory, camera, env)
        }


        private val cameraSetUseVerticalAspectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_use_vertical_aspect") }
        fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(cameraSetUseVerticalAspectMethodBind, this.rawMemory, camera, enable)
        }


        private val viewportCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_create") }
        fun viewportCreate(): RID {
            return _icall_RID(viewportCreateMethodBind, this.rawMemory)
        }


        private val viewportSetUseArvrMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_use_arvr") }
        fun viewportSetUseArvr(viewport: RID, useArvr: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetUseArvrMethodBind, this.rawMemory, viewport, useArvr)
        }


        private val viewportSetSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_size") }
        fun viewportSetSize(viewport: RID, width: Long, height: Long) {
            _icall_Unit_RID_Long_Long(viewportSetSizeMethodBind, this.rawMemory, viewport, width, height)
        }


        private val viewportSetActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_active") }
        fun viewportSetActive(viewport: RID, active: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetActiveMethodBind, this.rawMemory, viewport, active)
        }


        private val viewportSetParentViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_parent_viewport") }
        fun viewportSetParentViewport(viewport: RID, parentViewport: RID) {
            _icall_Unit_RID_RID(viewportSetParentViewportMethodBind, this.rawMemory, viewport, parentViewport)
        }


        private val viewportAttachToScreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_attach_to_screen") }
        fun viewportAttachToScreen(viewport: RID, rect: Rect2 = Rect2(0, 0, 0, 0), screen: Long = 0) {
            _icall_Unit_RID_Rect2_Long(viewportAttachToScreenMethodBind, this.rawMemory, viewport, rect, screen)
        }


        private val viewportDetachMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_detach") }
        fun viewportDetach(viewport: RID) {
            _icall_Unit_RID(viewportDetachMethodBind, this.rawMemory, viewport)
        }


        private val viewportSetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_update_mode") }
        fun viewportSetUpdateMode(viewport: RID, updateMode: Long) {
            _icall_Unit_RID_Long(viewportSetUpdateModeMethodBind, this.rawMemory, viewport, updateMode)
        }


        private val viewportSetVflipMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_vflip") }
        fun viewportSetVflip(viewport: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetVflipMethodBind, this.rawMemory, viewport, enabled)
        }


        private val viewportSetClearModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_clear_mode") }
        fun viewportSetClearMode(viewport: RID, clearMode: Long) {
            _icall_Unit_RID_Long(viewportSetClearModeMethodBind, this.rawMemory, viewport, clearMode)
        }


        private val viewportGetTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_get_texture") }
        fun viewportGetTexture(viewport: RID): RID {
            return _icall_RID_RID(viewportGetTextureMethodBind, this.rawMemory, viewport)
        }


        private val viewportSetHideScenarioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_hide_scenario") }
        fun viewportSetHideScenario(viewport: RID, hidden: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetHideScenarioMethodBind, this.rawMemory, viewport, hidden)
        }


        private val viewportSetHideCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_hide_canvas") }
        fun viewportSetHideCanvas(viewport: RID, hidden: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetHideCanvasMethodBind, this.rawMemory, viewport, hidden)
        }


        private val viewportSetDisableEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_disable_environment") }
        fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetDisableEnvironmentMethodBind, this.rawMemory, viewport, disabled)
        }


        private val viewportSetDisable3dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_disable_3d") }
        fun viewportSetDisable3d(viewport: RID, disabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetDisable3dMethodBind, this.rawMemory, viewport, disabled)
        }


        private val viewportAttachCameraMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_attach_camera") }
        fun viewportAttachCamera(viewport: RID, camera: RID) {
            _icall_Unit_RID_RID(viewportAttachCameraMethodBind, this.rawMemory, viewport, camera)
        }


        private val viewportSetScenarioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_scenario") }
        fun viewportSetScenario(viewport: RID, scenario: RID) {
            _icall_Unit_RID_RID(viewportSetScenarioMethodBind, this.rawMemory, viewport, scenario)
        }


        private val viewportAttachCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_attach_canvas") }
        fun viewportAttachCanvas(viewport: RID, canvas: RID) {
            _icall_Unit_RID_RID(viewportAttachCanvasMethodBind, this.rawMemory, viewport, canvas)
        }


        private val viewportRemoveCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_remove_canvas") }
        fun viewportRemoveCanvas(viewport: RID, canvas: RID) {
            _icall_Unit_RID_RID(viewportRemoveCanvasMethodBind, this.rawMemory, viewport, canvas)
        }


        private val viewportSetCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_canvas_transform") }
        fun viewportSetCanvasTransform(viewport: RID, canvas: RID, offset: Transform2D) {
            _icall_Unit_RID_RID_Transform2D(viewportSetCanvasTransformMethodBind, this.rawMemory, viewport, canvas, offset)
        }


        private val viewportSetTransparentBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_transparent_background") }
        fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetTransparentBackgroundMethodBind, this.rawMemory, viewport, enabled)
        }


        private val viewportSetGlobalCanvasTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_global_canvas_transform") }
        fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D) {
            _icall_Unit_RID_Transform2D(viewportSetGlobalCanvasTransformMethodBind, this.rawMemory, viewport, transform)
        }


        private val viewportSetCanvasLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_canvas_layer") }
        fun viewportSetCanvasLayer(viewport: RID, canvas: RID, layer: Long) {
            _icall_Unit_RID_RID_Long(viewportSetCanvasLayerMethodBind, this.rawMemory, viewport, canvas, layer)
        }


        private val viewportSetShadowAtlasSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_shadow_atlas_size") }
        fun viewportSetShadowAtlasSize(viewport: RID, size: Long) {
            _icall_Unit_RID_Long(viewportSetShadowAtlasSizeMethodBind, this.rawMemory, viewport, size)
        }


        private val viewportSetShadowAtlasQuadrantSubdivisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_shadow_atlas_quadrant_subdivision") }
        fun viewportSetShadowAtlasQuadrantSubdivision(viewport: RID, quadrant: Long, subdivision: Long) {
            _icall_Unit_RID_Long_Long(viewportSetShadowAtlasQuadrantSubdivisionMethodBind, this.rawMemory, viewport, quadrant, subdivision)
        }


        private val viewportSetMsaaMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_msaa") }
        fun viewportSetMsaa(viewport: RID, msaa: Long) {
            _icall_Unit_RID_Long(viewportSetMsaaMethodBind, this.rawMemory, viewport, msaa)
        }


        private val viewportSetHdrMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_hdr") }
        fun viewportSetHdr(viewport: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetHdrMethodBind, this.rawMemory, viewport, enabled)
        }


        private val viewportSetUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_usage") }
        fun viewportSetUsage(viewport: RID, usage: Long) {
            _icall_Unit_RID_Long(viewportSetUsageMethodBind, this.rawMemory, viewport, usage)
        }


        private val viewportGetRenderInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_get_render_info") }
        fun viewportGetRenderInfo(viewport: RID, info: Long): Long {
            return _icall_Long_RID_Long(viewportGetRenderInfoMethodBind, this.rawMemory, viewport, info)
        }


        private val viewportSetDebugDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_debug_draw") }
        fun viewportSetDebugDraw(viewport: RID, draw: Long) {
            _icall_Unit_RID_Long(viewportSetDebugDrawMethodBind, this.rawMemory, viewport, draw)
        }


        private val environmentCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_create") }
        fun environmentCreate(): RID {
            return _icall_RID(environmentCreateMethodBind, this.rawMemory)
        }


        private val environmentSetBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_background") }
        fun environmentSetBackground(env: RID, bg: Long) {
            _icall_Unit_RID_Long(environmentSetBackgroundMethodBind, this.rawMemory, env, bg)
        }


        private val environmentSetSkyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_sky") }
        fun environmentSetSky(env: RID, sky: RID) {
            _icall_Unit_RID_RID(environmentSetSkyMethodBind, this.rawMemory, env, sky)
        }


        private val environmentSetSkyCustomFovMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_sky_custom_fov") }
        fun environmentSetSkyCustomFov(env: RID, scale: Double) {
            _icall_Unit_RID_Double(environmentSetSkyCustomFovMethodBind, this.rawMemory, env, scale)
        }


        private val environmentSetBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_bg_color") }
        fun environmentSetBgColor(env: RID, color: Color) {
            _icall_Unit_RID_Color(environmentSetBgColorMethodBind, this.rawMemory, env, color)
        }


        private val environmentSetBgEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_bg_energy") }
        fun environmentSetBgEnergy(env: RID, energy: Double) {
            _icall_Unit_RID_Double(environmentSetBgEnergyMethodBind, this.rawMemory, env, energy)
        }


        private val environmentSetCanvasMaxLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_canvas_max_layer") }
        fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Long) {
            _icall_Unit_RID_Long(environmentSetCanvasMaxLayerMethodBind, this.rawMemory, env, maxLayer)
        }


        private val environmentSetAmbientLightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_ambient_light") }
        fun environmentSetAmbientLight(env: RID, color: Color, energy: Double = 1.0, skyContibution: Double = 0.0) {
            _icall_Unit_RID_Color_Double_Double(environmentSetAmbientLightMethodBind, this.rawMemory, env, color, energy, skyContibution)
        }


        private val environmentSetDofBlurNearMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_dof_blur_near") }
        fun environmentSetDofBlurNear(env: RID, enable: Boolean, distance: Double, transition: Double, farAmount: Double, quality: Long) {
            _icall_Unit_RID_Boolean_Double_Double_Double_Long(environmentSetDofBlurNearMethodBind, this.rawMemory, env, enable, distance, transition, farAmount, quality)
        }


        private val environmentSetDofBlurFarMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_dof_blur_far") }
        fun environmentSetDofBlurFar(env: RID, enable: Boolean, distance: Double, transition: Double, farAmount: Double, quality: Long) {
            _icall_Unit_RID_Boolean_Double_Double_Double_Long(environmentSetDofBlurFarMethodBind, this.rawMemory, env, enable, distance, transition, farAmount, quality)
        }


        private val environmentSetGlowMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_glow") }
        fun environmentSetGlow(env: RID, enable: Boolean, levelFlags: Long, intensity: Double, strength: Double, bloomThreshold: Double, blendMode: Long, hdrBleedThreshold: Double, hdrBleedScale: Double, bicubicUpscale: Boolean) {
            _icall_Unit_RID_Boolean_Long_Double_Double_Double_Long_Double_Double_Boolean(environmentSetGlowMethodBind, this.rawMemory, env, enable, levelFlags, intensity, strength, bloomThreshold, blendMode, hdrBleedThreshold, hdrBleedScale, bicubicUpscale)
        }


        private val environmentSetTonemapMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_tonemap") }
        fun environmentSetTonemap(env: RID, toneMapper: Long, exposure: Double, white: Double, autoExposure: Boolean, minLuminance: Double, maxLuminance: Double, autoExpSpeed: Double, autoExpGrey: Double) {
            _icall_Unit_RID_Long_Double_Double_Boolean_Double_Double_Double_Double(environmentSetTonemapMethodBind, this.rawMemory, env, toneMapper, exposure, white, autoExposure, minLuminance, maxLuminance, autoExpSpeed, autoExpGrey)
        }


        private val environmentSetAdjustmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_adjustment") }
        fun environmentSetAdjustment(env: RID, enable: Boolean, brightness: Double, contrast: Double, saturation: Double, ramp: RID) {
            _icall_Unit_RID_Boolean_Double_Double_Double_RID(environmentSetAdjustmentMethodBind, this.rawMemory, env, enable, brightness, contrast, saturation, ramp)
        }


        private val environmentSetSsrMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_ssr") }
        fun environmentSetSsr(env: RID, enable: Boolean, maxSteps: Long, fadeIn: Double, fadeOut: Double, depthTolerance: Double, roughness: Boolean) {
            _icall_Unit_RID_Boolean_Long_Double_Double_Double_Boolean(environmentSetSsrMethodBind, this.rawMemory, env, enable, maxSteps, fadeIn, fadeOut, depthTolerance, roughness)
        }


        private val environmentSetSsaoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_ssao") }
        fun environmentSetSsao(env: RID, enable: Boolean, radius: Double, intensity: Double, radius2: Double, intensity2: Double, bias: Double, lightAffect: Double, color: Double, quality: Color, blur: Long, bilateralSharpness: Long, arg12: Double) {
            _icall_Unit_RID_Boolean_Double_Double_Double_Double_Double_Double_Double_Color_Long_Long_Double(environmentSetSsaoMethodBind, this.rawMemory, env, enable, radius, intensity, radius2, intensity2, bias, lightAffect, color, quality, blur, bilateralSharpness, arg12)
        }


        private val environmentSetFogMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_fog") }
        fun environmentSetFog(env: RID, enable: Boolean, color: Color, sunColor: Color, sunAmount: Double) {
            _icall_Unit_RID_Boolean_Color_Color_Double(environmentSetFogMethodBind, this.rawMemory, env, enable, color, sunColor, sunAmount)
        }


        private val environmentSetFogDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_fog_depth") }
        fun environmentSetFogDepth(env: RID, enable: Boolean, depthBegin: Double, depthCurve: Double, transmit: Boolean, transmitCurve: Double) {
            _icall_Unit_RID_Boolean_Double_Double_Boolean_Double(environmentSetFogDepthMethodBind, this.rawMemory, env, enable, depthBegin, depthCurve, transmit, transmitCurve)
        }


        private val environmentSetFogHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_fog_height") }
        fun environmentSetFogHeight(env: RID, enable: Boolean, minHeight: Double, maxHeight: Double, heightCurve: Double) {
            _icall_Unit_RID_Boolean_Double_Double_Double(environmentSetFogHeightMethodBind, this.rawMemory, env, enable, minHeight, maxHeight, heightCurve)
        }


        private val scenarioCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_create") }
        fun scenarioCreate(): RID {
            return _icall_RID(scenarioCreateMethodBind, this.rawMemory)
        }


        private val scenarioSetDebugMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_debug") }
        fun scenarioSetDebug(scenario: RID, debugMode: Long) {
            _icall_Unit_RID_Long(scenarioSetDebugMethodBind, this.rawMemory, scenario, debugMode)
        }


        private val scenarioSetEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_environment") }
        fun scenarioSetEnvironment(scenario: RID, environment: RID) {
            _icall_Unit_RID_RID(scenarioSetEnvironmentMethodBind, this.rawMemory, scenario, environment)
        }


        private val scenarioSetReflectionAtlasSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_reflection_atlas_size") }
        fun scenarioSetReflectionAtlasSize(scenario: RID, pSize: Long, subdiv: Long) {
            _icall_Unit_RID_Long_Long(scenarioSetReflectionAtlasSizeMethodBind, this.rawMemory, scenario, pSize, subdiv)
        }


        private val scenarioSetFallbackEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_fallback_environment") }
        fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID) {
            _icall_Unit_RID_RID(scenarioSetFallbackEnvironmentMethodBind, this.rawMemory, scenario, environment)
        }


        private val instanceCreate2MethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_create2") }
        fun instanceCreate2(base: RID, scenario: RID): RID {
            return _icall_RID_RID_RID(instanceCreate2MethodBind, this.rawMemory, base, scenario)
        }


        private val instanceCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_create") }
        fun instanceCreate(): RID {
            return _icall_RID(instanceCreateMethodBind, this.rawMemory)
        }


        private val instanceSetBaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_base") }
        fun instanceSetBase(instance: RID, base: RID) {
            _icall_Unit_RID_RID(instanceSetBaseMethodBind, this.rawMemory, instance, base)
        }


        private val instanceSetScenarioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_scenario") }
        fun instanceSetScenario(instance: RID, scenario: RID) {
            _icall_Unit_RID_RID(instanceSetScenarioMethodBind, this.rawMemory, instance, scenario)
        }


        private val instanceSetLayerMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_layer_mask") }
        fun instanceSetLayerMask(instance: RID, mask: Long) {
            _icall_Unit_RID_Long(instanceSetLayerMaskMethodBind, this.rawMemory, instance, mask)
        }


        private val instanceSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_transform") }
        fun instanceSetTransform(instance: RID, transform: Transform) {
            _icall_Unit_RID_Transform(instanceSetTransformMethodBind, this.rawMemory, instance, transform)
        }


        private val instanceAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_attach_object_instance_id") }
        fun instanceAttachObjectInstanceId(instance: RID, id: Long) {
            _icall_Unit_RID_Long(instanceAttachObjectInstanceIdMethodBind, this.rawMemory, instance, id)
        }


        private val instanceSetBlendShapeWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_blend_shape_weight") }
        fun instanceSetBlendShapeWeight(instance: RID, shape: Long, weight: Double) {
            _icall_Unit_RID_Long_Double(instanceSetBlendShapeWeightMethodBind, this.rawMemory, instance, shape, weight)
        }


        private val instanceSetSurfaceMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_surface_material") }
        fun instanceSetSurfaceMaterial(instance: RID, surface: Long, material: RID) {
            _icall_Unit_RID_Long_RID(instanceSetSurfaceMaterialMethodBind, this.rawMemory, instance, surface, material)
        }


        private val instanceSetVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_visible") }
        fun instanceSetVisible(instance: RID, visible: Boolean) {
            _icall_Unit_RID_Boolean(instanceSetVisibleMethodBind, this.rawMemory, instance, visible)
        }


        private val instanceSetUseLightmapMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_use_lightmap") }
        fun instanceSetUseLightmap(instance: RID, lightmapInstance: RID, lightmap: RID) {
            _icall_Unit_RID_RID_RID(instanceSetUseLightmapMethodBind, this.rawMemory, instance, lightmapInstance, lightmap)
        }


        private val instanceSetCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_custom_aabb") }
        fun instanceSetCustomAabb(instance: RID, aabb: AABB) {
            _icall_Unit_RID_AABB(instanceSetCustomAabbMethodBind, this.rawMemory, instance, aabb)
        }


        private val instanceAttachSkeletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_attach_skeleton") }
        fun instanceAttachSkeleton(instance: RID, skeleton: RID) {
            _icall_Unit_RID_RID(instanceAttachSkeletonMethodBind, this.rawMemory, instance, skeleton)
        }


        private val instanceSetExteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_exterior") }
        fun instanceSetExterior(instance: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(instanceSetExteriorMethodBind, this.rawMemory, instance, enabled)
        }


        private val instanceSetExtraVisibilityMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_extra_visibility_margin") }
        fun instanceSetExtraVisibilityMargin(instance: RID, margin: Double) {
            _icall_Unit_RID_Double(instanceSetExtraVisibilityMarginMethodBind, this.rawMemory, instance, margin)
        }


        private val instanceGeometrySetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_flag") }
        fun instanceGeometrySetFlag(instance: RID, flag: Long, enabled: Boolean) {
            _icall_Unit_RID_Long_Boolean(instanceGeometrySetFlagMethodBind, this.rawMemory, instance, flag, enabled)
        }


        private val instanceGeometrySetCastShadowsSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_cast_shadows_setting") }
        fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Long) {
            _icall_Unit_RID_Long(instanceGeometrySetCastShadowsSettingMethodBind, this.rawMemory, instance, shadowCastingSetting)
        }


        private val instanceGeometrySetMaterialOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_material_override") }
        fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
            _icall_Unit_RID_RID(instanceGeometrySetMaterialOverrideMethodBind, this.rawMemory, instance, material)
        }


        private val instanceGeometrySetDrawRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_draw_range") }
        fun instanceGeometrySetDrawRange(instance: RID, min: Double, max: Double, minMargin: Double, maxMargin: Double) {
            _icall_Unit_RID_Double_Double_Double_Double(instanceGeometrySetDrawRangeMethodBind, this.rawMemory, instance, min, max, minMargin, maxMargin)
        }


        private val instanceGeometrySetAsInstanceLodMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_as_instance_lod") }
        fun instanceGeometrySetAsInstanceLod(instance: RID, asLodOfInstance: RID) {
            _icall_Unit_RID_RID(instanceGeometrySetAsInstanceLodMethodBind, this.rawMemory, instance, asLodOfInstance)
        }


        private val instancesCullAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instances_cull_aabb") }
        fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): GDArray {
            return _icall_GDArray_AABB_RID(instancesCullAabbMethodBind, this.rawMemory, aabb, scenario)
        }


        private val instancesCullRayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instances_cull_ray") }
        fun instancesCullRay(from: Vector3, to: Vector3, scenario: RID = RID()): GDArray {
            return _icall_GDArray_Vector3_Vector3_RID(instancesCullRayMethodBind, this.rawMemory, from, to, scenario)
        }


        private val instancesCullConvexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instances_cull_convex") }
        fun instancesCullConvex(convex: GDArray, scenario: RID = RID()): GDArray {
            return _icall_GDArray_GDArray_RID(instancesCullConvexMethodBind, this.rawMemory, convex, scenario)
        }


        private val canvasCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_create") }
        fun canvasCreate(): RID {
            return _icall_RID(canvasCreateMethodBind, this.rawMemory)
        }


        private val canvasSetItemMirroringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_set_item_mirroring") }
        fun canvasSetItemMirroring(canvas: RID, item: RID, mirroring: Vector2) {
            _icall_Unit_RID_RID_Vector2(canvasSetItemMirroringMethodBind, this.rawMemory, canvas, item, mirroring)
        }


        private val canvasSetModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_set_modulate") }
        fun canvasSetModulate(canvas: RID, color: Color) {
            _icall_Unit_RID_Color(canvasSetModulateMethodBind, this.rawMemory, canvas, color)
        }


        private val canvasItemCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_create") }
        fun canvasItemCreate(): RID {
            return _icall_RID(canvasItemCreateMethodBind, this.rawMemory)
        }


        private val canvasItemSetParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_parent") }
        fun canvasItemSetParent(item: RID, parent: RID) {
            _icall_Unit_RID_RID(canvasItemSetParentMethodBind, this.rawMemory, item, parent)
        }


        private val canvasItemSetVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_visible") }
        fun canvasItemSetVisible(item: RID, visible: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetVisibleMethodBind, this.rawMemory, item, visible)
        }


        private val canvasItemSetLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_light_mask") }
        fun canvasItemSetLightMask(item: RID, mask: Long) {
            _icall_Unit_RID_Long(canvasItemSetLightMaskMethodBind, this.rawMemory, item, mask)
        }


        private val canvasItemSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_transform") }
        fun canvasItemSetTransform(item: RID, transform: Transform2D) {
            _icall_Unit_RID_Transform2D(canvasItemSetTransformMethodBind, this.rawMemory, item, transform)
        }


        private val canvasItemSetClipMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_clip") }
        fun canvasItemSetClip(item: RID, clip: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetClipMethodBind, this.rawMemory, item, clip)
        }


        private val canvasItemSetDistanceFieldModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_distance_field_mode") }
        fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetDistanceFieldModeMethodBind, this.rawMemory, item, enabled)
        }


        private val canvasItemSetCustomRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_custom_rect") }
        fun canvasItemSetCustomRect(item: RID, useCustomRect: Boolean, rect: Rect2 = Rect2(0, 0, 0, 0)) {
            _icall_Unit_RID_Boolean_Rect2(canvasItemSetCustomRectMethodBind, this.rawMemory, item, useCustomRect, rect)
        }


        private val canvasItemSetModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_modulate") }
        fun canvasItemSetModulate(item: RID, color: Color) {
            _icall_Unit_RID_Color(canvasItemSetModulateMethodBind, this.rawMemory, item, color)
        }


        private val canvasItemSetSelfModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_self_modulate") }
        fun canvasItemSetSelfModulate(item: RID, color: Color) {
            _icall_Unit_RID_Color(canvasItemSetSelfModulateMethodBind, this.rawMemory, item, color)
        }


        private val canvasItemSetDrawBehindParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_draw_behind_parent") }
        fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetDrawBehindParentMethodBind, this.rawMemory, item, enabled)
        }


        private val canvasItemAddLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_line") }
        fun canvasItemAddLine(item: RID, from: Vector2, to: Vector2, color: Color, width: Double = 1.0, antialiased: Boolean = false) {
            _icall_Unit_RID_Vector2_Vector2_Color_Double_Boolean(canvasItemAddLineMethodBind, this.rawMemory, item, from, to, color, width, antialiased)
        }


        private val canvasItemAddPolylineMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_polyline") }
        fun canvasItemAddPolyline(item: RID, points: PoolVector2Array, colors: PoolColorArray, width: Double = 1.0, antialiased: Boolean = false) {
            _icall_Unit_RID_PoolVector2Array_PoolColorArray_Double_Boolean(canvasItemAddPolylineMethodBind, this.rawMemory, item, points, colors, width, antialiased)
        }


        private val canvasItemAddRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_rect") }
        fun canvasItemAddRect(item: RID, rect: Rect2, color: Color) {
            _icall_Unit_RID_Rect2_Color(canvasItemAddRectMethodBind, this.rawMemory, item, rect, color)
        }


        private val canvasItemAddCircleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_circle") }
        fun canvasItemAddCircle(item: RID, pos: Vector2, radius: Double, color: Color) {
            _icall_Unit_RID_Vector2_Double_Color(canvasItemAddCircleMethodBind, this.rawMemory, item, pos, radius, color)
        }


        private val canvasItemAddTextureRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_texture_rect") }
        fun canvasItemAddTextureRect(item: RID, rect: Rect2, texture: RID, tile: Boolean = false, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: RID = RID()) {
            _icall_Unit_RID_Rect2_RID_Boolean_Color_Boolean_RID(canvasItemAddTextureRectMethodBind, this.rawMemory, item, rect, texture, tile, modulate, transpose, normalMap)
        }


        private val canvasItemAddTextureRectRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_texture_rect_region") }
        fun canvasItemAddTextureRectRegion(item: RID, rect: Rect2, texture: RID, srcRect: Rect2, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: RID = RID(), clipUv: Boolean = true) {
            _icall_Unit_RID_Rect2_RID_Rect2_Color_Boolean_RID_Boolean(canvasItemAddTextureRectRegionMethodBind, this.rawMemory, item, rect, texture, srcRect, modulate, transpose, normalMap, clipUv)
        }


        private val canvasItemAddNinePatchMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_nine_patch") }
        fun canvasItemAddNinePatch(item: RID, rect: Rect2, source: Rect2, texture: RID, topleft: Vector2, bottomright: Vector2, xAxisMode: Long = 0, yAxisMode: Long = 0, drawCenter: Boolean = true, modulate: Color = Color(1,1,1,1), normalMap: RID = RID()) {
            _icall_Unit_RID_Rect2_Rect2_RID_Vector2_Vector2_Long_Long_Boolean_Color_RID(canvasItemAddNinePatchMethodBind, this.rawMemory, item, rect, source, texture, topleft, bottomright, xAxisMode, yAxisMode, drawCenter, modulate, normalMap)
        }


        private val canvasItemAddPrimitiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_primitive") }
        fun canvasItemAddPrimitive(item: RID, points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array, texture: RID, width: Double = 1.0, normalMap: RID = RID()) {
            _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_Double_RID(canvasItemAddPrimitiveMethodBind, this.rawMemory, item, points, colors, uvs, texture, width, normalMap)
        }


        private val canvasItemAddPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_polygon") }
        fun canvasItemAddPolygon(item: RID, points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array = PoolVector2Array(), texture: RID = RID(), normalMap: RID = RID(), antialiased: Boolean = false) {
            _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_RID_Boolean(canvasItemAddPolygonMethodBind, this.rawMemory, item, points, colors, uvs, texture, normalMap, antialiased)
        }


        private val canvasItemAddTriangleArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_triangle_array") }
        fun canvasItemAddTriangleArray(item: RID, indices: PoolIntArray, points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array = PoolVector2Array(), bones: PoolIntArray = PoolIntArray(), weights: PoolRealArray = PoolRealArray(), texture: RID = RID(), count: Long = -1, normalMap: RID = RID()) {
            _icall_Unit_RID_PoolIntArray_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolIntArray_PoolRealArray_RID_Long_RID(canvasItemAddTriangleArrayMethodBind, this.rawMemory, item, indices, points, colors, uvs, bones, weights, texture, count, normalMap)
        }


        private val canvasItemAddMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_mesh") }
        fun canvasItemAddMesh(item: RID, mesh: RID, texture: RID, normalMap: RID = RID()) {
            _icall_Unit_RID_RID_RID_RID(canvasItemAddMeshMethodBind, this.rawMemory, item, mesh, texture, normalMap)
        }


        private val canvasItemAddMultimeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_multimesh") }
        fun canvasItemAddMultimesh(item: RID, mesh: RID, texture: RID, normalMap: RID = RID()) {
            _icall_Unit_RID_RID_RID_RID(canvasItemAddMultimeshMethodBind, this.rawMemory, item, mesh, texture, normalMap)
        }


        private val canvasItemAddParticlesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_particles") }
        fun canvasItemAddParticles(item: RID, particles: RID, texture: RID, normalMap: RID, hFrames: Long, vFrames: Long) {
            _icall_Unit_RID_RID_RID_RID_Long_Long(canvasItemAddParticlesMethodBind, this.rawMemory, item, particles, texture, normalMap, hFrames, vFrames)
        }


        private val canvasItemAddSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_set_transform") }
        fun canvasItemAddSetTransform(item: RID, transform: Transform2D) {
            _icall_Unit_RID_Transform2D(canvasItemAddSetTransformMethodBind, this.rawMemory, item, transform)
        }


        private val canvasItemAddClipIgnoreMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_clip_ignore") }
        fun canvasItemAddClipIgnore(item: RID, ignore: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemAddClipIgnoreMethodBind, this.rawMemory, item, ignore)
        }


        private val canvasItemSetSortChildrenByYMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_sort_children_by_y") }
        fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetSortChildrenByYMethodBind, this.rawMemory, item, enabled)
        }


        private val canvasItemSetZIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_z_index") }
        fun canvasItemSetZIndex(item: RID, zIndex: Long) {
            _icall_Unit_RID_Long(canvasItemSetZIndexMethodBind, this.rawMemory, item, zIndex)
        }


        private val canvasItemSetZAsRelativeToParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_z_as_relative_to_parent") }
        fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetZAsRelativeToParentMethodBind, this.rawMemory, item, enabled)
        }


        private val canvasItemSetCopyToBackbufferMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_copy_to_backbuffer") }
        fun canvasItemSetCopyToBackbuffer(item: RID, enabled: Boolean, rect: Rect2) {
            _icall_Unit_RID_Boolean_Rect2(canvasItemSetCopyToBackbufferMethodBind, this.rawMemory, item, enabled, rect)
        }


        private val canvasItemClearMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_clear") }
        fun canvasItemClear(item: RID) {
            _icall_Unit_RID(canvasItemClearMethodBind, this.rawMemory, item)
        }


        private val canvasItemSetDrawIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_draw_index") }
        fun canvasItemSetDrawIndex(item: RID, index: Long) {
            _icall_Unit_RID_Long(canvasItemSetDrawIndexMethodBind, this.rawMemory, item, index)
        }


        private val canvasItemSetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_material") }
        fun canvasItemSetMaterial(item: RID, material: RID) {
            _icall_Unit_RID_RID(canvasItemSetMaterialMethodBind, this.rawMemory, item, material)
        }


        private val canvasItemSetUseParentMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_set_use_parent_material") }
        fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasItemSetUseParentMaterialMethodBind, this.rawMemory, item, enabled)
        }


        private val canvasLightCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_create") }
        fun canvasLightCreate(): RID {
            return _icall_RID(canvasLightCreateMethodBind, this.rawMemory)
        }


        private val canvasLightAttachToCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_attach_to_canvas") }
        fun canvasLightAttachToCanvas(light: RID, canvas: RID) {
            _icall_Unit_RID_RID(canvasLightAttachToCanvasMethodBind, this.rawMemory, light, canvas)
        }


        private val canvasLightSetEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_enabled") }
        fun canvasLightSetEnabled(light: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasLightSetEnabledMethodBind, this.rawMemory, light, enabled)
        }


        private val canvasLightSetScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_scale") }
        fun canvasLightSetScale(light: RID, scale: Double) {
            _icall_Unit_RID_Double(canvasLightSetScaleMethodBind, this.rawMemory, light, scale)
        }


        private val canvasLightSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_transform") }
        fun canvasLightSetTransform(light: RID, transform: Transform2D) {
            _icall_Unit_RID_Transform2D(canvasLightSetTransformMethodBind, this.rawMemory, light, transform)
        }


        private val canvasLightSetTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_texture") }
        fun canvasLightSetTexture(light: RID, texture: RID) {
            _icall_Unit_RID_RID(canvasLightSetTextureMethodBind, this.rawMemory, light, texture)
        }


        private val canvasLightSetTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_texture_offset") }
        fun canvasLightSetTextureOffset(light: RID, offset: Vector2) {
            _icall_Unit_RID_Vector2(canvasLightSetTextureOffsetMethodBind, this.rawMemory, light, offset)
        }


        private val canvasLightSetColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_color") }
        fun canvasLightSetColor(light: RID, color: Color) {
            _icall_Unit_RID_Color(canvasLightSetColorMethodBind, this.rawMemory, light, color)
        }


        private val canvasLightSetHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_height") }
        fun canvasLightSetHeight(light: RID, height: Double) {
            _icall_Unit_RID_Double(canvasLightSetHeightMethodBind, this.rawMemory, light, height)
        }


        private val canvasLightSetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_energy") }
        fun canvasLightSetEnergy(light: RID, energy: Double) {
            _icall_Unit_RID_Double(canvasLightSetEnergyMethodBind, this.rawMemory, light, energy)
        }


        private val canvasLightSetZRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_z_range") }
        fun canvasLightSetZRange(light: RID, minZ: Long, maxZ: Long) {
            _icall_Unit_RID_Long_Long(canvasLightSetZRangeMethodBind, this.rawMemory, light, minZ, maxZ)
        }


        private val canvasLightSetLayerRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_layer_range") }
        fun canvasLightSetLayerRange(light: RID, minLayer: Long, maxLayer: Long) {
            _icall_Unit_RID_Long_Long(canvasLightSetLayerRangeMethodBind, this.rawMemory, light, minLayer, maxLayer)
        }


        private val canvasLightSetItemCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_item_cull_mask") }
        fun canvasLightSetItemCullMask(light: RID, mask: Long) {
            _icall_Unit_RID_Long(canvasLightSetItemCullMaskMethodBind, this.rawMemory, light, mask)
        }


        private val canvasLightSetItemShadowCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_item_shadow_cull_mask") }
        fun canvasLightSetItemShadowCullMask(light: RID, mask: Long) {
            _icall_Unit_RID_Long(canvasLightSetItemShadowCullMaskMethodBind, this.rawMemory, light, mask)
        }


        private val canvasLightSetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_mode") }
        fun canvasLightSetMode(light: RID, mode: Long) {
            _icall_Unit_RID_Long(canvasLightSetModeMethodBind, this.rawMemory, light, mode)
        }


        private val canvasLightSetShadowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_enabled") }
        fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasLightSetShadowEnabledMethodBind, this.rawMemory, light, enabled)
        }


        private val canvasLightSetShadowBufferSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_buffer_size") }
        fun canvasLightSetShadowBufferSize(light: RID, size: Long) {
            _icall_Unit_RID_Long(canvasLightSetShadowBufferSizeMethodBind, this.rawMemory, light, size)
        }


        private val canvasLightSetShadowGradientLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_gradient_length") }
        fun canvasLightSetShadowGradientLength(light: RID, length: Double) {
            _icall_Unit_RID_Double(canvasLightSetShadowGradientLengthMethodBind, this.rawMemory, light, length)
        }


        private val canvasLightSetShadowFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_filter") }
        fun canvasLightSetShadowFilter(light: RID, filter: Long) {
            _icall_Unit_RID_Long(canvasLightSetShadowFilterMethodBind, this.rawMemory, light, filter)
        }


        private val canvasLightSetShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_color") }
        fun canvasLightSetShadowColor(light: RID, color: Color) {
            _icall_Unit_RID_Color(canvasLightSetShadowColorMethodBind, this.rawMemory, light, color)
        }


        private val canvasLightSetShadowSmoothMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_smooth") }
        fun canvasLightSetShadowSmooth(light: RID, smooth: Double) {
            _icall_Unit_RID_Double(canvasLightSetShadowSmoothMethodBind, this.rawMemory, light, smooth)
        }


        private val canvasLightOccluderCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_occluder_create") }
        fun canvasLightOccluderCreate(): RID {
            return _icall_RID(canvasLightOccluderCreateMethodBind, this.rawMemory)
        }


        private val canvasLightOccluderAttachToCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_occluder_attach_to_canvas") }
        fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID) {
            _icall_Unit_RID_RID(canvasLightOccluderAttachToCanvasMethodBind, this.rawMemory, occluder, canvas)
        }


        private val canvasLightOccluderSetEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_occluder_set_enabled") }
        fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasLightOccluderSetEnabledMethodBind, this.rawMemory, occluder, enabled)
        }


        private val canvasLightOccluderSetPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_occluder_set_polygon") }
        fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID) {
            _icall_Unit_RID_RID(canvasLightOccluderSetPolygonMethodBind, this.rawMemory, occluder, polygon)
        }


        private val canvasLightOccluderSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_occluder_set_transform") }
        fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D) {
            _icall_Unit_RID_Transform2D(canvasLightOccluderSetTransformMethodBind, this.rawMemory, occluder, transform)
        }


        private val canvasLightOccluderSetLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_occluder_set_light_mask") }
        fun canvasLightOccluderSetLightMask(occluder: RID, mask: Long) {
            _icall_Unit_RID_Long(canvasLightOccluderSetLightMaskMethodBind, this.rawMemory, occluder, mask)
        }


        private val canvasOccluderPolygonCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_occluder_polygon_create") }
        fun canvasOccluderPolygonCreate(): RID {
            return _icall_RID(canvasOccluderPolygonCreateMethodBind, this.rawMemory)
        }


        private val canvasOccluderPolygonSetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_occluder_polygon_set_shape") }
        fun canvasOccluderPolygonSetShape(occluderPolygon: RID, shape: PoolVector2Array, closed: Boolean) {
            _icall_Unit_RID_PoolVector2Array_Boolean(canvasOccluderPolygonSetShapeMethodBind, this.rawMemory, occluderPolygon, shape, closed)
        }


        private val canvasOccluderPolygonSetShapeAsLinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_occluder_polygon_set_shape_as_lines") }
        fun canvasOccluderPolygonSetShapeAsLines(occluderPolygon: RID, shape: PoolVector2Array) {
            _icall_Unit_RID_PoolVector2Array(canvasOccluderPolygonSetShapeAsLinesMethodBind, this.rawMemory, occluderPolygon, shape)
        }


        private val canvasOccluderPolygonSetCullModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_occluder_polygon_set_cull_mode") }
        fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Long) {
            _icall_Unit_RID_Long(canvasOccluderPolygonSetCullModeMethodBind, this.rawMemory, occluderPolygon, mode)
        }


        private val blackBarsSetMarginsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "black_bars_set_margins") }
        fun blackBarsSetMargins(left: Long, top: Long, right: Long, bottom: Long) {
            _icall_Unit_Long_Long_Long_Long(blackBarsSetMarginsMethodBind, this.rawMemory, left, top, right, bottom)
        }


        private val blackBarsSetImagesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "black_bars_set_images") }
        fun blackBarsSetImages(left: RID, top: RID, right: RID, bottom: RID) {
            _icall_Unit_RID_RID_RID_RID(blackBarsSetImagesMethodBind, this.rawMemory, left, top, right, bottom)
        }


        private val freeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "free_rid") }
        fun freeRid(rid: RID) {
            _icall_Unit_RID(freeRidMethodBind, this.rawMemory, rid)
        }


        private val requestFrameDrawnCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "request_frame_drawn_callback") }
        fun requestFrameDrawnCallback(where: Object, method: String, userdata: Variant) {
            _icall_Unit_Object_String_Variant(requestFrameDrawnCallbackMethodBind, this.rawMemory, where, method, userdata)
        }


        private val hasChangedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "has_changed") }
        fun hasChanged(): Boolean {
            return _icall_Boolean(hasChangedMethodBind, this.rawMemory)
        }


        private val initMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "init") }
        fun init() {
            _icall_Unit(initMethodBind, this.rawMemory)
        }


        private val finishMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "finish") }
        fun finish() {
            _icall_Unit(finishMethodBind, this.rawMemory)
        }


        private val getRenderInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "get_render_info") }
        fun getRenderInfo(info: Long): Long {
            return _icall_Long_Long(getRenderInfoMethodBind, this.rawMemory, info)
        }


        private val getTestCubeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "get_test_cube") }
        fun getTestCube(): RID {
            return _icall_RID(getTestCubeMethodBind, this.rawMemory)
        }


        private val getTestTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "get_test_texture") }
        fun getTestTexture(): RID {
            return _icall_RID(getTestTextureMethodBind, this.rawMemory)
        }


        private val getWhiteTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "get_white_texture") }
        fun getWhiteTexture(): RID {
            return _icall_RID(getWhiteTextureMethodBind, this.rawMemory)
        }


        private val makeSphereMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "make_sphere_mesh") }
        fun makeSphereMesh(latitudes: Long, longitudes: Long, radius: Double): RID {
            return _icall_RID_Long_Long_Double(makeSphereMeshMethodBind, this.rawMemory, latitudes, longitudes, radius)
        }


        private val setBootImageMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "set_boot_image") }
        fun setBootImage(image: Image, color: Color, scale: Boolean) {
            _icall_Unit_Object_Color_Boolean(setBootImageMethodBind, this.rawMemory, image, color, scale)
        }


        private val setDefaultClearColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "set_default_clear_color") }
        fun setDefaultClearColor(color: Color) {
            _icall_Unit_Color(setDefaultClearColorMethodBind, this.rawMemory, color)
        }


        private val hasFeatureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "has_feature") }
        fun hasFeature(feature: Long): Boolean {
            return _icall_Boolean_Long(hasFeatureMethodBind, this.rawMemory, feature)
        }


        private val hasOsFeatureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "has_os_feature") }
        fun hasOsFeature(feature: String): Boolean {
            return _icall_Boolean_String(hasOsFeatureMethodBind, this.rawMemory, feature)
        }


        private val setDebugGenerateWireframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "set_debug_generate_wireframes") }
        fun setDebugGenerateWireframes(generate: Boolean) {
            _icall_Unit_Boolean(setDebugGenerateWireframesMethodBind, this.rawMemory, generate)
        }


    }
}
