@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimatedSprite3D : SpriteBase3D {
    constructor() : super("AnimatedSprite3D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val FRAME_CHANGED: String = "frame_changed"
        }
    }


    companion object {
        infix fun from(other: SpriteBase3D): AnimatedSprite3D = AnimatedSprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: GeometryInstance): AnimatedSprite3D = AnimatedSprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): AnimatedSprite3D = AnimatedSprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): AnimatedSprite3D = AnimatedSprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): AnimatedSprite3D = AnimatedSprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimatedSprite3D = AnimatedSprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimatedSprite3D = fromVariant(AnimatedSprite3D(""), other)


        // Constants


    }


    // Properties
    open var frames: SpriteFrames
        get() = _icall_SpriteFrames(getSpriteFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setSpriteFramesMethodBind, this.rawMemory, value)


    open var animation: String
        get() = _icall_String(getAnimationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setAnimationMethodBind, this.rawMemory, value)


    open var frame: Long
        get() = _icall_Long(getFrameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFrameMethodBind, this.rawMemory, value)




    // Methods
    private val setSpriteFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "set_sprite_frames") }
    open fun setSpriteFrames(spriteFrames: SpriteFrames) {
        _icall_Unit_Object(setSpriteFramesMethodBind, this.rawMemory, spriteFrames)
    }


    private val getSpriteFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "get_sprite_frames") }
    open fun getSpriteFrames(): SpriteFrames {
        return _icall_SpriteFrames(getSpriteFramesMethodBind, this.rawMemory)
    }


    private val setAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "set_animation") }
    open fun setAnimation(animation: String) {
        _icall_Unit_String(setAnimationMethodBind, this.rawMemory, animation)
    }


    private val getAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "get_animation") }
    open fun getAnimation(): String {
        return _icall_String(getAnimationMethodBind, this.rawMemory)
    }


    open fun _set_playing(playing: Boolean) {
    }


    open fun _is_playing(): Boolean {
        throw NotImplementedError("_is_playing is not implemented for AnimatedSprite3D")
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "play") }
    open fun play(anim: String = "") {
        _icall_Unit_String(playMethodBind, this.rawMemory, anim)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val setFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "set_frame") }
    open fun setFrame(frame: Long) {
        _icall_Unit_Long(setFrameMethodBind, this.rawMemory, frame)
    }


    private val getFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedSprite3D", "get_frame") }
    open fun getFrame(): Long {
        return _icall_Long(getFrameMethodBind, this.rawMemory)
    }


    open fun _res_changed() {
    }


}
