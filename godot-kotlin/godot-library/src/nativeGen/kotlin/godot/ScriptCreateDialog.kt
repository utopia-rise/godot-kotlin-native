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

  open fun _browse_class_in_tree() {
  }

  open fun _browse_path(arg0: Boolean, arg1: Boolean) {
  }

  open fun _built_in_pressed() {
  }

  open fun _class_name_changed(arg0: String) {
  }

  open fun _create() {
  }

  open fun _file_selected(arg0: String) {
  }

  open fun _lang_changed(arg0: Long) {
  }

  open fun _parent_name_changed(arg0: String) {
  }

  open fun _path_changed(arg0: String) {
  }

  open fun _path_entered(arg0: String) {
  }

  open fun _path_hbox_sorted() {
  }

  open fun _template_changed(arg0: Long) {
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

  companion object
}
