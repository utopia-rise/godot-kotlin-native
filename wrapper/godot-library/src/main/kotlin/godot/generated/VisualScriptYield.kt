@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptYield : VisualScriptNode {
    constructor() : super("VisualScriptYield")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class YieldMode(val id: Long) {
        YIELD_FRAME(1),
        YIELD_PHYSICS_FRAME(2),
        YIELD_WAIT(3),
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
        infix fun from(other: VisualScriptNode): VisualScriptYield = VisualScriptYield("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptYield = VisualScriptYield("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptYield = VisualScriptYield("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptYield = VisualScriptYield("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptYield = fromVariant(VisualScriptYield(""), other)


        // Constants
        const val YIELD_FRAME: Long = 1
        const val YIELD_PHYSICS_FRAME: Long = 2
        const val YIELD_WAIT: Long = 3


    }


    // Properties
    open var mode: Long
        get() = _icall_Long(getYieldModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setYieldModeMethodBind, this.rawMemory, value)


    open var waitTime: Double
        get() = _icall_Double(getWaitTimeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setWaitTimeMethodBind, this.rawMemory, value)




    // Methods
    private val setYieldModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYield", "set_yield_mode") }
    open fun setYieldMode(mode: Long) {
        _icall_Unit_Long(setYieldModeMethodBind, this.rawMemory, mode)
    }


    private val getYieldModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYield", "get_yield_mode") }
    open fun getYieldMode(): VisualScriptYield.YieldMode {
        return VisualScriptYield.YieldMode.fromInt(_icall_Long(getYieldModeMethodBind, this.rawMemory))
    }


    private val setWaitTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYield", "set_wait_time") }
    open fun setWaitTime(sec: Double) {
        _icall_Unit_Double(setWaitTimeMethodBind, this.rawMemory, sec)
    }


    private val getWaitTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYield", "get_wait_time") }
    open fun getWaitTime(): Double {
        return _icall_Double(getWaitTimeMethodBind, this.rawMemory)
    }


}
