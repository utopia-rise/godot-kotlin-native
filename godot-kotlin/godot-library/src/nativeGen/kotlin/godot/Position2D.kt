// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class Position2D : Node2D() {
  override fun __new(): COpaquePointer = invokeConstructor("Position2D", "Position2D")

  open fun _getGizmoExtents(): Double {
    throw NotImplementedError("_get_gizmo_extents is not implemented for Position2D")
  }

  open fun _setGizmoExtents(extents: Double) {
  }
}
