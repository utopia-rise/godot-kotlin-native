// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_PoolByteArray_Boolean
import godot.icalls._icall_Unit_String_PoolStringArray
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorExportPlugin internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun _exportBegin(
    features: PoolStringArray,
    isDebug: Boolean,
    path: String,
    flags: Long
  ) {
  }

  open fun _exportEnd() {
  }

  open fun _exportFile(
    path: String,
    type: String,
    features: PoolStringArray
  ) {
  }

  open fun addFile(
    path: String,
    file: PoolByteArray,
    remap: Boolean
  ) {
    val mb = getMethodBind("EditorExportPlugin","add_file")
    _icall_Unit_String_PoolByteArray_Boolean( mb, this.ptr, path, file, remap)
  }

  open fun addIosBundleFile(path: String) {
    val mb = getMethodBind("EditorExportPlugin","add_ios_bundle_file")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun addIosCppCode(code: String) {
    val mb = getMethodBind("EditorExportPlugin","add_ios_cpp_code")
    _icall_Unit_String( mb, this.ptr, code)
  }

  open fun addIosFramework(path: String) {
    val mb = getMethodBind("EditorExportPlugin","add_ios_framework")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun addIosLinkerFlags(flags: String) {
    val mb = getMethodBind("EditorExportPlugin","add_ios_linker_flags")
    _icall_Unit_String( mb, this.ptr, flags)
  }

  open fun addIosPlistContent(plistContent: String) {
    val mb = getMethodBind("EditorExportPlugin","add_ios_plist_content")
    _icall_Unit_String( mb, this.ptr, plistContent)
  }

  open fun addIosProjectStaticLib(path: String) {
    val mb = getMethodBind("EditorExportPlugin","add_ios_project_static_lib")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun addSharedObject(path: String, tags: PoolStringArray) {
    val mb = getMethodBind("EditorExportPlugin","add_shared_object")
    _icall_Unit_String_PoolStringArray( mb, this.ptr, path, tags)
  }

  open fun skip() {
    val mb = getMethodBind("EditorExportPlugin","skip")
    _icall_Unit( mb, this.ptr)
  }
}
