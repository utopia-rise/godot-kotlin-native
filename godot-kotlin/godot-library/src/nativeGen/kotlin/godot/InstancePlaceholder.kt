// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.icalls._icall_Dictionary_Boolean
import godot.icalls._icall_Node_Boolean_nObject
import godot.icalls._icall_String
import godot.icalls._icall_Unit_nObject
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.String

open class InstancePlaceholder internal constructor() : Node() {
  open fun createInstance(replace: Boolean = false, customScene: PackedScene? = null): Node {
    val mb = getMethodBind("InstancePlaceholder","create_instance")
    return _icall_Node_Boolean_nObject( mb, this.ptr, replace, customScene)
  }

  open fun getInstancePath(): String {
    val mb = getMethodBind("InstancePlaceholder","get_instance_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getStoredValues(withOrder: Boolean = false): Dictionary {
    val mb = getMethodBind("InstancePlaceholder","get_stored_values")
    return _icall_Dictionary_Boolean( mb, this.ptr, withOrder)
  }

  open fun replaceByInstance(customScene: PackedScene? = null) {
    val mb = getMethodBind("InstancePlaceholder","replace_by_instance")
    _icall_Unit_nObject( mb, this.ptr, customScene)
  }
}
