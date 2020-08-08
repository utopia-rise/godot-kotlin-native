package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class MultiplayerPeerGDNative internal constructor(
  _ignore: Any?
) : NetworkedMultiplayerPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MultiplayerPeerGDNative", "MultiplayerPeerGDNative")
        }

  }

  companion object
}
