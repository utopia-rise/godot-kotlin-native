// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolStringArray
import godot.core.VariantArray
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_Resource_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class ResourcePreloader : Node() {
  override fun __new(): COpaquePointer = invokeConstructor("ResourcePreloader", "ResourcePreloader")

  open fun _getResources(): VariantArray {
    throw NotImplementedError("_get_resources is not implemented for ResourcePreloader")
  }

  open fun _setResources(arg0: VariantArray) {
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
