@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConcavePolygonShape2D : Shape2D {
    constructor() : super("ConcavePolygonShape2D")
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
        infix fun from(other: Shape2D): ConcavePolygonShape2D = ConcavePolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ConcavePolygonShape2D = ConcavePolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ConcavePolygonShape2D = ConcavePolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConcavePolygonShape2D = ConcavePolygonShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConcavePolygonShape2D = fromVariant(ConcavePolygonShape2D(""), other)


        // Constants


    }


    // Properties
    open var segments: PoolVector2Array
        get() = _icall_PoolVector2Array(getSegmentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setSegmentsMethodBind, this.rawMemory, value)




    // Methods
    private val setSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConcavePolygonShape2D", "set_segments") }
    open fun setSegments(segments: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setSegmentsMethodBind, this.rawMemory, segments)
    }


    private val getSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConcavePolygonShape2D", "get_segments") }
    open fun getSegments(): PoolVector2Array {
        return _icall_PoolVector2Array(getSegmentsMethodBind, this.rawMemory)
    }


}
