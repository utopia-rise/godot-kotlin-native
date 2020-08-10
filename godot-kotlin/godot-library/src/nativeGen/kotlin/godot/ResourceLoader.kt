// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.core.PoolStringArray
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_PoolStringArray_String
import godot.icalls._icall_ResourceInteractiveLoader_String_String
import godot.icalls._icall_Resource_String_String_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object ResourceLoader : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("ResourceLoader".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton ResourceLoader" }
        this@ResourceLoader.ptr = ptr
    }
  }

  fun exists(path: String, typeHint: String = ""): Boolean {
    val mb = getMethodBind("_ResourceLoader","exists")
    return _icall_Boolean_String_String( mb, this.ptr, path, typeHint)
  }

  fun getDependencies(path: String): PoolStringArray {
    val mb = getMethodBind("_ResourceLoader","get_dependencies")
    return _icall_PoolStringArray_String( mb, this.ptr, path)
  }

  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    val mb = getMethodBind("_ResourceLoader","get_recognized_extensions_for_type")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  fun has(path: String): Boolean {
    val mb = getMethodBind("_ResourceLoader","has")
    return _icall_Boolean_String( mb, this.ptr, path)
  }

  fun hasCached(path: String): Boolean {
    val mb = getMethodBind("_ResourceLoader","has_cached")
    return _icall_Boolean_String( mb, this.ptr, path)
  }

  fun load(
    path: String,
    typeHint: String = "",
    noCache: Boolean = false
  ): Resource {
    val mb = getMethodBind("_ResourceLoader","load")
    return _icall_Resource_String_String_Boolean( mb, this.ptr, path, typeHint, noCache)
  }

  fun loadInteractive(path: String, typeHint: String = ""): ResourceInteractiveLoader {
    val mb = getMethodBind("_ResourceLoader","load_interactive")
    return _icall_ResourceInteractiveLoader_String_String( mb, this.ptr, path, typeHint)
  }

  fun setAbortOnMissingResources(abort: Boolean) {
    val mb = getMethodBind("_ResourceLoader","set_abort_on_missing_resources")
    _icall_Unit_Boolean( mb, this.ptr, abort)
  }
}
