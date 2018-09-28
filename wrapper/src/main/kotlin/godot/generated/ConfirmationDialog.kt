@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConfirmationDialog : AcceptDialog {
    constructor() : super("ConfirmationDialog")
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
        infix fun from(other: AcceptDialog): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: WindowDialog): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Popup): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConfirmationDialog = ConfirmationDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConfirmationDialog = fromVariant(ConfirmationDialog(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getCancelMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfirmationDialog", "get_cancel") }
    open fun getCancel(): Button {
        return _icall_Button(getCancelMethodBind, this.rawMemory)
    }


}
