@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventPanGesture : InputEventGesture {
    constructor() : super("InputEventPanGesture")
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
        infix fun from(other: InputEventGesture): InputEventPanGesture = InputEventPanGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEventWithModifiers): InputEventPanGesture = InputEventPanGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventPanGesture = InputEventPanGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventPanGesture = InputEventPanGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventPanGesture = InputEventPanGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventPanGesture = InputEventPanGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventPanGesture = fromVariant(InputEventPanGesture(""), other)


        // Constants


    }


    // Properties
    open var delta: Vector2
        get() = _icall_Vector2(getDeltaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setDeltaMethodBind, this.rawMemory, value)
    open fun delta(shedule: (Vector2) -> Unit): Vector2 = delta.apply {
        shedule(this)
        delta = this
    }




    // Methods
    private val setDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventPanGesture", "set_delta") }
    open fun setDelta(delta: Vector2) {
        _icall_Unit_Vector2(setDeltaMethodBind, this.rawMemory, delta)
    }


    private val getDeltaMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventPanGesture", "get_delta") }
    open fun getDelta(): Vector2 {
        return _icall_Vector2(getDeltaMethodBind, this.rawMemory)
    }


}
