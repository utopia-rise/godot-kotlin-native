package godot

import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_EditorFileSystemDirectory
import godot.icalls._icall_EditorFileSystemDirectory_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.String

open class EditorFileSystem internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val filesystemChanged: Signal0 by signal()

  val resourcesReimported: Signal1<PoolStringArray> by signal("resources")

  val resourcesReload: Signal1<PoolStringArray> by signal("resources")

  val sourcesChanged: Signal1<Boolean> by signal("exist")

  internal constructor() : this(null)

  open fun getFileType(path: String): String {
    val mb = getMethodBind("EditorFileSystem","get_file_type")
    return _icall_String_String( mb, this.ptr, path)
  }

  open fun getFilesystem(): EditorFileSystemDirectory {
    val mb = getMethodBind("EditorFileSystem","get_filesystem")
    return _icall_EditorFileSystemDirectory( mb, this.ptr)
  }

  open fun getFilesystemPath(path: String): EditorFileSystemDirectory {
    val mb = getMethodBind("EditorFileSystem","get_filesystem_path")
    return _icall_EditorFileSystemDirectory_String( mb, this.ptr, path)
  }

  open fun getScanningProgress(): Double {
    val mb = getMethodBind("EditorFileSystem","get_scanning_progress")
    return _icall_Double( mb, this.ptr)
  }

  open fun isScanning(): Boolean {
    val mb = getMethodBind("EditorFileSystem","is_scanning")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun scan() {
    val mb = getMethodBind("EditorFileSystem","scan")
    _icall_Unit( mb, this.ptr)
  }

  open fun scanSources() {
    val mb = getMethodBind("EditorFileSystem","scan_sources")
    _icall_Unit( mb, this.ptr)
  }

  open fun updateFile(path: String) {
    val mb = getMethodBind("EditorFileSystem","update_file")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun updateScriptClasses() {
    val mb = getMethodBind("EditorFileSystem","update_script_classes")
    _icall_Unit( mb, this.ptr)
  }
}
