@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class KinematicCollision2D : Reference {
    constructor() : super("KinematicCollision2D")
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
        infix fun from(other: Reference): KinematicCollision2D = KinematicCollision2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): KinematicCollision2D = KinematicCollision2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): KinematicCollision2D = fromVariant(KinematicCollision2D(""), other)


        // Constants


    }


    // Properties
    open val position: Vector2
        get() = _icall_Vector2(getPositionMethodBind, this.rawMemory)


    open val normal: Vector2
        get() = _icall_Vector2(getNormalMethodBind, this.rawMemory)


    open val travel: Vector2
        get() = _icall_Vector2(getTravelMethodBind, this.rawMemory)


    open val remainder: Vector2
        get() = _icall_Vector2(getRemainderMethodBind, this.rawMemory)


    open val localShape: Object
        get() = _icall_Object(getLocalShapeMethodBind, this.rawMemory)


    open val collider: Object
        get() = _icall_Object(getColliderMethodBind, this.rawMemory)


    open val colliderId: Long
        get() = _icall_Long(getColliderIdMethodBind, this.rawMemory)


    open val colliderShape: Object
        get() = _icall_Object(getColliderShapeMethodBind, this.rawMemory)


    open val colliderShapeIndex: Long
        get() = _icall_Long(getColliderShapeIndexMethodBind, this.rawMemory)


    open val colliderVelocity: Vector2
        get() = _icall_Vector2(getColliderVelocityMethodBind, this.rawMemory)


    open val colliderMetadata: Variant
        get() = _icall_Variant(getColliderMetadataMethodBind, this.rawMemory)




    // Methods
    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    private val getNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_normal") }
    open fun getNormal(): Vector2 {
        return _icall_Vector2(getNormalMethodBind, this.rawMemory)
    }


    private val getTravelMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_travel") }
    open fun getTravel(): Vector2 {
        return _icall_Vector2(getTravelMethodBind, this.rawMemory)
    }


    private val getRemainderMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_remainder") }
    open fun getRemainder(): Vector2 {
        return _icall_Vector2(getRemainderMethodBind, this.rawMemory)
    }


    private val getLocalShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_local_shape") }
    open fun getLocalShape(): Object {
        return _icall_Object(getLocalShapeMethodBind, this.rawMemory)
    }


    private val getColliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_collider") }
    open fun getCollider(): Object {
        return _icall_Object(getColliderMethodBind, this.rawMemory)
    }


    private val getColliderIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_collider_id") }
    open fun getColliderId(): Long {
        return _icall_Long(getColliderIdMethodBind, this.rawMemory)
    }


    private val getColliderShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_collider_shape") }
    open fun getColliderShape(): Object {
        return _icall_Object(getColliderShapeMethodBind, this.rawMemory)
    }


    private val getColliderShapeIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_collider_shape_index") }
    open fun getColliderShapeIndex(): Long {
        return _icall_Long(getColliderShapeIndexMethodBind, this.rawMemory)
    }


    private val getColliderVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_collider_velocity") }
    open fun getColliderVelocity(): Vector2 {
        return _icall_Vector2(getColliderVelocityMethodBind, this.rawMemory)
    }


    private val getColliderMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("KinematicCollision2D", "get_collider_metadata") }
    open fun getColliderMetadata(): Variant {
        return _icall_Variant(getColliderMetadataMethodBind, this.rawMemory)
    }


}
