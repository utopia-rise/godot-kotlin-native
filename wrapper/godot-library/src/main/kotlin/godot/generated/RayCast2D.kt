@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RayCast2D : Node2D {
    constructor() : super("RayCast2D")
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
        infix fun from(other: Node2D): RayCast2D = RayCast2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): RayCast2D = RayCast2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): RayCast2D = RayCast2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RayCast2D = RayCast2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RayCast2D = fromVariant(RayCast2D(""), other)


        // Constants


    }


    // Properties
    open var enabled: Boolean
        get() = _icall_Boolean(isEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, value)


    open var excludeParent: Boolean
        get() = _icall_Boolean(getExcludeParentBodyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExcludeParentBodyMethodBind, this.rawMemory, value)


    open var castTo: Vector2
        get() = _icall_Vector2(getCastToMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setCastToMethodBind, this.rawMemory, value)
    open fun castTo(shedule: (Vector2) -> Unit): Vector2 = castTo.apply {
        shedule(this)
        castTo = this
    }


    open var collisionMask: Long
        get() = _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "set_enabled") }
    open fun setEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "is_enabled") }
    open fun isEnabled(): Boolean {
        return _icall_Boolean(isEnabledMethodBind, this.rawMemory)
    }


    private val setCastToMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "set_cast_to") }
    open fun setCastTo(localPoint: Vector2) {
        _icall_Unit_Vector2(setCastToMethodBind, this.rawMemory, localPoint)
    }


    private val getCastToMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_cast_to") }
    open fun getCastTo(): Vector2 {
        return _icall_Vector2(getCastToMethodBind, this.rawMemory)
    }


    private val isCollidingMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "is_colliding") }
    open fun isColliding(): Boolean {
        return _icall_Boolean(isCollidingMethodBind, this.rawMemory)
    }


    private val forceRaycastUpdateMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "force_raycast_update") }
    open fun forceRaycastUpdate() {
        _icall_Unit(forceRaycastUpdateMethodBind, this.rawMemory)
    }


    private val getColliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_collider") }
    open fun getCollider(): Object {
        return _icall_Object(getColliderMethodBind, this.rawMemory)
    }


    private val getColliderShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_collider_shape") }
    open fun getColliderShape(): Long {
        return _icall_Long(getColliderShapeMethodBind, this.rawMemory)
    }


    private val getCollisionPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_collision_point") }
    open fun getCollisionPoint(): Vector2 {
        return _icall_Vector2(getCollisionPointMethodBind, this.rawMemory)
    }


    private val getCollisionNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_collision_normal") }
    open fun getCollisionNormal(): Vector2 {
        return _icall_Vector2(getCollisionNormalMethodBind, this.rawMemory)
    }


    private val addExceptionRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "add_exception_rid") }
    open fun addExceptionRid(rid: RID) {
        _icall_Unit_RID(addExceptionRidMethodBind, this.rawMemory, rid)
    }


    private val addExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "add_exception") }
    open fun addException(node: Object) {
        _icall_Unit_Object(addExceptionMethodBind, this.rawMemory, node)
    }


    private val removeExceptionRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "remove_exception_rid") }
    open fun removeExceptionRid(rid: RID) {
        _icall_Unit_RID(removeExceptionRidMethodBind, this.rawMemory, rid)
    }


    private val removeExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "remove_exception") }
    open fun removeException(node: Object) {
        _icall_Unit_Object(removeExceptionMethodBind, this.rawMemory, node)
    }


    private val clearExceptionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "clear_exceptions") }
    open fun clearExceptions() {
        _icall_Unit(clearExceptionsMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "set_collision_mask") }
    open fun setCollisionMask(mask: Long) {
        _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, mask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_collision_mask") }
    open fun getCollisionMask(): Long {
        return _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "set_collision_mask_bit") }
    open fun setCollisionMaskBit(bit: Long, value: Boolean) {
        _icall_Unit_Long_Boolean(setCollisionMaskBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_collision_mask_bit") }
    open fun getCollisionMaskBit(bit: Long): Boolean {
        return _icall_Boolean_Long(getCollisionMaskBitMethodBind, this.rawMemory, bit)
    }


    private val setExcludeParentBodyMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "set_exclude_parent_body") }
    open fun setExcludeParentBody(mask: Boolean) {
        _icall_Unit_Boolean(setExcludeParentBodyMethodBind, this.rawMemory, mask)
    }


    private val getExcludeParentBodyMethodBind: CPointer<godot_method_bind> by lazy { getMB("RayCast2D", "get_exclude_parent_body") }
    open fun getExcludeParentBody(): Boolean {
        return _icall_Boolean(getExcludeParentBodyMethodBind, this.rawMemory)
    }


}
