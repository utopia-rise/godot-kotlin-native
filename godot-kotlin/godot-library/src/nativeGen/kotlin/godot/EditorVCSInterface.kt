// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Dictionary
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VariantArray_String
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String

open class EditorVCSInterface internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  internal constructor() : this(null)

  open fun _commit(msg: String) {
  }

  open fun _get_file_diff(filePath: String): VariantArray {
    throw NotImplementedError("_get_file_diff is not implemented for EditorVCSInterface")
  }

  open fun _get_modified_files_data(): Dictionary {
    throw NotImplementedError("_get_modified_files_data is not implemented for EditorVCSInterface")
  }

  open fun _get_project_name(): String {
    throw NotImplementedError("_get_project_name is not implemented for EditorVCSInterface")
  }

  open fun _get_vcs_name(): String {
    throw NotImplementedError("_get_vcs_name is not implemented for EditorVCSInterface")
  }

  open fun _initialize(projectRootPath: String): Boolean {
    throw NotImplementedError("_initialize is not implemented for EditorVCSInterface")
  }

  open fun _is_vcs_initialized(): Boolean {
    throw NotImplementedError("_is_vcs_initialized is not implemented for EditorVCSInterface")
  }

  open fun _shut_down(): Boolean {
    throw NotImplementedError("_shut_down is not implemented for EditorVCSInterface")
  }

  open fun _stage_file(filePath: String) {
  }

  open fun _unstage_file(filePath: String) {
  }

  open fun commit(msg: String) {
    val mb = getMethodBind("EditorVCSInterface","commit")
    _icall_Unit_String( mb, this.ptr, msg)
  }

  open fun getFileDiff(filePath: String): VariantArray {
    val mb = getMethodBind("EditorVCSInterface","get_file_diff")
    return _icall_VariantArray_String( mb, this.ptr, filePath)
  }

  open fun getModifiedFilesData(): Dictionary {
    val mb = getMethodBind("EditorVCSInterface","get_modified_files_data")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun getProjectName(): String {
    val mb = getMethodBind("EditorVCSInterface","get_project_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getVcsName(): String {
    val mb = getMethodBind("EditorVCSInterface","get_vcs_name")
    return _icall_String( mb, this.ptr)
  }

  open fun initialize(projectRootPath: String): Boolean {
    val mb = getMethodBind("EditorVCSInterface","initialize")
    return _icall_Boolean_String( mb, this.ptr, projectRootPath)
  }

  open fun isAddonReady(): Boolean {
    val mb = getMethodBind("EditorVCSInterface","is_addon_ready")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVcsInitialized(): Boolean {
    val mb = getMethodBind("EditorVCSInterface","is_vcs_initialized")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun shutDown(): Boolean {
    val mb = getMethodBind("EditorVCSInterface","shut_down")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun stageFile(filePath: String) {
    val mb = getMethodBind("EditorVCSInterface","stage_file")
    _icall_Unit_String( mb, this.ptr, filePath)
  }

  open fun unstageFile(filePath: String) {
    val mb = getMethodBind("EditorVCSInterface","unstage_file")
    _icall_Unit_String( mb, this.ptr, filePath)
  }
}
