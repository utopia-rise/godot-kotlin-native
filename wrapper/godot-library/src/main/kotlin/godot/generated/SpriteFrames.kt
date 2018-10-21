@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpriteFrames : Resource {
    constructor() : super("SpriteFrames")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): SpriteFrames = SpriteFrames("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): SpriteFrames = SpriteFrames("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpriteFrames = SpriteFrames("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpriteFrames = fromVariant(SpriteFrames(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val addAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "add_animation") }
    open fun addAnimation(anim: String) {
        _icall_Unit_String(addAnimationMethodBind, this.rawMemory, anim)
    }


    private val hasAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "has_animation") }
    open fun hasAnimation(anim: String): Boolean {
        return _icall_Boolean_String(hasAnimationMethodBind, this.rawMemory, anim)
    }


    private val removeAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "remove_animation") }
    open fun removeAnimation(anim: String) {
        _icall_Unit_String(removeAnimationMethodBind, this.rawMemory, anim)
    }


    private val renameAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "rename_animation") }
    open fun renameAnimation(anim: String, newname: String) {
        _icall_Unit_String_String(renameAnimationMethodBind, this.rawMemory, anim, newname)
    }


    private val getAnimationNamesMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "get_animation_names") }
    open fun getAnimationNames(): PoolStringArray {
        return _icall_PoolStringArray(getAnimationNamesMethodBind, this.rawMemory)
    }


    private val setAnimationSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "set_animation_speed") }
    open fun setAnimationSpeed(anim: String, speed: Double) {
        _icall_Unit_String_Double(setAnimationSpeedMethodBind, this.rawMemory, anim, speed)
    }


    private val getAnimationSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "get_animation_speed") }
    open fun getAnimationSpeed(anim: String): Double {
        return _icall_Double_String(getAnimationSpeedMethodBind, this.rawMemory, anim)
    }


    private val setAnimationLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "set_animation_loop") }
    open fun setAnimationLoop(anim: String, loop: Boolean) {
        _icall_Unit_String_Boolean(setAnimationLoopMethodBind, this.rawMemory, anim, loop)
    }


    private val getAnimationLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "get_animation_loop") }
    open fun getAnimationLoop(anim: String): Boolean {
        return _icall_Boolean_String(getAnimationLoopMethodBind, this.rawMemory, anim)
    }


    private val addFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "add_frame") }
    open fun addFrame(anim: String, frame: Texture, atPosition: Long = -1) {
        _icall_Unit_String_Object_Long(addFrameMethodBind, this.rawMemory, anim, frame, atPosition)
    }


    private val getFrameCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "get_frame_count") }
    open fun getFrameCount(anim: String): Long {
        return _icall_Long_String(getFrameCountMethodBind, this.rawMemory, anim)
    }


    private val getFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "get_frame") }
    open fun getFrame(anim: String, idx: Long): Texture {
        return _icall_Texture_String_Long(getFrameMethodBind, this.rawMemory, anim, idx)
    }


    private val setFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "set_frame") }
    open fun setFrame(anim: String, idx: Long, txt: Texture) {
        _icall_Unit_String_Long_Object(setFrameMethodBind, this.rawMemory, anim, idx, txt)
    }


    private val removeFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "remove_frame") }
    open fun removeFrame(anim: String, idx: Long) {
        _icall_Unit_String_Long(removeFrameMethodBind, this.rawMemory, anim, idx)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "clear") }
    open fun clear(anim: String) {
        _icall_Unit_String(clearMethodBind, this.rawMemory, anim)
    }


    private val clearAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteFrames", "clear_all") }
    open fun clearAll() {
        _icall_Unit(clearAllMethodBind, this.rawMemory)
    }


    open fun _set_frames(arg0: GDArray) {
    }


    open fun _get_frames(): GDArray {
        throw NotImplementedError("_get_frames is not implemented for SpriteFrames")
    }


    open fun _set_animations(arg0: GDArray) {
    }


    open fun _get_animations(): GDArray {
        throw NotImplementedError("_get_animations is not implemented for SpriteFrames")
    }


}
