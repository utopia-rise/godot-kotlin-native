@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StreamTexture : Texture {
    constructor() : super("StreamTexture")
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
        infix fun from(other: Texture): StreamTexture = StreamTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): StreamTexture = StreamTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StreamTexture = StreamTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StreamTexture = StreamTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StreamTexture = fromVariant(StreamTexture(""), other)


        // Constants


    }


    // Properties
    open val loadPath: String
        get() = _icall_String(getLoadPathMethodBind, this.rawMemory)




    // Methods
    private val loadMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamTexture", "load") }
    open fun load(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(loadMethodBind, this.rawMemory, path))
    }


    private val getLoadPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("StreamTexture", "get_load_path") }
    open fun getLoadPath(): String {
        return _icall_String(getLoadPathMethodBind, this.rawMemory)
    }


}
