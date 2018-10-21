@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorInspector : ScrollContainer {
    constructor() : super("EditorInspector")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val OBJECT_ID_SELECTED: String = "object_id_selected"
            const val PROPERTY_KEYED: String = "property_keyed"
            const val RESOURCE_SELECTED: String = "resource_selected"
        }
    }


    companion object {
        infix fun from(other: ScrollContainer): EditorInspector = EditorInspector("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Container): EditorInspector = EditorInspector("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): EditorInspector = EditorInspector("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): EditorInspector = EditorInspector("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): EditorInspector = EditorInspector("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorInspector = EditorInspector("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorInspector = fromVariant(EditorInspector(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _property_changed(arg0: String, arg1: Variant, arg2: Boolean = false) {
    }


    open fun _multiple_properties_changed(arg0: PoolStringArray, arg1: GDArray) {
    }


    open fun _property_changed_update_all(arg0: String, arg1: Variant) {
    }


    open fun _edit_request_change(arg0: Object, arg1: String) {
    }


    open fun _node_removed(arg0: Object) {
    }


    open fun _filter_changed(arg0: String) {
    }


    open fun _property_keyed(arg0: String) {
    }


    open fun _property_keyed_with_value(arg0: String, arg1: Variant) {
    }


    open fun _property_checked(arg0: String, arg1: Boolean) {
    }


    open fun _property_selected(arg0: String, arg1: Long) {
    }


    open fun _resource_selected(arg0: String, arg1: Resource) {
    }


    open fun _object_id_selected(arg0: String, arg1: Long) {
    }


    private val refreshMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInspector", "refresh") }
    open fun refresh() {
        _icall_Unit(refreshMethodBind, this.rawMemory)
    }


}
