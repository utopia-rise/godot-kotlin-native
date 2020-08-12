// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_String_Variant
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_varargs
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class UndoRedo internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  val versionChanged: Signal0 by signal()

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("UndoRedo", "UndoRedo")
        }

  }

  open fun addDoMethod(
    _object: Object,
    method: String,
    vararg __var_args: Any?
  ) {
    val mb = getMethodBind("UndoRedo","add_do_method")
    _icall_varargs( mb, this.ptr, arrayOf(_object, method, *__var_args))
  }

  open fun addDoProperty(
    _object: Object,
    property: String,
    value: Variant
  ) {
    val mb = getMethodBind("UndoRedo","add_do_property")
    _icall_Unit_Object_String_Variant( mb, this.ptr, _object, property, value)
  }

  open fun addDoReference(_object: Object) {
    val mb = getMethodBind("UndoRedo","add_do_reference")
    _icall_Unit_Object( mb, this.ptr, _object)
  }

  open fun addUndoMethod(
    _object: Object,
    method: String,
    vararg __var_args: Any?
  ) {
    val mb = getMethodBind("UndoRedo","add_undo_method")
    _icall_varargs( mb, this.ptr, arrayOf(_object, method, *__var_args))
  }

  open fun addUndoProperty(
    _object: Object,
    property: String,
    value: Variant
  ) {
    val mb = getMethodBind("UndoRedo","add_undo_property")
    _icall_Unit_Object_String_Variant( mb, this.ptr, _object, property, value)
  }

  open fun addUndoReference(_object: Object) {
    val mb = getMethodBind("UndoRedo","add_undo_reference")
    _icall_Unit_Object( mb, this.ptr, _object)
  }

  open fun clearHistory(increaseVersion: Boolean = true) {
    val mb = getMethodBind("UndoRedo","clear_history")
    _icall_Unit_Boolean( mb, this.ptr, increaseVersion)
  }

  open fun commitAction() {
    val mb = getMethodBind("UndoRedo","commit_action")
    _icall_Unit( mb, this.ptr)
  }

  open fun createAction(name: String, mergeMode: Long = 0) {
    val mb = getMethodBind("UndoRedo","create_action")
    _icall_Unit_String_Long( mb, this.ptr, name, mergeMode)
  }

  open fun getCurrentActionName(): String {
    val mb = getMethodBind("UndoRedo","get_current_action_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getVersion(): Long {
    val mb = getMethodBind("UndoRedo","get_version")
    return _icall_Long( mb, this.ptr)
  }

  open fun hasRedo(): Boolean {
    val mb = getMethodBind("UndoRedo","has_redo")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun hasUndo(): Boolean {
    val mb = getMethodBind("UndoRedo","has_undo")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCommitingAction(): Boolean {
    val mb = getMethodBind("UndoRedo","is_commiting_action")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun redo(): Boolean {
    val mb = getMethodBind("UndoRedo","redo")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun undo(): Boolean {
    val mb = getMethodBind("UndoRedo","undo")
    return _icall_Boolean( mb, this.ptr)
  }

  enum class MergeMode(
    id: Long
  ) {
    MERGE_DISABLE(0),

    MERGE_ENDS(1),

    MERGE_ALL(2);

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
