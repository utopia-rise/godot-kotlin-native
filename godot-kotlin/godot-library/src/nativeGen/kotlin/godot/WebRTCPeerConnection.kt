// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.WebRTCPeerConnection
import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.signal
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Dictionary
import godot.icalls._icall_Long_String_Long_String
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_WebRTCDataChannel_String_Dictionary
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class WebRTCPeerConnection internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  val dataChannelReceived: Signal1<Object> by signal("channel")

  val iceCandidateCreated: Signal3<String, Long, String> by signal("media", "index", "name")

  val sessionDescriptionCreated: Signal2<String, String> by signal("type", "sdp")

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WebRTCPeerConnection", "WebRTCPeerConnection")
        }

  }

  open fun addIceCandidate(
    media: String,
    index: Long,
    name: String
  ): GodotError {
    val mb = getMethodBind("WebRTCPeerConnection","add_ice_candidate")
    return GodotError.byValue( _icall_Long_String_Long_String( mb, this.ptr, media, index,
        name).toUInt())
  }

  open fun close() {
    val mb = getMethodBind("WebRTCPeerConnection","close")
    _icall_Unit( mb, this.ptr)
  }

  open fun createDataChannel(label: String, options: Dictionary = Dictionary()): WebRTCDataChannel {
    val mb = getMethodBind("WebRTCPeerConnection","create_data_channel")
    return _icall_WebRTCDataChannel_String_Dictionary( mb, this.ptr, label, options)
  }

  open fun createOffer(): GodotError {
    val mb = getMethodBind("WebRTCPeerConnection","create_offer")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun getConnectionState(): WebRTCPeerConnection.ConnectionState {
    val mb = getMethodBind("WebRTCPeerConnection","get_connection_state")
    return WebRTCPeerConnection.ConnectionState.from( _icall_Long( mb, this.ptr))
  }

  open fun initialize(configuration: Dictionary = Dictionary()): GodotError {
    val mb = getMethodBind("WebRTCPeerConnection","initialize")
    return GodotError.byValue( _icall_Long_Dictionary( mb, this.ptr, configuration).toUInt())
  }

  open fun poll(): GodotError {
    val mb = getMethodBind("WebRTCPeerConnection","poll")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun setLocalDescription(type: String, sdp: String): GodotError {
    val mb = getMethodBind("WebRTCPeerConnection","set_local_description")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, type, sdp).toUInt())
  }

  open fun setRemoteDescription(type: String, sdp: String): GodotError {
    val mb = getMethodBind("WebRTCPeerConnection","set_remote_description")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, type, sdp).toUInt())
  }

  enum class ConnectionState(
    id: Long
  ) {
    STATE_NEW(0),

    STATE_CONNECTING(1),

    STATE_CONNECTED(2),

    STATE_DISCONNECTED(3),

    STATE_FAILED(4),

    STATE_CLOSED(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STATE_CLOSED: Long = 5

    final const val STATE_CONNECTED: Long = 2

    final const val STATE_CONNECTING: Long = 1

    final const val STATE_DISCONNECTED: Long = 3

    final const val STATE_FAILED: Long = 4

    final const val STATE_NEW: Long = 0
  }
}
