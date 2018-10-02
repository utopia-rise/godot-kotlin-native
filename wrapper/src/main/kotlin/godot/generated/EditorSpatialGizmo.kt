@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorSpatialGizmo : SpatialGizmo {
    constructor() : super("EditorSpatialGizmo")
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
        infix fun from(other: SpatialGizmo): EditorSpatialGizmo = EditorSpatialGizmo("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): EditorSpatialGizmo = EditorSpatialGizmo("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorSpatialGizmo = EditorSpatialGizmo("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorSpatialGizmo = fromVariant(EditorSpatialGizmo(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun redraw() {
    }


    open fun get_handle_name(index: Long): String {
        throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmo")
    }


    open fun get_handle_value(index: Long): Variant {
        throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmo")
    }


    open fun set_handle(index: Long, camera: Camera, point: Vector2) {
    }


    open fun commit_handle(index: Long, restore: Variant, cancel: Boolean) {
    }


    private val addLinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "add_lines") }
    open fun addLines(lines: PoolVector3Array, material: Material, billboard: Boolean = false) {
        _icall_Unit_PoolVector3Array_Object_Boolean(addLinesMethodBind, this.rawMemory, lines, material, billboard)
    }


    private val addMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "add_mesh") }
    open fun addMesh(mesh: ArrayMesh, billboard: Boolean = false, skeleton: RID = RID()) {
        _icall_Unit_Object_Boolean_RID(addMeshMethodBind, this.rawMemory, mesh, billboard, skeleton)
    }


    private val addCollisionSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "add_collision_segments") }
    open fun addCollisionSegments(segments: PoolVector3Array) {
        _icall_Unit_PoolVector3Array(addCollisionSegmentsMethodBind, this.rawMemory, segments)
    }


    private val addCollisionTrianglesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "add_collision_triangles") }
    open fun addCollisionTriangles(triangles: TriangleMesh) {
        _icall_Unit_Object(addCollisionTrianglesMethodBind, this.rawMemory, triangles)
    }


    private val addUnscaledBillboardMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "add_unscaled_billboard") }
    open fun addUnscaledBillboard(material: Material, defaultScale: Double = 1.0) {
        _icall_Unit_Object_Double(addUnscaledBillboardMethodBind, this.rawMemory, material, defaultScale)
    }


    private val addHandlesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "add_handles") }
    open fun addHandles(handles: PoolVector3Array, billboard: Boolean = false, secondary: Boolean = false) {
        _icall_Unit_PoolVector3Array_Boolean_Boolean(addHandlesMethodBind, this.rawMemory, handles, billboard, secondary)
    }


    private val setSpatialNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "set_spatial_node") }
    open fun setSpatialNode(node: Object) {
        _icall_Unit_Object(setSpatialNodeMethodBind, this.rawMemory, node)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSpatialGizmo", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


}
