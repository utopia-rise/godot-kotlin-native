// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class GridContainer : Container() {
  open var columns: Long
    get() {
      val mb = getMethodBind("GridContainer","get_columns")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridContainer","set_columns")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("GridContainer", "GridContainer")

  open fun getColumns(): Long {
    val mb = getMethodBind("GridContainer","get_columns")
    return _icall_Long( mb, this.ptr)
  }

  open fun setColumns(columns: Long) {
    val mb = getMethodBind("GridContainer","set_columns")
    _icall_Unit_Long( mb, this.ptr, columns)
  }
}
