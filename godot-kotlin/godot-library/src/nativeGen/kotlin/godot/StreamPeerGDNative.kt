package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class StreamPeerGDNative internal constructor(
  _ignore: Any?
) : StreamPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StreamPeerGDNative", "StreamPeerGDNative")
        }

  }

  companion object
}
