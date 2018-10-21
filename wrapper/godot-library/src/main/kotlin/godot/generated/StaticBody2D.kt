@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StaticBody2D : PhysicsBody2D {
    constructor() : super("StaticBody2D")
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
        infix fun from(other: PhysicsBody2D): StaticBody2D = StaticBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject2D): StaticBody2D = StaticBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): StaticBody2D = StaticBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): StaticBody2D = StaticBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): StaticBody2D = StaticBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StaticBody2D = StaticBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StaticBody2D = fromVariant(StaticBody2D(""), other)


        // Constants


    }


    // Properties
    open var constantLinearVelocity: Vector2
        get() = _icall_Vector2(getConstantLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setConstantLinearVelocityMethodBind, this.rawMemory, value)
    open fun constantLinearVelocity(shedule: (Vector2) -> Unit): Vector2 = constantLinearVelocity.apply {
        shedule(this)
        constantLinearVelocity = this
    }


    open var constantAngularVelocity: Double
        get() = _icall_Double(getConstantAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setConstantAngularVelocityMethodBind, this.rawMemory, value)


    open var friction: Double
        get() = _icall_Double(getFrictionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFrictionMethodBind, this.rawMemory, value)


    open var bounce: Double
        get() = _icall_Double(getBounceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBounceMethodBind, this.rawMemory, value)




    // Methods
    private val setConstantLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "set_constant_linear_velocity") }
    open fun setConstantLinearVelocity(vel: Vector2) {
        _icall_Unit_Vector2(setConstantLinearVelocityMethodBind, this.rawMemory, vel)
    }


    private val setConstantAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "set_constant_angular_velocity") }
    open fun setConstantAngularVelocity(vel: Double) {
        _icall_Unit_Double(setConstantAngularVelocityMethodBind, this.rawMemory, vel)
    }


    private val getConstantLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "get_constant_linear_velocity") }
    open fun getConstantLinearVelocity(): Vector2 {
        return _icall_Vector2(getConstantLinearVelocityMethodBind, this.rawMemory)
    }


    private val getConstantAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "get_constant_angular_velocity") }
    open fun getConstantAngularVelocity(): Double {
        return _icall_Double(getConstantAngularVelocityMethodBind, this.rawMemory)
    }


    private val setFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "set_friction") }
    open fun setFriction(friction: Double) {
        _icall_Unit_Double(setFrictionMethodBind, this.rawMemory, friction)
    }


    private val getFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "get_friction") }
    open fun getFriction(): Double {
        return _icall_Double(getFrictionMethodBind, this.rawMemory)
    }


    private val setBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "set_bounce") }
    open fun setBounce(bounce: Double) {
        _icall_Unit_Double(setBounceMethodBind, this.rawMemory, bounce)
    }


    private val getBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody2D", "get_bounce") }
    open fun getBounce(): Double {
        return _icall_Double(getBounceMethodBind, this.rawMemory)
    }


}
