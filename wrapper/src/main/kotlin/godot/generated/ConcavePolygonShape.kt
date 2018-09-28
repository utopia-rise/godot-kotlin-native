@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConcavePolygonShape : Shape {
    constructor() : super("ConcavePolygonShape")
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
        infix fun from(other: Shape): ConcavePolygonShape = ConcavePolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ConcavePolygonShape = ConcavePolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ConcavePolygonShape = ConcavePolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConcavePolygonShape = ConcavePolygonShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConcavePolygonShape = fromVariant(ConcavePolygonShape(""), other)


        // Constants


    }


    // Properties
    open var data: PoolVector3Array
        get() = _icall_PoolVector3Array(getFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector3Array(setFacesMethodBind, this.rawMemory, value)




    // Methods
    private val setFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConcavePolygonShape", "set_faces") }
    open fun setFaces(faces: PoolVector3Array) {
        _icall_Unit_PoolVector3Array(setFacesMethodBind, this.rawMemory, faces)
    }


    private val getFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConcavePolygonShape", "get_faces") }
    open fun getFaces(): PoolVector3Array {
        return _icall_PoolVector3Array(getFacesMethodBind, this.rawMemory)
    }


}
