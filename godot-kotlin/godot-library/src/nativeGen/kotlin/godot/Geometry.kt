package godot

import godot.core.Dictionary
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.icalls._icall_Boolean_PoolVector2Array
import godot.icalls._icall_Boolean_Vector2_PoolVector2Array
import godot.icalls._icall_Boolean_Vector2_Vector2_Double
import godot.icalls._icall_Boolean_Vector2_Vector2_Vector2_Vector2
import godot.icalls._icall_Dictionary_PoolVector2Array
import godot.icalls._icall_Double_Vector2_Vector2_Vector2_Double
import godot.icalls._icall_Long_Vector3
import godot.icalls._icall_PoolIntArray_PoolVector2Array
import godot.icalls._icall_PoolVector2Array_PoolVector2Array
import godot.icalls._icall_PoolVector2Array_Vector2_Vector2_Vector2_Vector2
import godot.icalls._icall_PoolVector3Array_PoolVector3Array_Plane
import godot.icalls._icall_PoolVector3Array_Vector3_Vector3_Double_Double
import godot.icalls._icall_PoolVector3Array_Vector3_Vector3_VariantArray
import godot.icalls._icall_PoolVector3Array_Vector3_Vector3_Vector3_Double
import godot.icalls._icall_PoolVector3Array_Vector3_Vector3_Vector3_Vector3
import godot.icalls._icall_VariantArray_Double_Double_Long_Long
import godot.icalls._icall_VariantArray_Double_Double_Long_Long_Long
import godot.icalls._icall_VariantArray_PoolVector2Array_Double_Long
import godot.icalls._icall_VariantArray_PoolVector2Array_Double_Long_Long
import godot.icalls._icall_VariantArray_PoolVector2Array_PoolVector2Array
import godot.icalls._icall_VariantArray_Vector3
import godot.icalls._icall_Variant_Vector2_Vector2_Vector2_Vector2
import godot.icalls._icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3
import godot.icalls._icall_Vector2_Vector2_Vector2_Vector2
import godot.icalls._icall_Vector3_Vector3_Vector3_Vector3
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object Geometry : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("Geometry".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton Geometry" }
        this@Geometry.ptr = ptr
    }
  }

  final const val END_BUTT: Long = 2

  final const val END_JOINED: Long = 1

  final const val END_POLYGON: Long = 0

  final const val END_ROUND: Long = 4

  final const val END_SQUARE: Long = 3

  final const val JOIN_MITER: Long = 2

  final const val JOIN_ROUND: Long = 1

  final const val JOIN_SQUARE: Long = 0

  final const val OPERATION_DIFFERENCE: Long = 1

  final const val OPERATION_INTERSECTION: Long = 2

  final const val OPERATION_UNION: Long = 0

  final const val OPERATION_XOR: Long = 3

  fun buildBoxPlanes(extents: Vector3): VariantArray {
    val mb = getMethodBind("_Geometry","build_box_planes")
    return _icall_VariantArray_Vector3( mb, this.ptr, extents)
  }

  fun buildCapsulePlanes(
    radius: Double,
    height: Double,
    sides: Long,
    lats: Long,
    axis: Long = 2
  ): VariantArray {
    val mb = getMethodBind("_Geometry","build_capsule_planes")
    return _icall_VariantArray_Double_Double_Long_Long_Long( mb, this.ptr, radius, height, sides,
        lats, axis)
  }

  fun buildCylinderPlanes(
    radius: Double,
    height: Double,
    sides: Long,
    axis: Long = 2
  ): VariantArray {
    val mb = getMethodBind("_Geometry","build_cylinder_planes")
    return _icall_VariantArray_Double_Double_Long_Long( mb, this.ptr, radius, height, sides, axis)
  }

  fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    val mb = getMethodBind("_Geometry","clip_polygon")
    return _icall_PoolVector3Array_PoolVector3Array_Plane( mb, this.ptr, points, plane)
  }

  fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val mb = getMethodBind("_Geometry","clip_polygons_2d")
    return _icall_VariantArray_PoolVector2Array_PoolVector2Array( mb, this.ptr, polygonA, polygonB)
  }

  fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val mb = getMethodBind("_Geometry","clip_polyline_with_polygon_2d")
    return _icall_VariantArray_PoolVector2Array_PoolVector2Array( mb, this.ptr, polyline, polygon)
  }

  fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    val mb = getMethodBind("_Geometry","convex_hull_2d")
    return _icall_PoolVector2Array_PoolVector2Array( mb, this.ptr, points)
  }

  fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val mb = getMethodBind("_Geometry","exclude_polygons_2d")
    return _icall_VariantArray_PoolVector2Array_PoolVector2Array( mb, this.ptr, polygonA, polygonB)
  }

  fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val mb = getMethodBind("_Geometry","get_closest_point_to_segment")
    return _icall_Vector3_Vector3_Vector3_Vector3( mb, this.ptr, point, s1, s2)
  }

  fun getClosestPointToSegment2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val mb = getMethodBind("_Geometry","get_closest_point_to_segment_2d")
    return _icall_Vector2_Vector2_Vector2_Vector2( mb, this.ptr, point, s1, s2)
  }

  fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val mb = getMethodBind("_Geometry","get_closest_point_to_segment_uncapped")
    return _icall_Vector3_Vector3_Vector3_Vector3( mb, this.ptr, point, s1, s2)
  }

  fun getClosestPointToSegmentUncapped2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val mb = getMethodBind("_Geometry","get_closest_point_to_segment_uncapped_2d")
    return _icall_Vector2_Vector2_Vector2_Vector2( mb, this.ptr, point, s1, s2)
  }

  fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3
  ): PoolVector3Array {
    val mb = getMethodBind("_Geometry","get_closest_points_between_segments")
    return _icall_PoolVector3Array_Vector3_Vector3_Vector3_Vector3( mb, this.ptr, p1, p2, q1, q2)
  }

  fun getClosestPointsBetweenSegments2d(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2
  ): PoolVector2Array {
    val mb = getMethodBind("_Geometry","get_closest_points_between_segments_2d")
    return _icall_PoolVector2Array_Vector2_Vector2_Vector2_Vector2( mb, this.ptr, p1, q1, p2, q2)
  }

  fun getUv84NormalBit(normal: Vector3): Long {
    val mb = getMethodBind("_Geometry","get_uv84_normal_bit")
    return _icall_Long_Vector3( mb, this.ptr, normal)
  }

  fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val mb = getMethodBind("_Geometry","intersect_polygons_2d")
    return _icall_VariantArray_PoolVector2Array_PoolVector2Array( mb, this.ptr, polygonA, polygonB)
  }

  fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val mb = getMethodBind("_Geometry","intersect_polyline_with_polygon_2d")
    return _icall_VariantArray_PoolVector2Array_PoolVector2Array( mb, this.ptr, polyline, polygon)
  }

  fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Double
  ): Boolean {
    val mb = getMethodBind("_Geometry","is_point_in_circle")
    return _icall_Boolean_Vector2_Vector2_Double( mb, this.ptr, point, circlePosition, circleRadius)
  }

  fun isPointInPolygon(point: Vector2, polygon: PoolVector2Array): Boolean {
    val mb = getMethodBind("_Geometry","is_point_in_polygon")
    return _icall_Boolean_Vector2_PoolVector2Array( mb, this.ptr, point, polygon)
  }

  fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    val mb = getMethodBind("_Geometry","is_polygon_clockwise")
    return _icall_Boolean_PoolVector2Array( mb, this.ptr, polygon)
  }

  fun lineIntersectsLine2d(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2
  ): Variant {
    val mb = getMethodBind("_Geometry","line_intersects_line_2d")
    return _icall_Variant_Vector2_Vector2_Vector2_Vector2( mb, this.ptr, fromA, dirA, fromB, dirB)
  }

  fun makeAtlas(sizes: PoolVector2Array): Dictionary {
    val mb = getMethodBind("_Geometry","make_atlas")
    return _icall_Dictionary_PoolVector2Array( mb, this.ptr, sizes)
  }

  fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val mb = getMethodBind("_Geometry","merge_polygons_2d")
    return _icall_VariantArray_PoolVector2Array_PoolVector2Array( mb, this.ptr, polygonA, polygonB)
  }

  fun offsetPolygon2d(
    polygon: PoolVector2Array,
    delta: Double,
    joinType: Long = 0
  ): VariantArray {
    val mb = getMethodBind("_Geometry","offset_polygon_2d")
    return _icall_VariantArray_PoolVector2Array_Double_Long( mb, this.ptr, polygon, delta, joinType)
  }

  fun offsetPolyline2d(
    polyline: PoolVector2Array,
    delta: Double,
    joinType: Long = 0,
    endType: Long = 3
  ): VariantArray {
    val mb = getMethodBind("_Geometry","offset_polyline_2d")
    return _icall_VariantArray_PoolVector2Array_Double_Long_Long( mb, this.ptr, polyline, delta,
        joinType, endType)
  }

  fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2
  ): Boolean {
    val mb = getMethodBind("_Geometry","point_is_inside_triangle")
    return _icall_Boolean_Vector2_Vector2_Vector2_Vector2( mb, this.ptr, point, a, b, c)
  }

  fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val mb = getMethodBind("_Geometry","ray_intersects_triangle")
    return _icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3( mb, this.ptr, from, dir, a, b, c)
  }

  fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Double
  ): Double {
    val mb = getMethodBind("_Geometry","segment_intersects_circle")
    return _icall_Double_Vector2_Vector2_Vector2_Double( mb, this.ptr, segmentFrom, segmentTo,
        circlePosition, circleRadius)
  }

  fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray
  ): PoolVector3Array {
    val mb = getMethodBind("_Geometry","segment_intersects_convex")
    return _icall_PoolVector3Array_Vector3_Vector3_VariantArray( mb, this.ptr, from, to, planes)
  }

  fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Double,
    radius: Double
  ): PoolVector3Array {
    val mb = getMethodBind("_Geometry","segment_intersects_cylinder")
    return _icall_PoolVector3Array_Vector3_Vector3_Double_Double( mb, this.ptr, from, to, height,
        radius)
  }

  fun segmentIntersectsSegment2d(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2
  ): Variant {
    val mb = getMethodBind("_Geometry","segment_intersects_segment_2d")
    return _icall_Variant_Vector2_Vector2_Vector2_Vector2( mb, this.ptr, fromA, toA, fromB, toB)
  }

  fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Double
  ): PoolVector3Array {
    val mb = getMethodBind("_Geometry","segment_intersects_sphere")
    return _icall_PoolVector3Array_Vector3_Vector3_Vector3_Double( mb, this.ptr, from, to,
        spherePosition, sphereRadius)
  }

  fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val mb = getMethodBind("_Geometry","segment_intersects_triangle")
    return _icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3( mb, this.ptr, from, to, a, b, c)
  }

  fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    val mb = getMethodBind("_Geometry","triangulate_delaunay_2d")
    return _icall_PoolIntArray_PoolVector2Array( mb, this.ptr, points)
  }

  fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    val mb = getMethodBind("_Geometry","triangulate_polygon")
    return _icall_PoolIntArray_PoolVector2Array( mb, this.ptr, polygon)
  }

  enum class PolyEndType(
    id: Long
  ) {
    END_POLYGON(0),

    END_JOINED(1),

    END_BUTT(2),

    END_SQUARE(3),

    END_ROUND(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PolyBooleanOperation(
    id: Long
  ) {
    OPERATION_UNION(0),

    OPERATION_DIFFERENCE(1),

    OPERATION_INTERSECTION(2),

    OPERATION_XOR(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PolyJoinType(
    id: Long
  ) {
    JOIN_SQUARE(0),

    JOIN_ROUND(1),

    JOIN_MITER(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
