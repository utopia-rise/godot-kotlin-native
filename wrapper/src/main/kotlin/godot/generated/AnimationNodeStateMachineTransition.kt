@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeStateMachineTransition : Resource {
    constructor() : super("AnimationNodeStateMachineTransition")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SwitchMode(val id: Long) {
        SWITCH_MODE_IMMEDIATE(0),
        SWITCH_MODE_SYNC(1),
        SWITCH_MODE_AT_END(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): AnimationNodeStateMachineTransition = AnimationNodeStateMachineTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeStateMachineTransition = AnimationNodeStateMachineTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeStateMachineTransition = AnimationNodeStateMachineTransition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeStateMachineTransition = fromVariant(AnimationNodeStateMachineTransition(""), other)


        // Constants
        const val SWITCH_MODE_IMMEDIATE: Long = 0
        const val SWITCH_MODE_SYNC: Long = 1
        const val SWITCH_MODE_AT_END: Long = 2


    }


    // Properties
    open var switchMode: Long
        get() = _icall_Long(getSwitchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSwitchModeMethodBind, this.rawMemory, value)


    open var autoAdvance: Boolean
        get() = _icall_Boolean(hasAutoAdvanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutoAdvanceMethodBind, this.rawMemory, value)


    open var xfadeTime: Double
        get() = _icall_Double(getXfadeTimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setXfadeTimeMethodBind, this.rawMemory, value)


    open var priority: Long
        get() = _icall_Long(getPriorityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setPriorityMethodBind, this.rawMemory, value)


    open var disabled: Boolean
        get() = _icall_Boolean(isDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, value)




    // Methods
    private val setSwitchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "set_switch_mode") }
    open fun setSwitchMode(mode: Long) {
        _icall_Unit_Long(setSwitchModeMethodBind, this.rawMemory, mode)
    }


    private val getSwitchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "get_switch_mode") }
    open fun getSwitchMode(): AnimationNodeStateMachineTransition.SwitchMode {
        return AnimationNodeStateMachineTransition.SwitchMode.fromInt(_icall_Long(getSwitchModeMethodBind, this.rawMemory))
    }


    private val setAutoAdvanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "set_auto_advance") }
    open fun setAutoAdvance(autoAdvance: Boolean) {
        _icall_Unit_Boolean(setAutoAdvanceMethodBind, this.rawMemory, autoAdvance)
    }


    private val hasAutoAdvanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "has_auto_advance") }
    open fun hasAutoAdvance(): Boolean {
        return _icall_Boolean(hasAutoAdvanceMethodBind, this.rawMemory)
    }


    private val setXfadeTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "set_xfade_time") }
    open fun setXfadeTime(secs: Double) {
        _icall_Unit_Double(setXfadeTimeMethodBind, this.rawMemory, secs)
    }


    private val getXfadeTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "get_xfade_time") }
    open fun getXfadeTime(): Double {
        return _icall_Double(getXfadeTimeMethodBind, this.rawMemory)
    }


    private val setDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "set_disabled") }
    open fun setDisabled(disabled: Boolean) {
        _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, disabled)
    }


    private val isDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "is_disabled") }
    open fun isDisabled(): Boolean {
        return _icall_Boolean(isDisabledMethodBind, this.rawMemory)
    }


    private val setPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "set_priority") }
    open fun setPriority(priority: Long) {
        _icall_Unit_Long(setPriorityMethodBind, this.rawMemory, priority)
    }


    private val getPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachineTransition", "get_priority") }
    open fun getPriority(): Long {
        return _icall_Long(getPriorityMethodBind, this.rawMemory)
    }


}
