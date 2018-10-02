@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsDirectBodyState : Object {
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
        infix fun from(other: Object): PhysicsDirectBodyState = PhysicsDirectBodyState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicsDirectBodyState = fromVariant(PhysicsDirectBodyState(""), other)


        // Constants


    }


    // Properties
    open val step: Double
        get() = _icall_Double(getStepMethodBind, this.rawMemory)


    open val inverseMass: Double
        get() = _icall_Double(getInverseMassMethodBind, this.rawMemory)


    open val totalAngularDamp: Double
        get() = _icall_Double(getTotalAngularDampMethodBind, this.rawMemory)


    open val totalLinearDamp: Double
        get() = _icall_Double(getTotalLinearDampMethodBind, this.rawMemory)


    open val inverseInertia: Vector3
        get() = _icall_Vector3(getInverseInertiaMethodBind, this.rawMemory)


    open val totalGravity: Vector3
        get() = _icall_Vector3(getTotalGravityMethodBind, this.rawMemory)


    open val centerOfMass: Vector3
        get() = _icall_Vector3(getCenterOfMassMethodBind, this.rawMemory)


    open val principalInertiaAxes: Basis
        get() = _icall_Basis(getPrincipalInertiaAxesMethodBind, this.rawMemory)


    open var angularVelocity: Vector3
        get() = _icall_Vector3(getAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setAngularVelocityMethodBind, this.rawMemory, value)
    open fun angularVelocity(shedule: (Vector3) -> Unit): Vector3 = angularVelocity.apply {
        shedule(this)
        angularVelocity = this
    }


    open var linearVelocity: Vector3
        get() = _icall_Vector3(getLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setLinearVelocityMethodBind, this.rawMemory, value)
    open fun linearVelocity(shedule: (Vector3) -> Unit): Vector3 = linearVelocity.apply {
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
    private val getTotalGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_total_gravity") }
    open fun getTotalGravity(): Vector3 {
        return _icall_Vector3(getTotalGravityMethodBind, this.rawMemory)
    }


    private val getTotalLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_total_linear_damp") }
    open fun getTotalLinearDamp(): Double {
        return _icall_Double(getTotalLinearDampMethodBind, this.rawMemory)
    }


    private val getTotalAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_total_angular_damp") }
    open fun getTotalAngularDamp(): Double {
        return _icall_Double(getTotalAngularDampMethodBind, this.rawMemory)
    }


    private val getCenterOfMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_center_of_mass") }
    open fun getCenterOfMass(): Vector3 {
        return _icall_Vector3(getCenterOfMassMethodBind, this.rawMemory)
    }


    private val getPrincipalInertiaAxesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_principal_inertia_axes") }
    open fun getPrincipalInertiaAxes(): Basis {
        return _icall_Basis(getPrincipalInertiaAxesMethodBind, this.rawMemory)
    }


    private val getInverseMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_inverse_mass") }
    open fun getInverseMass(): Double {
        return _icall_Double(getInverseMassMethodBind, this.rawMemory)
    }


    private val getInverseInertiaMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_inverse_inertia") }
    open fun getInverseInertia(): Vector3 {
        return _icall_Vector3(getInverseInertiaMethodBind, this.rawMemory)
    }


    private val setLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "set_linear_velocity") }
    open fun setLinearVelocity(velocity: Vector3) {
        _icall_Unit_Vector3(setLinearVelocityMethodBind, this.rawMemory, velocity)
    }


    private val getLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_linear_velocity") }
    open fun getLinearVelocity(): Vector3 {
        return _icall_Vector3(getLinearVelocityMethodBind, this.rawMemory)
    }


    private val setAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "set_angular_velocity") }
    open fun setAngularVelocity(velocity: Vector3) {
        _icall_Unit_Vector3(setAngularVelocityMethodBind, this.rawMemory, velocity)
    }


    private val getAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_angular_velocity") }
    open fun getAngularVelocity(): Vector3 {
        return _icall_Vector3(getAngularVelocityMethodBind, this.rawMemory)
    }


    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "set_transform") }
    open fun setTransform(transform: Transform) {
        _icall_Unit_Transform(setTransformMethodBind, this.rawMemory, transform)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_transform") }
    open fun getTransform(): Transform {
        return _icall_Transform(getTransformMethodBind, this.rawMemory)
    }


    private val addCentralForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "add_central_force") }
    open fun addCentralForce(force: Vector3) {
        _icall_Unit_Vector3(addCentralForceMethodBind, this.rawMemory, force)
    }


    private val addForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "add_force") }
    open fun addForce(force: Vector3, position: Vector3) {
        _icall_Unit_Vector3_Vector3(addForceMethodBind, this.rawMemory, force, position)
    }


    private val addTorqueMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "add_torque") }
    open fun addTorque(torque: Vector3) {
        _icall_Unit_Vector3(addTorqueMethodBind, this.rawMemory, torque)
    }


    private val applyImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "apply_impulse") }
    open fun applyImpulse(position: Vector3, j: Vector3) {
        _icall_Unit_Vector3_Vector3(applyImpulseMethodBind, this.rawMemory, position, j)
    }


    private val applyTorqueImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "apply_torque_impulse") }
    open fun applyTorqueImpulse(j: Vector3) {
        _icall_Unit_Vector3(applyTorqueImpulseMethodBind, this.rawMemory, j)
    }


    private val setSleepStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "set_sleep_state") }
    open fun setSleepState(enabled: Boolean) {
        _icall_Unit_Boolean(setSleepStateMethodBind, this.rawMemory, enabled)
    }


    private val isSleepingMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "is_sleeping") }
    open fun isSleeping(): Boolean {
        return _icall_Boolean(isSleepingMethodBind, this.rawMemory)
    }


    private val getContactCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_count") }
    open fun getContactCount(): Long {
        return _icall_Long(getContactCountMethodBind, this.rawMemory)
    }


    private val getContactLocalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_local_position") }
    open fun getContactLocalPosition(contactIdx: Long): Vector3 {
        return _icall_Vector3_Long(getContactLocalPositionMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactLocalNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_local_normal") }
    open fun getContactLocalNormal(contactIdx: Long): Vector3 {
        return _icall_Vector3_Long(getContactLocalNormalMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactLocalShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_local_shape") }
    open fun getContactLocalShape(contactIdx: Long): Long {
        return _icall_Long_Long(getContactLocalShapeMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_collider") }
    open fun getContactCollider(contactIdx: Long): RID {
        return _icall_RID_Long(getContactColliderMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_collider_position") }
    open fun getContactColliderPosition(contactIdx: Long): Vector3 {
        return _icall_Vector3_Long(getContactColliderPositionMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_collider_id") }
    open fun getContactColliderId(contactIdx: Long): Long {
        return _icall_Long_Long(getContactColliderIdMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_collider_object") }
    open fun getContactColliderObject(contactIdx: Long): Object {
        return _icall_Object_Long(getContactColliderObjectMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_collider_shape") }
    open fun getContactColliderShape(contactIdx: Long): Long {
        return _icall_Long_Long(getContactColliderShapeMethodBind, this.rawMemory, contactIdx)
    }


    private val getContactColliderVelocityAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_contact_collider_velocity_at_position") }
    open fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector3 {
        return _icall_Vector3_Long(getContactColliderVelocityAtPositionMethodBind, this.rawMemory, contactIdx)
    }


    private val getStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_step") }
    open fun getStep(): Double {
        return _icall_Double(getStepMethodBind, this.rawMemory)
    }


    private val integrateForcesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "integrate_forces") }
    open fun integrateForces() {
        _icall_Unit(integrateForcesMethodBind, this.rawMemory)
    }


    private val getSpaceStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectBodyState", "get_space_state") }
    open fun getSpaceState(): PhysicsDirectSpaceState {
        return _icall_PhysicsDirectSpaceState(getSpaceStateMethodBind, this.rawMemory)
    }


}
