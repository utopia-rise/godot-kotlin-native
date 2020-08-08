package godot

import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_EditorFileSystemDirectory
import godot.icalls._icall_EditorFileSystemDirectory_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorFileSystemDirectory internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  internal constructor() : this(null)

  open fun findDirIndex(name: String): Long {
    val mb = getMethodBind("EditorFileSystemDirectory","find_dir_index")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun findFileIndex(name: String): Long {
    val mb = getMethodBind("EditorFileSystemDirectory","find_file_index")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun getFile(idx: Long): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getFileCount(): Long {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFileImportIsValid(idx: Long): Boolean {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file_import_is_valid")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun getFilePath(idx: Long): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file_path")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getFileScriptClassExtends(idx: Long): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file_script_class_extends")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getFileScriptClassName(idx: Long): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file_script_class_name")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getFileType(idx: Long): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_file_type")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getName(): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getParent(): EditorFileSystemDirectory {
    val mb = getMethodBind("EditorFileSystemDirectory","get_parent")
    return _icall_EditorFileSystemDirectory( mb, this.ptr)
  }

  open fun getPath(): String {
    val mb = getMethodBind("EditorFileSystemDirectory","get_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getSubdir(idx: Long): EditorFileSystemDirectory {
    val mb = getMethodBind("EditorFileSystemDirectory","get_subdir")
    return _icall_EditorFileSystemDirectory_Long( mb, this.ptr, idx)
  }

  open fun getSubdirCount(): Long {
    val mb = getMethodBind("EditorFileSystemDirectory","get_subdir_count")
    return _icall_Long( mb, this.ptr)
  }

  companion object
}
