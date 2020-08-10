package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.core.VariantArray
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_Resource_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String

open class ResourcePreloader internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ResourcePreloader", "ResourcePreloader")
        }

  }

  open fun _get_resources(): VariantArray {
    throw NotImplementedError("_get_resources is not implemented for ResourcePreloader")
  }

  open fun _set_resources(arg0: VariantArray) {
  }

  open fun addResource(name: String, resource: Resource) {
    val mb = getMethodBind("ResourcePreloader","add_resource")
    _icall_Unit_String_Object( mb, this.ptr, name, resource)
  }

  open fun getResource(name: String): Resource {
    val mb = getMethodBind("ResourcePreloader","get_resource")
    return _icall_Resource_String( mb, this.ptr, name)
  }

  open fun getResourceList(): PoolStringArray {
    val mb = getMethodBind("ResourcePreloader","get_resource_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun hasResource(name: String): Boolean {
    val mb = getMethodBind("ResourcePreloader","has_resource")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun removeResource(name: String) {
    val mb = getMethodBind("ResourcePreloader","remove_resource")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun renameResource(name: String, newname: String) {
    val mb = getMethodBind("ResourcePreloader","rename_resource")
    _icall_Unit_String_String( mb, this.ptr, name, newname)
  }
}
