@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Geometry : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): Geometry = Geometry("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Geometry = fromVariant(Geometry(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("Geometry", "_Geometry") }


        // Properties


        // Methods
        private val buildBoxPlanesMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "build_box_planes") }
        fun buildBoxPlanes(extents: Vector3): GDArray {
            return _icall_GDArray_Vector3(buildBoxPlanesMethodBind, this.rawMemory, extents)
        }


        private val buildCylinderPlanesMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "build_cylinder_planes") }
        fun buildCylinderPlanes(radius: Float, height: Float, sides: Int, axis: Int = 2): GDArray {
            return _icall_GDArray_Float_Float_Int_Int(buildCylinderPlanesMethodBind, this.rawMemory, radius, height, sides, axis)
        }


        private val buildCapsulePlanesMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "build_capsule_planes") }
        fun buildCapsulePlanes(radius: Float, height: Float, sides: Int, lats: Int, axis: Int = 2): GDArray {
            return _icall_GDArray_Float_Float_Int_Int_Int(buildCapsulePlanesMethodBind, this.rawMemory, radius, height, sides, lats, axis)
        }


        private val segmentIntersectsCircleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "segment_intersects_circle") }
        fun segmentIntersectsCircle(segmentFrom: Vector2, segmentTo: Vector2, circlePosition: Vector2, circleRadius: Float): Float {
            return _icall_Float_Vector2_Vector2_Vector2_Float(segmentIntersectsCircleMethodBind, this.rawMemory, segmentFrom, segmentTo, circlePosition, circleRadius)
        }


        private val segmentIntersectsSegment2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "segment_intersects_segment_2d") }
        fun segmentIntersectsSegment2d(fromA: Vector2, toA: Vector2, fromB: Vector2, toB: Vector2): Variant {
            return _icall_Variant_Vector2_Vector2_Vector2_Vector2(segmentIntersectsSegment2dMethodBind, this.rawMemory, fromA, toA, fromB, toB)
        }


        private val lineIntersectsLine2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "line_intersects_line_2d") }
        fun lineIntersectsLine2d(fromA: Vector2, dirA: Vector2, fromB: Vector2, dirB: Vector2): Variant {
            return _icall_Variant_Vector2_Vector2_Vector2_Vector2(lineIntersectsLine2dMethodBind, this.rawMemory, fromA, dirA, fromB, dirB)
        }


        private val getClosestPointsBetweenSegments2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_closest_points_between_segments_2d") }
        fun getClosestPointsBetweenSegments2d(p1: Vector2, q1: Vector2, p2: Vector2, q2: Vector2): PoolVector2Array {
            return _icall_PoolVector2Array_Vector2_Vector2_Vector2_Vector2(getClosestPointsBetweenSegments2dMethodBind, this.rawMemory, p1, q1, p2, q2)
        }


        private val getClosestPointsBetweenSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_closest_points_between_segments") }
        fun getClosestPointsBetweenSegments(p1: Vector3, p2: Vector3, q1: Vector3, q2: Vector3): PoolVector3Array {
            return _icall_PoolVector3Array_Vector3_Vector3_Vector3_Vector3(getClosestPointsBetweenSegmentsMethodBind, this.rawMemory, p1, p2, q1, q2)
        }


        private val getClosestPointToSegment2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_closest_point_to_segment_2d") }
        fun getClosestPointToSegment2d(point: Vector2, s1: Vector2, s2: Vector2): Vector2 {
            return _icall_Vector2_Vector2_Vector2_Vector2(getClosestPointToSegment2dMethodBind, this.rawMemory, point, s1, s2)
        }


        private val getClosestPointToSegmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_closest_point_to_segment") }
        fun getClosestPointToSegment(point: Vector3, s1: Vector3, s2: Vector3): Vector3 {
            return _icall_Vector3_Vector3_Vector3_Vector3(getClosestPointToSegmentMethodBind, this.rawMemory, point, s1, s2)
        }


        private val getClosestPointToSegmentUncapped2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_closest_point_to_segment_uncapped_2d") }
        fun getClosestPointToSegmentUncapped2d(point: Vector2, s1: Vector2, s2: Vector2): Vector2 {
            return _icall_Vector2_Vector2_Vector2_Vector2(getClosestPointToSegmentUncapped2dMethodBind, this.rawMemory, point, s1, s2)
        }


        private val getClosestPointToSegmentUncappedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_closest_point_to_segment_uncapped") }
        fun getClosestPointToSegmentUncapped(point: Vector3, s1: Vector3, s2: Vector3): Vector3 {
            return _icall_Vector3_Vector3_Vector3_Vector3(getClosestPointToSegmentUncappedMethodBind, this.rawMemory, point, s1, s2)
        }


        private val getUv84NormalBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "get_uv84_normal_bit") }
        fun getUv84NormalBit(normal: Vector3): Int {
            return _icall_Int_Vector3(getUv84NormalBitMethodBind, this.rawMemory, normal)
        }


        private val rayIntersectsTriangleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "ray_intersects_triangle") }
        fun rayIntersectsTriangle(from: Vector3, dir: Vector3, a: Vector3, b: Vector3, c: Vector3): Variant {
            return _icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3(rayIntersectsTriangleMethodBind, this.rawMemory, from, dir, a, b, c)
        }


        private val segmentIntersectsTriangleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "segment_intersects_triangle") }
        fun segmentIntersectsTriangle(from: Vector3, to: Vector3, a: Vector3, b: Vector3, c: Vector3): Variant {
            return _icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3(segmentIntersectsTriangleMethodBind, this.rawMemory, from, to, a, b, c)
        }


        private val segmentIntersectsSphereMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "segment_intersects_sphere") }
        fun segmentIntersectsSphere(from: Vector3, to: Vector3, spherePosition: Vector3, sphereRadius: Float): PoolVector3Array {
            return _icall_PoolVector3Array_Vector3_Vector3_Vector3_Float(segmentIntersectsSphereMethodBind, this.rawMemory, from, to, spherePosition, sphereRadius)
        }


        private val segmentIntersectsCylinderMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "segment_intersects_cylinder") }
        fun segmentIntersectsCylinder(from: Vector3, to: Vector3, height: Float, radius: Float): PoolVector3Array {
            return _icall_PoolVector3Array_Vector3_Vector3_Float_Float(segmentIntersectsCylinderMethodBind, this.rawMemory, from, to, height, radius)
        }


        private val segmentIntersectsConvexMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "segment_intersects_convex") }
        fun segmentIntersectsConvex(from: Vector3, to: Vector3, planes: GDArray): PoolVector3Array {
            return _icall_PoolVector3Array_Vector3_Vector3_GDArray(segmentIntersectsConvexMethodBind, this.rawMemory, from, to, planes)
        }


        private val pointIsInsideTriangleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "point_is_inside_triangle") }
        fun pointIsInsideTriangle(point: Vector2, a: Vector2, b: Vector2, c: Vector2): Boolean {
            return _icall_Boolean_Vector2_Vector2_Vector2_Vector2(pointIsInsideTriangleMethodBind, this.rawMemory, point, a, b, c)
        }


        private val triangulatePolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "triangulate_polygon") }
        fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
            return _icall_PoolIntArray_PoolVector2Array(triangulatePolygonMethodBind, this.rawMemory, polygon)
        }


        private val convexHull2dMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "convex_hull_2d") }
        fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
            return _icall_PoolVector2Array_PoolVector2Array(convexHull2dMethodBind, this.rawMemory, points)
        }


        private val clipPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "clip_polygon") }
        fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
            return _icall_PoolVector3Array_PoolVector3Array_Plane(clipPolygonMethodBind, this.rawMemory, points, plane)
        }


        private val makeAtlasMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Geometry", "make_atlas") }
        fun makeAtlas(sizes: PoolVector2Array): Dictionary {
            return _icall_Dictionary_PoolVector2Array(makeAtlasMethodBind, this.rawMemory, sizes)
        }


    }
}
