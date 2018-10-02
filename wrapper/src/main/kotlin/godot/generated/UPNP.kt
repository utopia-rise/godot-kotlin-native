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

    enum class UPNPResult(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val UPNP_RESULT_SUCCESS: Int = 0
        const val UPNP_RESULT_NOT_AUTHORIZED: Int = 1
        const val UPNP_RESULT_PORT_MAPPING_NOT_FOUND: Int = 2
        const val UPNP_RESULT_INCONSISTENT_PARAMETERS: Int = 3
        const val UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY: Int = 4
        const val UPNP_RESULT_ACTION_FAILED: Int = 5
        const val UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED: Int = 6
        const val UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED: Int = 7
        const val UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED: Int = 8
        const val UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD: Int = 9
        const val UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD: Int = 10
        const val UPNP_RESULT_NO_PORT_MAPS_AVAILABLE: Int = 11
        const val UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM: Int = 12
        const val UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING: Int = 13
        const val UPNP_RESULT_SAME_PORT_VALUES_REQUIRED: Int = 14
        const val UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED: Int = 15
        const val UPNP_RESULT_INVALID_GATEWAY: Int = 16
        const val UPNP_RESULT_INVALID_PORT: Int = 17
        const val UPNP_RESULT_INVALID_PROTOCOL: Int = 18
        const val UPNP_RESULT_INVALID_DURATION: Int = 19
        const val UPNP_RESULT_INVALID_ARGS: Int = 20
        const val UPNP_RESULT_INVALID_RESPONSE: Int = 21
        const val UPNP_RESULT_INVALID_PARAM: Int = 22
        const val UPNP_RESULT_HTTP_ERROR: Int = 23
        const val UPNP_RESULT_SOCKET_ERROR: Int = 24
        const val UPNP_RESULT_MEM_ALLOC_ERROR: Int = 25
        const val UPNP_RESULT_NO_GATEWAY: Int = 26
        const val UPNP_RESULT_NO_DEVICES: Int = 27
        const val UPNP_RESULT_UNKNOWN_ERROR: Int = 28


    }


    // Properties
    open var discoverMulticastIf: String
        get() = _icall_String(getDiscoverMulticastIfMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setDiscoverMulticastIfMethodBind, this.rawMemory, value)


    open var discoverLocalPort: Int
        get() = _icall_Int(getDiscoverLocalPortMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDiscoverLocalPortMethodBind, this.rawMemory, value)


    open var discoverIpv6: Boolean
        get() = _icall_Boolean(isDiscoverIpv6MethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDiscoverIpv6MethodBind, this.rawMemory, value)




    // Methods
    private val getDeviceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_device_count") }
    open fun getDeviceCount(): Int {
        return _icall_Int(getDeviceCountMethodBind, this.rawMemory)
    }


    private val getDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_device") }
    open fun getDevice(index: Int): UPNPDevice {
        return _icall_UPNPDevice_Int(getDeviceMethodBind, this.rawMemory, index)
    }


    private val addDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "add_device") }
    open fun addDevice(device: UPNPDevice) {
        _icall_Unit_Object(addDeviceMethodBind, this.rawMemory, device)
    }


    private val setDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "set_device") }
    open fun setDevice(index: Int, device: UPNPDevice) {
        _icall_Unit_Int_Object(setDeviceMethodBind, this.rawMemory, index, device)
    }


    private val removeDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "remove_device") }
    open fun removeDevice(index: Int) {
        _icall_Unit_Int(removeDeviceMethodBind, this.rawMemory, index)
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
    open fun discover(timeout: Int = 2000, ttl: Int = 2, deviceFilter: String = "InternetGatewayDevice"): Int {
        return _icall_Int_Int_Int_String(discoverMethodBind, this.rawMemory, timeout, ttl, deviceFilter)
    }


    private val queryExternalAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "query_external_address") }
    open fun queryExternalAddress(): String {
        return _icall_String(queryExternalAddressMethodBind, this.rawMemory)
    }


    private val addPortMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "add_port_mapping") }
    open fun addPortMapping(port: Int, portInternal: Int = 0, desc: String = "", proto: String = "UDP", duration: Int = 0): Int {
        return _icall_Int_Int_Int_String_String_Int(addPortMappingMethodBind, this.rawMemory, port, portInternal, desc, proto, duration)
    }


    private val deletePortMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "delete_port_mapping") }
    open fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
        return _icall_Int_Int_String(deletePortMappingMethodBind, this.rawMemory, port, proto)
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
    open fun setDiscoverLocalPort(port: Int) {
        _icall_Unit_Int(setDiscoverLocalPortMethodBind, this.rawMemory, port)
    }


    private val getDiscoverLocalPortMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNP", "get_discover_local_port") }
    open fun getDiscoverLocalPort(): Int {
        return _icall_Int(getDiscoverLocalPortMethodBind, this.rawMemory)
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
