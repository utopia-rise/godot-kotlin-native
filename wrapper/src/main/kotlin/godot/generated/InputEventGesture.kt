@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventGesture : InputEventWithModifiers {
    private constructor() : super("")
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
        infix fun from(other: InputEventWithModifiers): InputEventGesture = InputEventGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventGesture = InputEventGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventGesture = InputEventGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventGesture = InputEventGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventGesture = InputEventGesture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventGesture = fromVariant(InputEventGesture(""), other)


        // Constants


    }


    // Properties
    open var position: Vector2
        get() = _icall_Vector2(getPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, value)
    open fun position(shedule: (Vector2) -> Unit): Vector2 = position.apply {
        shedule(this)
        position = this
    }




    // Methods
    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventGesture", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventGesture", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


}
