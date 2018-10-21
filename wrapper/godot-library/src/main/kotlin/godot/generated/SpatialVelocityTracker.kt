@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpatialVelocityTracker : Reference {
    constructor() : super("SpatialVelocityTracker")
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
        infix fun from(other: Reference): SpatialVelocityTracker = SpatialVelocityTracker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpatialVelocityTracker = SpatialVelocityTracker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpatialVelocityTracker = fromVariant(SpatialVelocityTracker(""), other)


        // Constants


    }


    // Properties
    open var trackPhysicsStep: Boolean
        get() = _icall_Boolean(isTrackingPhysicsStepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTrackPhysicsStepMethodBind, this.rawMemory, value)




    // Methods
    private val setTrackPhysicsStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialVelocityTracker", "set_track_physics_step") }
    open fun setTrackPhysicsStep(enable: Boolean) {
        _icall_Unit_Boolean(setTrackPhysicsStepMethodBind, this.rawMemory, enable)
    }


    private val isTrackingPhysicsStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialVelocityTracker", "is_tracking_physics_step") }
    open fun isTrackingPhysicsStep(): Boolean {
        return _icall_Boolean(isTrackingPhysicsStepMethodBind, this.rawMemory)
    }


    private val updatePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialVelocityTracker", "update_position") }
    open fun updatePosition(position: Vector3) {
        _icall_Unit_Vector3(updatePositionMethodBind, this.rawMemory, position)
    }


    private val getTrackedLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialVelocityTracker", "get_tracked_linear_velocity") }
    open fun getTrackedLinearVelocity(): Vector3 {
        return _icall_Vector3(getTrackedLinearVelocityMethodBind, this.rawMemory)
    }


    private val resetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpatialVelocityTracker", "reset") }
    open fun reset(position: Vector3) {
        _icall_Unit_Vector3(resetMethodBind, this.rawMemory, position)
    }


}
