@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventMouse : InputEventWithModifiers {
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
        infix fun from(other: InputEventWithModifiers): InputEventMouse = InputEventMouse("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventMouse = InputEventMouse("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventMouse = InputEventMouse("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventMouse = InputEventMouse("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventMouse = InputEventMouse("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventMouse = fromVariant(InputEventMouse(""), other)


        // Constants


    }


    // Properties
    open var buttonMask: Long
        get() = _icall_Long(getButtonMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setButtonMaskMethodBind, this.rawMemory, value)


    open var position: Vector2
        get() = _icall_Vector2(getPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, value)
    open fun position(shedule: (Vector2) -> Unit): Vector2 = position.apply {
        shedule(this)
        position = this
    }


    open var globalPosition: Vector2
        get() = _icall_Vector2(getGlobalPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setGlobalPositionMethodBind, this.rawMemory, value)
    open fun globalPosition(shedule: (Vector2) -> Unit): Vector2 = globalPosition.apply {
        shedule(this)
        globalPosition = this
    }




    // Methods
    private val setButtonMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouse", "set_button_mask") }
    open fun setButtonMask(buttonMask: Long) {
        _icall_Unit_Long(setButtonMaskMethodBind, this.rawMemory, buttonMask)
    }


    private val getButtonMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouse", "get_button_mask") }
    open fun getButtonMask(): Long {
        return _icall_Long(getButtonMaskMethodBind, this.rawMemory)
    }


    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouse", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouse", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    private val setGlobalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouse", "set_global_position") }
    open fun setGlobalPosition(globalPosition: Vector2) {
        _icall_Unit_Vector2(setGlobalPositionMethodBind, this.rawMemory, globalPosition)
    }


    private val getGlobalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouse", "get_global_position") }
    open fun getGlobalPosition(): Vector2 {
        return _icall_Vector2(getGlobalPositionMethodBind, this.rawMemory)
    }


}
