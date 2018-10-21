@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGPrimitive : CSGShape {
    private constructor() : super("")
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
        infix fun from(other: CSGShape): CSGPrimitive = CSGPrimitive("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGPrimitive = CSGPrimitive("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGPrimitive = CSGPrimitive("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGPrimitive = CSGPrimitive("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGPrimitive = CSGPrimitive("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGPrimitive = fromVariant(CSGPrimitive(""), other)


        // Constants


    }


    // Properties
    open var invertFaces: Boolean
        get() = _icall_Boolean(isInvertingFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setInvertFacesMethodBind, this.rawMemory, value)




    // Methods
    private val setInvertFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPrimitive", "set_invert_faces") }
    open fun setInvertFaces(invertFaces: Boolean) {
        _icall_Unit_Boolean(setInvertFacesMethodBind, this.rawMemory, invertFaces)
    }


    private val isInvertingFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPrimitive", "is_inverting_faces") }
    open fun isInvertingFaces(): Boolean {
        return _icall_Boolean(isInvertingFacesMethodBind, this.rawMemory)
    }


}
