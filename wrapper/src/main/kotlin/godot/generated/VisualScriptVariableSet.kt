@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptVariableSet : VisualScriptNode {
    constructor() : super("VisualScriptVariableSet")
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
        infix fun from(other: VisualScriptNode): VisualScriptVariableSet = VisualScriptVariableSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptVariableSet = VisualScriptVariableSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptVariableSet = VisualScriptVariableSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptVariableSet = VisualScriptVariableSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptVariableSet = fromVariant(VisualScriptVariableSet(""), other)


        // Constants


    }


    // Properties
    open var varName: String
        get() = _icall_String(getVariableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setVariableMethodBind, this.rawMemory, value)




    // Methods
    private val setVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptVariableSet", "set_variable") }
    open fun setVariable(name: String) {
        _icall_Unit_String(setVariableMethodBind, this.rawMemory, name)
    }


    private val getVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptVariableSet", "get_variable") }
    open fun getVariable(): String {
        return _icall_String(getVariableMethodBind, this.rawMemory)
    }


}
