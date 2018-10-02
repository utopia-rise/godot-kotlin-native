@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorFileSystemDirectory : Object {
    constructor() : super("EditorFileSystemDirectory")
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
        infix fun from(other: Object): EditorFileSystemDirectory = EditorFileSystemDirectory("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorFileSystemDirectory = fromVariant(EditorFileSystemDirectory(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getSubdirCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_subdir_count") }
    open fun getSubdirCount(): Long {
        return _icall_Long(getSubdirCountMethodBind, this.rawMemory)
    }


    private val getSubdirMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_subdir") }
    open fun getSubdir(idx: Long): EditorFileSystemDirectory {
        return _icall_EditorFileSystemDirectory_Long(getSubdirMethodBind, this.rawMemory, idx)
    }


    private val getFileCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file_count") }
    open fun getFileCount(): Long {
        return _icall_Long(getFileCountMethodBind, this.rawMemory)
    }


    private val getFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file") }
    open fun getFile(idx: Long): String {
        return _icall_String_Long(getFileMethodBind, this.rawMemory, idx)
    }


    private val getFilePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file_path") }
    open fun getFilePath(idx: Long): String {
        return _icall_String_Long(getFilePathMethodBind, this.rawMemory, idx)
    }


    private val getFileTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file_type") }
    open fun getFileType(idx: Long): String {
        return _icall_String_Long(getFileTypeMethodBind, this.rawMemory, idx)
    }


    private val getFileScriptClassNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file_script_class_name") }
    open fun getFileScriptClassName(idx: Long): String {
        return _icall_String_Long(getFileScriptClassNameMethodBind, this.rawMemory, idx)
    }


    private val getFileScriptClassExtendsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file_script_class_extends") }
    open fun getFileScriptClassExtends(idx: Long): String {
        return _icall_String_Long(getFileScriptClassExtendsMethodBind, this.rawMemory, idx)
    }


    private val getFileImportIsValidMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_file_import_is_valid") }
    open fun getFileImportIsValid(idx: Long): Boolean {
        return _icall_Boolean_Long(getFileImportIsValidMethodBind, this.rawMemory, idx)
    }


    private val getNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_name") }
    open fun getName(): String {
        return _icall_String(getNameMethodBind, this.rawMemory)
    }


    private val getPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_path") }
    open fun getPath(): String {
        return _icall_String(getPathMethodBind, this.rawMemory)
    }


    private val getParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "get_parent") }
    open fun getParent(): EditorFileSystemDirectory {
        return _icall_EditorFileSystemDirectory(getParentMethodBind, this.rawMemory)
    }


    private val findFileIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "find_file_index") }
    open fun findFileIndex(name: String): Long {
        return _icall_Long_String(findFileIndexMethodBind, this.rawMemory, name)
    }


    private val findDirIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystemDirectory", "find_dir_index") }
    open fun findDirIndex(name: String): Long {
        return _icall_Long_String(findDirIndexMethodBind, this.rawMemory, name)
    }


}
