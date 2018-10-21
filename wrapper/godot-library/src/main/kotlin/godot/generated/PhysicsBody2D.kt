@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsBody2D : CollisionObject2D {
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
        infix fun from(other: CollisionObject2D): PhysicsBody2D = PhysicsBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): PhysicsBody2D = PhysicsBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PhysicsBody2D = PhysicsBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PhysicsBody2D = PhysicsBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PhysicsBody2D = PhysicsBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicsBody2D = fromVariant(PhysicsBody2D(""), other)


        // Constants


    }


    // Properties
    open var collisionLayer: Long
        get() = _icall_Long(getCollisionLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCollisionLayerMethodBind, this.rawMemory, value)


    open var collisionMask: Long
        get() = _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_layer") }
    open fun setCollisionLayer(layer: Long) {
        _icall_Unit_Long(setCollisionLayerMethodBind, this.rawMemory, layer)
    }


    private val getCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_layer") }
    open fun getCollisionLayer(): Long {
        return _icall_Long(getCollisionLayerMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_mask") }
    open fun setCollisionMask(mask: Long) {
        _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, mask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_mask") }
    open fun getCollisionMask(): Long {
        return _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_mask_bit") }
    open fun setCollisionMaskBit(bit: Long, value: Boolean) {
        _icall_Unit_Long_Boolean(setCollisionMaskBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_mask_bit") }
    open fun getCollisionMaskBit(bit: Long): Boolean {
        return _icall_Boolean_Long(getCollisionMaskBitMethodBind, this.rawMemory, bit)
    }


    private val setCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_layer_bit") }
    open fun setCollisionLayerBit(bit: Long, value: Boolean) {
        _icall_Unit_Long_Boolean(setCollisionLayerBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_layer_bit") }
    open fun getCollisionLayerBit(bit: Long): Boolean {
        return _icall_Boolean_Long(getCollisionLayerBitMethodBind, this.rawMemory, bit)
    }


    open fun _set_layers(mask: Long) {
    }


    open fun _get_layers(): Long {
        throw NotImplementedError("_get_layers is not implemented for PhysicsBody2D")
    }


    private val addCollisionExceptionWithMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "add_collision_exception_with") }
    open fun addCollisionExceptionWith(body: Object) {
        _icall_Unit_Object(addCollisionExceptionWithMethodBind, this.rawMemory, body)
    }


    private val removeCollisionExceptionWithMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "remove_collision_exception_with") }
    open fun removeCollisionExceptionWith(body: Object) {
        _icall_Unit_Object(removeCollisionExceptionWithMethodBind, this.rawMemory, body)
    }


}
