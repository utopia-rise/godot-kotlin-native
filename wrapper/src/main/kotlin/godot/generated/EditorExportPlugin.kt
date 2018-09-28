@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorExportPlugin : Reference {
    constructor() : super("EditorExportPlugin")
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
        infix fun from(other: Reference): EditorExportPlugin = EditorExportPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorExportPlugin = EditorExportPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorExportPlugin = fromVariant(EditorExportPlugin(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _export_file(path: String, type: String, features: PoolStringArray) {
    }


    open fun _export_begin(features: PoolStringArray, isDebug: Boolean, path: String, flags: Int) {
    }


    private val addSharedObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_shared_object") }
    open fun addSharedObject(path: String, tags: PoolStringArray) {
        _icall_Unit_String_PoolStringArray(addSharedObjectMethodBind, this.rawMemory, path, tags)
    }


    private val addFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_file") }
    open fun addFile(path: String, file: PoolByteArray, remap: Boolean) {
        _icall_Unit_String_PoolByteArray_Boolean(addFileMethodBind, this.rawMemory, path, file, remap)
    }


    private val addIosFrameworkMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_ios_framework") }
    open fun addIosFramework(path: String) {
        _icall_Unit_String(addIosFrameworkMethodBind, this.rawMemory, path)
    }


    private val addIosPlistContentMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_ios_plist_content") }
    open fun addIosPlistContent(plistContent: String) {
        _icall_Unit_String(addIosPlistContentMethodBind, this.rawMemory, plistContent)
    }


    private val addIosLinkerFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_ios_linker_flags") }
    open fun addIosLinkerFlags(flags: String) {
        _icall_Unit_String(addIosLinkerFlagsMethodBind, this.rawMemory, flags)
    }


    private val addIosBundleFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_ios_bundle_file") }
    open fun addIosBundleFile(path: String) {
        _icall_Unit_String(addIosBundleFileMethodBind, this.rawMemory, path)
    }


    private val addIosCppCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "add_ios_cpp_code") }
    open fun addIosCppCode(code: String) {
        _icall_Unit_String(addIosCppCodeMethodBind, this.rawMemory, code)
    }


    private val skipMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorExportPlugin", "skip") }
    open fun skip() {
        _icall_Unit(skipMethodBind, this.rawMemory)
    }


}
