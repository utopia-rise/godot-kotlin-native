// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.core.Variant
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long_Object_String_nVariant_Long
import godot.icalls._icall_String
import godot.icalls._icall_Variant
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class Thread : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("Thread", "_Thread")

  open fun getId(): String {
    val mb = getMethodBind("_Thread","get_id")
    return _icall_String( mb, this.ptr)
  }

  open fun isActive(): Boolean {
    val mb = getMethodBind("_Thread","is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun start(
    instance: Object,
    method: String,
    userdata: Variant? = null,
    priority: Long = 1
  ): GodotError {
    val mb = getMethodBind("_Thread","start")
    return GodotError.byValue( _icall_Long_Object_String_nVariant_Long( mb, this.ptr, instance,
        method, userdata, priority).toUInt())
  }

  open fun waitToFinish(): Variant {
    val mb = getMethodBind("_Thread","wait_to_finish")
    return _icall_Variant( mb, this.ptr)
  }

  enum class Priority(
    id: Long
  ) {
    PRIORITY_LOW(0),

    PRIORITY_NORMAL(1),

    PRIORITY_HIGH(2);

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
