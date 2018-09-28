@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ReflectionProbeUpdateMode(val id: Int) {
        REFLECTION_PROBE_UPDATE_ONCE(0),
        REFLECTION_PROBE_UPDATE_ALWAYS(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LightDirectionalShadowDepthRangeMode(val id: Int) {
        LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),
        LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class BlendShapeMode(val id: Int) {
        BLEND_SHAPE_MODE_NORMALIZED(0),
        BLEND_SHAPE_MODE_RELATIVE(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class PrimitiveType(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EnvironmentSSAOQuality(val id: Int) {
        ENV_SSAO_QUALITY_LOW(0),
        ENV_SSAO_QUALITY_MEDIUM(1),
        ENV_SSAO_QUALITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EnvironmentDOFBlurQuality(val id: Int) {
        ENV_DOF_BLUR_QUALITY_LOW(0),
        ENV_DOF_BLUR_QUALITY_MEDIUM(1),
        ENV_DOF_BLUR_QUALITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class RenderInfo(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class NinePatchAxisMode(val id: Int) {
        NINE_PATCH_STRETCH(0),
        NINE_PATCH_TILE(1),
        NINE_PATCH_TILE_FIT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ViewportRenderInfo(val id: Int) {
        VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),
        VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),
        VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),
        VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),
        VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),
        VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),
        VIEWPORT_RENDER_INFO_MAX(6),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ViewportClearMode(val id: Int) {
        VIEWPORT_CLEAR_ALWAYS(0),
        VIEWPORT_CLEAR_NEVER(1),
        VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LightOmniShadowDetail(val id: Int) {
        LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),
        LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ShaderMode(val id: Int) {
        SHADER_SPATIAL(0),
        SHADER_CANVAS_ITEM(1),
        SHADER_PARTICLES(2),
        SHADER_MAX(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class MultimeshTransformFormat(val id: Int) {
        MULTIMESH_TRANSFORM_2D(0),
        MULTIMESH_TRANSFORM_3D(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ShadowCastingSetting(val id: Int) {
        SHADOW_CASTING_SETTING_OFF(0),
        SHADOW_CASTING_SETTING_ON(1),
        SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
        SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ViewportDebugDraw(val id: Int) {
        VIEWPORT_DEBUG_DRAW_DISABLED(0),
        VIEWPORT_DEBUG_DRAW_UNSHADED(1),
        VIEWPORT_DEBUG_DRAW_OVERDRAW(2),
        VIEWPORT_DEBUG_DRAW_WIREFRAME(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ViewportUsage(val id: Int) {
        VIEWPORT_USAGE_2D(0),
        VIEWPORT_USAGE_2D_NO_SAMPLING(1),
        VIEWPORT_USAGE_3D(2),
        VIEWPORT_USAGE_3D_NO_EFFECTS(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EnvironmentBG(val id: Int) {
        ENV_BG_CLEAR_COLOR(0),
        ENV_BG_COLOR(1),
        ENV_BG_SKY(2),
        ENV_BG_COLOR_SKY(3),
        ENV_BG_CANVAS(4),
        ENV_BG_KEEP(5),
        ENV_BG_MAX(6),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LightOmniShadowMode(val id: Int) {
        LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),
        LIGHT_OMNI_SHADOW_CUBE(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class TextureFlags(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Features(val id: Int) {
        FEATURE_SHADERS(0),
        FEATURE_MULTITHREADED(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class InstanceType(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EnvironmentSSAOBlur(val id: Int) {
        ENV_SSAO_BLUR_DISABLED(0),
        ENV_SSAO_BLUR_1x1(1),
        ENV_SSAO_BLUR_2x2(2),
        ENV_SSAO_BLUR_3x3(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EnvironmentToneMapper(val id: Int) {
        ENV_TONE_MAPPER_LINEAR(0),
        ENV_TONE_MAPPER_REINHARDT(1),
        ENV_TONE_MAPPER_FILMIC(2),
        ENV_TONE_MAPPER_ACES(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class EnvironmentGlowBlendMode(val id: Int) {
        GLOW_BLEND_MODE_ADDITIVE(0),
        GLOW_BLEND_MODE_SCREEN(1),
        GLOW_BLEND_MODE_SOFTLIGHT(2),
        GLOW_BLEND_MODE_REPLACE(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class MultimeshColorFormat(val id: Int) {
        MULTIMESH_COLOR_NONE(0),
        MULTIMESH_COLOR_8BIT(1),
        MULTIMESH_COLOR_FLOAT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class CanvasLightShadowFilter(val id: Int) {
        CANVAS_LIGHT_FILTER_NONE(0),
        CANVAS_LIGHT_FILTER_PCF3(1),
        CANVAS_LIGHT_FILTER_PCF5(2),
        CANVAS_LIGHT_FILTER_PCF7(3),
        CANVAS_LIGHT_FILTER_PCF9(4),
        CANVAS_LIGHT_FILTER_PCF13(5),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ScenarioDebugMode(val id: Int) {
        SCENARIO_DEBUG_DISABLED(0),
        SCENARIO_DEBUG_WIREFRAME(1),
        SCENARIO_DEBUG_OVERDRAW(2),
        SCENARIO_DEBUG_SHADELESS(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ViewportUpdateMode(val id: Int) {
        VIEWPORT_UPDATE_DISABLED(0),
        VIEWPORT_UPDATE_ONCE(1),
        VIEWPORT_UPDATE_WHEN_VISIBLE(2),
        VIEWPORT_UPDATE_ALWAYS(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ArrayFormat(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ParticlesDrawOrder(val id: Int) {
        PARTICLES_DRAW_ORDER_INDEX(0),
        PARTICLES_DRAW_ORDER_LIFETIME(1),
        PARTICLES_DRAW_ORDER_VIEW_DEPTH(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class CanvasLightMode(val id: Int) {
        CANVAS_LIGHT_MODE_ADD(0),
        CANVAS_LIGHT_MODE_SUB(1),
        CANVAS_LIGHT_MODE_MIX(2),
        CANVAS_LIGHT_MODE_MASK(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LightDirectionalShadowMode(val id: Int) {
        LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),
        LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),
        LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LightParam(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ArrayType(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class CanvasOccluderPolygonCullMode(val id: Int) {
        CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),
        CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),
        CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class InstanceFlags(val id: Int) {
        INSTANCE_FLAG_USE_BAKED_LIGHT(0),
        INSTANCE_FLAG_MAX(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ViewportMSAA(val id: Int) {
        VIEWPORT_MSAA_DISABLED(0),
        VIEWPORT_MSAA_2X(1),
        VIEWPORT_MSAA_4X(2),
        VIEWPORT_MSAA_8X(3),
        VIEWPORT_MSAA_16X(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LightType(val id: Int) {
        LIGHT_DIRECTIONAL(0),
        LIGHT_OMNI(1),
        LIGHT_SPOT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class CubeMapSide(val id: Int) {
        CUBEMAP_LEFT(0),
        CUBEMAP_RIGHT(1),
        CUBEMAP_BOTTOM(2),
        CUBEMAP_TOP(3),
        CUBEMAP_FRONT(4),
        CUBEMAP_BACK(5),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val NO_INDEX_ARRAY: Int = -1
        const val ARRAY_WEIGHTS_SIZE: Int = 4
        const val CANVAS_ITEM_Z_MIN: Int = -4096
        const val CANVAS_ITEM_Z_MAX: Int = 4096
        const val MAX_GLOW_LEVELS: Int = 7
        const val MAX_CURSORS: Int = 8
        const val MATERIAL_RENDER_PRIORITY_MIN: Int = -128
        const val MATERIAL_RENDER_PRIORITY_MAX: Int = 127
        const val CUBEMAP_LEFT: Int = 0
        const val CUBEMAP_RIGHT: Int = 1
        const val CUBEMAP_BOTTOM: Int = 2
        const val CUBEMAP_TOP: Int = 3
        const val CUBEMAP_FRONT: Int = 4
        const val CUBEMAP_BACK: Int = 5
        const val TEXTURE_FLAG_MIPMAPS: Int = 1
        const val TEXTURE_FLAG_REPEAT: Int = 2
        const val TEXTURE_FLAG_FILTER: Int = 4
        const val TEXTURE_FLAG_ANISOTROPIC_FILTER: Int = 8
        const val TEXTURE_FLAG_CONVERT_TO_LINEAR: Int = 16
        const val TEXTURE_FLAG_MIRRORED_REPEAT: Int = 32
        const val TEXTURE_FLAG_CUBEMAP: Int = 2048
        const val TEXTURE_FLAG_USED_FOR_STREAMING: Int = 4096
        const val TEXTURE_FLAGS_DEFAULT: Int = 7
        const val SHADER_SPATIAL: Int = 0
        const val SHADER_CANVAS_ITEM: Int = 1
        const val SHADER_PARTICLES: Int = 2
        const val SHADER_MAX: Int = 3
        const val ARRAY_VERTEX: Int = 0
        const val ARRAY_NORMAL: Int = 1
        const val ARRAY_TANGENT: Int = 2
        const val ARRAY_COLOR: Int = 3
        const val ARRAY_TEX_UV: Int = 4
        const val ARRAY_TEX_UV2: Int = 5
        const val ARRAY_BONES: Int = 6
        const val ARRAY_WEIGHTS: Int = 7
        const val ARRAY_INDEX: Int = 8
        const val ARRAY_MAX: Int = 9
        const val ARRAY_FORMAT_VERTEX: Int = 1
        const val ARRAY_FORMAT_NORMAL: Int = 2
        const val ARRAY_FORMAT_TANGENT: Int = 4
        const val ARRAY_FORMAT_COLOR: Int = 8
        const val ARRAY_FORMAT_TEX_UV: Int = 16
        const val ARRAY_FORMAT_TEX_UV2: Int = 32
        const val ARRAY_FORMAT_BONES: Int = 64
        const val ARRAY_FORMAT_WEIGHTS: Int = 128
        const val ARRAY_FORMAT_INDEX: Int = 256
        const val ARRAY_COMPRESS_VERTEX: Int = 512
        const val ARRAY_COMPRESS_NORMAL: Int = 1024
        const val ARRAY_COMPRESS_TANGENT: Int = 2048
        const val ARRAY_COMPRESS_COLOR: Int = 4096
        const val ARRAY_COMPRESS_TEX_UV: Int = 8192
        const val ARRAY_COMPRESS_TEX_UV2: Int = 16384
        const val ARRAY_COMPRESS_BONES: Int = 32768
        const val ARRAY_COMPRESS_WEIGHTS: Int = 65536
        const val ARRAY_COMPRESS_INDEX: Int = 131072
        const val ARRAY_FLAG_USE_2D_VERTICES: Int = 262144
        const val ARRAY_FLAG_USE_16_BIT_BONES: Int = 524288
        const val ARRAY_COMPRESS_DEFAULT: Int = 97280
        const val PRIMITIVE_POINTS: Int = 0
        const val PRIMITIVE_LINES: Int = 1
        const val PRIMITIVE_LINE_STRIP: Int = 2
        const val PRIMITIVE_LINE_LOOP: Int = 3
        const val PRIMITIVE_TRIANGLES: Int = 4
        const val PRIMITIVE_TRIANGLE_STRIP: Int = 5
        const val PRIMITIVE_TRIANGLE_FAN: Int = 6
        const val PRIMITIVE_MAX: Int = 7
        const val BLEND_SHAPE_MODE_NORMALIZED: Int = 0
        const val BLEND_SHAPE_MODE_RELATIVE: Int = 1
        const val LIGHT_DIRECTIONAL: Int = 0
        const val LIGHT_OMNI: Int = 1
        const val LIGHT_SPOT: Int = 2
        const val LIGHT_PARAM_ENERGY: Int = 0
        const val LIGHT_PARAM_SPECULAR: Int = 2
        const val LIGHT_PARAM_RANGE: Int = 3
        const val LIGHT_PARAM_ATTENUATION: Int = 4
        const val LIGHT_PARAM_SPOT_ANGLE: Int = 5
        const val LIGHT_PARAM_SPOT_ATTENUATION: Int = 6
        const val LIGHT_PARAM_CONTACT_SHADOW_SIZE: Int = 7
        const val LIGHT_PARAM_SHADOW_MAX_DISTANCE: Int = 8
        const val LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9
        const val LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10
        const val LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11
        const val LIGHT_PARAM_SHADOW_NORMAL_BIAS: Int = 12
        const val LIGHT_PARAM_SHADOW_BIAS: Int = 13
        const val LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14
        const val LIGHT_PARAM_MAX: Int = 15
        const val LIGHT_OMNI_SHADOW_DUAL_PARABOLOID: Int = 0
        const val LIGHT_OMNI_SHADOW_CUBE: Int = 1
        const val LIGHT_OMNI_SHADOW_DETAIL_VERTICAL: Int = 0
        const val LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL: Int = 1
        const val LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL: Int = 0
        const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS: Int = 1
        const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS: Int = 2
        const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE: Int = 0
        const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED: Int = 1
        const val VIEWPORT_UPDATE_DISABLED: Int = 0
        const val VIEWPORT_UPDATE_ONCE: Int = 1
        const val VIEWPORT_UPDATE_WHEN_VISIBLE: Int = 2
        const val VIEWPORT_UPDATE_ALWAYS: Int = 3
        const val VIEWPORT_CLEAR_ALWAYS: Int = 0
        const val VIEWPORT_CLEAR_NEVER: Int = 1
        const val VIEWPORT_CLEAR_ONLY_NEXT_FRAME: Int = 2
        const val VIEWPORT_MSAA_DISABLED: Int = 0
        const val VIEWPORT_MSAA_2X: Int = 1
        const val VIEWPORT_MSAA_4X: Int = 2
        const val VIEWPORT_MSAA_8X: Int = 3
        const val VIEWPORT_MSAA_16X: Int = 4
        const val VIEWPORT_USAGE_2D: Int = 0
        const val VIEWPORT_USAGE_2D_NO_SAMPLING: Int = 1
        const val VIEWPORT_USAGE_3D: Int = 2
        const val VIEWPORT_USAGE_3D_NO_EFFECTS: Int = 3
        const val VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME: Int = 0
        const val VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME: Int = 1
        const val VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2
        const val VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME: Int = 3
        const val VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Int = 4
        const val VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME: Int = 5
        const val VIEWPORT_RENDER_INFO_MAX: Int = 6
        const val VIEWPORT_DEBUG_DRAW_DISABLED: Int = 0
        const val VIEWPORT_DEBUG_DRAW_UNSHADED: Int = 1
        const val VIEWPORT_DEBUG_DRAW_OVERDRAW: Int = 2
        const val VIEWPORT_DEBUG_DRAW_WIREFRAME: Int = 3
        const val SCENARIO_DEBUG_DISABLED: Int = 0
        const val SCENARIO_DEBUG_WIREFRAME: Int = 1
        const val SCENARIO_DEBUG_OVERDRAW: Int = 2
        const val SCENARIO_DEBUG_SHADELESS: Int = 3
        const val INSTANCE_NONE: Int = 0
        const val INSTANCE_MESH: Int = 1
        const val INSTANCE_MULTIMESH: Int = 2
        const val INSTANCE_IMMEDIATE: Int = 3
        const val INSTANCE_PARTICLES: Int = 4
        const val INSTANCE_LIGHT: Int = 5
        const val INSTANCE_REFLECTION_PROBE: Int = 6
        const val INSTANCE_GI_PROBE: Int = 7
        const val INSTANCE_LIGHTMAP_CAPTURE: Int = 8
        const val INSTANCE_MAX: Int = 9
        const val INSTANCE_GEOMETRY_MASK: Int = 30
        const val INSTANCE_FLAG_USE_BAKED_LIGHT: Int = 0
        const val INSTANCE_FLAG_MAX: Int = 1
        const val SHADOW_CASTING_SETTING_OFF: Int = 0
        const val SHADOW_CASTING_SETTING_ON: Int = 1
        const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Int = 2
        const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Int = 3
        const val NINE_PATCH_STRETCH: Int = 0
        const val NINE_PATCH_TILE: Int = 1
        const val NINE_PATCH_TILE_FIT: Int = 2
        const val CANVAS_LIGHT_MODE_ADD: Int = 0
        const val CANVAS_LIGHT_MODE_SUB: Int = 1
        const val CANVAS_LIGHT_MODE_MIX: Int = 2
        const val CANVAS_LIGHT_MODE_MASK: Int = 3
        const val CANVAS_LIGHT_FILTER_NONE: Int = 0
        const val CANVAS_LIGHT_FILTER_PCF3: Int = 1
        const val CANVAS_LIGHT_FILTER_PCF5: Int = 2
        const val CANVAS_LIGHT_FILTER_PCF7: Int = 3
        const val CANVAS_LIGHT_FILTER_PCF9: Int = 4
        const val CANVAS_LIGHT_FILTER_PCF13: Int = 5
        const val CANVAS_OCCLUDER_POLYGON_CULL_DISABLED: Int = 0
        const val CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE: Int = 1
        const val CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE: Int = 2
        const val INFO_OBJECTS_IN_FRAME: Int = 0
        const val INFO_VERTICES_IN_FRAME: Int = 1
        const val INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2
        const val INFO_SHADER_CHANGES_IN_FRAME: Int = 3
        const val INFO_SURFACE_CHANGES_IN_FRAME: Int = 4
        const val INFO_DRAW_CALLS_IN_FRAME: Int = 5
        const val INFO_USAGE_VIDEO_MEM_TOTAL: Int = 6
        const val INFO_VIDEO_MEM_USED: Int = 7
        const val INFO_TEXTURE_MEM_USED: Int = 8
        const val INFO_VERTEX_MEM_USED: Int = 9
        const val FEATURE_SHADERS: Int = 0
        const val FEATURE_MULTITHREADED: Int = 1
        const val MULTIMESH_TRANSFORM_2D: Int = 0
        const val MULTIMESH_TRANSFORM_3D: Int = 1
        const val MULTIMESH_COLOR_NONE: Int = 0
        const val MULTIMESH_COLOR_8BIT: Int = 1
        const val MULTIMESH_COLOR_FLOAT: Int = 2
        const val REFLECTION_PROBE_UPDATE_ONCE: Int = 0
        const val REFLECTION_PROBE_UPDATE_ALWAYS: Int = 1
        const val PARTICLES_DRAW_ORDER_INDEX: Int = 0
        const val PARTICLES_DRAW_ORDER_LIFETIME: Int = 1
        const val PARTICLES_DRAW_ORDER_VIEW_DEPTH: Int = 2
        const val ENV_BG_CLEAR_COLOR: Int = 0
        const val ENV_BG_COLOR: Int = 1
        const val ENV_BG_SKY: Int = 2
        const val ENV_BG_COLOR_SKY: Int = 3
        const val ENV_BG_CANVAS: Int = 4
        const val ENV_BG_KEEP: Int = 5
        const val ENV_BG_MAX: Int = 6
        const val ENV_DOF_BLUR_QUALITY_LOW: Int = 0
        const val ENV_DOF_BLUR_QUALITY_MEDIUM: Int = 1
        const val ENV_DOF_BLUR_QUALITY_HIGH: Int = 2
        const val GLOW_BLEND_MODE_ADDITIVE: Int = 0
        const val GLOW_BLEND_MODE_SCREEN: Int = 1
        const val GLOW_BLEND_MODE_SOFTLIGHT: Int = 2
        const val GLOW_BLEND_MODE_REPLACE: Int = 3
        const val ENV_TONE_MAPPER_LINEAR: Int = 0
        const val ENV_TONE_MAPPER_REINHARDT: Int = 1
        const val ENV_TONE_MAPPER_FILMIC: Int = 2
        const val ENV_TONE_MAPPER_ACES: Int = 3
        const val ENV_SSAO_QUALITY_LOW: Int = 0
        const val ENV_SSAO_QUALITY_MEDIUM: Int = 1
        const val ENV_SSAO_QUALITY_HIGH: Int = 2
        const val ENV_SSAO_BLUR_DISABLED: Int = 0
        const val ENV_SSAO_BLUR_1x1: Int = 1
        const val ENV_SSAO_BLUR_2x2: Int = 2
        const val ENV_SSAO_BLUR_3x3: Int = 3


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
        fun textureCreateFromImage(image: Image, flags: Int = 7): RID {
            return _icall_RID_Object_Int(textureCreateFromImageMethodBind, this.rawMemory, image, flags)
        }


        private val textureAllocateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_allocate") }
        fun textureAllocate(texture: RID, width: Int, height: Int, format: Int, flags: Int = 7) {
            _icall_Unit_RID_Int_Int_Int_Int(textureAllocateMethodBind, this.rawMemory, texture, width, height, format, flags)
        }


        private val textureSetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_data") }
        fun textureSetData(texture: RID, image: Image, cubeSide: Int = 0) {
            _icall_Unit_RID_Object_Int(textureSetDataMethodBind, this.rawMemory, texture, image, cubeSide)
        }


        private val textureSetDataPartialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_data_partial") }
        fun textureSetDataPartial(texture: RID, image: Image, srcX: Int, srcY: Int, srcW: Int, srcH: Int, dstX: Int, dstY: Int, dstMip: Int, cubeSide: Int = 0) {
            _icall_Unit_RID_Object_Int_Int_Int_Int_Int_Int_Int_Int(textureSetDataPartialMethodBind, this.rawMemory, texture, image, srcX, srcY, srcW, srcH, dstX, dstY, dstMip, cubeSide)
        }


        private val textureGetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_data") }
        fun textureGetData(texture: RID, cubeSide: Int = 0): Image {
            return _icall_Image_RID_Int(textureGetDataMethodBind, this.rawMemory, texture, cubeSide)
        }


        private val textureSetFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_flags") }
        fun textureSetFlags(texture: RID, flags: Int) {
            _icall_Unit_RID_Int(textureSetFlagsMethodBind, this.rawMemory, texture, flags)
        }


        private val textureGetFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_flags") }
        fun textureGetFlags(texture: RID): Int {
            return _icall_Int_RID(textureGetFlagsMethodBind, this.rawMemory, texture)
        }


        private val textureGetFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_format") }
        fun textureGetFormat(texture: RID): Image.Format {
            return Image.Format.fromInt(_icall_Int_RID(textureGetFormatMethodBind, this.rawMemory, texture))
        }


        private val textureGetTexidMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_texid") }
        fun textureGetTexid(texture: RID): Int {
            return _icall_Int_RID(textureGetTexidMethodBind, this.rawMemory, texture)
        }


        private val textureGetWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_width") }
        fun textureGetWidth(texture: RID): Int {
            return _icall_Int_RID(textureGetWidthMethodBind, this.rawMemory, texture)
        }


        private val textureGetHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_get_height") }
        fun textureGetHeight(texture: RID): Int {
            return _icall_Int_RID(textureGetHeightMethodBind, this.rawMemory, texture)
        }


        private val textureSetSizeOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "texture_set_size_override") }
        fun textureSetSizeOverride(texture: RID, width: Int, height: Int) {
            _icall_Unit_RID_Int_Int(textureSetSizeOverrideMethodBind, this.rawMemory, texture, width, height)
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
        fun skySetTexture(sky: RID, cubeMap: RID, radianceSize: Int) {
            _icall_Unit_RID_RID_Int(skySetTextureMethodBind, this.rawMemory, sky, cubeMap, radianceSize)
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
        fun materialSetRenderPriority(material: RID, priority: Int) {
            _icall_Unit_RID_Int(materialSetRenderPriorityMethodBind, this.rawMemory, material, priority)
        }


        private val materialSetLineWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "material_set_line_width") }
        fun materialSetLineWidth(material: RID, width: Float) {
            _icall_Unit_RID_Float(materialSetLineWidthMethodBind, this.rawMemory, material, width)
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
        fun meshAddSurfaceFromArrays(mesh: RID, primtive: Int, arrays: GDArray, blendShapes: GDArray = GDArray(), compressFormat: Int = 97280) {
            _icall_Unit_RID_Int_GDArray_GDArray_Int(meshAddSurfaceFromArraysMethodBind, this.rawMemory, mesh, primtive, arrays, blendShapes, compressFormat)
        }


        private val meshSetBlendShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_set_blend_shape_count") }
        fun meshSetBlendShapeCount(mesh: RID, amount: Int) {
            _icall_Unit_RID_Int(meshSetBlendShapeCountMethodBind, this.rawMemory, mesh, amount)
        }


        private val meshGetBlendShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_blend_shape_count") }
        fun meshGetBlendShapeCount(mesh: RID): Int {
            return _icall_Int_RID(meshGetBlendShapeCountMethodBind, this.rawMemory, mesh)
        }


        private val meshSetBlendShapeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_set_blend_shape_mode") }
        fun meshSetBlendShapeMode(mesh: RID, mode: Int) {
            _icall_Unit_RID_Int(meshSetBlendShapeModeMethodBind, this.rawMemory, mesh, mode)
        }


        private val meshGetBlendShapeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_blend_shape_mode") }
        fun meshGetBlendShapeMode(mesh: RID): VisualServer.BlendShapeMode {
            return VisualServer.BlendShapeMode.fromInt(_icall_Int_RID(meshGetBlendShapeModeMethodBind, this.rawMemory, mesh))
        }


        private val meshSurfaceSetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_set_material") }
        fun meshSurfaceSetMaterial(mesh: RID, surface: Int, material: RID) {
            _icall_Unit_RID_Int_RID(meshSurfaceSetMaterialMethodBind, this.rawMemory, mesh, surface, material)
        }


        private val meshSurfaceGetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_material") }
        fun meshSurfaceGetMaterial(mesh: RID, surface: Int): RID {
            return _icall_RID_RID_Int(meshSurfaceGetMaterialMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArrayLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_array_len") }
        fun meshSurfaceGetArrayLen(mesh: RID, surface: Int): Int {
            return _icall_Int_RID_Int(meshSurfaceGetArrayLenMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArrayIndexLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_array_index_len") }
        fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Int): Int {
            return _icall_Int_RID_Int(meshSurfaceGetArrayIndexLenMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_array") }
        fun meshSurfaceGetArray(mesh: RID, surface: Int): PoolByteArray {
            return _icall_PoolByteArray_RID_Int(meshSurfaceGetArrayMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetIndexArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_index_array") }
        fun meshSurfaceGetIndexArray(mesh: RID, surface: Int): PoolByteArray {
            return _icall_PoolByteArray_RID_Int(meshSurfaceGetIndexArrayMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_arrays") }
        fun meshSurfaceGetArrays(mesh: RID, surface: Int): GDArray {
            return _icall_GDArray_RID_Int(meshSurfaceGetArraysMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetBlendShapeArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_blend_shape_arrays") }
        fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Int): GDArray {
            return _icall_GDArray_RID_Int(meshSurfaceGetBlendShapeArraysMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_format") }
        fun meshSurfaceGetFormat(mesh: RID, surface: Int): Int {
            return _icall_Int_RID_Int(meshSurfaceGetFormatMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetPrimitiveTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_primitive_type") }
        fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Int): VisualServer.PrimitiveType {
            return VisualServer.PrimitiveType.fromInt(_icall_Int_RID_Int(meshSurfaceGetPrimitiveTypeMethodBind, this.rawMemory, mesh, surface))
        }


        private val meshSurfaceGetAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_aabb") }
        fun meshSurfaceGetAabb(mesh: RID, surface: Int): AABB {
            return _icall_AABB_RID_Int(meshSurfaceGetAabbMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshSurfaceGetSkeletonAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_surface_get_skeleton_aabb") }
        fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Int): GDArray {
            return _icall_GDArray_RID_Int(meshSurfaceGetSkeletonAabbMethodBind, this.rawMemory, mesh, surface)
        }


        private val meshRemoveSurfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_remove_surface") }
        fun meshRemoveSurface(mesh: RID, index: Int) {
            _icall_Unit_RID_Int(meshRemoveSurfaceMethodBind, this.rawMemory, mesh, index)
        }


        private val meshGetSurfaceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "mesh_get_surface_count") }
        fun meshGetSurfaceCount(mesh: RID): Int {
            return _icall_Int_RID(meshGetSurfaceCountMethodBind, this.rawMemory, mesh)
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
        fun multimeshAllocate(multimesh: RID, instances: Int, transformFormat: Int, colorFormat: Int, customDataFormat: Int = 0) {
            _icall_Unit_RID_Int_Int_Int_Int(multimeshAllocateMethodBind, this.rawMemory, multimesh, instances, transformFormat, colorFormat, customDataFormat)
        }


        private val multimeshGetInstanceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_get_instance_count") }
        fun multimeshGetInstanceCount(multimesh: RID): Int {
            return _icall_Int_RID(multimeshGetInstanceCountMethodBind, this.rawMemory, multimesh)
        }


        private val multimeshSetMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_set_mesh") }
        fun multimeshSetMesh(multimesh: RID, mesh: RID) {
            _icall_Unit_RID_RID(multimeshSetMeshMethodBind, this.rawMemory, multimesh, mesh)
        }


        private val multimeshInstanceSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_transform") }
        fun multimeshInstanceSetTransform(multimesh: RID, index: Int, transform: Transform) {
            _icall_Unit_RID_Int_Transform(multimeshInstanceSetTransformMethodBind, this.rawMemory, multimesh, index, transform)
        }


        private val multimeshInstanceSetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_transform_2d") }
        fun multimeshInstanceSetTransform2d(multimesh: RID, index: Int, transform: Transform2D) {
            _icall_Unit_RID_Int_Transform2D(multimeshInstanceSetTransform2dMethodBind, this.rawMemory, multimesh, index, transform)
        }


        private val multimeshInstanceSetColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_color") }
        fun multimeshInstanceSetColor(multimesh: RID, index: Int, color: Color) {
            _icall_Unit_RID_Int_Color(multimeshInstanceSetColorMethodBind, this.rawMemory, multimesh, index, color)
        }


        private val multimeshInstanceSetCustomDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_set_custom_data") }
        fun multimeshInstanceSetCustomData(multimesh: RID, index: Int, customData: Color) {
            _icall_Unit_RID_Int_Color(multimeshInstanceSetCustomDataMethodBind, this.rawMemory, multimesh, index, customData)
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
        fun multimeshInstanceGetTransform(multimesh: RID, index: Int): Transform {
            return _icall_Transform_RID_Int(multimeshInstanceGetTransformMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshInstanceGetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_transform_2d") }
        fun multimeshInstanceGetTransform2d(multimesh: RID, index: Int): Transform2D {
            return _icall_Transform2D_RID_Int(multimeshInstanceGetTransform2dMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshInstanceGetColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_color") }
        fun multimeshInstanceGetColor(multimesh: RID, index: Int): Color {
            return _icall_Color_RID_Int(multimeshInstanceGetColorMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshInstanceGetCustomDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_instance_get_custom_data") }
        fun multimeshInstanceGetCustomData(multimesh: RID, index: Int): Color {
            return _icall_Color_RID_Int(multimeshInstanceGetCustomDataMethodBind, this.rawMemory, multimesh, index)
        }


        private val multimeshSetVisibleInstancesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_set_visible_instances") }
        fun multimeshSetVisibleInstances(multimesh: RID, visible: Int) {
            _icall_Unit_RID_Int(multimeshSetVisibleInstancesMethodBind, this.rawMemory, multimesh, visible)
        }


        private val multimeshGetVisibleInstancesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "multimesh_get_visible_instances") }
        fun multimeshGetVisibleInstances(multimesh: RID): Int {
            return _icall_Int_RID(multimeshGetVisibleInstancesMethodBind, this.rawMemory, multimesh)
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
        fun immediateBegin(immediate: RID, primitive: Int, texture: RID = RID()) {
            _icall_Unit_RID_Int_RID(immediateBeginMethodBind, this.rawMemory, immediate, primitive, texture)
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
        fun skeletonAllocate(skeleton: RID, bones: Int, is2dSkeleton: Boolean = false) {
            _icall_Unit_RID_Int_Boolean(skeletonAllocateMethodBind, this.rawMemory, skeleton, bones, is2dSkeleton)
        }


        private val skeletonGetBoneCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_get_bone_count") }
        fun skeletonGetBoneCount(skeleton: RID): Int {
            return _icall_Int_RID(skeletonGetBoneCountMethodBind, this.rawMemory, skeleton)
        }


        private val skeletonBoneSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_set_transform") }
        fun skeletonBoneSetTransform(skeleton: RID, bone: Int, transform: Transform) {
            _icall_Unit_RID_Int_Transform(skeletonBoneSetTransformMethodBind, this.rawMemory, skeleton, bone, transform)
        }


        private val skeletonBoneGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_get_transform") }
        fun skeletonBoneGetTransform(skeleton: RID, bone: Int): Transform {
            return _icall_Transform_RID_Int(skeletonBoneGetTransformMethodBind, this.rawMemory, skeleton, bone)
        }


        private val skeletonBoneSetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_set_transform_2d") }
        fun skeletonBoneSetTransform2d(skeleton: RID, bone: Int, transform: Transform2D) {
            _icall_Unit_RID_Int_Transform2D(skeletonBoneSetTransform2dMethodBind, this.rawMemory, skeleton, bone, transform)
        }


        private val skeletonBoneGetTransform2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "skeleton_bone_get_transform_2d") }
        fun skeletonBoneGetTransform2d(skeleton: RID, bone: Int): Transform2D {
            return _icall_Transform2D_RID_Int(skeletonBoneGetTransform2dMethodBind, this.rawMemory, skeleton, bone)
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
        fun lightSetParam(light: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(lightSetParamMethodBind, this.rawMemory, light, param, value)
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
        fun lightSetCullMask(light: RID, mask: Int) {
            _icall_Unit_RID_Int(lightSetCullMaskMethodBind, this.rawMemory, light, mask)
        }


        private val lightSetReverseCullFaceModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_set_reverse_cull_face_mode") }
        fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(lightSetReverseCullFaceModeMethodBind, this.rawMemory, light, enabled)
        }


        private val lightOmniSetShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_omni_set_shadow_mode") }
        fun lightOmniSetShadowMode(light: RID, mode: Int) {
            _icall_Unit_RID_Int(lightOmniSetShadowModeMethodBind, this.rawMemory, light, mode)
        }


        private val lightOmniSetShadowDetailMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_omni_set_shadow_detail") }
        fun lightOmniSetShadowDetail(light: RID, detail: Int) {
            _icall_Unit_RID_Int(lightOmniSetShadowDetailMethodBind, this.rawMemory, light, detail)
        }


        private val lightDirectionalSetShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_directional_set_shadow_mode") }
        fun lightDirectionalSetShadowMode(light: RID, mode: Int) {
            _icall_Unit_RID_Int(lightDirectionalSetShadowModeMethodBind, this.rawMemory, light, mode)
        }


        private val lightDirectionalSetBlendSplitsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_directional_set_blend_splits") }
        fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(lightDirectionalSetBlendSplitsMethodBind, this.rawMemory, light, enable)
        }


        private val lightDirectionalSetShadowDepthRangeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "light_directional_set_shadow_depth_range_mode") }
        fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Int) {
            _icall_Unit_RID_Int(lightDirectionalSetShadowDepthRangeModeMethodBind, this.rawMemory, light, rangeMode)
        }


        private val reflectionProbeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_create") }
        fun reflectionProbeCreate(): RID {
            return _icall_RID(reflectionProbeCreateMethodBind, this.rawMemory)
        }


        private val reflectionProbeSetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_update_mode") }
        fun reflectionProbeSetUpdateMode(probe: RID, mode: Int) {
            _icall_Unit_RID_Int(reflectionProbeSetUpdateModeMethodBind, this.rawMemory, probe, mode)
        }


        private val reflectionProbeSetIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_intensity") }
        fun reflectionProbeSetIntensity(probe: RID, intensity: Float) {
            _icall_Unit_RID_Float(reflectionProbeSetIntensityMethodBind, this.rawMemory, probe, intensity)
        }


        private val reflectionProbeSetInteriorAmbientMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_interior_ambient") }
        fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color) {
            _icall_Unit_RID_Color(reflectionProbeSetInteriorAmbientMethodBind, this.rawMemory, probe, color)
        }


        private val reflectionProbeSetInteriorAmbientEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_interior_ambient_energy") }
        fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Float) {
            _icall_Unit_RID_Float(reflectionProbeSetInteriorAmbientEnergyMethodBind, this.rawMemory, probe, energy)
        }


        private val reflectionProbeSetInteriorAmbientProbeContributionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_interior_ambient_probe_contribution") }
        fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Float) {
            _icall_Unit_RID_Float(reflectionProbeSetInteriorAmbientProbeContributionMethodBind, this.rawMemory, probe, contrib)
        }


        private val reflectionProbeSetMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "reflection_probe_set_max_distance") }
        fun reflectionProbeSetMaxDistance(probe: RID, distance: Float) {
            _icall_Unit_RID_Float(reflectionProbeSetMaxDistanceMethodBind, this.rawMemory, probe, distance)
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
        fun reflectionProbeSetCullMask(probe: RID, layers: Int) {
            _icall_Unit_RID_Int(reflectionProbeSetCullMaskMethodBind, this.rawMemory, probe, layers)
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
        fun giProbeSetCellSize(probe: RID, range: Float) {
            _icall_Unit_RID_Float(giProbeSetCellSizeMethodBind, this.rawMemory, probe, range)
        }


        private val giProbeGetCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_cell_size") }
        fun giProbeGetCellSize(probe: RID): Float {
            return _icall_Float_RID(giProbeGetCellSizeMethodBind, this.rawMemory, probe)
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
        fun giProbeSetDynamicRange(range: RID, arg1: Int) {
            _icall_Unit_RID_Int(giProbeSetDynamicRangeMethodBind, this.rawMemory, range, arg1)
        }


        private val giProbeGetDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_dynamic_range") }
        fun giProbeGetDynamicRange(arg0: RID): Int {
            return _icall_Int_RID(giProbeGetDynamicRangeMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_energy") }
        fun giProbeSetEnergy(energy: RID, arg1: Float) {
            _icall_Unit_RID_Float(giProbeSetEnergyMethodBind, this.rawMemory, energy, arg1)
        }


        private val giProbeGetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_energy") }
        fun giProbeGetEnergy(arg0: RID): Float {
            return _icall_Float_RID(giProbeGetEnergyMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_bias") }
        fun giProbeSetBias(bias: RID, arg1: Float) {
            _icall_Unit_RID_Float(giProbeSetBiasMethodBind, this.rawMemory, bias, arg1)
        }


        private val giProbeGetBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_bias") }
        fun giProbeGetBias(arg0: RID): Float {
            return _icall_Float_RID(giProbeGetBiasMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_normal_bias") }
        fun giProbeSetNormalBias(bias: RID, arg1: Float) {
            _icall_Unit_RID_Float(giProbeSetNormalBiasMethodBind, this.rawMemory, bias, arg1)
        }


        private val giProbeGetNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_normal_bias") }
        fun giProbeGetNormalBias(arg0: RID): Float {
            return _icall_Float_RID(giProbeGetNormalBiasMethodBind, this.rawMemory, arg0)
        }


        private val giProbeSetPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_set_propagation") }
        fun giProbeSetPropagation(propagation: RID, arg1: Float) {
            _icall_Unit_RID_Float(giProbeSetPropagationMethodBind, this.rawMemory, propagation, arg1)
        }


        private val giProbeGetPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "gi_probe_get_propagation") }
        fun giProbeGetPropagation(arg0: RID): Float {
            return _icall_Float_RID(giProbeGetPropagationMethodBind, this.rawMemory, arg0)
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
        fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Int) {
            _icall_Unit_RID_Int(lightmapCaptureSetOctreeCellSubdivMethodBind, this.rawMemory, capture, subdiv)
        }


        private val lightmapCaptureGetOctreeCellSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_octree_cell_subdiv") }
        fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Int {
            return _icall_Int_RID(lightmapCaptureGetOctreeCellSubdivMethodBind, this.rawMemory, capture)
        }


        private val lightmapCaptureGetOctreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_octree") }
        fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
            return _icall_PoolByteArray_RID(lightmapCaptureGetOctreeMethodBind, this.rawMemory, capture)
        }


        private val lightmapCaptureSetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_set_energy") }
        fun lightmapCaptureSetEnergy(capture: RID, energy: Float) {
            _icall_Unit_RID_Float(lightmapCaptureSetEnergyMethodBind, this.rawMemory, capture, energy)
        }


        private val lightmapCaptureGetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "lightmap_capture_get_energy") }
        fun lightmapCaptureGetEnergy(capture: RID): Float {
            return _icall_Float_RID(lightmapCaptureGetEnergyMethodBind, this.rawMemory, capture)
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
        fun particlesSetAmount(particles: RID, amount: Int) {
            _icall_Unit_RID_Int(particlesSetAmountMethodBind, this.rawMemory, particles, amount)
        }


        private val particlesSetLifetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_lifetime") }
        fun particlesSetLifetime(particles: RID, lifetime: Float) {
            _icall_Unit_RID_Float(particlesSetLifetimeMethodBind, this.rawMemory, particles, lifetime)
        }


        private val particlesSetOneShotMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_one_shot") }
        fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
            _icall_Unit_RID_Boolean(particlesSetOneShotMethodBind, this.rawMemory, particles, oneShot)
        }


        private val particlesSetPreProcessTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_pre_process_time") }
        fun particlesSetPreProcessTime(particles: RID, time: Float) {
            _icall_Unit_RID_Float(particlesSetPreProcessTimeMethodBind, this.rawMemory, particles, time)
        }


        private val particlesSetExplosivenessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_explosiveness_ratio") }
        fun particlesSetExplosivenessRatio(particles: RID, ratio: Float) {
            _icall_Unit_RID_Float(particlesSetExplosivenessRatioMethodBind, this.rawMemory, particles, ratio)
        }


        private val particlesSetRandomnessRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_randomness_ratio") }
        fun particlesSetRandomnessRatio(particles: RID, ratio: Float) {
            _icall_Unit_RID_Float(particlesSetRandomnessRatioMethodBind, this.rawMemory, particles, ratio)
        }


        private val particlesSetCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_custom_aabb") }
        fun particlesSetCustomAabb(particles: RID, aabb: AABB) {
            _icall_Unit_RID_AABB(particlesSetCustomAabbMethodBind, this.rawMemory, particles, aabb)
        }


        private val particlesSetSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_speed_scale") }
        fun particlesSetSpeedScale(particles: RID, scale: Float) {
            _icall_Unit_RID_Float(particlesSetSpeedScaleMethodBind, this.rawMemory, particles, scale)
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
        fun particlesSetFixedFps(particles: RID, fps: Int) {
            _icall_Unit_RID_Int(particlesSetFixedFpsMethodBind, this.rawMemory, particles, fps)
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
        fun particlesSetDrawOrder(particles: RID, order: Int) {
            _icall_Unit_RID_Int(particlesSetDrawOrderMethodBind, this.rawMemory, particles, order)
        }


        private val particlesSetDrawPassesMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_draw_passes") }
        fun particlesSetDrawPasses(particles: RID, count: Int) {
            _icall_Unit_RID_Int(particlesSetDrawPassesMethodBind, this.rawMemory, particles, count)
        }


        private val particlesSetDrawPassMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "particles_set_draw_pass_mesh") }
        fun particlesSetDrawPassMesh(particles: RID, pass: Int, mesh: RID) {
            _icall_Unit_RID_Int_RID(particlesSetDrawPassMeshMethodBind, this.rawMemory, particles, pass, mesh)
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
        fun cameraSetPerspective(camera: RID, fovyDegrees: Float, zNear: Float, zFar: Float) {
            _icall_Unit_RID_Float_Float_Float(cameraSetPerspectiveMethodBind, this.rawMemory, camera, fovyDegrees, zNear, zFar)
        }


        private val cameraSetOrthogonalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_orthogonal") }
        fun cameraSetOrthogonal(camera: RID, size: Float, zNear: Float, zFar: Float) {
            _icall_Unit_RID_Float_Float_Float(cameraSetOrthogonalMethodBind, this.rawMemory, camera, size, zNear, zFar)
        }


        private val cameraSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_transform") }
        fun cameraSetTransform(camera: RID, transform: Transform) {
            _icall_Unit_RID_Transform(cameraSetTransformMethodBind, this.rawMemory, camera, transform)
        }


        private val cameraSetCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "camera_set_cull_mask") }
        fun cameraSetCullMask(camera: RID, layers: Int) {
            _icall_Unit_RID_Int(cameraSetCullMaskMethodBind, this.rawMemory, camera, layers)
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
        fun viewportSetSize(viewport: RID, width: Int, height: Int) {
            _icall_Unit_RID_Int_Int(viewportSetSizeMethodBind, this.rawMemory, viewport, width, height)
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
        fun viewportAttachToScreen(viewport: RID, rect: Rect2 = Rect2(0, 0, 0, 0), screen: Int = 0) {
            _icall_Unit_RID_Rect2_Int(viewportAttachToScreenMethodBind, this.rawMemory, viewport, rect, screen)
        }


        private val viewportDetachMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_detach") }
        fun viewportDetach(viewport: RID) {
            _icall_Unit_RID(viewportDetachMethodBind, this.rawMemory, viewport)
        }


        private val viewportSetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_update_mode") }
        fun viewportSetUpdateMode(viewport: RID, updateMode: Int) {
            _icall_Unit_RID_Int(viewportSetUpdateModeMethodBind, this.rawMemory, viewport, updateMode)
        }


        private val viewportSetVflipMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_vflip") }
        fun viewportSetVflip(viewport: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetVflipMethodBind, this.rawMemory, viewport, enabled)
        }


        private val viewportSetClearModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_clear_mode") }
        fun viewportSetClearMode(viewport: RID, clearMode: Int) {
            _icall_Unit_RID_Int(viewportSetClearModeMethodBind, this.rawMemory, viewport, clearMode)
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
        fun viewportSetCanvasLayer(viewport: RID, canvas: RID, layer: Int) {
            _icall_Unit_RID_RID_Int(viewportSetCanvasLayerMethodBind, this.rawMemory, viewport, canvas, layer)
        }


        private val viewportSetShadowAtlasSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_shadow_atlas_size") }
        fun viewportSetShadowAtlasSize(viewport: RID, size: Int) {
            _icall_Unit_RID_Int(viewportSetShadowAtlasSizeMethodBind, this.rawMemory, viewport, size)
        }


        private val viewportSetShadowAtlasQuadrantSubdivisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_shadow_atlas_quadrant_subdivision") }
        fun viewportSetShadowAtlasQuadrantSubdivision(viewport: RID, quadrant: Int, subdivision: Int) {
            _icall_Unit_RID_Int_Int(viewportSetShadowAtlasQuadrantSubdivisionMethodBind, this.rawMemory, viewport, quadrant, subdivision)
        }


        private val viewportSetMsaaMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_msaa") }
        fun viewportSetMsaa(viewport: RID, msaa: Int) {
            _icall_Unit_RID_Int(viewportSetMsaaMethodBind, this.rawMemory, viewport, msaa)
        }


        private val viewportSetHdrMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_hdr") }
        fun viewportSetHdr(viewport: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(viewportSetHdrMethodBind, this.rawMemory, viewport, enabled)
        }


        private val viewportSetUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_usage") }
        fun viewportSetUsage(viewport: RID, usage: Int) {
            _icall_Unit_RID_Int(viewportSetUsageMethodBind, this.rawMemory, viewport, usage)
        }


        private val viewportGetRenderInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_get_render_info") }
        fun viewportGetRenderInfo(viewport: RID, info: Int): Int {
            return _icall_Int_RID_Int(viewportGetRenderInfoMethodBind, this.rawMemory, viewport, info)
        }


        private val viewportSetDebugDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "viewport_set_debug_draw") }
        fun viewportSetDebugDraw(viewport: RID, draw: Int) {
            _icall_Unit_RID_Int(viewportSetDebugDrawMethodBind, this.rawMemory, viewport, draw)
        }


        private val environmentCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_create") }
        fun environmentCreate(): RID {
            return _icall_RID(environmentCreateMethodBind, this.rawMemory)
        }


        private val environmentSetBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_background") }
        fun environmentSetBackground(env: RID, bg: Int) {
            _icall_Unit_RID_Int(environmentSetBackgroundMethodBind, this.rawMemory, env, bg)
        }


        private val environmentSetSkyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_sky") }
        fun environmentSetSky(env: RID, sky: RID) {
            _icall_Unit_RID_RID(environmentSetSkyMethodBind, this.rawMemory, env, sky)
        }


        private val environmentSetSkyCustomFovMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_sky_custom_fov") }
        fun environmentSetSkyCustomFov(env: RID, scale: Float) {
            _icall_Unit_RID_Float(environmentSetSkyCustomFovMethodBind, this.rawMemory, env, scale)
        }


        private val environmentSetBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_bg_color") }
        fun environmentSetBgColor(env: RID, color: Color) {
            _icall_Unit_RID_Color(environmentSetBgColorMethodBind, this.rawMemory, env, color)
        }


        private val environmentSetBgEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_bg_energy") }
        fun environmentSetBgEnergy(env: RID, energy: Float) {
            _icall_Unit_RID_Float(environmentSetBgEnergyMethodBind, this.rawMemory, env, energy)
        }


        private val environmentSetCanvasMaxLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_canvas_max_layer") }
        fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Int) {
            _icall_Unit_RID_Int(environmentSetCanvasMaxLayerMethodBind, this.rawMemory, env, maxLayer)
        }


        private val environmentSetAmbientLightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_ambient_light") }
        fun environmentSetAmbientLight(env: RID, color: Color, energy: Float = 1f, skyContibution: Float = 0f) {
            _icall_Unit_RID_Color_Float_Float(environmentSetAmbientLightMethodBind, this.rawMemory, env, color, energy, skyContibution)
        }


        private val environmentSetDofBlurNearMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_dof_blur_near") }
        fun environmentSetDofBlurNear(env: RID, enable: Boolean, distance: Float, transition: Float, farAmount: Float, quality: Int) {
            _icall_Unit_RID_Boolean_Float_Float_Float_Int(environmentSetDofBlurNearMethodBind, this.rawMemory, env, enable, distance, transition, farAmount, quality)
        }


        private val environmentSetDofBlurFarMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_dof_blur_far") }
        fun environmentSetDofBlurFar(env: RID, enable: Boolean, distance: Float, transition: Float, farAmount: Float, quality: Int) {
            _icall_Unit_RID_Boolean_Float_Float_Float_Int(environmentSetDofBlurFarMethodBind, this.rawMemory, env, enable, distance, transition, farAmount, quality)
        }


        private val environmentSetGlowMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_glow") }
        fun environmentSetGlow(env: RID, enable: Boolean, levelFlags: Int, intensity: Float, strength: Float, bloomThreshold: Float, blendMode: Int, hdrBleedThreshold: Float, hdrBleedScale: Float, bicubicUpscale: Boolean) {
            _icall_Unit_RID_Boolean_Int_Float_Float_Float_Int_Float_Float_Boolean(environmentSetGlowMethodBind, this.rawMemory, env, enable, levelFlags, intensity, strength, bloomThreshold, blendMode, hdrBleedThreshold, hdrBleedScale, bicubicUpscale)
        }


        private val environmentSetTonemapMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_tonemap") }
        fun environmentSetTonemap(env: RID, toneMapper: Int, exposure: Float, white: Float, autoExposure: Boolean, minLuminance: Float, maxLuminance: Float, autoExpSpeed: Float, autoExpGrey: Float) {
            _icall_Unit_RID_Int_Float_Float_Boolean_Float_Float_Float_Float(environmentSetTonemapMethodBind, this.rawMemory, env, toneMapper, exposure, white, autoExposure, minLuminance, maxLuminance, autoExpSpeed, autoExpGrey)
        }


        private val environmentSetAdjustmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_adjustment") }
        fun environmentSetAdjustment(env: RID, enable: Boolean, brightness: Float, contrast: Float, saturation: Float, ramp: RID) {
            _icall_Unit_RID_Boolean_Float_Float_Float_RID(environmentSetAdjustmentMethodBind, this.rawMemory, env, enable, brightness, contrast, saturation, ramp)
        }


        private val environmentSetSsrMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_ssr") }
        fun environmentSetSsr(env: RID, enable: Boolean, maxSteps: Int, fadeIn: Float, fadeOut: Float, depthTolerance: Float, roughness: Boolean) {
            _icall_Unit_RID_Boolean_Int_Float_Float_Float_Boolean(environmentSetSsrMethodBind, this.rawMemory, env, enable, maxSteps, fadeIn, fadeOut, depthTolerance, roughness)
        }


        private val environmentSetSsaoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_ssao") }
        fun environmentSetSsao(env: RID, enable: Boolean, radius: Float, intensity: Float, radius2: Float, intensity2: Float, bias: Float, lightAffect: Float, color: Float, quality: Color, blur: Int, bilateralSharpness: Int, arg12: Float) {
            _icall_Unit_RID_Boolean_Float_Float_Float_Float_Float_Float_Float_Color_Int_Int_Float(environmentSetSsaoMethodBind, this.rawMemory, env, enable, radius, intensity, radius2, intensity2, bias, lightAffect, color, quality, blur, bilateralSharpness, arg12)
        }


        private val environmentSetFogMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_fog") }
        fun environmentSetFog(env: RID, enable: Boolean, color: Color, sunColor: Color, sunAmount: Float) {
            _icall_Unit_RID_Boolean_Color_Color_Float(environmentSetFogMethodBind, this.rawMemory, env, enable, color, sunColor, sunAmount)
        }


        private val environmentSetFogDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_fog_depth") }
        fun environmentSetFogDepth(env: RID, enable: Boolean, depthBegin: Float, depthCurve: Float, transmit: Boolean, transmitCurve: Float) {
            _icall_Unit_RID_Boolean_Float_Float_Boolean_Float(environmentSetFogDepthMethodBind, this.rawMemory, env, enable, depthBegin, depthCurve, transmit, transmitCurve)
        }


        private val environmentSetFogHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "environment_set_fog_height") }
        fun environmentSetFogHeight(env: RID, enable: Boolean, minHeight: Float, maxHeight: Float, heightCurve: Float) {
            _icall_Unit_RID_Boolean_Float_Float_Float(environmentSetFogHeightMethodBind, this.rawMemory, env, enable, minHeight, maxHeight, heightCurve)
        }


        private val scenarioCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_create") }
        fun scenarioCreate(): RID {
            return _icall_RID(scenarioCreateMethodBind, this.rawMemory)
        }


        private val scenarioSetDebugMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_debug") }
        fun scenarioSetDebug(scenario: RID, debugMode: Int) {
            _icall_Unit_RID_Int(scenarioSetDebugMethodBind, this.rawMemory, scenario, debugMode)
        }


        private val scenarioSetEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_environment") }
        fun scenarioSetEnvironment(scenario: RID, environment: RID) {
            _icall_Unit_RID_RID(scenarioSetEnvironmentMethodBind, this.rawMemory, scenario, environment)
        }


        private val scenarioSetReflectionAtlasSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "scenario_set_reflection_atlas_size") }
        fun scenarioSetReflectionAtlasSize(scenario: RID, pSize: Int, subdiv: Int) {
            _icall_Unit_RID_Int_Int(scenarioSetReflectionAtlasSizeMethodBind, this.rawMemory, scenario, pSize, subdiv)
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
        fun instanceSetLayerMask(instance: RID, mask: Int) {
            _icall_Unit_RID_Int(instanceSetLayerMaskMethodBind, this.rawMemory, instance, mask)
        }


        private val instanceSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_transform") }
        fun instanceSetTransform(instance: RID, transform: Transform) {
            _icall_Unit_RID_Transform(instanceSetTransformMethodBind, this.rawMemory, instance, transform)
        }


        private val instanceAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_attach_object_instance_id") }
        fun instanceAttachObjectInstanceId(instance: RID, id: Int) {
            _icall_Unit_RID_Int(instanceAttachObjectInstanceIdMethodBind, this.rawMemory, instance, id)
        }


        private val instanceSetBlendShapeWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_blend_shape_weight") }
        fun instanceSetBlendShapeWeight(instance: RID, shape: Int, weight: Float) {
            _icall_Unit_RID_Int_Float(instanceSetBlendShapeWeightMethodBind, this.rawMemory, instance, shape, weight)
        }


        private val instanceSetSurfaceMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_set_surface_material") }
        fun instanceSetSurfaceMaterial(instance: RID, surface: Int, material: RID) {
            _icall_Unit_RID_Int_RID(instanceSetSurfaceMaterialMethodBind, this.rawMemory, instance, surface, material)
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
        fun instanceSetExtraVisibilityMargin(instance: RID, margin: Float) {
            _icall_Unit_RID_Float(instanceSetExtraVisibilityMarginMethodBind, this.rawMemory, instance, margin)
        }


        private val instanceGeometrySetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_flag") }
        fun instanceGeometrySetFlag(instance: RID, flag: Int, enabled: Boolean) {
            _icall_Unit_RID_Int_Boolean(instanceGeometrySetFlagMethodBind, this.rawMemory, instance, flag, enabled)
        }


        private val instanceGeometrySetCastShadowsSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_cast_shadows_setting") }
        fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Int) {
            _icall_Unit_RID_Int(instanceGeometrySetCastShadowsSettingMethodBind, this.rawMemory, instance, shadowCastingSetting)
        }


        private val instanceGeometrySetMaterialOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_material_override") }
        fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
            _icall_Unit_RID_RID(instanceGeometrySetMaterialOverrideMethodBind, this.rawMemory, instance, material)
        }


        private val instanceGeometrySetDrawRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "instance_geometry_set_draw_range") }
        fun instanceGeometrySetDrawRange(instance: RID, min: Float, max: Float, minMargin: Float, maxMargin: Float) {
            _icall_Unit_RID_Float_Float_Float_Float(instanceGeometrySetDrawRangeMethodBind, this.rawMemory, instance, min, max, minMargin, maxMargin)
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
        fun canvasItemSetLightMask(item: RID, mask: Int) {
            _icall_Unit_RID_Int(canvasItemSetLightMaskMethodBind, this.rawMemory, item, mask)
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
        fun canvasItemAddLine(item: RID, from: Vector2, to: Vector2, color: Color, width: Float = 1f, antialiased: Boolean = false) {
            _icall_Unit_RID_Vector2_Vector2_Color_Float_Boolean(canvasItemAddLineMethodBind, this.rawMemory, item, from, to, color, width, antialiased)
        }


        private val canvasItemAddPolylineMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_polyline") }
        fun canvasItemAddPolyline(item: RID, points: PoolVector2Array, colors: PoolColorArray, width: Float = 1f, antialiased: Boolean = false) {
            _icall_Unit_RID_PoolVector2Array_PoolColorArray_Float_Boolean(canvasItemAddPolylineMethodBind, this.rawMemory, item, points, colors, width, antialiased)
        }


        private val canvasItemAddRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_rect") }
        fun canvasItemAddRect(item: RID, rect: Rect2, color: Color) {
            _icall_Unit_RID_Rect2_Color(canvasItemAddRectMethodBind, this.rawMemory, item, rect, color)
        }


        private val canvasItemAddCircleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_circle") }
        fun canvasItemAddCircle(item: RID, pos: Vector2, radius: Float, color: Color) {
            _icall_Unit_RID_Vector2_Float_Color(canvasItemAddCircleMethodBind, this.rawMemory, item, pos, radius, color)
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
        fun canvasItemAddNinePatch(item: RID, rect: Rect2, source: Rect2, texture: RID, topleft: Vector2, bottomright: Vector2, xAxisMode: Int = 0, yAxisMode: Int = 0, drawCenter: Boolean = true, modulate: Color = Color(1,1,1,1), normalMap: RID = RID()) {
            _icall_Unit_RID_Rect2_Rect2_RID_Vector2_Vector2_Int_Int_Boolean_Color_RID(canvasItemAddNinePatchMethodBind, this.rawMemory, item, rect, source, texture, topleft, bottomright, xAxisMode, yAxisMode, drawCenter, modulate, normalMap)
        }


        private val canvasItemAddPrimitiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_primitive") }
        fun canvasItemAddPrimitive(item: RID, points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array, texture: RID, width: Float = 1f, normalMap: RID = RID()) {
            _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_Float_RID(canvasItemAddPrimitiveMethodBind, this.rawMemory, item, points, colors, uvs, texture, width, normalMap)
        }


        private val canvasItemAddPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_polygon") }
        fun canvasItemAddPolygon(item: RID, points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array = PoolVector2Array(), texture: RID = RID(), normalMap: RID = RID(), antialiased: Boolean = false) {
            _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_RID_Boolean(canvasItemAddPolygonMethodBind, this.rawMemory, item, points, colors, uvs, texture, normalMap, antialiased)
        }


        private val canvasItemAddTriangleArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_item_add_triangle_array") }
        fun canvasItemAddTriangleArray(item: RID, indices: PoolIntArray, points: PoolVector2Array, colors: PoolColorArray, uvs: PoolVector2Array = PoolVector2Array(), bones: PoolIntArray = PoolIntArray(), weights: PoolRealArray = PoolRealArray(), texture: RID = RID(), count: Int = -1, normalMap: RID = RID()) {
            _icall_Unit_RID_PoolIntArray_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolIntArray_PoolRealArray_RID_Int_RID(canvasItemAddTriangleArrayMethodBind, this.rawMemory, item, indices, points, colors, uvs, bones, weights, texture, count, normalMap)
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
        fun canvasItemAddParticles(item: RID, particles: RID, texture: RID, normalMap: RID, hFrames: Int, vFrames: Int) {
            _icall_Unit_RID_RID_RID_RID_Int_Int(canvasItemAddParticlesMethodBind, this.rawMemory, item, particles, texture, normalMap, hFrames, vFrames)
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
        fun canvasItemSetZIndex(item: RID, zIndex: Int) {
            _icall_Unit_RID_Int(canvasItemSetZIndexMethodBind, this.rawMemory, item, zIndex)
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
        fun canvasItemSetDrawIndex(item: RID, index: Int) {
            _icall_Unit_RID_Int(canvasItemSetDrawIndexMethodBind, this.rawMemory, item, index)
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
        fun canvasLightSetScale(light: RID, scale: Float) {
            _icall_Unit_RID_Float(canvasLightSetScaleMethodBind, this.rawMemory, light, scale)
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
        fun canvasLightSetHeight(light: RID, height: Float) {
            _icall_Unit_RID_Float(canvasLightSetHeightMethodBind, this.rawMemory, light, height)
        }


        private val canvasLightSetEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_energy") }
        fun canvasLightSetEnergy(light: RID, energy: Float) {
            _icall_Unit_RID_Float(canvasLightSetEnergyMethodBind, this.rawMemory, light, energy)
        }


        private val canvasLightSetZRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_z_range") }
        fun canvasLightSetZRange(light: RID, minZ: Int, maxZ: Int) {
            _icall_Unit_RID_Int_Int(canvasLightSetZRangeMethodBind, this.rawMemory, light, minZ, maxZ)
        }


        private val canvasLightSetLayerRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_layer_range") }
        fun canvasLightSetLayerRange(light: RID, minLayer: Int, maxLayer: Int) {
            _icall_Unit_RID_Int_Int(canvasLightSetLayerRangeMethodBind, this.rawMemory, light, minLayer, maxLayer)
        }


        private val canvasLightSetItemCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_item_cull_mask") }
        fun canvasLightSetItemCullMask(light: RID, mask: Int) {
            _icall_Unit_RID_Int(canvasLightSetItemCullMaskMethodBind, this.rawMemory, light, mask)
        }


        private val canvasLightSetItemShadowCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_item_shadow_cull_mask") }
        fun canvasLightSetItemShadowCullMask(light: RID, mask: Int) {
            _icall_Unit_RID_Int(canvasLightSetItemShadowCullMaskMethodBind, this.rawMemory, light, mask)
        }


        private val canvasLightSetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_mode") }
        fun canvasLightSetMode(light: RID, mode: Int) {
            _icall_Unit_RID_Int(canvasLightSetModeMethodBind, this.rawMemory, light, mode)
        }


        private val canvasLightSetShadowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_enabled") }
        fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
            _icall_Unit_RID_Boolean(canvasLightSetShadowEnabledMethodBind, this.rawMemory, light, enabled)
        }


        private val canvasLightSetShadowBufferSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_buffer_size") }
        fun canvasLightSetShadowBufferSize(light: RID, size: Int) {
            _icall_Unit_RID_Int(canvasLightSetShadowBufferSizeMethodBind, this.rawMemory, light, size)
        }


        private val canvasLightSetShadowGradientLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_gradient_length") }
        fun canvasLightSetShadowGradientLength(light: RID, length: Float) {
            _icall_Unit_RID_Float(canvasLightSetShadowGradientLengthMethodBind, this.rawMemory, light, length)
        }


        private val canvasLightSetShadowFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_filter") }
        fun canvasLightSetShadowFilter(light: RID, filter: Int) {
            _icall_Unit_RID_Int(canvasLightSetShadowFilterMethodBind, this.rawMemory, light, filter)
        }


        private val canvasLightSetShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_color") }
        fun canvasLightSetShadowColor(light: RID, color: Color) {
            _icall_Unit_RID_Color(canvasLightSetShadowColorMethodBind, this.rawMemory, light, color)
        }


        private val canvasLightSetShadowSmoothMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "canvas_light_set_shadow_smooth") }
        fun canvasLightSetShadowSmooth(light: RID, smooth: Float) {
            _icall_Unit_RID_Float(canvasLightSetShadowSmoothMethodBind, this.rawMemory, light, smooth)
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
        fun canvasLightOccluderSetLightMask(occluder: RID, mask: Int) {
            _icall_Unit_RID_Int(canvasLightOccluderSetLightMaskMethodBind, this.rawMemory, occluder, mask)
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
        fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Int) {
            _icall_Unit_RID_Int(canvasOccluderPolygonSetCullModeMethodBind, this.rawMemory, occluderPolygon, mode)
        }


        private val blackBarsSetMarginsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualServer", "black_bars_set_margins") }
        fun blackBarsSetMargins(left: Int, top: Int, right: Int, bottom: Int) {
            _icall_Unit_Int_Int_Int_Int(blackBarsSetMarginsMethodBind, this.rawMemory, left, top, right, bottom)
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
        fun getRenderInfo(info: Int): Int {
            return _icall_Int_Int(getRenderInfoMethodBind, this.rawMemory, info)
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
        fun makeSphereMesh(latitudes: Int, longitudes: Int, radius: Float): RID {
            return _icall_RID_Int_Int_Float(makeSphereMeshMethodBind, this.rawMemory, latitudes, longitudes, radius)
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
        fun hasFeature(feature: Int): Boolean {
            return _icall_Boolean_Int(hasFeatureMethodBind, this.rawMemory, feature)
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
