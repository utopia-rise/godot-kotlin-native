@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StaticBody : PhysicsBody {
    constructor() : super("StaticBody")
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
        infix fun from(other: PhysicsBody): StaticBody = StaticBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject): StaticBody = StaticBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): StaticBody = StaticBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): StaticBody = StaticBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StaticBody = StaticBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StaticBody = fromVariant(StaticBody(""), other)


        // Constants


    }


    // Properties
    open var friction: Float
        get() = _icall_Float(getFrictionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFrictionMethodBind, this.rawMemory, value)


    open var bounce: Float
        get() = _icall_Float(getBounceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setBounceMethodBind, this.rawMemory, value)


    open var constantLinearVelocity: Vector3
        get() = _icall_Vector3(getConstantLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setConstantLinearVelocityMethodBind, this.rawMemory, value)
    open fun constantLinearVelocity(shedule: (Vector3) -> Unit): Vector3 = constantLinearVelocity.apply {
        shedule(this)
        constantLinearVelocity = this
    }


    open var constantAngularVelocity: Vector3
        get() = _icall_Vector3(getConstantAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setConstantAngularVelocityMethodBind, this.rawMemory, value)
    open fun constantAngularVelocity(shedule: (Vector3) -> Unit): Vector3 = constantAngularVelocity.apply {
        shedule(this)
        constantAngularVelocity = this
    }




    // Methods
    private val setConstantLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "set_constant_linear_velocity") }
    open fun setConstantLinearVelocity(vel: Vector3) {
        _icall_Unit_Vector3(setConstantLinearVelocityMethodBind, this.rawMemory, vel)
    }


    private val setConstantAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "set_constant_angular_velocity") }
    open fun setConstantAngularVelocity(vel: Vector3) {
        _icall_Unit_Vector3(setConstantAngularVelocityMethodBind, this.rawMemory, vel)
    }


    private val getConstantLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "get_constant_linear_velocity") }
    open fun getConstantLinearVelocity(): Vector3 {
        return _icall_Vector3(getConstantLinearVelocityMethodBind, this.rawMemory)
    }


    private val getConstantAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "get_constant_angular_velocity") }
    open fun getConstantAngularVelocity(): Vector3 {
        return _icall_Vector3(getConstantAngularVelocityMethodBind, this.rawMemory)
    }


    private val setFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "set_friction") }
    open fun setFriction(friction: Float) {
        _icall_Unit_Float(setFrictionMethodBind, this.rawMemory, friction)
    }


    private val getFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "get_friction") }
    open fun getFriction(): Float {
        return _icall_Float(getFrictionMethodBind, this.rawMemory)
    }


    private val setBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "set_bounce") }
    open fun setBounce(bounce: Float) {
        _icall_Unit_Float(setBounceMethodBind, this.rawMemory, bounce)
    }


    private val getBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("StaticBody", "get_bounce") }
    open fun getBounce(): Float {
        return _icall_Float(getBounceMethodBind, this.rawMemory)
    }


}
