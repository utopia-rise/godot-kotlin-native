@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationPlayer : Node {
    constructor() : super("AnimationPlayer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AnimationProcessMode(val id: Long) {
        ANIMATION_PROCESS_PHYSICS(0),
        ANIMATION_PROCESS_IDLE(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val CACHES_CLEARED: String = "caches_cleared"
            const val ANIMATION_STARTED: String = "animation_started"
            const val ANIMATION_CHANGED: String = "animation_changed"
            const val ANIMATION_FINISHED: String = "animation_finished"
        }
    }


    companion object {
        infix fun from(other: Node): AnimationPlayer = AnimationPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationPlayer = AnimationPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationPlayer = fromVariant(AnimationPlayer(""), other)


        // Constants
        const val ANIMATION_PROCESS_PHYSICS: Long = 0
        const val ANIMATION_PROCESS_IDLE: Long = 1


    }


    // Properties
    open var rootNode: NodePath
        get() = _icall_NodePath(getRootMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setRootMethodBind, this.rawMemory, value)


    open var currentAnimation: String
        get() = _icall_String(getCurrentAnimationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentAnimationMethodBind, this.rawMemory, value)


    open var assignedAnimation: String
        get() = _icall_String(getAssignedAnimationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setAssignedAnimationMethodBind, this.rawMemory, value)


    open var autoplay: String
        get() = _icall_String(getAutoplayMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setAutoplayMethodBind, this.rawMemory, value)


    open val currentAnimationLength: Double
        get() = _icall_Double(getCurrentAnimationLengthMethodBind, this.rawMemory)


    open val currentAnimationPosition: Double
        get() = _icall_Double(getCurrentAnimationPositionMethodBind, this.rawMemory)


    open var playbackProcessMode: Long
        get() = _icall_Long(getAnimationProcessModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAnimationProcessModeMethodBind, this.rawMemory, value)


    open var playbackDefaultBlendTime: Double
        get() = _icall_Double(getDefaultBlendTimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDefaultBlendTimeMethodBind, this.rawMemory, value)


    open var playbackActive: Boolean
        get() = _icall_Boolean(isActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, value)


    open var playbackSpeed: Double
        get() = _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, value)




    // Methods
    open fun _node_removed(arg0: Object) {
    }


    open fun _animation_changed() {
    }


    private val addAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "add_animation") }
    open fun addAnimation(name: String, animation: Animation): GodotError {
        return GodotError.fromInt(_icall_Long_String_Object(addAnimationMethodBind, this.rawMemory, name, animation))
    }


    private val removeAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "remove_animation") }
    open fun removeAnimation(name: String) {
        _icall_Unit_String(removeAnimationMethodBind, this.rawMemory, name)
    }


    private val renameAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "rename_animation") }
    open fun renameAnimation(name: String, newname: String) {
        _icall_Unit_String_String(renameAnimationMethodBind, this.rawMemory, name, newname)
    }


    private val hasAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "has_animation") }
    open fun hasAnimation(name: String): Boolean {
        return _icall_Boolean_String(hasAnimationMethodBind, this.rawMemory, name)
    }


    private val getAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_animation") }
    open fun getAnimation(name: String): Animation {
        return _icall_Animation_String(getAnimationMethodBind, this.rawMemory, name)
    }


    private val getAnimationListMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_animation_list") }
    open fun getAnimationList(): PoolStringArray {
        return _icall_PoolStringArray(getAnimationListMethodBind, this.rawMemory)
    }


    private val animationSetNextMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "animation_set_next") }
    open fun animationSetNext(animFrom: String, animTo: String) {
        _icall_Unit_String_String(animationSetNextMethodBind, this.rawMemory, animFrom, animTo)
    }


    private val animationGetNextMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "animation_get_next") }
    open fun animationGetNext(animFrom: String): String {
        return _icall_String_String(animationGetNextMethodBind, this.rawMemory, animFrom)
    }


    private val setBlendTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_blend_time") }
    open fun setBlendTime(animFrom: String, animTo: String, sec: Double) {
        _icall_Unit_String_String_Double(setBlendTimeMethodBind, this.rawMemory, animFrom, animTo, sec)
    }


    private val getBlendTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_blend_time") }
    open fun getBlendTime(animFrom: String, animTo: String): Double {
        return _icall_Double_String_String(getBlendTimeMethodBind, this.rawMemory, animFrom, animTo)
    }


    private val setDefaultBlendTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_default_blend_time") }
    open fun setDefaultBlendTime(sec: Double) {
        _icall_Unit_Double(setDefaultBlendTimeMethodBind, this.rawMemory, sec)
    }


    private val getDefaultBlendTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_default_blend_time") }
    open fun getDefaultBlendTime(): Double {
        return _icall_Double(getDefaultBlendTimeMethodBind, this.rawMemory)
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "play") }
    open fun play(name: String = "", customBlend: Double = -1.0, customSpeed: Double = 1.0, fromEnd: Boolean = false) {
        _icall_Unit_String_Double_Double_Boolean(playMethodBind, this.rawMemory, name, customBlend, customSpeed, fromEnd)
    }


    private val playBackwardsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "play_backwards") }
    open fun playBackwards(name: String = "", customBlend: Double = -1.0) {
        _icall_Unit_String_Double(playBackwardsMethodBind, this.rawMemory, name, customBlend)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "stop") }
    open fun stop(reset: Boolean = true) {
        _icall_Unit_Boolean(stopMethodBind, this.rawMemory, reset)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val setCurrentAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_current_animation") }
    open fun setCurrentAnimation(anim: String) {
        _icall_Unit_String(setCurrentAnimationMethodBind, this.rawMemory, anim)
    }


    private val getCurrentAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_current_animation") }
    open fun getCurrentAnimation(): String {
        return _icall_String(getCurrentAnimationMethodBind, this.rawMemory)
    }


    private val setAssignedAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_assigned_animation") }
    open fun setAssignedAnimation(anim: String) {
        _icall_Unit_String(setAssignedAnimationMethodBind, this.rawMemory, anim)
    }


    private val getAssignedAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_assigned_animation") }
    open fun getAssignedAnimation(): String {
        return _icall_String(getAssignedAnimationMethodBind, this.rawMemory)
    }


    private val queueMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "queue") }
    open fun queue(name: String) {
        _icall_Unit_String(queueMethodBind, this.rawMemory, name)
    }


    private val clearQueueMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "clear_queue") }
    open fun clearQueue() {
        _icall_Unit(clearQueueMethodBind, this.rawMemory)
    }


    private val setActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_active") }
    open fun setActive(active: Boolean) {
        _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, active)
    }


    private val isActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "is_active") }
    open fun isActive(): Boolean {
        return _icall_Boolean(isActiveMethodBind, this.rawMemory)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_speed_scale") }
    open fun setSpeedScale(speed: Double) {
        _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, speed)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_speed_scale") }
    open fun getSpeedScale(): Double {
        return _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
    }


    private val getPlayingSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_playing_speed") }
    open fun getPlayingSpeed(): Double {
        return _icall_Double(getPlayingSpeedMethodBind, this.rawMemory)
    }


    private val setAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_autoplay") }
    open fun setAutoplay(name: String) {
        _icall_Unit_String(setAutoplayMethodBind, this.rawMemory, name)
    }


    private val getAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_autoplay") }
    open fun getAutoplay(): String {
        return _icall_String(getAutoplayMethodBind, this.rawMemory)
    }


    private val setRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_root") }
    open fun setRoot(path: NodePath) {
        _icall_Unit_NodePath(setRootMethodBind, this.rawMemory, path)
    }


    private val getRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_root") }
    open fun getRoot(): NodePath {
        return _icall_NodePath(getRootMethodBind, this.rawMemory)
    }


    private val findAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "find_animation") }
    open fun findAnimation(animation: Animation): String {
        return _icall_String_Object(findAnimationMethodBind, this.rawMemory, animation)
    }


    private val clearCachesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "clear_caches") }
    open fun clearCaches() {
        _icall_Unit(clearCachesMethodBind, this.rawMemory)
    }


    private val setAnimationProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "set_animation_process_mode") }
    open fun setAnimationProcessMode(mode: Long) {
        _icall_Unit_Long(setAnimationProcessModeMethodBind, this.rawMemory, mode)
    }


    private val getAnimationProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_animation_process_mode") }
    open fun getAnimationProcessMode(): AnimationPlayer.AnimationProcessMode {
        return AnimationPlayer.AnimationProcessMode.fromInt(_icall_Long(getAnimationProcessModeMethodBind, this.rawMemory))
    }


    private val getCurrentAnimationPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_current_animation_position") }
    open fun getCurrentAnimationPosition(): Double {
        return _icall_Double(getCurrentAnimationPositionMethodBind, this.rawMemory)
    }


    private val getCurrentAnimationLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "get_current_animation_length") }
    open fun getCurrentAnimationLength(): Double {
        return _icall_Double(getCurrentAnimationLengthMethodBind, this.rawMemory)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "seek") }
    open fun seek(seconds: Double, update: Boolean = false) {
        _icall_Unit_Double_Boolean(seekMethodBind, this.rawMemory, seconds, update)
    }


    private val advanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationPlayer", "advance") }
    open fun advance(delta: Double) {
        _icall_Unit_Double(advanceMethodBind, this.rawMemory, delta)
    }


}
