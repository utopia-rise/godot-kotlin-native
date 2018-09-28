@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ImmediateGeometry : GeometryInstance {
    constructor() : super("ImmediateGeometry")
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
        infix fun from(other: GeometryInstance): ImmediateGeometry = ImmediateGeometry("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): ImmediateGeometry = ImmediateGeometry("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): ImmediateGeometry = ImmediateGeometry("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ImmediateGeometry = ImmediateGeometry("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ImmediateGeometry = ImmediateGeometry("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ImmediateGeometry = fromVariant(ImmediateGeometry(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val beginMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "begin") }
    open fun begin(primitive: Int, texture: Texture) {
        _icall_Unit_Int_Object(beginMethodBind, this.rawMemory, primitive, texture)
    }


    private val setNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "set_normal") }
    open fun setNormal(normal: Vector3) {
        _icall_Unit_Vector3(setNormalMethodBind, this.rawMemory, normal)
    }


    private val setTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "set_tangent") }
    open fun setTangent(tangent: Plane) {
        _icall_Unit_Plane(setTangentMethodBind, this.rawMemory, tangent)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val setUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "set_uv") }
    open fun setUv(uv: Vector2) {
        _icall_Unit_Vector2(setUvMethodBind, this.rawMemory, uv)
    }


    private val setUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "set_uv2") }
    open fun setUv2(uv: Vector2) {
        _icall_Unit_Vector2(setUv2MethodBind, this.rawMemory, uv)
    }


    private val addVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "add_vertex") }
    open fun addVertex(position: Vector3) {
        _icall_Unit_Vector3(addVertexMethodBind, this.rawMemory, position)
    }


    private val addSphereMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "add_sphere") }
    open fun addSphere(lats: Int, lons: Int, radius: Float, addUv: Boolean = true) {
        _icall_Unit_Int_Int_Float_Boolean(addSphereMethodBind, this.rawMemory, lats, lons, radius, addUv)
    }


    private val endMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "end") }
    open fun end() {
        _icall_Unit(endMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImmediateGeometry", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


}
