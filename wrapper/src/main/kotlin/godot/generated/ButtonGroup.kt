@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ButtonGroup : Resource {
    constructor() : super("ButtonGroup")
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
        infix fun from(other: Resource): ButtonGroup = ButtonGroup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ButtonGroup = ButtonGroup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ButtonGroup = ButtonGroup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ButtonGroup = fromVariant(ButtonGroup(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getPressedButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("ButtonGroup", "get_pressed_button") }
    open fun getPressedButton(): BaseButton {
        return _icall_BaseButton(getPressedButtonMethodBind, this.rawMemory)
    }


}
