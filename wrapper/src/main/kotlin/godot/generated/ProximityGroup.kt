@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ProximityGroup : Spatial {
    constructor() : super("ProximityGroup")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DispatchMode(val id: Int) {
        MODE_PROXY(0),
        MODE_SIGNAL(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val BROADCAST: String = "broadcast"
        }
    }


    companion object {
        infix fun from(other: Spatial): ProximityGroup = ProximityGroup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ProximityGroup = ProximityGroup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ProximityGroup = ProximityGroup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ProximityGroup = fromVariant(ProximityGroup(""), other)


        // Constants
        const val MODE_PROXY: Int = 0
        const val MODE_SIGNAL: Int = 1


    }


    // Properties
    open var groupName: String
        get() = _icall_String(getGroupNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setGroupNameMethodBind, this.rawMemory, value)


    open var dispatchMode: Int
        get() = _icall_Int(getDispatchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDispatchModeMethodBind, this.rawMemory, value)


    open var gridRadius: Vector3
        get() = _icall_Vector3(getGridRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setGridRadiusMethodBind, this.rawMemory, value)
    open fun gridRadius(shedule: (Vector3) -> Unit): Vector3 = gridRadius.apply {
        shedule(this)
        gridRadius = this
    }




    // Methods
    private val setGroupNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "set_group_name") }
    open fun setGroupName(name: String) {
        _icall_Unit_String(setGroupNameMethodBind, this.rawMemory, name)
    }


    private val getGroupNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "get_group_name") }
    open fun getGroupName(): String {
        return _icall_String(getGroupNameMethodBind, this.rawMemory)
    }


    private val setDispatchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "set_dispatch_mode") }
    open fun setDispatchMode(mode: Int) {
        _icall_Unit_Int(setDispatchModeMethodBind, this.rawMemory, mode)
    }


    private val getDispatchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "get_dispatch_mode") }
    open fun getDispatchMode(): ProximityGroup.DispatchMode {
        return ProximityGroup.DispatchMode.fromInt(_icall_Int(getDispatchModeMethodBind, this.rawMemory))
    }


    private val setGridRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "set_grid_radius") }
    open fun setGridRadius(radius: Vector3) {
        _icall_Unit_Vector3(setGridRadiusMethodBind, this.rawMemory, radius)
    }


    private val getGridRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "get_grid_radius") }
    open fun getGridRadius(): Vector3 {
        return _icall_Vector3(getGridRadiusMethodBind, this.rawMemory)
    }


    private val broadcastMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProximityGroup", "broadcast") }
    open fun broadcast(name: String, parameters: Variant) {
        _icall_Unit_String_Variant(broadcastMethodBind, this.rawMemory, name, parameters)
    }


    open fun _proximity_group_broadcast(name: String, params: Variant) {
    }


}
