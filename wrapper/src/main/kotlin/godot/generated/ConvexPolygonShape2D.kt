@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConvexPolygonShape2D : Shape2D {
    constructor() : super("ConvexPolygonShape2D")
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
        infix fun from(other: Shape2D): ConvexPolygonShape2D = ConvexPolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ConvexPolygonShape2D = ConvexPolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ConvexPolygonShape2D = ConvexPolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConvexPolygonShape2D = ConvexPolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConvexPolygonShape2D = fromVariant(ConvexPolygonShape2D(""), other)


        // Constants


    }


    // Properties
    open var points: PoolVector2Array
        get() = _icall_PoolVector2Array(getPointsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPointsMethodBind, this.rawMemory, value)




    // Methods
    private val setPointCloudMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConvexPolygonShape2D", "set_point_cloud") }
    open fun setPointCloud(pointCloud: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPointCloudMethodBind, this.rawMemory, pointCloud)
    }


    private val setPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConvexPolygonShape2D", "set_points") }
    open fun setPoints(points: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPointsMethodBind, this.rawMemory, points)
    }


    private val getPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConvexPolygonShape2D", "get_points") }
    open fun getPoints(): PoolVector2Array {
        return _icall_PoolVector2Array(getPointsMethodBind, this.rawMemory)
    }


}
