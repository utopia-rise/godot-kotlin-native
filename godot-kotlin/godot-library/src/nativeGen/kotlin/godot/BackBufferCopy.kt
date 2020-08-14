// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.BackBufferCopy
import godot.core.Rect2
import godot.icalls._icall_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class BackBufferCopy : Node2D() {
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

  override fun __new(): COpaquePointer = invokeConstructor("BackBufferCopy", "BackBufferCopy")

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

  companion object
}
