// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualScriptFunctionCall
import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class VisualScriptFunctionCall internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var baseScript: String
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_base_script")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_base_script")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var baseType: String
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_base_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_base_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var basicType: Long
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_basic_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_basic_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var callMode: Long
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_call_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_call_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var function: String
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_function")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_function")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var nodePath: NodePath
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_base_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_base_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var rpcCallMode: Long
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_rpc_call_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_rpc_call_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var singleton: String
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_singleton")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_singleton")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var useDefaultArgs: Long
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_use_default_args")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_use_default_args")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var validate: Boolean
    get() {
      val mb = getMethodBind("VisualScriptFunctionCall","get_validate")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptFunctionCall","set_validate")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptFunctionCall", "VisualScriptFunctionCall")
        }

  }

  open fun _get_argument_cache(): Dictionary {
    throw NotImplementedError("_get_argument_cache is not implemented for VisualScriptFunctionCall")
  }

  open fun _set_argument_cache(argumentCache: Dictionary) {
  }

  open fun getBasePath(): NodePath {
    val mb = getMethodBind("VisualScriptFunctionCall","get_base_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getBaseScript(): String {
    val mb = getMethodBind("VisualScriptFunctionCall","get_base_script")
    return _icall_String( mb, this.ptr)
  }

  open fun getBaseType(): String {
    val mb = getMethodBind("VisualScriptFunctionCall","get_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getBasicType(): Variant.Type {
    val mb = getMethodBind("VisualScriptFunctionCall","get_basic_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun getCallMode(): VisualScriptFunctionCall.CallMode {
    val mb = getMethodBind("VisualScriptFunctionCall","get_call_mode")
    return VisualScriptFunctionCall.CallMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getFunction(): String {
    val mb = getMethodBind("VisualScriptFunctionCall","get_function")
    return _icall_String( mb, this.ptr)
  }

  open fun getRpcCallMode(): VisualScriptFunctionCall.RPCCallMode {
    val mb = getMethodBind("VisualScriptFunctionCall","get_rpc_call_mode")
    return VisualScriptFunctionCall.RPCCallMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getSingleton(): String {
    val mb = getMethodBind("VisualScriptFunctionCall","get_singleton")
    return _icall_String( mb, this.ptr)
  }

  open fun getUseDefaultArgs(): Long {
    val mb = getMethodBind("VisualScriptFunctionCall","get_use_default_args")
    return _icall_Long( mb, this.ptr)
  }

  open fun getValidate(): Boolean {
    val mb = getMethodBind("VisualScriptFunctionCall","get_validate")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBasePath(basePath: NodePath) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_base_path")
    _icall_Unit_NodePath( mb, this.ptr, basePath)
  }

  open fun setBaseScript(baseScript: String) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_base_script")
    _icall_Unit_String( mb, this.ptr, baseScript)
  }

  open fun setBaseType(baseType: String) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_base_type")
    _icall_Unit_String( mb, this.ptr, baseType)
  }

  open fun setBasicType(basicType: Long) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_basic_type")
    _icall_Unit_Long( mb, this.ptr, basicType)
  }

  open fun setCallMode(mode: Long) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_call_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setFunction(function: String) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_function")
    _icall_Unit_String( mb, this.ptr, function)
  }

  open fun setRpcCallMode(mode: Long) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_rpc_call_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setSingleton(singleton: String) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_singleton")
    _icall_Unit_String( mb, this.ptr, singleton)
  }

  open fun setUseDefaultArgs(amount: Long) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_use_default_args")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setValidate(enable: Boolean) {
    val mb = getMethodBind("VisualScriptFunctionCall","set_validate")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class RPCCallMode(
    id: Long
  ) {
    RPC_DISABLED(0),

    RPC_RELIABLE(1),

    RPC_UNRELIABLE(2),

    RPC_RELIABLE_TO_ID(3),

    RPC_UNRELIABLE_TO_ID(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CallMode(
    id: Long
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3),

    CALL_MODE_SINGLETON(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CALL_MODE_BASIC_TYPE: Long = 3

    final const val CALL_MODE_INSTANCE: Long = 2

    final const val CALL_MODE_NODE_PATH: Long = 1

    final const val CALL_MODE_SELF: Long = 0

    final const val CALL_MODE_SINGLETON: Long = 4

    final const val RPC_DISABLED: Long = 0

    final const val RPC_RELIABLE: Long = 1

    final const val RPC_RELIABLE_TO_ID: Long = 3

    final const val RPC_UNRELIABLE: Long = 2

    final const val RPC_UNRELIABLE_TO_ID: Long = 4
  }
}
