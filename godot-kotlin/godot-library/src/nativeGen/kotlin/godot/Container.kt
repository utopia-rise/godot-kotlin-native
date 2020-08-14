// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Rect2
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Object_Rect2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class Container : Control() {
  val sortChildren: Signal0 by signal()

  override fun __new(): COpaquePointer = invokeConstructor("Container", "Container")

  open fun _childMinsizeChanged() {
  }

  open fun _sortChildren() {
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
