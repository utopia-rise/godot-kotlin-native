@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WindowDialog : Popup {
    constructor() : super("WindowDialog")
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
        infix fun from(other: Popup): WindowDialog = WindowDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): WindowDialog = WindowDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): WindowDialog = WindowDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): WindowDialog = WindowDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WindowDialog = WindowDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WindowDialog = fromVariant(WindowDialog(""), other)


        // Constants


    }


    // Properties
    open var windowTitle: String
        get() = _icall_String(getTitleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTitleMethodBind, this.rawMemory, value)


    open var resizable: Boolean
        get() = _icall_Boolean(getResizableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setResizableMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val setTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("WindowDialog", "set_title") }
    open fun setTitle(title: String) {
        _icall_Unit_String(setTitleMethodBind, this.rawMemory, title)
    }


    private val getTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("WindowDialog", "get_title") }
    open fun getTitle(): String {
        return _icall_String(getTitleMethodBind, this.rawMemory)
    }


    private val setResizableMethodBind: CPointer<godot_method_bind> by lazy { getMB("WindowDialog", "set_resizable") }
    open fun setResizable(resizable: Boolean) {
        _icall_Unit_Boolean(setResizableMethodBind, this.rawMemory, resizable)
    }


    private val getResizableMethodBind: CPointer<godot_method_bind> by lazy { getMB("WindowDialog", "get_resizable") }
    open fun getResizable(): Boolean {
        return _icall_Boolean(getResizableMethodBind, this.rawMemory)
    }


    open fun _closed() {
    }


    private val getCloseButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("WindowDialog", "get_close_button") }
    open fun getCloseButton(): TextureButton {
        return _icall_TextureButton(getCloseButtonMethodBind, this.rawMemory)
    }


}
