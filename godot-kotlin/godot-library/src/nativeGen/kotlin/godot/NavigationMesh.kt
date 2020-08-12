// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PoolIntArray_Long
import godot.icalls._icall_PoolVector3Array
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolIntArray
import godot.icalls._icall_Unit_PoolVector3Array
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class NavigationMesh internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var agent_height: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_agent_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_agent_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var agent_maxClimb: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_agent_max_climb")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_agent_max_climb")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var agent_maxSlope: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_agent_max_slope")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_agent_max_slope")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var agent_radius: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_agent_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_agent_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var cell_height: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_cell_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_cell_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var cell_size: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_cell_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_cell_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var detail_sampleDistance: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_detail_sample_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_detail_sample_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var detail_sampleMaxError: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_detail_sample_max_error")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_detail_sample_max_error")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var edge_maxError: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_edge_max_error")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_edge_max_error")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var edge_maxLength: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_edge_max_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_edge_max_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var filter_filterWalkableLowHeightSpans: Boolean
    get() {
      val mb = getMethodBind("NavigationMesh","get_filter_walkable_low_height_spans")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_filter_walkable_low_height_spans")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var filter_ledgeSpans: Boolean
    get() {
      val mb = getMethodBind("NavigationMesh","get_filter_ledge_spans")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_filter_ledge_spans")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var filter_lowHangingObstacles: Boolean
    get() {
      val mb = getMethodBind("NavigationMesh","get_filter_low_hanging_obstacles")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_filter_low_hanging_obstacles")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var geometry_collisionMask: Long
    get() {
      val mb = getMethodBind("NavigationMesh","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var geometry_parsedGeometryType: Long
    get() {
      val mb = getMethodBind("NavigationMesh","get_parsed_geometry_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_parsed_geometry_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var geometry_sourceGeometryMode: Long
    get() {
      val mb = getMethodBind("NavigationMesh","get_source_geometry_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_source_geometry_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var geometry_sourceGroupName: String
    get() {
      val mb = getMethodBind("NavigationMesh","get_source_group_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_source_group_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var polygon_vertsPerPoly: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_verts_per_poly")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_verts_per_poly")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var region_mergeSize: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_region_merge_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_region_merge_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var region_minSize: Double
    get() {
      val mb = getMethodBind("NavigationMesh","get_region_min_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_region_min_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var samplePartitionType_samplePartitionType: Long
    get() {
      val mb = getMethodBind("NavigationMesh","get_sample_partition_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_sample_partition_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var vertices: PoolVector3Array
    get() {
      val mb = getMethodBind("NavigationMesh","get_vertices")
      return _icall_PoolVector3Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NavigationMesh","set_vertices")
      _icall_Unit_PoolVector3Array(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("NavigationMesh", "NavigationMesh")
        }

  }

  open fun _getPolygons(): VariantArray {
    throw NotImplementedError("_get_polygons is not implemented for NavigationMesh")
  }

  open fun _setPolygons(polygons: VariantArray) {
  }

  open fun addPolygon(polygon: PoolIntArray) {
    val mb = getMethodBind("NavigationMesh","add_polygon")
    _icall_Unit_PoolIntArray( mb, this.ptr, polygon)
  }

  open fun clearPolygons() {
    val mb = getMethodBind("NavigationMesh","clear_polygons")
    _icall_Unit( mb, this.ptr)
  }

  open fun createFromMesh(mesh: Mesh) {
    val mb = getMethodBind("NavigationMesh","create_from_mesh")
    _icall_Unit_Object( mb, this.ptr, mesh)
  }

  open fun getAgentHeight(): Double {
    val mb = getMethodBind("NavigationMesh","get_agent_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAgentMaxClimb(): Double {
    val mb = getMethodBind("NavigationMesh","get_agent_max_climb")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAgentMaxSlope(): Double {
    val mb = getMethodBind("NavigationMesh","get_agent_max_slope")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAgentRadius(): Double {
    val mb = getMethodBind("NavigationMesh","get_agent_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCellHeight(): Double {
    val mb = getMethodBind("NavigationMesh","get_cell_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCellSize(): Double {
    val mb = getMethodBind("NavigationMesh","get_cell_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("NavigationMesh","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("NavigationMesh","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getDetailSampleDistance(): Double {
    val mb = getMethodBind("NavigationMesh","get_detail_sample_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDetailSampleMaxError(): Double {
    val mb = getMethodBind("NavigationMesh","get_detail_sample_max_error")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEdgeMaxError(): Double {
    val mb = getMethodBind("NavigationMesh","get_edge_max_error")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEdgeMaxLength(): Double {
    val mb = getMethodBind("NavigationMesh","get_edge_max_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFilterLedgeSpans(): Boolean {
    val mb = getMethodBind("NavigationMesh","get_filter_ledge_spans")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getFilterLowHangingObstacles(): Boolean {
    val mb = getMethodBind("NavigationMesh","get_filter_low_hanging_obstacles")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getFilterWalkableLowHeightSpans(): Boolean {
    val mb = getMethodBind("NavigationMesh","get_filter_walkable_low_height_spans")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getParsedGeometryType(): Long {
    val mb = getMethodBind("NavigationMesh","get_parsed_geometry_type")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPolygon(idx: Long): PoolIntArray {
    val mb = getMethodBind("NavigationMesh","get_polygon")
    return _icall_PoolIntArray_Long( mb, this.ptr, idx)
  }

  open fun getPolygonCount(): Long {
    val mb = getMethodBind("NavigationMesh","get_polygon_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRegionMergeSize(): Double {
    val mb = getMethodBind("NavigationMesh","get_region_merge_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRegionMinSize(): Double {
    val mb = getMethodBind("NavigationMesh","get_region_min_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSamplePartitionType(): Long {
    val mb = getMethodBind("NavigationMesh","get_sample_partition_type")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSourceGeometryMode(): Long {
    val mb = getMethodBind("NavigationMesh","get_source_geometry_mode")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSourceGroupName(): String {
    val mb = getMethodBind("NavigationMesh","get_source_group_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getVertices(): PoolVector3Array {
    val mb = getMethodBind("NavigationMesh","get_vertices")
    return _icall_PoolVector3Array( mb, this.ptr)
  }

  open fun getVertsPerPoly(): Double {
    val mb = getMethodBind("NavigationMesh","get_verts_per_poly")
    return _icall_Double( mb, this.ptr)
  }

  open fun setAgentHeight(agentHeight: Double) {
    val mb = getMethodBind("NavigationMesh","set_agent_height")
    _icall_Unit_Double( mb, this.ptr, agentHeight)
  }

  open fun setAgentMaxClimb(agentMaxClimb: Double) {
    val mb = getMethodBind("NavigationMesh","set_agent_max_climb")
    _icall_Unit_Double( mb, this.ptr, agentMaxClimb)
  }

  open fun setAgentMaxSlope(agentMaxSlope: Double) {
    val mb = getMethodBind("NavigationMesh","set_agent_max_slope")
    _icall_Unit_Double( mb, this.ptr, agentMaxSlope)
  }

  open fun setAgentRadius(agentRadius: Double) {
    val mb = getMethodBind("NavigationMesh","set_agent_radius")
    _icall_Unit_Double( mb, this.ptr, agentRadius)
  }

  open fun setCellHeight(cellHeight: Double) {
    val mb = getMethodBind("NavigationMesh","set_cell_height")
    _icall_Unit_Double( mb, this.ptr, cellHeight)
  }

  open fun setCellSize(cellSize: Double) {
    val mb = getMethodBind("NavigationMesh","set_cell_size")
    _icall_Unit_Double( mb, this.ptr, cellSize)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("NavigationMesh","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("NavigationMesh","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setDetailSampleDistance(detailSampleDist: Double) {
    val mb = getMethodBind("NavigationMesh","set_detail_sample_distance")
    _icall_Unit_Double( mb, this.ptr, detailSampleDist)
  }

  open fun setDetailSampleMaxError(detailSampleMaxError: Double) {
    val mb = getMethodBind("NavigationMesh","set_detail_sample_max_error")
    _icall_Unit_Double( mb, this.ptr, detailSampleMaxError)
  }

  open fun setEdgeMaxError(edgeMaxError: Double) {
    val mb = getMethodBind("NavigationMesh","set_edge_max_error")
    _icall_Unit_Double( mb, this.ptr, edgeMaxError)
  }

  open fun setEdgeMaxLength(edgeMaxLength: Double) {
    val mb = getMethodBind("NavigationMesh","set_edge_max_length")
    _icall_Unit_Double( mb, this.ptr, edgeMaxLength)
  }

  open fun setFilterLedgeSpans(filterLedgeSpans: Boolean) {
    val mb = getMethodBind("NavigationMesh","set_filter_ledge_spans")
    _icall_Unit_Boolean( mb, this.ptr, filterLedgeSpans)
  }

  open fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean) {
    val mb = getMethodBind("NavigationMesh","set_filter_low_hanging_obstacles")
    _icall_Unit_Boolean( mb, this.ptr, filterLowHangingObstacles)
  }

  open fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean) {
    val mb = getMethodBind("NavigationMesh","set_filter_walkable_low_height_spans")
    _icall_Unit_Boolean( mb, this.ptr, filterWalkableLowHeightSpans)
  }

  open fun setParsedGeometryType(geometryType: Long) {
    val mb = getMethodBind("NavigationMesh","set_parsed_geometry_type")
    _icall_Unit_Long( mb, this.ptr, geometryType)
  }

  open fun setRegionMergeSize(regionMergeSize: Double) {
    val mb = getMethodBind("NavigationMesh","set_region_merge_size")
    _icall_Unit_Double( mb, this.ptr, regionMergeSize)
  }

  open fun setRegionMinSize(regionMinSize: Double) {
    val mb = getMethodBind("NavigationMesh","set_region_min_size")
    _icall_Unit_Double( mb, this.ptr, regionMinSize)
  }

  open fun setSamplePartitionType(samplePartitionType: Long) {
    val mb = getMethodBind("NavigationMesh","set_sample_partition_type")
    _icall_Unit_Long( mb, this.ptr, samplePartitionType)
  }

  open fun setSourceGeometryMode(mask: Long) {
    val mb = getMethodBind("NavigationMesh","set_source_geometry_mode")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setSourceGroupName(mask: String) {
    val mb = getMethodBind("NavigationMesh","set_source_group_name")
    _icall_Unit_String( mb, this.ptr, mask)
  }

  open fun setVertices(vertices: PoolVector3Array) {
    val mb = getMethodBind("NavigationMesh","set_vertices")
    _icall_Unit_PoolVector3Array( mb, this.ptr, vertices)
  }

  open fun setVertsPerPoly(vertsPerPoly: Double) {
    val mb = getMethodBind("NavigationMesh","set_verts_per_poly")
    _icall_Unit_Double( mb, this.ptr, vertsPerPoly)
  }

  companion object {
    final const val PARSED_GEOMETRY_BOTH: Long = 2

    final const val PARSED_GEOMETRY_MESH_INSTANCES: Long = 0

    final const val PARSED_GEOMETRY_STATIC_COLLIDERS: Long = 1

    final const val SAMPLE_PARTITION_LAYERS: Long = 2

    final const val SAMPLE_PARTITION_MONOTONE: Long = 1

    final const val SAMPLE_PARTITION_WATERSHED: Long = 0
  }
}
