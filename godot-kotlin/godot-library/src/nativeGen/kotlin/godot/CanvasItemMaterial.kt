// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.CanvasItemMaterial
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class CanvasItemMaterial internal constructor(
  _ignore: Any?
) : Material(_ignore) {
  open var blendMode: Long
    get() {
      val mb = getMethodBind("CanvasItemMaterial","get_blend_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItemMaterial","set_blend_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var lightMode: Long
    get() {
      val mb = getMethodBind("CanvasItemMaterial","get_light_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItemMaterial","set_light_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var particlesAnimHFrames: Long
    get() {
      val mb = getMethodBind("CanvasItemMaterial","get_particles_anim_h_frames")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItemMaterial","set_particles_anim_h_frames")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var particlesAnimLoop: Boolean
    get() {
      val mb = getMethodBind("CanvasItemMaterial","get_particles_anim_loop")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItemMaterial","set_particles_anim_loop")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var particlesAnimVFrames: Long
    get() {
      val mb = getMethodBind("CanvasItemMaterial","get_particles_anim_v_frames")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItemMaterial","set_particles_anim_v_frames")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var particlesAnimation: Boolean
    get() {
      val mb = getMethodBind("CanvasItemMaterial","get_particles_animation")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItemMaterial","set_particles_animation")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("CanvasItemMaterial", "CanvasItemMaterial")
        }

  }

  open fun getBlendMode(): CanvasItemMaterial.BlendMode {
    val mb = getMethodBind("CanvasItemMaterial","get_blend_mode")
    return CanvasItemMaterial.BlendMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getLightMode(): CanvasItemMaterial.LightMode {
    val mb = getMethodBind("CanvasItemMaterial","get_light_mode")
    return CanvasItemMaterial.LightMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getParticlesAnimHFrames(): Long {
    val mb = getMethodBind("CanvasItemMaterial","get_particles_anim_h_frames")
    return _icall_Long( mb, this.ptr)
  }

  open fun getParticlesAnimLoop(): Boolean {
    val mb = getMethodBind("CanvasItemMaterial","get_particles_anim_loop")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getParticlesAnimVFrames(): Long {
    val mb = getMethodBind("CanvasItemMaterial","get_particles_anim_v_frames")
    return _icall_Long( mb, this.ptr)
  }

  open fun getParticlesAnimation(): Boolean {
    val mb = getMethodBind("CanvasItemMaterial","get_particles_animation")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBlendMode(blendMode: Long) {
    val mb = getMethodBind("CanvasItemMaterial","set_blend_mode")
    _icall_Unit_Long( mb, this.ptr, blendMode)
  }

  open fun setLightMode(lightMode: Long) {
    val mb = getMethodBind("CanvasItemMaterial","set_light_mode")
    _icall_Unit_Long( mb, this.ptr, lightMode)
  }

  open fun setParticlesAnimHFrames(frames: Long) {
    val mb = getMethodBind("CanvasItemMaterial","set_particles_anim_h_frames")
    _icall_Unit_Long( mb, this.ptr, frames)
  }

  open fun setParticlesAnimLoop(loop: Boolean) {
    val mb = getMethodBind("CanvasItemMaterial","set_particles_anim_loop")
    _icall_Unit_Boolean( mb, this.ptr, loop)
  }

  open fun setParticlesAnimVFrames(frames: Long) {
    val mb = getMethodBind("CanvasItemMaterial","set_particles_anim_v_frames")
    _icall_Unit_Long( mb, this.ptr, frames)
  }

  open fun setParticlesAnimation(particlesAnim: Boolean) {
    val mb = getMethodBind("CanvasItemMaterial","set_particles_animation")
    _icall_Unit_Boolean( mb, this.ptr, particlesAnim)
  }

  enum class LightMode(
    id: Long
  ) {
    LIGHT_MODE_NORMAL(0),

    LIGHT_MODE_UNSHADED(1),

    LIGHT_MODE_LIGHT_ONLY(2);

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

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
