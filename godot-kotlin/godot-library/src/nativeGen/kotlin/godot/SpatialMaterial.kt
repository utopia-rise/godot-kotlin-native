// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.SpatialMaterial
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class SpatialMaterial internal constructor(
  _ignore: Any?
) : Material(_ignore) {
  open var albedoColor: Color
    get() {
      val mb = getMethodBind("SpatialMaterial","get_albedo")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_albedo")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var albedoTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 0, value)
    }

  open var anisotropy: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_anisotropy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_anisotropy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var anisotropyEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var anisotropyFlowmap: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 7, value)
    }

  open var aoEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 6, value)
    }

  open var aoLightAffect: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_ao_light_affect")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_ao_light_affect")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var aoOnUv2: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 11, value)
    }

  open var aoTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 8, value)
    }

  open var aoTextureChannel: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_ao_texture_channel")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_ao_texture_channel")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var clearcoat: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_clearcoat")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_clearcoat")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var clearcoatEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var clearcoatGloss: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_clearcoat_gloss")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_clearcoat_gloss")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var clearcoatTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 6, value)
    }

  open var depthDeepParallax: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","is_depth_deep_parallax_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var depthEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 7, value)
    }

  open var depthFlipBinormal: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_flip_binormal")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_flip_binormal")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var depthFlipTangent: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_flip_tangent")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_flip_tangent")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var depthMaxLayers: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_max_layers")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_max_layers")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var depthMinLayers: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_min_layers")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_min_layers")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var depthScale: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_depth_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var depthTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 9, value)
    }

  open var detailAlbedo: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 14, value)
    }

  open var detailBlendMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_detail_blend_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_detail_blend_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var detailEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 11, value)
    }

  open var detailMask: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 13, value)
    }

  open var detailNormal: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 15, value)
    }

  open var detailUvLayer: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_detail_uv")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_detail_uv")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var distanceFadeMaxDistance: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_distance_fade_max_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_distance_fade_max_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var distanceFadeMinDistance: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_distance_fade_min_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_distance_fade_min_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var distanceFadeMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_distance_fade")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_distance_fade")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emission: Color
    get() {
      val mb = getMethodBind("SpatialMaterial","get_emission")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_emission")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var emissionEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var emissionEnergy: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_emission_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_emission_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var emissionOnUv2: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 12, value)
    }

  open var emissionOperator: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_emission_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_emission_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emissionTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 3, value)
    }

  open var flagsAlbedoTexForceSrgb: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 14, value)
    }

  open var flagsDisableAmbientLight: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 17, value)
    }

  open var flagsDoNotReceiveShadows: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 15, value)
    }

  open var flagsEnsureCorrectNormals: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 16, value)
    }

  open var flagsFixedSize: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 6, value)
    }

  open var flagsNoDepthTest: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var flagsTransparent: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var flagsUnshaded: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var flagsUsePointSize: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var flagsUseShadowToOpacity: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 18, value)
    }

  open var flagsVertexLighting: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var flagsWorldTriplanar: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 10, value)
    }

  open var metallic: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_metallic")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_metallic")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var metallicSpecular: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_specular")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_specular")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var metallicTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 1, value)
    }

  open var metallicTextureChannel: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_metallic_texture_channel")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_metallic_texture_channel")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var normalEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var normalScale: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_normal_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_normal_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var normalTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 4, value)
    }

  open var paramsAlphaScissorThreshold: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_alpha_scissor_threshold")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_alpha_scissor_threshold")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var paramsBillboardKeepScale: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 7, value)
    }

  open var paramsBillboardMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_billboard_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_billboard_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var paramsBlendMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_blend_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_blend_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var paramsCullMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_cull_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_cull_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var paramsDepthDrawMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_depth_draw_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_depth_draw_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var paramsDiffuseMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_diffuse_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_diffuse_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var paramsGrow: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","is_grow_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_grow_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var paramsGrowAmount: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_grow")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_grow")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var paramsLineWidth: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_line_width")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_line_width")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var paramsPointSize: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_point_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_point_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var paramsSpecularMode: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_specular_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_specular_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var paramsUseAlphaScissor: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 13, value)
    }

  open var particlesAnimHFrames: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_particles_anim_h_frames")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_particles_anim_h_frames")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var particlesAnimLoop: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_particles_anim_loop")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_particles_anim_loop")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var particlesAnimVFrames: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_particles_anim_v_frames")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_particles_anim_v_frames")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var proximityFadeDistance: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_proximity_fade_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_proximity_fade_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var proximityFadeEnable: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","is_proximity_fade_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_proximity_fade")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var refractionEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 10, value)
    }

  open var refractionScale: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_refraction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_refraction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var refractionTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 12, value)
    }

  open var refractionTextureChannel: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_refraction_texture_channel")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_refraction_texture_channel")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rim: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_rim")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_rim")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rimEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  open var rimTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 5, value)
    }

  open var rimTint: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_rim_tint")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_rim_tint")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var roughness: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_roughness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_roughness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var roughnessTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 2, value)
    }

  open var roughnessTextureChannel: Long
    get() {
      val mb = getMethodBind("SpatialMaterial","get_roughness_texture_channel")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_roughness_texture_channel")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var subsurfScatterEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 8, value)
    }

  open var subsurfScatterStrength: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_subsurface_scattering_strength")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_subsurface_scattering_strength")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var subsurfScatterTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 10, value)
    }

  open var transmission: Color
    get() {
      val mb = getMethodBind("SpatialMaterial","get_transmission")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_transmission")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var transmissionEnabled: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_feature")
      return _icall_Boolean_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_feature")
      _icall_Unit_Long_Boolean(mb, this.ptr, 9, value)
    }

  open var transmissionTexture: Texture
    get() {
      val mb = getMethodBind("SpatialMaterial","get_texture")
      return _icall_Texture_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 11, value)
    }

  open var uv1Offset: Vector3
    get() {
      val mb = getMethodBind("SpatialMaterial","get_uv1_offset")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_uv1_offset")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var uv1Scale: Vector3
    get() {
      val mb = getMethodBind("SpatialMaterial","get_uv1_scale")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_uv1_scale")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var uv1Triplanar: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 8, value)
    }

  open var uv1TriplanarSharpness: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_uv1_triplanar_blend_sharpness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_uv1_triplanar_blend_sharpness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var uv2Offset: Vector3
    get() {
      val mb = getMethodBind("SpatialMaterial","get_uv2_offset")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_uv2_offset")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var uv2Scale: Vector3
    get() {
      val mb = getMethodBind("SpatialMaterial","get_uv2_scale")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_uv2_scale")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var uv2Triplanar: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 9, value)
    }

  open var uv2TriplanarSharpness: Double
    get() {
      val mb = getMethodBind("SpatialMaterial","get_uv2_triplanar_blend_sharpness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_uv2_triplanar_blend_sharpness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var vertexColorIsSrgb: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var vertexColorUseAsAlbedo: Boolean
    get() {
      val mb = getMethodBind("SpatialMaterial","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("SpatialMaterial","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SpatialMaterial", "SpatialMaterial")
        }

  }

  open fun albedoColor(schedule: Color.() -> Unit): Color = albedoColor.apply{
      schedule(this)
      albedoColor = this
  }


  open fun emission(schedule: Color.() -> Unit): Color = emission.apply{
      schedule(this)
      emission = this
  }


  open fun transmission(schedule: Color.() -> Unit): Color = transmission.apply{
      schedule(this)
      transmission = this
  }


  open fun uv1Offset(schedule: Vector3.() -> Unit): Vector3 = uv1Offset.apply{
      schedule(this)
      uv1Offset = this
  }


  open fun uv1Scale(schedule: Vector3.() -> Unit): Vector3 = uv1Scale.apply{
      schedule(this)
      uv1Scale = this
  }


  open fun uv2Offset(schedule: Vector3.() -> Unit): Vector3 = uv2Offset.apply{
      schedule(this)
      uv2Offset = this
  }


  open fun uv2Scale(schedule: Vector3.() -> Unit): Vector3 = uv2Scale.apply{
      schedule(this)
      uv2Scale = this
  }


  open fun getAlbedo(): Color {
    val mb = getMethodBind("SpatialMaterial","get_albedo")
    return _icall_Color( mb, this.ptr)
  }

  open fun getAlphaScissorThreshold(): Double {
    val mb = getMethodBind("SpatialMaterial","get_alpha_scissor_threshold")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAnisotropy(): Double {
    val mb = getMethodBind("SpatialMaterial","get_anisotropy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAoLightAffect(): Double {
    val mb = getMethodBind("SpatialMaterial","get_ao_light_affect")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAoTextureChannel(): SpatialMaterial.TextureChannel {
    val mb = getMethodBind("SpatialMaterial","get_ao_texture_channel")
    return SpatialMaterial.TextureChannel.from( _icall_Long( mb, this.ptr))
  }

  open fun getBillboardMode(): SpatialMaterial.BillboardMode {
    val mb = getMethodBind("SpatialMaterial","get_billboard_mode")
    return SpatialMaterial.BillboardMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getBlendMode(): SpatialMaterial.BlendMode {
    val mb = getMethodBind("SpatialMaterial","get_blend_mode")
    return SpatialMaterial.BlendMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getClearcoat(): Double {
    val mb = getMethodBind("SpatialMaterial","get_clearcoat")
    return _icall_Double( mb, this.ptr)
  }

  open fun getClearcoatGloss(): Double {
    val mb = getMethodBind("SpatialMaterial","get_clearcoat_gloss")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCullMode(): SpatialMaterial.CullMode {
    val mb = getMethodBind("SpatialMaterial","get_cull_mode")
    return SpatialMaterial.CullMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDepthDeepParallaxFlipBinormal(): Boolean {
    val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_flip_binormal")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getDepthDeepParallaxFlipTangent(): Boolean {
    val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_flip_tangent")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getDepthDeepParallaxMaxLayers(): Long {
    val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_max_layers")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDepthDeepParallaxMinLayers(): Long {
    val mb = getMethodBind("SpatialMaterial","get_depth_deep_parallax_min_layers")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDepthDrawMode(): SpatialMaterial.DepthDrawMode {
    val mb = getMethodBind("SpatialMaterial","get_depth_draw_mode")
    return SpatialMaterial.DepthDrawMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDepthScale(): Double {
    val mb = getMethodBind("SpatialMaterial","get_depth_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDetailBlendMode(): SpatialMaterial.BlendMode {
    val mb = getMethodBind("SpatialMaterial","get_detail_blend_mode")
    return SpatialMaterial.BlendMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDetailUv(): SpatialMaterial.DetailUV {
    val mb = getMethodBind("SpatialMaterial","get_detail_uv")
    return SpatialMaterial.DetailUV.from( _icall_Long( mb, this.ptr))
  }

  open fun getDiffuseMode(): SpatialMaterial.DiffuseMode {
    val mb = getMethodBind("SpatialMaterial","get_diffuse_mode")
    return SpatialMaterial.DiffuseMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDistanceFade(): SpatialMaterial.DistanceFadeMode {
    val mb = getMethodBind("SpatialMaterial","get_distance_fade")
    return SpatialMaterial.DistanceFadeMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDistanceFadeMaxDistance(): Double {
    val mb = getMethodBind("SpatialMaterial","get_distance_fade_max_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDistanceFadeMinDistance(): Double {
    val mb = getMethodBind("SpatialMaterial","get_distance_fade_min_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEmission(): Color {
    val mb = getMethodBind("SpatialMaterial","get_emission")
    return _icall_Color( mb, this.ptr)
  }

  open fun getEmissionEnergy(): Double {
    val mb = getMethodBind("SpatialMaterial","get_emission_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEmissionOperator(): SpatialMaterial.EmissionOperator {
    val mb = getMethodBind("SpatialMaterial","get_emission_operator")
    return SpatialMaterial.EmissionOperator.from( _icall_Long( mb, this.ptr))
  }

  open fun getFeature(feature: Long): Boolean {
    val mb = getMethodBind("SpatialMaterial","get_feature")
    return _icall_Boolean_Long( mb, this.ptr, feature)
  }

  open fun getFlag(flag: Long): Boolean {
    val mb = getMethodBind("SpatialMaterial","get_flag")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getGrow(): Double {
    val mb = getMethodBind("SpatialMaterial","get_grow")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLineWidth(): Double {
    val mb = getMethodBind("SpatialMaterial","get_line_width")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMetallic(): Double {
    val mb = getMethodBind("SpatialMaterial","get_metallic")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMetallicTextureChannel(): SpatialMaterial.TextureChannel {
    val mb = getMethodBind("SpatialMaterial","get_metallic_texture_channel")
    return SpatialMaterial.TextureChannel.from( _icall_Long( mb, this.ptr))
  }

  open fun getNormalScale(): Double {
    val mb = getMethodBind("SpatialMaterial","get_normal_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getParticlesAnimHFrames(): Long {
    val mb = getMethodBind("SpatialMaterial","get_particles_anim_h_frames")
    return _icall_Long( mb, this.ptr)
  }

  open fun getParticlesAnimLoop(): Boolean {
    val mb = getMethodBind("SpatialMaterial","get_particles_anim_loop")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getParticlesAnimVFrames(): Long {
    val mb = getMethodBind("SpatialMaterial","get_particles_anim_v_frames")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointSize(): Double {
    val mb = getMethodBind("SpatialMaterial","get_point_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getProximityFadeDistance(): Double {
    val mb = getMethodBind("SpatialMaterial","get_proximity_fade_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRefraction(): Double {
    val mb = getMethodBind("SpatialMaterial","get_refraction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRefractionTextureChannel(): SpatialMaterial.TextureChannel {
    val mb = getMethodBind("SpatialMaterial","get_refraction_texture_channel")
    return SpatialMaterial.TextureChannel.from( _icall_Long( mb, this.ptr))
  }

  open fun getRim(): Double {
    val mb = getMethodBind("SpatialMaterial","get_rim")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRimTint(): Double {
    val mb = getMethodBind("SpatialMaterial","get_rim_tint")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRoughness(): Double {
    val mb = getMethodBind("SpatialMaterial","get_roughness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRoughnessTextureChannel(): SpatialMaterial.TextureChannel {
    val mb = getMethodBind("SpatialMaterial","get_roughness_texture_channel")
    return SpatialMaterial.TextureChannel.from( _icall_Long( mb, this.ptr))
  }

  open fun getSpecular(): Double {
    val mb = getMethodBind("SpatialMaterial","get_specular")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpecularMode(): SpatialMaterial.SpecularMode {
    val mb = getMethodBind("SpatialMaterial","get_specular_mode")
    return SpatialMaterial.SpecularMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getSubsurfaceScatteringStrength(): Double {
    val mb = getMethodBind("SpatialMaterial","get_subsurface_scattering_strength")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTexture(param: Long): Texture {
    val mb = getMethodBind("SpatialMaterial","get_texture")
    return _icall_Texture_Long( mb, this.ptr, param)
  }

  open fun getTransmission(): Color {
    val mb = getMethodBind("SpatialMaterial","get_transmission")
    return _icall_Color( mb, this.ptr)
  }

  open fun getUv1Offset(): Vector3 {
    val mb = getMethodBind("SpatialMaterial","get_uv1_offset")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getUv1Scale(): Vector3 {
    val mb = getMethodBind("SpatialMaterial","get_uv1_scale")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getUv1TriplanarBlendSharpness(): Double {
    val mb = getMethodBind("SpatialMaterial","get_uv1_triplanar_blend_sharpness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getUv2Offset(): Vector3 {
    val mb = getMethodBind("SpatialMaterial","get_uv2_offset")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getUv2Scale(): Vector3 {
    val mb = getMethodBind("SpatialMaterial","get_uv2_scale")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getUv2TriplanarBlendSharpness(): Double {
    val mb = getMethodBind("SpatialMaterial","get_uv2_triplanar_blend_sharpness")
    return _icall_Double( mb, this.ptr)
  }

  open fun isDepthDeepParallaxEnabled(): Boolean {
    val mb = getMethodBind("SpatialMaterial","is_depth_deep_parallax_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isGrowEnabled(): Boolean {
    val mb = getMethodBind("SpatialMaterial","is_grow_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isProximityFadeEnabled(): Boolean {
    val mb = getMethodBind("SpatialMaterial","is_proximity_fade_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAlbedo(albedo: Color) {
    val mb = getMethodBind("SpatialMaterial","set_albedo")
    _icall_Unit_Color( mb, this.ptr, albedo)
  }

  open fun setAlphaScissorThreshold(threshold: Double) {
    val mb = getMethodBind("SpatialMaterial","set_alpha_scissor_threshold")
    _icall_Unit_Double( mb, this.ptr, threshold)
  }

  open fun setAnisotropy(anisotropy: Double) {
    val mb = getMethodBind("SpatialMaterial","set_anisotropy")
    _icall_Unit_Double( mb, this.ptr, anisotropy)
  }

  open fun setAoLightAffect(amount: Double) {
    val mb = getMethodBind("SpatialMaterial","set_ao_light_affect")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setAoTextureChannel(channel: Long) {
    val mb = getMethodBind("SpatialMaterial","set_ao_texture_channel")
    _icall_Unit_Long( mb, this.ptr, channel)
  }

  open fun setBillboardMode(mode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_billboard_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setBlendMode(blendMode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_blend_mode")
    _icall_Unit_Long( mb, this.ptr, blendMode)
  }

  open fun setClearcoat(clearcoat: Double) {
    val mb = getMethodBind("SpatialMaterial","set_clearcoat")
    _icall_Unit_Double( mb, this.ptr, clearcoat)
  }

  open fun setClearcoatGloss(clearcoatGloss: Double) {
    val mb = getMethodBind("SpatialMaterial","set_clearcoat_gloss")
    _icall_Unit_Double( mb, this.ptr, clearcoatGloss)
  }

  open fun setCullMode(cullMode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_cull_mode")
    _icall_Unit_Long( mb, this.ptr, cullMode)
  }

  open fun setDepthDeepParallax(enable: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDepthDeepParallaxFlipBinormal(flip: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_flip_binormal")
    _icall_Unit_Boolean( mb, this.ptr, flip)
  }

  open fun setDepthDeepParallaxFlipTangent(flip: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_flip_tangent")
    _icall_Unit_Boolean( mb, this.ptr, flip)
  }

  open fun setDepthDeepParallaxMaxLayers(layer: Long) {
    val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_max_layers")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setDepthDeepParallaxMinLayers(layer: Long) {
    val mb = getMethodBind("SpatialMaterial","set_depth_deep_parallax_min_layers")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setDepthDrawMode(depthDrawMode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_depth_draw_mode")
    _icall_Unit_Long( mb, this.ptr, depthDrawMode)
  }

  open fun setDepthScale(depthScale: Double) {
    val mb = getMethodBind("SpatialMaterial","set_depth_scale")
    _icall_Unit_Double( mb, this.ptr, depthScale)
  }

  open fun setDetailBlendMode(detailBlendMode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_detail_blend_mode")
    _icall_Unit_Long( mb, this.ptr, detailBlendMode)
  }

  open fun setDetailUv(detailUv: Long) {
    val mb = getMethodBind("SpatialMaterial","set_detail_uv")
    _icall_Unit_Long( mb, this.ptr, detailUv)
  }

  open fun setDiffuseMode(diffuseMode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_diffuse_mode")
    _icall_Unit_Long( mb, this.ptr, diffuseMode)
  }

  open fun setDistanceFade(mode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_distance_fade")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setDistanceFadeMaxDistance(distance: Double) {
    val mb = getMethodBind("SpatialMaterial","set_distance_fade_max_distance")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setDistanceFadeMinDistance(distance: Double) {
    val mb = getMethodBind("SpatialMaterial","set_distance_fade_min_distance")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setEmission(emission: Color) {
    val mb = getMethodBind("SpatialMaterial","set_emission")
    _icall_Unit_Color( mb, this.ptr, emission)
  }

  open fun setEmissionEnergy(emissionEnergy: Double) {
    val mb = getMethodBind("SpatialMaterial","set_emission_energy")
    _icall_Unit_Double( mb, this.ptr, emissionEnergy)
  }

  open fun setEmissionOperator(_operator: Long) {
    val mb = getMethodBind("SpatialMaterial","set_emission_operator")
    _icall_Unit_Long( mb, this.ptr, _operator)
  }

  open fun setFeature(feature: Long, enable: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_feature")
    _icall_Unit_Long_Boolean( mb, this.ptr, feature, enable)
  }

  open fun setFlag(flag: Long, enable: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_flag")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, enable)
  }

  open fun setGrow(amount: Double) {
    val mb = getMethodBind("SpatialMaterial","set_grow")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setGrowEnabled(enable: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_grow_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setLineWidth(lineWidth: Double) {
    val mb = getMethodBind("SpatialMaterial","set_line_width")
    _icall_Unit_Double( mb, this.ptr, lineWidth)
  }

  open fun setMetallic(metallic: Double) {
    val mb = getMethodBind("SpatialMaterial","set_metallic")
    _icall_Unit_Double( mb, this.ptr, metallic)
  }

  open fun setMetallicTextureChannel(channel: Long) {
    val mb = getMethodBind("SpatialMaterial","set_metallic_texture_channel")
    _icall_Unit_Long( mb, this.ptr, channel)
  }

  open fun setNormalScale(normalScale: Double) {
    val mb = getMethodBind("SpatialMaterial","set_normal_scale")
    _icall_Unit_Double( mb, this.ptr, normalScale)
  }

  open fun setParticlesAnimHFrames(frames: Long) {
    val mb = getMethodBind("SpatialMaterial","set_particles_anim_h_frames")
    _icall_Unit_Long( mb, this.ptr, frames)
  }

  open fun setParticlesAnimLoop(loop: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_particles_anim_loop")
    _icall_Unit_Boolean( mb, this.ptr, loop)
  }

  open fun setParticlesAnimVFrames(frames: Long) {
    val mb = getMethodBind("SpatialMaterial","set_particles_anim_v_frames")
    _icall_Unit_Long( mb, this.ptr, frames)
  }

  open fun setPointSize(pointSize: Double) {
    val mb = getMethodBind("SpatialMaterial","set_point_size")
    _icall_Unit_Double( mb, this.ptr, pointSize)
  }

  open fun setProximityFade(enabled: Boolean) {
    val mb = getMethodBind("SpatialMaterial","set_proximity_fade")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setProximityFadeDistance(distance: Double) {
    val mb = getMethodBind("SpatialMaterial","set_proximity_fade_distance")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setRefraction(refraction: Double) {
    val mb = getMethodBind("SpatialMaterial","set_refraction")
    _icall_Unit_Double( mb, this.ptr, refraction)
  }

  open fun setRefractionTextureChannel(channel: Long) {
    val mb = getMethodBind("SpatialMaterial","set_refraction_texture_channel")
    _icall_Unit_Long( mb, this.ptr, channel)
  }

  open fun setRim(rim: Double) {
    val mb = getMethodBind("SpatialMaterial","set_rim")
    _icall_Unit_Double( mb, this.ptr, rim)
  }

  open fun setRimTint(rimTint: Double) {
    val mb = getMethodBind("SpatialMaterial","set_rim_tint")
    _icall_Unit_Double( mb, this.ptr, rimTint)
  }

  open fun setRoughness(roughness: Double) {
    val mb = getMethodBind("SpatialMaterial","set_roughness")
    _icall_Unit_Double( mb, this.ptr, roughness)
  }

  open fun setRoughnessTextureChannel(channel: Long) {
    val mb = getMethodBind("SpatialMaterial","set_roughness_texture_channel")
    _icall_Unit_Long( mb, this.ptr, channel)
  }

  open fun setSpecular(specular: Double) {
    val mb = getMethodBind("SpatialMaterial","set_specular")
    _icall_Unit_Double( mb, this.ptr, specular)
  }

  open fun setSpecularMode(specularMode: Long) {
    val mb = getMethodBind("SpatialMaterial","set_specular_mode")
    _icall_Unit_Long( mb, this.ptr, specularMode)
  }

  open fun setSubsurfaceScatteringStrength(strength: Double) {
    val mb = getMethodBind("SpatialMaterial","set_subsurface_scattering_strength")
    _icall_Unit_Double( mb, this.ptr, strength)
  }

  open fun setTexture(param: Long, texture: Texture) {
    val mb = getMethodBind("SpatialMaterial","set_texture")
    _icall_Unit_Long_Object( mb, this.ptr, param, texture)
  }

  open fun setTransmission(transmission: Color) {
    val mb = getMethodBind("SpatialMaterial","set_transmission")
    _icall_Unit_Color( mb, this.ptr, transmission)
  }

  open fun setUv1Offset(offset: Vector3) {
    val mb = getMethodBind("SpatialMaterial","set_uv1_offset")
    _icall_Unit_Vector3( mb, this.ptr, offset)
  }

  open fun setUv1Scale(scale: Vector3) {
    val mb = getMethodBind("SpatialMaterial","set_uv1_scale")
    _icall_Unit_Vector3( mb, this.ptr, scale)
  }

  open fun setUv1TriplanarBlendSharpness(sharpness: Double) {
    val mb = getMethodBind("SpatialMaterial","set_uv1_triplanar_blend_sharpness")
    _icall_Unit_Double( mb, this.ptr, sharpness)
  }

  open fun setUv2Offset(offset: Vector3) {
    val mb = getMethodBind("SpatialMaterial","set_uv2_offset")
    _icall_Unit_Vector3( mb, this.ptr, offset)
  }

  open fun setUv2Scale(scale: Vector3) {
    val mb = getMethodBind("SpatialMaterial","set_uv2_scale")
    _icall_Unit_Vector3( mb, this.ptr, scale)
  }

  open fun setUv2TriplanarBlendSharpness(sharpness: Double) {
    val mb = getMethodBind("SpatialMaterial","set_uv2_triplanar_blend_sharpness")
    _icall_Unit_Double( mb, this.ptr, sharpness)
  }

  enum class EmissionOperator(
    id: Long
  ) {
    EMISSION_OP_ADD(0),

    EMISSION_OP_MULTIPLY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DiffuseMode(
    id: Long
  ) {
    DIFFUSE_BURLEY(0),

    DIFFUSE_LAMBERT(1),

    DIFFUSE_LAMBERT_WRAP(2),

    DIFFUSE_OREN_NAYAR(3),

    DIFFUSE_TOON(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SpecularMode(
    id: Long
  ) {
    SPECULAR_SCHLICK_GGX(0),

    SPECULAR_BLINN(1),

    SPECULAR_PHONG(2),

    SPECULAR_TOON(3),

    SPECULAR_DISABLED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Feature(
    id: Long
  ) {
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

    FEATURE_MAX(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_UNSHADED(0),

    FLAG_USE_VERTEX_LIGHTING(1),

    FLAG_DISABLE_DEPTH_TEST(2),

    FLAG_ALBEDO_FROM_VERTEX_COLOR(3),

    FLAG_SRGB_VERTEX_COLOR(4),

    FLAG_USE_POINT_SIZE(5),

    FLAG_FIXED_SIZE(6),

    FLAG_BILLBOARD_KEEP_SCALE(7),

    FLAG_UV1_USE_TRIPLANAR(8),

    FLAG_UV2_USE_TRIPLANAR(9),

    FLAG_TRIPLANAR_USE_WORLD(10),

    FLAG_AO_ON_UV2(11),

    FLAG_EMISSION_ON_UV2(12),

    FLAG_USE_ALPHA_SCISSOR(13),

    FLAG_ALBEDO_TEXTURE_FORCE_SRGB(14),

    FLAG_DONT_RECEIVE_SHADOWS(15),

    FLAG_ENSURE_CORRECT_NORMALS(16),

    FLAG_DISABLE_AMBIENT_LIGHT(17),

    FLAG_USE_SHADOW_TO_OPACITY(18),

    FLAG_MAX(19);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CullMode(
    id: Long
  ) {
    CULL_BACK(0),

    CULL_FRONT(1),

    CULL_DISABLED(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DetailUV(
    id: Long
  ) {
    DETAIL_UV_1(0),

    DETAIL_UV_2(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DistanceFadeMode(
    id: Long
  ) {
    DISTANCE_FADE_DISABLED(0),

    DISTANCE_FADE_PIXEL_ALPHA(1),

    DISTANCE_FADE_PIXEL_DITHER(2),

    DISTANCE_FADE_OBJECT_DITHER(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BillboardMode(
    id: Long
  ) {
    BILLBOARD_DISABLED(0),

    BILLBOARD_ENABLED(1),

    BILLBOARD_FIXED_Y(2),

    BILLBOARD_PARTICLES(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DepthDrawMode(
    id: Long
  ) {
    DEPTH_DRAW_OPAQUE_ONLY(0),

    DEPTH_DRAW_ALWAYS(1),

    DEPTH_DRAW_DISABLED(2),

    DEPTH_DRAW_ALPHA_OPAQUE_PREPASS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureChannel(
    id: Long
  ) {
    TEXTURE_CHANNEL_RED(0),

    TEXTURE_CHANNEL_GREEN(1),

    TEXTURE_CHANNEL_BLUE(2),

    TEXTURE_CHANNEL_ALPHA(3),

    TEXTURE_CHANNEL_GRAYSCALE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BlendMode(
    id: Long
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureParam(
    id: Long
  ) {
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

    TEXTURE_MAX(16);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BILLBOARD_DISABLED: Long = 0

    final const val BILLBOARD_ENABLED: Long = 1

    final const val BILLBOARD_FIXED_Y: Long = 2

    final const val BILLBOARD_PARTICLES: Long = 3

    final const val BLEND_MODE_ADD: Long = 1

    final const val BLEND_MODE_MIX: Long = 0

    final const val BLEND_MODE_MUL: Long = 3

    final const val BLEND_MODE_SUB: Long = 2

    final const val CULL_BACK: Long = 0

    final const val CULL_DISABLED: Long = 2

    final const val CULL_FRONT: Long = 1

    final const val DEPTH_DRAW_ALPHA_OPAQUE_PREPASS: Long = 3

    final const val DEPTH_DRAW_ALWAYS: Long = 1

    final const val DEPTH_DRAW_DISABLED: Long = 2

    final const val DEPTH_DRAW_OPAQUE_ONLY: Long = 0

    final const val DETAIL_UV_1: Long = 0

    final const val DETAIL_UV_2: Long = 1

    final const val DIFFUSE_BURLEY: Long = 0

    final const val DIFFUSE_LAMBERT: Long = 1

    final const val DIFFUSE_LAMBERT_WRAP: Long = 2

    final const val DIFFUSE_OREN_NAYAR: Long = 3

    final const val DIFFUSE_TOON: Long = 4

    final const val DISTANCE_FADE_DISABLED: Long = 0

    final const val DISTANCE_FADE_OBJECT_DITHER: Long = 3

    final const val DISTANCE_FADE_PIXEL_ALPHA: Long = 1

    final const val DISTANCE_FADE_PIXEL_DITHER: Long = 2

    final const val EMISSION_OP_ADD: Long = 0

    final const val EMISSION_OP_MULTIPLY: Long = 1

    final const val FEATURE_AMBIENT_OCCLUSION: Long = 6

    final const val FEATURE_ANISOTROPY: Long = 5

    final const val FEATURE_CLEARCOAT: Long = 4

    final const val FEATURE_DEPTH_MAPPING: Long = 7

    final const val FEATURE_DETAIL: Long = 11

    final const val FEATURE_EMISSION: Long = 1

    final const val FEATURE_MAX: Long = 12

    final const val FEATURE_NORMAL_MAPPING: Long = 2

    final const val FEATURE_REFRACTION: Long = 10

    final const val FEATURE_RIM: Long = 3

    final const val FEATURE_SUBSURACE_SCATTERING: Long = 8

    final const val FEATURE_TRANSMISSION: Long = 9

    final const val FEATURE_TRANSPARENT: Long = 0

    final const val FLAG_ALBEDO_FROM_VERTEX_COLOR: Long = 3

    final const val FLAG_ALBEDO_TEXTURE_FORCE_SRGB: Long = 14

    final const val FLAG_AO_ON_UV2: Long = 11

    final const val FLAG_BILLBOARD_KEEP_SCALE: Long = 7

    final const val FLAG_DISABLE_AMBIENT_LIGHT: Long = 17

    final const val FLAG_DISABLE_DEPTH_TEST: Long = 2

    final const val FLAG_DONT_RECEIVE_SHADOWS: Long = 15

    final const val FLAG_EMISSION_ON_UV2: Long = 12

    final const val FLAG_ENSURE_CORRECT_NORMALS: Long = 16

    final const val FLAG_FIXED_SIZE: Long = 6

    final const val FLAG_MAX: Long = 19

    final const val FLAG_SRGB_VERTEX_COLOR: Long = 4

    final const val FLAG_TRIPLANAR_USE_WORLD: Long = 10

    final const val FLAG_UNSHADED: Long = 0

    final const val FLAG_USE_ALPHA_SCISSOR: Long = 13

    final const val FLAG_USE_POINT_SIZE: Long = 5

    final const val FLAG_USE_SHADOW_TO_OPACITY: Long = 18

    final const val FLAG_USE_VERTEX_LIGHTING: Long = 1

    final const val FLAG_UV1_USE_TRIPLANAR: Long = 8

    final const val FLAG_UV2_USE_TRIPLANAR: Long = 9

    final const val SPECULAR_BLINN: Long = 1

    final const val SPECULAR_DISABLED: Long = 4

    final const val SPECULAR_PHONG: Long = 2

    final const val SPECULAR_SCHLICK_GGX: Long = 0

    final const val SPECULAR_TOON: Long = 3

    final const val TEXTURE_ALBEDO: Long = 0

    final const val TEXTURE_AMBIENT_OCCLUSION: Long = 8

    final const val TEXTURE_CHANNEL_ALPHA: Long = 3

    final const val TEXTURE_CHANNEL_BLUE: Long = 2

    final const val TEXTURE_CHANNEL_GRAYSCALE: Long = 4

    final const val TEXTURE_CHANNEL_GREEN: Long = 1

    final const val TEXTURE_CHANNEL_RED: Long = 0

    final const val TEXTURE_CLEARCOAT: Long = 6

    final const val TEXTURE_DEPTH: Long = 9

    final const val TEXTURE_DETAIL_ALBEDO: Long = 14

    final const val TEXTURE_DETAIL_MASK: Long = 13

    final const val TEXTURE_DETAIL_NORMAL: Long = 15

    final const val TEXTURE_EMISSION: Long = 3

    final const val TEXTURE_FLOWMAP: Long = 7

    final const val TEXTURE_MAX: Long = 16

    final const val TEXTURE_METALLIC: Long = 1

    final const val TEXTURE_NORMAL: Long = 4

    final const val TEXTURE_REFRACTION: Long = 12

    final const val TEXTURE_RIM: Long = 5

    final const val TEXTURE_ROUGHNESS: Long = 2

    final const val TEXTURE_SUBSURFACE_SCATTERING: Long = 10

    final const val TEXTURE_TRANSMISSION: Long = 11
  }
}
