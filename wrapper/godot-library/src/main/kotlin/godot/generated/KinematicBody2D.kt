@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class KinematicBody2D : PhysicsBody2D {
    constructor() : super("KinematicBody2D")
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
        infix fun from(other: PhysicsBody2D): KinematicBody2D = KinematicBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject2D): KinematicBody2D = KinematicBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): KinematicBody2D = KinematicBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): KinematicBody2D = KinematicBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): KinematicBody2D = KinematicBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): KinematicBody2D = KinematicBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): KinematicBody2D = fromVariant(KinematicBody2D(""), other)


        // Constants


    }


    // Properties
    open var collision_safeMargin: Double
        get() = _icall_Double(getSafeMarginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSafeMarginMethodBind, this.rawMemory, value)


    open var motion_syncToPhysics: Boolean
        get() = _icall_Boolean(isSyncToPhysicsEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSyncToPhysicsMethodBind, this.rawMemory, value)




    // Methods
    private val moveAndCollideMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "move_and_collide") }
    open fun moveAndCollide(relVec: Vector2, infiniteInertia: Boolean = true, excludeRaycastShapes: Boolean = true, testOnly: Boolean = false): KinematicCollision2D {
        return _icall_KinematicCollision2D_Vector2_Boolean_Boolean_Boolean(moveAndCollideMethodBind, this.rawMemory, relVec, infiniteInertia, excludeRaycastShapes, testOnly)
    }


    private val moveAndSlideMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "move_and_slide") }
    open fun moveAndSlide(linearVelocity: Vector2, floorNormal: Vector2 = Vector2(0, 0), infiniteInertia: Boolean = true, slopeStopMinVelocity: Double = 5.0, maxBounces: Long = 4, floorMaxAngle: Double = 0.785398): Vector2 {
        return _icall_Vector2_Vector2_Vector2_Boolean_Double_Long_Double(moveAndSlideMethodBind, this.rawMemory, linearVelocity, floorNormal, infiniteInertia, slopeStopMinVelocity, maxBounces, floorMaxAngle)
    }


    private val moveAndSlideWithSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "move_and_slide_with_snap") }
    open fun moveAndSlideWithSnap(linearVelocity: Vector2, snap: Vector2, floorNormal: Vector2 = Vector2(0, 0), infiniteInertia: Boolean = true, slopeStopMinVelocity: Double = 5.0, maxBounces: Long = 4, floorMaxAngle: Double = 0.785398): Vector2 {
        return _icall_Vector2_Vector2_Vector2_Vector2_Boolean_Double_Long_Double(moveAndSlideWithSnapMethodBind, this.rawMemory, linearVelocity, snap, floorNormal, infiniteInertia, slopeStopMinVelocity, maxBounces, floorMaxAngle)
    }


    private val testMoveMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "test_move") }
    open fun testMove(from: Transform2D, relVec: Vector2, infiniteInertia: Boolean): Boolean {
        return _icall_Boolean_Transform2D_Vector2_Boolean(testMoveMethodBind, this.rawMemory, from, relVec, infiniteInertia)
    }


    private val isOnFloorMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "is_on_floor") }
    open fun isOnFloor(): Boolean {
        return _icall_Boolean(isOnFloorMethodBind, this.rawMemory)
    }


    private val isOnCeilingMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "is_on_ceiling") }
    open fun isOnCeiling(): Boolean {
        return _icall_Boolean(isOnCeilingMethodBind, this.rawMemory)
    }


    private val isOnWallMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "is_on_wall") }
    open fun isOnWall(): Boolean {
        return _icall_Boolean(isOnWallMethodBind, this.rawMemory)
    }


    private val getFloorVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "get_floor_velocity") }
    open fun getFloorVelocity(): Vector2 {
        return _icall_Vector2(getFloorVelocityMethodBind, this.rawMemory)
    }


    private val setSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "set_safe_margin") }
    open fun setSafeMargin(pixels: Double) {
        _icall_Unit_Double(setSafeMarginMethodBind, this.rawMemory, pixels)
    }


    private val getSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "get_safe_margin") }
    open fun getSafeMargin(): Double {
        return _icall_Double(getSafeMarginMethodBind, this.rawMemory)
    }


    private val getSlideCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "get_slide_count") }
    open fun getSlideCount(): Long {
        return _icall_Long(getSlideCountMethodBind, this.rawMemory)
    }


    private val getSlideCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "get_slide_collision") }
    open fun getSlideCollision(slideIdx: Long): KinematicCollision2D {
        return _icall_KinematicCollision2D_Long(getSlideCollisionMethodBind, this.rawMemory, slideIdx)
    }


    private val setSyncToPhysicsMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "set_sync_to_physics") }
    open fun setSyncToPhysics(enable: Boolean) {
        _icall_Unit_Boolean(setSyncToPhysicsMethodBind, this.rawMemory, enable)
    }


    private val isSyncToPhysicsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicBody2D", "is_sync_to_physics_enabled") }
    open fun isSyncToPhysicsEnabled(): Boolean {
        return _icall_Boolean(isSyncToPhysicsEnabledMethodBind, this.rawMemory)
    }


    open fun _direct_state_changed(arg0: Object) {
    }


}
