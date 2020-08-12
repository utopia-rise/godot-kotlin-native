// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class RichTextEffect : Resource() {
  override fun __new(): COpaquePointer = invokeConstructor("RichTextEffect", "RichTextEffect")

  open fun _processCustomFx(charFx: CharFXTransform): Boolean {
    throw NotImplementedError("_process_custom_fx is not implemented for RichTextEffect")
  }
}
