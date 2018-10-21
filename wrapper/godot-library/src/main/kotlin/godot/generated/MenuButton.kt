@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MenuButton : Button {
    constructor() : super("MenuButton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val ABOUT_TO_SHOW: String = "about_to_show"
        }
    }


    companion object {
        infix fun from(other: Button): MenuButton = MenuButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: BaseButton): MenuButton = MenuButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): MenuButton = MenuButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): MenuButton = MenuButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): MenuButton = MenuButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MenuButton = MenuButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MenuButton = fromVariant(MenuButton(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getPopupMethodBind: CPointer<godot_method_bind> by lazy { getMB("MenuButton", "get_popup") }
    open fun getPopup(): PopupMenu {
        return _icall_PopupMenu(getPopupMethodBind, this.rawMemory)
    }


    open fun _unhandled_key_input(arg0: InputEvent) {
    }


    open fun _set_items(arg0: GDArray) {
    }


    open fun _get_items(): GDArray {
        throw NotImplementedError("_get_items is not implemented for MenuButton")
    }


    private val setDisableShortcutsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MenuButton", "set_disable_shortcuts") }
    open fun setDisableShortcuts(disabled: Boolean) {
        _icall_Unit_Boolean(setDisableShortcutsMethodBind, this.rawMemory, disabled)
    }


}
