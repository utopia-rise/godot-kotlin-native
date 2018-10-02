@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputMap : Object {
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


    @ThreadLocal    companion object {
        infix fun from(other: Object): InputMap = InputMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputMap = fromVariant(InputMap(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("InputMap", "InputMap") }


        // Properties


        // Methods
        private val hasActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "has_action") }
        fun hasAction(action: String): Boolean {
            return _icall_Boolean_String(hasActionMethodBind, this.rawMemory, action)
        }


        private val getActionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "get_actions") }
        fun getActions(): GDArray {
            return _icall_GDArray(getActionsMethodBind, this.rawMemory)
        }


        private val addActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "add_action") }
        fun addAction(action: String, deadzone: Float = 0.5f) {
            _icall_Unit_String_Float(addActionMethodBind, this.rawMemory, action, deadzone)
        }


        private val eraseActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "erase_action") }
        fun eraseAction(action: String) {
            _icall_Unit_String(eraseActionMethodBind, this.rawMemory, action)
        }


        private val actionSetDeadzoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "action_set_deadzone") }
        fun actionSetDeadzone(deadzone: String, arg1: Float) {
            _icall_Unit_String_Float(actionSetDeadzoneMethodBind, this.rawMemory, deadzone, arg1)
        }


        private val actionAddEventMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "action_add_event") }
        fun actionAddEvent(action: String, event: InputEvent) {
            _icall_Unit_String_Object(actionAddEventMethodBind, this.rawMemory, action, event)
        }


        private val actionHasEventMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "action_has_event") }
        fun actionHasEvent(action: String, event: InputEvent): Boolean {
            return _icall_Boolean_String_Object(actionHasEventMethodBind, this.rawMemory, action, event)
        }


        private val actionEraseEventMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "action_erase_event") }
        fun actionEraseEvent(action: String, event: InputEvent) {
            _icall_Unit_String_Object(actionEraseEventMethodBind, this.rawMemory, action, event)
        }


        private val actionEraseEventsMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "action_erase_events") }
        fun actionEraseEvents(action: String) {
            _icall_Unit_String(actionEraseEventsMethodBind, this.rawMemory, action)
        }


        private val getActionListMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "get_action_list") }
        fun getActionList(action: String): GDArray {
            return _icall_GDArray_String(getActionListMethodBind, this.rawMemory, action)
        }


        private val eventIsActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "event_is_action") }
        fun eventIsAction(event: InputEvent, action: String): Boolean {
            return _icall_Boolean_Object_String(eventIsActionMethodBind, this.rawMemory, event, action)
        }


        private val loadFromGlobalsMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputMap", "load_from_globals") }
        fun loadFromGlobals() {
            _icall_Unit(loadFromGlobalsMethodBind, this.rawMemory)
        }


    }
}
