@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventScreenTouch : InputEvent {
    constructor() : super("InputEventScreenTouch")
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
        infix fun from(other: InputEvent): InputEventScreenTouch = InputEventScreenTouch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventScreenTouch = InputEventScreenTouch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventScreenTouch = InputEventScreenTouch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventScreenTouch = InputEventScreenTouch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventScreenTouch = fromVariant(InputEventScreenTouch(""), other)


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


    open var pressed: Boolean
        get() = throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
        set(value) = _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, value)




    // Methods
    private val setIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenTouch", "set_index") }
    open fun setIndex(index: Long) {
        _icall_Unit_Long(setIndexMethodBind, this.rawMemory, index)
    }


    private val getIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenTouch", "get_index") }
    open fun getIndex(): Long {
        return _icall_Long(getIndexMethodBind, this.rawMemory)
    }


    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenTouch", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenTouch", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    private val setPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventScreenTouch", "set_pressed") }
    open fun setPressed(pressed: Boolean) {
        _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, pressed)
    }


}
