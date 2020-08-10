package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_SpriteFrames
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Unit

open class AnimatedSprite internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val animationFinished: Signal0 by signal()

  val frameChanged: Signal0 by signal()

  open var animation: String
    get() {
      val mb = getMethodBind("AnimatedSprite","get_animation")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_animation")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var centered: Boolean
    get() {
      val mb = getMethodBind("AnimatedSprite","is_centered")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_centered")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipH: Boolean
    get() {
      val mb = getMethodBind("AnimatedSprite","is_flipped_h")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_flip_h")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var flipV: Boolean
    get() {
      val mb = getMethodBind("AnimatedSprite","is_flipped_v")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_flip_v")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var frame: Long
    get() {
      val mb = getMethodBind("AnimatedSprite","get_frame")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_frame")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var frames: SpriteFrames
    get() {
      val mb = getMethodBind("AnimatedSprite","get_sprite_frames")
      return _icall_SpriteFrames(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_sprite_frames")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("AnimatedSprite","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var speedScale: Double
    get() {
      val mb = getMethodBind("AnimatedSprite","get_speed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite","set_speed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimatedSprite", "AnimatedSprite")
        }

  }

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun _is_playing(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for AnimatedSprite")
  }

  open fun _res_changed() {
  }

  open fun _set_playing(playing: Boolean) {
  }

  open fun getAnimation(): String {
    val mb = getMethodBind("AnimatedSprite","get_animation")
    return _icall_String( mb, this.ptr)
  }

  open fun getFrame(): Long {
    val mb = getMethodBind("AnimatedSprite","get_frame")
    return _icall_Long( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("AnimatedSprite","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSpeedScale(): Double {
    val mb = getMethodBind("AnimatedSprite","get_speed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpriteFrames(): SpriteFrames {
    val mb = getMethodBind("AnimatedSprite","get_sprite_frames")
    return _icall_SpriteFrames( mb, this.ptr)
  }

  open fun isCentered(): Boolean {
    val mb = getMethodBind("AnimatedSprite","is_centered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedH(): Boolean {
    val mb = getMethodBind("AnimatedSprite","is_flipped_h")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFlippedV(): Boolean {
    val mb = getMethodBind("AnimatedSprite","is_flipped_v")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("AnimatedSprite","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun play(anim: String = "", backwards: Boolean = false) {
    val mb = getMethodBind("AnimatedSprite","play")
    _icall_Unit_String_Boolean( mb, this.ptr, anim, backwards)
  }

  open fun setAnimation(animation: String) {
    val mb = getMethodBind("AnimatedSprite","set_animation")
    _icall_Unit_String( mb, this.ptr, animation)
  }

  open fun setCentered(centered: Boolean) {
    val mb = getMethodBind("AnimatedSprite","set_centered")
    _icall_Unit_Boolean( mb, this.ptr, centered)
  }

  open fun setFlipH(flipH: Boolean) {
    val mb = getMethodBind("AnimatedSprite","set_flip_h")
    _icall_Unit_Boolean( mb, this.ptr, flipH)
  }

  open fun setFlipV(flipV: Boolean) {
    val mb = getMethodBind("AnimatedSprite","set_flip_v")
    _icall_Unit_Boolean( mb, this.ptr, flipV)
  }

  open fun setFrame(frame: Long) {
    val mb = getMethodBind("AnimatedSprite","set_frame")
    _icall_Unit_Long( mb, this.ptr, frame)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("AnimatedSprite","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setSpeedScale(speedScale: Double) {
    val mb = getMethodBind("AnimatedSprite","set_speed_scale")
    _icall_Unit_Double( mb, this.ptr, speedScale)
  }

  open fun setSpriteFrames(spriteFrames: SpriteFrames) {
    val mb = getMethodBind("AnimatedSprite","set_sprite_frames")
    _icall_Unit_Object( mb, this.ptr, spriteFrames)
  }

  open fun stop() {
    val mb = getMethodBind("AnimatedSprite","stop")
    _icall_Unit( mb, this.ptr)
  }
}
