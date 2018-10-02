@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Navigation : Spatial {
    constructor() : super("Navigation")
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
        infix fun from(other: Spatial): Navigation = Navigation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Navigation = Navigation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Navigation = Navigation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Navigation = fromVariant(Navigation(""), other)


        // Constants


    }


    // Properties
    open var upVector: Vector3
        get() = _icall_Vector3(getUpVectorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setUpVectorMethodBind, this.rawMemory, value)
    open fun upVector(shedule: (Vector3) -> Unit): Vector3 = upVector.apply {
        shedule(this)
        upVector = this
    }




    // Methods
    private val navmeshAddMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "navmesh_add") }
    open fun navmeshAdd(mesh: NavigationMesh, xform: Transform, owner: Object): Long {
        return _icall_Long_Object_Transform_Object(navmeshAddMethodBind, this.rawMemory, mesh, xform, owner)
    }


    private val navmeshSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "navmesh_set_transform") }
    open fun navmeshSetTransform(id: Long, xform: Transform) {
        _icall_Unit_Long_Transform(navmeshSetTransformMethodBind, this.rawMemory, id, xform)
    }


    private val navmeshRemoveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "navmesh_remove") }
    open fun navmeshRemove(id: Long) {
        _icall_Unit_Long(navmeshRemoveMethodBind, this.rawMemory, id)
    }


    private val getSimplePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "get_simple_path") }
    open fun getSimplePath(start: Vector3, end: Vector3, optimize: Boolean = true): PoolVector3Array {
        return _icall_PoolVector3Array_Vector3_Vector3_Boolean(getSimplePathMethodBind, this.rawMemory, start, end, optimize)
    }


    private val getClosestPointToSegmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "get_closest_point_to_segment") }
    open fun getClosestPointToSegment(start: Vector3, end: Vector3, useCollision: Boolean = false): Vector3 {
        return _icall_Vector3_Vector3_Vector3_Boolean(getClosestPointToSegmentMethodBind, this.rawMemory, start, end, useCollision)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "get_closest_point") }
    open fun getClosestPoint(toPoint: Vector3): Vector3 {
        return _icall_Vector3_Vector3(getClosestPointMethodBind, this.rawMemory, toPoint)
    }


    private val getClosestPointNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "get_closest_point_normal") }
    open fun getClosestPointNormal(toPoint: Vector3): Vector3 {
        return _icall_Vector3_Vector3(getClosestPointNormalMethodBind, this.rawMemory, toPoint)
    }


    private val getClosestPointOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "get_closest_point_owner") }
    open fun getClosestPointOwner(toPoint: Vector3): Object {
        return _icall_Object_Vector3(getClosestPointOwnerMethodBind, this.rawMemory, toPoint)
    }


    private val setUpVectorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "set_up_vector") }
    open fun setUpVector(up: Vector3) {
        _icall_Unit_Vector3(setUpVectorMethodBind, this.rawMemory, up)
    }


    private val getUpVectorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation", "get_up_vector") }
    open fun getUpVector(): Vector3 {
        return _icall_Vector3(getUpVectorMethodBind, this.rawMemory)
    }


}
