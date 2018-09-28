@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptEmitSignal : VisualScriptNode {
    constructor() : super("VisualScriptEmitSignal")
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
        infix fun from(other: VisualScriptNode): VisualScriptEmitSignal = VisualScriptEmitSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptEmitSignal = VisualScriptEmitSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptEmitSignal = VisualScriptEmitSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptEmitSignal = VisualScriptEmitSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptEmitSignal = fromVariant(VisualScriptEmitSignal(""), other)


        // Constants


    }


    // Properties
    open var signal: String
        get() = _icall_String(getSignalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSignalMethodBind, this.rawMemory, value)




    // Methods
    private val setSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptEmitSignal", "set_signal") }
    open fun setSignal(name: String) {
        _icall_Unit_String(setSignalMethodBind, this.rawMemory, name)
    }


    private val getSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptEmitSignal", "get_signal") }
    open fun getSignal(): String {
        return _icall_String(getSignalMethodBind, this.rawMemory)
    }


}
