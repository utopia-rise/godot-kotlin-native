@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorResourcePreviewGenerator : Reference {
    constructor() : super("EditorResourcePreviewGenerator")
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
        infix fun from(other: Reference): EditorResourcePreviewGenerator = EditorResourcePreviewGenerator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorResourcePreviewGenerator = EditorResourcePreviewGenerator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorResourcePreviewGenerator = fromVariant(EditorResourcePreviewGenerator(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun handles(type: String): Boolean {
        throw NotImplementedError("handles is not implemented for EditorResourcePreviewGenerator")
    }


    open fun generate(from: Resource): Texture {
        throw NotImplementedError("generate is not implemented for EditorResourcePreviewGenerator")
    }


    open fun generate_from_path(path: String): Texture {
        throw NotImplementedError("generate_from_path is not implemented for EditorResourcePreviewGenerator")
    }


}
