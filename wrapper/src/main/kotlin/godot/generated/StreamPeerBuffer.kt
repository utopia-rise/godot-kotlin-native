@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StreamPeerBuffer : StreamPeer {
    constructor() : super("StreamPeerBuffer")
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
        infix fun from(other: StreamPeer): StreamPeerBuffer = StreamPeerBuffer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StreamPeerBuffer = StreamPeerBuffer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StreamPeerBuffer = StreamPeerBuffer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StreamPeerBuffer = fromVariant(StreamPeerBuffer(""), other)


        // Constants


    }


    // Properties
    open var dataArray: PoolByteArray
        get() = _icall_PoolByteArray(getDataArrayMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolByteArray(setDataArrayMethodBind, this.rawMemory, value)




    // Methods
    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "seek") }
    open fun seek(position: Int) {
        _icall_Unit_Int(seekMethodBind, this.rawMemory, position)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "get_size") }
    open fun getSize(): Int {
        return _icall_Int(getSizeMethodBind, this.rawMemory)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "get_position") }
    open fun getPosition(): Int {
        return _icall_Int(getPositionMethodBind, this.rawMemory)
    }


    private val resizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "resize") }
    open fun resize(size: Int) {
        _icall_Unit_Int(resizeMethodBind, this.rawMemory, size)
    }


    private val setDataArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "set_data_array") }
    open fun setDataArray(data: PoolByteArray) {
        _icall_Unit_PoolByteArray(setDataArrayMethodBind, this.rawMemory, data)
    }


    private val getDataArrayMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "get_data_array") }
    open fun getDataArray(): PoolByteArray {
        return _icall_PoolByteArray(getDataArrayMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val duplicateMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamPeerBuffer", "duplicate") }
    open fun duplicate(): StreamPeerBuffer {
        return _icall_StreamPeerBuffer(duplicateMethodBind, this.rawMemory)
    }


}
