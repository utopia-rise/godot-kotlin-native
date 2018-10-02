@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PlaneShape : Shape {
    constructor() : super("PlaneShape")
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
        infix fun from(other: Shape): PlaneShape = PlaneShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): PlaneShape = PlaneShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PlaneShape = PlaneShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PlaneShape = PlaneShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PlaneShape = fromVariant(PlaneShape(""), other)


        // Constants


    }


    // Properties
    open var plane: Plane
        get() = _icall_Plane(getPlaneMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Plane(setPlaneMethodBind, this.rawMemory, value)
    open fun plane(shedule: (Plane) -> Unit): Plane = plane.apply {
        shedule(this)
        plane = this
    }




    // Methods
    private val setPlaneMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneShape", "set_plane") }
    open fun setPlane(plane: Plane) {
        _icall_Unit_Plane(setPlaneMethodBind, this.rawMemory, plane)
    }


    private val getPlaneMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneShape", "get_plane") }
    open fun getPlane(): Plane {
        return _icall_Plane(getPlaneMethodBind, this.rawMemory)
    }


}
