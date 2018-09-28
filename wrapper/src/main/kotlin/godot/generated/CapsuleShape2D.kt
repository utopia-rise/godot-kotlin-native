@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CapsuleShape2D : Shape2D {
    constructor() : super("CapsuleShape2D")
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
        infix fun from(other: Shape2D): CapsuleShape2D = CapsuleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CapsuleShape2D = CapsuleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CapsuleShape2D = CapsuleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CapsuleShape2D = CapsuleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CapsuleShape2D = fromVariant(CapsuleShape2D(""), other)


        // Constants


    }


    // Properties
    open var radius: Float
        get() = _icall_Float(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRadiusMethodBind, this.rawMemory, value)


    open var height: Float
        get() = _icall_Float(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHeightMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape2D", "set_radius") }
    open fun setRadius(radius: Float) {
        _icall_Unit_Float(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape2D", "get_radius") }
    open fun getRadius(): Float {
        return _icall_Float(getRadiusMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape2D", "set_height") }
    open fun setHeight(height: Float) {
        _icall_Unit_Float(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape2D", "get_height") }
    open fun getHeight(): Float {
        return _icall_Float(getHeightMethodBind, this.rawMemory)
    }


}
