package godot

import godot.BackBufferCopy
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.icalls._icall_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.Unit

open class BackBufferCopy internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var copyMode: Long
    get() {
      val mb = getMethodBind("BackBufferCopy","get_copy_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BackBufferCopy","set_copy_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rect: Rect2
    get() {
      val mb = getMethodBind("BackBufferCopy","get_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BackBufferCopy","set_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("BackBufferCopy", "BackBufferCopy")
        }

  }

  open fun rect(schedule: Rect2.() -> Unit): Rect2 = rect.apply{
      schedule(this)
      rect = this
  }


  open fun getCopyMode(): BackBufferCopy.CopyMode {
    val mb = getMethodBind("BackBufferCopy","get_copy_mode")
    return BackBufferCopy.CopyMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getRect(): Rect2 {
    val mb = getMethodBind("BackBufferCopy","get_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun setCopyMode(copyMode: Long) {
    val mb = getMethodBind("BackBufferCopy","set_copy_mode")
    _icall_Unit_Long( mb, this.ptr, copyMode)
  }

  open fun setRect(rect: Rect2) {
    val mb = getMethodBind("BackBufferCopy","set_rect")
    _icall_Unit_Rect2( mb, this.ptr, rect)
  }

  enum class CopyMode(
    id: Long
  ) {
    COPY_MODE_DISABLED(0),

    COPY_MODE_RECT(1),

    COPY_MODE_VIEWPORT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COPY_MODE_DISABLED: Long = 0

    final const val COPY_MODE_RECT: Long = 1

    final const val COPY_MODE_VIEWPORT: Long = 2
  }
}
