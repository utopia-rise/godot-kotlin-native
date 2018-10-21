@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventMouseMotion : InputEventMouse {
    constructor() : super("InputEventMouseMotion")
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
        infix fun from(other: InputEventMouse): InputEventMouseMotion = InputEventMouseMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEventWithModifiers): InputEventMouseMotion = InputEventMouseMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventMouseMotion = InputEventMouseMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventMouseMotion = InputEventMouseMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventMouseMotion = InputEventMouseMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventMouseMotion = InputEventMouseMotion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventMouseMotion = fromVariant(InputEventMouseMotion(""), other)


        // Constants


    }


    // Properties
    open var relative: Vector2
        get() = _icall_Vector2(getRelativeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setRelativeMethodBind, this.rawMemory, value)
    open fun relative(shedule: (Vector2) -> Unit): Vector2 = relative.apply {
        shedule(this)
        relative = this
    }


    open var speed: Vector2
        get() = _icall_Vector2(getSpeedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setSpeedMethodBind, this.rawMemory, value)
    open fun speed(shedule: (Vector2) -> Unit): Vector2 = speed.apply {
        shedule(this)
        speed = this
    }




    // Methods
    private val setRelativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseMotion", "set_relative") }
    open fun setRelative(relative: Vector2) {
        _icall_Unit_Vector2(setRelativeMethodBind, this.rawMemory, relative)
    }


    private val getRelativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseMotion", "get_relative") }
    open fun getRelative(): Vector2 {
        return _icall_Vector2(getRelativeMethodBind, this.rawMemory)
    }


    private val setSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseMotion", "set_speed") }
    open fun setSpeed(speed: Vector2) {
        _icall_Unit_Vector2(setSpeedMethodBind, this.rawMemory, speed)
    }


    private val getSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventMouseMotion", "get_speed") }
    open fun getSpeed(): Vector2 {
        return _icall_Vector2(getSpeedMethodBind, this.rawMemory)
    }


}
