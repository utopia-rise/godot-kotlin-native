@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SurfaceTool : Reference {
    constructor() : super("SurfaceTool")
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
        infix fun from(other: Reference): SurfaceTool = SurfaceTool("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SurfaceTool = SurfaceTool("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SurfaceTool = fromVariant(SurfaceTool(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val beginMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "begin") }
    open fun begin(primitive: Long) {
        _icall_Unit_Long(beginMethodBind, this.rawMemory, primitive)
    }


    private val addVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_vertex") }
    open fun addVertex(vertex: Vector3) {
        _icall_Unit_Vector3(addVertexMethodBind, this.rawMemory, vertex)
    }


    private val addColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_color") }
    open fun addColor(color: Color) {
        _icall_Unit_Color(addColorMethodBind, this.rawMemory, color)
    }


    private val addNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_normal") }
    open fun addNormal(normal: Vector3) {
        _icall_Unit_Vector3(addNormalMethodBind, this.rawMemory, normal)
    }


    private val addTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_tangent") }
    open fun addTangent(tangent: Plane) {
        _icall_Unit_Plane(addTangentMethodBind, this.rawMemory, tangent)
    }


    private val addUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_uv") }
    open fun addUv(uv: Vector2) {
        _icall_Unit_Vector2(addUvMethodBind, this.rawMemory, uv)
    }


    private val addUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_uv2") }
    open fun addUv2(uv2: Vector2) {
        _icall_Unit_Vector2(addUv2MethodBind, this.rawMemory, uv2)
    }


    private val addBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_bones") }
    open fun addBones(bones: PoolIntArray) {
        _icall_Unit_PoolIntArray(addBonesMethodBind, this.rawMemory, bones)
    }


    private val addWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_weights") }
    open fun addWeights(weights: PoolRealArray) {
        _icall_Unit_PoolRealArray(addWeightsMethodBind, this.rawMemory, weights)
    }


    private val addSmoothGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_smooth_group") }
    open fun addSmoothGroup(smooth: Boolean) {
        _icall_Unit_Boolean(addSmoothGroupMethodBind, this.rawMemory, smooth)
    }


    private val addTriangleFanMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_triangle_fan") }
    open fun addTriangleFan(vertexes: PoolVector3Array, uvs: PoolVector2Array = PoolVector2Array(), colors: PoolColorArray = PoolColorArray(), uv2s: PoolVector2Array = PoolVector2Array(), normals: PoolVector3Array = PoolVector3Array(), tangents: GDArray = GDArray()) {
        _icall_Unit_PoolVector3Array_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolVector3Array_GDArray(addTriangleFanMethodBind, this.rawMemory, vertexes, uvs, colors, uv2s, normals, tangents)
    }


    private val addIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_index") }
    open fun addIndex(index: Long) {
        _icall_Unit_Long(addIndexMethodBind, this.rawMemory, index)
    }


    private val indexMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "index") }
    open fun index() {
        _icall_Unit(indexMethodBind, this.rawMemory)
    }


    private val deindexMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "deindex") }
    open fun deindex() {
        _icall_Unit(deindexMethodBind, this.rawMemory)
    }


    private val generateNormalsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "generate_normals") }
    open fun generateNormals(flip: Boolean = false) {
        _icall_Unit_Boolean(generateNormalsMethodBind, this.rawMemory, flip)
    }


    private val generateTangentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "generate_tangents") }
    open fun generateTangents() {
        _icall_Unit(generateTangentsMethodBind, this.rawMemory)
    }


    private val addToFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "add_to_format") }
    open fun addToFormat(flags: Long) {
        _icall_Unit_Long(addToFormatMethodBind, this.rawMemory, flags)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val createFromMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "create_from") }
    open fun createFrom(existing: Mesh, surface: Long) {
        _icall_Unit_Object_Long(createFromMethodBind, this.rawMemory, existing, surface)
    }


    private val appendFromMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "append_from") }
    open fun appendFrom(existing: Mesh, surface: Long, transform: Transform) {
        _icall_Unit_Object_Long_Transform(appendFromMethodBind, this.rawMemory, existing, surface, transform)
    }


    private val commitMethodBind: CPointer<godot_method_bind> by lazy { getMB("SurfaceTool", "commit") }
    open fun commit(existing: ArrayMesh, flags: Long = 97280): ArrayMesh {
        return _icall_ArrayMesh_Object_Long(commitMethodBind, this.rawMemory, existing, flags)
    }


}
