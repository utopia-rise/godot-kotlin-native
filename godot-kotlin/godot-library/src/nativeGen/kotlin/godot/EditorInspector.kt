package godot

import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class EditorInspector internal constructor(
  _ignore: Any?
) : ScrollContainer(_ignore) {
  val objectIdSelected: Signal1<Long> by signal("id")

  val propertyEdited: Signal1<String> by signal("property")

  val propertyKeyed: Signal1<String> by signal("property")

  val propertySelected: Signal1<String> by signal("property")

  val propertyToggled: Signal2<String, Boolean> by signal("property", "checked")

  val resourceSelected: Signal2<Object, String> by signal("res", "prop")

  val restartRequested: Signal0 by signal()

  internal constructor() : this(null)

  open fun _edit_request_change(arg0: Object, arg1: String) {
  }

  open fun _feature_profile_changed() {
  }

  open fun _filter_changed(arg0: String) {
  }

  open fun _multiple_properties_changed(arg0: PoolStringArray, arg1: VariantArray) {
  }

  open fun _node_removed(arg0: Node) {
  }

  open fun _object_id_selected(arg0: String, arg1: Long) {
  }

  open fun _property_changed(
    arg0: String,
    arg1: Variant,
    arg2: String = "",
    arg3: Boolean = false
  ) {
  }

  open fun _property_changed_update_all(
    arg0: String,
    arg1: Variant,
    arg2: String,
    arg3: Boolean
  ) {
  }

  open fun _property_checked(arg0: String, arg1: Boolean) {
  }

  open fun _property_keyed(arg0: String, arg1: Boolean) {
  }

  open fun _property_keyed_with_value(
    arg0: String,
    arg1: Variant,
    arg2: Boolean
  ) {
  }

  open fun _property_selected(arg0: String, arg1: Long) {
  }

  open fun _resource_selected(arg0: String, arg1: Resource) {
  }

  open fun _vscroll_changed(arg0: Double) {
  }

  open fun refresh() {
    val mb = getMethodBind("EditorInspector","refresh")
    _icall_Unit( mb, this.ptr)
  }

  companion object
}
