// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Environment
import godot.core.Basis
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Basis
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Sky
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Basis
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Environment internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var adjustmentBrightness: Double
    get() {
      val mb = getMethodBind("Environment","get_adjustment_brightness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_adjustment_brightness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var adjustmentColorCorrection: Texture
    get() {
      val mb = getMethodBind("Environment","get_adjustment_color_correction")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_adjustment_color_correction")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var adjustmentContrast: Double
    get() {
      val mb = getMethodBind("Environment","get_adjustment_contrast")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_adjustment_contrast")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var adjustmentEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_adjustment_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_adjustment_enable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var adjustmentSaturation: Double
    get() {
      val mb = getMethodBind("Environment","get_adjustment_saturation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_adjustment_saturation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ambientLightColor: Color
    get() {
      val mb = getMethodBind("Environment","get_ambient_light_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ambient_light_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var ambientLightEnergy: Double
    get() {
      val mb = getMethodBind("Environment","get_ambient_light_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ambient_light_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ambientLightSkyContribution: Double
    get() {
      val mb = getMethodBind("Environment","get_ambient_light_sky_contribution")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ambient_light_sky_contribution")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var autoExposureEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","get_tonemap_auto_exposure")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_auto_exposure")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var autoExposureMaxLuma: Double
    get() {
      val mb = getMethodBind("Environment","get_tonemap_auto_exposure_max")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_auto_exposure_max")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var autoExposureMinLuma: Double
    get() {
      val mb = getMethodBind("Environment","get_tonemap_auto_exposure_min")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_auto_exposure_min")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var autoExposureScale: Double
    get() {
      val mb = getMethodBind("Environment","get_tonemap_auto_exposure_grey")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_auto_exposure_grey")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var autoExposureSpeed: Double
    get() {
      val mb = getMethodBind("Environment","get_tonemap_auto_exposure_speed")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_auto_exposure_speed")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var backgroundCameraFeedId: Long
    get() {
      val mb = getMethodBind("Environment","get_camera_feed_id")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_camera_feed_id")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var backgroundCanvasMaxLayer: Long
    get() {
      val mb = getMethodBind("Environment","get_canvas_max_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_canvas_max_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var backgroundColor: Color
    get() {
      val mb = getMethodBind("Environment","get_bg_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_bg_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var backgroundEnergy: Double
    get() {
      val mb = getMethodBind("Environment","get_bg_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_bg_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var backgroundMode: Long
    get() {
      val mb = getMethodBind("Environment","get_background")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_background")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var backgroundSky: Sky
    get() {
      val mb = getMethodBind("Environment","get_sky")
      return _icall_Sky(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_sky")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var backgroundSkyCustomFov: Double
    get() {
      val mb = getMethodBind("Environment","get_sky_custom_fov")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_sky_custom_fov")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var backgroundSkyOrientation: Basis
    get() {
      val mb = getMethodBind("Environment","get_sky_orientation")
      return _icall_Basis(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_sky_orientation")
      _icall_Unit_Basis(mb, this.ptr, value)
    }

  open var backgroundSkyRotation: Vector3
    get() {
      val mb = getMethodBind("Environment","get_sky_rotation")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_sky_rotation")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var backgroundSkyRotationDegrees: Vector3
    get() {
      val mb = getMethodBind("Environment","get_sky_rotation_degrees")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_sky_rotation_degrees")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var dofBlurFarAmount: Double
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_far_amount")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_far_amount")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dofBlurFarDistance: Double
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_far_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_far_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dofBlurFarEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_dof_blur_far_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_far_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dofBlurFarQuality: Long
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_far_quality")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_far_quality")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dofBlurFarTransition: Double
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_far_transition")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_far_transition")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dofBlurNearAmount: Double
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_near_amount")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_near_amount")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dofBlurNearDistance: Double
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_near_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_near_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dofBlurNearEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_dof_blur_near_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_near_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dofBlurNearQuality: Long
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_near_quality")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_near_quality")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dofBlurNearTransition: Double
    get() {
      val mb = getMethodBind("Environment","get_dof_blur_near_transition")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_dof_blur_near_transition")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogColor: Color
    get() {
      val mb = getMethodBind("Environment","get_fog_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var fogDepthBegin: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_depth_begin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_depth_begin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogDepthCurve: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_depth_curve")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_depth_curve")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogDepthEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_fog_depth_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_depth_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var fogDepthEnd: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_depth_end")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_depth_end")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_fog_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var fogHeightCurve: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_height_curve")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_height_curve")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogHeightEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_fog_height_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_height_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var fogHeightMax: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_height_max")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_height_max")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogHeightMin: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_height_min")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_height_min")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogSunAmount: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_sun_amount")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_sun_amount")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogSunColor: Color
    get() {
      val mb = getMethodBind("Environment","get_fog_sun_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_sun_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var fogTransmitCurve: Double
    get() {
      val mb = getMethodBind("Environment","get_fog_transmit_curve")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_transmit_curve")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fogTransmitEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_fog_transmit_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_fog_transmit_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var glowBicubicUpscale: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_bicubic_upscale_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_bicubic_upscale")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var glowBlendMode: Long
    get() {
      val mb = getMethodBind("Environment","get_glow_blend_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_blend_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var glowBloom: Double
    get() {
      val mb = getMethodBind("Environment","get_glow_bloom")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_bloom")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var glowEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var glowHdrLuminanceCap: Double
    get() {
      val mb = getMethodBind("Environment","get_glow_hdr_luminance_cap")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_hdr_luminance_cap")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var glowHdrScale: Double
    get() {
      val mb = getMethodBind("Environment","get_glow_hdr_bleed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_hdr_bleed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var glowHdrThreshold: Double
    get() {
      val mb = getMethodBind("Environment","get_glow_hdr_bleed_threshold")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_hdr_bleed_threshold")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var glowIntensity: Double
    get() {
      val mb = getMethodBind("Environment","get_glow_intensity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_intensity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var glowLevels_1: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var glowLevels_2: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var glowLevels_3: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var glowLevels_4: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  open var glowLevels_5: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var glowLevels_6: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var glowLevels_7: Boolean
    get() {
      val mb = getMethodBind("Environment","is_glow_level_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_level")
      _icall_Unit_Long_Boolean(mb, this.ptr, 6, value)
    }

  open var glowStrength: Double
    get() {
      val mb = getMethodBind("Environment","get_glow_strength")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_glow_strength")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssReflectionsDepthTolerance: Double
    get() {
      val mb = getMethodBind("Environment","get_ssr_depth_tolerance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssr_depth_tolerance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssReflectionsEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_ssr_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssr_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var ssReflectionsFadeIn: Double
    get() {
      val mb = getMethodBind("Environment","get_ssr_fade_in")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssr_fade_in")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssReflectionsFadeOut: Double
    get() {
      val mb = getMethodBind("Environment","get_ssr_fade_out")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssr_fade_out")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssReflectionsMaxSteps: Long
    get() {
      val mb = getMethodBind("Environment","get_ssr_max_steps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssr_max_steps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var ssReflectionsRoughness: Boolean
    get() {
      val mb = getMethodBind("Environment","is_ssr_rough")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssr_rough")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var ssaoAoChannelAffect: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_ao_channel_affect")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_ao_channel_affect")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoBias: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoBlur: Long
    get() {
      val mb = getMethodBind("Environment","get_ssao_blur")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_blur")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var ssaoColor: Color
    get() {
      val mb = getMethodBind("Environment","get_ssao_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var ssaoEdgeSharpness: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_edge_sharpness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_edge_sharpness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoEnabled: Boolean
    get() {
      val mb = getMethodBind("Environment","is_ssao_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var ssaoIntensity: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_intensity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_intensity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoIntensity2: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_intensity2")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_intensity2")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoLightAffect: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_direct_light_affect")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_direct_light_affect")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoQuality: Long
    get() {
      val mb = getMethodBind("Environment","get_ssao_quality")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_quality")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var ssaoRadius: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ssaoRadius2: Double
    get() {
      val mb = getMethodBind("Environment","get_ssao_radius2")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_ssao_radius2")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tonemapExposure: Double
    get() {
      val mb = getMethodBind("Environment","get_tonemap_exposure")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_exposure")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tonemapMode: Long
    get() {
      val mb = getMethodBind("Environment","get_tonemapper")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemapper")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var tonemapWhite: Double
    get() {
      val mb = getMethodBind("Environment","get_tonemap_white")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Environment","set_tonemap_white")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Environment", "Environment")
        }

  }

  open fun ambientLightColor(schedule: Color.() -> Unit): Color = ambientLightColor.apply{
      schedule(this)
      ambientLightColor = this
  }


  open fun backgroundColor(schedule: Color.() -> Unit): Color = backgroundColor.apply{
      schedule(this)
      backgroundColor = this
  }


  open fun backgroundSkyOrientation(schedule: Basis.() -> Unit): Basis =
      backgroundSkyOrientation.apply{
      schedule(this)
      backgroundSkyOrientation = this
  }


  open fun backgroundSkyRotation(schedule: Vector3.() -> Unit): Vector3 =
      backgroundSkyRotation.apply{
      schedule(this)
      backgroundSkyRotation = this
  }


  open fun backgroundSkyRotationDegrees(schedule: Vector3.() -> Unit): Vector3 =
      backgroundSkyRotationDegrees.apply{
      schedule(this)
      backgroundSkyRotationDegrees = this
  }


  open fun fogColor(schedule: Color.() -> Unit): Color = fogColor.apply{
      schedule(this)
      fogColor = this
  }


  open fun fogSunColor(schedule: Color.() -> Unit): Color = fogSunColor.apply{
      schedule(this)
      fogSunColor = this
  }


  open fun ssaoColor(schedule: Color.() -> Unit): Color = ssaoColor.apply{
      schedule(this)
      ssaoColor = this
  }


  open fun getAdjustmentBrightness(): Double {
    val mb = getMethodBind("Environment","get_adjustment_brightness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAdjustmentColorCorrection(): Texture {
    val mb = getMethodBind("Environment","get_adjustment_color_correction")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getAdjustmentContrast(): Double {
    val mb = getMethodBind("Environment","get_adjustment_contrast")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAdjustmentSaturation(): Double {
    val mb = getMethodBind("Environment","get_adjustment_saturation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAmbientLightColor(): Color {
    val mb = getMethodBind("Environment","get_ambient_light_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getAmbientLightEnergy(): Double {
    val mb = getMethodBind("Environment","get_ambient_light_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAmbientLightSkyContribution(): Double {
    val mb = getMethodBind("Environment","get_ambient_light_sky_contribution")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBackground(): Environment.BGMode {
    val mb = getMethodBind("Environment","get_background")
    return Environment.BGMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getBgColor(): Color {
    val mb = getMethodBind("Environment","get_bg_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getBgEnergy(): Double {
    val mb = getMethodBind("Environment","get_bg_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCameraFeedId(): Long {
    val mb = getMethodBind("Environment","get_camera_feed_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCanvasMaxLayer(): Long {
    val mb = getMethodBind("Environment","get_canvas_max_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDofBlurFarAmount(): Double {
    val mb = getMethodBind("Environment","get_dof_blur_far_amount")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDofBlurFarDistance(): Double {
    val mb = getMethodBind("Environment","get_dof_blur_far_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDofBlurFarQuality(): Environment.DOFBlurQuality {
    val mb = getMethodBind("Environment","get_dof_blur_far_quality")
    return Environment.DOFBlurQuality.from( _icall_Long( mb, this.ptr))
  }

  open fun getDofBlurFarTransition(): Double {
    val mb = getMethodBind("Environment","get_dof_blur_far_transition")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDofBlurNearAmount(): Double {
    val mb = getMethodBind("Environment","get_dof_blur_near_amount")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDofBlurNearDistance(): Double {
    val mb = getMethodBind("Environment","get_dof_blur_near_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDofBlurNearQuality(): Environment.DOFBlurQuality {
    val mb = getMethodBind("Environment","get_dof_blur_near_quality")
    return Environment.DOFBlurQuality.from( _icall_Long( mb, this.ptr))
  }

  open fun getDofBlurNearTransition(): Double {
    val mb = getMethodBind("Environment","get_dof_blur_near_transition")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogColor(): Color {
    val mb = getMethodBind("Environment","get_fog_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getFogDepthBegin(): Double {
    val mb = getMethodBind("Environment","get_fog_depth_begin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogDepthCurve(): Double {
    val mb = getMethodBind("Environment","get_fog_depth_curve")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogDepthEnd(): Double {
    val mb = getMethodBind("Environment","get_fog_depth_end")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogHeightCurve(): Double {
    val mb = getMethodBind("Environment","get_fog_height_curve")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogHeightMax(): Double {
    val mb = getMethodBind("Environment","get_fog_height_max")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogHeightMin(): Double {
    val mb = getMethodBind("Environment","get_fog_height_min")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogSunAmount(): Double {
    val mb = getMethodBind("Environment","get_fog_sun_amount")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFogSunColor(): Color {
    val mb = getMethodBind("Environment","get_fog_sun_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getFogTransmitCurve(): Double {
    val mb = getMethodBind("Environment","get_fog_transmit_curve")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlowBlendMode(): Environment.GlowBlendMode {
    val mb = getMethodBind("Environment","get_glow_blend_mode")
    return Environment.GlowBlendMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getGlowBloom(): Double {
    val mb = getMethodBind("Environment","get_glow_bloom")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlowHdrBleedScale(): Double {
    val mb = getMethodBind("Environment","get_glow_hdr_bleed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlowHdrBleedThreshold(): Double {
    val mb = getMethodBind("Environment","get_glow_hdr_bleed_threshold")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlowHdrLuminanceCap(): Double {
    val mb = getMethodBind("Environment","get_glow_hdr_luminance_cap")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlowIntensity(): Double {
    val mb = getMethodBind("Environment","get_glow_intensity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGlowStrength(): Double {
    val mb = getMethodBind("Environment","get_glow_strength")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSky(): Sky {
    val mb = getMethodBind("Environment","get_sky")
    return _icall_Sky( mb, this.ptr)
  }

  open fun getSkyCustomFov(): Double {
    val mb = getMethodBind("Environment","get_sky_custom_fov")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSkyOrientation(): Basis {
    val mb = getMethodBind("Environment","get_sky_orientation")
    return _icall_Basis( mb, this.ptr)
  }

  open fun getSkyRotation(): Vector3 {
    val mb = getMethodBind("Environment","get_sky_rotation")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getSkyRotationDegrees(): Vector3 {
    val mb = getMethodBind("Environment","get_sky_rotation_degrees")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getSsaoAoChannelAffect(): Double {
    val mb = getMethodBind("Environment","get_ssao_ao_channel_affect")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoBias(): Double {
    val mb = getMethodBind("Environment","get_ssao_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoBlur(): Environment.SSAOBlur {
    val mb = getMethodBind("Environment","get_ssao_blur")
    return Environment.SSAOBlur.from( _icall_Long( mb, this.ptr))
  }

  open fun getSsaoColor(): Color {
    val mb = getMethodBind("Environment","get_ssao_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getSsaoDirectLightAffect(): Double {
    val mb = getMethodBind("Environment","get_ssao_direct_light_affect")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoEdgeSharpness(): Double {
    val mb = getMethodBind("Environment","get_ssao_edge_sharpness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoIntensity(): Double {
    val mb = getMethodBind("Environment","get_ssao_intensity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoIntensity2(): Double {
    val mb = getMethodBind("Environment","get_ssao_intensity2")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoQuality(): Environment.SSAOQuality {
    val mb = getMethodBind("Environment","get_ssao_quality")
    return Environment.SSAOQuality.from( _icall_Long( mb, this.ptr))
  }

  open fun getSsaoRadius(): Double {
    val mb = getMethodBind("Environment","get_ssao_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsaoRadius2(): Double {
    val mb = getMethodBind("Environment","get_ssao_radius2")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsrDepthTolerance(): Double {
    val mb = getMethodBind("Environment","get_ssr_depth_tolerance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsrFadeIn(): Double {
    val mb = getMethodBind("Environment","get_ssr_fade_in")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsrFadeOut(): Double {
    val mb = getMethodBind("Environment","get_ssr_fade_out")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSsrMaxSteps(): Long {
    val mb = getMethodBind("Environment","get_ssr_max_steps")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTonemapAutoExposure(): Boolean {
    val mb = getMethodBind("Environment","get_tonemap_auto_exposure")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getTonemapAutoExposureGrey(): Double {
    val mb = getMethodBind("Environment","get_tonemap_auto_exposure_grey")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTonemapAutoExposureMax(): Double {
    val mb = getMethodBind("Environment","get_tonemap_auto_exposure_max")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTonemapAutoExposureMin(): Double {
    val mb = getMethodBind("Environment","get_tonemap_auto_exposure_min")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTonemapAutoExposureSpeed(): Double {
    val mb = getMethodBind("Environment","get_tonemap_auto_exposure_speed")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTonemapExposure(): Double {
    val mb = getMethodBind("Environment","get_tonemap_exposure")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTonemapWhite(): Double {
    val mb = getMethodBind("Environment","get_tonemap_white")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTonemapper(): Environment.ToneMapper {
    val mb = getMethodBind("Environment","get_tonemapper")
    return Environment.ToneMapper.from( _icall_Long( mb, this.ptr))
  }

  open fun isAdjustmentEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_adjustment_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDofBlurFarEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_dof_blur_far_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDofBlurNearEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_dof_blur_near_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFogDepthEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_fog_depth_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFogEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_fog_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFogHeightEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_fog_height_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFogTransmitEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_fog_transmit_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isGlowBicubicUpscaleEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_glow_bicubic_upscale_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isGlowEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_glow_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isGlowLevelEnabled(idx: Long): Boolean {
    val mb = getMethodBind("Environment","is_glow_level_enabled")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isSsaoEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_ssao_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSsrEnabled(): Boolean {
    val mb = getMethodBind("Environment","is_ssr_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSsrRough(): Boolean {
    val mb = getMethodBind("Environment","is_ssr_rough")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAdjustmentBrightness(brightness: Double) {
    val mb = getMethodBind("Environment","set_adjustment_brightness")
    _icall_Unit_Double( mb, this.ptr, brightness)
  }

  open fun setAdjustmentColorCorrection(colorCorrection: Texture) {
    val mb = getMethodBind("Environment","set_adjustment_color_correction")
    _icall_Unit_Object( mb, this.ptr, colorCorrection)
  }

  open fun setAdjustmentContrast(contrast: Double) {
    val mb = getMethodBind("Environment","set_adjustment_contrast")
    _icall_Unit_Double( mb, this.ptr, contrast)
  }

  open fun setAdjustmentEnable(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_adjustment_enable")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setAdjustmentSaturation(saturation: Double) {
    val mb = getMethodBind("Environment","set_adjustment_saturation")
    _icall_Unit_Double( mb, this.ptr, saturation)
  }

  open fun setAmbientLightColor(color: Color) {
    val mb = getMethodBind("Environment","set_ambient_light_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setAmbientLightEnergy(energy: Double) {
    val mb = getMethodBind("Environment","set_ambient_light_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setAmbientLightSkyContribution(energy: Double) {
    val mb = getMethodBind("Environment","set_ambient_light_sky_contribution")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setBackground(mode: Long) {
    val mb = getMethodBind("Environment","set_background")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setBgColor(color: Color) {
    val mb = getMethodBind("Environment","set_bg_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setBgEnergy(energy: Double) {
    val mb = getMethodBind("Environment","set_bg_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setCameraFeedId(cameraFeedId: Long) {
    val mb = getMethodBind("Environment","set_camera_feed_id")
    _icall_Unit_Long( mb, this.ptr, cameraFeedId)
  }

  open fun setCanvasMaxLayer(layer: Long) {
    val mb = getMethodBind("Environment","set_canvas_max_layer")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setDofBlurFarAmount(intensity: Double) {
    val mb = getMethodBind("Environment","set_dof_blur_far_amount")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setDofBlurFarDistance(intensity: Double) {
    val mb = getMethodBind("Environment","set_dof_blur_far_distance")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setDofBlurFarEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_dof_blur_far_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setDofBlurFarQuality(intensity: Long) {
    val mb = getMethodBind("Environment","set_dof_blur_far_quality")
    _icall_Unit_Long( mb, this.ptr, intensity)
  }

  open fun setDofBlurFarTransition(intensity: Double) {
    val mb = getMethodBind("Environment","set_dof_blur_far_transition")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setDofBlurNearAmount(intensity: Double) {
    val mb = getMethodBind("Environment","set_dof_blur_near_amount")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setDofBlurNearDistance(intensity: Double) {
    val mb = getMethodBind("Environment","set_dof_blur_near_distance")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setDofBlurNearEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_dof_blur_near_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setDofBlurNearQuality(level: Long) {
    val mb = getMethodBind("Environment","set_dof_blur_near_quality")
    _icall_Unit_Long( mb, this.ptr, level)
  }

  open fun setDofBlurNearTransition(intensity: Double) {
    val mb = getMethodBind("Environment","set_dof_blur_near_transition")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setFogColor(color: Color) {
    val mb = getMethodBind("Environment","set_fog_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setFogDepthBegin(distance: Double) {
    val mb = getMethodBind("Environment","set_fog_depth_begin")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setFogDepthCurve(curve: Double) {
    val mb = getMethodBind("Environment","set_fog_depth_curve")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setFogDepthEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_fog_depth_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setFogDepthEnd(distance: Double) {
    val mb = getMethodBind("Environment","set_fog_depth_end")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setFogEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_fog_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setFogHeightCurve(curve: Double) {
    val mb = getMethodBind("Environment","set_fog_height_curve")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setFogHeightEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_fog_height_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setFogHeightMax(height: Double) {
    val mb = getMethodBind("Environment","set_fog_height_max")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setFogHeightMin(height: Double) {
    val mb = getMethodBind("Environment","set_fog_height_min")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setFogSunAmount(amount: Double) {
    val mb = getMethodBind("Environment","set_fog_sun_amount")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setFogSunColor(color: Color) {
    val mb = getMethodBind("Environment","set_fog_sun_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setFogTransmitCurve(curve: Double) {
    val mb = getMethodBind("Environment","set_fog_transmit_curve")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setFogTransmitEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_fog_transmit_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setGlowBicubicUpscale(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_glow_bicubic_upscale")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setGlowBlendMode(mode: Long) {
    val mb = getMethodBind("Environment","set_glow_blend_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setGlowBloom(amount: Double) {
    val mb = getMethodBind("Environment","set_glow_bloom")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setGlowEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_glow_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setGlowHdrBleedScale(scale: Double) {
    val mb = getMethodBind("Environment","set_glow_hdr_bleed_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setGlowHdrBleedThreshold(threshold: Double) {
    val mb = getMethodBind("Environment","set_glow_hdr_bleed_threshold")
    _icall_Unit_Double( mb, this.ptr, threshold)
  }

  open fun setGlowHdrLuminanceCap(amount: Double) {
    val mb = getMethodBind("Environment","set_glow_hdr_luminance_cap")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setGlowIntensity(intensity: Double) {
    val mb = getMethodBind("Environment","set_glow_intensity")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setGlowLevel(idx: Long, enabled: Boolean) {
    val mb = getMethodBind("Environment","set_glow_level")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, enabled)
  }

  open fun setGlowStrength(strength: Double) {
    val mb = getMethodBind("Environment","set_glow_strength")
    _icall_Unit_Double( mb, this.ptr, strength)
  }

  open fun setSky(sky: Sky) {
    val mb = getMethodBind("Environment","set_sky")
    _icall_Unit_Object( mb, this.ptr, sky)
  }

  open fun setSkyCustomFov(scale: Double) {
    val mb = getMethodBind("Environment","set_sky_custom_fov")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setSkyOrientation(orientation: Basis) {
    val mb = getMethodBind("Environment","set_sky_orientation")
    _icall_Unit_Basis( mb, this.ptr, orientation)
  }

  open fun setSkyRotation(eulerRadians: Vector3) {
    val mb = getMethodBind("Environment","set_sky_rotation")
    _icall_Unit_Vector3( mb, this.ptr, eulerRadians)
  }

  open fun setSkyRotationDegrees(eulerDegrees: Vector3) {
    val mb = getMethodBind("Environment","set_sky_rotation_degrees")
    _icall_Unit_Vector3( mb, this.ptr, eulerDegrees)
  }

  open fun setSsaoAoChannelAffect(amount: Double) {
    val mb = getMethodBind("Environment","set_ssao_ao_channel_affect")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setSsaoBias(bias: Double) {
    val mb = getMethodBind("Environment","set_ssao_bias")
    _icall_Unit_Double( mb, this.ptr, bias)
  }

  open fun setSsaoBlur(mode: Long) {
    val mb = getMethodBind("Environment","set_ssao_blur")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setSsaoColor(color: Color) {
    val mb = getMethodBind("Environment","set_ssao_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setSsaoDirectLightAffect(amount: Double) {
    val mb = getMethodBind("Environment","set_ssao_direct_light_affect")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setSsaoEdgeSharpness(edgeSharpness: Double) {
    val mb = getMethodBind("Environment","set_ssao_edge_sharpness")
    _icall_Unit_Double( mb, this.ptr, edgeSharpness)
  }

  open fun setSsaoEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_ssao_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setSsaoIntensity(intensity: Double) {
    val mb = getMethodBind("Environment","set_ssao_intensity")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setSsaoIntensity2(intensity: Double) {
    val mb = getMethodBind("Environment","set_ssao_intensity2")
    _icall_Unit_Double( mb, this.ptr, intensity)
  }

  open fun setSsaoQuality(quality: Long) {
    val mb = getMethodBind("Environment","set_ssao_quality")
    _icall_Unit_Long( mb, this.ptr, quality)
  }

  open fun setSsaoRadius(radius: Double) {
    val mb = getMethodBind("Environment","set_ssao_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setSsaoRadius2(radius: Double) {
    val mb = getMethodBind("Environment","set_ssao_radius2")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  open fun setSsrDepthTolerance(depthTolerance: Double) {
    val mb = getMethodBind("Environment","set_ssr_depth_tolerance")
    _icall_Unit_Double( mb, this.ptr, depthTolerance)
  }

  open fun setSsrEnabled(enabled: Boolean) {
    val mb = getMethodBind("Environment","set_ssr_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setSsrFadeIn(fadeIn: Double) {
    val mb = getMethodBind("Environment","set_ssr_fade_in")
    _icall_Unit_Double( mb, this.ptr, fadeIn)
  }

  open fun setSsrFadeOut(fadeOut: Double) {
    val mb = getMethodBind("Environment","set_ssr_fade_out")
    _icall_Unit_Double( mb, this.ptr, fadeOut)
  }

  open fun setSsrMaxSteps(maxSteps: Long) {
    val mb = getMethodBind("Environment","set_ssr_max_steps")
    _icall_Unit_Long( mb, this.ptr, maxSteps)
  }

  open fun setSsrRough(rough: Boolean) {
    val mb = getMethodBind("Environment","set_ssr_rough")
    _icall_Unit_Boolean( mb, this.ptr, rough)
  }

  open fun setTonemapAutoExposure(autoExposure: Boolean) {
    val mb = getMethodBind("Environment","set_tonemap_auto_exposure")
    _icall_Unit_Boolean( mb, this.ptr, autoExposure)
  }

  open fun setTonemapAutoExposureGrey(exposureGrey: Double) {
    val mb = getMethodBind("Environment","set_tonemap_auto_exposure_grey")
    _icall_Unit_Double( mb, this.ptr, exposureGrey)
  }

  open fun setTonemapAutoExposureMax(exposureMax: Double) {
    val mb = getMethodBind("Environment","set_tonemap_auto_exposure_max")
    _icall_Unit_Double( mb, this.ptr, exposureMax)
  }

  open fun setTonemapAutoExposureMin(exposureMin: Double) {
    val mb = getMethodBind("Environment","set_tonemap_auto_exposure_min")
    _icall_Unit_Double( mb, this.ptr, exposureMin)
  }

  open fun setTonemapAutoExposureSpeed(exposureSpeed: Double) {
    val mb = getMethodBind("Environment","set_tonemap_auto_exposure_speed")
    _icall_Unit_Double( mb, this.ptr, exposureSpeed)
  }

  open fun setTonemapExposure(exposure: Double) {
    val mb = getMethodBind("Environment","set_tonemap_exposure")
    _icall_Unit_Double( mb, this.ptr, exposure)
  }

  open fun setTonemapWhite(white: Double) {
    val mb = getMethodBind("Environment","set_tonemap_white")
    _icall_Unit_Double( mb, this.ptr, white)
  }

  open fun setTonemapper(mode: Long) {
    val mb = getMethodBind("Environment","set_tonemapper")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class SSAOBlur(
    id: Long
  ) {
    SSAO_BLUR_DISABLED(0),

    SSAO_BLUR_1x1(1),

    SSAO_BLUR_2x2(2),

    SSAO_BLUR_3x3(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ToneMapper(
    id: Long
  ) {
    TONE_MAPPER_LINEAR(0),

    TONE_MAPPER_REINHARDT(1),

    TONE_MAPPER_FILMIC(2),

    TONE_MAPPER_ACES(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GlowBlendMode(
    id: Long
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BGMode(
    id: Long
  ) {
    BG_CLEAR_COLOR(0),

    BG_COLOR(1),

    BG_SKY(2),

    BG_COLOR_SKY(3),

    BG_CANVAS(4),

    BG_KEEP(5),

    BG_CAMERA_FEED(6),

    BG_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SSAOQuality(
    id: Long
  ) {
    SSAO_QUALITY_LOW(0),

    SSAO_QUALITY_MEDIUM(1),

    SSAO_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DOFBlurQuality(
    id: Long
  ) {
    DOF_BLUR_QUALITY_LOW(0),

    DOF_BLUR_QUALITY_MEDIUM(1),

    DOF_BLUR_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BG_CAMERA_FEED: Long = 6

    final const val BG_CANVAS: Long = 4

    final const val BG_CLEAR_COLOR: Long = 0

    final const val BG_COLOR: Long = 1

    final const val BG_COLOR_SKY: Long = 3

    final const val BG_KEEP: Long = 5

    final const val BG_MAX: Long = 7

    final const val BG_SKY: Long = 2

    final const val DOF_BLUR_QUALITY_HIGH: Long = 2

    final const val DOF_BLUR_QUALITY_LOW: Long = 0

    final const val DOF_BLUR_QUALITY_MEDIUM: Long = 1

    final const val GLOW_BLEND_MODE_ADDITIVE: Long = 0

    final const val GLOW_BLEND_MODE_REPLACE: Long = 3

    final const val GLOW_BLEND_MODE_SCREEN: Long = 1

    final const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2

    final const val SSAO_BLUR_1x1: Long = 1

    final const val SSAO_BLUR_2x2: Long = 2

    final const val SSAO_BLUR_3x3: Long = 3

    final const val SSAO_BLUR_DISABLED: Long = 0

    final const val SSAO_QUALITY_HIGH: Long = 2

    final const val SSAO_QUALITY_LOW: Long = 0

    final const val SSAO_QUALITY_MEDIUM: Long = 1

    final const val TONE_MAPPER_ACES: Long = 3

    final const val TONE_MAPPER_FILMIC: Long = 2

    final const val TONE_MAPPER_LINEAR: Long = 0

    final const val TONE_MAPPER_REINHARDT: Long = 1
  }
}
