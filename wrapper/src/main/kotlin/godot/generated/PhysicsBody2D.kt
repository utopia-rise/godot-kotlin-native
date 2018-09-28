@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open var collisionLayer: Int
        get() = _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, value)


    open var collisionMask: Int
        get() = _icall_Int(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_layer") }
    open fun setCollisionLayer(layer: Int) {
        _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, layer)
    }


    private val getCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_layer") }
    open fun getCollisionLayer(): Int {
        return _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_mask") }
    open fun setCollisionMask(mask: Int) {
        _icall_Unit_Int(setCollisionMaskMethodBind, this.rawMemory, mask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_mask") }
    open fun getCollisionMask(): Int {
        return _icall_Int(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_mask_bit") }
    open fun setCollisionMaskBit(bit: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setCollisionMaskBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_mask_bit") }
    open fun getCollisionMaskBit(bit: Int): Boolean {
        return _icall_Boolean_Int(getCollisionMaskBitMethodBind, this.rawMemory, bit)
    }


    private val setCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "set_collision_layer_bit") }
    open fun setCollisionLayerBit(bit: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setCollisionLayerBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsBody2D", "get_collision_layer_bit") }
    open fun getCollisionLayerBit(bit: Int): Boolean {
        return _icall_Boolean_Int(getCollisionLayerBitMethodBind, this.rawMemory, bit)
    }


    open fun _set_layers(mask: Int) {
    }


    open fun _get_layers(): Int {
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
