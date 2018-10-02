@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptNode : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val PORTS_CHANGED: String = "ports_changed"
        }
    }


    companion object {
        infix fun from(other: Resource): VisualScriptNode = VisualScriptNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptNode = VisualScriptNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptNode = VisualScriptNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptNode = fromVariant(VisualScriptNode(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getVisualScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptNode", "get_visual_script") }
    open fun getVisualScript(): VisualScript {
        return _icall_VisualScript(getVisualScriptMethodBind, this.rawMemory)
    }


    private val setDefaultInputValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptNode", "set_default_input_value") }
    open fun setDefaultInputValue(portIdx: Long, value: Variant) {
        _icall_Unit_Long_Variant(setDefaultInputValueMethodBind, this.rawMemory, portIdx, value)
    }


    private val getDefaultInputValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptNode", "get_default_input_value") }
    open fun getDefaultInputValue(portIdx: Long): Variant {
        return _icall_Variant_Long(getDefaultInputValueMethodBind, this.rawMemory, portIdx)
    }


    private val portsChangedNotifyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptNode", "ports_changed_notify") }
    open fun portsChangedNotify() {
        _icall_Unit(portsChangedNotifyMethodBind, this.rawMemory)
    }


    open fun _set_default_input_values(values: GDArray) {
    }


    open fun _get_default_input_values(): GDArray {
        throw NotImplementedError("_get_default_input_values is not implemented for VisualScriptNode")
    }


}
