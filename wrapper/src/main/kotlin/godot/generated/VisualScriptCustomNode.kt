@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptCustomNode : VisualScriptNode {
    constructor() : super("VisualScriptCustomNode")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class StartMode(val id: Int) {
        START_MODE_BEGIN_SEQUENCE(0),
        START_MODE_CONTINUE_SEQUENCE(1),
        START_MODE_RESUME_YIELD(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisualScriptNode): VisualScriptCustomNode = VisualScriptCustomNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptCustomNode = VisualScriptCustomNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptCustomNode = VisualScriptCustomNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptCustomNode = VisualScriptCustomNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptCustomNode = fromVariant(VisualScriptCustomNode(""), other)


        // Constants
        const val START_MODE_BEGIN_SEQUENCE: Int = 0
        const val START_MODE_CONTINUE_SEQUENCE: Int = 1
        const val START_MODE_RESUME_YIELD: Int = 2
        const val STEP_PUSH_STACK_BIT: Int = 16777216
        const val STEP_GO_BACK_BIT: Int = 33554432
        const val STEP_NO_ADVANCE_BIT: Int = 67108864
        const val STEP_EXIT_FUNCTION_BIT: Int = 134217728
        const val STEP_YIELD_BIT: Int = 268435456


    }


    // Properties


    // Methods
    open fun _get_output_sequence_port_count(): Int {
        throw NotImplementedError("_get_output_sequence_port_count is not implemented for VisualScriptCustomNode")
    }


    open fun _has_input_sequence_port(): Boolean {
        throw NotImplementedError("_has_input_sequence_port is not implemented for VisualScriptCustomNode")
    }


    open fun _get_output_sequence_port_text(idx: Int): String {
        throw NotImplementedError("_get_output_sequence_port_text is not implemented for VisualScriptCustomNode")
    }


    open fun _get_input_value_port_count(): Int {
        throw NotImplementedError("_get_input_value_port_count is not implemented for VisualScriptCustomNode")
    }


    open fun _get_output_value_port_count(): Int {
        throw NotImplementedError("_get_output_value_port_count is not implemented for VisualScriptCustomNode")
    }


    open fun _get_input_value_port_type(idx: Int): Int {
        throw NotImplementedError("_get_input_value_port_type is not implemented for VisualScriptCustomNode")
    }


    open fun _get_input_value_port_name(idx: Int): String {
        throw NotImplementedError("_get_input_value_port_name is not implemented for VisualScriptCustomNode")
    }


    open fun _get_output_value_port_type(idx: Int): Int {
        throw NotImplementedError("_get_output_value_port_type is not implemented for VisualScriptCustomNode")
    }


    open fun _get_output_value_port_name(idx: Int): String {
        throw NotImplementedError("_get_output_value_port_name is not implemented for VisualScriptCustomNode")
    }


    open fun _get_caption(): String {
        throw NotImplementedError("_get_caption is not implemented for VisualScriptCustomNode")
    }


    open fun _get_text(): String {
        throw NotImplementedError("_get_text is not implemented for VisualScriptCustomNode")
    }


    open fun _get_category(): String {
        throw NotImplementedError("_get_category is not implemented for VisualScriptCustomNode")
    }


    open fun _get_working_memory_size(): Int {
        throw NotImplementedError("_get_working_memory_size is not implemented for VisualScriptCustomNode")
    }


    open fun _step(inputs: GDArray, outputs: GDArray, startMode: Int, workingMem: GDArray): Variant {
        throw NotImplementedError("_step is not implemented for VisualScriptCustomNode")
    }


    open fun _script_changed() {
    }


}
