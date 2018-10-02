@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorSceneImporter : Reference {
    constructor() : super("EditorSceneImporter")
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
        infix fun from(other: Reference): EditorSceneImporter = EditorSceneImporter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorSceneImporter = EditorSceneImporter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorSceneImporter = fromVariant(EditorSceneImporter(""), other)


        // Constants
        const val IMPORT_SCENE: Long = 1
        const val IMPORT_ANIMATION: Long = 2
        const val IMPORT_ANIMATION_DETECT_LOOP: Long = 4
        const val IMPORT_ANIMATION_OPTIMIZE: Long = 8
        const val IMPORT_ANIMATION_FORCE_ALL_TRACKS_IN_ALL_CLIPS: Long = 16
        const val IMPORT_ANIMATION_KEEP_VALUE_TRACKS: Long = 32
        const val IMPORT_GENERATE_TANGENT_ARRAYS: Long = 256
        const val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Long = 512
        const val IMPORT_MATERIALS_IN_INSTANCES: Long = 1024
        const val IMPORT_USE_COMPRESSION: Long = 2048


    }


    // Properties


    // Methods
    open fun _get_import_flags(): Long {
        throw NotImplementedError("_get_import_flags is not implemented for EditorSceneImporter")
    }


    open fun _get_extensions(): GDArray {
        throw NotImplementedError("_get_extensions is not implemented for EditorSceneImporter")
    }


    open fun _import_scene(path: String, flags: Long, bakeFps: Long): Node {
        throw NotImplementedError("_import_scene is not implemented for EditorSceneImporter")
    }


    open fun _import_animation(path: String, flags: Long, bakeFps: Long): Animation {
        throw NotImplementedError("_import_animation is not implemented for EditorSceneImporter")
    }


    private val importSceneFromOtherImporterMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSceneImporter", "import_scene_from_other_importer") }
    open fun importSceneFromOtherImporter(path: String, flags: Long, bakeFps: Long): Node {
        return _icall_Node_String_Long_Long(importSceneFromOtherImporterMethodBind, this.rawMemory, path, flags, bakeFps)
    }


    private val importAnimationFromOtherImporterMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSceneImporter", "import_animation_from_other_importer") }
    open fun importAnimationFromOtherImporter(path: String, flags: Long, bakeFps: Long): Animation {
        return _icall_Animation_String_Long_Long(importAnimationFromOtherImporterMethodBind, this.rawMemory, path, flags, bakeFps)
    }


}
