@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScript : Script {
    constructor() : super("VisualScript")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val NODE_PORTS_CHANGED: String = "node_ports_changed"
        }
    }


    companion object {
        infix fun from(other: Script): VisualScript = VisualScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScript = VisualScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScript = VisualScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScript = VisualScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScript = fromVariant(VisualScript(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _node_ports_changed(arg0: Long) {
    }


    private val addFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "add_function") }
    open fun addFunction(name: String) {
        _icall_Unit_String(addFunctionMethodBind, this.rawMemory, name)
    }


    private val hasFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "has_function") }
    open fun hasFunction(name: String): Boolean {
        return _icall_Boolean_String(hasFunctionMethodBind, this.rawMemory, name)
    }


    private val removeFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "remove_function") }
    open fun removeFunction(name: String) {
        _icall_Unit_String(removeFunctionMethodBind, this.rawMemory, name)
    }


    private val renameFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "rename_function") }
    open fun renameFunction(name: String, newName: String) {
        _icall_Unit_String_String(renameFunctionMethodBind, this.rawMemory, name, newName)
    }


    private val setFunctionScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "set_function_scroll") }
    open fun setFunctionScroll(name: String, ofs: Vector2) {
        _icall_Unit_String_Vector2(setFunctionScrollMethodBind, this.rawMemory, name, ofs)
    }


    private val getFunctionScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_function_scroll") }
    open fun getFunctionScroll(name: String): Vector2 {
        return _icall_Vector2_String(getFunctionScrollMethodBind, this.rawMemory, name)
    }


    private val addNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "add_node") }
    open fun addNode(func: String, id: Long, node: VisualScriptNode, position: Vector2 = Vector2(0, 0)) {
        _icall_Unit_String_Long_Object_Vector2(addNodeMethodBind, this.rawMemory, func, id, node, position)
    }


    private val removeNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "remove_node") }
    open fun removeNode(func: String, id: Long) {
        _icall_Unit_String_Long(removeNodeMethodBind, this.rawMemory, func, id)
    }


    private val getFunctionNodeIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_function_node_id") }
    open fun getFunctionNodeId(name: String): Long {
        return _icall_Long_String(getFunctionNodeIdMethodBind, this.rawMemory, name)
    }


    private val getNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_node") }
    open fun getNode(func: String, id: Long): VisualScriptNode {
        return _icall_VisualScriptNode_String_Long(getNodeMethodBind, this.rawMemory, func, id)
    }


    private val hasNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "has_node") }
    open fun hasNode(func: String, id: Long): Boolean {
        return _icall_Boolean_String_Long(hasNodeMethodBind, this.rawMemory, func, id)
    }


    private val setNodePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "set_node_position") }
    open fun setNodePosition(func: String, id: Long, position: Vector2) {
        _icall_Unit_String_Long_Vector2(setNodePositionMethodBind, this.rawMemory, func, id, position)
    }


    private val getNodePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_node_position") }
    open fun getNodePosition(func: String, id: Long): Vector2 {
        return _icall_Vector2_String_Long(getNodePositionMethodBind, this.rawMemory, func, id)
    }


    private val sequenceConnectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "sequence_connect") }
    open fun sequenceConnect(func: String, fromNode: Long, fromOutput: Long, toNode: Long) {
        _icall_Unit_String_Long_Long_Long(sequenceConnectMethodBind, this.rawMemory, func, fromNode, fromOutput, toNode)
    }


    private val sequenceDisconnectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "sequence_disconnect") }
    open fun sequenceDisconnect(func: String, fromNode: Long, fromOutput: Long, toNode: Long) {
        _icall_Unit_String_Long_Long_Long(sequenceDisconnectMethodBind, this.rawMemory, func, fromNode, fromOutput, toNode)
    }


    private val hasSequenceConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "has_sequence_connection") }
    open fun hasSequenceConnection(func: String, fromNode: Long, fromOutput: Long, toNode: Long): Boolean {
        return _icall_Boolean_String_Long_Long_Long(hasSequenceConnectionMethodBind, this.rawMemory, func, fromNode, fromOutput, toNode)
    }


    private val dataConnectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "data_connect") }
    open fun dataConnect(func: String, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long) {
        _icall_Unit_String_Long_Long_Long_Long(dataConnectMethodBind, this.rawMemory, func, fromNode, fromPort, toNode, toPort)
    }


    private val dataDisconnectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "data_disconnect") }
    open fun dataDisconnect(func: String, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long) {
        _icall_Unit_String_Long_Long_Long_Long(dataDisconnectMethodBind, this.rawMemory, func, fromNode, fromPort, toNode, toPort)
    }


    private val hasDataConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "has_data_connection") }
    open fun hasDataConnection(func: String, fromNode: Long, fromPort: Long, toNode: Long, toPort: Long): Boolean {
        return _icall_Boolean_String_Long_Long_Long_Long(hasDataConnectionMethodBind, this.rawMemory, func, fromNode, fromPort, toNode, toPort)
    }


    private val addVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "add_variable") }
    open fun addVariable(name: String, defaultValue: Variant, export: Boolean = false) {
        _icall_Unit_String_Variant_Boolean(addVariableMethodBind, this.rawMemory, name, defaultValue, export)
    }


    private val hasVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "has_variable") }
    open fun hasVariable(name: String): Boolean {
        return _icall_Boolean_String(hasVariableMethodBind, this.rawMemory, name)
    }


    private val removeVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "remove_variable") }
    open fun removeVariable(name: String) {
        _icall_Unit_String(removeVariableMethodBind, this.rawMemory, name)
    }


    private val setVariableDefaultValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "set_variable_default_value") }
    open fun setVariableDefaultValue(name: String, value: Variant) {
        _icall_Unit_String_Variant(setVariableDefaultValueMethodBind, this.rawMemory, name, value)
    }


    private val getVariableDefaultValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_variable_default_value") }
    open fun getVariableDefaultValue(name: String): Variant {
        return _icall_Variant_String(getVariableDefaultValueMethodBind, this.rawMemory, name)
    }


    private val setVariableInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "set_variable_info") }
    open fun setVariableInfo(name: String, value: Dictionary) {
        _icall_Unit_String_Dictionary(setVariableInfoMethodBind, this.rawMemory, name, value)
    }


    private val getVariableInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_variable_info") }
    open fun getVariableInfo(name: String): Dictionary {
        return _icall_Dictionary_String(getVariableInfoMethodBind, this.rawMemory, name)
    }


    private val setVariableExportMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "set_variable_export") }
    open fun setVariableExport(name: String, enable: Boolean) {
        _icall_Unit_String_Boolean(setVariableExportMethodBind, this.rawMemory, name, enable)
    }


    private val getVariableExportMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "get_variable_export") }
    open fun getVariableExport(name: String): Boolean {
        return _icall_Boolean_String(getVariableExportMethodBind, this.rawMemory, name)
    }


    private val renameVariableMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "rename_variable") }
    open fun renameVariable(name: String, newName: String) {
        _icall_Unit_String_String(renameVariableMethodBind, this.rawMemory, name, newName)
    }


    private val addCustomSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "add_custom_signal") }
    open fun addCustomSignal(name: String) {
        _icall_Unit_String(addCustomSignalMethodBind, this.rawMemory, name)
    }


    private val hasCustomSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "has_custom_signal") }
    open fun hasCustomSignal(name: String): Boolean {
        return _icall_Boolean_String(hasCustomSignalMethodBind, this.rawMemory, name)
    }


    private val customSignalAddArgumentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_add_argument") }
    open fun customSignalAddArgument(name: String, type: Long, argname: String, index: Long = -1) {
        _icall_Unit_String_Long_String_Long(customSignalAddArgumentMethodBind, this.rawMemory, name, type, argname, index)
    }


    private val customSignalSetArgumentTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_set_argument_type") }
    open fun customSignalSetArgumentType(name: String, argidx: Long, type: Long) {
        _icall_Unit_String_Long_Long(customSignalSetArgumentTypeMethodBind, this.rawMemory, name, argidx, type)
    }


    private val customSignalGetArgumentTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_get_argument_type") }
    open fun customSignalGetArgumentType(name: String, argidx: Long): Variant.Type {
        return Variant.Type.fromInt(_icall_Long_String_Long(customSignalGetArgumentTypeMethodBind, this.rawMemory, name, argidx))
    }


    private val customSignalSetArgumentNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_set_argument_name") }
    open fun customSignalSetArgumentName(name: String, argidx: Long, argname: String) {
        _icall_Unit_String_Long_String(customSignalSetArgumentNameMethodBind, this.rawMemory, name, argidx, argname)
    }


    private val customSignalGetArgumentNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_get_argument_name") }
    open fun customSignalGetArgumentName(name: String, argidx: Long): String {
        return _icall_String_String_Long(customSignalGetArgumentNameMethodBind, this.rawMemory, name, argidx)
    }


    private val customSignalRemoveArgumentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_remove_argument") }
    open fun customSignalRemoveArgument(name: String, argidx: Long) {
        _icall_Unit_String_Long(customSignalRemoveArgumentMethodBind, this.rawMemory, name, argidx)
    }


    private val customSignalGetArgumentCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_get_argument_count") }
    open fun customSignalGetArgumentCount(name: String): Long {
        return _icall_Long_String(customSignalGetArgumentCountMethodBind, this.rawMemory, name)
    }


    private val customSignalSwapArgumentMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "custom_signal_swap_argument") }
    open fun customSignalSwapArgument(name: String, argidx: Long, withidx: Long) {
        _icall_Unit_String_Long_Long(customSignalSwapArgumentMethodBind, this.rawMemory, name, argidx, withidx)
    }


    private val removeCustomSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "remove_custom_signal") }
    open fun removeCustomSignal(name: String) {
        _icall_Unit_String(removeCustomSignalMethodBind, this.rawMemory, name)
    }


    private val renameCustomSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "rename_custom_signal") }
    open fun renameCustomSignal(name: String, newName: String) {
        _icall_Unit_String_String(renameCustomSignalMethodBind, this.rawMemory, name, newName)
    }


    private val setInstanceBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScript", "set_instance_base_type") }
    open fun setInstanceBaseType(type: String) {
        _icall_Unit_String(setInstanceBaseTypeMethodBind, this.rawMemory, type)
    }


    open fun _set_data(data: Dictionary) {
    }


    open fun _get_data(): Dictionary {
        throw NotImplementedError("_get_data is not implemented for VisualScript")
    }


}
