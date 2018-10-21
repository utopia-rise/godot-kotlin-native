@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Directory : Reference {
    constructor() : super("Directory")
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
        infix fun from(other: Reference): Directory = Directory("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Directory = Directory("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Directory = fromVariant(Directory(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val openMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "open") }
    open fun open(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(openMethodBind, this.rawMemory, path))
    }


    private val listDirBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "list_dir_begin") }
    open fun listDirBegin(skipNavigational: Boolean = false, skipHidden: Boolean = false): GodotError {
        return GodotError.fromInt(_icall_Long_Boolean_Boolean(listDirBeginMethodBind, this.rawMemory, skipNavigational, skipHidden))
    }


    private val getNextMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "get_next") }
    open fun getNext(): String {
        return _icall_String(getNextMethodBind, this.rawMemory)
    }


    private val currentIsDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "current_is_dir") }
    open fun currentIsDir(): Boolean {
        return _icall_Boolean(currentIsDirMethodBind, this.rawMemory)
    }


    private val listDirEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "list_dir_end") }
    open fun listDirEnd() {
        _icall_Unit(listDirEndMethodBind, this.rawMemory)
    }


    private val getDriveCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "get_drive_count") }
    open fun getDriveCount(): Long {
        return _icall_Long(getDriveCountMethodBind, this.rawMemory)
    }


    private val getDriveMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "get_drive") }
    open fun getDrive(idx: Long): String {
        return _icall_String_Long(getDriveMethodBind, this.rawMemory, idx)
    }


    private val getCurrentDriveMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "get_current_drive") }
    open fun getCurrentDrive(): Long {
        return _icall_Long(getCurrentDriveMethodBind, this.rawMemory)
    }


    private val changeDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "change_dir") }
    open fun changeDir(todir: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(changeDirMethodBind, this.rawMemory, todir))
    }


    private val getCurrentDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "get_current_dir") }
    open fun getCurrentDir(): String {
        return _icall_String(getCurrentDirMethodBind, this.rawMemory)
    }


    private val makeDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "make_dir") }
    open fun makeDir(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(makeDirMethodBind, this.rawMemory, path))
    }


    private val makeDirRecursiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "make_dir_recursive") }
    open fun makeDirRecursive(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(makeDirRecursiveMethodBind, this.rawMemory, path))
    }


    private val fileExistsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "file_exists") }
    open fun fileExists(path: String): Boolean {
        return _icall_Boolean_String(fileExistsMethodBind, this.rawMemory, path)
    }


    private val dirExistsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "dir_exists") }
    open fun dirExists(path: String): Boolean {
        return _icall_Boolean_String(dirExistsMethodBind, this.rawMemory, path)
    }


    private val getSpaceLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "get_space_left") }
    open fun getSpaceLeft(): Long {
        return _icall_Long(getSpaceLeftMethodBind, this.rawMemory)
    }


    private val copyMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "copy") }
    open fun copy(from: String, to: String): GodotError {
        return GodotError.fromInt(_icall_Long_String_String(copyMethodBind, this.rawMemory, from, to))
    }


    private val renameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "rename") }
    open fun rename(from: String, to: String): GodotError {
        return GodotError.fromInt(_icall_Long_String_String(renameMethodBind, this.rawMemory, from, to))
    }


    private val removeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Directory", "remove") }
    open fun remove(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(removeMethodBind, this.rawMemory, path))
    }


}
