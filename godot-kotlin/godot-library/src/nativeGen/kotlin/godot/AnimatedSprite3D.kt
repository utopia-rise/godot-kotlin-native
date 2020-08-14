// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_SpriteFrames
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class AnimatedSprite3D : SpriteBase3D() {
  val frameChanged: Signal0 by signal()

  open var animation: String
    get() {
      val mb = getMethodBind("AnimatedSprite3D","get_animation")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite3D","set_animation")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var frame: Long
    get() {
      val mb = getMethodBind("AnimatedSprite3D","get_frame")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite3D","set_frame")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var frames: SpriteFrames
    get() {
      val mb = getMethodBind("AnimatedSprite3D","get_sprite_frames")
      return _icall_SpriteFrames(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedSprite3D","set_sprite_frames")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AnimatedSprite3D", "AnimatedSprite3D")

  open fun _isPlaying(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for AnimatedSprite3D")
  }

  open fun _resChanged() {
  }

  open fun _setPlaying(playing: Boolean) {
  }

  open fun getAnimation(): String {
    val mb = getMethodBind("AnimatedSprite3D","get_animation")
    return _icall_String( mb, this.ptr)
  }

  open fun getFrame(): Long {
    val mb = getMethodBind("AnimatedSprite3D","get_frame")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSpriteFrames(): SpriteFrames {
    val mb = getMethodBind("AnimatedSprite3D","get_sprite_frames")
    return _icall_SpriteFrames( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("AnimatedSprite3D","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun play(anim: String = "") {
    val mb = getMethodBind("AnimatedSprite3D","play")
    _icall_Unit_String( mb, this.ptr, anim)
  }

  open fun setAnimation(animation: String) {
    val mb = getMethodBind("AnimatedSprite3D","set_animation")
    _icall_Unit_String( mb, this.ptr, animation)
  }

  open fun setFrame(frame: Long) {
    val mb = getMethodBind("AnimatedSprite3D","set_frame")
    _icall_Unit_Long( mb, this.ptr, frame)
  }

  open fun setSpriteFrames(spriteFrames: SpriteFrames) {
    val mb = getMethodBind("AnimatedSprite3D","set_sprite_frames")
    _icall_Unit_Object( mb, this.ptr, spriteFrames)
  }

  open fun stop() {
    val mb = getMethodBind("AnimatedSprite3D","stop")
    _icall_Unit( mb, this.ptr)
  }
}
