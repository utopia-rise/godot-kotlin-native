@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptInputAction : VisualScriptNode {
    constructor() : super("VisualScriptInputAction")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Long) {
        MODE_PRESSED(0),
        MODE_RELEASED(1),
        MODE_JUST_PRESSED(2),
        MODE_JUST_RELEASED(3),
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
        infix fun from(other: VisualScriptNode): VisualScriptInputAction = VisualScriptInputAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptInputAction = VisualScriptInputAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptInputAction = VisualScriptInputAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptInputAction = VisualScriptInputAction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptInputAction = fromVariant(VisualScriptInputAction(""), other)


        // Constants
        const val MODE_PRESSED: Long = 0
        const val MODE_RELEASED: Long = 1
        const val MODE_JUST_PRESSED: Long = 2
        const val MODE_JUST_RELEASED: Long = 3


    }


    // Properties
    open var action: String
        get() = _icall_String(getActionNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setActionNameMethodBind, this.rawMemory, value)


    open var mode: Long
        get() = _icall_Long(getActionModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setActionModeMethodBind, this.rawMemory, value)




    // Methods
    private val setActionNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptInputAction", "set_action_name") }
    open fun setActionName(name: String) {
        _icall_Unit_String(setActionNameMethodBind, this.rawMemory, name)
    }


    private val getActionNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptInputAction", "get_action_name") }
    open fun getActionName(): String {
        return _icall_String(getActionNameMethodBind, this.rawMemory)
    }


    private val setActionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptInputAction", "set_action_mode") }
    open fun setActionMode(mode: Long) {
        _icall_Unit_Long(setActionModeMethodBind, this.rawMemory, mode)
    }


    private val getActionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptInputAction", "get_action_mode") }
    open fun getActionMode(): VisualScriptInputAction.Mode {
        return VisualScriptInputAction.Mode.fromInt(_icall_Long(getActionModeMethodBind, this.rawMemory))
    }


}
