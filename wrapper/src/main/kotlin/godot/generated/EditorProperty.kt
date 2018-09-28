@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorProperty : Container {
    constructor() : super("EditorProperty")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val OBJECT_ID_SELECTED: String = "object_id_selected"
            const val PROPERTY_CHECKED: String = "property_checked"
            const val PROPERTY_KEYED_WITH_VALUE: String = "property_keyed_with_value"
            const val PROPERTY_KEYED: String = "property_keyed"
            const val PROPERTY_CHANGED: String = "property_changed"
            const val RESOURCE_SELECTED: String = "resource_selected"
            const val SELECTED: String = "selected"
            const val MULTIPLE_PROPERTIES_CHANGED: String = "multiple_properties_changed"
        }
    }


    companion object {
        infix fun from(other: Container): EditorProperty = EditorProperty("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): EditorProperty = EditorProperty("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): EditorProperty = EditorProperty("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): EditorProperty = EditorProperty("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorProperty = EditorProperty("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorProperty = fromVariant(EditorProperty(""), other)


        // Constants


    }


    // Properties
    open var label: String
        get() = _icall_String(getLabelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setLabelMethodBind, this.rawMemory, value)


    open var readOnly: Boolean
        get() = _icall_Boolean(isReadOnlyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setReadOnlyMethodBind, this.rawMemory, value)


    open var checkable: Boolean
        get() = _icall_Boolean(isCheckableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCheckableMethodBind, this.rawMemory, value)


    open var checked: Boolean
        get() = _icall_Boolean(isCheckedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCheckedMethodBind, this.rawMemory, value)


    open var drawRed: Boolean
        get() = _icall_Boolean(isDrawRedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDrawRedMethodBind, this.rawMemory, value)


    open var keying: Boolean
        get() = _icall_Boolean(isKeyingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setKeyingMethodBind, this.rawMemory, value)




    // Methods
    open fun update_property() {
    }


    private val setLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "set_label") }
    open fun setLabel(text: String) {
        _icall_Unit_String(setLabelMethodBind, this.rawMemory, text)
    }


    private val getLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "get_label") }
    open fun getLabel(): String {
        return _icall_String(getLabelMethodBind, this.rawMemory)
    }


    private val setReadOnlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "set_read_only") }
    open fun setReadOnly(readOnly: Boolean) {
        _icall_Unit_Boolean(setReadOnlyMethodBind, this.rawMemory, readOnly)
    }


    private val isReadOnlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "is_read_only") }
    open fun isReadOnly(): Boolean {
        return _icall_Boolean(isReadOnlyMethodBind, this.rawMemory)
    }


    private val setCheckableMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "set_checkable") }
    open fun setCheckable(checkable: Boolean) {
        _icall_Unit_Boolean(setCheckableMethodBind, this.rawMemory, checkable)
    }


    private val isCheckableMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "is_checkable") }
    open fun isCheckable(): Boolean {
        return _icall_Boolean(isCheckableMethodBind, this.rawMemory)
    }


    private val setCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "set_checked") }
    open fun setChecked(checked: Boolean) {
        _icall_Unit_Boolean(setCheckedMethodBind, this.rawMemory, checked)
    }


    private val isCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "is_checked") }
    open fun isChecked(): Boolean {
        return _icall_Boolean(isCheckedMethodBind, this.rawMemory)
    }


    private val setDrawRedMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "set_draw_red") }
    open fun setDrawRed(drawRed: Boolean) {
        _icall_Unit_Boolean(setDrawRedMethodBind, this.rawMemory, drawRed)
    }


    private val isDrawRedMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "is_draw_red") }
    open fun isDrawRed(): Boolean {
        return _icall_Boolean(isDrawRedMethodBind, this.rawMemory)
    }


    private val setKeyingMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "set_keying") }
    open fun setKeying(keying: Boolean) {
        _icall_Unit_Boolean(setKeyingMethodBind, this.rawMemory, keying)
    }


    private val isKeyingMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "is_keying") }
    open fun isKeying(): Boolean {
        return _icall_Boolean(isKeyingMethodBind, this.rawMemory)
    }


    private val getEditedPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "get_edited_property") }
    open fun getEditedProperty(): String {
        return _icall_String(getEditedPropertyMethodBind, this.rawMemory)
    }


    private val getEditedObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorProperty", "get_edited_object") }
    open fun getEditedObject(): Object {
        return _icall_Object(getEditedObjectMethodBind, this.rawMemory)
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _focusable_focused(arg0: Int) {
    }


}
