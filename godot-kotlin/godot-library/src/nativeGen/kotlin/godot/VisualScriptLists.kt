// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_String_Long
import godot.internal.utils.getMethodBind
import kotlin.Long
import kotlin.String

open class VisualScriptLists internal constructor() : VisualScriptNode() {
  open fun addInputDataPort(
    type: Long,
    name: String,
    index: Long
  ) {
    val mb = getMethodBind("VisualScriptLists","add_input_data_port")
    _icall_Unit_Long_String_Long( mb, this.ptr, type, name, index)
  }

  open fun addOutputDataPort(
    type: Long,
    name: String,
    index: Long
  ) {
    val mb = getMethodBind("VisualScriptLists","add_output_data_port")
    _icall_Unit_Long_String_Long( mb, this.ptr, type, name, index)
  }

  open fun removeInputDataPort(index: Long) {
    val mb = getMethodBind("VisualScriptLists","remove_input_data_port")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun removeOutputDataPort(index: Long) {
    val mb = getMethodBind("VisualScriptLists","remove_output_data_port")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setInputDataPortName(index: Long, name: String) {
    val mb = getMethodBind("VisualScriptLists","set_input_data_port_name")
    _icall_Unit_Long_String( mb, this.ptr, index, name)
  }

  open fun setInputDataPortType(index: Long, type: Long) {
    val mb = getMethodBind("VisualScriptLists","set_input_data_port_type")
    _icall_Unit_Long_Long( mb, this.ptr, index, type)
  }

  open fun setOutputDataPortName(index: Long, name: String) {
    val mb = getMethodBind("VisualScriptLists","set_output_data_port_name")
    _icall_Unit_Long_String( mb, this.ptr, index, name)
  }

  open fun setOutputDataPortType(index: Long, type: Long) {
    val mb = getMethodBind("VisualScriptLists","set_output_data_port_type")
    _icall_Unit_Long_Long( mb, this.ptr, index, type)
  }
}
