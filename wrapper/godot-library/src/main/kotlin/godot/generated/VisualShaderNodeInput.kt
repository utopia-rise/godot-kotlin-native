@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeInput : VisualShaderNode {
    constructor() : super("VisualShaderNodeInput")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val INPUT_TYPE_CHANGED: String = "input_type_changed"
        }
    }


    companion object {
        infix fun from(other: VisualShaderNode): VisualShaderNodeInput = VisualShaderNodeInput("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeInput = VisualShaderNodeInput("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeInput = VisualShaderNodeInput("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeInput = VisualShaderNodeInput("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeInput = fromVariant(VisualShaderNodeInput(""), other)


        // Constants


    }


    // Properties
    open var inputName: String
        get() = _icall_String(getInputNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setInputNameMethodBind, this.rawMemory, value)




    // Methods
    private val setInputNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeInput", "set_input_name") }
    open fun setInputName(name: String) {
        _icall_Unit_String(setInputNameMethodBind, this.rawMemory, name)
    }


    private val getInputNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeInput", "get_input_name") }
    open fun getInputName(): String {
        return _icall_String(getInputNameMethodBind, this.rawMemory)
    }


}
