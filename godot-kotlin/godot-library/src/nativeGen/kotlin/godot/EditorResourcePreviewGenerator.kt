// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String

open class EditorResourcePreviewGenerator internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun can_generate_small_preview(): Boolean {
    throw
        NotImplementedError("can_generate_small_preview is not implemented for EditorResourcePreviewGenerator")
  }

  open fun generate(from: Resource, size: Vector2): Texture {
    throw NotImplementedError("generate is not implemented for EditorResourcePreviewGenerator")
  }

  open fun generate_from_path(path: String, size: Vector2): Texture {
    throw
        NotImplementedError("generate_from_path is not implemented for EditorResourcePreviewGenerator")
  }

  open fun generate_small_preview_automatically(): Boolean {
    throw
        NotImplementedError("generate_small_preview_automatically is not implemented for EditorResourcePreviewGenerator")
  }

  open fun handles(type: String): Boolean {
    throw NotImplementedError("handles is not implemented for EditorResourcePreviewGenerator")
  }
}
