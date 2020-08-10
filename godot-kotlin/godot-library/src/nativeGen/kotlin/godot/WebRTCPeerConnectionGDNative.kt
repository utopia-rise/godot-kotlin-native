package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class WebRTCPeerConnectionGDNative internal constructor(
  _ignore: Any?
) : WebRTCPeerConnection(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebRTCPeerConnectionGDNative",
            "WebRTCPeerConnectionGDNative")
        }

  }
}
