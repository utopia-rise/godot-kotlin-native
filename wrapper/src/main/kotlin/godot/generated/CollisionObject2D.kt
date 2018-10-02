@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CollisionObject2D : Node2D {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val MOUSE_EXITED: String = "mouse_exited"
            const val MOUSE_ENTERED: String = "mouse_entered"
            const val INPUT_EVENT: String = "input_event"
        }
    }


    companion object {
        infix fun from(other: Node2D): CollisionObject2D = CollisionObject2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CollisionObject2D = CollisionObject2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CollisionObject2D = CollisionObject2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CollisionObject2D = CollisionObject2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CollisionObject2D = fromVariant(CollisionObject2D(""), other)


        // Constants


    }


    // Properties
    open var inputPickable: Boolean
        get() = _icall_Boolean(isPickableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPickableMethodBind, this.rawMemory, value)




    // Methods
    open fun _input_event(viewport: Object, event: InputEvent, shapeIdx: Int) {
    }


    private val getRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "get_rid") }
    open fun getRid(): RID {
        return _icall_RID(getRidMethodBind, this.rawMemory)
    }


    private val setPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "set_pickable") }
    open fun setPickable(enabled: Boolean) {
        _icall_Unit_Boolean(setPickableMethodBind, this.rawMemory, enabled)
    }


    private val isPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "is_pickable") }
    open fun isPickable(): Boolean {
        return _icall_Boolean(isPickableMethodBind, this.rawMemory)
    }


    private val createShapeOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "create_shape_owner") }
    open fun createShapeOwner(owner: Object): Int {
        return _icall_Int_Object(createShapeOwnerMethodBind, this.rawMemory, owner)
    }


    private val removeShapeOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "remove_shape_owner") }
    open fun removeShapeOwner(ownerId: Int) {
        _icall_Unit_Int(removeShapeOwnerMethodBind, this.rawMemory, ownerId)
    }


    private val getShapeOwnersMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "get_shape_owners") }
    open fun getShapeOwners(): GDArray {
        return _icall_GDArray(getShapeOwnersMethodBind, this.rawMemory)
    }


    private val shapeOwnerSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_set_transform") }
    open fun shapeOwnerSetTransform(ownerId: Int, transform: Transform2D) {
        _icall_Unit_Int_Transform2D(shapeOwnerSetTransformMethodBind, this.rawMemory, ownerId, transform)
    }


    private val shapeOwnerGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_get_transform") }
    open fun shapeOwnerGetTransform(ownerId: Int): Transform2D {
        return _icall_Transform2D_Int(shapeOwnerGetTransformMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerGetOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_get_owner") }
    open fun shapeOwnerGetOwner(ownerId: Int): Object {
        return _icall_Object_Int(shapeOwnerGetOwnerMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerSetDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_set_disabled") }
    open fun shapeOwnerSetDisabled(ownerId: Int, disabled: Boolean) {
        _icall_Unit_Int_Boolean(shapeOwnerSetDisabledMethodBind, this.rawMemory, ownerId, disabled)
    }


    private val isShapeOwnerDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "is_shape_owner_disabled") }
    open fun isShapeOwnerDisabled(ownerId: Int): Boolean {
        return _icall_Boolean_Int(isShapeOwnerDisabledMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerSetOneWayCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_set_one_way_collision") }
    open fun shapeOwnerSetOneWayCollision(ownerId: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(shapeOwnerSetOneWayCollisionMethodBind, this.rawMemory, ownerId, enable)
    }


    private val isShapeOwnerOneWayCollisionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "is_shape_owner_one_way_collision_enabled") }
    open fun isShapeOwnerOneWayCollisionEnabled(ownerId: Int): Boolean {
        return _icall_Boolean_Int(isShapeOwnerOneWayCollisionEnabledMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_add_shape") }
    open fun shapeOwnerAddShape(ownerId: Int, shape: Shape2D) {
        _icall_Unit_Int_Object(shapeOwnerAddShapeMethodBind, this.rawMemory, ownerId, shape)
    }


    private val shapeOwnerGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_get_shape_count") }
    open fun shapeOwnerGetShapeCount(ownerId: Int): Int {
        return _icall_Int_Int(shapeOwnerGetShapeCountMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_get_shape") }
    open fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape2D {
        return _icall_Shape2D_Int_Int(shapeOwnerGetShapeMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerGetShapeIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_get_shape_index") }
    open fun shapeOwnerGetShapeIndex(ownerId: Int, shapeId: Int): Int {
        return _icall_Int_Int_Int(shapeOwnerGetShapeIndexMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_remove_shape") }
    open fun shapeOwnerRemoveShape(ownerId: Int, shapeId: Int) {
        _icall_Unit_Int_Int(shapeOwnerRemoveShapeMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_owner_clear_shapes") }
    open fun shapeOwnerClearShapes(ownerId: Int) {
        _icall_Unit_Int(shapeOwnerClearShapesMethodBind, this.rawMemory, ownerId)
    }


    private val shapeFindOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject2D", "shape_find_owner") }
    open fun shapeFindOwner(shapeIndex: Int): Int {
        return _icall_Int_Int(shapeFindOwnerMethodBind, this.rawMemory, shapeIndex)
    }


}
