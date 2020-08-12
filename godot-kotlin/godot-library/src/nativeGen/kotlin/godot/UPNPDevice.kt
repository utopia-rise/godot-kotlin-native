// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.UPNPDevice
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long_String_String_Long
import godot.icalls._icall_Long_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class UPNPDevice internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var descriptionUrl: String
    get() {
      val mb = getMethodBind("UPNPDevice","get_description_url")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNPDevice","set_description_url")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var igdControlUrl: String
    get() {
      val mb = getMethodBind("UPNPDevice","get_igd_control_url")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNPDevice","set_igd_control_url")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var igdOurAddr: String
    get() {
      val mb = getMethodBind("UPNPDevice","get_igd_our_addr")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNPDevice","set_igd_our_addr")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var igdServiceType: String
    get() {
      val mb = getMethodBind("UPNPDevice","get_igd_service_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNPDevice","set_igd_service_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var igdStatus: Long
    get() {
      val mb = getMethodBind("UPNPDevice","get_igd_status")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNPDevice","set_igd_status")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var serviceType: String
    get() {
      val mb = getMethodBind("UPNPDevice","get_service_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("UPNPDevice","set_service_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("UPNPDevice", "UPNPDevice")
        }

  }

  open fun addPortMapping(
    port: Long,
    portInternal: Long = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Long = 0
  ): Long {
    val mb = getMethodBind("UPNPDevice","add_port_mapping")
    return _icall_Long_Long_Long_String_String_Long( mb, this.ptr, port, portInternal, desc, proto,
        duration)
  }

  open fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
    val mb = getMethodBind("UPNPDevice","delete_port_mapping")
    return _icall_Long_Long_String( mb, this.ptr, port, proto)
  }

  open fun getDescriptionUrl(): String {
    val mb = getMethodBind("UPNPDevice","get_description_url")
    return _icall_String( mb, this.ptr)
  }

  open fun getIgdControlUrl(): String {
    val mb = getMethodBind("UPNPDevice","get_igd_control_url")
    return _icall_String( mb, this.ptr)
  }

  open fun getIgdOurAddr(): String {
    val mb = getMethodBind("UPNPDevice","get_igd_our_addr")
    return _icall_String( mb, this.ptr)
  }

  open fun getIgdServiceType(): String {
    val mb = getMethodBind("UPNPDevice","get_igd_service_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getIgdStatus(): UPNPDevice.IGDStatus {
    val mb = getMethodBind("UPNPDevice","get_igd_status")
    return UPNPDevice.IGDStatus.from( _icall_Long( mb, this.ptr))
  }

  open fun getServiceType(): String {
    val mb = getMethodBind("UPNPDevice","get_service_type")
    return _icall_String( mb, this.ptr)
  }

  open fun isValidGateway(): Boolean {
    val mb = getMethodBind("UPNPDevice","is_valid_gateway")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun queryExternalAddress(): String {
    val mb = getMethodBind("UPNPDevice","query_external_address")
    return _icall_String( mb, this.ptr)
  }

  open fun setDescriptionUrl(url: String) {
    val mb = getMethodBind("UPNPDevice","set_description_url")
    _icall_Unit_String( mb, this.ptr, url)
  }

  open fun setIgdControlUrl(url: String) {
    val mb = getMethodBind("UPNPDevice","set_igd_control_url")
    _icall_Unit_String( mb, this.ptr, url)
  }

  open fun setIgdOurAddr(addr: String) {
    val mb = getMethodBind("UPNPDevice","set_igd_our_addr")
    _icall_Unit_String( mb, this.ptr, addr)
  }

  open fun setIgdServiceType(type: String) {
    val mb = getMethodBind("UPNPDevice","set_igd_service_type")
    _icall_Unit_String( mb, this.ptr, type)
  }

  open fun setIgdStatus(status: Long) {
    val mb = getMethodBind("UPNPDevice","set_igd_status")
    _icall_Unit_Long( mb, this.ptr, status)
  }

  open fun setServiceType(type: String) {
    val mb = getMethodBind("UPNPDevice","set_service_type")
    _icall_Unit_String( mb, this.ptr, type)
  }

  enum class IGDStatus(
    id: Long
  ) {
    IGD_STATUS_OK(0),

    IGD_STATUS_HTTP_ERROR(1),

    IGD_STATUS_HTTP_EMPTY(2),

    IGD_STATUS_NO_URLS(3),

    IGD_STATUS_NO_IGD(4),

    IGD_STATUS_DISCONNECTED(5),

    IGD_STATUS_UNKNOWN_DEVICE(6),

    IGD_STATUS_INVALID_CONTROL(7),

    IGD_STATUS_MALLOC_ERROR(8),

    IGD_STATUS_UNKNOWN_ERROR(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
