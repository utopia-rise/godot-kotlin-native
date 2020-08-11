// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long_Object
import godot.icalls._icall_Node_Long
import godot.icalls._icall_SceneState
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError

open class PackedScene internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PackedScene", "PackedScene")
        }

  }

  open fun _get_bundled_scene(): Dictionary {
    throw NotImplementedError("_get_bundled_scene is not implemented for PackedScene")
  }

  open fun _set_bundled_scene(arg0: Dictionary) {
  }

  open fun canInstance(): Boolean {
    val mb = getMethodBind("PackedScene","can_instance")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getState(): SceneState {
    val mb = getMethodBind("PackedScene","get_state")
    return _icall_SceneState( mb, this.ptr)
  }

  open fun instance(editState: Long = 0): Node {
    val mb = getMethodBind("PackedScene","instance")
    return _icall_Node_Long( mb, this.ptr, editState)
  }

  open fun pack(path: Node): GodotError {
    val mb = getMethodBind("PackedScene","pack")
    return GodotError.byValue( _icall_Long_Object( mb, this.ptr, path).toUInt())
  }

  enum class GenEditState(
    id: Long
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val GEN_EDIT_STATE_DISABLED: Long = 0

    final const val GEN_EDIT_STATE_INSTANCE: Long = 1

    final const val GEN_EDIT_STATE_MAIN: Long = 2
  }
}
