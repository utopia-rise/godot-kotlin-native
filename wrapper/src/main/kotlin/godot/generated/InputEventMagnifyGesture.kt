@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventMagnifyGesture : InputEventGesture {
    constructor() : super("InputEventMagnifyGesture")
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
        infix fun from(other: InputEventGesture): InputEventMagnifyGesture = InputEventMagnifyGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEventWithModifiers): InputEventMagnifyGesture = InputEventMagnifyGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventMagnifyGesture = InputEventMagnifyGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventMagnifyGesture = InputEventMagnifyGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventMagnifyGesture = InputEventMagnifyGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventMagnifyGesture = InputEventMagnifyGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventMagnifyGesture = fromVariant(InputEventMagnifyGesture(""), other)


        // Constants


    }


    // Properties
    open var factor: Float
        get() = _icall_Float(getFactorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFactorMethodBind, this.rawMemory, value)




    // Methods
    private val setFactorMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMagnifyGesture", "set_factor") }
    open fun setFactor(factor: Float) {
        _icall_Unit_Float(setFactorMethodBind, this.rawMemory, factor)
    }


    private val getFactorMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMagnifyGesture", "get_factor") }
    open fun getFactor(): Float {
        return _icall_Float(getFactorMethodBind, this.rawMemory)
    }


}
