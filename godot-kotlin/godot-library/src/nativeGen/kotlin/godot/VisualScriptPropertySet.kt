// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualScriptPropertySet
import godot.core.Dictionary
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

open class VisualScriptPropertySet internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var assignOp: Long
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_assign_op")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_assign_op")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var baseScript: String
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_base_script")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_base_script")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var baseType: String
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_base_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_base_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var basicType: Long
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_basic_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_basic_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var index: String
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_index")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_index")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var nodePath: NodePath
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_base_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_base_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var property: String
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_property")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_property")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var setMode: Long
    get() {
      val mb = getMethodBind("VisualScriptPropertySet","get_call_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptPropertySet","set_call_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptPropertySet", "VisualScriptPropertySet")
        }

  }

  open fun _get_type_cache(): Dictionary {
    throw NotImplementedError("_get_type_cache is not implemented for VisualScriptPropertySet")
  }

  open fun _set_type_cache(typeCache: Dictionary) {
  }

  open fun getAssignOp(): VisualScriptPropertySet.AssignOp {
    val mb = getMethodBind("VisualScriptPropertySet","get_assign_op")
    return VisualScriptPropertySet.AssignOp.from( _icall_Long( mb, this.ptr))
  }

  open fun getBasePath(): NodePath {
    val mb = getMethodBind("VisualScriptPropertySet","get_base_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getBaseScript(): String {
    val mb = getMethodBind("VisualScriptPropertySet","get_base_script")
    return _icall_String( mb, this.ptr)
  }

  open fun getBaseType(): String {
    val mb = getMethodBind("VisualScriptPropertySet","get_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getBasicType(): Variant.Type {
    val mb = getMethodBind("VisualScriptPropertySet","get_basic_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun getCallMode(): VisualScriptPropertySet.CallMode {
    val mb = getMethodBind("VisualScriptPropertySet","get_call_mode")
    return VisualScriptPropertySet.CallMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getIndex(): String {
    val mb = getMethodBind("VisualScriptPropertySet","get_index")
    return _icall_String( mb, this.ptr)
  }

  open fun getProperty(): String {
    val mb = getMethodBind("VisualScriptPropertySet","get_property")
    return _icall_String( mb, this.ptr)
  }

  open fun setAssignOp(assignOp: Long) {
    val mb = getMethodBind("VisualScriptPropertySet","set_assign_op")
    _icall_Unit_Long( mb, this.ptr, assignOp)
  }

  open fun setBasePath(basePath: NodePath) {
    val mb = getMethodBind("VisualScriptPropertySet","set_base_path")
    _icall_Unit_NodePath( mb, this.ptr, basePath)
  }

  open fun setBaseScript(baseScript: String) {
    val mb = getMethodBind("VisualScriptPropertySet","set_base_script")
    _icall_Unit_String( mb, this.ptr, baseScript)
  }

  open fun setBaseType(baseType: String) {
    val mb = getMethodBind("VisualScriptPropertySet","set_base_type")
    _icall_Unit_String( mb, this.ptr, baseType)
  }

  open fun setBasicType(basicType: Long) {
    val mb = getMethodBind("VisualScriptPropertySet","set_basic_type")
    _icall_Unit_Long( mb, this.ptr, basicType)
  }

  open fun setCallMode(mode: Long) {
    val mb = getMethodBind("VisualScriptPropertySet","set_call_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setIndex(index: String) {
    val mb = getMethodBind("VisualScriptPropertySet","set_index")
    _icall_Unit_String( mb, this.ptr, index)
  }

  open fun setProperty(property: String) {
    val mb = getMethodBind("VisualScriptPropertySet","set_property")
    _icall_Unit_String( mb, this.ptr, property)
  }

  enum class AssignOp(
    id: Long
  ) {
    ASSIGN_OP_NONE(0),

    ASSIGN_OP_ADD(1),

    ASSIGN_OP_SUB(2),

    ASSIGN_OP_MUL(3),

    ASSIGN_OP_DIV(4),

    ASSIGN_OP_MOD(5),

    ASSIGN_OP_SHIFT_LEFT(6),

    ASSIGN_OP_SHIFT_RIGHT(7),

    ASSIGN_OP_BIT_AND(8),

    ASSIGN_OP_BIT_OR(9),

    ASSIGN_OP_BIT_XOR(10);

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

    CALL_MODE_BASIC_TYPE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ASSIGN_OP_ADD: Long = 1

    final const val ASSIGN_OP_BIT_AND: Long = 8

    final const val ASSIGN_OP_BIT_OR: Long = 9

    final const val ASSIGN_OP_BIT_XOR: Long = 10

    final const val ASSIGN_OP_DIV: Long = 4

    final const val ASSIGN_OP_MOD: Long = 5

    final const val ASSIGN_OP_MUL: Long = 3

    final const val ASSIGN_OP_NONE: Long = 0

    final const val ASSIGN_OP_SHIFT_LEFT: Long = 6

    final const val ASSIGN_OP_SHIFT_RIGHT: Long = 7

    final const val ASSIGN_OP_SUB: Long = 2

    final const val CALL_MODE_BASIC_TYPE: Long = 3

    final const val CALL_MODE_INSTANCE: Long = 2

    final const val CALL_MODE_NODE_PATH: Long = 1

    final const val CALL_MODE_SELF: Long = 0
  }
}
