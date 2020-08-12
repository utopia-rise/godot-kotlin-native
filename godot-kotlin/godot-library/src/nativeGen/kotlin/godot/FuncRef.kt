// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Variant_VariantArray
import godot.icalls._icall_varargs
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class FuncRef internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("FuncRef", "FuncRef")
        }

  }

  open fun callFunc(vararg __var_args: Any?): Variant {
    val mb = getMethodBind("FuncRef","call_func")
    return _icall_varargs( mb, this.ptr, __var_args)
  }

  open fun callFuncv(argArray: VariantArray): Variant {
    val mb = getMethodBind("FuncRef","call_funcv")
    return _icall_Variant_VariantArray( mb, this.ptr, argArray)
  }

  open fun isValid(): Boolean {
    val mb = getMethodBind("FuncRef","is_valid")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setFunction(name: String) {
    val mb = getMethodBind("FuncRef","set_function")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setInstance(instance: Object) {
    val mb = getMethodBind("FuncRef","set_instance")
    _icall_Unit_Object( mb, this.ptr, instance)
  }
}
