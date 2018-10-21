@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AcceptDialog : WindowDialog {
    constructor() : super("AcceptDialog")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val CONFIRMED: String = "confirmed"
            const val CUSTOM_ACTION: String = "custom_action"
        }
    }


    companion object {
        infix fun from(other: WindowDialog): AcceptDialog = AcceptDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Popup): AcceptDialog = AcceptDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): AcceptDialog = AcceptDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): AcceptDialog = AcceptDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): AcceptDialog = AcceptDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AcceptDialog = AcceptDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AcceptDialog = fromVariant(AcceptDialog(""), other)


        // Constants


    }


    // Properties
    open var dialogText: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var dialogHideOnOk: Boolean
        get() = _icall_Boolean(getHideOnOkMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHideOnOkMethodBind, this.rawMemory, value)




    // Methods
    open fun _ok() {
    }


    private val getOkMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "get_ok") }
    open fun getOk(): Button {
        return _icall_Button(getOkMethodBind, this.rawMemory)
    }


    private val getLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "get_label") }
    open fun getLabel(): Label {
        return _icall_Label(getLabelMethodBind, this.rawMemory)
    }


    private val setHideOnOkMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "set_hide_on_ok") }
    open fun setHideOnOk(enabled: Boolean) {
        _icall_Unit_Boolean(setHideOnOkMethodBind, this.rawMemory, enabled)
    }


    private val getHideOnOkMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "get_hide_on_ok") }
    open fun getHideOnOk(): Boolean {
        return _icall_Boolean(getHideOnOkMethodBind, this.rawMemory)
    }


    private val addButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "add_button") }
    open fun addButton(text: String, right: Boolean = false, action: String = ""): Button {
        return _icall_Button_String_Boolean_String(addButtonMethodBind, this.rawMemory, text, right, action)
    }


    private val addCancelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "add_cancel") }
    open fun addCancel(name: String): Button {
        return _icall_Button_String(addCancelMethodBind, this.rawMemory, name)
    }


    open fun _builtin_text_entered(arg0: String) {
    }


    private val registerTextEnterMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "register_text_enter") }
    open fun registerTextEnter(lineEdit: Object) {
        _icall_Unit_Object(registerTextEnterMethodBind, this.rawMemory, lineEdit)
    }


    open fun _custom_action(arg0: String) {
    }


    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("AcceptDialog", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


}
