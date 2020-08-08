package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.getConstructor
import kotlin.Any

open class WebRTCDataChannelGDNative internal constructor(
  _ignore: Any?
) : WebRTCDataChannel(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebRTCDataChannelGDNative", "WebRTCDataChannelGDNative")
        }

  }

  companion object
}
