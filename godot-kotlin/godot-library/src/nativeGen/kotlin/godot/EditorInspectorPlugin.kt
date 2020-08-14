// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolStringArray
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_PoolStringArray_Object
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class EditorInspectorPlugin internal constructor() : Reference() {
  open fun addCustomControl(control: Control) {
    val mb = getMethodBind("EditorInspectorPlugin","add_custom_control")
    _icall_Unit_Object( mb, this.ptr, control)
  }

  open fun addPropertyEditor(property: String, editor: Control) {
    val mb = getMethodBind("EditorInspectorPlugin","add_property_editor")
    _icall_Unit_String_Object( mb, this.ptr, property, editor)
  }

  open fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PoolStringArray,
    editor: Control
  ) {
    val mb = getMethodBind("EditorInspectorPlugin","add_property_editor_for_multiple_properties")
    _icall_Unit_String_PoolStringArray_Object( mb, this.ptr, label, properties, editor)
  }

  open fun canHandle(_object: Object): Boolean {
    throw NotImplementedError("can_handle is not implemented for EditorInspectorPlugin")
  }

  open fun parseBegin(_object: Object) {
  }

  open fun parseCategory(_object: Object, category: String) {
  }

  open fun parseEnd() {
  }

  open fun parseProperty(
    _object: Object,
    type: Long,
    path: String,
    hint: Long,
    hintText: String,
    usage: Long
  ): Boolean {
    throw NotImplementedError("parse_property is not implemented for EditorInspectorPlugin")
  }
}
