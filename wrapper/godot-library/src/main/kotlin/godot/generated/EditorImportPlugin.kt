@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorImportPlugin : Reference {
    constructor() : super("EditorImportPlugin")
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
        infix fun from(other: Reference): EditorImportPlugin = EditorImportPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorImportPlugin = EditorImportPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorImportPlugin = fromVariant(EditorImportPlugin(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun get_importer_name(): String {
        throw NotImplementedError("get_importer_name is not implemented for EditorImportPlugin")
    }


    open fun get_visible_name(): String {
        throw NotImplementedError("get_visible_name is not implemented for EditorImportPlugin")
    }


    open fun get_preset_count(): Long {
        throw NotImplementedError("get_preset_count is not implemented for EditorImportPlugin")
    }


    open fun get_preset_name(preset: Long): String {
        throw NotImplementedError("get_preset_name is not implemented for EditorImportPlugin")
    }


    open fun get_recognized_extensions(): GDArray {
        throw NotImplementedError("get_recognized_extensions is not implemented for EditorImportPlugin")
    }


    open fun get_import_options(preset: Long): GDArray {
        throw NotImplementedError("get_import_options is not implemented for EditorImportPlugin")
    }


    open fun get_save_extension(): String {
        throw NotImplementedError("get_save_extension is not implemented for EditorImportPlugin")
    }


    open fun get_resource_type(): String {
        throw NotImplementedError("get_resource_type is not implemented for EditorImportPlugin")
    }


    open fun get_priority(): Double {
        throw NotImplementedError("get_priority is not implemented for EditorImportPlugin")
    }


    open fun get_import_order(): Long {
        throw NotImplementedError("get_import_order is not implemented for EditorImportPlugin")
    }


    open fun get_option_visibility(option: String, options: Dictionary): Boolean {
        throw NotImplementedError("get_option_visibility is not implemented for EditorImportPlugin")
    }


    open fun import(sourceFile: String, savePath: String, options: Dictionary, rPlatformVariants: GDArray, rGenFiles: GDArray): Long {
        throw NotImplementedError("import is not implemented for EditorImportPlugin")
    }


}
