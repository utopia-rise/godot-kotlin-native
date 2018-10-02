@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Navigation2D : Node2D {
    constructor() : super("Navigation2D")
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
        infix fun from(other: Node2D): Navigation2D = Navigation2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Navigation2D = Navigation2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Navigation2D = Navigation2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Navigation2D = Navigation2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Navigation2D = fromVariant(Navigation2D(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val navpolyAddMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation2D", "navpoly_add") }
    open fun navpolyAdd(mesh: NavigationPolygon, xform: Transform2D, owner: Object): Long {
        return _icall_Long_Object_Transform2D_Object(navpolyAddMethodBind, this.rawMemory, mesh, xform, owner)
    }


    private val navpolySetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation2D", "navpoly_set_transform") }
    open fun navpolySetTransform(id: Long, xform: Transform2D) {
        _icall_Unit_Long_Transform2D(navpolySetTransformMethodBind, this.rawMemory, id, xform)
    }


    private val navpolyRemoveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation2D", "navpoly_remove") }
    open fun navpolyRemove(id: Long) {
        _icall_Unit_Long(navpolyRemoveMethodBind, this.rawMemory, id)
    }


    private val getSimplePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation2D", "get_simple_path") }
    open fun getSimplePath(start: Vector2, end: Vector2, optimize: Boolean = true): PoolVector2Array {
        return _icall_PoolVector2Array_Vector2_Vector2_Boolean(getSimplePathMethodBind, this.rawMemory, start, end, optimize)
    }


    private val getClosestPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation2D", "get_closest_point") }
    open fun getClosestPoint(toPoint: Vector2): Vector2 {
        return _icall_Vector2_Vector2(getClosestPointMethodBind, this.rawMemory, toPoint)
    }


    private val getClosestPointOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Navigation2D", "get_closest_point_owner") }
    open fun getClosestPointOwner(toPoint: Vector2): Object {
        return _icall_Object_Vector2(getClosestPointOwnerMethodBind, this.rawMemory, toPoint)
    }


}
