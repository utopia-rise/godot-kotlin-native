@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorFileSystem : Node {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val RESOURCES_REIMPORTED: String = "resources_reimported"
            const val SOURCES_CHANGED: String = "sources_changed"
            const val FILESYSTEM_CHANGED: String = "filesystem_changed"
        }
    }


    companion object {
        infix fun from(other: Node): EditorFileSystem = EditorFileSystem("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorFileSystem = EditorFileSystem("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorFileSystem = fromVariant(EditorFileSystem(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getFilesystemMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "get_filesystem") }
    open fun getFilesystem(): EditorFileSystemDirectory {
        return _icall_EditorFileSystemDirectory(getFilesystemMethodBind, this.rawMemory)
    }


    private val isScanningMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "is_scanning") }
    open fun isScanning(): Boolean {
        return _icall_Boolean(isScanningMethodBind, this.rawMemory)
    }


    private val getScanningProgressMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "get_scanning_progress") }
    open fun getScanningProgress(): Float {
        return _icall_Float(getScanningProgressMethodBind, this.rawMemory)
    }


    private val scanMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "scan") }
    open fun scan() {
        _icall_Unit(scanMethodBind, this.rawMemory)
    }


    private val scanSourcesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "scan_sources") }
    open fun scanSources() {
        _icall_Unit(scanSourcesMethodBind, this.rawMemory)
    }


    private val updateFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "update_file") }
    open fun updateFile(path: String) {
        _icall_Unit_String(updateFileMethodBind, this.rawMemory, path)
    }


    private val getFilesystemPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "get_filesystem_path") }
    open fun getFilesystemPath(path: String): EditorFileSystemDirectory {
        return _icall_EditorFileSystemDirectory_String(getFilesystemPathMethodBind, this.rawMemory, path)
    }


    private val getFileTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "get_file_type") }
    open fun getFileType(path: String): String {
        return _icall_String_String(getFileTypeMethodBind, this.rawMemory, path)
    }


    private val updateScriptClassesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileSystem", "update_script_classes") }
    open fun updateScriptClasses() {
        _icall_Unit(updateScriptClassesMethodBind, this.rawMemory)
    }


}
