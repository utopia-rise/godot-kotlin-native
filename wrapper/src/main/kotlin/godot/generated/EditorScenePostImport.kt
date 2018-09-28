@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorScenePostImport : Reference {
    constructor() : super("EditorScenePostImport")
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
        infix fun from(other: Reference): EditorScenePostImport = EditorScenePostImport("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorScenePostImport = EditorScenePostImport("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorScenePostImport = fromVariant(EditorScenePostImport(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun post_import(scene: Object): Object {
        throw NotImplementedError("post_import is not implemented for EditorScenePostImport")
    }


    private val getSourceFolderMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorScenePostImport", "get_source_folder") }
    open fun getSourceFolder(): String {
        return _icall_String(getSourceFolderMethodBind, this.rawMemory)
    }


    private val getSourceFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorScenePostImport", "get_source_file") }
    open fun getSourceFile(): String {
        return _icall_String(getSourceFileMethodBind, this.rawMemory)
    }


}
