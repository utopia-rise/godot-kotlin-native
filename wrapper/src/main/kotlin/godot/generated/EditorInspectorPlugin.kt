@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorInspectorPlugin : Reference {
    constructor() : super("EditorInspectorPlugin")
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
        infix fun from(other: Reference): EditorInspectorPlugin = EditorInspectorPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorInspectorPlugin = EditorInspectorPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorInspectorPlugin = fromVariant(EditorInspectorPlugin(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun can_handle(_object: Object): Boolean {
        throw NotImplementedError("can_handle is not implemented for EditorInspectorPlugin")
    }


    open fun parse_begin(_object: Object) {
    }


    open fun parse_category(_object: Object, category: String) {
    }


    open fun parse_property(_object: Object, type: Long, path: String, hint: Long, hintText: String, usage: Long): Boolean {
        throw NotImplementedError("parse_property is not implemented for EditorInspectorPlugin")
    }


    open fun parse_end() {
    }


    private val addCustomControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInspectorPlugin", "add_custom_control") }
    open fun addCustomControl(control: Object) {
        _icall_Unit_Object(addCustomControlMethodBind, this.rawMemory, control)
    }


    private val addPropertyEditorMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInspectorPlugin", "add_property_editor") }
    open fun addPropertyEditor(property: String, editor: Object) {
        _icall_Unit_String_Object(addPropertyEditorMethodBind, this.rawMemory, property, editor)
    }


    private val addPropertyEditorForMultiplePropertiesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInspectorPlugin", "add_property_editor_for_multiple_properties") }
    open fun addPropertyEditorForMultipleProperties(label: String, properties: PoolStringArray, editor: Object) {
        _icall_Unit_String_PoolStringArray_Object(addPropertyEditorForMultiplePropertiesMethodBind, this.rawMemory, label, properties, editor)
    }


}
