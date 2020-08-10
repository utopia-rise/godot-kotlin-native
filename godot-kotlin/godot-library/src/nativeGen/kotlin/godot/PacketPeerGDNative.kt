package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class PacketPeerGDNative internal constructor(
  _ignore: Any?
) : PacketPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PacketPeerGDNative", "PacketPeerGDNative")
        }

  }
}
