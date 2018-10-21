@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventWithModifiers : InputEvent {
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
        infix fun from(other: InputEvent): InputEventWithModifiers = InputEventWithModifiers("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventWithModifiers = InputEventWithModifiers("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventWithModifiers = InputEventWithModifiers("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventWithModifiers = InputEventWithModifiers("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventWithModifiers = fromVariant(InputEventWithModifiers(""), other)


        // Constants


    }


    // Properties
    open var alt: Boolean
        get() = _icall_Boolean(getAltMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAltMethodBind, this.rawMemory, value)


    open var shift: Boolean
        get() = _icall_Boolean(getShiftMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShiftMethodBind, this.rawMemory, value)


    open var control: Boolean
        get() = _icall_Boolean(getControlMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setControlMethodBind, this.rawMemory, value)


    open var meta: Boolean
        get() = _icall_Boolean(getMetakeyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setMetakeyMethodBind, this.rawMemory, value)


    open var command: Boolean
        get() = _icall_Boolean(getCommandMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCommandMethodBind, this.rawMemory, value)




    // Methods
    private val setAltMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "set_alt") }
    open fun setAlt(enable: Boolean) {
        _icall_Unit_Boolean(setAltMethodBind, this.rawMemory, enable)
    }


    private val getAltMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "get_alt") }
    open fun getAlt(): Boolean {
        return _icall_Boolean(getAltMethodBind, this.rawMemory)
    }


    private val setShiftMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "set_shift") }
    open fun setShift(enable: Boolean) {
        _icall_Unit_Boolean(setShiftMethodBind, this.rawMemory, enable)
    }


    private val getShiftMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "get_shift") }
    open fun getShift(): Boolean {
        return _icall_Boolean(getShiftMethodBind, this.rawMemory)
    }


    private val setControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "set_control") }
    open fun setControl(enable: Boolean) {
        _icall_Unit_Boolean(setControlMethodBind, this.rawMemory, enable)
    }


    private val getControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "get_control") }
    open fun getControl(): Boolean {
        return _icall_Boolean(getControlMethodBind, this.rawMemory)
    }


    private val setMetakeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "set_metakey") }
    open fun setMetakey(enable: Boolean) {
        _icall_Unit_Boolean(setMetakeyMethodBind, this.rawMemory, enable)
    }


    private val getMetakeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "get_metakey") }
    open fun getMetakey(): Boolean {
        return _icall_Boolean(getMetakeyMethodBind, this.rawMemory)
    }


    private val setCommandMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "set_command") }
    open fun setCommand(enable: Boolean) {
        _icall_Unit_Boolean(setCommandMethodBind, this.rawMemory, enable)
    }


    private val getCommandMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventWithModifiers", "get_command") }
    open fun getCommand(): Boolean {
        return _icall_Boolean(getCommandMethodBind, this.rawMemory)
    }


}
