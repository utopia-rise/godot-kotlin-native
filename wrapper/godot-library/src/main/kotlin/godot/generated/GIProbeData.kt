@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GIProbeData : Resource {
    constructor() : super("GIProbeData")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): GIProbeData = GIProbeData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): GIProbeData = GIProbeData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GIProbeData = GIProbeData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GIProbeData = fromVariant(GIProbeData(""), other)


        // Constants


    }


    // Properties
    open var bounds: AABB
        get() = _icall_AABB(getBoundsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_AABB(setBoundsMethodBind, this.rawMemory, value)
    open fun bounds(shedule: (AABB) -> Unit): AABB = bounds.apply {
        shedule(this)
        bounds = this
    }


    open var cellSize: Double
        get() = _icall_Double(getCellSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCellSizeMethodBind, this.rawMemory, value)


    open var toCellXform: Transform
        get() = _icall_Transform(getToCellXformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setToCellXformMethodBind, this.rawMemory, value)
    open fun toCellXform(shedule: (Transform) -> Unit): Transform = toCellXform.apply {
        shedule(this)
        toCellXform = this
    }


    open var dynamicData: PoolIntArray
        get() = _icall_PoolIntArray(getDynamicDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolIntArray(setDynamicDataMethodBind, this.rawMemory, value)


    open var dynamicRange: Long
        get() = _icall_Long(getDynamicRangeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDynamicRangeMethodBind, this.rawMemory, value)


    open var energy: Double
        get() = _icall_Double(getEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, value)


    open var bias: Double
        get() = _icall_Double(getBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBiasMethodBind, this.rawMemory, value)


    open var normalBias: Double
        get() = _icall_Double(getNormalBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setNormalBiasMethodBind, this.rawMemory, value)


    open var propagation: Double
        get() = _icall_Double(getPropagationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPropagationMethodBind, this.rawMemory, value)


    open var interior: Boolean
        get() = _icall_Boolean(isInteriorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setInteriorMethodBind, this.rawMemory, value)


    open var compress: Boolean
        get() = _icall_Boolean(isCompressedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCompressMethodBind, this.rawMemory, value)




    // Methods
    private val setBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_bounds") }
    open fun setBounds(bounds: AABB) {
        _icall_Unit_AABB(setBoundsMethodBind, this.rawMemory, bounds)
    }


    private val getBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_bounds") }
    open fun getBounds(): AABB {
        return _icall_AABB(getBoundsMethodBind, this.rawMemory)
    }


    private val setCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_cell_size") }
    open fun setCellSize(cellSize: Double) {
        _icall_Unit_Double(setCellSizeMethodBind, this.rawMemory, cellSize)
    }


    private val getCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_cell_size") }
    open fun getCellSize(): Double {
        return _icall_Double(getCellSizeMethodBind, this.rawMemory)
    }


    private val setToCellXformMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_to_cell_xform") }
    open fun setToCellXform(toCellXform: Transform) {
        _icall_Unit_Transform(setToCellXformMethodBind, this.rawMemory, toCellXform)
    }


    private val getToCellXformMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_to_cell_xform") }
    open fun getToCellXform(): Transform {
        return _icall_Transform(getToCellXformMethodBind, this.rawMemory)
    }


    private val setDynamicDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_dynamic_data") }
    open fun setDynamicData(dynamicData: PoolIntArray) {
        _icall_Unit_PoolIntArray(setDynamicDataMethodBind, this.rawMemory, dynamicData)
    }


    private val getDynamicDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_dynamic_data") }
    open fun getDynamicData(): PoolIntArray {
        return _icall_PoolIntArray(getDynamicDataMethodBind, this.rawMemory)
    }


    private val setDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_dynamic_range") }
    open fun setDynamicRange(dynamicRange: Long) {
        _icall_Unit_Long(setDynamicRangeMethodBind, this.rawMemory, dynamicRange)
    }


    private val getDynamicRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_dynamic_range") }
    open fun getDynamicRange(): Long {
        return _icall_Long(getDynamicRangeMethodBind, this.rawMemory)
    }


    private val setEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_energy") }
    open fun setEnergy(energy: Double) {
        _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, energy)
    }


    private val getEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_energy") }
    open fun getEnergy(): Double {
        return _icall_Double(getEnergyMethodBind, this.rawMemory)
    }


    private val setBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_bias") }
    open fun setBias(bias: Double) {
        _icall_Unit_Double(setBiasMethodBind, this.rawMemory, bias)
    }


    private val getBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_bias") }
    open fun getBias(): Double {
        return _icall_Double(getBiasMethodBind, this.rawMemory)
    }


    private val setNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_normal_bias") }
    open fun setNormalBias(bias: Double) {
        _icall_Unit_Double(setNormalBiasMethodBind, this.rawMemory, bias)
    }


    private val getNormalBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_normal_bias") }
    open fun getNormalBias(): Double {
        return _icall_Double(getNormalBiasMethodBind, this.rawMemory)
    }


    private val setPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_propagation") }
    open fun setPropagation(propagation: Double) {
        _icall_Unit_Double(setPropagationMethodBind, this.rawMemory, propagation)
    }


    private val getPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "get_propagation") }
    open fun getPropagation(): Double {
        return _icall_Double(getPropagationMethodBind, this.rawMemory)
    }


    private val setInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_interior") }
    open fun setInterior(interior: Boolean) {
        _icall_Unit_Boolean(setInteriorMethodBind, this.rawMemory, interior)
    }


    private val isInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "is_interior") }
    open fun isInterior(): Boolean {
        return _icall_Boolean(isInteriorMethodBind, this.rawMemory)
    }


    private val setCompressMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "set_compress") }
    open fun setCompress(compress: Boolean) {
        _icall_Unit_Boolean(setCompressMethodBind, this.rawMemory, compress)
    }


    private val isCompressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GIProbeData", "is_compressed") }
    open fun isCompressed(): Boolean {
        return _icall_Boolean(isCompressedMethodBind, this.rawMemory)
    }


}
