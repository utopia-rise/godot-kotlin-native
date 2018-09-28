@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VehicleBody : RigidBody {
    constructor() : super("VehicleBody")
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
        infix fun from(other: RigidBody): VehicleBody = VehicleBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: PhysicsBody): VehicleBody = VehicleBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject): VehicleBody = VehicleBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): VehicleBody = VehicleBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VehicleBody = VehicleBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VehicleBody = VehicleBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VehicleBody = fromVariant(VehicleBody(""), other)


        // Constants


    }


    // Properties
    open var engineForce: Float
        get() = _icall_Float(getEngineForceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setEngineForceMethodBind, this.rawMemory, value)


    open var brake: Float
        get() = _icall_Float(getBrakeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setBrakeMethodBind, this.rawMemory, value)


    open var steering: Float
        get() = _icall_Float(getSteeringMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSteeringMethodBind, this.rawMemory, value)




    // Methods
    private val setEngineForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "set_engine_force") }
    open fun setEngineForce(engineForce: Float) {
        _icall_Unit_Float(setEngineForceMethodBind, this.rawMemory, engineForce)
    }


    private val getEngineForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "get_engine_force") }
    open fun getEngineForce(): Float {
        return _icall_Float(getEngineForceMethodBind, this.rawMemory)
    }


    private val setBrakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "set_brake") }
    open fun setBrake(brake: Float) {
        _icall_Unit_Float(setBrakeMethodBind, this.rawMemory, brake)
    }


    private val getBrakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "get_brake") }
    open fun getBrake(): Float {
        return _icall_Float(getBrakeMethodBind, this.rawMemory)
    }


    private val setSteeringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "set_steering") }
    open fun setSteering(steering: Float) {
        _icall_Unit_Float(setSteeringMethodBind, this.rawMemory, steering)
    }


    private val getSteeringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "get_steering") }
    open fun getSteering(): Float {
        return _icall_Float(getSteeringMethodBind, this.rawMemory)
    }


}
