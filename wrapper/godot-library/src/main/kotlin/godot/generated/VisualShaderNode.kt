@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNode : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val EDITOR_REFRESH_REQUEST: String = "editor_refresh_request"
        }
    }


    companion object {
        infix fun from(other: Resource): VisualShaderNode = VisualShaderNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNode = VisualShaderNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNode = VisualShaderNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNode = fromVariant(VisualShaderNode(""), other)


        // Constants


    }


    // Properties
    open var outputPortForPreview: Long
        get() = _icall_Long(getOutputPortForPreviewMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOutputPortForPreviewMethodBind, this.rawMemory, value)




    // Methods
    private val setOutputPortForPreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNode", "set_output_port_for_preview") }
    open fun setOutputPortForPreview(port: Long) {
        _icall_Unit_Long(setOutputPortForPreviewMethodBind, this.rawMemory, port)
    }


    private val getOutputPortForPreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNode", "get_output_port_for_preview") }
    open fun getOutputPortForPreview(): Long {
        return _icall_Long(getOutputPortForPreviewMethodBind, this.rawMemory)
    }


    private val setInputPortDefaultValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNode", "set_input_port_default_value") }
    open fun setInputPortDefaultValue(port: Long, value: Variant) {
        _icall_Unit_Long_Variant(setInputPortDefaultValueMethodBind, this.rawMemory, port, value)
    }


    private val getInputPortDefaultValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNode", "get_input_port_default_value") }
    open fun getInputPortDefaultValue(port: Long): Variant {
        return _icall_Variant_Long(getInputPortDefaultValueMethodBind, this.rawMemory, port)
    }


    open fun _set_default_input_values(values: GDArray) {
    }


    open fun _get_default_input_values(): GDArray {
        throw NotImplementedError("_get_default_input_values is not implemented for VisualShaderNode")
    }


}
