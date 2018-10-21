@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptVariableGet : VisualScriptNode {
    constructor() : super("VisualScriptVariableGet")
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
        infix fun from(other: VisualScriptNode): VisualScriptVariableGet = VisualScriptVariableGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptVariableGet = VisualScriptVariableGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptVariableGet = VisualScriptVariableGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptVariableGet = VisualScriptVariableGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptVariableGet = fromVariant(VisualScriptVariableGet(""), other)


        // Constants


    }


    // Properties
    open var varName: String
        get() = _icall_String(getVariableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setVariableMethodBind, this.rawMemory, value)




    // Methods
    private val setVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptVariableGet", "set_variable") }
    open fun setVariable(name: String) {
        _icall_Unit_String(setVariableMethodBind, this.rawMemory, name)
    }


    private val getVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptVariableGet", "get_variable") }
    open fun getVariable(): String {
        return _icall_String(getVariableMethodBind, this.rawMemory)
    }


}
