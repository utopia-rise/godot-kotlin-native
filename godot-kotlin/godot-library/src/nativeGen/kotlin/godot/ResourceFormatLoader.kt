// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolStringArray
import godot.core.Variant
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class ResourceFormatLoader : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("ResourceFormatLoader",
      "ResourceFormatLoader")

  open fun getDependencies(path: String, addTypes: String) {
  }

  open fun getRecognizedExtensions(): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatLoader")
  }

  open fun getResourceType(path: String): String {
    throw NotImplementedError("get_resource_type is not implemented for ResourceFormatLoader")
  }

  open fun handlesType(typename: String): Boolean {
    throw NotImplementedError("handles_type is not implemented for ResourceFormatLoader")
  }

  open fun load(path: String, originalPath: String): Variant {
    throw NotImplementedError("load is not implemented for ResourceFormatLoader")
  }

  open fun renameDependencies(path: String, renames: String): Long {
    throw NotImplementedError("rename_dependencies is not implemented for ResourceFormatLoader")
  }
}
