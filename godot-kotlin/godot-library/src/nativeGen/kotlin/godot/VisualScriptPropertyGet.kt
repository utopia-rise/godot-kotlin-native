package godot

import godot.VisualScriptPropertyGet
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Variant
import godot.core.Variant.Type
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
import kotlin.NotImplementedError
import kotlin.String

open class VisualScriptPropertyGet internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var baseScript: String
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_base_script")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_base_script")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var baseType: String
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_base_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_base_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var basicType: Long
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_basic_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_basic_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var index: String
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_index")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_index")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var nodePath: NodePath
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_base_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_base_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var property: String
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_property")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_property")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var setMode: Long
    get() {
      val mb = getMethodBind("VisualScriptPropertyGet","get_call_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertyGet","set_call_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptPropertyGet", "VisualScriptPropertyGet")
        }

  }

  open fun _get_type_cache(): Variant.Type {
    throw NotImplementedError("_get_type_cache is not implemented for VisualScriptPropertyGet")
  }

  open fun _set_type_cache(typeCache: Long) {
  }

  open fun getBasePath(): NodePath {
    val mb = getMethodBind("VisualScriptPropertyGet","get_base_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getBaseScript(): String {
    val mb = getMethodBind("VisualScriptPropertyGet","get_base_script")
    return _icall_String( mb, this.ptr)
  }

  open fun getBaseType(): String {
    val mb = getMethodBind("VisualScriptPropertyGet","get_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getBasicType(): Variant.Type {
    val mb = getMethodBind("VisualScriptPropertyGet","get_basic_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun getCallMode(): VisualScriptPropertyGet.CallMode {
    val mb = getMethodBind("VisualScriptPropertyGet","get_call_mode")
    return VisualScriptPropertyGet.CallMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getIndex(): String {
    val mb = getMethodBind("VisualScriptPropertyGet","get_index")
    return _icall_String( mb, this.ptr)
  }

  open fun getProperty(): String {
    val mb = getMethodBind("VisualScriptPropertyGet","get_property")
    return _icall_String( mb, this.ptr)
  }

  open fun setBasePath(basePath: NodePath) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_base_path")
    _icall_Unit_NodePath( mb, this.ptr, basePath)
  }

  open fun setBaseScript(baseScript: String) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_base_script")
    _icall_Unit_String( mb, this.ptr, baseScript)
  }

  open fun setBaseType(baseType: String) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_base_type")
    _icall_Unit_String( mb, this.ptr, baseType)
  }

  open fun setBasicType(basicType: Long) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_basic_type")
    _icall_Unit_Long( mb, this.ptr, basicType)
  }

  open fun setCallMode(mode: Long) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_call_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setIndex(index: String) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_index")
    _icall_Unit_String( mb, this.ptr, index)
  }

  open fun setProperty(property: String) {
    val mb = getMethodBind("VisualScriptPropertyGet","set_property")
    _icall_Unit_String( mb, this.ptr, property)
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
