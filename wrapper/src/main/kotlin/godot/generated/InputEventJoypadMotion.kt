@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventJoypadMotion : InputEvent {
    constructor() : super("InputEventJoypadMotion")
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
        infix fun from(other: InputEvent): InputEventJoypadMotion = InputEventJoypadMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventJoypadMotion = InputEventJoypadMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventJoypadMotion = InputEventJoypadMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventJoypadMotion = InputEventJoypadMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventJoypadMotion = fromVariant(InputEventJoypadMotion(""), other)


        // Constants


    }


    // Properties
    open var axis: Int
        get() = _icall_Int(getAxisMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAxisMethodBind, this.rawMemory, value)


    open var axisValue: Float
        get() = _icall_Float(getAxisValueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAxisValueMethodBind, this.rawMemory, value)




    // Methods
    private val setAxisMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadMotion", "set_axis") }
    open fun setAxis(axis: Int) {
        _icall_Unit_Int(setAxisMethodBind, this.rawMemory, axis)
    }


    private val getAxisMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadMotion", "get_axis") }
    open fun getAxis(): Int {
        return _icall_Int(getAxisMethodBind, this.rawMemory)
    }


    private val setAxisValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadMotion", "set_axis_value") }
    open fun setAxisValue(axisValue: Float) {
        _icall_Unit_Float(setAxisValueMethodBind, this.rawMemory, axisValue)
    }


    private val getAxisValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventJoypadMotion", "get_axis_value") }
    open fun getAxisValue(): Float {
        return _icall_Float(getAxisValueMethodBind, this.rawMemory)
    }


}
