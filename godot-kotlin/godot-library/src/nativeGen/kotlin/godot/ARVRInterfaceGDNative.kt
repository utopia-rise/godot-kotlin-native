package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class ARVRInterfaceGDNative internal constructor(
  _ignore: Any?
) : ARVRInterface(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ARVRInterfaceGDNative", "ARVRInterfaceGDNative")
        }

  }
}
