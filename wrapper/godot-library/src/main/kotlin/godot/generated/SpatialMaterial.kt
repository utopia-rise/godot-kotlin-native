@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpatialMaterial : Material {
    constructor() : super("SpatialMaterial")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class EmissionOperator(val id: Long) {
        EMISSION_OP_ADD(0),
        EMISSION_OP_MULTIPLY(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DiffuseMode(val id: Long) {
        DIFFUSE_BURLEY(0),
        DIFFUSE_LAMBERT(1),
        DIFFUSE_LAMBERT_WRAP(2),
        DIFFUSE_OREN_NAYAR(3),
        DIFFUSE_TOON(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class SpecularMode(val id: Long) {
        SPECULAR_SCHLICK_GGX(0),
        SPECULAR_BLINN(1),
        SPECULAR_PHONG(2),
        SPECULAR_TOON(3),
        SPECULAR_DISABLED(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Feature(val id: Long) {
        FEATURE_TRANSPARENT(0),
        FEATURE_EMISSION(1),
        FEATURE_NORMAL_MAPPING(2),
        FEATURE_RIM(3),
        FEATURE_CLEARCOAT(4),
        FEATURE_ANISOTROPY(5),
        FEATURE_AMBIENT_OCCLUSION(6),
        FEATURE_DEPTH_MAPPING(7),
        FEATURE_SUBSURACE_SCATTERING(8),
        FEATURE_TRANSMISSION(9),
        FEATURE_REFRACTION(10),
        FEATURE_DETAIL(11),
        FEATURE_MAX(12),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Flags(val id: Long) {
        FLAG_UNSHADED(0),
        FLAG_USE_VERTEX_LIGHTING(1),
        FLAG_DISABLE_DEPTH_TEST(2),
        FLAG_ALBEDO_FROM_VERTEX_COLOR(3),
        FLAG_SRGB_VERTEX_COLOR(4),
        FLAG_USE_POINT_SIZE(5),
        FLAG_FIXED_SIZE(6),
        FLAG_UV1_USE_TRIPLANAR(7),
        FLAG_UV2_USE_TRIPLANAR(8),
        FLAG_TRIPLANAR_USE_WORLD(9),
        FLAG_AO_ON_UV2(10),
        FLAG_EMISSION_ON_UV2(11),
        FLAG_USE_ALPHA_SCISSOR(12),
        FLAG_ALBEDO_TEXTURE_FORCE_SRGB(13),
        FLAG_DONT_RECEIVE_SHADOWS(14),
        FLAG_ENSURE_CORRECT_NORMALS(15),
        FLAG_MAX(16),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CullMode(val id: Long) {
        CULL_BACK(0),
        CULL_FRONT(1),
        CULL_DISABLED(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DetailUV(val id: Long) {
        DETAIL_UV_1(0),
        DETAIL_UV_2(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BillboardMode(val id: Long) {
        BILLBOARD_DISABLED(0),
        BILLBOARD_ENABLED(1),
        BILLBOARD_FIXED_Y(2),
        BILLBOARD_PARTICLES(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DepthDrawMode(val id: Long) {
        DEPTH_DRAW_OPAQUE_ONLY(0),
        DEPTH_DRAW_ALWAYS(1),
        DEPTH_DRAW_DISABLED(2),
        DEPTH_DRAW_ALPHA_OPAQUE_PREPASS(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class TextureChannel(val id: Long) {
        TEXTURE_CHANNEL_RED(0),
        TEXTURE_CHANNEL_GREEN(1),
        TEXTURE_CHANNEL_BLUE(2),
        TEXTURE_CHANNEL_ALPHA(3),
        TEXTURE_CHANNEL_GRAYSCALE(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BlendMode(val id: Long) {
        BLEND_MODE_MIX(0),
        BLEND_MODE_ADD(1),
        BLEND_MODE_SUB(2),
        BLEND_MODE_MUL(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class TextureParam(val id: Long) {
        TEXTURE_ALBEDO(0),
        TEXTURE_METALLIC(1),
        TEXTURE_ROUGHNESS(2),
        TEXTURE_EMISSION(3),
        TEXTURE_NORMAL(4),
        TEXTURE_RIM(5),
        TEXTURE_CLEARCOAT(6),
        TEXTURE_FLOWMAP(7),
        TEXTURE_AMBIENT_OCCLUSION(8),
        TEXTURE_DEPTH(9),
        TEXTURE_SUBSURFACE_SCATTERING(10),
        TEXTURE_TRANSMISSION(11),
        TEXTURE_REFRACTION(12),
        TEXTURE_DETAIL_MASK(13),
        TEXTURE_DETAIL_ALBEDO(14),
        TEXTURE_DETAIL_NORMAL(15),
        TEXTURE_MAX(16),
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
        infix fun from(other: Material): SpatialMaterial = SpatialMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): SpatialMaterial = SpatialMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): SpatialMaterial = SpatialMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpatialMaterial = SpatialMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpatialMaterial = fromVariant(SpatialMaterial(""), other)


        // Constants
        const val TEXTURE_ALBEDO: Long = 0
        const val TEXTURE_METALLIC: Long = 1
        const val TEXTURE_ROUGHNESS: Long = 2
        const val TEXTURE_EMISSION: Long = 3
        const val TEXTURE_NORMAL: Long = 4
        const val TEXTURE_RIM: Long = 5
        const val TEXTURE_CLEARCOAT: Long = 6
        const val TEXTURE_FLOWMAP: Long = 7
        const val TEXTURE_AMBIENT_OCCLUSION: Long = 8
        const val TEXTURE_DEPTH: Long = 9
        const val TEXTURE_SUBSURFACE_SCATTERING: Long = 10
        const val TEXTURE_TRANSMISSION: Long = 11
        const val TEXTURE_REFRACTION: Long = 12
        const val TEXTURE_DETAIL_MASK: Long = 13
        const val TEXTURE_DETAIL_ALBEDO: Long = 14
        const val TEXTURE_DETAIL_NORMAL: Long = 15
        const val TEXTURE_MAX: Long = 16
        const val DETAIL_UV_1: Long = 0
        const val DETAIL_UV_2: Long = 1
        const val FEATURE_TRANSPARENT: Long = 0
        const val FEATURE_EMISSION: Long = 1
        const val FEATURE_NORMAL_MAPPING: Long = 2
        const val FEATURE_RIM: Long = 3
        const val FEATURE_CLEARCOAT: Long = 4
        const val FEATURE_ANISOTROPY: Long = 5
        const val FEATURE_AMBIENT_OCCLUSION: Long = 6
        const val FEATURE_DEPTH_MAPPING: Long = 7
        const val FEATURE_SUBSURACE_SCATTERING: Long = 8
        const val FEATURE_TRANSMISSION: Long = 9
        const val FEATURE_REFRACTION: Long = 10
        const val FEATURE_DETAIL: Long = 11
        const val FEATURE_MAX: Long = 12
        const val BLEND_MODE_MIX: Long = 0
        const val BLEND_MODE_ADD: Long = 1
        const val BLEND_MODE_SUB: Long = 2
        const val BLEND_MODE_MUL: Long = 3
        const val DEPTH_DRAW_OPAQUE_ONLY: Long = 0
        const val DEPTH_DRAW_ALWAYS: Long = 1
        const val DEPTH_DRAW_DISABLED: Long = 2
        const val DEPTH_DRAW_ALPHA_OPAQUE_PREPASS: Long = 3
        const val CULL_BACK: Long = 0
        const val CULL_FRONT: Long = 1
        const val CULL_DISABLED: Long = 2
        const val FLAG_UNSHADED: Long = 0
        const val FLAG_USE_VERTEX_LIGHTING: Long = 1
        const val FLAG_DISABLE_DEPTH_TEST: Long = 2
        const val FLAG_ALBEDO_FROM_VERTEX_COLOR: Long = 3
        const val FLAG_SRGB_VERTEX_COLOR: Long = 4
        const val FLAG_USE_POINT_SIZE: Long = 5
        const val FLAG_FIXED_SIZE: Long = 6
        const val FLAG_UV1_USE_TRIPLANAR: Long = 7
        const val FLAG_UV2_USE_TRIPLANAR: Long = 8
        const val FLAG_AO_ON_UV2: Long = 10
        const val FLAG_EMISSION_ON_UV2: Long = 11
        const val FLAG_USE_ALPHA_SCISSOR: Long = 12
        const val FLAG_TRIPLANAR_USE_WORLD: Long = 9
        const val FLAG_ALBEDO_TEXTURE_FORCE_SRGB: Long = 13
        const val FLAG_DONT_RECEIVE_SHADOWS: Long = 14
        const val FLAG_ENSURE_CORRECT_NORMALS: Long = 15
        const val FLAG_MAX: Long = 16
        const val DIFFUSE_BURLEY: Long = 0
        const val DIFFUSE_LAMBERT: Long = 1
        const val DIFFUSE_LAMBERT_WRAP: Long = 2
        const val DIFFUSE_OREN_NAYAR: Long = 3
        const val DIFFUSE_TOON: Long = 4
        const val SPECULAR_SCHLICK_GGX: Long = 0
        const val SPECULAR_BLINN: Long = 1
        const val SPECULAR_PHONG: Long = 2
        const val SPECULAR_TOON: Long = 3
        const val SPECULAR_DISABLED: Long = 4
        const val BILLBOARD_DISABLED: Long = 0
        const val BILLBOARD_ENABLED: Long = 1
        const val BILLBOARD_FIXED_Y: Long = 2
        const val BILLBOARD_PARTICLES: Long = 3
        const val TEXTURE_CHANNEL_RED: Long = 0
        const val TEXTURE_CHANNEL_GREEN: Long = 1
        const val TEXTURE_CHANNEL_BLUE: Long = 2
        const val TEXTURE_CHANNEL_ALPHA: Long = 3
        const val TEXTURE_CHANNEL_GRAYSCALE: Long = 4
        const val EMISSION_OP_ADD: Long = 0
        const val EMISSION_OP_MULTIPLY: Long = 1


    }


    // Properties
    open var flagsTransparent: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 0, value)


    open var flagsUnshaded: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 0, value)


    open var flagsVertexLighting: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 1, value)


    open var flagsNoDepthTest: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 2, value)


    open var flagsUsePointSize: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 5, value)


    open var flagsWorldTriplanar: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 9, value)


    open var flagsFixedSize: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 6, value)


    open var flagsAlbedoTexForceSrgb: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 13, value)


    open var flagsDoNotReceiveShadows: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 14, value)


    open var flagsEnsureCorrectNormals: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 15, value)


    open var vertexColorUseAsAlbedo: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 3, value)


    open var vertexColorIsSrgb: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 4, value)


    open var paramsDiffuseMode: Long
        get() = _icall_Long(getDiffuseModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDiffuseModeMethodBind, this.rawMemory, value)


    open var paramsSpecularMode: Long
        get() = _icall_Long(getSpecularModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSpecularModeMethodBind, this.rawMemory, value)


    open var paramsBlendMode: Long
        get() = _icall_Long(getBlendModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBlendModeMethodBind, this.rawMemory, value)


    open var paramsCullMode: Long
        get() = _icall_Long(getCullModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCullModeMethodBind, this.rawMemory, value)


    open var paramsDepthDrawMode: Long
        get() = _icall_Long(getDepthDrawModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDepthDrawModeMethodBind, this.rawMemory, value)


    open var paramsLineWidth: Double
        get() = _icall_Double(getLineWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLineWidthMethodBind, this.rawMemory, value)


    open var paramsPointSize: Double
        get() = _icall_Double(getPointSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPointSizeMethodBind, this.rawMemory, value)


    open var paramsBillboardMode: Long
        get() = _icall_Long(getBillboardModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBillboardModeMethodBind, this.rawMemory, value)


    open var paramsGrow: Boolean
        get() = _icall_Boolean(isGrowEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setGrowEnabledMethodBind, this.rawMemory, value)


    open var paramsGrowAmount: Double
        get() = _icall_Double(getGrowMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGrowMethodBind, this.rawMemory, value)


    open var paramsUseAlphaScissor: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 12, value)


    open var paramsAlphaScissorThreshold: Double
        get() = _icall_Double(getAlphaScissorThresholdMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAlphaScissorThresholdMethodBind, this.rawMemory, value)


    open var particlesAnimHFrames: Long
        get() = _icall_Long(getParticlesAnimHFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setParticlesAnimHFramesMethodBind, this.rawMemory, value)


    open var particlesAnimVFrames: Long
        get() = _icall_Long(getParticlesAnimVFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setParticlesAnimVFramesMethodBind, this.rawMemory, value)


    open var particlesAnimLoop: Boolean
        get() = _icall_Boolean(getParticlesAnimLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setParticlesAnimLoopMethodBind, this.rawMemory, value)


    open var albedoColor: Color
        get() = _icall_Color(getAlbedoMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setAlbedoMethodBind, this.rawMemory, value)
    open fun albedoColor(shedule: (Color) -> Unit): Color = albedoColor.apply {
        shedule(this)
        albedoColor = this
    }


    open var albedoTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 0, value)


    open var metallic: Double
        get() = _icall_Double(getMetallicMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMetallicMethodBind, this.rawMemory, value)


    open var metallicSpecular: Double
        get() = _icall_Double(getSpecularMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpecularMethodBind, this.rawMemory, value)


    open var metallicTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 1, value)


    open var metallicTextureChannel: Long
        get() = _icall_Long(getMetallicTextureChannelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMetallicTextureChannelMethodBind, this.rawMemory, value)


    open var roughness: Double
        get() = _icall_Double(getRoughnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRoughnessMethodBind, this.rawMemory, value)


    open var roughnessTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 2, value)


    open var roughnessTextureChannel: Long
        get() = _icall_Long(getRoughnessTextureChannelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRoughnessTextureChannelMethodBind, this.rawMemory, value)


    open var emissionEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 1, value)


    open var emission: Color
        get() = _icall_Color(getEmissionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setEmissionMethodBind, this.rawMemory, value)
    open fun emission(shedule: (Color) -> Unit): Color = emission.apply {
        shedule(this)
        emission = this
    }


    open var emissionEnergy: Double
        get() = _icall_Double(getEmissionEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEmissionEnergyMethodBind, this.rawMemory, value)


    open var emissionOperator: Long
        get() = _icall_Long(getEmissionOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setEmissionOperatorMethodBind, this.rawMemory, value)


    open var emissionOnUv2: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 11, value)


    open var emissionTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 3, value)


    open var normalEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 2, value)


    open var normalScale: Double
        get() = _icall_Double(getNormalScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setNormalScaleMethodBind, this.rawMemory, value)


    open var normalTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 4, value)


    open var rimEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 3, value)


    open var rim: Double
        get() = _icall_Double(getRimMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRimMethodBind, this.rawMemory, value)


    open var rimTint: Double
        get() = _icall_Double(getRimTintMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRimTintMethodBind, this.rawMemory, value)


    open var rimTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 5, value)


    open var clearcoatEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 4, value)


    open var clearcoat: Double
        get() = _icall_Double(getClearcoatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setClearcoatMethodBind, this.rawMemory, value)


    open var clearcoatGloss: Double
        get() = _icall_Double(getClearcoatGlossMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setClearcoatGlossMethodBind, this.rawMemory, value)


    open var clearcoatTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 6, value)


    open var anisotropyEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 5, value)


    open var anisotropy: Double
        get() = _icall_Double(getAnisotropyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAnisotropyMethodBind, this.rawMemory, value)


    open var anisotropyFlowmap: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 7, value)


    open var aoEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 6, value)


    open var aoLightAffect: Double
        get() = _icall_Double(getAoLightAffectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAoLightAffectMethodBind, this.rawMemory, value)


    open var aoTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 8, value)


    open var aoOnUv2: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 10, value)


    open var aoTextureChannel: Long
        get() = _icall_Long(getAoTextureChannelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAoTextureChannelMethodBind, this.rawMemory, value)


    open var depthEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 7, value)


    open var depthScale: Double
        get() = _icall_Double(getDepthScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDepthScaleMethodBind, this.rawMemory, value)


    open var depthDeepParallax: Boolean
        get() = _icall_Boolean(isDepthDeepParallaxEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDepthDeepParallaxMethodBind, this.rawMemory, value)


    open var depthMinLayers: Long
        get() = _icall_Long(getDepthDeepParallaxMinLayersMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDepthDeepParallaxMinLayersMethodBind, this.rawMemory, value)


    open var depthMaxLayers: Long
        get() = _icall_Long(getDepthDeepParallaxMaxLayersMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDepthDeepParallaxMaxLayersMethodBind, this.rawMemory, value)


    open var depthTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 9, value)


    open var subsurfScatterEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 8, value)


    open var subsurfScatterStrength: Double
        get() = _icall_Double(getSubsurfaceScatteringStrengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSubsurfaceScatteringStrengthMethodBind, this.rawMemory, value)


    open var subsurfScatterTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 10, value)


    open var transmissionEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 9, value)


    open var transmission: Color
        get() = _icall_Color(getTransmissionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setTransmissionMethodBind, this.rawMemory, value)
    open fun transmission(shedule: (Color) -> Unit): Color = transmission.apply {
        shedule(this)
        transmission = this
    }


    open var transmissionTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 11, value)


    open var refractionEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 10, value)


    open var refractionScale: Double
        get() = _icall_Double(getRefractionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRefractionMethodBind, this.rawMemory, value)


    open var refractionTexture: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 12, value)


    open var refractionTextureChannel: Long
        get() = _icall_Long(getRefractionTextureChannelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRefractionTextureChannelMethodBind, this.rawMemory, value)


    open var detailEnabled: Boolean
        get() = _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, 11, value)


    open var detailMask: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 13, value)


    open var detailBlendMode: Long
        get() = _icall_Long(getDetailBlendModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDetailBlendModeMethodBind, this.rawMemory, value)


    open var detailUvLayer: Long
        get() = _icall_Long(getDetailUvMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDetailUvMethodBind, this.rawMemory, value)


    open var detailAlbedo: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 14, value)


    open var detailNormal: Texture
        get() = _icall_Texture_Long(getTextureMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, 15, value)


    open var uv1Scale: Vector3
        get() = _icall_Vector3(getUv1ScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setUv1ScaleMethodBind, this.rawMemory, value)
    open fun uv1Scale(shedule: (Vector3) -> Unit): Vector3 = uv1Scale.apply {
        shedule(this)
        uv1Scale = this
    }


    open var uv1Offset: Vector3
        get() = _icall_Vector3(getUv1OffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setUv1OffsetMethodBind, this.rawMemory, value)
    open fun uv1Offset(shedule: (Vector3) -> Unit): Vector3 = uv1Offset.apply {
        shedule(this)
        uv1Offset = this
    }


    open var uv1Triplanar: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 7, value)


    open var uv1TriplanarSharpness: Double
        get() = _icall_Double(getUv1TriplanarBlendSharpnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setUv1TriplanarBlendSharpnessMethodBind, this.rawMemory, value)


    open var uv2Scale: Vector3
        get() = _icall_Vector3(getUv2ScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setUv2ScaleMethodBind, this.rawMemory, value)
    open fun uv2Scale(shedule: (Vector3) -> Unit): Vector3 = uv2Scale.apply {
        shedule(this)
        uv2Scale = this
    }


    open var uv2Offset: Vector3
        get() = _icall_Vector3(getUv2OffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setUv2OffsetMethodBind, this.rawMemory, value)
    open fun uv2Offset(shedule: (Vector3) -> Unit): Vector3 = uv2Offset.apply {
        shedule(this)
        uv2Offset = this
    }


    open var uv2Triplanar: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 8, value)


    open var uv2TriplanarSharpness: Double
        get() = _icall_Double(getUv2TriplanarBlendSharpnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setUv2TriplanarBlendSharpnessMethodBind, this.rawMemory, value)


    open var proximityFadeEnable: Boolean
        get() = _icall_Boolean(isProximityFadeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setProximityFadeMethodBind, this.rawMemory, value)


    open var proximityFadeDistance: Double
        get() = _icall_Double(getProximityFadeDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setProximityFadeDistanceMethodBind, this.rawMemory, value)


    open var distanceFadeEnable: Boolean
        get() = _icall_Boolean(isDistanceFadeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDistanceFadeMethodBind, this.rawMemory, value)


    open var distanceFadeMinDistance: Double
        get() = _icall_Double(getDistanceFadeMinDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDistanceFadeMinDistanceMethodBind, this.rawMemory, value)


    open var distanceFadeMaxDistance: Double
        get() = _icall_Double(getDistanceFadeMaxDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDistanceFadeMaxDistanceMethodBind, this.rawMemory, value)




    // Methods
    private val setAlbedoMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_albedo") }
    open fun setAlbedo(albedo: Color) {
        _icall_Unit_Color(setAlbedoMethodBind, this.rawMemory, albedo)
    }


    private val getAlbedoMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_albedo") }
    open fun getAlbedo(): Color {
        return _icall_Color(getAlbedoMethodBind, this.rawMemory)
    }


    private val setSpecularMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_specular") }
    open fun setSpecular(specular: Double) {
        _icall_Unit_Double(setSpecularMethodBind, this.rawMemory, specular)
    }


    private val getSpecularMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_specular") }
    open fun getSpecular(): Double {
        return _icall_Double(getSpecularMethodBind, this.rawMemory)
    }


    private val setMetallicMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_metallic") }
    open fun setMetallic(metallic: Double) {
        _icall_Unit_Double(setMetallicMethodBind, this.rawMemory, metallic)
    }


    private val getMetallicMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_metallic") }
    open fun getMetallic(): Double {
        return _icall_Double(getMetallicMethodBind, this.rawMemory)
    }


    private val setRoughnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_roughness") }
    open fun setRoughness(roughness: Double) {
        _icall_Unit_Double(setRoughnessMethodBind, this.rawMemory, roughness)
    }


    private val getRoughnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_roughness") }
    open fun getRoughness(): Double {
        return _icall_Double(getRoughnessMethodBind, this.rawMemory)
    }


    private val setEmissionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_emission") }
    open fun setEmission(emission: Color) {
        _icall_Unit_Color(setEmissionMethodBind, this.rawMemory, emission)
    }


    private val getEmissionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_emission") }
    open fun getEmission(): Color {
        return _icall_Color(getEmissionMethodBind, this.rawMemory)
    }


    private val setEmissionEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_emission_energy") }
    open fun setEmissionEnergy(emissionEnergy: Double) {
        _icall_Unit_Double(setEmissionEnergyMethodBind, this.rawMemory, emissionEnergy)
    }


    private val getEmissionEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_emission_energy") }
    open fun getEmissionEnergy(): Double {
        return _icall_Double(getEmissionEnergyMethodBind, this.rawMemory)
    }


    private val setNormalScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_normal_scale") }
    open fun setNormalScale(normalScale: Double) {
        _icall_Unit_Double(setNormalScaleMethodBind, this.rawMemory, normalScale)
    }


    private val getNormalScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_normal_scale") }
    open fun getNormalScale(): Double {
        return _icall_Double(getNormalScaleMethodBind, this.rawMemory)
    }


    private val setRimMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_rim") }
    open fun setRim(rim: Double) {
        _icall_Unit_Double(setRimMethodBind, this.rawMemory, rim)
    }


    private val getRimMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_rim") }
    open fun getRim(): Double {
        return _icall_Double(getRimMethodBind, this.rawMemory)
    }


    private val setRimTintMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_rim_tint") }
    open fun setRimTint(rimTint: Double) {
        _icall_Unit_Double(setRimTintMethodBind, this.rawMemory, rimTint)
    }


    private val getRimTintMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_rim_tint") }
    open fun getRimTint(): Double {
        return _icall_Double(getRimTintMethodBind, this.rawMemory)
    }


    private val setClearcoatMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_clearcoat") }
    open fun setClearcoat(clearcoat: Double) {
        _icall_Unit_Double(setClearcoatMethodBind, this.rawMemory, clearcoat)
    }


    private val getClearcoatMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_clearcoat") }
    open fun getClearcoat(): Double {
        return _icall_Double(getClearcoatMethodBind, this.rawMemory)
    }


    private val setClearcoatGlossMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_clearcoat_gloss") }
    open fun setClearcoatGloss(clearcoatGloss: Double) {
        _icall_Unit_Double(setClearcoatGlossMethodBind, this.rawMemory, clearcoatGloss)
    }


    private val getClearcoatGlossMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_clearcoat_gloss") }
    open fun getClearcoatGloss(): Double {
        return _icall_Double(getClearcoatGlossMethodBind, this.rawMemory)
    }


    private val setAnisotropyMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_anisotropy") }
    open fun setAnisotropy(anisotropy: Double) {
        _icall_Unit_Double(setAnisotropyMethodBind, this.rawMemory, anisotropy)
    }


    private val getAnisotropyMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_anisotropy") }
    open fun getAnisotropy(): Double {
        return _icall_Double(getAnisotropyMethodBind, this.rawMemory)
    }


    private val setDepthScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_depth_scale") }
    open fun setDepthScale(depthScale: Double) {
        _icall_Unit_Double(setDepthScaleMethodBind, this.rawMemory, depthScale)
    }


    private val getDepthScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_depth_scale") }
    open fun getDepthScale(): Double {
        return _icall_Double(getDepthScaleMethodBind, this.rawMemory)
    }


    private val setSubsurfaceScatteringStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_subsurface_scattering_strength") }
    open fun setSubsurfaceScatteringStrength(strength: Double) {
        _icall_Unit_Double(setSubsurfaceScatteringStrengthMethodBind, this.rawMemory, strength)
    }


    private val getSubsurfaceScatteringStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_subsurface_scattering_strength") }
    open fun getSubsurfaceScatteringStrength(): Double {
        return _icall_Double(getSubsurfaceScatteringStrengthMethodBind, this.rawMemory)
    }


    private val setTransmissionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_transmission") }
    open fun setTransmission(transmission: Color) {
        _icall_Unit_Color(setTransmissionMethodBind, this.rawMemory, transmission)
    }


    private val getTransmissionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_transmission") }
    open fun getTransmission(): Color {
        return _icall_Color(getTransmissionMethodBind, this.rawMemory)
    }


    private val setRefractionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_refraction") }
    open fun setRefraction(refraction: Double) {
        _icall_Unit_Double(setRefractionMethodBind, this.rawMemory, refraction)
    }


    private val getRefractionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_refraction") }
    open fun getRefraction(): Double {
        return _icall_Double(getRefractionMethodBind, this.rawMemory)
    }


    private val setLineWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_line_width") }
    open fun setLineWidth(lineWidth: Double) {
        _icall_Unit_Double(setLineWidthMethodBind, this.rawMemory, lineWidth)
    }


    private val getLineWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_line_width") }
    open fun getLineWidth(): Double {
        return _icall_Double(getLineWidthMethodBind, this.rawMemory)
    }


    private val setPointSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_point_size") }
    open fun setPointSize(pointSize: Double) {
        _icall_Unit_Double(setPointSizeMethodBind, this.rawMemory, pointSize)
    }


    private val getPointSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_point_size") }
    open fun getPointSize(): Double {
        return _icall_Double(getPointSizeMethodBind, this.rawMemory)
    }


    private val setDetailUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_detail_uv") }
    open fun setDetailUv(detailUv: Long) {
        _icall_Unit_Long(setDetailUvMethodBind, this.rawMemory, detailUv)
    }


    private val getDetailUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_detail_uv") }
    open fun getDetailUv(): SpatialMaterial.DetailUV {
        return SpatialMaterial.DetailUV.fromInt(_icall_Long(getDetailUvMethodBind, this.rawMemory))
    }


    private val setBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_blend_mode") }
    open fun setBlendMode(blendMode: Long) {
        _icall_Unit_Long(setBlendModeMethodBind, this.rawMemory, blendMode)
    }


    private val getBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_blend_mode") }
    open fun getBlendMode(): SpatialMaterial.BlendMode {
        return SpatialMaterial.BlendMode.fromInt(_icall_Long(getBlendModeMethodBind, this.rawMemory))
    }


    private val setDepthDrawModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_depth_draw_mode") }
    open fun setDepthDrawMode(depthDrawMode: Long) {
        _icall_Unit_Long(setDepthDrawModeMethodBind, this.rawMemory, depthDrawMode)
    }


    private val getDepthDrawModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_depth_draw_mode") }
    open fun getDepthDrawMode(): SpatialMaterial.DepthDrawMode {
        return SpatialMaterial.DepthDrawMode.fromInt(_icall_Long(getDepthDrawModeMethodBind, this.rawMemory))
    }


    private val setCullModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_cull_mode") }
    open fun setCullMode(cullMode: Long) {
        _icall_Unit_Long(setCullModeMethodBind, this.rawMemory, cullMode)
    }


    private val getCullModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_cull_mode") }
    open fun getCullMode(): SpatialMaterial.CullMode {
        return SpatialMaterial.CullMode.fromInt(_icall_Long(getCullModeMethodBind, this.rawMemory))
    }


    private val setDiffuseModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_diffuse_mode") }
    open fun setDiffuseMode(diffuseMode: Long) {
        _icall_Unit_Long(setDiffuseModeMethodBind, this.rawMemory, diffuseMode)
    }


    private val getDiffuseModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_diffuse_mode") }
    open fun getDiffuseMode(): SpatialMaterial.DiffuseMode {
        return SpatialMaterial.DiffuseMode.fromInt(_icall_Long(getDiffuseModeMethodBind, this.rawMemory))
    }


    private val setSpecularModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_specular_mode") }
    open fun setSpecularMode(specularMode: Long) {
        _icall_Unit_Long(setSpecularModeMethodBind, this.rawMemory, specularMode)
    }


    private val getSpecularModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_specular_mode") }
    open fun getSpecularMode(): SpatialMaterial.SpecularMode {
        return SpatialMaterial.SpecularMode.fromInt(_icall_Long(getSpecularModeMethodBind, this.rawMemory))
    }


    private val setFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_flag") }
    open fun setFlag(flag: Long, enable: Boolean) {
        _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, flag, enable)
    }


    private val getFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_flag") }
    open fun getFlag(flag: Long): Boolean {
        return _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, flag)
    }


    private val setFeatureMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_feature") }
    open fun setFeature(feature: Long, enable: Boolean) {
        _icall_Unit_Long_Boolean(setFeatureMethodBind, this.rawMemory, feature, enable)
    }


    private val getFeatureMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_feature") }
    open fun getFeature(feature: Long): Boolean {
        return _icall_Boolean_Long(getFeatureMethodBind, this.rawMemory, feature)
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_texture") }
    open fun setTexture(param: Long, texture: Texture) {
        _icall_Unit_Long_Object(setTextureMethodBind, this.rawMemory, param, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_texture") }
    open fun getTexture(param: Long): Texture {
        return _icall_Texture_Long(getTextureMethodBind, this.rawMemory, param)
    }


    private val setDetailBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_detail_blend_mode") }
    open fun setDetailBlendMode(detailBlendMode: Long) {
        _icall_Unit_Long(setDetailBlendModeMethodBind, this.rawMemory, detailBlendMode)
    }


    private val getDetailBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_detail_blend_mode") }
    open fun getDetailBlendMode(): SpatialMaterial.BlendMode {
        return SpatialMaterial.BlendMode.fromInt(_icall_Long(getDetailBlendModeMethodBind, this.rawMemory))
    }


    private val setUv1ScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_uv1_scale") }
    open fun setUv1Scale(scale: Vector3) {
        _icall_Unit_Vector3(setUv1ScaleMethodBind, this.rawMemory, scale)
    }


    private val getUv1ScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_uv1_scale") }
    open fun getUv1Scale(): Vector3 {
        return _icall_Vector3(getUv1ScaleMethodBind, this.rawMemory)
    }


    private val setUv1OffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_uv1_offset") }
    open fun setUv1Offset(offset: Vector3) {
        _icall_Unit_Vector3(setUv1OffsetMethodBind, this.rawMemory, offset)
    }


    private val getUv1OffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_uv1_offset") }
    open fun getUv1Offset(): Vector3 {
        return _icall_Vector3(getUv1OffsetMethodBind, this.rawMemory)
    }


    private val setUv1TriplanarBlendSharpnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_uv1_triplanar_blend_sharpness") }
    open fun setUv1TriplanarBlendSharpness(sharpness: Double) {
        _icall_Unit_Double(setUv1TriplanarBlendSharpnessMethodBind, this.rawMemory, sharpness)
    }


    private val getUv1TriplanarBlendSharpnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_uv1_triplanar_blend_sharpness") }
    open fun getUv1TriplanarBlendSharpness(): Double {
        return _icall_Double(getUv1TriplanarBlendSharpnessMethodBind, this.rawMemory)
    }


    private val setUv2ScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_uv2_scale") }
    open fun setUv2Scale(scale: Vector3) {
        _icall_Unit_Vector3(setUv2ScaleMethodBind, this.rawMemory, scale)
    }


    private val getUv2ScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_uv2_scale") }
    open fun getUv2Scale(): Vector3 {
        return _icall_Vector3(getUv2ScaleMethodBind, this.rawMemory)
    }


    private val setUv2OffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_uv2_offset") }
    open fun setUv2Offset(offset: Vector3) {
        _icall_Unit_Vector3(setUv2OffsetMethodBind, this.rawMemory, offset)
    }


    private val getUv2OffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_uv2_offset") }
    open fun getUv2Offset(): Vector3 {
        return _icall_Vector3(getUv2OffsetMethodBind, this.rawMemory)
    }


    private val setUv2TriplanarBlendSharpnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_uv2_triplanar_blend_sharpness") }
    open fun setUv2TriplanarBlendSharpness(sharpness: Double) {
        _icall_Unit_Double(setUv2TriplanarBlendSharpnessMethodBind, this.rawMemory, sharpness)
    }


    private val getUv2TriplanarBlendSharpnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_uv2_triplanar_blend_sharpness") }
    open fun getUv2TriplanarBlendSharpness(): Double {
        return _icall_Double(getUv2TriplanarBlendSharpnessMethodBind, this.rawMemory)
    }


    private val setBillboardModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_billboard_mode") }
    open fun setBillboardMode(mode: Long) {
        _icall_Unit_Long(setBillboardModeMethodBind, this.rawMemory, mode)
    }


    private val getBillboardModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_billboard_mode") }
    open fun getBillboardMode(): SpatialMaterial.BillboardMode {
        return SpatialMaterial.BillboardMode.fromInt(_icall_Long(getBillboardModeMethodBind, this.rawMemory))
    }


    private val setParticlesAnimHFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_particles_anim_h_frames") }
    open fun setParticlesAnimHFrames(frames: Long) {
        _icall_Unit_Long(setParticlesAnimHFramesMethodBind, this.rawMemory, frames)
    }


    private val getParticlesAnimHFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_particles_anim_h_frames") }
    open fun getParticlesAnimHFrames(): Long {
        return _icall_Long(getParticlesAnimHFramesMethodBind, this.rawMemory)
    }


    private val setParticlesAnimVFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_particles_anim_v_frames") }
    open fun setParticlesAnimVFrames(frames: Long) {
        _icall_Unit_Long(setParticlesAnimVFramesMethodBind, this.rawMemory, frames)
    }


    private val getParticlesAnimVFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_particles_anim_v_frames") }
    open fun getParticlesAnimVFrames(): Long {
        return _icall_Long(getParticlesAnimVFramesMethodBind, this.rawMemory)
    }


    private val setParticlesAnimLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_particles_anim_loop") }
    open fun setParticlesAnimLoop(frames: Long) {
        _icall_Unit_Long(setParticlesAnimLoopMethodBind, this.rawMemory, frames)
    }


    private val getParticlesAnimLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_particles_anim_loop") }
    open fun getParticlesAnimLoop(): Long {
        return _icall_Long(getParticlesAnimLoopMethodBind, this.rawMemory)
    }


    private val setDepthDeepParallaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_depth_deep_parallax") }
    open fun setDepthDeepParallax(enable: Boolean) {
        _icall_Unit_Boolean(setDepthDeepParallaxMethodBind, this.rawMemory, enable)
    }


    private val isDepthDeepParallaxEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "is_depth_deep_parallax_enabled") }
    open fun isDepthDeepParallaxEnabled(): Boolean {
        return _icall_Boolean(isDepthDeepParallaxEnabledMethodBind, this.rawMemory)
    }


    private val setDepthDeepParallaxMinLayersMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_depth_deep_parallax_min_layers") }
    open fun setDepthDeepParallaxMinLayers(layer: Long) {
        _icall_Unit_Long(setDepthDeepParallaxMinLayersMethodBind, this.rawMemory, layer)
    }


    private val getDepthDeepParallaxMinLayersMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_depth_deep_parallax_min_layers") }
    open fun getDepthDeepParallaxMinLayers(): Long {
        return _icall_Long(getDepthDeepParallaxMinLayersMethodBind, this.rawMemory)
    }


    private val setDepthDeepParallaxMaxLayersMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_depth_deep_parallax_max_layers") }
    open fun setDepthDeepParallaxMaxLayers(layer: Long) {
        _icall_Unit_Long(setDepthDeepParallaxMaxLayersMethodBind, this.rawMemory, layer)
    }


    private val getDepthDeepParallaxMaxLayersMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_depth_deep_parallax_max_layers") }
    open fun getDepthDeepParallaxMaxLayers(): Long {
        return _icall_Long(getDepthDeepParallaxMaxLayersMethodBind, this.rawMemory)
    }


    private val setGrowMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_grow") }
    open fun setGrow(amount: Double) {
        _icall_Unit_Double(setGrowMethodBind, this.rawMemory, amount)
    }


    private val getGrowMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_grow") }
    open fun getGrow(): Double {
        return _icall_Double(getGrowMethodBind, this.rawMemory)
    }


    private val setEmissionOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_emission_operator") }
    open fun setEmissionOperator(_operator: Long) {
        _icall_Unit_Long(setEmissionOperatorMethodBind, this.rawMemory, _operator)
    }


    private val getEmissionOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_emission_operator") }
    open fun getEmissionOperator(): SpatialMaterial.EmissionOperator {
        return SpatialMaterial.EmissionOperator.fromInt(_icall_Long(getEmissionOperatorMethodBind, this.rawMemory))
    }


    private val setAoLightAffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_ao_light_affect") }
    open fun setAoLightAffect(amount: Double) {
        _icall_Unit_Double(setAoLightAffectMethodBind, this.rawMemory, amount)
    }


    private val getAoLightAffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_ao_light_affect") }
    open fun getAoLightAffect(): Double {
        return _icall_Double(getAoLightAffectMethodBind, this.rawMemory)
    }


    private val setAlphaScissorThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_alpha_scissor_threshold") }
    open fun setAlphaScissorThreshold(threshold: Double) {
        _icall_Unit_Double(setAlphaScissorThresholdMethodBind, this.rawMemory, threshold)
    }


    private val getAlphaScissorThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_alpha_scissor_threshold") }
    open fun getAlphaScissorThreshold(): Double {
        return _icall_Double(getAlphaScissorThresholdMethodBind, this.rawMemory)
    }


    private val setGrowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_grow_enabled") }
    open fun setGrowEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setGrowEnabledMethodBind, this.rawMemory, enable)
    }


    private val isGrowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "is_grow_enabled") }
    open fun isGrowEnabled(): Boolean {
        return _icall_Boolean(isGrowEnabledMethodBind, this.rawMemory)
    }


    private val setMetallicTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_metallic_texture_channel") }
    open fun setMetallicTextureChannel(channel: Long) {
        _icall_Unit_Long(setMetallicTextureChannelMethodBind, this.rawMemory, channel)
    }


    private val getMetallicTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_metallic_texture_channel") }
    open fun getMetallicTextureChannel(): SpatialMaterial.TextureChannel {
        return SpatialMaterial.TextureChannel.fromInt(_icall_Long(getMetallicTextureChannelMethodBind, this.rawMemory))
    }


    private val setRoughnessTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_roughness_texture_channel") }
    open fun setRoughnessTextureChannel(channel: Long) {
        _icall_Unit_Long(setRoughnessTextureChannelMethodBind, this.rawMemory, channel)
    }


    private val getRoughnessTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_roughness_texture_channel") }
    open fun getRoughnessTextureChannel(): SpatialMaterial.TextureChannel {
        return SpatialMaterial.TextureChannel.fromInt(_icall_Long(getRoughnessTextureChannelMethodBind, this.rawMemory))
    }


    private val setAoTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_ao_texture_channel") }
    open fun setAoTextureChannel(channel: Long) {
        _icall_Unit_Long(setAoTextureChannelMethodBind, this.rawMemory, channel)
    }


    private val getAoTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_ao_texture_channel") }
    open fun getAoTextureChannel(): SpatialMaterial.TextureChannel {
        return SpatialMaterial.TextureChannel.fromInt(_icall_Long(getAoTextureChannelMethodBind, this.rawMemory))
    }


    private val setRefractionTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_refraction_texture_channel") }
    open fun setRefractionTextureChannel(channel: Long) {
        _icall_Unit_Long(setRefractionTextureChannelMethodBind, this.rawMemory, channel)
    }


    private val getRefractionTextureChannelMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_refraction_texture_channel") }
    open fun getRefractionTextureChannel(): SpatialMaterial.TextureChannel {
        return SpatialMaterial.TextureChannel.fromInt(_icall_Long(getRefractionTextureChannelMethodBind, this.rawMemory))
    }


    private val setProximityFadeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_proximity_fade") }
    open fun setProximityFade(enabled: Boolean) {
        _icall_Unit_Boolean(setProximityFadeMethodBind, this.rawMemory, enabled)
    }


    private val isProximityFadeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "is_proximity_fade_enabled") }
    open fun isProximityFadeEnabled(): Boolean {
        return _icall_Boolean(isProximityFadeEnabledMethodBind, this.rawMemory)
    }


    private val setProximityFadeDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_proximity_fade_distance") }
    open fun setProximityFadeDistance(distance: Double) {
        _icall_Unit_Double(setProximityFadeDistanceMethodBind, this.rawMemory, distance)
    }


    private val getProximityFadeDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_proximity_fade_distance") }
    open fun getProximityFadeDistance(): Double {
        return _icall_Double(getProximityFadeDistanceMethodBind, this.rawMemory)
    }


    private val setDistanceFadeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_distance_fade") }
    open fun setDistanceFade(enabled: Boolean) {
        _icall_Unit_Boolean(setDistanceFadeMethodBind, this.rawMemory, enabled)
    }


    private val isDistanceFadeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "is_distance_fade_enabled") }
    open fun isDistanceFadeEnabled(): Boolean {
        return _icall_Boolean(isDistanceFadeEnabledMethodBind, this.rawMemory)
    }


    private val setDistanceFadeMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_distance_fade_max_distance") }
    open fun setDistanceFadeMaxDistance(distance: Double) {
        _icall_Unit_Double(setDistanceFadeMaxDistanceMethodBind, this.rawMemory, distance)
    }


    private val getDistanceFadeMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_distance_fade_max_distance") }
    open fun getDistanceFadeMaxDistance(): Double {
        return _icall_Double(getDistanceFadeMaxDistanceMethodBind, this.rawMemory)
    }


    private val setDistanceFadeMinDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "set_distance_fade_min_distance") }
    open fun setDistanceFadeMinDistance(distance: Double) {
        _icall_Unit_Double(setDistanceFadeMinDistanceMethodBind, this.rawMemory, distance)
    }


    private val getDistanceFadeMinDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialMaterial", "get_distance_fade_min_distance") }
    open fun getDistanceFadeMinDistance(): Double {
        return _icall_Double(getDistanceFadeMinDistanceMethodBind, this.rawMemory)
    }


}
