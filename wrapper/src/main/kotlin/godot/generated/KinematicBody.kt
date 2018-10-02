@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class KinematicBody : PhysicsBody {
    constructor() : super("KinematicBody")
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
        infix fun from(other: PhysicsBody): KinematicBody = KinematicBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject): KinematicBody = KinematicBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): KinematicBody = KinematicBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): KinematicBody = KinematicBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): KinematicBody = KinematicBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): KinematicBody = fromVariant(KinematicBody(""), other)


        // Constants


    }


    // Properties
    open var axisLockLinearX: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 1, value)


    open var axisLockLinearY: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 2, value)


    open var axisLockLinearZ: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 4, value)


    open var axisLockAngularX: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 8, value)


    open var axisLockAngularY: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 16, value)


    open var axisLockAngularZ: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 32, value)


    open var collision_safeMargin: Float
        get() = _icall_Float(getSafeMarginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSafeMarginMethodBind, this.rawMemory, value)




    // Methods
    private val moveAndCollideMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "move_and_collide") }
    open fun moveAndCollide(relVec: Vector3, infiniteInertia: Boolean = true): KinematicCollision {
        return _icall_KinematicCollision_Vector3_Boolean(moveAndCollideMethodBind, this.rawMemory, relVec, infiniteInertia)
    }


    private val moveAndSlideMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "move_and_slide") }
    open fun moveAndSlide(linearVelocity: Vector3, floorNormal: Vector3 = Vector3(0, 0, 0), slopeStopMinVelocity: Float = 0.05f, maxSlides: Int = 4, floorMaxAngle: Float = 0.785398f, infiniteInertia: Boolean = true): Vector3 {
        return _icall_Vector3_Vector3_Vector3_Float_Int_Float_Boolean(moveAndSlideMethodBind, this.rawMemory, linearVelocity, floorNormal, slopeStopMinVelocity, maxSlides, floorMaxAngle, infiniteInertia)
    }


    private val testMoveMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "test_move") }
    open fun testMove(from: Transform, relVec: Vector3, infiniteInertia: Boolean): Boolean {
        return _icall_Boolean_Transform_Vector3_Boolean(testMoveMethodBind, this.rawMemory, from, relVec, infiniteInertia)
    }


    private val isOnFloorMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "is_on_floor") }
    open fun isOnFloor(): Boolean {
        return _icall_Boolean(isOnFloorMethodBind, this.rawMemory)
    }


    private val isOnCeilingMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "is_on_ceiling") }
    open fun isOnCeiling(): Boolean {
        return _icall_Boolean(isOnCeilingMethodBind, this.rawMemory)
    }


    private val isOnWallMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "is_on_wall") }
    open fun isOnWall(): Boolean {
        return _icall_Boolean(isOnWallMethodBind, this.rawMemory)
    }


    private val getFloorVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "get_floor_velocity") }
    open fun getFloorVelocity(): Vector3 {
        return _icall_Vector3(getFloorVelocityMethodBind, this.rawMemory)
    }


    private val setAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "set_axis_lock") }
    open fun setAxisLock(axis: Int, lock: Boolean) {
        _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, axis, lock)
    }


    private val getAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "get_axis_lock") }
    open fun getAxisLock(axis: Int): Boolean {
        return _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, axis)
    }


    private val setSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "set_safe_margin") }
    open fun setSafeMargin(pixels: Float) {
        _icall_Unit_Float(setSafeMarginMethodBind, this.rawMemory, pixels)
    }


    private val getSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "get_safe_margin") }
    open fun getSafeMargin(): Float {
        return _icall_Float(getSafeMarginMethodBind, this.rawMemory)
    }


    private val getSlideCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "get_slide_count") }
    open fun getSlideCount(): Int {
        return _icall_Int(getSlideCountMethodBind, this.rawMemory)
    }


    private val getSlideCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody", "get_slide_collision") }
    open fun getSlideCollision(slideIdx: Int): KinematicCollision {
        return _icall_KinematicCollision_Int(getSlideCollisionMethodBind, this.rawMemory, slideIdx)
    }


}
