@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VideoStreamTheora : VideoStream {
    constructor() : super("VideoStreamTheora")
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
        infix fun from(other: VideoStream): VideoStreamTheora = VideoStreamTheora("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VideoStreamTheora = VideoStreamTheora("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VideoStreamTheora = VideoStreamTheora("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VideoStreamTheora = VideoStreamTheora("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VideoStreamTheora = fromVariant(VideoStreamTheora(""), other)


        // Constants


    }


    // Properties
    open var file: String
        get() = _icall_String(getFileMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setFileMethodBind, this.rawMemory, value)




    // Methods
    private val setFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoStreamTheora", "set_file") }
    open fun setFile(file: String) {
        _icall_Unit_String(setFileMethodBind, this.rawMemory, file)
    }


    private val getFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoStreamTheora", "get_file") }
    open fun getFile(): String {
        return _icall_String(getFileMethodBind, this.rawMemory)
    }


}
