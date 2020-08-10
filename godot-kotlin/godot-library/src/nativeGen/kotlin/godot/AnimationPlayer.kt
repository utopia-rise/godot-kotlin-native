// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AnimationPlayer
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.signal
import godot.icalls._icall_Animation_String
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Double
import godot.icalls._icall_Double_String_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_Object
import godot.icalls._icall_NodePath
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_String_Object
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Double_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Double
import godot.icalls._icall_Unit_String_Double_Double_Boolean
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class AnimationPlayer internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val animationChanged: Signal2<String, String> by signal("old_name", "new_name")

  val animationFinished: Signal1<String> by signal("anim_name")

  val animationStarted: Signal1<String> by signal("anim_name")

  val cachesCleared: Signal0 by signal()

  open var assignedAnimation: String
    get() {
      val mb = getMethodBind("AnimationPlayer","get_assigned_animation")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_assigned_animation")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var autoplay: String
    get() {
      val mb = getMethodBind("AnimationPlayer","get_autoplay")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_autoplay")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var currentAnimation: String
    get() {
      val mb = getMethodBind("AnimationPlayer","get_current_animation")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_current_animation")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open val currentAnimationLength: Double
    get() {
      val mb = getMethodBind("AnimationPlayer","get_current_animation_length")
      return _icall_Double(mb, this.ptr)
    }

  open val currentAnimationPosition: Double
    get() {
      val mb = getMethodBind("AnimationPlayer","get_current_animation_position")
      return _icall_Double(mb, this.ptr)
    }

  open var methodCallMode: Long
    get() {
      val mb = getMethodBind("AnimationPlayer","get_method_call_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_method_call_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var playbackActive: Boolean
    get() {
      val mb = getMethodBind("AnimationPlayer","is_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var playbackDefaultBlendTime: Double
    get() {
      val mb = getMethodBind("AnimationPlayer","get_default_blend_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_default_blend_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var playbackProcessMode: Long
    get() {
      val mb = getMethodBind("AnimationPlayer","get_animation_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_animation_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var playbackSpeed: Double
    get() {
      val mb = getMethodBind("AnimationPlayer","get_speed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_speed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rootNode: NodePath
    get() {
      val mb = getMethodBind("AnimationPlayer","get_root")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationPlayer","set_root")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationPlayer", "AnimationPlayer")
        }

  }

  open fun _animation_changed() {
  }

  open fun _node_removed(arg0: Node) {
  }

  open fun addAnimation(name: String, animation: Animation): GodotError {
    val mb = getMethodBind("AnimationPlayer","add_animation")
    return GodotError.byValue( _icall_Long_String_Object( mb, this.ptr, name, animation).toUInt())
  }

  open fun advance(delta: Double) {
    val mb = getMethodBind("AnimationPlayer","advance")
    _icall_Unit_Double( mb, this.ptr, delta)
  }

  open fun animationGetNext(animFrom: String): String {
    val mb = getMethodBind("AnimationPlayer","animation_get_next")
    return _icall_String_String( mb, this.ptr, animFrom)
  }

  open fun animationSetNext(animFrom: String, animTo: String) {
    val mb = getMethodBind("AnimationPlayer","animation_set_next")
    _icall_Unit_String_String( mb, this.ptr, animFrom, animTo)
  }

  open fun clearCaches() {
    val mb = getMethodBind("AnimationPlayer","clear_caches")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearQueue() {
    val mb = getMethodBind("AnimationPlayer","clear_queue")
    _icall_Unit( mb, this.ptr)
  }

  open fun findAnimation(animation: Animation): String {
    val mb = getMethodBind("AnimationPlayer","find_animation")
    return _icall_String_Object( mb, this.ptr, animation)
  }

  open fun getAnimation(name: String): Animation {
    val mb = getMethodBind("AnimationPlayer","get_animation")
    return _icall_Animation_String( mb, this.ptr, name)
  }

  open fun getAnimationList(): PoolStringArray {
    val mb = getMethodBind("AnimationPlayer","get_animation_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getAnimationProcessMode(): AnimationPlayer.AnimationProcessMode {
    val mb = getMethodBind("AnimationPlayer","get_animation_process_mode")
    return AnimationPlayer.AnimationProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getAssignedAnimation(): String {
    val mb = getMethodBind("AnimationPlayer","get_assigned_animation")
    return _icall_String( mb, this.ptr)
  }

  open fun getAutoplay(): String {
    val mb = getMethodBind("AnimationPlayer","get_autoplay")
    return _icall_String( mb, this.ptr)
  }

  open fun getBlendTime(animFrom: String, animTo: String): Double {
    val mb = getMethodBind("AnimationPlayer","get_blend_time")
    return _icall_Double_String_String( mb, this.ptr, animFrom, animTo)
  }

  open fun getCurrentAnimation(): String {
    val mb = getMethodBind("AnimationPlayer","get_current_animation")
    return _icall_String( mb, this.ptr)
  }

  open fun getCurrentAnimationLength(): Double {
    val mb = getMethodBind("AnimationPlayer","get_current_animation_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCurrentAnimationPosition(): Double {
    val mb = getMethodBind("AnimationPlayer","get_current_animation_position")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDefaultBlendTime(): Double {
    val mb = getMethodBind("AnimationPlayer","get_default_blend_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMethodCallMode(): AnimationPlayer.AnimationMethodCallMode {
    val mb = getMethodBind("AnimationPlayer","get_method_call_mode")
    return AnimationPlayer.AnimationMethodCallMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPlayingSpeed(): Double {
    val mb = getMethodBind("AnimationPlayer","get_playing_speed")
    return _icall_Double( mb, this.ptr)
  }

  open fun getQueue(): PoolStringArray {
    val mb = getMethodBind("AnimationPlayer","get_queue")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getRoot(): NodePath {
    val mb = getMethodBind("AnimationPlayer","get_root")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getSpeedScale(): Double {
    val mb = getMethodBind("AnimationPlayer","get_speed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun hasAnimation(name: String): Boolean {
    val mb = getMethodBind("AnimationPlayer","has_animation")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun isActive(): Boolean {
    val mb = getMethodBind("AnimationPlayer","is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("AnimationPlayer","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun play(
    name: String = "",
    customBlend: Double = -1.0,
    customSpeed: Double = 1.0,
    fromEnd: Boolean = false
  ) {
    val mb = getMethodBind("AnimationPlayer","play")
    _icall_Unit_String_Double_Double_Boolean( mb, this.ptr, name, customBlend, customSpeed, fromEnd)
  }

  open fun playBackwards(name: String = "", customBlend: Double = -1.0) {
    val mb = getMethodBind("AnimationPlayer","play_backwards")
    _icall_Unit_String_Double( mb, this.ptr, name, customBlend)
  }

  open fun queue(name: String) {
    val mb = getMethodBind("AnimationPlayer","queue")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun removeAnimation(name: String) {
    val mb = getMethodBind("AnimationPlayer","remove_animation")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun renameAnimation(name: String, newname: String) {
    val mb = getMethodBind("AnimationPlayer","rename_animation")
    _icall_Unit_String_String( mb, this.ptr, name, newname)
  }

  open fun seek(seconds: Double, update: Boolean = false) {
    val mb = getMethodBind("AnimationPlayer","seek")
    _icall_Unit_Double_Boolean( mb, this.ptr, seconds, update)
  }

  open fun setActive(active: Boolean) {
    val mb = getMethodBind("AnimationPlayer","set_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  open fun setAnimationProcessMode(mode: Long) {
    val mb = getMethodBind("AnimationPlayer","set_animation_process_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setAssignedAnimation(anim: String) {
    val mb = getMethodBind("AnimationPlayer","set_assigned_animation")
    _icall_Unit_String( mb, this.ptr, anim)
  }

  open fun setAutoplay(name: String) {
    val mb = getMethodBind("AnimationPlayer","set_autoplay")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setBlendTime(
    animFrom: String,
    animTo: String,
    sec: Double
  ) {
    val mb = getMethodBind("AnimationPlayer","set_blend_time")
    _icall_Unit_String_String_Double( mb, this.ptr, animFrom, animTo, sec)
  }

  open fun setCurrentAnimation(anim: String) {
    val mb = getMethodBind("AnimationPlayer","set_current_animation")
    _icall_Unit_String( mb, this.ptr, anim)
  }

  open fun setDefaultBlendTime(sec: Double) {
    val mb = getMethodBind("AnimationPlayer","set_default_blend_time")
    _icall_Unit_Double( mb, this.ptr, sec)
  }

  open fun setMethodCallMode(mode: Long) {
    val mb = getMethodBind("AnimationPlayer","set_method_call_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setRoot(path: NodePath) {
    val mb = getMethodBind("AnimationPlayer","set_root")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }

  open fun setSpeedScale(speed: Double) {
    val mb = getMethodBind("AnimationPlayer","set_speed_scale")
    _icall_Unit_Double( mb, this.ptr, speed)
  }

  open fun stop(reset: Boolean = true) {
    val mb = getMethodBind("AnimationPlayer","stop")
    _icall_Unit_Boolean( mb, this.ptr, reset)
  }

  enum class AnimationProcessMode(
    id: Long
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1),

    ANIMATION_PROCESS_MANUAL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AnimationMethodCallMode(
    id: Long
  ) {
    ANIMATION_METHOD_CALL_DEFERRED(0),

    ANIMATION_METHOD_CALL_IMMEDIATE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ANIMATION_METHOD_CALL_DEFERRED: Long = 0

    final const val ANIMATION_METHOD_CALL_IMMEDIATE: Long = 1

    final const val ANIMATION_PROCESS_IDLE: Long = 1

    final const val ANIMATION_PROCESS_MANUAL: Long = 2

    final const val ANIMATION_PROCESS_PHYSICS: Long = 0
  }
}
