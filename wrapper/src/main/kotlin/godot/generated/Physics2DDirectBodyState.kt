@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DDirectBodyState : Object {
    private constructor() : super("")
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
        infix fun from(other: Object): Physics2DDirectBodyState = Physics2DDirectBodyState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DDirectBodyState = fromVariant(Physics2DDirectBodyState(""), other)


        // Constants


    }


    // Properties
    open val step: Double
        get() = _icall_Double(getStepMethodBind, this.rawMemory)


    open val inverseMass: Double
        get() = _icall_Double(getInverseMassMethodBind, this.rawMemory)


    open val inverseInertia: Double
        get() = _icall_Double(getInverseInertiaMethodBind, this.rawMemory)


    open val totalAngularDamp: Double
        get() = _icall_Double(getTotalAngularDampMethodBind, this.rawMemory)


    open val totalLinearDamp: Double
        get() = _icall_Double(getTotalLinearDampMethodBind, this.rawMemory)


    open val totalGravity: Vector2
        get() = _icall_Vector2(getTotalGravityMethodBind, this.rawMemory)


    open var angularVelocity: Double
        get() = _icall_Double(getAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAngularVelocityMethodBind, this.rawMemory, value)


    open var linearVelocity: Vector2
        get() = _icall_Vector2(getLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setLinearVelocityMethodBind, this.rawMemory, value)
    open fun linearVelocity(shedule: (Vector2) -> Unit): Vector2 = linearVelocity.apply {
        shedule(this)
        linearVelocity = this
    }


    open var sleeping: Boolean
        get() = _icall_Boolean(isSleepingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSleepStateMethodBind, this.rawMemory, value)


    open var transform: Transform2D
        get() = _icall_Transform2D(getTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, value)
    open fun transform(shedule: (Transform2D) -> Unit): Transform2D = transform.apply {
        shedule(this)
        transform = this
    }




    // Methods
    private val getTotalGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_total_gravity") }
    open fun getTotalGravity(): Vector2 {
        return _icall_Vector2(getTotalGravityMethodBind, this.rawMemory)
    }


    private val getTotalLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_total_linear_damp") }
    open fun getTotalLinearDamp(): Double {
        return _icall_Double(getTotalLinearDampMethodBind, this.rawMemory)
    }


    private val getTotalAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_total_angular_damp") }
    open fun getTotalAngularDamp(): Double {
        return _icall_Double(getTotalAngularDampMethodBind, this.rawMemory)
    }


    private val getInverseMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_inverse_mass") }
    open fun getInverseMass(): Double {
        return _icall_Double(getInverseMassMethodBind, this.rawMemory)
    }


    private val getInverseInertiaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_inverse_inertia") }
    open fun getInverseInertia(): Double {
        return _icall_Double(getInverseInertiaMethodBind, this.rawMemory)
    }


    private val setLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "set_linear_velocity") }
    open fun setLinearVelocity(velocity: Vector2) {
        _icall_Unit_Vector2(setLinearVelocityMethodBind, this.rawMemory, velocity)
    }


    private val getLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_linear_velocity") }
    open fun getLinearVelocity(): Vector2 {
        return _icall_Vector2(getLinearVelocityMethodBind, this.rawMemory)
    }


    private val setAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "set_angular_velocity") }
    open fun setAngularVelocity(velocity: Double) {
        _icall_Unit_Double(setAngularVelocityMethodBind, this.rawMemory, velocity)
    }


    private val getAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_angular_velocity") }
    open fun getAngularVelocity(): Double {
        return _icall_Double(getAngularVelocityMethodBind, this.rawMemory)
    }


    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "set_transform") }
    open fun setTransform(transform: Transform2D) {
        _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, transform)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_transform") }
    open fun getTransform(): Transform2D {
        return _icall_Transform2D(getTransformMethodBind, this.rawMemory)
    }


    private val setSleepStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "set_sleep_state") }
    open fun setSleepState(enabled: Boolean) {
        _icall_Unit_Boolean(setSleepStateMethodBind, this.rawMemory, enabled)
    }


    private val isSleepingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "is_sleeping") }
    open fun isSleeping(): Boolean {
        return _icall_Boolean(isSleepingMethodBind, this.rawMemory)
    }


    private val getContactCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_count") }
    open fun getContactCount(): Long {
        return _icall_Long(getContactCountMethodBind, this.rawMemory)
    }


    private val getContactLocalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_local_position") }
    open fun getContactLocalPosition(contactIdx: Long): Vector2 {
        return _icall_Vector2_Long(getContactLocalPositionMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactLocalNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_local_normal") }
    open fun getContactLocalNormal(contactIdx: Long): Vector2 {
        return _icall_Vector2_Long(getContactLocalNormalMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactLocalShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_local_shape") }
    open fun getContactLocalShape(contactIdx: Long): Long {
        return _icall_Long_Long(getContactLocalShapeMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider") }
    open fun getContactCollider(contactIdx: Long): RID {
        return _icall_RID_Long(getContactColliderMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider_position") }
    open fun getContactColliderPosition(contactIdx: Long): Vector2 {
        return _icall_Vector2_Long(getContactColliderPositionMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider_id") }
    open fun getContactColliderId(contactIdx: Long): Long {
        return _icall_Long_Long(getContactColliderIdMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider_object") }
    open fun getContactColliderObject(contactIdx: Long): Object {
        return _icall_Object_Long(getContactColliderObjectMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider_shape") }
    open fun getContactColliderShape(contactIdx: Long): Long {
        return _icall_Long_Long(getContactColliderShapeMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderShapeMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider_shape_metadata") }
    open fun getContactColliderShapeMetadata(contactIdx: Long): Variant {
        return _icall_Variant_Long(getContactColliderShapeMetadataMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderVelocityAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_contact_collider_velocity_at_position") }
    open fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector2 {
        return _icall_Vector2_Long(getContactColliderVelocityAtPositionMethodBind, this.rawMemory, contactIdx)
    }


    private val getStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_step") }
    open fun getStep(): Double {
        return _icall_Double(getStepMethodBind, this.rawMemory)
    }


    private val integrateForcesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "integrate_forces") }
    open fun integrateForces() {
        _icall_Unit(integrateForcesMethodBind, this.rawMemory)
    }


    private val getSpaceStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectBodyState", "get_space_state") }
    open fun getSpaceState(): Physics2DDirectSpaceState {
        return _icall_Physics2DDirectSpaceState(getSpaceStateMethodBind, this.rawMemory)
    }


}
