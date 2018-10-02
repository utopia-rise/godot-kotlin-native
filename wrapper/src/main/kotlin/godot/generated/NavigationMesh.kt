@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NavigationMesh : Resource {
    constructor() : super("NavigationMesh")
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
        infix fun from(other: Resource): NavigationMesh = NavigationMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): NavigationMesh = NavigationMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NavigationMesh = NavigationMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NavigationMesh = fromVariant(NavigationMesh(""), other)


        // Constants
        const val SAMPLE_PARTITION_WATERSHED: Long = 0
        const val SAMPLE_PARTITION_MONOTONE: Long = 1
        const val SAMPLE_PARTITION_LAYERS: Long = 2


    }


    // Properties
    open var vertices: PoolVector3Array
        get() = _icall_PoolVector3Array(getVerticesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector3Array(setVerticesMethodBind, this.rawMemory, value)


    open var samplePartitionType_samplePartitionType: Long
        get() = _icall_Long(getSamplePartitionTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSamplePartitionTypeMethodBind, this.rawMemory, value)


    open var cell_size: Double
        get() = _icall_Double(getCellSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCellSizeMethodBind, this.rawMemory, value)


    open var cell_height: Double
        get() = _icall_Double(getCellHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCellHeightMethodBind, this.rawMemory, value)


    open var agent_height: Double
        get() = _icall_Double(getAgentHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAgentHeightMethodBind, this.rawMemory, value)


    open var agent_radius: Double
        get() = _icall_Double(getAgentRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAgentRadiusMethodBind, this.rawMemory, value)


    open var agent_maxClimb: Double
        get() = _icall_Double(getAgentMaxClimbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAgentMaxClimbMethodBind, this.rawMemory, value)


    open var agent_maxSlope: Double
        get() = _icall_Double(getAgentMaxSlopeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAgentMaxSlopeMethodBind, this.rawMemory, value)


    open var region_minSize: Double
        get() = _icall_Double(getRegionMinSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRegionMinSizeMethodBind, this.rawMemory, value)


    open var region_mergeSize: Double
        get() = _icall_Double(getRegionMergeSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRegionMergeSizeMethodBind, this.rawMemory, value)


    open var edge_maxLength: Double
        get() = _icall_Double(getEdgeMaxLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEdgeMaxLengthMethodBind, this.rawMemory, value)


    open var edge_maxError: Double
        get() = _icall_Double(getEdgeMaxErrorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEdgeMaxErrorMethodBind, this.rawMemory, value)


    open var polygon_vertsPerPoly: Double
        get() = _icall_Double(getVertsPerPolyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVertsPerPolyMethodBind, this.rawMemory, value)


    open var detail_sampleDistance: Double
        get() = _icall_Double(getDetailSampleDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDetailSampleDistanceMethodBind, this.rawMemory, value)


    open var detail_sampleMaxError: Double
        get() = _icall_Double(getDetailSampleMaxErrorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDetailSampleMaxErrorMethodBind, this.rawMemory, value)


    open var filter_lowHangingObstacles: Boolean
        get() = _icall_Boolean(getFilterLowHangingObstaclesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFilterLowHangingObstaclesMethodBind, this.rawMemory, value)


    open var filter_ledgeSpans: Boolean
        get() = _icall_Boolean(getFilterLedgeSpansMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFilterLedgeSpansMethodBind, this.rawMemory, value)


    open var filter_filterWalkableLowHeightSpans: Boolean
        get() = _icall_Boolean(getFilterWalkableLowHeightSpansMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFilterWalkableLowHeightSpansMethodBind, this.rawMemory, value)




    // Methods
    private val setSamplePartitionTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_sample_partition_type") }
    open fun setSamplePartitionType(samplePartitionType: Long) {
        _icall_Unit_Long(setSamplePartitionTypeMethodBind, this.rawMemory, samplePartitionType)
    }


    private val getSamplePartitionTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_sample_partition_type") }
    open fun getSamplePartitionType(): Long {
        return _icall_Long(getSamplePartitionTypeMethodBind, this.rawMemory)
    }


    private val setCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_cell_size") }
    open fun setCellSize(cellSize: Double) {
        _icall_Unit_Double(setCellSizeMethodBind, this.rawMemory, cellSize)
    }


    private val getCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_cell_size") }
    open fun getCellSize(): Double {
        return _icall_Double(getCellSizeMethodBind, this.rawMemory)
    }


    private val setCellHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_cell_height") }
    open fun setCellHeight(cellHeight: Double) {
        _icall_Unit_Double(setCellHeightMethodBind, this.rawMemory, cellHeight)
    }


    private val getCellHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_cell_height") }
    open fun getCellHeight(): Double {
        return _icall_Double(getCellHeightMethodBind, this.rawMemory)
    }


    private val setAgentHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_agent_height") }
    open fun setAgentHeight(agentHeight: Double) {
        _icall_Unit_Double(setAgentHeightMethodBind, this.rawMemory, agentHeight)
    }


    private val getAgentHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_agent_height") }
    open fun getAgentHeight(): Double {
        return _icall_Double(getAgentHeightMethodBind, this.rawMemory)
    }


    private val setAgentRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_agent_radius") }
    open fun setAgentRadius(agentRadius: Double) {
        _icall_Unit_Double(setAgentRadiusMethodBind, this.rawMemory, agentRadius)
    }


    private val getAgentRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_agent_radius") }
    open fun getAgentRadius(): Double {
        return _icall_Double(getAgentRadiusMethodBind, this.rawMemory)
    }


    private val setAgentMaxClimbMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_agent_max_climb") }
    open fun setAgentMaxClimb(agentMaxClimb: Double) {
        _icall_Unit_Double(setAgentMaxClimbMethodBind, this.rawMemory, agentMaxClimb)
    }


    private val getAgentMaxClimbMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_agent_max_climb") }
    open fun getAgentMaxClimb(): Double {
        return _icall_Double(getAgentMaxClimbMethodBind, this.rawMemory)
    }


    private val setAgentMaxSlopeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_agent_max_slope") }
    open fun setAgentMaxSlope(agentMaxSlope: Double) {
        _icall_Unit_Double(setAgentMaxSlopeMethodBind, this.rawMemory, agentMaxSlope)
    }


    private val getAgentMaxSlopeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_agent_max_slope") }
    open fun getAgentMaxSlope(): Double {
        return _icall_Double(getAgentMaxSlopeMethodBind, this.rawMemory)
    }


    private val setRegionMinSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_region_min_size") }
    open fun setRegionMinSize(regionMinSize: Double) {
        _icall_Unit_Double(setRegionMinSizeMethodBind, this.rawMemory, regionMinSize)
    }


    private val getRegionMinSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_region_min_size") }
    open fun getRegionMinSize(): Double {
        return _icall_Double(getRegionMinSizeMethodBind, this.rawMemory)
    }


    private val setRegionMergeSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_region_merge_size") }
    open fun setRegionMergeSize(regionMergeSize: Double) {
        _icall_Unit_Double(setRegionMergeSizeMethodBind, this.rawMemory, regionMergeSize)
    }


    private val getRegionMergeSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_region_merge_size") }
    open fun getRegionMergeSize(): Double {
        return _icall_Double(getRegionMergeSizeMethodBind, this.rawMemory)
    }


    private val setEdgeMaxLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_edge_max_length") }
    open fun setEdgeMaxLength(edgeMaxLength: Double) {
        _icall_Unit_Double(setEdgeMaxLengthMethodBind, this.rawMemory, edgeMaxLength)
    }


    private val getEdgeMaxLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_edge_max_length") }
    open fun getEdgeMaxLength(): Double {
        return _icall_Double(getEdgeMaxLengthMethodBind, this.rawMemory)
    }


    private val setEdgeMaxErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_edge_max_error") }
    open fun setEdgeMaxError(edgeMaxError: Double) {
        _icall_Unit_Double(setEdgeMaxErrorMethodBind, this.rawMemory, edgeMaxError)
    }


    private val getEdgeMaxErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_edge_max_error") }
    open fun getEdgeMaxError(): Double {
        return _icall_Double(getEdgeMaxErrorMethodBind, this.rawMemory)
    }


    private val setVertsPerPolyMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_verts_per_poly") }
    open fun setVertsPerPoly(vertsPerPoly: Double) {
        _icall_Unit_Double(setVertsPerPolyMethodBind, this.rawMemory, vertsPerPoly)
    }


    private val getVertsPerPolyMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_verts_per_poly") }
    open fun getVertsPerPoly(): Double {
        return _icall_Double(getVertsPerPolyMethodBind, this.rawMemory)
    }


    private val setDetailSampleDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_detail_sample_distance") }
    open fun setDetailSampleDistance(detailSampleDist: Double) {
        _icall_Unit_Double(setDetailSampleDistanceMethodBind, this.rawMemory, detailSampleDist)
    }


    private val getDetailSampleDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_detail_sample_distance") }
    open fun getDetailSampleDistance(): Double {
        return _icall_Double(getDetailSampleDistanceMethodBind, this.rawMemory)
    }


    private val setDetailSampleMaxErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_detail_sample_max_error") }
    open fun setDetailSampleMaxError(detailSampleMaxError: Double) {
        _icall_Unit_Double(setDetailSampleMaxErrorMethodBind, this.rawMemory, detailSampleMaxError)
    }


    private val getDetailSampleMaxErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_detail_sample_max_error") }
    open fun getDetailSampleMaxError(): Double {
        return _icall_Double(getDetailSampleMaxErrorMethodBind, this.rawMemory)
    }


    private val setFilterLowHangingObstaclesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_filter_low_hanging_obstacles") }
    open fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean) {
        _icall_Unit_Boolean(setFilterLowHangingObstaclesMethodBind, this.rawMemory, filterLowHangingObstacles)
    }


    private val getFilterLowHangingObstaclesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_filter_low_hanging_obstacles") }
    open fun getFilterLowHangingObstacles(): Boolean {
        return _icall_Boolean(getFilterLowHangingObstaclesMethodBind, this.rawMemory)
    }


    private val setFilterLedgeSpansMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_filter_ledge_spans") }
    open fun setFilterLedgeSpans(filterLedgeSpans: Boolean) {
        _icall_Unit_Boolean(setFilterLedgeSpansMethodBind, this.rawMemory, filterLedgeSpans)
    }


    private val getFilterLedgeSpansMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_filter_ledge_spans") }
    open fun getFilterLedgeSpans(): Boolean {
        return _icall_Boolean(getFilterLedgeSpansMethodBind, this.rawMemory)
    }


    private val setFilterWalkableLowHeightSpansMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_filter_walkable_low_height_spans") }
    open fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean) {
        _icall_Unit_Boolean(setFilterWalkableLowHeightSpansMethodBind, this.rawMemory, filterWalkableLowHeightSpans)
    }


    private val getFilterWalkableLowHeightSpansMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_filter_walkable_low_height_spans") }
    open fun getFilterWalkableLowHeightSpans(): Boolean {
        return _icall_Boolean(getFilterWalkableLowHeightSpansMethodBind, this.rawMemory)
    }


    private val setVerticesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "set_vertices") }
    open fun setVertices(vertices: PoolVector3Array) {
        _icall_Unit_PoolVector3Array(setVerticesMethodBind, this.rawMemory, vertices)
    }


    private val getVerticesMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_vertices") }
    open fun getVertices(): PoolVector3Array {
        return _icall_PoolVector3Array(getVerticesMethodBind, this.rawMemory)
    }


    private val addPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "add_polygon") }
    open fun addPolygon(polygon: PoolIntArray) {
        _icall_Unit_PoolIntArray(addPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_polygon_count") }
    open fun getPolygonCount(): Long {
        return _icall_Long(getPolygonCountMethodBind, this.rawMemory)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "get_polygon") }
    open fun getPolygon(idx: Long): PoolIntArray {
        return _icall_PoolIntArray_Long(getPolygonMethodBind, this.rawMemory, idx)
    }


    private val clearPolygonsMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "clear_polygons") }
    open fun clearPolygons() {
        _icall_Unit(clearPolygonsMethodBind, this.rawMemory)
    }


    private val createFromMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMesh", "create_from_mesh") }
    open fun createFromMesh(mesh: Mesh) {
        _icall_Unit_Object(createFromMeshMethodBind, this.rawMemory, mesh)
    }


    open fun _set_polygons(polygons: GDArray) {
    }


    open fun _get_polygons(): GDArray {
        throw NotImplementedError("_get_polygons is not implemented for NavigationMesh")
    }


}
