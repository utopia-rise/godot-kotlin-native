@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CollisionPolygon : Spatial {
    constructor() : super("CollisionPolygon")
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
        infix fun from(other: Spatial): CollisionPolygon = CollisionPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CollisionPolygon = CollisionPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CollisionPolygon = CollisionPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CollisionPolygon = fromVariant(CollisionPolygon(""), other)


        // Constants


    }


    // Properties
    open var depth: Double
        get() = _icall_Double(getDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDepthMethodBind, this.rawMemory, value)


    open var disabled: Boolean
        get() = _icall_Boolean(isDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, value)


    open var polygon: PoolVector2Array
        get() = _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, value)




    // Methods
    private val setDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon", "set_depth") }
    open fun setDepth(depth: Double) {
        _icall_Unit_Double(setDepthMethodBind, this.rawMemory, depth)
    }


    private val getDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon", "get_depth") }
    open fun getDepth(): Double {
        return _icall_Double(getDepthMethodBind, this.rawMemory)
    }


    private val setPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon", "set_polygon") }
    open fun setPolygon(polygon: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon", "get_polygon") }
    open fun getPolygon(): PoolVector2Array {
        return _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
    }


    private val setDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon", "set_disabled") }
    open fun setDisabled(disabled: Boolean) {
        _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, disabled)
    }


    private val isDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon", "is_disabled") }
    open fun isDisabled(): Boolean {
        return _icall_Boolean(isDisabledMethodBind, this.rawMemory)
    }


    open fun _is_editable_3d_polygon(): Boolean {
        throw NotImplementedError("_is_editable_3d_polygon is not implemented for CollisionPolygon")
    }


}
