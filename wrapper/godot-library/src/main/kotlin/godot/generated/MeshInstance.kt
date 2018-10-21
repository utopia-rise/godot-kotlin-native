@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MeshInstance : GeometryInstance {
    constructor() : super("MeshInstance")
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
        infix fun from(other: GeometryInstance): MeshInstance = MeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): MeshInstance = MeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): MeshInstance = MeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): MeshInstance = MeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MeshInstance = MeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MeshInstance = fromVariant(MeshInstance(""), other)


        // Constants


    }


    // Properties
    open var mesh: Mesh
        get() = _icall_Mesh(getMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMeshMethodBind, this.rawMemory, value)


    open var skeleton: NodePath
        get() = _icall_NodePath(getSkeletonPathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setSkeletonPathMethodBind, this.rawMemory, value)




    // Methods
    private val setMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "set_mesh") }
    open fun setMesh(mesh: Mesh) {
        _icall_Unit_Object(setMeshMethodBind, this.rawMemory, mesh)
    }


    private val getMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "get_mesh") }
    open fun getMesh(): Mesh {
        return _icall_Mesh(getMeshMethodBind, this.rawMemory)
    }


    private val setSkeletonPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "set_skeleton_path") }
    open fun setSkeletonPath(skeletonPath: NodePath) {
        _icall_Unit_NodePath(setSkeletonPathMethodBind, this.rawMemory, skeletonPath)
    }


    private val getSkeletonPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "get_skeleton_path") }
    open fun getSkeletonPath(): NodePath {
        return _icall_NodePath(getSkeletonPathMethodBind, this.rawMemory)
    }


    private val setSurfaceMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "set_surface_material") }
    open fun setSurfaceMaterial(surface: Long, material: Material) {
        _icall_Unit_Long_Object(setSurfaceMaterialMethodBind, this.rawMemory, surface, material)
    }


    private val getSurfaceMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "get_surface_material") }
    open fun getSurfaceMaterial(surface: Long): Material {
        return _icall_Material_Long(getSurfaceMaterialMethodBind, this.rawMemory, surface)
    }


    private val createTrimeshCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "create_trimesh_collision") }
    open fun createTrimeshCollision() {
        _icall_Unit(createTrimeshCollisionMethodBind, this.rawMemory)
    }


    private val createConvexCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "create_convex_collision") }
    open fun createConvexCollision() {
        _icall_Unit(createConvexCollisionMethodBind, this.rawMemory)
    }


    open fun _mesh_changed() {
    }


    private val createDebugTangentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance", "create_debug_tangents") }
    open fun createDebugTangents() {
        _icall_Unit(createDebugTangentsMethodBind, this.rawMemory)
    }


}
