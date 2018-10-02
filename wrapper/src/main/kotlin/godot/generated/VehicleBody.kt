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
    open var engineForce: Double
        get() = _icall_Double(getEngineForceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEngineForceMethodBind, this.rawMemory, value)


    open var brake: Double
        get() = _icall_Double(getBrakeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBrakeMethodBind, this.rawMemory, value)


    open var steering: Double
        get() = _icall_Double(getSteeringMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSteeringMethodBind, this.rawMemory, value)




    // Methods
    private val setEngineForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "set_engine_force") }
    open fun setEngineForce(engineForce: Double) {
        _icall_Unit_Double(setEngineForceMethodBind, this.rawMemory, engineForce)
    }


    private val getEngineForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "get_engine_force") }
    open fun getEngineForce(): Double {
        return _icall_Double(getEngineForceMethodBind, this.rawMemory)
    }


    private val setBrakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "set_brake") }
    open fun setBrake(brake: Double) {
        _icall_Unit_Double(setBrakeMethodBind, this.rawMemory, brake)
    }


    private val getBrakeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "get_brake") }
    open fun getBrake(): Double {
        return _icall_Double(getBrakeMethodBind, this.rawMemory)
    }


    private val setSteeringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "set_steering") }
    open fun setSteering(steering: Double) {
        _icall_Unit_Double(setSteeringMethodBind, this.rawMemory, steering)
    }


    private val getSteeringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleBody", "get_steering") }
    open fun getSteering(): Double {
        return _icall_Double(getSteeringMethodBind, this.rawMemory)
    }


}
