// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeCompare
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeCompare internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var condition: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeCompare","get_condition")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeCompare","set_condition")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var function: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeCompare","get_function")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeCompare","set_function")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var type: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeCompare","get_comparison_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeCompare","set_comparison_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeCompare", "VisualShaderNodeCompare")
        }

  }

  open fun getComparisonType(): VisualShaderNodeCompare.ComparisonType {
    val mb = getMethodBind("VisualShaderNodeCompare","get_comparison_type")
    return VisualShaderNodeCompare.ComparisonType.from( _icall_Long( mb, this.ptr))
  }

  open fun getCondition(): VisualShaderNodeCompare.Condition {
    val mb = getMethodBind("VisualShaderNodeCompare","get_condition")
    return VisualShaderNodeCompare.Condition.from( _icall_Long( mb, this.ptr))
  }

  open fun getFunction(): VisualShaderNodeCompare.Function {
    val mb = getMethodBind("VisualShaderNodeCompare","get_function")
    return VisualShaderNodeCompare.Function.from( _icall_Long( mb, this.ptr))
  }

  open fun setComparisonType(type: Long) {
    val mb = getMethodBind("VisualShaderNodeCompare","set_comparison_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun setCondition(condition: Long) {
    val mb = getMethodBind("VisualShaderNodeCompare","set_condition")
    _icall_Unit_Long( mb, this.ptr, condition)
  }

  open fun setFunction(func: Long) {
    val mb = getMethodBind("VisualShaderNodeCompare","set_function")
    _icall_Unit_Long( mb, this.ptr, func)
  }

  enum class ComparisonType(
    id: Long
  ) {
    CTYPE_SCALAR(0),

    CTYPE_VECTOR(1),

    CTYPE_BOOLEAN(2),

    CTYPE_TRANSFORM(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Function(
    id: Long
  ) {
    FUNC_EQUAL(0),

    FUNC_NOT_EQUAL(1),

    FUNC_GREATER_THAN(2),

    FUNC_GREATER_THAN_EQUAL(3),

    FUNC_LESS_THAN(4),

    FUNC_LESS_THAN_EQUAL(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Condition(
    id: Long
  ) {
    COND_ALL(0),

    COND_ANY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COND_ALL: Long = 0

    final const val COND_ANY: Long = 1

    final const val CTYPE_BOOLEAN: Long = 2

    final const val CTYPE_SCALAR: Long = 0

    final const val CTYPE_TRANSFORM: Long = 3

    final const val CTYPE_VECTOR: Long = 1

    final const val FUNC_EQUAL: Long = 0

    final const val FUNC_GREATER_THAN: Long = 2

    final const val FUNC_GREATER_THAN_EQUAL: Long = 3

    final const val FUNC_LESS_THAN: Long = 4

    final const val FUNC_LESS_THAN_EQUAL: Long = 5

    final const val FUNC_NOT_EQUAL: Long = 1
  }
}
