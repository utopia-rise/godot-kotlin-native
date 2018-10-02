@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventMouseButton : InputEventMouse {
    constructor() : super("InputEventMouseButton")
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
        infix fun from(other: InputEventMouse): InputEventMouseButton = InputEventMouseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEventWithModifiers): InputEventMouseButton = InputEventMouseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventMouseButton = InputEventMouseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventMouseButton = InputEventMouseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventMouseButton = InputEventMouseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventMouseButton = InputEventMouseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventMouseButton = fromVariant(InputEventMouseButton(""), other)


        // Constants


    }


    // Properties
    open var factor: Float
        get() = _icall_Float(getFactorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFactorMethodBind, this.rawMemory, value)


    open var buttonIndex: Int
        get() = _icall_Int(getButtonIndexMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setButtonIndexMethodBind, this.rawMemory, value)


    open var pressed: Boolean
        get() = throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
        set(value) = _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, value)


    open var doubleclick: Boolean
        get() = _icall_Boolean(isDoubleclickMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDoubleclickMethodBind, this.rawMemory, value)




    // Methods
    private val setFactorMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "set_factor") }
    open fun setFactor(factor: Float) {
        _icall_Unit_Float(setFactorMethodBind, this.rawMemory, factor)
    }


    private val getFactorMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "get_factor") }
    open fun getFactor(): Float {
        return _icall_Float(getFactorMethodBind, this.rawMemory)
    }


    private val setButtonIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "set_button_index") }
    open fun setButtonIndex(buttonIndex: Int) {
        _icall_Unit_Int(setButtonIndexMethodBind, this.rawMemory, buttonIndex)
    }


    private val getButtonIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "get_button_index") }
    open fun getButtonIndex(): Int {
        return _icall_Int(getButtonIndexMethodBind, this.rawMemory)
    }


    private val setPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "set_pressed") }
    open fun setPressed(pressed: Boolean) {
        _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, pressed)
    }


    private val setDoubleclickMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "set_doubleclick") }
    open fun setDoubleclick(doubleclick: Boolean) {
        _icall_Unit_Boolean(setDoubleclickMethodBind, this.rawMemory, doubleclick)
    }


    private val isDoubleclickMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseButton", "is_doubleclick") }
    open fun isDoubleclick(): Boolean {
        return _icall_Boolean(isDoubleclickMethodBind, this.rawMemory)
    }


}
