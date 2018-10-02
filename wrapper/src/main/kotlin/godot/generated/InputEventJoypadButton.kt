@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventJoypadButton : InputEvent {
    constructor() : super("InputEventJoypadButton")
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
        infix fun from(other: InputEvent): InputEventJoypadButton = InputEventJoypadButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventJoypadButton = InputEventJoypadButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventJoypadButton = InputEventJoypadButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventJoypadButton = InputEventJoypadButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventJoypadButton = fromVariant(InputEventJoypadButton(""), other)


        // Constants


    }


    // Properties
    open var buttonIndex: Long
        get() = _icall_Long(getButtonIndexMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setButtonIndexMethodBind, this.rawMemory, value)


    open var pressure: Double
        get() = _icall_Double(getPressureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPressureMethodBind, this.rawMemory, value)


    open var pressed: Boolean
        get() = throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
        set(value) = _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, value)




    // Methods
    private val setButtonIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadButton", "set_button_index") }
    open fun setButtonIndex(buttonIndex: Long) {
        _icall_Unit_Long(setButtonIndexMethodBind, this.rawMemory, buttonIndex)
    }


    private val getButtonIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadButton", "get_button_index") }
    open fun getButtonIndex(): Long {
        return _icall_Long(getButtonIndexMethodBind, this.rawMemory)
    }


    private val setPressureMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadButton", "set_pressure") }
    open fun setPressure(pressure: Double) {
        _icall_Unit_Double(setPressureMethodBind, this.rawMemory, pressure)
    }


    private val getPressureMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadButton", "get_pressure") }
    open fun getPressure(): Double {
        return _icall_Double(getPressureMethodBind, this.rawMemory)
    }


    private val setPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadButton", "set_pressed") }
    open fun setPressed(pressed: Boolean) {
        _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, pressed)
    }


}
