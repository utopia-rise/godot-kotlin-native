package godot

import godot.icalls._icall_String
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.NotImplementedError
import kotlin.String

open class EditorScenePostImport internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun getSourceFile(): String {
    val mb = getMethodBind("EditorScenePostImport","get_source_file")
    return _icall_String( mb, this.ptr)
  }

  open fun getSourceFolder(): String {
    val mb = getMethodBind("EditorScenePostImport","get_source_folder")
    return _icall_String( mb, this.ptr)
  }

  open fun post_import(scene: Object): Object {
    throw NotImplementedError("post_import is not implemented for EditorScenePostImport")
  }

  companion object
}
