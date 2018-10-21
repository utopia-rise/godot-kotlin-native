@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptSequence : VisualScriptNode {
    constructor() : super("VisualScriptSequence")
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
        infix fun from(other: VisualScriptNode): VisualScriptSequence = VisualScriptSequence("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptSequence = VisualScriptSequence("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptSequence = VisualScriptSequence("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptSequence = VisualScriptSequence("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptSequence = fromVariant(VisualScriptSequence(""), other)


        // Constants


    }


    // Properties
    open var steps: Long
        get() = _icall_Long(getStepsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setStepsMethodBind, this.rawMemory, value)




    // Methods
    private val setStepsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptSequence", "set_steps") }
    open fun setSteps(steps: Long) {
        _icall_Unit_Long(setStepsMethodBind, this.rawMemory, steps)
    }


    private val getStepsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptSequence", "get_steps") }
    open fun getSteps(): Long {
        return _icall_Long(getStepsMethodBind, this.rawMemory)
    }


}
