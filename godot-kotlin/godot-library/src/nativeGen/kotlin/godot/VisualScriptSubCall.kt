// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.internal.utils.invokeConstructor
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class VisualScriptSubCall : VisualScriptNode() {
  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptSubCall",
      "VisualScriptSubCall")

  open fun _subcall(arguments: Variant): Variant {
    throw NotImplementedError("_subcall is not implemented for VisualScriptSubCall")
  }
}
