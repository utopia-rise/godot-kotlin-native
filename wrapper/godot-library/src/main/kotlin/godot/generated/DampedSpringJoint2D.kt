@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class DampedSpringJoint2D : Joint2D {
    constructor() : super("DampedSpringJoint2D")
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
        infix fun from(other: Joint2D): DampedSpringJoint2D = DampedSpringJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): DampedSpringJoint2D = DampedSpringJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): DampedSpringJoint2D = DampedSpringJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): DampedSpringJoint2D = DampedSpringJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): DampedSpringJoint2D = DampedSpringJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): DampedSpringJoint2D = fromVariant(DampedSpringJoint2D(""), other)


        // Constants


    }


    // Properties
    open var length: Double
        get() = _icall_Double(getLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLengthMethodBind, this.rawMemory, value)


    open var restLength: Double
        get() = _icall_Double(getRestLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRestLengthMethodBind, this.rawMemory, value)


    open var stiffness: Double
        get() = _icall_Double(getStiffnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setStiffnessMethodBind, this.rawMemory, value)


    open var damping: Double
        get() = _icall_Double(getDampingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDampingMethodBind, this.rawMemory, value)




    // Methods
    private val setLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "set_length") }
    open fun setLength(length: Double) {
        _icall_Unit_Double(setLengthMethodBind, this.rawMemory, length)
    }


    private val getLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "get_length") }
    open fun getLength(): Double {
        return _icall_Double(getLengthMethodBind, this.rawMemory)
    }


    private val setRestLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "set_rest_length") }
    open fun setRestLength(restLength: Double) {
        _icall_Unit_Double(setRestLengthMethodBind, this.rawMemory, restLength)
    }


    private val getRestLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "get_rest_length") }
    open fun getRestLength(): Double {
        return _icall_Double(getRestLengthMethodBind, this.rawMemory)
    }


    private val setStiffnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "set_stiffness") }
    open fun setStiffness(stiffness: Double) {
        _icall_Unit_Double(setStiffnessMethodBind, this.rawMemory, stiffness)
    }


    private val getStiffnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "get_stiffness") }
    open fun getStiffness(): Double {
        return _icall_Double(getStiffnessMethodBind, this.rawMemory)
    }


    private val setDampingMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "set_damping") }
    open fun setDamping(damping: Double) {
        _icall_Unit_Double(setDampingMethodBind, this.rawMemory, damping)
    }


    private val getDampingMethodBind: CPointer<godot_method_bind> by lazy { getMB("DampedSpringJoint2D", "get_damping") }
    open fun getDamping(): Double {
        return _icall_Double(getDampingMethodBind, this.rawMemory)
    }


}
