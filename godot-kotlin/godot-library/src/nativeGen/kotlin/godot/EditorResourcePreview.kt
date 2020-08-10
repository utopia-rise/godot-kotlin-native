// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Signal1
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Object_String_Variant
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object_String_Variant
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class EditorResourcePreview internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val previewInvalidated: Signal1<String> by signal("path")

  internal constructor() : this(null)

  open fun _preview_ready(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Long,
    arg4: String,
    arg5: Variant
  ) {
  }

  open fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val mb = getMethodBind("EditorResourcePreview","add_preview_generator")
    _icall_Unit_Object( mb, this.ptr, generator)
  }

  open fun checkForInvalidation(path: String) {
    val mb = getMethodBind("EditorResourcePreview","check_for_invalidation")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun queueEditedResourcePreview(
    resource: Resource,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val mb = getMethodBind("EditorResourcePreview","queue_edited_resource_preview")
    _icall_Unit_Object_Object_String_Variant( mb, this.ptr, resource, receiver, receiverFunc,
        userdata)
  }

  open fun queueResourcePreview(
    path: String,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val mb = getMethodBind("EditorResourcePreview","queue_resource_preview")
    _icall_Unit_String_Object_String_Variant( mb, this.ptr, path, receiver, receiverFunc, userdata)
  }

  open fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val mb = getMethodBind("EditorResourcePreview","remove_preview_generator")
    _icall_Unit_Object( mb, this.ptr, generator)
  }
}
