@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeAnimation : AnimationRootNode {
    constructor() : super("AnimationNodeAnimation")
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
        infix fun from(other: AnimationRootNode): AnimationNodeAnimation = AnimationNodeAnimation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AnimationNode): AnimationNodeAnimation = AnimationNodeAnimation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeAnimation = AnimationNodeAnimation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeAnimation = AnimationNodeAnimation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeAnimation = AnimationNodeAnimation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeAnimation = fromVariant(AnimationNodeAnimation(""), other)


        // Constants


    }


    // Properties
    open var animation: String
        get() = _icall_String(getAnimationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setAnimationMethodBind, this.rawMemory, value)




    // Methods
    private val setAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAnimation", "set_animation") }
    open fun setAnimation(name: String) {
        _icall_Unit_String(setAnimationMethodBind, this.rawMemory, name)
    }


    private val getAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAnimation", "get_animation") }
    open fun getAnimation(): String {
        return _icall_String(getAnimationMethodBind, this.rawMemory)
    }


    private val getPlaybackTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAnimation", "get_playback_time") }
    open fun getPlaybackTime(): Float {
        return _icall_Float(getPlaybackTimeMethodBind, this.rawMemory)
    }


}
