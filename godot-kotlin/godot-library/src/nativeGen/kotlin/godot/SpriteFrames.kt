package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.core.VariantArray
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Double_String
import godot.icalls._icall_Long_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_Texture_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_Double
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Long_Object
import godot.icalls._icall_Unit_String_Object_Long
import godot.icalls._icall_Unit_String_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class SpriteFrames internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SpriteFrames", "SpriteFrames")
        }

  }

  open fun _get_animations(): VariantArray {
    throw NotImplementedError("_get_animations is not implemented for SpriteFrames")
  }

  open fun _get_frames(): VariantArray {
    throw NotImplementedError("_get_frames is not implemented for SpriteFrames")
  }

  open fun _set_animations(arg0: VariantArray) {
  }

  open fun _set_frames(arg0: VariantArray) {
  }

  open fun addAnimation(anim: String) {
    val mb = getMethodBind("SpriteFrames","add_animation")
    _icall_Unit_String( mb, this.ptr, anim)
  }

  open fun addFrame(
    anim: String,
    frame: Texture,
    atPosition: Long = -1
  ) {
    val mb = getMethodBind("SpriteFrames","add_frame")
    _icall_Unit_String_Object_Long( mb, this.ptr, anim, frame, atPosition)
  }

  open fun clear(anim: String) {
    val mb = getMethodBind("SpriteFrames","clear")
    _icall_Unit_String( mb, this.ptr, anim)
  }

  open fun clearAll() {
    val mb = getMethodBind("SpriteFrames","clear_all")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAnimationLoop(anim: String): Boolean {
    val mb = getMethodBind("SpriteFrames","get_animation_loop")
    return _icall_Boolean_String( mb, this.ptr, anim)
  }

  open fun getAnimationNames(): PoolStringArray {
    val mb = getMethodBind("SpriteFrames","get_animation_names")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getAnimationSpeed(anim: String): Double {
    val mb = getMethodBind("SpriteFrames","get_animation_speed")
    return _icall_Double_String( mb, this.ptr, anim)
  }

  open fun getFrame(anim: String, idx: Long): Texture {
    val mb = getMethodBind("SpriteFrames","get_frame")
    return _icall_Texture_String_Long( mb, this.ptr, anim, idx)
  }

  open fun getFrameCount(anim: String): Long {
    val mb = getMethodBind("SpriteFrames","get_frame_count")
    return _icall_Long_String( mb, this.ptr, anim)
  }

  open fun hasAnimation(anim: String): Boolean {
    val mb = getMethodBind("SpriteFrames","has_animation")
    return _icall_Boolean_String( mb, this.ptr, anim)
  }

  open fun removeAnimation(anim: String) {
    val mb = getMethodBind("SpriteFrames","remove_animation")
    _icall_Unit_String( mb, this.ptr, anim)
  }

  open fun removeFrame(anim: String, idx: Long) {
    val mb = getMethodBind("SpriteFrames","remove_frame")
    _icall_Unit_String_Long( mb, this.ptr, anim, idx)
  }

  open fun renameAnimation(anim: String, newname: String) {
    val mb = getMethodBind("SpriteFrames","rename_animation")
    _icall_Unit_String_String( mb, this.ptr, anim, newname)
  }

  open fun setAnimationLoop(anim: String, loop: Boolean) {
    val mb = getMethodBind("SpriteFrames","set_animation_loop")
    _icall_Unit_String_Boolean( mb, this.ptr, anim, loop)
  }

  open fun setAnimationSpeed(anim: String, speed: Double) {
    val mb = getMethodBind("SpriteFrames","set_animation_speed")
    _icall_Unit_String_Double( mb, this.ptr, anim, speed)
  }

  open fun setFrame(
    anim: String,
    idx: Long,
    txt: Texture
  ) {
    val mb = getMethodBind("SpriteFrames","set_frame")
    _icall_Unit_String_Long_Object( mb, this.ptr, anim, idx, txt)
  }
}
