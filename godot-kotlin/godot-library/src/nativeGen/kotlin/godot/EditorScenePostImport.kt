// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.internal.utils.getMethodBind
import kotlin.NotImplementedError
import kotlin.String

open class EditorScenePostImport internal constructor() : Reference() {
  open fun getSourceFile(): String {
    val mb = getMethodBind("EditorScenePostImport","get_source_file")
    return _icall_String( mb, this.ptr)
  }

  open fun getSourceFolder(): String {
    val mb = getMethodBind("EditorScenePostImport","get_source_folder")
    return _icall_String( mb, this.ptr)
  }

  open fun postImport(scene: Object): Object {
    throw NotImplementedError("post_import is not implemented for EditorScenePostImport")
  }
}
