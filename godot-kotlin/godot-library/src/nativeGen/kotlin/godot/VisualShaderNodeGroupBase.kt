package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_String
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class VisualShaderNodeGroupBase internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var size: Vector2
    get() {
      val mb = getMethodBind("VisualShaderNodeGroupBase","get_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeGroupBase","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeGroupBase", "VisualShaderNodeGroupBase")
        }

  }

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun addInputPort(
    id: Long,
    type: Long,
    name: String
  ) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","add_input_port")
    _icall_Unit_Long_Long_String( mb, this.ptr, id, type, name)
  }

  open fun addOutputPort(
    id: Long,
    type: Long,
    name: String
  ) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","add_output_port")
    _icall_Unit_Long_Long_String( mb, this.ptr, id, type, name)
  }

  open fun clearInputPorts() {
    val mb = getMethodBind("VisualShaderNodeGroupBase","clear_input_ports")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearOutputPorts() {
    val mb = getMethodBind("VisualShaderNodeGroupBase","clear_output_ports")
    _icall_Unit( mb, this.ptr)
  }

  open fun getFreeInputPortId(): Long {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_free_input_port_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFreeOutputPortId(): Long {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_free_output_port_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInputPortCount(): Long {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_input_port_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInputs(): String {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_inputs")
    return _icall_String( mb, this.ptr)
  }

  open fun getOutputPortCount(): Long {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_output_port_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getOutputs(): String {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_outputs")
    return _icall_String( mb, this.ptr)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("VisualShaderNodeGroupBase","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun hasInputPort(id: Long): Boolean {
    val mb = getMethodBind("VisualShaderNodeGroupBase","has_input_port")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun hasOutputPort(id: Long): Boolean {
    val mb = getMethodBind("VisualShaderNodeGroupBase","has_output_port")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun isValidPortName(name: String): Boolean {
    val mb = getMethodBind("VisualShaderNodeGroupBase","is_valid_port_name")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun removeInputPort(id: Long) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","remove_input_port")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun removeOutputPort(id: Long) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","remove_output_port")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun setInputPortName(id: Long, name: String) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_input_port_name")
    _icall_Unit_Long_String( mb, this.ptr, id, name)
  }

  open fun setInputPortType(id: Long, type: Long) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_input_port_type")
    _icall_Unit_Long_Long( mb, this.ptr, id, type)
  }

  open fun setInputs(inputs: String) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_inputs")
    _icall_Unit_String( mb, this.ptr, inputs)
  }

  open fun setOutputPortName(id: Long, name: String) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_output_port_name")
    _icall_Unit_Long_String( mb, this.ptr, id, name)
  }

  open fun setOutputPortType(id: Long, type: Long) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_output_port_type")
    _icall_Unit_Long_Long( mb, this.ptr, id, type)
  }

  open fun setOutputs(outputs: String) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_outputs")
    _icall_Unit_String( mb, this.ptr, outputs)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("VisualShaderNodeGroupBase","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  companion object
}
