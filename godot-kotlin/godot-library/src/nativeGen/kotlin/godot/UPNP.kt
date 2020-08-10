// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long_String
import godot.icalls._icall_Long_Long_Long_String_String_Long
import godot.icalls._icall_Long_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_UPNPDevice
import godot.icalls._icall_UPNPDevice_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class UPNP internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var discoverIpv6: Boolean
    get() {
      val mb = getMethodBind("UPNP","is_discover_ipv6")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNP","set_discover_ipv6")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var discoverLocalPort: Long
    get() {
      val mb = getMethodBind("UPNP","get_discover_local_port")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNP","set_discover_local_port")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var discoverMulticastIf: String
    get() {
      val mb = getMethodBind("UPNP","get_discover_multicast_if")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNP","set_discover_multicast_if")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("UPNP", "UPNP")
        }

  }

  open fun addDevice(device: UPNPDevice) {
    val mb = getMethodBind("UPNP","add_device")
    _icall_Unit_Object( mb, this.ptr, device)
  }

  open fun addPortMapping(
    port: Long,
    portInternal: Long = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Long = 0
  ): Long {
    val mb = getMethodBind("UPNP","add_port_mapping")
    return _icall_Long_Long_Long_String_String_Long( mb, this.ptr, port, portInternal, desc, proto,
        duration)
  }

  open fun clearDevices() {
    val mb = getMethodBind("UPNP","clear_devices")
    _icall_Unit( mb, this.ptr)
  }

  open fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
    val mb = getMethodBind("UPNP","delete_port_mapping")
    return _icall_Long_Long_String( mb, this.ptr, port, proto)
  }

  open fun discover(
    timeout: Long = 2000,
    ttl: Long = 2,
    deviceFilter: String = "InternetGatewayDevice"
  ): Long {
    val mb = getMethodBind("UPNP","discover")
    return _icall_Long_Long_Long_String( mb, this.ptr, timeout, ttl, deviceFilter)
  }

  open fun getDevice(index: Long): UPNPDevice {
    val mb = getMethodBind("UPNP","get_device")
    return _icall_UPNPDevice_Long( mb, this.ptr, index)
  }

  open fun getDeviceCount(): Long {
    val mb = getMethodBind("UPNP","get_device_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDiscoverLocalPort(): Long {
    val mb = getMethodBind("UPNP","get_discover_local_port")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDiscoverMulticastIf(): String {
    val mb = getMethodBind("UPNP","get_discover_multicast_if")
    return _icall_String( mb, this.ptr)
  }

  open fun getGateway(): UPNPDevice {
    val mb = getMethodBind("UPNP","get_gateway")
    return _icall_UPNPDevice( mb, this.ptr)
  }

  open fun isDiscoverIpv6(): Boolean {
    val mb = getMethodBind("UPNP","is_discover_ipv6")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun queryExternalAddress(): String {
    val mb = getMethodBind("UPNP","query_external_address")
    return _icall_String( mb, this.ptr)
  }

  open fun removeDevice(index: Long) {
    val mb = getMethodBind("UPNP","remove_device")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setDevice(index: Long, device: UPNPDevice) {
    val mb = getMethodBind("UPNP","set_device")
    _icall_Unit_Long_Object( mb, this.ptr, index, device)
  }

  open fun setDiscoverIpv6(ipv6: Boolean) {
    val mb = getMethodBind("UPNP","set_discover_ipv6")
    _icall_Unit_Boolean( mb, this.ptr, ipv6)
  }

  open fun setDiscoverLocalPort(port: Long) {
    val mb = getMethodBind("UPNP","set_discover_local_port")
    _icall_Unit_Long( mb, this.ptr, port)
  }

  open fun setDiscoverMulticastIf(mIf: String) {
    val mb = getMethodBind("UPNP","set_discover_multicast_if")
    _icall_Unit_String( mb, this.ptr, mIf)
  }

  enum class UPNPResult(
    id: Long
  ) {
    UPNP_RESULT_SUCCESS(0),

    UPNP_RESULT_NOT_AUTHORIZED(1),

    UPNP_RESULT_PORT_MAPPING_NOT_FOUND(2),

    UPNP_RESULT_INCONSISTENT_PARAMETERS(3),

    UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY(4),

    UPNP_RESULT_ACTION_FAILED(5),

    UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED(6),

    UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED(7),

    UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED(8),

    UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD(9),

    UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD(10),

    UPNP_RESULT_NO_PORT_MAPS_AVAILABLE(11),

    UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM(12),

    UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING(13),

    UPNP_RESULT_SAME_PORT_VALUES_REQUIRED(14),

    UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED(15),

    UPNP_RESULT_INVALID_GATEWAY(16),

    UPNP_RESULT_INVALID_PORT(17),

    UPNP_RESULT_INVALID_PROTOCOL(18),

    UPNP_RESULT_INVALID_DURATION(19),

    UPNP_RESULT_INVALID_ARGS(20),

    UPNP_RESULT_INVALID_RESPONSE(21),

    UPNP_RESULT_INVALID_PARAM(22),

    UPNP_RESULT_HTTP_ERROR(23),

    UPNP_RESULT_SOCKET_ERROR(24),

    UPNP_RESULT_MEM_ALLOC_ERROR(25),

    UPNP_RESULT_NO_GATEWAY(26),

    UPNP_RESULT_NO_DEVICES(27),

    UPNP_RESULT_UNKNOWN_ERROR(28);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val UPNP_RESULT_ACTION_FAILED: Long = 5

    final const val UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING: Long = 13

    final const val UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM: Long = 12

    final const val UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD: Long = 10

    final const val UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED: Long = 7

    final const val UPNP_RESULT_HTTP_ERROR: Long = 23

    final const val UPNP_RESULT_INCONSISTENT_PARAMETERS: Long = 3

    final const val UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED: Long = 8

    final const val UPNP_RESULT_INVALID_ARGS: Long = 20

    final const val UPNP_RESULT_INVALID_DURATION: Long = 19

    final const val UPNP_RESULT_INVALID_GATEWAY: Long = 16

    final const val UPNP_RESULT_INVALID_PARAM: Long = 22

    final const val UPNP_RESULT_INVALID_PORT: Long = 17

    final const val UPNP_RESULT_INVALID_PROTOCOL: Long = 18

    final const val UPNP_RESULT_INVALID_RESPONSE: Long = 21

    final const val UPNP_RESULT_MEM_ALLOC_ERROR: Long = 25

    final const val UPNP_RESULT_NOT_AUTHORIZED: Long = 1

    final const val UPNP_RESULT_NO_DEVICES: Long = 27

    final const val UPNP_RESULT_NO_GATEWAY: Long = 26

    final const val UPNP_RESULT_NO_PORT_MAPS_AVAILABLE: Long = 11

    final const val UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY: Long = 4

    final const val UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED: Long = 15

    final const val UPNP_RESULT_PORT_MAPPING_NOT_FOUND: Long = 2

    final const val UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD: Long = 9

    final const val UPNP_RESULT_SAME_PORT_VALUES_REQUIRED: Long = 14

    final const val UPNP_RESULT_SOCKET_ERROR: Long = 24

    final const val UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED: Long = 6

    final const val UPNP_RESULT_SUCCESS: Long = 0

    final const val UPNP_RESULT_UNKNOWN_ERROR: Long = 28
  }
}
