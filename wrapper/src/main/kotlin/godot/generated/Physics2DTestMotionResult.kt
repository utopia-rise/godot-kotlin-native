@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DTestMotionResult : Reference {
    constructor() : super("Physics2DTestMotionResult")
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
        infix fun from(other: Reference): Physics2DTestMotionResult = Physics2DTestMotionResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Physics2DTestMotionResult = Physics2DTestMotionResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DTestMotionResult = fromVariant(Physics2DTestMotionResult(""), other)


        // Constants


    }


    // Properties
    open val motion: Vector2
        get() = _icall_Vector2(getMotionMethodBind, this.rawMemory)


    open val motionRemainder: Vector2
        get() = _icall_Vector2(getMotionRemainderMethodBind, this.rawMemory)


    open val collisionPoint: Vector2
        get() = _icall_Vector2(getCollisionPointMethodBind, this.rawMemory)


    open val collisionNormal: Vector2
        get() = _icall_Vector2(getCollisionNormalMethodBind, this.rawMemory)


    open val colliderVelocity: Vector2
        get() = _icall_Vector2(getColliderVelocityMethodBind, this.rawMemory)


    open val colliderId: Long
        get() = _icall_Long(getColliderIdMethodBind, this.rawMemory)


    open val colliderRid: RID
        get() = _icall_RID(getColliderRidMethodBind, this.rawMemory)


    open val collider: Object
        get() = _icall_Object(getColliderMethodBind, this.rawMemory)


    open val colliderShape: Long
        get() = _icall_Long(getColliderShapeMethodBind, this.rawMemory)




    // Methods
    private val getMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_motion") }
    open fun getMotion(): Vector2 {
        return _icall_Vector2(getMotionMethodBind, this.rawMemory)
    }


    private val getMotionRemainderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_motion_remainder") }
    open fun getMotionRemainder(): Vector2 {
        return _icall_Vector2(getMotionRemainderMethodBind, this.rawMemory)
    }


    private val getCollisionPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collision_point") }
    open fun getCollisionPoint(): Vector2 {
        return _icall_Vector2(getCollisionPointMethodBind, this.rawMemory)
    }


    private val getCollisionNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collision_normal") }
    open fun getCollisionNormal(): Vector2 {
        return _icall_Vector2(getCollisionNormalMethodBind, this.rawMemory)
    }


    private val getColliderVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collider_velocity") }
    open fun getColliderVelocity(): Vector2 {
        return _icall_Vector2(getColliderVelocityMethodBind, this.rawMemory)
    }


    private val getColliderIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collider_id") }
    open fun getColliderId(): Long {
        return _icall_Long(getColliderIdMethodBind, this.rawMemory)
    }


    private val getColliderRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collider_rid") }
    open fun getColliderRid(): RID {
        return _icall_RID(getColliderRidMethodBind, this.rawMemory)
    }


    private val getColliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collider") }
    open fun getCollider(): Object {
        return _icall_Object(getColliderMethodBind, this.rawMemory)
    }


    private val getColliderShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DTestMotionResult", "get_collider_shape") }
    open fun getColliderShape(): Long {
        return _icall_Long(getColliderShapeMethodBind, this.rawMemory)
    }


}
