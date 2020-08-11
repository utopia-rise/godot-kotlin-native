// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.BoxContainer
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class BoxContainer internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  open var alignment: Long
    get() {
      val mb = getMethodBind("BoxContainer","get_alignment")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BoxContainer","set_alignment")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun addSpacer(begin: Boolean) {
    val mb = getMethodBind("BoxContainer","add_spacer")
    _icall_Unit_Boolean( mb, this.ptr, begin)
  }

  open fun getAlignment(): BoxContainer.AlignMode {
    val mb = getMethodBind("BoxContainer","get_alignment")
    return BoxContainer.AlignMode.from( _icall_Long( mb, this.ptr))
  }

  open fun setAlignment(alignment: Long) {
    val mb = getMethodBind("BoxContainer","set_alignment")
    _icall_Unit_Long( mb, this.ptr, alignment)
  }

  enum class AlignMode(
    id: Long
  ) {
    ALIGN_BEGIN(0),

    ALIGN_CENTER(1),

    ALIGN_END(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_BEGIN: Long = 0

    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_END: Long = 2
  }
}
