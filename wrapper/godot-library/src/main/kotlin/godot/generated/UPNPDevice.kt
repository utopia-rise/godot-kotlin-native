@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class UPNPDevice : Reference {
    constructor() : super("UPNPDevice")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class IGDStatus(val id: Long) {
        IGD_STATUS_OK(0),
        IGD_STATUS_HTTP_ERROR(1),
        IGD_STATUS_HTTP_EMPTY(2),
        IGD_STATUS_NO_URLS(3),
        IGD_STATUS_NO_IGD(4),
        IGD_STATUS_DISCONNECTED(5),
        IGD_STATUS_UNKNOWN_DEVICE(6),
        IGD_STATUS_INVALID_CONTROL(7),
        IGD_STATUS_MALLOC_ERROR(8),
        IGD_STATUS_UNKNOWN_ERROR(9),
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
        infix fun from(other: Reference): UPNPDevice = UPNPDevice("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): UPNPDevice = UPNPDevice("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): UPNPDevice = fromVariant(UPNPDevice(""), other)


        // Constants
        const val IGD_STATUS_OK: Long = 0
        const val IGD_STATUS_HTTP_ERROR: Long = 1
        const val IGD_STATUS_HTTP_EMPTY: Long = 2
        const val IGD_STATUS_NO_URLS: Long = 3
        const val IGD_STATUS_NO_IGD: Long = 4
        const val IGD_STATUS_DISCONNECTED: Long = 5
        const val IGD_STATUS_UNKNOWN_DEVICE: Long = 6
        const val IGD_STATUS_INVALID_CONTROL: Long = 7
        const val IGD_STATUS_MALLOC_ERROR: Long = 8
        const val IGD_STATUS_UNKNOWN_ERROR: Long = 9


    }


    // Properties
    open var descriptionUrl: String
        get() = _icall_String(getDescriptionUrlMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setDescriptionUrlMethodBind, this.rawMemory, value)


    open var serviceType: String
        get() = _icall_String(getServiceTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setServiceTypeMethodBind, this.rawMemory, value)


    open var igdControlUrl: String
        get() = _icall_String(getIgdControlUrlMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setIgdControlUrlMethodBind, this.rawMemory, value)


    open var igdServiceType: String
        get() = _icall_String(getIgdServiceTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setIgdServiceTypeMethodBind, this.rawMemory, value)


    open var igdOurAddr: String
        get() = _icall_String(getIgdOurAddrMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setIgdOurAddrMethodBind, this.rawMemory, value)


    open var igdStatus: Long
        get() = _icall_Long(getIgdStatusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setIgdStatusMethodBind, this.rawMemory, value)




    // Methods
    private val isValidGatewayMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "is_valid_gateway") }
    open fun isValidGateway(): Boolean {
        return _icall_Boolean(isValidGatewayMethodBind, this.rawMemory)
    }


    private val queryExternalAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "query_external_address") }
    open fun queryExternalAddress(): String {
        return _icall_String(queryExternalAddressMethodBind, this.rawMemory)
    }


    private val addPortMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "add_port_mapping") }
    open fun addPortMapping(port: Long, portInternal: Long = 0, desc: String = "", proto: String = "UDP", duration: Long = 0): Long {
        return _icall_Long_Long_Long_String_String_Long(addPortMappingMethodBind, this.rawMemory, port, portInternal, desc, proto, duration)
    }


    private val deletePortMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "delete_port_mapping") }
    open fun deletePortMapping(port: Long, proto: String = "UDP"): Long {
        return _icall_Long_Long_String(deletePortMappingMethodBind, this.rawMemory, port, proto)
    }


    private val setDescriptionUrlMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "set_description_url") }
    open fun setDescriptionUrl(url: String) {
        _icall_Unit_String(setDescriptionUrlMethodBind, this.rawMemory, url)
    }


    private val getDescriptionUrlMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "get_description_url") }
    open fun getDescriptionUrl(): String {
        return _icall_String(getDescriptionUrlMethodBind, this.rawMemory)
    }


    private val setServiceTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "set_service_type") }
    open fun setServiceType(type: String) {
        _icall_Unit_String(setServiceTypeMethodBind, this.rawMemory, type)
    }


    private val getServiceTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "get_service_type") }
    open fun getServiceType(): String {
        return _icall_String(getServiceTypeMethodBind, this.rawMemory)
    }


    private val setIgdControlUrlMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "set_igd_control_url") }
    open fun setIgdControlUrl(url: String) {
        _icall_Unit_String(setIgdControlUrlMethodBind, this.rawMemory, url)
    }


    private val getIgdControlUrlMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "get_igd_control_url") }
    open fun getIgdControlUrl(): String {
        return _icall_String(getIgdControlUrlMethodBind, this.rawMemory)
    }


    private val setIgdServiceTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "set_igd_service_type") }
    open fun setIgdServiceType(type: String) {
        _icall_Unit_String(setIgdServiceTypeMethodBind, this.rawMemory, type)
    }


    private val getIgdServiceTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "get_igd_service_type") }
    open fun getIgdServiceType(): String {
        return _icall_String(getIgdServiceTypeMethodBind, this.rawMemory)
    }


    private val setIgdOurAddrMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "set_igd_our_addr") }
    open fun setIgdOurAddr(addr: String) {
        _icall_Unit_String(setIgdOurAddrMethodBind, this.rawMemory, addr)
    }


    private val getIgdOurAddrMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "get_igd_our_addr") }
    open fun getIgdOurAddr(): String {
        return _icall_String(getIgdOurAddrMethodBind, this.rawMemory)
    }


    private val setIgdStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "set_igd_status") }
    open fun setIgdStatus(status: Long) {
        _icall_Unit_Long(setIgdStatusMethodBind, this.rawMemory, status)
    }


    private val getIgdStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("UPNPDevice", "get_igd_status") }
    open fun getIgdStatus(): UPNPDevice.IGDStatus {
        return UPNPDevice.IGDStatus.fromInt(_icall_Long(getIgdStatusMethodBind, this.rawMemory))
    }


}
