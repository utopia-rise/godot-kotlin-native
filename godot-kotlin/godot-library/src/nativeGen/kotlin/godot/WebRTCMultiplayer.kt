// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Dictionary_Long
import godot.icalls._icall_Long_Long_Boolean
import godot.icalls._icall_Long_Object_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class WebRTCMultiplayer internal constructor(
  _ignore: Any?
) : NetworkedMultiplayerPeer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebRTCMultiplayer", "WebRTCMultiplayer")
        }

  }

  open fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Long,
    unreliableLifetime: Long = 1
  ): GodotError {
    val mb = getMethodBind("WebRTCMultiplayer","add_peer")
    return GodotError.byValue( _icall_Long_Object_Long_Long( mb, this.ptr, peer, peerId,
        unreliableLifetime).toUInt())
  }

  open fun close() {
    val mb = getMethodBind("WebRTCMultiplayer","close")
    _icall_Unit( mb, this.ptr)
  }

  open fun getPeer(peerId: Long): Dictionary {
    val mb = getMethodBind("WebRTCMultiplayer","get_peer")
    return _icall_Dictionary_Long( mb, this.ptr, peerId)
  }

  open fun getPeers(): Dictionary {
    val mb = getMethodBind("WebRTCMultiplayer","get_peers")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun hasPeer(peerId: Long): Boolean {
    val mb = getMethodBind("WebRTCMultiplayer","has_peer")
    return _icall_Boolean_Long( mb, this.ptr, peerId)
  }

  open fun initialize(peerId: Long, serverCompatibility: Boolean = false): GodotError {
    val mb = getMethodBind("WebRTCMultiplayer","initialize")
    return GodotError.byValue( _icall_Long_Long_Boolean( mb, this.ptr, peerId,
        serverCompatibility).toUInt())
  }

  open fun removePeer(peerId: Long) {
    val mb = getMethodBind("WebRTCMultiplayer","remove_peer")
    _icall_Unit_Long( mb, this.ptr, peerId)
  }
}
