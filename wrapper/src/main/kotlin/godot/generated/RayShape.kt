@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RayShape : Shape {
    constructor() : super("RayShape")
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
        infix fun from(other: Shape): RayShape = RayShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): RayShape = RayShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): RayShape = RayShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RayShape = RayShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RayShape = fromVariant(RayShape(""), other)


        // Constants


    }


    // Properties
    open var length: Float
        get() = _icall_Float(getLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setLengthMethodBind, this.rawMemory, value)


    open var slipsOnSlope: Boolean
        get() = _icall_Boolean(getSlipsOnSlopeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSlipsOnSlopeMethodBind, this.rawMemory, value)




    // Methods
    private val setLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayShape", "set_length") }
    open fun setLength(length: Float) {
        _icall_Unit_Float(setLengthMethodBind, this.rawMemory, length)
    }


    private val getLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayShape", "get_length") }
    open fun getLength(): Float {
        return _icall_Float(getLengthMethodBind, this.rawMemory)
    }


    private val setSlipsOnSlopeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayShape", "set_slips_on_slope") }
    open fun setSlipsOnSlope(active: Boolean) {
        _icall_Unit_Boolean(setSlipsOnSlopeMethodBind, this.rawMemory, active)
    }


    private val getSlipsOnSlopeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayShape", "get_slips_on_slope") }
    open fun getSlipsOnSlope(): Boolean {
        return _icall_Boolean(getSlipsOnSlopeMethodBind, this.rawMemory)
    }


}
