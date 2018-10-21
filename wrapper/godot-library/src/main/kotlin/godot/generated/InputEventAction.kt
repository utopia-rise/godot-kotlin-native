@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventAction : InputEvent {
    constructor() : super("InputEventAction")
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
        infix fun from(other: InputEvent): InputEventAction = InputEventAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventAction = InputEventAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventAction = InputEventAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventAction = InputEventAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventAction = fromVariant(InputEventAction(""), other)


        // Constants


    }


    // Properties
    open var action: String
        get() = _icall_String(getActionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setActionMethodBind, this.rawMemory, value)


    open var pressed: Boolean
        get() = throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
        set(value) = _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, value)




    // Methods
    private val setActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventAction", "set_action") }
    open fun setAction(action: String) {
        _icall_Unit_String(setActionMethodBind, this.rawMemory, action)
    }


    private val getActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventAction", "get_action") }
    open fun getAction(): String {
        return _icall_String(getActionMethodBind, this.rawMemory)
    }


    private val setPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventAction", "set_pressed") }
    open fun setPressed(pressed: Boolean) {
        _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, pressed)
    }


}
