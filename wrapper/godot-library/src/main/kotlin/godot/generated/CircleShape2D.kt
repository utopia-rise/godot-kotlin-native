@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CircleShape2D : Shape2D {
    constructor() : super("CircleShape2D")
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
        infix fun from(other: Shape2D): CircleShape2D = CircleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CircleShape2D = CircleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CircleShape2D = CircleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CircleShape2D = CircleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CircleShape2D = fromVariant(CircleShape2D(""), other)


        // Constants


    }


    // Properties
    open var radius: Double
        get() = _icall_Double(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CircleShape2D", "set_radius") }
    open fun setRadius(radius: Double) {
        _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CircleShape2D", "get_radius") }
    open fun getRadius(): Double {
        return _icall_Double(getRadiusMethodBind, this.rawMemory)
    }


}
