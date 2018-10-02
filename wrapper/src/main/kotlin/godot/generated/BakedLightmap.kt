@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BakedLightmap : VisualInstance {
    constructor() : super("BakedLightmap")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BakeQuality(val id: Long) {
        BAKE_QUALITY_LOW(0),
        BAKE_QUALITY_MEDIUM(1),
        BAKE_QUALITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BakeError(val id: Long) {
        BAKE_ERROR_OK(0),
        BAKE_ERROR_NO_SAVE_PATH(1),
        BAKE_ERROR_NO_MESHES(2),
        BAKE_ERROR_CANT_CREATE_IMAGE(3),
        BAKE_ERROR_USER_ABORTED(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BakeMode(val id: Long) {
        BAKE_MODE_CONE_TRACE(0),
        BAKE_MODE_RAY_TRACE(1),
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
        infix fun from(other: VisualInstance): BakedLightmap = BakedLightmap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): BakedLightmap = BakedLightmap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): BakedLightmap = BakedLightmap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BakedLightmap = BakedLightmap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BakedLightmap = fromVariant(BakedLightmap(""), other)


        // Constants
        const val BAKE_QUALITY_LOW: Long = 0
        const val BAKE_QUALITY_MEDIUM: Long = 1
        const val BAKE_QUALITY_HIGH: Long = 2
        const val BAKE_MODE_CONE_TRACE: Long = 0
        const val BAKE_MODE_RAY_TRACE: Long = 1
        const val BAKE_ERROR_OK: Long = 0
        const val BAKE_ERROR_NO_SAVE_PATH: Long = 1
        const val BAKE_ERROR_NO_MESHES: Long = 2
        const val BAKE_ERROR_CANT_CREATE_IMAGE: Long = 3
        const val BAKE_ERROR_USER_ABORTED: Long = 4


    }


    // Properties
    open var bakeCellSize: Double
        get() = _icall_Double(getBakeCellSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBakeCellSizeMethodBind, this.rawMemory, value)


    open var bakeQuality: Long
        get() = _icall_Long(getBakeQualityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBakeQualityMethodBind, this.rawMemory, value)


    open var bakeMode: Long
        get() = _icall_Long(getBakeModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBakeModeMethodBind, this.rawMemory, value)


    open var bakePropagation: Double
        get() = _icall_Double(getPropagationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPropagationMethodBind, this.rawMemory, value)


    open var bakeEnergy: Double
        get() = _icall_Double(getEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, value)


    open var bakeHdr: Boolean
        get() = _icall_Boolean(isHdrMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHdrMethodBind, this.rawMemory, value)


    open var bakeExtents: Vector3
        get() = _icall_Vector3(getExtentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, value)
    open fun bakeExtents(shedule: (Vector3) -> Unit): Vector3 = bakeExtents.apply {
        shedule(this)
        bakeExtents = this
    }


    open var captureCellSize: Double
        get() = _icall_Double(getCaptureCellSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCaptureCellSizeMethodBind, this.rawMemory, value)


    open var imagePath: String
        get() = _icall_String(getImagePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setImagePathMethodBind, this.rawMemory, value)


    open var lightData: BakedLightmapData
        get() = _icall_BakedLightmapData(getLightDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setLightDataMethodBind, this.rawMemory, value)




    // Methods
    private val setLightDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_light_data") }
    open fun setLightData(data: BakedLightmapData) {
        _icall_Unit_Object(setLightDataMethodBind, this.rawMemory, data)
    }


    private val getLightDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_light_data") }
    open fun getLightData(): BakedLightmapData {
        return _icall_BakedLightmapData(getLightDataMethodBind, this.rawMemory)
    }


    private val setBakeCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_bake_cell_size") }
    open fun setBakeCellSize(bakeCellSize: Double) {
        _icall_Unit_Double(setBakeCellSizeMethodBind, this.rawMemory, bakeCellSize)
    }


    private val getBakeCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_bake_cell_size") }
    open fun getBakeCellSize(): Double {
        return _icall_Double(getBakeCellSizeMethodBind, this.rawMemory)
    }


    private val setCaptureCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_capture_cell_size") }
    open fun setCaptureCellSize(captureCellSize: Double) {
        _icall_Unit_Double(setCaptureCellSizeMethodBind, this.rawMemory, captureCellSize)
    }


    private val getCaptureCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_capture_cell_size") }
    open fun getCaptureCellSize(): Double {
        return _icall_Double(getCaptureCellSizeMethodBind, this.rawMemory)
    }


    private val setBakeQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_bake_quality") }
    open fun setBakeQuality(bakeQuality: Long) {
        _icall_Unit_Long(setBakeQualityMethodBind, this.rawMemory, bakeQuality)
    }


    private val getBakeQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_bake_quality") }
    open fun getBakeQuality(): BakedLightmap.BakeQuality {
        return BakedLightmap.BakeQuality.fromInt(_icall_Long(getBakeQualityMethodBind, this.rawMemory))
    }


    private val setBakeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_bake_mode") }
    open fun setBakeMode(bakeMode: Long) {
        _icall_Unit_Long(setBakeModeMethodBind, this.rawMemory, bakeMode)
    }


    private val getBakeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_bake_mode") }
    open fun getBakeMode(): BakedLightmap.BakeMode {
        return BakedLightmap.BakeMode.fromInt(_icall_Long(getBakeModeMethodBind, this.rawMemory))
    }


    private val setExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_extents") }
    open fun setExtents(extents: Vector3) {
        _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, extents)
    }


    private val getExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_extents") }
    open fun getExtents(): Vector3 {
        return _icall_Vector3(getExtentsMethodBind, this.rawMemory)
    }


    private val setPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_propagation") }
    open fun setPropagation(propagation: Double) {
        _icall_Unit_Double(setPropagationMethodBind, this.rawMemory, propagation)
    }


    private val getPropagationMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_propagation") }
    open fun getPropagation(): Double {
        return _icall_Double(getPropagationMethodBind, this.rawMemory)
    }


    private val setEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_energy") }
    open fun setEnergy(energy: Double) {
        _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, energy)
    }


    private val getEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_energy") }
    open fun getEnergy(): Double {
        return _icall_Double(getEnergyMethodBind, this.rawMemory)
    }


    private val setHdrMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_hdr") }
    open fun setHdr(hdr: Boolean) {
        _icall_Unit_Boolean(setHdrMethodBind, this.rawMemory, hdr)
    }


    private val isHdrMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "is_hdr") }
    open fun isHdr(): Boolean {
        return _icall_Boolean(isHdrMethodBind, this.rawMemory)
    }


    private val setImagePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "set_image_path") }
    open fun setImagePath(imagePath: String) {
        _icall_Unit_String(setImagePathMethodBind, this.rawMemory, imagePath)
    }


    private val getImagePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "get_image_path") }
    open fun getImagePath(): String {
        return _icall_String(getImagePathMethodBind, this.rawMemory)
    }


    private val bakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "bake") }
    open fun bake(fromNode: Object, createVisualDebug: Boolean = false): BakedLightmap.BakeError {
        return BakedLightmap.BakeError.fromInt(_icall_Long_Object_Boolean(bakeMethodBind, this.rawMemory, fromNode, createVisualDebug))
    }


    private val debugBakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmap", "debug_bake") }
    open fun debugBake() {
        _icall_Unit(debugBakeMethodBind, this.rawMemory)
    }


}
