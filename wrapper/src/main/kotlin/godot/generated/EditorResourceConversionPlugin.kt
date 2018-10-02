@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorResourceConversionPlugin : Reference {
    constructor() : super("EditorResourceConversionPlugin")
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
        infix fun from(other: Reference): EditorResourceConversionPlugin = EditorResourceConversionPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorResourceConversionPlugin = EditorResourceConversionPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorResourceConversionPlugin = fromVariant(EditorResourceConversionPlugin(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _convert(resource: Resource): Resource {
        throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
    }


    open fun _converts_to(): String {
        throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
    }


}
