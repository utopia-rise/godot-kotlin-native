@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Environment : Resource {
    constructor() : super("Environment")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SSAOBlur(val id: Long) {
        SSAO_BLUR_DISABLED(0),
        SSAO_BLUR_1x1(1),
        SSAO_BLUR_2x2(2),
        SSAO_BLUR_3x3(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ToneMapper(val id: Long) {
        TONE_MAPPER_LINEAR(0),
        TONE_MAPPER_REINHARDT(1),
        TONE_MAPPER_FILMIC(2),
        TONE_MAPPER_ACES(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class GlowBlendMode(val id: Long) {
        GLOW_BLEND_MODE_ADDITIVE(0),
        GLOW_BLEND_MODE_SCREEN(1),
        GLOW_BLEND_MODE_SOFTLIGHT(2),
        GLOW_BLEND_MODE_REPLACE(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BGMode(val id: Long) {
        BG_CLEAR_COLOR(0),
        BG_COLOR(1),
        BG_SKY(2),
        BG_COLOR_SKY(3),
        BG_CANVAS(4),
        BG_KEEP(5),
        BG_MAX(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class SSAOQuality(val id: Long) {
        SSAO_QUALITY_LOW(0),
        SSAO_QUALITY_MEDIUM(1),
        SSAO_QUALITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DOFBlurQuality(val id: Long) {
        DOF_BLUR_QUALITY_LOW(0),
        DOF_BLUR_QUALITY_MEDIUM(1),
        DOF_BLUR_QUALITY_HIGH(2),
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
        infix fun from(other: Resource): Environment = Environment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Environment = Environment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Environment = Environment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Environment = fromVariant(Environment(""), other)


        // Constants
        const val BG_KEEP: Long = 5
        const val BG_CLEAR_COLOR: Long = 0
        const val BG_COLOR: Long = 1
        const val BG_SKY: Long = 2
        const val BG_COLOR_SKY: Long = 3
        const val BG_CANVAS: Long = 4
        const val BG_MAX: Long = 6
        const val GLOW_BLEND_MODE_ADDITIVE: Long = 0
        const val GLOW_BLEND_MODE_SCREEN: Long = 1
        const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2
        const val GLOW_BLEND_MODE_REPLACE: Long = 3
        const val TONE_MAPPER_LINEAR: Long = 0
        const val TONE_MAPPER_REINHARDT: Long = 1
        const val TONE_MAPPER_FILMIC: Long = 2
        const val TONE_MAPPER_ACES: Long = 3
        const val DOF_BLUR_QUALITY_LOW: Long = 0
        const val DOF_BLUR_QUALITY_MEDIUM: Long = 1
        const val DOF_BLUR_QUALITY_HIGH: Long = 2
        const val SSAO_BLUR_DISABLED: Long = 0
        const val SSAO_BLUR_1x1: Long = 1
        const val SSAO_BLUR_2x2: Long = 2
        const val SSAO_BLUR_3x3: Long = 3
        const val SSAO_QUALITY_LOW: Long = 0
        const val SSAO_QUALITY_MEDIUM: Long = 1
        const val SSAO_QUALITY_HIGH: Long = 2


    }


    // Properties
    open var backgroundMode: Long
        get() = _icall_Long(getBackgroundMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBackgroundMethodBind, this.rawMemory, value)


    open var backgroundSky: Sky
        get() = _icall_Sky(getSkyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setSkyMethodBind, this.rawMemory, value)


    open var backgroundSkyCustomFov: Double
        get() = _icall_Double(getSkyCustomFovMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSkyCustomFovMethodBind, this.rawMemory, value)


    open var backgroundColor: Color
        get() = _icall_Color(getBgColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setBgColorMethodBind, this.rawMemory, value)
    open fun backgroundColor(shedule: (Color) -> Unit): Color = backgroundColor.apply {
        shedule(this)
        backgroundColor = this
    }


    open var backgroundEnergy: Double
        get() = _icall_Double(getBgEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBgEnergyMethodBind, this.rawMemory, value)


    open var backgroundCanvasMaxLayer: Long
        get() = _icall_Long(getCanvasMaxLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCanvasMaxLayerMethodBind, this.rawMemory, value)


    open var ambientLightColor: Color
        get() = _icall_Color(getAmbientLightColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setAmbientLightColorMethodBind, this.rawMemory, value)
    open fun ambientLightColor(shedule: (Color) -> Unit): Color = ambientLightColor.apply {
        shedule(this)
        ambientLightColor = this
    }


    open var ambientLightEnergy: Double
        get() = _icall_Double(getAmbientLightEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAmbientLightEnergyMethodBind, this.rawMemory, value)


    open var ambientLightSkyContribution: Double
        get() = _icall_Double(getAmbientLightSkyContributionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAmbientLightSkyContributionMethodBind, this.rawMemory, value)


    open var fogEnabled: Boolean
        get() = _icall_Boolean(isFogEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFogEnabledMethodBind, this.rawMemory, value)


    open var fogColor: Color
        get() = _icall_Color(getFogColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setFogColorMethodBind, this.rawMemory, value)
    open fun fogColor(shedule: (Color) -> Unit): Color = fogColor.apply {
        shedule(this)
        fogColor = this
    }


    open var fogSunColor: Color
        get() = _icall_Color(getFogSunColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setFogSunColorMethodBind, this.rawMemory, value)
    open fun fogSunColor(shedule: (Color) -> Unit): Color = fogSunColor.apply {
        shedule(this)
        fogSunColor = this
    }


    open var fogSunAmount: Double
        get() = _icall_Double(getFogSunAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogSunAmountMethodBind, this.rawMemory, value)


    open var fogDepthEnabled: Boolean
        get() = _icall_Boolean(isFogDepthEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFogDepthEnabledMethodBind, this.rawMemory, value)


    open var fogDepthBegin: Double
        get() = _icall_Double(getFogDepthBeginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogDepthBeginMethodBind, this.rawMemory, value)


    open var fogDepthCurve: Double
        get() = _icall_Double(getFogDepthCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogDepthCurveMethodBind, this.rawMemory, value)


    open var fogTransmitEnabled: Boolean
        get() = _icall_Boolean(isFogTransmitEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFogTransmitEnabledMethodBind, this.rawMemory, value)


    open var fogTransmitCurve: Double
        get() = _icall_Double(getFogTransmitCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogTransmitCurveMethodBind, this.rawMemory, value)


    open var fogHeightEnabled: Boolean
        get() = _icall_Boolean(isFogHeightEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFogHeightEnabledMethodBind, this.rawMemory, value)


    open var fogHeightMin: Double
        get() = _icall_Double(getFogHeightMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogHeightMinMethodBind, this.rawMemory, value)


    open var fogHeightMax: Double
        get() = _icall_Double(getFogHeightMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogHeightMaxMethodBind, this.rawMemory, value)


    open var fogHeightCurve: Double
        get() = _icall_Double(getFogHeightCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFogHeightCurveMethodBind, this.rawMemory, value)


    open var tonemapMode: Long
        get() = _icall_Long(getTonemapperMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTonemapperMethodBind, this.rawMemory, value)


    open var tonemapExposure: Double
        get() = _icall_Double(getTonemapExposureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTonemapExposureMethodBind, this.rawMemory, value)


    open var tonemapWhite: Double
        get() = _icall_Double(getTonemapWhiteMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTonemapWhiteMethodBind, this.rawMemory, value)


    open var autoExposureEnabled: Boolean
        get() = _icall_Boolean(getTonemapAutoExposureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTonemapAutoExposureMethodBind, this.rawMemory, value)


    open var autoExposureScale: Double
        get() = _icall_Double(getTonemapAutoExposureGreyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTonemapAutoExposureGreyMethodBind, this.rawMemory, value)


    open var autoExposureMinLuma: Double
        get() = _icall_Double(getTonemapAutoExposureMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTonemapAutoExposureMinMethodBind, this.rawMemory, value)


    open var autoExposureMaxLuma: Double
        get() = _icall_Double(getTonemapAutoExposureMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTonemapAutoExposureMaxMethodBind, this.rawMemory, value)


    open var autoExposureSpeed: Double
        get() = _icall_Double(getTonemapAutoExposureSpeedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTonemapAutoExposureSpeedMethodBind, this.rawMemory, value)


    open var ssReflectionsEnabled: Boolean
        get() = _icall_Boolean(isSsrEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSsrEnabledMethodBind, this.rawMemory, value)


    open var ssReflectionsMaxSteps: Long
        get() = _icall_Long(getSsrMaxStepsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSsrMaxStepsMethodBind, this.rawMemory, value)


    open var ssReflectionsFadeIn: Double
        get() = _icall_Double(getSsrFadeInMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsrFadeInMethodBind, this.rawMemory, value)


    open var ssReflectionsFadeOut: Double
        get() = _icall_Double(getSsrFadeOutMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsrFadeOutMethodBind, this.rawMemory, value)


    open var ssReflectionsDepthTolerance: Double
        get() = _icall_Double(getSsrDepthToleranceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsrDepthToleranceMethodBind, this.rawMemory, value)


    open var ssReflectionsRoughness: Boolean
        get() = _icall_Boolean(isSsrRoughMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSsrRoughMethodBind, this.rawMemory, value)


    open var ssaoEnabled: Boolean
        get() = _icall_Boolean(isSsaoEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSsaoEnabledMethodBind, this.rawMemory, value)


    open var ssaoRadius: Double
        get() = _icall_Double(getSsaoRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoRadiusMethodBind, this.rawMemory, value)


    open var ssaoIntensity: Double
        get() = _icall_Double(getSsaoIntensityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoIntensityMethodBind, this.rawMemory, value)


    open var ssaoRadius2: Double
        get() = _icall_Double(getSsaoRadius2MethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoRadius2MethodBind, this.rawMemory, value)


    open var ssaoIntensity2: Double
        get() = _icall_Double(getSsaoIntensity2MethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoIntensity2MethodBind, this.rawMemory, value)


    open var ssaoBias: Double
        get() = _icall_Double(getSsaoBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoBiasMethodBind, this.rawMemory, value)


    open var ssaoLightAffect: Double
        get() = _icall_Double(getSsaoDirectLightAffectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoDirectLightAffectMethodBind, this.rawMemory, value)


    open var ssaoAoChannelAffect: Double
        get() = _icall_Double(getSsaoAoChannelAffectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoAoChannelAffectMethodBind, this.rawMemory, value)


    open var ssaoColor: Color
        get() = _icall_Color(getSsaoColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setSsaoColorMethodBind, this.rawMemory, value)
    open fun ssaoColor(shedule: (Color) -> Unit): Color = ssaoColor.apply {
        shedule(this)
        ssaoColor = this
    }


    open var ssaoQuality: Long
        get() = _icall_Long(getSsaoQualityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSsaoQualityMethodBind, this.rawMemory, value)


    open var ssaoBlur: Long
        get() = _icall_Long(getSsaoBlurMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSsaoBlurMethodBind, this.rawMemory, value)


    open var ssaoEdgeSharpness: Double
        get() = _icall_Double(getSsaoEdgeSharpnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSsaoEdgeSharpnessMethodBind, this.rawMemory, value)


    open var dofBlurFarEnabled: Boolean
        get() = _icall_Boolean(isDofBlurFarEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDofBlurFarEnabledMethodBind, this.rawMemory, value)


    open var dofBlurFarDistance: Double
        get() = _icall_Double(getDofBlurFarDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDofBlurFarDistanceMethodBind, this.rawMemory, value)


    open var dofBlurFarTransition: Double
        get() = _icall_Double(getDofBlurFarTransitionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDofBlurFarTransitionMethodBind, this.rawMemory, value)


    open var dofBlurFarAmount: Double
        get() = _icall_Double(getDofBlurFarAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDofBlurFarAmountMethodBind, this.rawMemory, value)


    open var dofBlurFarQuality: Long
        get() = _icall_Long(getDofBlurFarQualityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDofBlurFarQualityMethodBind, this.rawMemory, value)


    open var dofBlurNearEnabled: Boolean
        get() = _icall_Boolean(isDofBlurNearEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDofBlurNearEnabledMethodBind, this.rawMemory, value)


    open var dofBlurNearDistance: Double
        get() = _icall_Double(getDofBlurNearDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDofBlurNearDistanceMethodBind, this.rawMemory, value)


    open var dofBlurNearTransition: Double
        get() = _icall_Double(getDofBlurNearTransitionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDofBlurNearTransitionMethodBind, this.rawMemory, value)


    open var dofBlurNearAmount: Double
        get() = _icall_Double(getDofBlurNearAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDofBlurNearAmountMethodBind, this.rawMemory, value)


    open var dofBlurNearQuality: Long
        get() = _icall_Long(getDofBlurNearQualityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDofBlurNearQualityMethodBind, this.rawMemory, value)


    open var glowEnabled: Boolean
        get() = _icall_Boolean(isGlowEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setGlowEnabledMethodBind, this.rawMemory, value)


    open var glowLevels_1: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 0, value)


    open var glowLevels_2: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 1, value)


    open var glowLevels_3: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 2, value)


    open var glowLevels_4: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 3, value)


    open var glowLevels_5: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 4, value)


    open var glowLevels_6: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 5, value)


    open var glowLevels_7: Boolean
        get() = _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, 6, value)


    open var glowIntensity: Double
        get() = _icall_Double(getGlowIntensityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlowIntensityMethodBind, this.rawMemory, value)


    open var glowStrength: Double
        get() = _icall_Double(getGlowStrengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlowStrengthMethodBind, this.rawMemory, value)


    open var glowBloom: Double
        get() = _icall_Double(getGlowBloomMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlowBloomMethodBind, this.rawMemory, value)


    open var glowBlendMode: Long
        get() = _icall_Long(getGlowBlendModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setGlowBlendModeMethodBind, this.rawMemory, value)


    open var glowHdrThreshold: Double
        get() = _icall_Double(getGlowHdrBleedThresholdMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlowHdrBleedThresholdMethodBind, this.rawMemory, value)


    open var glowHdrScale: Double
        get() = _icall_Double(getGlowHdrBleedScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlowHdrBleedScaleMethodBind, this.rawMemory, value)


    open var glowBicubicUpscale: Boolean
        get() = _icall_Boolean(isGlowBicubicUpscaleEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setGlowBicubicUpscaleMethodBind, this.rawMemory, value)


    open var adjustmentEnabled: Boolean
        get() = _icall_Boolean(isAdjustmentEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAdjustmentEnableMethodBind, this.rawMemory, value)


    open var adjustmentBrightness: Double
        get() = _icall_Double(getAdjustmentBrightnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAdjustmentBrightnessMethodBind, this.rawMemory, value)


    open var adjustmentContrast: Double
        get() = _icall_Double(getAdjustmentContrastMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAdjustmentContrastMethodBind, this.rawMemory, value)


    open var adjustmentSaturation: Double
        get() = _icall_Double(getAdjustmentSaturationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAdjustmentSaturationMethodBind, this.rawMemory, value)


    open var adjustmentColorCorrection: Texture
        get() = _icall_Texture(getAdjustmentColorCorrectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setAdjustmentColorCorrectionMethodBind, this.rawMemory, value)




    // Methods
    private val setBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_background") }
    open fun setBackground(mode: Long) {
        _icall_Unit_Long(setBackgroundMethodBind, this.rawMemory, mode)
    }


    private val setSkyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_sky") }
    open fun setSky(sky: Sky) {
        _icall_Unit_Object(setSkyMethodBind, this.rawMemory, sky)
    }


    private val setSkyCustomFovMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_sky_custom_fov") }
    open fun setSkyCustomFov(scale: Double) {
        _icall_Unit_Double(setSkyCustomFovMethodBind, this.rawMemory, scale)
    }


    private val setBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_bg_color") }
    open fun setBgColor(color: Color) {
        _icall_Unit_Color(setBgColorMethodBind, this.rawMemory, color)
    }


    private val setBgEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_bg_energy") }
    open fun setBgEnergy(energy: Double) {
        _icall_Unit_Double(setBgEnergyMethodBind, this.rawMemory, energy)
    }


    private val setCanvasMaxLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_canvas_max_layer") }
    open fun setCanvasMaxLayer(layer: Long) {
        _icall_Unit_Long(setCanvasMaxLayerMethodBind, this.rawMemory, layer)
    }


    private val setAmbientLightColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ambient_light_color") }
    open fun setAmbientLightColor(color: Color) {
        _icall_Unit_Color(setAmbientLightColorMethodBind, this.rawMemory, color)
    }


    private val setAmbientLightEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ambient_light_energy") }
    open fun setAmbientLightEnergy(energy: Double) {
        _icall_Unit_Double(setAmbientLightEnergyMethodBind, this.rawMemory, energy)
    }


    private val setAmbientLightSkyContributionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ambient_light_sky_contribution") }
    open fun setAmbientLightSkyContribution(energy: Double) {
        _icall_Unit_Double(setAmbientLightSkyContributionMethodBind, this.rawMemory, energy)
    }


    private val getBackgroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_background") }
    open fun getBackground(): Environment.BGMode {
        return Environment.BGMode.fromInt(_icall_Long(getBackgroundMethodBind, this.rawMemory))
    }


    private val getSkyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_sky") }
    open fun getSky(): Sky {
        return _icall_Sky(getSkyMethodBind, this.rawMemory)
    }


    private val getSkyCustomFovMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_sky_custom_fov") }
    open fun getSkyCustomFov(): Double {
        return _icall_Double(getSkyCustomFovMethodBind, this.rawMemory)
    }


    private val getBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_bg_color") }
    open fun getBgColor(): Color {
        return _icall_Color(getBgColorMethodBind, this.rawMemory)
    }


    private val getBgEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_bg_energy") }
    open fun getBgEnergy(): Double {
        return _icall_Double(getBgEnergyMethodBind, this.rawMemory)
    }


    private val getCanvasMaxLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_canvas_max_layer") }
    open fun getCanvasMaxLayer(): Long {
        return _icall_Long(getCanvasMaxLayerMethodBind, this.rawMemory)
    }


    private val getAmbientLightColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ambient_light_color") }
    open fun getAmbientLightColor(): Color {
        return _icall_Color(getAmbientLightColorMethodBind, this.rawMemory)
    }


    private val getAmbientLightEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ambient_light_energy") }
    open fun getAmbientLightEnergy(): Double {
        return _icall_Double(getAmbientLightEnergyMethodBind, this.rawMemory)
    }


    private val getAmbientLightSkyContributionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ambient_light_sky_contribution") }
    open fun getAmbientLightSkyContribution(): Double {
        return _icall_Double(getAmbientLightSkyContributionMethodBind, this.rawMemory)
    }


    private val setFogEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_enabled") }
    open fun setFogEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setFogEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isFogEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_fog_enabled") }
    open fun isFogEnabled(): Boolean {
        return _icall_Boolean(isFogEnabledMethodBind, this.rawMemory)
    }


    private val setFogColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_color") }
    open fun setFogColor(color: Color) {
        _icall_Unit_Color(setFogColorMethodBind, this.rawMemory, color)
    }


    private val getFogColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_color") }
    open fun getFogColor(): Color {
        return _icall_Color(getFogColorMethodBind, this.rawMemory)
    }


    private val setFogSunColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_sun_color") }
    open fun setFogSunColor(color: Color) {
        _icall_Unit_Color(setFogSunColorMethodBind, this.rawMemory, color)
    }


    private val getFogSunColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_sun_color") }
    open fun getFogSunColor(): Color {
        return _icall_Color(getFogSunColorMethodBind, this.rawMemory)
    }


    private val setFogSunAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_sun_amount") }
    open fun setFogSunAmount(amount: Double) {
        _icall_Unit_Double(setFogSunAmountMethodBind, this.rawMemory, amount)
    }


    private val getFogSunAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_sun_amount") }
    open fun getFogSunAmount(): Double {
        return _icall_Double(getFogSunAmountMethodBind, this.rawMemory)
    }


    private val setFogDepthEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_depth_enabled") }
    open fun setFogDepthEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setFogDepthEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isFogDepthEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_fog_depth_enabled") }
    open fun isFogDepthEnabled(): Boolean {
        return _icall_Boolean(isFogDepthEnabledMethodBind, this.rawMemory)
    }


    private val setFogDepthBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_depth_begin") }
    open fun setFogDepthBegin(distance: Double) {
        _icall_Unit_Double(setFogDepthBeginMethodBind, this.rawMemory, distance)
    }


    private val getFogDepthBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_depth_begin") }
    open fun getFogDepthBegin(): Double {
        return _icall_Double(getFogDepthBeginMethodBind, this.rawMemory)
    }


    private val setFogDepthCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_depth_curve") }
    open fun setFogDepthCurve(curve: Double) {
        _icall_Unit_Double(setFogDepthCurveMethodBind, this.rawMemory, curve)
    }


    private val getFogDepthCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_depth_curve") }
    open fun getFogDepthCurve(): Double {
        return _icall_Double(getFogDepthCurveMethodBind, this.rawMemory)
    }


    private val setFogTransmitEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_transmit_enabled") }
    open fun setFogTransmitEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setFogTransmitEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isFogTransmitEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_fog_transmit_enabled") }
    open fun isFogTransmitEnabled(): Boolean {
        return _icall_Boolean(isFogTransmitEnabledMethodBind, this.rawMemory)
    }


    private val setFogTransmitCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_transmit_curve") }
    open fun setFogTransmitCurve(curve: Double) {
        _icall_Unit_Double(setFogTransmitCurveMethodBind, this.rawMemory, curve)
    }


    private val getFogTransmitCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_transmit_curve") }
    open fun getFogTransmitCurve(): Double {
        return _icall_Double(getFogTransmitCurveMethodBind, this.rawMemory)
    }


    private val setFogHeightEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_height_enabled") }
    open fun setFogHeightEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setFogHeightEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isFogHeightEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_fog_height_enabled") }
    open fun isFogHeightEnabled(): Boolean {
        return _icall_Boolean(isFogHeightEnabledMethodBind, this.rawMemory)
    }


    private val setFogHeightMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_height_min") }
    open fun setFogHeightMin(height: Double) {
        _icall_Unit_Double(setFogHeightMinMethodBind, this.rawMemory, height)
    }


    private val getFogHeightMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_height_min") }
    open fun getFogHeightMin(): Double {
        return _icall_Double(getFogHeightMinMethodBind, this.rawMemory)
    }


    private val setFogHeightMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_height_max") }
    open fun setFogHeightMax(height: Double) {
        _icall_Unit_Double(setFogHeightMaxMethodBind, this.rawMemory, height)
    }


    private val getFogHeightMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_height_max") }
    open fun getFogHeightMax(): Double {
        return _icall_Double(getFogHeightMaxMethodBind, this.rawMemory)
    }


    private val setFogHeightCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_fog_height_curve") }
    open fun setFogHeightCurve(curve: Double) {
        _icall_Unit_Double(setFogHeightCurveMethodBind, this.rawMemory, curve)
    }


    private val getFogHeightCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_fog_height_curve") }
    open fun getFogHeightCurve(): Double {
        return _icall_Double(getFogHeightCurveMethodBind, this.rawMemory)
    }


    private val setTonemapperMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemapper") }
    open fun setTonemapper(mode: Long) {
        _icall_Unit_Long(setTonemapperMethodBind, this.rawMemory, mode)
    }


    private val getTonemapperMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemapper") }
    open fun getTonemapper(): Environment.ToneMapper {
        return Environment.ToneMapper.fromInt(_icall_Long(getTonemapperMethodBind, this.rawMemory))
    }


    private val setTonemapExposureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_exposure") }
    open fun setTonemapExposure(exposure: Double) {
        _icall_Unit_Double(setTonemapExposureMethodBind, this.rawMemory, exposure)
    }


    private val getTonemapExposureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_exposure") }
    open fun getTonemapExposure(): Double {
        return _icall_Double(getTonemapExposureMethodBind, this.rawMemory)
    }


    private val setTonemapWhiteMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_white") }
    open fun setTonemapWhite(white: Double) {
        _icall_Unit_Double(setTonemapWhiteMethodBind, this.rawMemory, white)
    }


    private val getTonemapWhiteMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_white") }
    open fun getTonemapWhite(): Double {
        return _icall_Double(getTonemapWhiteMethodBind, this.rawMemory)
    }


    private val setTonemapAutoExposureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_auto_exposure") }
    open fun setTonemapAutoExposure(autoExposure: Boolean) {
        _icall_Unit_Boolean(setTonemapAutoExposureMethodBind, this.rawMemory, autoExposure)
    }


    private val getTonemapAutoExposureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_auto_exposure") }
    open fun getTonemapAutoExposure(): Boolean {
        return _icall_Boolean(getTonemapAutoExposureMethodBind, this.rawMemory)
    }


    private val setTonemapAutoExposureMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_auto_exposure_max") }
    open fun setTonemapAutoExposureMax(exposureMax: Double) {
        _icall_Unit_Double(setTonemapAutoExposureMaxMethodBind, this.rawMemory, exposureMax)
    }


    private val getTonemapAutoExposureMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_auto_exposure_max") }
    open fun getTonemapAutoExposureMax(): Double {
        return _icall_Double(getTonemapAutoExposureMaxMethodBind, this.rawMemory)
    }


    private val setTonemapAutoExposureMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_auto_exposure_min") }
    open fun setTonemapAutoExposureMin(exposureMin: Double) {
        _icall_Unit_Double(setTonemapAutoExposureMinMethodBind, this.rawMemory, exposureMin)
    }


    private val getTonemapAutoExposureMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_auto_exposure_min") }
    open fun getTonemapAutoExposureMin(): Double {
        return _icall_Double(getTonemapAutoExposureMinMethodBind, this.rawMemory)
    }


    private val setTonemapAutoExposureSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_auto_exposure_speed") }
    open fun setTonemapAutoExposureSpeed(exposureSpeed: Double) {
        _icall_Unit_Double(setTonemapAutoExposureSpeedMethodBind, this.rawMemory, exposureSpeed)
    }


    private val getTonemapAutoExposureSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_auto_exposure_speed") }
    open fun getTonemapAutoExposureSpeed(): Double {
        return _icall_Double(getTonemapAutoExposureSpeedMethodBind, this.rawMemory)
    }


    private val setTonemapAutoExposureGreyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_tonemap_auto_exposure_grey") }
    open fun setTonemapAutoExposureGrey(exposureGrey: Double) {
        _icall_Unit_Double(setTonemapAutoExposureGreyMethodBind, this.rawMemory, exposureGrey)
    }


    private val getTonemapAutoExposureGreyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_tonemap_auto_exposure_grey") }
    open fun getTonemapAutoExposureGrey(): Double {
        return _icall_Double(getTonemapAutoExposureGreyMethodBind, this.rawMemory)
    }


    private val setSsrEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssr_enabled") }
    open fun setSsrEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setSsrEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isSsrEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_ssr_enabled") }
    open fun isSsrEnabled(): Boolean {
        return _icall_Boolean(isSsrEnabledMethodBind, this.rawMemory)
    }


    private val setSsrMaxStepsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssr_max_steps") }
    open fun setSsrMaxSteps(maxSteps: Long) {
        _icall_Unit_Long(setSsrMaxStepsMethodBind, this.rawMemory, maxSteps)
    }


    private val getSsrMaxStepsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssr_max_steps") }
    open fun getSsrMaxSteps(): Long {
        return _icall_Long(getSsrMaxStepsMethodBind, this.rawMemory)
    }


    private val setSsrFadeInMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssr_fade_in") }
    open fun setSsrFadeIn(fadeIn: Double) {
        _icall_Unit_Double(setSsrFadeInMethodBind, this.rawMemory, fadeIn)
    }


    private val getSsrFadeInMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssr_fade_in") }
    open fun getSsrFadeIn(): Double {
        return _icall_Double(getSsrFadeInMethodBind, this.rawMemory)
    }


    private val setSsrFadeOutMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssr_fade_out") }
    open fun setSsrFadeOut(fadeOut: Double) {
        _icall_Unit_Double(setSsrFadeOutMethodBind, this.rawMemory, fadeOut)
    }


    private val getSsrFadeOutMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssr_fade_out") }
    open fun getSsrFadeOut(): Double {
        return _icall_Double(getSsrFadeOutMethodBind, this.rawMemory)
    }


    private val setSsrDepthToleranceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssr_depth_tolerance") }
    open fun setSsrDepthTolerance(depthTolerance: Double) {
        _icall_Unit_Double(setSsrDepthToleranceMethodBind, this.rawMemory, depthTolerance)
    }


    private val getSsrDepthToleranceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssr_depth_tolerance") }
    open fun getSsrDepthTolerance(): Double {
        return _icall_Double(getSsrDepthToleranceMethodBind, this.rawMemory)
    }


    private val setSsrRoughMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssr_rough") }
    open fun setSsrRough(rough: Boolean) {
        _icall_Unit_Boolean(setSsrRoughMethodBind, this.rawMemory, rough)
    }


    private val isSsrRoughMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_ssr_rough") }
    open fun isSsrRough(): Boolean {
        return _icall_Boolean(isSsrRoughMethodBind, this.rawMemory)
    }


    private val setSsaoEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_enabled") }
    open fun setSsaoEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setSsaoEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isSsaoEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_ssao_enabled") }
    open fun isSsaoEnabled(): Boolean {
        return _icall_Boolean(isSsaoEnabledMethodBind, this.rawMemory)
    }


    private val setSsaoRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_radius") }
    open fun setSsaoRadius(radius: Double) {
        _icall_Unit_Double(setSsaoRadiusMethodBind, this.rawMemory, radius)
    }


    private val getSsaoRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_radius") }
    open fun getSsaoRadius(): Double {
        return _icall_Double(getSsaoRadiusMethodBind, this.rawMemory)
    }


    private val setSsaoIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_intensity") }
    open fun setSsaoIntensity(intensity: Double) {
        _icall_Unit_Double(setSsaoIntensityMethodBind, this.rawMemory, intensity)
    }


    private val getSsaoIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_intensity") }
    open fun getSsaoIntensity(): Double {
        return _icall_Double(getSsaoIntensityMethodBind, this.rawMemory)
    }


    private val setSsaoRadius2MethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_radius2") }
    open fun setSsaoRadius2(radius: Double) {
        _icall_Unit_Double(setSsaoRadius2MethodBind, this.rawMemory, radius)
    }


    private val getSsaoRadius2MethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_radius2") }
    open fun getSsaoRadius2(): Double {
        return _icall_Double(getSsaoRadius2MethodBind, this.rawMemory)
    }


    private val setSsaoIntensity2MethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_intensity2") }
    open fun setSsaoIntensity2(intensity: Double) {
        _icall_Unit_Double(setSsaoIntensity2MethodBind, this.rawMemory, intensity)
    }


    private val getSsaoIntensity2MethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_intensity2") }
    open fun getSsaoIntensity2(): Double {
        return _icall_Double(getSsaoIntensity2MethodBind, this.rawMemory)
    }


    private val setSsaoBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_bias") }
    open fun setSsaoBias(bias: Double) {
        _icall_Unit_Double(setSsaoBiasMethodBind, this.rawMemory, bias)
    }


    private val getSsaoBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_bias") }
    open fun getSsaoBias(): Double {
        return _icall_Double(getSsaoBiasMethodBind, this.rawMemory)
    }


    private val setSsaoDirectLightAffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_direct_light_affect") }
    open fun setSsaoDirectLightAffect(amount: Double) {
        _icall_Unit_Double(setSsaoDirectLightAffectMethodBind, this.rawMemory, amount)
    }


    private val getSsaoDirectLightAffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_direct_light_affect") }
    open fun getSsaoDirectLightAffect(): Double {
        return _icall_Double(getSsaoDirectLightAffectMethodBind, this.rawMemory)
    }


    private val setSsaoAoChannelAffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_ao_channel_affect") }
    open fun setSsaoAoChannelAffect(amount: Double) {
        _icall_Unit_Double(setSsaoAoChannelAffectMethodBind, this.rawMemory, amount)
    }


    private val getSsaoAoChannelAffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_ao_channel_affect") }
    open fun getSsaoAoChannelAffect(): Double {
        return _icall_Double(getSsaoAoChannelAffectMethodBind, this.rawMemory)
    }


    private val setSsaoColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_color") }
    open fun setSsaoColor(color: Color) {
        _icall_Unit_Color(setSsaoColorMethodBind, this.rawMemory, color)
    }


    private val getSsaoColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_color") }
    open fun getSsaoColor(): Color {
        return _icall_Color(getSsaoColorMethodBind, this.rawMemory)
    }


    private val setSsaoBlurMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_blur") }
    open fun setSsaoBlur(mode: Long) {
        _icall_Unit_Long(setSsaoBlurMethodBind, this.rawMemory, mode)
    }


    private val getSsaoBlurMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_blur") }
    open fun getSsaoBlur(): Environment.SSAOBlur {
        return Environment.SSAOBlur.fromInt(_icall_Long(getSsaoBlurMethodBind, this.rawMemory))
    }


    private val setSsaoQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_quality") }
    open fun setSsaoQuality(quality: Long) {
        _icall_Unit_Long(setSsaoQualityMethodBind, this.rawMemory, quality)
    }


    private val getSsaoQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_quality") }
    open fun getSsaoQuality(): Environment.SSAOQuality {
        return Environment.SSAOQuality.fromInt(_icall_Long(getSsaoQualityMethodBind, this.rawMemory))
    }


    private val setSsaoEdgeSharpnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_ssao_edge_sharpness") }
    open fun setSsaoEdgeSharpness(edgeSharpness: Double) {
        _icall_Unit_Double(setSsaoEdgeSharpnessMethodBind, this.rawMemory, edgeSharpness)
    }


    private val getSsaoEdgeSharpnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_ssao_edge_sharpness") }
    open fun getSsaoEdgeSharpness(): Double {
        return _icall_Double(getSsaoEdgeSharpnessMethodBind, this.rawMemory)
    }


    private val setDofBlurFarEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_far_enabled") }
    open fun setDofBlurFarEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setDofBlurFarEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isDofBlurFarEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_dof_blur_far_enabled") }
    open fun isDofBlurFarEnabled(): Boolean {
        return _icall_Boolean(isDofBlurFarEnabledMethodBind, this.rawMemory)
    }


    private val setDofBlurFarDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_far_distance") }
    open fun setDofBlurFarDistance(intensity: Double) {
        _icall_Unit_Double(setDofBlurFarDistanceMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurFarDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_far_distance") }
    open fun getDofBlurFarDistance(): Double {
        return _icall_Double(getDofBlurFarDistanceMethodBind, this.rawMemory)
    }


    private val setDofBlurFarTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_far_transition") }
    open fun setDofBlurFarTransition(intensity: Double) {
        _icall_Unit_Double(setDofBlurFarTransitionMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurFarTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_far_transition") }
    open fun getDofBlurFarTransition(): Double {
        return _icall_Double(getDofBlurFarTransitionMethodBind, this.rawMemory)
    }


    private val setDofBlurFarAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_far_amount") }
    open fun setDofBlurFarAmount(intensity: Double) {
        _icall_Unit_Double(setDofBlurFarAmountMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurFarAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_far_amount") }
    open fun getDofBlurFarAmount(): Double {
        return _icall_Double(getDofBlurFarAmountMethodBind, this.rawMemory)
    }


    private val setDofBlurFarQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_far_quality") }
    open fun setDofBlurFarQuality(intensity: Long) {
        _icall_Unit_Long(setDofBlurFarQualityMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurFarQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_far_quality") }
    open fun getDofBlurFarQuality(): Environment.DOFBlurQuality {
        return Environment.DOFBlurQuality.fromInt(_icall_Long(getDofBlurFarQualityMethodBind, this.rawMemory))
    }


    private val setDofBlurNearEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_near_enabled") }
    open fun setDofBlurNearEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setDofBlurNearEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isDofBlurNearEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_dof_blur_near_enabled") }
    open fun isDofBlurNearEnabled(): Boolean {
        return _icall_Boolean(isDofBlurNearEnabledMethodBind, this.rawMemory)
    }


    private val setDofBlurNearDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_near_distance") }
    open fun setDofBlurNearDistance(intensity: Double) {
        _icall_Unit_Double(setDofBlurNearDistanceMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurNearDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_near_distance") }
    open fun getDofBlurNearDistance(): Double {
        return _icall_Double(getDofBlurNearDistanceMethodBind, this.rawMemory)
    }


    private val setDofBlurNearTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_near_transition") }
    open fun setDofBlurNearTransition(intensity: Double) {
        _icall_Unit_Double(setDofBlurNearTransitionMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurNearTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_near_transition") }
    open fun getDofBlurNearTransition(): Double {
        return _icall_Double(getDofBlurNearTransitionMethodBind, this.rawMemory)
    }


    private val setDofBlurNearAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_near_amount") }
    open fun setDofBlurNearAmount(intensity: Double) {
        _icall_Unit_Double(setDofBlurNearAmountMethodBind, this.rawMemory, intensity)
    }


    private val getDofBlurNearAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_near_amount") }
    open fun getDofBlurNearAmount(): Double {
        return _icall_Double(getDofBlurNearAmountMethodBind, this.rawMemory)
    }


    private val setDofBlurNearQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_dof_blur_near_quality") }
    open fun setDofBlurNearQuality(level: Long) {
        _icall_Unit_Long(setDofBlurNearQualityMethodBind, this.rawMemory, level)
    }


    private val getDofBlurNearQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_dof_blur_near_quality") }
    open fun getDofBlurNearQuality(): Environment.DOFBlurQuality {
        return Environment.DOFBlurQuality.fromInt(_icall_Long(getDofBlurNearQualityMethodBind, this.rawMemory))
    }


    private val setGlowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_enabled") }
    open fun setGlowEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setGlowEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isGlowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_glow_enabled") }
    open fun isGlowEnabled(): Boolean {
        return _icall_Boolean(isGlowEnabledMethodBind, this.rawMemory)
    }


    private val setGlowLevelMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_level") }
    open fun setGlowLevel(idx: Long, enabled: Boolean) {
        _icall_Unit_Long_Boolean(setGlowLevelMethodBind, this.rawMemory, idx, enabled)
    }


    private val isGlowLevelEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_glow_level_enabled") }
    open fun isGlowLevelEnabled(idx: Long): Boolean {
        return _icall_Boolean_Long(isGlowLevelEnabledMethodBind, this.rawMemory, idx)
    }


    private val setGlowIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_intensity") }
    open fun setGlowIntensity(intensity: Double) {
        _icall_Unit_Double(setGlowIntensityMethodBind, this.rawMemory, intensity)
    }


    private val getGlowIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_glow_intensity") }
    open fun getGlowIntensity(): Double {
        return _icall_Double(getGlowIntensityMethodBind, this.rawMemory)
    }


    private val setGlowStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_strength") }
    open fun setGlowStrength(strength: Double) {
        _icall_Unit_Double(setGlowStrengthMethodBind, this.rawMemory, strength)
    }


    private val getGlowStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_glow_strength") }
    open fun getGlowStrength(): Double {
        return _icall_Double(getGlowStrengthMethodBind, this.rawMemory)
    }


    private val setGlowBloomMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_bloom") }
    open fun setGlowBloom(amount: Double) {
        _icall_Unit_Double(setGlowBloomMethodBind, this.rawMemory, amount)
    }


    private val getGlowBloomMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_glow_bloom") }
    open fun getGlowBloom(): Double {
        return _icall_Double(getGlowBloomMethodBind, this.rawMemory)
    }


    private val setGlowBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_blend_mode") }
    open fun setGlowBlendMode(mode: Long) {
        _icall_Unit_Long(setGlowBlendModeMethodBind, this.rawMemory, mode)
    }


    private val getGlowBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_glow_blend_mode") }
    open fun getGlowBlendMode(): Environment.GlowBlendMode {
        return Environment.GlowBlendMode.fromInt(_icall_Long(getGlowBlendModeMethodBind, this.rawMemory))
    }


    private val setGlowHdrBleedThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_hdr_bleed_threshold") }
    open fun setGlowHdrBleedThreshold(threshold: Double) {
        _icall_Unit_Double(setGlowHdrBleedThresholdMethodBind, this.rawMemory, threshold)
    }


    private val getGlowHdrBleedThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_glow_hdr_bleed_threshold") }
    open fun getGlowHdrBleedThreshold(): Double {
        return _icall_Double(getGlowHdrBleedThresholdMethodBind, this.rawMemory)
    }


    private val setGlowHdrBleedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_hdr_bleed_scale") }
    open fun setGlowHdrBleedScale(scale: Double) {
        _icall_Unit_Double(setGlowHdrBleedScaleMethodBind, this.rawMemory, scale)
    }


    private val getGlowHdrBleedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_glow_hdr_bleed_scale") }
    open fun getGlowHdrBleedScale(): Double {
        return _icall_Double(getGlowHdrBleedScaleMethodBind, this.rawMemory)
    }


    private val setGlowBicubicUpscaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_glow_bicubic_upscale") }
    open fun setGlowBicubicUpscale(enabled: Boolean) {
        _icall_Unit_Boolean(setGlowBicubicUpscaleMethodBind, this.rawMemory, enabled)
    }


    private val isGlowBicubicUpscaleEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_glow_bicubic_upscale_enabled") }
    open fun isGlowBicubicUpscaleEnabled(): Boolean {
        return _icall_Boolean(isGlowBicubicUpscaleEnabledMethodBind, this.rawMemory)
    }


    private val setAdjustmentEnableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_adjustment_enable") }
    open fun setAdjustmentEnable(enabled: Boolean) {
        _icall_Unit_Boolean(setAdjustmentEnableMethodBind, this.rawMemory, enabled)
    }


    private val isAdjustmentEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "is_adjustment_enabled") }
    open fun isAdjustmentEnabled(): Boolean {
        return _icall_Boolean(isAdjustmentEnabledMethodBind, this.rawMemory)
    }


    private val setAdjustmentBrightnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_adjustment_brightness") }
    open fun setAdjustmentBrightness(brightness: Double) {
        _icall_Unit_Double(setAdjustmentBrightnessMethodBind, this.rawMemory, brightness)
    }


    private val getAdjustmentBrightnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_adjustment_brightness") }
    open fun getAdjustmentBrightness(): Double {
        return _icall_Double(getAdjustmentBrightnessMethodBind, this.rawMemory)
    }


    private val setAdjustmentContrastMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_adjustment_contrast") }
    open fun setAdjustmentContrast(contrast: Double) {
        _icall_Unit_Double(setAdjustmentContrastMethodBind, this.rawMemory, contrast)
    }


    private val getAdjustmentContrastMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_adjustment_contrast") }
    open fun getAdjustmentContrast(): Double {
        return _icall_Double(getAdjustmentContrastMethodBind, this.rawMemory)
    }


    private val setAdjustmentSaturationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_adjustment_saturation") }
    open fun setAdjustmentSaturation(saturation: Double) {
        _icall_Unit_Double(setAdjustmentSaturationMethodBind, this.rawMemory, saturation)
    }


    private val getAdjustmentSaturationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_adjustment_saturation") }
    open fun getAdjustmentSaturation(): Double {
        return _icall_Double(getAdjustmentSaturationMethodBind, this.rawMemory)
    }


    private val setAdjustmentColorCorrectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "set_adjustment_color_correction") }
    open fun setAdjustmentColorCorrection(colorCorrection: Texture) {
        _icall_Unit_Object(setAdjustmentColorCorrectionMethodBind, this.rawMemory, colorCorrection)
    }


    private val getAdjustmentColorCorrectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Environment", "get_adjustment_color_correction") }
    open fun getAdjustmentColorCorrection(): Texture {
        return _icall_Texture(getAdjustmentColorCorrectionMethodBind, this.rawMemory)
    }


}
