@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BakedLightmapData : Resource {
    constructor() : super("BakedLightmapData")
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
        infix fun from(other: Resource): BakedLightmapData = BakedLightmapData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): BakedLightmapData = BakedLightmapData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BakedLightmapData = BakedLightmapData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BakedLightmapData = fromVariant(BakedLightmapData(""), other)


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


    open var cellSpaceTransform: Transform
        get() = _icall_Transform(getCellSpaceTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setCellSpaceTransformMethodBind, this.rawMemory, value)
    open fun cellSpaceTransform(shedule: (Transform) -> Unit): Transform = cellSpaceTransform.apply {
        shedule(this)
        cellSpaceTransform = this
    }


    open var cellSubdiv: Long
        get() = _icall_Long(getCellSubdivMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCellSubdivMethodBind, this.rawMemory, value)


    open var energy: Double
        get() = _icall_Double(getEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, value)


    open var octree: PoolByteArray
        get() = _icall_PoolByteArray(getOctreeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolByteArray(setOctreeMethodBind, this.rawMemory, value)




    // Methods
    open fun _set_user_data(data: GDArray) {
    }


    open fun _get_user_data(): GDArray {
        throw NotImplementedError("_get_user_data is not implemented for BakedLightmapData")
    }


    private val setBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "set_bounds") }
    open fun setBounds(bounds: AABB) {
        _icall_Unit_AABB(setBoundsMethodBind, this.rawMemory, bounds)
    }


    private val getBoundsMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_bounds") }
    open fun getBounds(): AABB {
        return _icall_AABB(getBoundsMethodBind, this.rawMemory)
    }


    private val setCellSpaceTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "set_cell_space_transform") }
    open fun setCellSpaceTransform(xform: Transform) {
        _icall_Unit_Transform(setCellSpaceTransformMethodBind, this.rawMemory, xform)
    }


    private val getCellSpaceTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_cell_space_transform") }
    open fun getCellSpaceTransform(): Transform {
        return _icall_Transform(getCellSpaceTransformMethodBind, this.rawMemory)
    }


    private val setCellSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "set_cell_subdiv") }
    open fun setCellSubdiv(cellSubdiv: Long) {
        _icall_Unit_Long(setCellSubdivMethodBind, this.rawMemory, cellSubdiv)
    }


    private val getCellSubdivMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_cell_subdiv") }
    open fun getCellSubdiv(): Long {
        return _icall_Long(getCellSubdivMethodBind, this.rawMemory)
    }


    private val setOctreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "set_octree") }
    open fun setOctree(octree: PoolByteArray) {
        _icall_Unit_PoolByteArray(setOctreeMethodBind, this.rawMemory, octree)
    }


    private val getOctreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_octree") }
    open fun getOctree(): PoolByteArray {
        return _icall_PoolByteArray(getOctreeMethodBind, this.rawMemory)
    }


    private val setEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "set_energy") }
    open fun setEnergy(energy: Double) {
        _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, energy)
    }


    private val getEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_energy") }
    open fun getEnergy(): Double {
        return _icall_Double(getEnergyMethodBind, this.rawMemory)
    }


    private val addUserMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "add_user") }
    open fun addUser(path: NodePath, lightmap: Texture, instance: Long) {
        _icall_Unit_NodePath_Object_Long(addUserMethodBind, this.rawMemory, path, lightmap, instance)
    }


    private val getUserCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_user_count") }
    open fun getUserCount(): Long {
        return _icall_Long(getUserCountMethodBind, this.rawMemory)
    }


    private val getUserPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_user_path") }
    open fun getUserPath(userIdx: Long): NodePath {
        return _icall_NodePath_Long(getUserPathMethodBind, this.rawMemory, userIdx)
    }


    private val getUserLightmapMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "get_user_lightmap") }
    open fun getUserLightmap(userIdx: Long): Texture {
        return _icall_Texture_Long(getUserLightmapMethodBind, this.rawMemory, userIdx)
    }


    private val clearUsersMethodBind: CPointer<godot_method_bind> by lazy { getMB("BakedLightmapData", "clear_users") }
    open fun clearUsers() {
        _icall_Unit(clearUsersMethodBind, this.rawMemory)
    }


}
