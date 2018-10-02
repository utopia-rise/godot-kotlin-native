@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GIProbe : VisualInstance {
    constructor() : super("GIProbe")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Subdiv(val id: Long) {
        SUBDIV_64(0),
        SUBDIV_128(1),
        SUBDIV_256(2),
        SUBDIV_512(3),
        SUBDIV_MAX(4),
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
        infix fun from(other: VisualInstance): GIProbe = GIProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): GIProbe = GIProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GIProbe = GIProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GIProbe = GIProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GIProbe = fromVariant(GIProbe(""), other)


        // Constants
        const val SUBDIV_64: Long = 0
        const val SUBDIV_128: Long = 1
        const val SUBDIV_256: Long = 2
        const val SUBDIV_512: Long = 3
        const val SUBDIV_MAX: Long = 4


    }


    // Properties
    open var subdiv: Long
        get() = _icall_Long(getSubdivMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSubdivMethodBind, this.rawMemory, value)


    open var extents: Vector3
        get() = _icall_Vector3(getExtentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, value)
    open fun extents(shedule: (Vector3) -> Unit): Vector3 = extents.apply {
        shedule(this)
        extents = this
    }


    open var dynamicRange: Long
        get() = _icall_Long(getDynamicRangeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDynamicRangeMethodBind, this.rawMemory, value)


    open var energy: Double
        get() = _icall_Double(getEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, value)


    open var propagation: Double
        get() = _icall_Double(getPropagationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPropagationMethodBind, this.rawMemory, value)


    open var bias: Double
        get() = _icall_Double(getBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBiasMethodBind, this.rawMemory, value)


    open var normalBias: Double
        get() = _icall_Double(getNormalBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setNormalBiasMethodBind, this.rawMemory, value)


    open var interior: Boolean
        get() = _icall_Boolean(isInteriorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setInteriorMethodBind, this.rawMemory, value)


    open var compress: Boolean
        get() = _icall_Boolean(isCompressedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCompressMethodBind, this.rawMemory, value)


    open var data: GIProbeData
        get() = _icall_GIProbeData(getProbeDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setProbeDataMethodBind, this.rawMemory, value)




    // Methods
    private val setProbeDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_probe_data") }
    open fun setProbeData(data: GIProbeData) {
        _icall_Unit_Object(setProbeDataMethodBind, this.rawMemory, data)
    }


    private val getProbeDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_probe_data") }
    open fun getProbeData(): GIProbeData {
        return _icall_GIProbeData(getProbeDataMethodBind, this.rawMemory)
    }


    private val setSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_subdiv") }
    open fun setSubdiv(subdiv: Long) {
        _icall_Unit_Long(setSubdivMethodBind, this.rawMemory, subdiv)
    }


    private val getSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_subdiv") }
    open fun getSubdiv(): GIProbe.Subdiv {
        return GIProbe.Subdiv.fromInt(_icall_Long(getSubdivMethodBind, this.rawMemory))
    }


    private val setExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_extents") }
    open fun setExtents(extents: Vector3) {
        _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, extents)
    }


    private val getExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_extents") }
    open fun getExtents(): Vector3 {
        return _icall_Vector3(getExtentsMethodBind, this.rawMemory)
    }


    private val setDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_dynamic_range") }
    open fun setDynamicRange(max: Long) {
        _icall_Unit_Long(setDynamicRangeMethodBind, this.rawMemory, max)
    }


    private val getDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_dynamic_range") }
    open fun getDynamicRange(): Long {
        return _icall_Long(getDynamicRangeMethodBind, this.rawMemory)
    }


    private val setEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_energy") }
    open fun setEnergy(max: Double) {
        _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, max)
    }


    private val getEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_energy") }
    open fun getEnergy(): Double {
        return _icall_Double(getEnergyMethodBind, this.rawMemory)
    }


    private val setBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_bias") }
    open fun setBias(max: Double) {
        _icall_Unit_Double(setBiasMethodBind, this.rawMemory, max)
    }


    private val getBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_bias") }
    open fun getBias(): Double {
        return _icall_Double(getBiasMethodBind, this.rawMemory)
    }


    private val setNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_normal_bias") }
    open fun setNormalBias(max: Double) {
        _icall_Unit_Double(setNormalBiasMethodBind, this.rawMemory, max)
    }


    private val getNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_normal_bias") }
    open fun getNormalBias(): Double {
        return _icall_Double(getNormalBiasMethodBind, this.rawMemory)
    }


    private val setPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_propagation") }
    open fun setPropagation(max: Double) {
        _icall_Unit_Double(setPropagationMethodBind, this.rawMemory, max)
    }


    private val getPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "get_propagation") }
    open fun getPropagation(): Double {
        return _icall_Double(getPropagationMethodBind, this.rawMemory)
    }


    private val setInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_interior") }
    open fun setInterior(enable: Boolean) {
        _icall_Unit_Boolean(setInteriorMethodBind, this.rawMemory, enable)
    }


    private val isInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "is_interior") }
    open fun isInterior(): Boolean {
        return _icall_Boolean(isInteriorMethodBind, this.rawMemory)
    }


    private val setCompressMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "set_compress") }
    open fun setCompress(enable: Boolean) {
        _icall_Unit_Boolean(setCompressMethodBind, this.rawMemory, enable)
    }


    private val isCompressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "is_compressed") }
    open fun isCompressed(): Boolean {
        return _icall_Boolean(isCompressedMethodBind, this.rawMemory)
    }


    private val bakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "bake") }
    open fun bake(fromNode: Object, createVisualDebug: Boolean = false) {
        _icall_Unit_Object_Boolean(bakeMethodBind, this.rawMemory, fromNode, createVisualDebug)
    }


    private val debugBakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbe", "debug_bake") }
    open fun debugBake() {
        _icall_Unit(debugBakeMethodBind, this.rawMemory)
    }


}
