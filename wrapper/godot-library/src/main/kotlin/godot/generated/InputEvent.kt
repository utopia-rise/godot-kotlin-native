@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEvent : Resource {
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
        infix fun from(other: Resource): InputEvent = InputEvent("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEvent = InputEvent("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEvent = InputEvent("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEvent = fromVariant(InputEvent(""), other)


        // Constants


    }


    // Properties
    open var device: Long
        get() = _icall_Long(getDeviceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDeviceMethodBind, this.rawMemory, value)




    // Methods
    private val setDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "set_device") }
    open fun setDevice(device: Long) {
        _icall_Unit_Long(setDeviceMethodBind, this.rawMemory, device)
    }


    private val getDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "get_device") }
    open fun getDevice(): Long {
        return _icall_Long(getDeviceMethodBind, this.rawMemory)
    }


    private val isActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "is_action") }
    open fun isAction(action: String): Boolean {
        return _icall_Boolean_String(isActionMethodBind, this.rawMemory, action)
    }


    private val isActionPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "is_action_pressed") }
    open fun isActionPressed(action: String): Boolean {
        return _icall_Boolean_String(isActionPressedMethodBind, this.rawMemory, action)
    }


    private val isActionReleasedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "is_action_released") }
    open fun isActionReleased(action: String): Boolean {
        return _icall_Boolean_String(isActionReleasedMethodBind, this.rawMemory, action)
    }


    private val getActionStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "get_action_strength") }
    open fun getActionStrength(action: String): Double {
        return _icall_Double_String(getActionStrengthMethodBind, this.rawMemory, action)
    }


    private val isPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "is_pressed") }
    open fun isPressed(): Boolean {
        return _icall_Boolean(isPressedMethodBind, this.rawMemory)
    }


    private val isEchoMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "is_echo") }
    open fun isEcho(): Boolean {
        return _icall_Boolean(isEchoMethodBind, this.rawMemory)
    }


    private val asTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "as_text") }
    open fun asText(): String {
        return _icall_String(asTextMethodBind, this.rawMemory)
    }


    private val shortcutMatchMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "shortcut_match") }
    open fun shortcutMatch(event: InputEvent): Boolean {
        return _icall_Boolean_Object(shortcutMatchMethodBind, this.rawMemory, event)
    }


    private val isActionTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "is_action_type") }
    open fun isActionType(): Boolean {
        return _icall_Boolean(isActionTypeMethodBind, this.rawMemory)
    }


    private val xformedByMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEvent", "xformed_by") }
    open fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0, 0)): InputEvent {
        return _icall_InputEvent_Transform2D_Vector2(xformedByMethodBind, this.rawMemory, xform, localOfs)
    }


}
