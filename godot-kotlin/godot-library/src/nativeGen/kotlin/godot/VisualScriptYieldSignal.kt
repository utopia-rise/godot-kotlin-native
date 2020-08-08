package godot

import godot.VisualScriptYieldSignal
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class VisualScriptYieldSignal internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var baseType: String
    get() {
      val mb = getMethodBind("VisualScriptYieldSignal","get_base_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptYieldSignal","set_base_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var callMode: Long
    get() {
      val mb = getMethodBind("VisualScriptYieldSignal","get_call_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptYieldSignal","set_call_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var nodePath: NodePath
    get() {
      val mb = getMethodBind("VisualScriptYieldSignal","get_base_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptYieldSignal","set_base_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var signal: String
    get() {
      val mb = getMethodBind("VisualScriptYieldSignal","get_signal")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptYieldSignal","set_signal")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptYieldSignal", "VisualScriptYieldSignal")
        }

  }

  open fun getBasePath(): NodePath {
    val mb = getMethodBind("VisualScriptYieldSignal","get_base_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getBaseType(): String {
    val mb = getMethodBind("VisualScriptYieldSignal","get_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getCallMode(): VisualScriptYieldSignal.CallMode {
    val mb = getMethodBind("VisualScriptYieldSignal","get_call_mode")
    return VisualScriptYieldSignal.CallMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getSignal(): String {
    val mb = getMethodBind("VisualScriptYieldSignal","get_signal")
    return _icall_String( mb, this.ptr)
  }

  open fun setBasePath(basePath: NodePath) {
    val mb = getMethodBind("VisualScriptYieldSignal","set_base_path")
    _icall_Unit_NodePath( mb, this.ptr, basePath)
  }

  open fun setBaseType(baseType: String) {
    val mb = getMethodBind("VisualScriptYieldSignal","set_base_type")
    _icall_Unit_String( mb, this.ptr, baseType)
  }

  open fun setCallMode(mode: Long) {
    val mb = getMethodBind("VisualScriptYieldSignal","set_call_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setSignal(signal: String) {
    val mb = getMethodBind("VisualScriptYieldSignal","set_signal")
    _icall_Unit_String( mb, this.ptr, signal)
  }

  enum class CallMode(
    id: Long
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CALL_MODE_INSTANCE: Long = 2

    final const val CALL_MODE_NODE_PATH: Long = 1

    final const val CALL_MODE_SELF: Long = 0
  }
}
