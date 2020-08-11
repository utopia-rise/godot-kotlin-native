// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.GodotError
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Object
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Long_Boolean
import godot.icalls._icall_Script
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Variant_String
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class Script internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var sourceCode: String
    get() {
      val mb = getMethodBind("Script","get_source_code")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Script","set_source_code")
      _icall_Unit_String(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun canInstance(): Boolean {
    val mb = getMethodBind("Script","can_instance")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getBaseScript(): Script {
    val mb = getMethodBind("Script","get_base_script")
    return _icall_Script( mb, this.ptr)
  }

  open fun getInstanceBaseType(): String {
    val mb = getMethodBind("Script","get_instance_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getPropertyDefaultValue(property: String): Variant {
    val mb = getMethodBind("Script","get_property_default_value")
    return _icall_Variant_String( mb, this.ptr, property)
  }

  open fun getScriptConstantMap(): Dictionary {
    val mb = getMethodBind("Script","get_script_constant_map")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun getScriptMethodList(): VariantArray {
    val mb = getMethodBind("Script","get_script_method_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getScriptPropertyList(): VariantArray {
    val mb = getMethodBind("Script","get_script_property_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getScriptSignalList(): VariantArray {
    val mb = getMethodBind("Script","get_script_signal_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getSourceCode(): String {
    val mb = getMethodBind("Script","get_source_code")
    return _icall_String( mb, this.ptr)
  }

  open fun hasScriptSignal(signalName: String): Boolean {
    val mb = getMethodBind("Script","has_script_signal")
    return _icall_Boolean_String( mb, this.ptr, signalName)
  }

  open fun hasSourceCode(): Boolean {
    val mb = getMethodBind("Script","has_source_code")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun instanceHas(baseObject: Object): Boolean {
    val mb = getMethodBind("Script","instance_has")
    return _icall_Boolean_Object( mb, this.ptr, baseObject)
  }

  open fun isTool(): Boolean {
    val mb = getMethodBind("Script","is_tool")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun reload(keepState: Boolean = false): GodotError {
    val mb = getMethodBind("Script","reload")
    return GodotError.byValue( _icall_Long_Boolean( mb, this.ptr, keepState).toUInt())
  }

  open fun setSourceCode(source: String) {
    val mb = getMethodBind("Script","set_source_code")
    _icall_Unit_String( mb, this.ptr, source)
  }
}
