@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConvexPolygonShape : Shape {
    constructor() : super("ConvexPolygonShape")
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
        infix fun from(other: Shape): ConvexPolygonShape = ConvexPolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ConvexPolygonShape = ConvexPolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ConvexPolygonShape = ConvexPolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConvexPolygonShape = ConvexPolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConvexPolygonShape = fromVariant(ConvexPolygonShape(""), other)


        // Constants


    }


    // Properties
    open var points: GDArray
        get() = _icall_GDArray(getPointsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_GDArray(setPointsMethodBind, this.rawMemory, value)




    // Methods
    private val setPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConvexPolygonShape", "set_points") }
    open fun setPoints(points: PoolVector3Array) {
        _icall_Unit_PoolVector3Array(setPointsMethodBind, this.rawMemory, points)
    }


    private val getPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConvexPolygonShape", "get_points") }
    open fun getPoints(): PoolVector3Array {
        return _icall_PoolVector3Array(getPointsMethodBind, this.rawMemory)
    }


}
