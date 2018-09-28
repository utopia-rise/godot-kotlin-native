@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NavigationPolygon : Resource {
    constructor() : super("NavigationPolygon")
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
        infix fun from(other: Resource): NavigationPolygon = NavigationPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): NavigationPolygon = NavigationPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NavigationPolygon = NavigationPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NavigationPolygon = fromVariant(NavigationPolygon(""), other)


        // Constants


    }


    // Properties
    open var vertices: PoolVector3Array
        get() = _icall_PoolVector3Array(getVerticesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector3Array(setVerticesMethodBind, this.rawMemory, value)




    // Methods
    private val setVerticesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "set_vertices") }
    open fun setVertices(vertices: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setVerticesMethodBind, this.rawMemory, vertices)
    }


    private val getVerticesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "get_vertices") }
    open fun getVertices(): PoolVector2Array {
        return _icall_PoolVector2Array(getVerticesMethodBind, this.rawMemory)
    }


    private val addPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "add_polygon") }
    open fun addPolygon(polygon: PoolIntArray) {
        _icall_Unit_PoolIntArray(addPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "get_polygon_count") }
    open fun getPolygonCount(): Int {
        return _icall_Int(getPolygonCountMethodBind, this.rawMemory)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "get_polygon") }
    open fun getPolygon(idx: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getPolygonMethodBind, this.rawMemory, idx)
    }


    private val clearPolygonsMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "clear_polygons") }
    open fun clearPolygons() {
        _icall_Unit(clearPolygonsMethodBind, this.rawMemory)
    }


    private val addOutlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "add_outline") }
    open fun addOutline(outline: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(addOutlineMethodBind, this.rawMemory, outline)
    }


    private val addOutlineAtIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "add_outline_at_index") }
    open fun addOutlineAtIndex(outline: PoolVector2Array, index: Int) {
        _icall_Unit_PoolVector2Array_Int(addOutlineAtIndexMethodBind, this.rawMemory, outline, index)
    }


    private val getOutlineCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "get_outline_count") }
    open fun getOutlineCount(): Int {
        return _icall_Int(getOutlineCountMethodBind, this.rawMemory)
    }


    private val setOutlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "set_outline") }
    open fun setOutline(idx: Int, outline: PoolVector2Array) {
        _icall_Unit_Int_PoolVector2Array(setOutlineMethodBind, this.rawMemory, idx, outline)
    }


    private val getOutlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "get_outline") }
    open fun getOutline(idx: Int): PoolVector2Array {
        return _icall_PoolVector2Array_Int(getOutlineMethodBind, this.rawMemory, idx)
    }


    private val removeOutlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "remove_outline") }
    open fun removeOutline(idx: Int) {
        _icall_Unit_Int(removeOutlineMethodBind, this.rawMemory, idx)
    }


    private val clearOutlinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "clear_outlines") }
    open fun clearOutlines() {
        _icall_Unit(clearOutlinesMethodBind, this.rawMemory)
    }


    private val makePolygonsFromOutlinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygon", "make_polygons_from_outlines") }
    open fun makePolygonsFromOutlines() {
        _icall_Unit(makePolygonsFromOutlinesMethodBind, this.rawMemory)
    }


    open fun _set_polygons(polygons: GDArray) {
    }


    open fun _get_polygons(): GDArray {
        throw NotImplementedError("_get_polygons is not implemented for NavigationPolygon")
    }


    open fun _set_outlines(outlines: GDArray) {
    }


    open fun _get_outlines(): GDArray {
        throw NotImplementedError("_get_outlines is not implemented for NavigationPolygon")
    }


}
