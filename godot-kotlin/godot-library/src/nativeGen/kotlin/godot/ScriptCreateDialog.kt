// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Unit_String_String_Boolean_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class ScriptCreateDialog internal constructor(
  _ignore: Any?
) : ConfirmationDialog(_ignore) {
  val scriptCreated: Signal1<Script> by signal("script")

  internal constructor() : this(null)

  open fun _browseClassInTree() {
  }

  open fun _browsePath(arg0: Boolean, arg1: Boolean) {
  }

  open fun _builtInPressed() {
  }

  open fun _classNameChanged(arg0: String) {
  }

  open fun _create() {
  }

  open fun _fileSelected(arg0: String) {
  }

  open fun _langChanged(arg0: Long) {
  }

  open fun _parentNameChanged(arg0: String) {
  }

  open fun _pathChanged(arg0: String) {
  }

  open fun _pathEntered(arg0: String) {
  }

  open fun _pathHboxSorted() {
  }

  open fun _templateChanged(arg0: Long) {
  }

  open fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true
  ) {
    val mb = getMethodBind("ScriptCreateDialog","config")
    _icall_Unit_String_String_Boolean_Boolean( mb, this.ptr, inherits, path, builtInEnabled,
        loadEnabled)
  }
}
