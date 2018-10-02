@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeTimeSeek : AnimationNode {
    constructor() : super("AnimationNodeTimeSeek")
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
        infix fun from(other: AnimationNode): AnimationNodeTimeSeek = AnimationNodeTimeSeek("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeTimeSeek = AnimationNodeTimeSeek("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeTimeSeek = AnimationNodeTimeSeek("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeTimeSeek = AnimationNodeTimeSeek("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeTimeSeek = fromVariant(AnimationNodeTimeSeek(""), other)


        // Constants


    }


    // Properties
    open var seekPos: Double
        get() = _icall_Double(getSeekPosMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSeekPosMethodBind, this.rawMemory, value)




    // Methods
    private val setSeekPosMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTimeSeek", "set_seek_pos") }
    open fun setSeekPos(seekPos: Double) {
        _icall_Unit_Double(setSeekPosMethodBind, this.rawMemory, seekPos)
    }


    private val getSeekPosMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTimeSeek", "get_seek_pos") }
    open fun getSeekPos(): Double {
        return _icall_Double(getSeekPosMethodBind, this.rawMemory)
    }


}
