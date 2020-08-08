package godot

import godot.core.Signal0
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Unit_VariantArray
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Variant_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNode internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  val editorRefreshRequest: Signal0 by signal()

  open var defaultInputValues: VariantArray
    get() {
      val mb = getMethodBind("VisualShaderNode","get_default_input_values")
      return _icall_VariantArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNode","set_default_input_values")
      _icall_Unit_VariantArray(mb, this.ptr, value)
    }

  open var outputPortForPreview: Long
    get() {
      val mb = getMethodBind("VisualShaderNode","get_output_port_for_preview")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNode","set_output_port_for_preview")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getDefaultInputValues(): VariantArray {
    val mb = getMethodBind("VisualShaderNode","get_default_input_values")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getInputPortDefaultValue(port: Long): Variant {
    val mb = getMethodBind("VisualShaderNode","get_input_port_default_value")
    return _icall_Variant_Long( mb, this.ptr, port)
  }

  open fun getOutputPortForPreview(): Long {
    val mb = getMethodBind("VisualShaderNode","get_output_port_for_preview")
    return _icall_Long( mb, this.ptr)
  }

  open fun setDefaultInputValues(values: VariantArray) {
    val mb = getMethodBind("VisualShaderNode","set_default_input_values")
    _icall_Unit_VariantArray( mb, this.ptr, values)
  }

  open fun setInputPortDefaultValue(port: Long, value: Variant) {
    val mb = getMethodBind("VisualShaderNode","set_input_port_default_value")
    _icall_Unit_Long_Variant( mb, this.ptr, port, value)
  }

  open fun setOutputPortForPreview(port: Long) {
    val mb = getMethodBind("VisualShaderNode","set_output_port_for_preview")
    _icall_Unit_Long( mb, this.ptr, port)
  }

  enum class PortType(
    id: Long
  ) {
    PORT_TYPE_SCALAR(0),

    PORT_TYPE_VECTOR(1),

    PORT_TYPE_BOOLEAN(2),

    PORT_TYPE_TRANSFORM(3),

    PORT_TYPE_SAMPLER(4),

    PORT_TYPE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val PORT_TYPE_BOOLEAN: Long = 2

    final const val PORT_TYPE_MAX: Long = 5

    final const val PORT_TYPE_SAMPLER: Long = 4

    final const val PORT_TYPE_SCALAR: Long = 0

    final const val PORT_TYPE_TRANSFORM: Long = 3

    final const val PORT_TYPE_VECTOR: Long = 1
  }
}
