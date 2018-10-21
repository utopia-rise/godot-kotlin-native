@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class OccluderPolygon2D : Resource {
    constructor() : super("OccluderPolygon2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class CullMode(val id: Long) {
        CULL_DISABLED(0),
        CULL_CLOCKWISE(1),
        CULL_COUNTER_CLOCKWISE(2),
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
        infix fun from(other: Resource): OccluderPolygon2D = OccluderPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): OccluderPolygon2D = OccluderPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): OccluderPolygon2D = OccluderPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): OccluderPolygon2D = fromVariant(OccluderPolygon2D(""), other)


        // Constants
        const val CULL_DISABLED: Long = 0
        const val CULL_CLOCKWISE: Long = 1
        const val CULL_COUNTER_CLOCKWISE: Long = 2


    }


    // Properties
    open var closed: Boolean
        get() = _icall_Boolean(isClosedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setClosedMethodBind, this.rawMemory, value)


    open var cullMode: Long
        get() = _icall_Long(getCullModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCullModeMethodBind, this.rawMemory, value)


    open var polygon: PoolVector2Array
        get() = _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, value)




    // Methods
    private val setClosedMethodBind: CPointer<godot_method_bind> by lazy { getMB("OccluderPolygon2D", "set_closed") }
    open fun setClosed(closed: Boolean) {
        _icall_Unit_Boolean(setClosedMethodBind, this.rawMemory, closed)
    }


    private val isClosedMethodBind: CPointer<godot_method_bind> by lazy { getMB("OccluderPolygon2D", "is_closed") }
    open fun isClosed(): Boolean {
        return _icall_Boolean(isClosedMethodBind, this.rawMemory)
    }


    private val setCullModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("OccluderPolygon2D", "set_cull_mode") }
    open fun setCullMode(cullMode: Long) {
        _icall_Unit_Long(setCullModeMethodBind, this.rawMemory, cullMode)
    }


    private val getCullModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("OccluderPolygon2D", "get_cull_mode") }
    open fun getCullMode(): OccluderPolygon2D.CullMode {
        return OccluderPolygon2D.CullMode.fromInt(_icall_Long(getCullModeMethodBind, this.rawMemory))
    }


    private val setPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("OccluderPolygon2D", "set_polygon") }
    open fun setPolygon(polygon: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("OccluderPolygon2D", "get_polygon") }
    open fun getPolygon(): PoolVector2Array {
        return _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
    }


}
