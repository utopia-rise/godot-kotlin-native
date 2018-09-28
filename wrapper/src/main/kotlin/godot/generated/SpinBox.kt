@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpinBox : Range {
    constructor() : super("SpinBox")
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
        infix fun from(other: Range): SpinBox = SpinBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): SpinBox = SpinBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): SpinBox = SpinBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): SpinBox = SpinBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpinBox = SpinBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpinBox = fromVariant(SpinBox(""), other)


        // Constants


    }


    // Properties
    open var editable: Boolean
        get() = _icall_Boolean(isEditableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEditableMethodBind, this.rawMemory, value)


    open var prefix: String
        get() = _icall_String(getPrefixMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setPrefixMethodBind, this.rawMemory, value)


    open var suffix: String
        get() = _icall_String(getSuffixMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSuffixMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _text_entered(arg0: String) {
    }


    private val setSuffixMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "set_suffix") }
    open fun setSuffix(suffix: String) {
        _icall_Unit_String(setSuffixMethodBind, this.rawMemory, suffix)
    }


    private val getSuffixMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "get_suffix") }
    open fun getSuffix(): String {
        return _icall_String(getSuffixMethodBind, this.rawMemory)
    }


    private val setPrefixMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "set_prefix") }
    open fun setPrefix(prefix: String) {
        _icall_Unit_String(setPrefixMethodBind, this.rawMemory, prefix)
    }


    private val getPrefixMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "get_prefix") }
    open fun getPrefix(): String {
        return _icall_String(getPrefixMethodBind, this.rawMemory)
    }


    private val setEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "set_editable") }
    open fun setEditable(editable: Boolean) {
        _icall_Unit_Boolean(setEditableMethodBind, this.rawMemory, editable)
    }


    private val isEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "is_editable") }
    open fun isEditable(): Boolean {
        return _icall_Boolean(isEditableMethodBind, this.rawMemory)
    }


    open fun _line_edit_focus_exit() {
    }


    private val getLineEditMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpinBox", "get_line_edit") }
    open fun getLineEdit(): LineEdit {
        return _icall_LineEdit(getLineEditMethodBind, this.rawMemory)
    }


    open fun _line_edit_input(arg0: InputEvent) {
    }


    open fun _range_click_timeout() {
    }


}
