// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class GridContainer internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  open var columns: Long
    get() {
      val mb = getMethodBind("GridContainer","get_columns")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridContainer","set_columns")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GridContainer", "GridContainer")
        }

  }

  open fun getColumns(): Long {
    val mb = getMethodBind("GridContainer","get_columns")
    return _icall_Long( mb, this.ptr)
  }

  open fun setColumns(columns: Long) {
    val mb = getMethodBind("GridContainer","set_columns")
    _icall_Unit_Long( mb, this.ptr, columns)
  }
}
