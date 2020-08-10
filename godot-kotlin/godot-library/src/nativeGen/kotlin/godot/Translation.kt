// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.icalls._icall_Long
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class Translation internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var locale: String
    get() {
      val mb = getMethodBind("Translation","get_locale")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Translation","set_locale")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Translation", "Translation")
        }

  }

  open fun _get_messages(): PoolStringArray {
    throw NotImplementedError("_get_messages is not implemented for Translation")
  }

  open fun _set_messages(arg0: PoolStringArray) {
  }

  open fun addMessage(srcMessage: String, xlatedMessage: String) {
    val mb = getMethodBind("Translation","add_message")
    _icall_Unit_String_String( mb, this.ptr, srcMessage, xlatedMessage)
  }

  open fun eraseMessage(srcMessage: String) {
    val mb = getMethodBind("Translation","erase_message")
    _icall_Unit_String( mb, this.ptr, srcMessage)
  }

  open fun getLocale(): String {
    val mb = getMethodBind("Translation","get_locale")
    return _icall_String( mb, this.ptr)
  }

  open fun getMessage(srcMessage: String): String {
    val mb = getMethodBind("Translation","get_message")
    return _icall_String_String( mb, this.ptr, srcMessage)
  }

  open fun getMessageCount(): Long {
    val mb = getMethodBind("Translation","get_message_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMessageList(): PoolStringArray {
    val mb = getMethodBind("Translation","get_message_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun setLocale(locale: String) {
    val mb = getMethodBind("Translation","set_locale")
    _icall_Unit_String( mb, this.ptr, locale)
  }
}
