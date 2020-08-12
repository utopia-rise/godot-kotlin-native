// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.Signal2
import godot.core.Variant
import godot.core.Variant.Type
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_Long
import godot.icalls._icall_Boolean_String_Long_Long_Long
import godot.icalls._icall_Boolean_String_Long_Long_Long_Long
import godot.icalls._icall_Dictionary_String
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_Long
import godot.icalls._icall_String_String_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_Dictionary
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Long_Long
import godot.icalls._icall_Unit_String_Long_Long_Long
import godot.icalls._icall_Unit_String_Long_Long_Long_Long
import godot.icalls._icall_Unit_String_Long_Object_Vector2
import godot.icalls._icall_Unit_String_Long_String
import godot.icalls._icall_Unit_String_Long_String_Long
import godot.icalls._icall_Unit_String_Long_Vector2
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Unit_String_Vector2
import godot.icalls._icall_Unit_String_nVariant_Boolean
import godot.icalls._icall_Variant_String
import godot.icalls._icall_Vector2_String
import godot.icalls._icall_Vector2_String_Long
import godot.icalls._icall_VisualScriptNode_String_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class VisualScript internal constructor(
  _ignore: Any?
) : Script(_ignore) {
  val nodePortsChanged: Signal2<String, Long> by signal("function", "id")

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScript", "VisualScript")
        }

  }

  open fun _getData(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for VisualScript")
  }

  open fun _nodePortsChanged(arg0: Long) {
  }

  open fun _setData(data: Dictionary) {
  }

  open fun addCustomSignal(name: String) {
    val mb = getMethodBind("VisualScript","add_custom_signal")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun addFunction(name: String) {
    val mb = getMethodBind("VisualScript","add_function")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun addNode(
    func: String,
    id: Long,
    node: VisualScriptNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("VisualScript","add_node")
    _icall_Unit_String_Long_Object_Vector2( mb, this.ptr, func, id, node, position)
  }

  open fun addVariable(
    name: String,
    defaultValue: Variant? = null,
    export: Boolean = false
  ) {
    val mb = getMethodBind("VisualScript","add_variable")
    _icall_Unit_String_nVariant_Boolean( mb, this.ptr, name, defaultValue, export)
  }

  open fun customSignalAddArgument(
    name: String,
    type: Long,
    argname: String,
    index: Long = -1
  ) {
    val mb = getMethodBind("VisualScript","custom_signal_add_argument")
    _icall_Unit_String_Long_String_Long( mb, this.ptr, name, type, argname, index)
  }

  open fun customSignalGetArgumentCount(name: String): Long {
    val mb = getMethodBind("VisualScript","custom_signal_get_argument_count")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun customSignalGetArgumentName(name: String, argidx: Long): String {
    val mb = getMethodBind("VisualScript","custom_signal_get_argument_name")
    return _icall_String_String_Long( mb, this.ptr, name, argidx)
  }

  open fun customSignalGetArgumentType(name: String, argidx: Long): Variant.Type {
    val mb = getMethodBind("VisualScript","custom_signal_get_argument_type")
    return Variant.Type.from( _icall_Long_String_Long( mb, this.ptr, name, argidx))
  }

  open fun customSignalRemoveArgument(name: String, argidx: Long) {
    val mb = getMethodBind("VisualScript","custom_signal_remove_argument")
    _icall_Unit_String_Long( mb, this.ptr, name, argidx)
  }

  open fun customSignalSetArgumentName(
    name: String,
    argidx: Long,
    argname: String
  ) {
    val mb = getMethodBind("VisualScript","custom_signal_set_argument_name")
    _icall_Unit_String_Long_String( mb, this.ptr, name, argidx, argname)
  }

  open fun customSignalSetArgumentType(
    name: String,
    argidx: Long,
    type: Long
  ) {
    val mb = getMethodBind("VisualScript","custom_signal_set_argument_type")
    _icall_Unit_String_Long_Long( mb, this.ptr, name, argidx, type)
  }

  open fun customSignalSwapArgument(
    name: String,
    argidx: Long,
    withidx: Long
  ) {
    val mb = getMethodBind("VisualScript","custom_signal_swap_argument")
    _icall_Unit_String_Long_Long( mb, this.ptr, name, argidx, withidx)
  }

  open fun dataConnect(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    val mb = getMethodBind("VisualScript","data_connect")
    _icall_Unit_String_Long_Long_Long_Long( mb, this.ptr, func, fromNode, fromPort, toNode, toPort)
  }

  open fun dataDisconnect(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    val mb = getMethodBind("VisualScript","data_disconnect")
    _icall_Unit_String_Long_Long_Long_Long( mb, this.ptr, func, fromNode, fromPort, toNode, toPort)
  }

  open fun getFunctionNodeId(name: String): Long {
    val mb = getMethodBind("VisualScript","get_function_node_id")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun getFunctionScroll(name: String): Vector2 {
    val mb = getMethodBind("VisualScript","get_function_scroll")
    return _icall_Vector2_String( mb, this.ptr, name)
  }

  open fun getNode(func: String, id: Long): VisualScriptNode {
    val mb = getMethodBind("VisualScript","get_node")
    return _icall_VisualScriptNode_String_Long( mb, this.ptr, func, id)
  }

  open fun getNodePosition(func: String, id: Long): Vector2 {
    val mb = getMethodBind("VisualScript","get_node_position")
    return _icall_Vector2_String_Long( mb, this.ptr, func, id)
  }

  open fun getVariableDefaultValue(name: String): Variant {
    val mb = getMethodBind("VisualScript","get_variable_default_value")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  open fun getVariableExport(name: String): Boolean {
    val mb = getMethodBind("VisualScript","get_variable_export")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun getVariableInfo(name: String): Dictionary {
    val mb = getMethodBind("VisualScript","get_variable_info")
    return _icall_Dictionary_String( mb, this.ptr, name)
  }

  open fun hasCustomSignal(name: String): Boolean {
    val mb = getMethodBind("VisualScript","has_custom_signal")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasDataConnection(
    func: String,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    val mb = getMethodBind("VisualScript","has_data_connection")
    return _icall_Boolean_String_Long_Long_Long_Long( mb, this.ptr, func, fromNode, fromPort,
        toNode, toPort)
  }

  open fun hasFunction(name: String): Boolean {
    val mb = getMethodBind("VisualScript","has_function")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasNode(func: String, id: Long): Boolean {
    val mb = getMethodBind("VisualScript","has_node")
    return _icall_Boolean_String_Long( mb, this.ptr, func, id)
  }

  open fun hasSequenceConnection(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ): Boolean {
    val mb = getMethodBind("VisualScript","has_sequence_connection")
    return _icall_Boolean_String_Long_Long_Long( mb, this.ptr, func, fromNode, fromOutput, toNode)
  }

  open fun hasVariable(name: String): Boolean {
    val mb = getMethodBind("VisualScript","has_variable")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun removeCustomSignal(name: String) {
    val mb = getMethodBind("VisualScript","remove_custom_signal")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun removeFunction(name: String) {
    val mb = getMethodBind("VisualScript","remove_function")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun removeNode(func: String, id: Long) {
    val mb = getMethodBind("VisualScript","remove_node")
    _icall_Unit_String_Long( mb, this.ptr, func, id)
  }

  open fun removeVariable(name: String) {
    val mb = getMethodBind("VisualScript","remove_variable")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun renameCustomSignal(name: String, newName: String) {
    val mb = getMethodBind("VisualScript","rename_custom_signal")
    _icall_Unit_String_String( mb, this.ptr, name, newName)
  }

  open fun renameFunction(name: String, newName: String) {
    val mb = getMethodBind("VisualScript","rename_function")
    _icall_Unit_String_String( mb, this.ptr, name, newName)
  }

  open fun renameVariable(name: String, newName: String) {
    val mb = getMethodBind("VisualScript","rename_variable")
    _icall_Unit_String_String( mb, this.ptr, name, newName)
  }

  open fun sequenceConnect(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ) {
    val mb = getMethodBind("VisualScript","sequence_connect")
    _icall_Unit_String_Long_Long_Long( mb, this.ptr, func, fromNode, fromOutput, toNode)
  }

  open fun sequenceDisconnect(
    func: String,
    fromNode: Long,
    fromOutput: Long,
    toNode: Long
  ) {
    val mb = getMethodBind("VisualScript","sequence_disconnect")
    _icall_Unit_String_Long_Long_Long( mb, this.ptr, func, fromNode, fromOutput, toNode)
  }

  open fun setFunctionScroll(name: String, ofs: Vector2) {
    val mb = getMethodBind("VisualScript","set_function_scroll")
    _icall_Unit_String_Vector2( mb, this.ptr, name, ofs)
  }

  open fun setInstanceBaseType(type: String) {
    val mb = getMethodBind("VisualScript","set_instance_base_type")
    _icall_Unit_String( mb, this.ptr, type)
  }

  open fun setNodePosition(
    func: String,
    id: Long,
    position: Vector2
  ) {
    val mb = getMethodBind("VisualScript","set_node_position")
    _icall_Unit_String_Long_Vector2( mb, this.ptr, func, id, position)
  }

  open fun setVariableDefaultValue(name: String, value: Variant) {
    val mb = getMethodBind("VisualScript","set_variable_default_value")
    _icall_Unit_String_Variant( mb, this.ptr, name, value)
  }

  open fun setVariableExport(name: String, enable: Boolean) {
    val mb = getMethodBind("VisualScript","set_variable_export")
    _icall_Unit_String_Boolean( mb, this.ptr, name, enable)
  }

  open fun setVariableInfo(name: String, value: Dictionary) {
    val mb = getMethodBind("VisualScript","set_variable_info")
    _icall_Unit_String_Dictionary( mb, this.ptr, name, value)
  }
}
