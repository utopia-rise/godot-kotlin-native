@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SceneTreeTimer : Reference {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val TIMEOUT: String = "timeout"
        }
    }


    companion object {
        infix fun from(other: Reference): SceneTreeTimer = SceneTreeTimer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SceneTreeTimer = SceneTreeTimer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SceneTreeTimer = fromVariant(SceneTreeTimer(""), other)


        // Constants


    }


    // Properties
    open var timeLeft: Double
        get() = _icall_Double(getTimeLeftMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTimeLeftMethodBind, this.rawMemory, value)




    // Methods
    private val setTimeLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTreeTimer", "set_time_left") }
    open fun setTimeLeft(time: Double) {
        _icall_Unit_Double(setTimeLeftMethodBind, this.rawMemory, time)
    }


    private val getTimeLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTreeTimer", "get_time_left") }
    open fun getTimeLeft(): Double {
        return _icall_Double(getTimeLeftMethodBind, this.rawMemory)
    }


}
