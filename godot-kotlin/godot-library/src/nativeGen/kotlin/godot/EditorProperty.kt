package godot

import godot.core.PoolStringArray
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Object
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Variant_String_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorProperty internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  val multiplePropertiesChanged: Signal2<PoolStringArray, VariantArray> by signal("properties",
      "value")

  val objectIdSelected: Signal2<String, Long> by signal("property", "id")

  val propertyChanged: Signal2<String, Variant> by signal("property", "value")

  val propertyChecked: Signal2<String, String> by signal("property", "bool")

  val propertyKeyed: Signal1<String> by signal("property")

  val propertyKeyedWithValue: Signal2<String, Variant> by signal("property", "value")

  val resourceSelected: Signal2<String, Resource> by signal("path", "resource")

  val selected: Signal2<String, Long> by signal("path", "focusable_idx")

  open var checkable: Boolean
    get() {
      val mb = getMethodBind("EditorProperty","is_checkable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorProperty","set_checkable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var checked: Boolean
    get() {
      val mb = getMethodBind("EditorProperty","is_checked")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorProperty","set_checked")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var drawRed: Boolean
    get() {
      val mb = getMethodBind("EditorProperty","is_draw_red")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorProperty","set_draw_red")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var keying: Boolean
    get() {
      val mb = getMethodBind("EditorProperty","is_keying")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorProperty","set_keying")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var label: String
    get() {
      val mb = getMethodBind("EditorProperty","get_label")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorProperty","set_label")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var readOnly: Boolean
    get() {
      val mb = getMethodBind("EditorProperty","is_read_only")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorProperty","set_read_only")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _focusable_focused(arg0: Long) {
  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun addFocusable(control: Control) {
    val mb = getMethodBind("EditorProperty","add_focusable")
    _icall_Unit_Object( mb, this.ptr, control)
  }

  open fun emitChanged(
    property: String,
    value: Variant,
    field: String = "",
    changing: Boolean = false
  ) {
    val mb = getMethodBind("EditorProperty","emit_changed")
    _icall_Unit_String_Variant_String_Boolean( mb, this.ptr, property, value, field, changing)
  }

  open fun getEditedObject(): Object {
    val mb = getMethodBind("EditorProperty","get_edited_object")
    return _icall_Object( mb, this.ptr)
  }

  open fun getEditedProperty(): String {
    val mb = getMethodBind("EditorProperty","get_edited_property")
    return _icall_String( mb, this.ptr)
  }

  open fun getLabel(): String {
    val mb = getMethodBind("EditorProperty","get_label")
    return _icall_String( mb, this.ptr)
  }

  open fun getTooltipText(): String {
    val mb = getMethodBind("EditorProperty","get_tooltip_text")
    return _icall_String( mb, this.ptr)
  }

  open fun isCheckable(): Boolean {
    val mb = getMethodBind("EditorProperty","is_checkable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isChecked(): Boolean {
    val mb = getMethodBind("EditorProperty","is_checked")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDrawRed(): Boolean {
    val mb = getMethodBind("EditorProperty","is_draw_red")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isKeying(): Boolean {
    val mb = getMethodBind("EditorProperty","is_keying")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isReadOnly(): Boolean {
    val mb = getMethodBind("EditorProperty","is_read_only")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBottomEditor(editor: Control) {
    val mb = getMethodBind("EditorProperty","set_bottom_editor")
    _icall_Unit_Object( mb, this.ptr, editor)
  }

  open fun setCheckable(checkable: Boolean) {
    val mb = getMethodBind("EditorProperty","set_checkable")
    _icall_Unit_Boolean( mb, this.ptr, checkable)
  }

  open fun setChecked(checked: Boolean) {
    val mb = getMethodBind("EditorProperty","set_checked")
    _icall_Unit_Boolean( mb, this.ptr, checked)
  }

  open fun setDrawRed(drawRed: Boolean) {
    val mb = getMethodBind("EditorProperty","set_draw_red")
    _icall_Unit_Boolean( mb, this.ptr, drawRed)
  }

  open fun setKeying(keying: Boolean) {
    val mb = getMethodBind("EditorProperty","set_keying")
    _icall_Unit_Boolean( mb, this.ptr, keying)
  }

  open fun setLabel(text: String) {
    val mb = getMethodBind("EditorProperty","set_label")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setReadOnly(readOnly: Boolean) {
    val mb = getMethodBind("EditorProperty","set_read_only")
    _icall_Unit_Boolean( mb, this.ptr, readOnly)
  }

  open fun update_property() {
  }

  companion object
}
