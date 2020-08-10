package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class PointMesh internal constructor(
  _ignore: Any?
) : PrimitiveMesh(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PointMesh", "PointMesh")
        }

  }
}
