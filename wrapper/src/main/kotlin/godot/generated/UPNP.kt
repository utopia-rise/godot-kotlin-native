@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class UPNP : Reference {
    constructor() : super("UPNP")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class UPNPResult(val id: Long) {
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
        UPNP_RESULT_UNKNOWN_ERROR(28),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Reference): UPNP = UPNP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): UPNP = UPNP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): UPNP = fromVariant(UPNP(""), other)


        // Constants
        const val UPNP_RESULT_SUCCESS: Long = 0
        const val UPNP_RESULT_NOT_AUTHORIZED: Long = 1
        const val UPNP_RESULT_PORT_MAPPING_NOT_FOUND: Long = 2
        const val UPNP_RESULT_INCONSISTENT_PARAMETERS: Long = 3
        const val UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY: Long = 4
        const val UPNP_RESULT_ACTION_FAILED: Long = 5
        const val UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED: Long = 6
        const val UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED: Long = 7
        const val UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED: Long = 8
        const val UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD: Long = 9
        const val UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD: Long = 10
        const val UPNP_RESULT_NO_PORT_MAPS_AVAILABLE: Long = 11
        const val UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM: Long = 12
        const val UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING: Long = 13
        const val UPNP_RESULT_SAME_PORT_VALUES_REQUIRED: Long = 14
        const val UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED: Long = 15
        const val UPNP_RESULT_INVALID_GATEWAY: Long = 16
        const val UPNP_RESULT_INVALID_PORT: Long = 17
        const val UPNP_RESULT_INVALID_PROTOCOL: Long = 18
        const val UPNP_RESULT_INVALID_DURATION: Long = 19
        const val UPNP_RESULT_INVALID_ARGS: Long = 20
        const val UPNP_RESULT_INVALID_RESPONSE: Long = 21
        const val UPNP_RESULT_INVALID_PARAM: Long = 22
        const val UPNP_RESULT_HTTP_ERROR: Long = 23
        const val UPNP_RESULT_SOCKET_ERROR: Long = 24
        const val UPNP_RESULT_MEM_ALLOC_ERROR: Long = 25
        const val UPNP_RESULT_NO_GATEWAY: Long = 26
        const val UPNP_RESULT_NO_DEVICES: Long = 27
        const val UPNP_RESULT_UNKNOWN_ERROR: Long = 28


    }


    // Properties
    open var discoverMulticastIf: String
        get() = _icall_String(getDiscoverMulticastIfMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setDiscoverMulticastIfMethodBind, this.rawMemory, value)


    open var discoverLocalPort: Long
        get() = _icall_Long(getDiscoverLocalPortMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDiscoverLocalPortMethodBind, this.rawMemory, value)


    open var discoverIpv6: Boolean
        get() = _icall_Boolean(isDiscoverIpv6MethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDiscoverIpv6MethodBind, this.rawMemory, value)




    // Methods
    private val getDeviceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_device_count") }
    open fun getDeviceCount(): Long {
        return _icall_Long(getDeviceCountMethodBind, this.rawMemory)
    }


    private val getDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_device") }
    open fun getDevice(index: Long): UPNPDevice {
        return _icall_UPNPDevice_Long(getDeviceMethodBind, this.rawMemory, index)
    }


    private val addDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "add_device") }
    open fun addDevice(device: UPNPDevice) {
        _icall_Unit_Object(addDeviceMethodBind, this.rawMemory, device)
    }


    private val setDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "set_device") }
    open fun setDevice(index: Long, device: UPNPDevice) {
        _icall_Unit_Long_Object(setDeviceMethodBind, this.rawMemory, index, device)
    }


    private val removeDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "remove_device") }
    open fun removeDevice(index: Long) {
        _icall_Unit_Long(removeDeviceMethodBind, this.rawMemory, index)
    }


    private val clearDevicesMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "clear_devices") }
    open fun clearDevices() {
        _icall_Unit(clearDevicesMethodBind, this.rawMemory)
    }


    private val getGatewayMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_gateway") }
    open fun getGateway(): UPNPDevice {
        return _icall_UPNPDevice(getGatewayMethodBind, this.rawMemory)
    }


    private val discoverMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "discover") }
    open fun discover(timeout: Long = 2000, ttl: Long = 2, deviceFilter: String = "InternetGatewayDevice"): Long {
        return _icall_Long_Long_Long_String(discoverMethodBind, this.rawMemory, timeout, ttl, deviceFilter)
    }


    private val queryExternalAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "query_external_address") }
    open fun queryExternalAddress(): String {
        return _icall_String(queryExternalAddressMethodBind, this.rawMemory)
    }


    private val addPortMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "add_port_mapping") }
    open fun addPortMapping(port: Long, portInternal: Long = 0, desc: String = "", proto: String = "UDP", duration: Long = 0): Long {
        return _icall_Long_Long_Long_String_String_Long(addPortMappingMethodBind, this.rawMemory, port, portInternal, desc, proto, duration)
    }


    private val deletePortMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "delete_port_mapping") }
    open fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
        return _icall_Long_Long_String(deletePortMappingMethodBind, this.rawMemory, port, proto)
    }


    private val setDiscoverMulticastIfMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "set_discover_multicast_if") }
    open fun setDiscoverMulticastIf(mIf: String) {
        _icall_Unit_String(setDiscoverMulticastIfMethodBind, this.rawMemory, mIf)
    }


    private val getDiscoverMulticastIfMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_discover_multicast_if") }
    open fun getDiscoverMulticastIf(): String {
        return _icall_String(getDiscoverMulticastIfMethodBind, this.rawMemory)
    }


    private val setDiscoverLocalPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "set_discover_local_port") }
    open fun setDiscoverLocalPort(port: Long) {
        _icall_Unit_Long(setDiscoverLocalPortMethodBind, this.rawMemory, port)
    }


    private val getDiscoverLocalPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_discover_local_port") }
    open fun getDiscoverLocalPort(): Long {
        return _icall_Long(getDiscoverLocalPortMethodBind, this.rawMemory)
    }


    private val setDiscoverIpv6MethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "set_discover_ipv6") }
    open fun setDiscoverIpv6(ipv6: Boolean) {
        _icall_Unit_Boolean(setDiscoverIpv6MethodBind, this.rawMemory, ipv6)
    }


    private val isDiscoverIpv6MethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "is_discover_ipv6") }
    open fun isDiscoverIpv6(): Boolean {
        return _icall_Boolean(isDiscoverIpv6MethodBind, this.rawMemory)
    }


}
