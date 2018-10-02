@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventScreenDrag : InputEvent {
    constructor() : super("InputEventScreenDrag")
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
        infix fun from(other: InputEvent): InputEventScreenDrag = InputEventScreenDrag("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventScreenDrag = InputEventScreenDrag("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventScreenDrag = InputEventScreenDrag("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventScreenDrag = InputEventScreenDrag("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventScreenDrag = fromVariant(InputEventScreenDrag(""), other)


        // Constants


    }


    // Properties
    open var index: Long
        get() = _icall_Long(getIndexMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setIndexMethodBind, this.rawMemory, value)


    open var position: Vector2
        get() = _icall_Vector2(getPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, value)
    open fun position(shedule: (Vector2) -> Unit): Vector2 = position.apply {
        shedule(this)
        position = this
    }


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
    private val setIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "set_index") }
    open fun setIndex(index: Long) {
        _icall_Unit_Long(setIndexMethodBind, this.rawMemory, index)
    }


    private val getIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "get_index") }
    open fun getIndex(): Long {
        return _icall_Long(getIndexMethodBind, this.rawMemory)
    }


    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    private val setRelativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "set_relative") }
    open fun setRelative(relative: Vector2) {
        _icall_Unit_Vector2(setRelativeMethodBind, this.rawMemory, relative)
    }


    private val getRelativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "get_relative") }
    open fun getRelative(): Vector2 {
        return _icall_Vector2(getRelativeMethodBind, this.rawMemory)
    }


    private val setSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "set_speed") }
    open fun setSpeed(speed: Vector2) {
        _icall_Unit_Vector2(setSpeedMethodBind, this.rawMemory, speed)
    }


    private val getSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenDrag", "get_speed") }
    open fun getSpeed(): Vector2 {
        return _icall_Vector2(getSpeedMethodBind, this.rawMemory)
    }


}
