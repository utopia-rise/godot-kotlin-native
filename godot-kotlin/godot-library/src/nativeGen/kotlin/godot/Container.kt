package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Object_Rect2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class Container internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val sortChildren: Signal0 by signal()

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Container", "Container")
        }

  }

  open fun _child_minsize_changed() {
  }

  open fun _sort_children() {
  }

  open fun fitChildInRect(child: Control, rect: Rect2) {
    val mb = getMethodBind("Container","fit_child_in_rect")
    _icall_Unit_Object_Rect2( mb, this.ptr, child, rect)
  }

  open fun queueSort() {
    val mb = getMethodBind("Container","queue_sort")
    _icall_Unit( mb, this.ptr)
  }

  companion object {
    final const val NOTIFICATION_SORT_CHILDREN: Long = 50
  }
}
