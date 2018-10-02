@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ScriptCreateDialog : ConfirmationDialog {
    constructor() : super("ScriptCreateDialog")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SCRIPT_CREATED: String = "script_created"
        }
    }


    companion object {
        infix fun from(other: ConfirmationDialog): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AcceptDialog): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: WindowDialog): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Popup): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ScriptCreateDialog = ScriptCreateDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ScriptCreateDialog = fromVariant(ScriptCreateDialog(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _class_name_changed(arg0: String) {
    }


    open fun _parent_name_changed(arg0: String) {
    }


    open fun _lang_changed(arg0: Int) {
    }


    open fun _built_in_pressed() {
    }


    open fun _browse_path(arg0: Boolean, arg1: Boolean) {
    }


    open fun _file_selected(arg0: String) {
    }


    open fun _path_changed(arg0: String) {
    }


    open fun _path_entered(arg0: String) {
    }


    open fun _template_changed(arg0: Int) {
    }


    private val configMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptCreateDialog", "config") }
    open fun config(inherits: String, path: String) {
        _icall_Unit_String_String(configMethodBind, this.rawMemory, inherits, path)
    }


}
