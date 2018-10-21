@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamOGGVorbis : AudioStream {
    constructor() : super("AudioStreamOGGVorbis")
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
        infix fun from(other: AudioStream): AudioStreamOGGVorbis = AudioStreamOGGVorbis("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioStreamOGGVorbis = AudioStreamOGGVorbis("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioStreamOGGVorbis = AudioStreamOGGVorbis("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamOGGVorbis = AudioStreamOGGVorbis("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamOGGVorbis = fromVariant(AudioStreamOGGVorbis(""), other)


        // Constants


    }


    // Properties
    open var data: PoolByteArray
        get() = _icall_PoolByteArray(getDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolByteArray(setDataMethodBind, this.rawMemory, value)


    open var loop: Boolean
        get() = _icall_Boolean(hasLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, value)


    open var loopOffset: Double
        get() = _icall_Double(getLoopOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLoopOffsetMethodBind, this.rawMemory, value)




    // Methods
    private val setDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamOGGVorbis", "set_data") }
    open fun setData(data: PoolByteArray) {
        _icall_Unit_PoolByteArray(setDataMethodBind, this.rawMemory, data)
    }


    private val getDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamOGGVorbis", "get_data") }
    open fun getData(): PoolByteArray {
        return _icall_PoolByteArray(getDataMethodBind, this.rawMemory)
    }


    private val setLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamOGGVorbis", "set_loop") }
    open fun setLoop(enable: Boolean) {
        _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, enable)
    }


    private val hasLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamOGGVorbis", "has_loop") }
    open fun hasLoop(): Boolean {
        return _icall_Boolean(hasLoopMethodBind, this.rawMemory)
    }


    private val setLoopOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamOGGVorbis", "set_loop_offset") }
    open fun setLoopOffset(seconds: Double) {
        _icall_Unit_Double(setLoopOffsetMethodBind, this.rawMemory, seconds)
    }


    private val getLoopOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamOGGVorbis", "get_loop_offset") }
    open fun getLoopOffset(): Double {
        return _icall_Double(getLoopOffsetMethodBind, this.rawMemory)
    }


}
