@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimatedSprite : Node2D {
    constructor() : super("AnimatedSprite")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val FRAME_CHANGED: String = "frame_changed"
            const val ANIMATION_FINISHED: String = "animation_finished"
        }
    }


    companion object {
        infix fun from(other: Node2D): AnimatedSprite = AnimatedSprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): AnimatedSprite = AnimatedSprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): AnimatedSprite = AnimatedSprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimatedSprite = AnimatedSprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimatedSprite = fromVariant(AnimatedSprite(""), other)


        // Constants


    }


    // Properties
    open var frames: SpriteFrames
        get() = _icall_SpriteFrames(getSpriteFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setSpriteFramesMethodBind, this.rawMemory, value)


    open var animation: String
        get() = _icall_String(getAnimationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setAnimationMethodBind, this.rawMemory, value)


    open var frame: Int
        get() = _icall_Int(getFrameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFrameMethodBind, this.rawMemory, value)


    open var speedScale: Float
        get() = _icall_Float(getSpeedScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSpeedScaleMethodBind, this.rawMemory, value)


    open var centered: Boolean
        get() = _icall_Boolean(isCenteredMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCenteredMethodBind, this.rawMemory, value)


    open var offset: Vector2
        get() = _icall_Vector2(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var flipH: Boolean
        get() = _icall_Boolean(isFlippedHMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFlipHMethodBind, this.rawMemory, value)


    open var flipV: Boolean
        get() = _icall_Boolean(isFlippedVMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFlipVMethodBind, this.rawMemory, value)




    // Methods
    private val setSpriteFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_sprite_frames") }
    open fun setSpriteFrames(spriteFrames: SpriteFrames) {
        _icall_Unit_Object(setSpriteFramesMethodBind, this.rawMemory, spriteFrames)
    }


    private val getSpriteFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "get_sprite_frames") }
    open fun getSpriteFrames(): SpriteFrames {
        return _icall_SpriteFrames(getSpriteFramesMethodBind, this.rawMemory)
    }


    private val setAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_animation") }
    open fun setAnimation(animation: String) {
        _icall_Unit_String(setAnimationMethodBind, this.rawMemory, animation)
    }


    private val getAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "get_animation") }
    open fun getAnimation(): String {
        return _icall_String(getAnimationMethodBind, this.rawMemory)
    }


    open fun _set_playing(playing: Boolean) {
    }


    open fun _is_playing(): Boolean {
        throw NotImplementedError("_is_playing is not implemented for AnimatedSprite")
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "play") }
    open fun play(anim: String = "") {
        _icall_Unit_String(playMethodBind, this.rawMemory, anim)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val setCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_centered") }
    open fun setCentered(centered: Boolean) {
        _icall_Unit_Boolean(setCenteredMethodBind, this.rawMemory, centered)
    }


    private val isCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "is_centered") }
    open fun isCentered(): Boolean {
        return _icall_Boolean(isCenteredMethodBind, this.rawMemory)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val setFlipHMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_flip_h") }
    open fun setFlipH(flipH: Boolean) {
        _icall_Unit_Boolean(setFlipHMethodBind, this.rawMemory, flipH)
    }


    private val isFlippedHMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "is_flipped_h") }
    open fun isFlippedH(): Boolean {
        return _icall_Boolean(isFlippedHMethodBind, this.rawMemory)
    }


    private val setFlipVMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_flip_v") }
    open fun setFlipV(flipV: Boolean) {
        _icall_Unit_Boolean(setFlipVMethodBind, this.rawMemory, flipV)
    }


    private val isFlippedVMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "is_flipped_v") }
    open fun isFlippedV(): Boolean {
        return _icall_Boolean(isFlippedVMethodBind, this.rawMemory)
    }


    private val setFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_frame") }
    open fun setFrame(frame: Int) {
        _icall_Unit_Int(setFrameMethodBind, this.rawMemory, frame)
    }


    private val getFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "get_frame") }
    open fun getFrame(): Int {
        return _icall_Int(getFrameMethodBind, this.rawMemory)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "set_speed_scale") }
    open fun setSpeedScale(speedScale: Float) {
        _icall_Unit_Float(setSpeedScaleMethodBind, this.rawMemory, speedScale)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite", "get_speed_scale") }
    open fun getSpeedScale(): Float {
        return _icall_Float(getSpeedScaleMethodBind, this.rawMemory)
    }


    open fun _res_changed() {
    }


}
