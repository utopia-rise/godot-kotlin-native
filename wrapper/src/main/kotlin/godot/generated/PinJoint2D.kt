@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PinJoint2D : Joint2D {
    constructor() : super("PinJoint2D")
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
        infix fun from(other: Joint2D): PinJoint2D = PinJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): PinJoint2D = PinJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PinJoint2D = PinJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PinJoint2D = PinJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PinJoint2D = PinJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PinJoint2D = fromVariant(PinJoint2D(""), other)


        // Constants


    }


    // Properties
    open var softness: Float
        get() = _icall_Float(getSoftnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSoftnessMethodBind, this.rawMemory, value)




    // Methods
    private val setSoftnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("PinJoint2D", "set_softness") }
    open fun setSoftness(softness: Float) {
        _icall_Unit_Float(setSoftnessMethodBind, this.rawMemory, softness)
    }


    private val getSoftnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("PinJoint2D", "get_softness") }
    open fun getSoftness(): Float {
        return _icall_Float(getSoftnessMethodBind, this.rawMemory)
    }


}
