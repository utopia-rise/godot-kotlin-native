@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CollisionObject : Spatial {
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
        infix fun from(other: Spatial): CollisionObject = CollisionObject("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CollisionObject = CollisionObject("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CollisionObject = CollisionObject("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CollisionObject = fromVariant(CollisionObject(""), other)


        // Constants


    }


    // Properties
    open var inputRayPickable: Boolean
        get() = _icall_Boolean(isRayPickableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRayPickableMethodBind, this.rawMemory, value)


    open var inputCaptureOnDrag: Boolean
        get() = _icall_Boolean(getCaptureInputOnDragMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCaptureInputOnDragMethodBind, this.rawMemory, value)




    // Methods
    open fun _input_event(camera: Object, event: InputEvent, clickPosition: Vector3, clickNormal: Vector3, shapeIdx: Long) {
    }


    private val setRayPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "set_ray_pickable") }
    open fun setRayPickable(rayPickable: Boolean) {
        _icall_Unit_Boolean(setRayPickableMethodBind, this.rawMemory, rayPickable)
    }


    private val isRayPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "is_ray_pickable") }
    open fun isRayPickable(): Boolean {
        return _icall_Boolean(isRayPickableMethodBind, this.rawMemory)
    }


    private val setCaptureInputOnDragMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "set_capture_input_on_drag") }
    open fun setCaptureInputOnDrag(enable: Boolean) {
        _icall_Unit_Boolean(setCaptureInputOnDragMethodBind, this.rawMemory, enable)
    }


    private val getCaptureInputOnDragMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "get_capture_input_on_drag") }
    open fun getCaptureInputOnDrag(): Boolean {
        return _icall_Boolean(getCaptureInputOnDragMethodBind, this.rawMemory)
    }


    private val getRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "get_rid") }
    open fun getRid(): RID {
        return _icall_RID(getRidMethodBind, this.rawMemory)
    }


    private val createShapeOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "create_shape_owner") }
    open fun createShapeOwner(owner: Object): Long {
        return _icall_Long_Object(createShapeOwnerMethodBind, this.rawMemory, owner)
    }


    private val removeShapeOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "remove_shape_owner") }
    open fun removeShapeOwner(ownerId: Long) {
        _icall_Unit_Long(removeShapeOwnerMethodBind, this.rawMemory, ownerId)
    }


    private val getShapeOwnersMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "get_shape_owners") }
    open fun getShapeOwners(): GDArray {
        return _icall_GDArray(getShapeOwnersMethodBind, this.rawMemory)
    }


    private val shapeOwnerSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_set_transform") }
    open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform) {
        _icall_Unit_Long_Transform(shapeOwnerSetTransformMethodBind, this.rawMemory, ownerId, transform)
    }


    private val shapeOwnerGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_transform") }
    open fun shapeOwnerGetTransform(ownerId: Long): Transform {
        return _icall_Transform_Long(shapeOwnerGetTransformMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerGetOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_owner") }
    open fun shapeOwnerGetOwner(ownerId: Long): Object {
        return _icall_Object_Long(shapeOwnerGetOwnerMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerSetDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_set_disabled") }
    open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
        _icall_Unit_Long_Boolean(shapeOwnerSetDisabledMethodBind, this.rawMemory, ownerId, disabled)
    }


    private val isShapeOwnerDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "is_shape_owner_disabled") }
    open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
        return _icall_Boolean_Long(isShapeOwnerDisabledMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_add_shape") }
    open fun shapeOwnerAddShape(ownerId: Long, shape: Shape) {
        _icall_Unit_Long_Object(shapeOwnerAddShapeMethodBind, this.rawMemory, ownerId, shape)
    }


    private val shapeOwnerGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_shape_count") }
    open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
        return _icall_Long_Long(shapeOwnerGetShapeCountMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_shape") }
    open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape {
        return _icall_Shape_Long_Long(shapeOwnerGetShapeMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerGetShapeIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_shape_index") }
    open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
        return _icall_Long_Long_Long(shapeOwnerGetShapeIndexMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_remove_shape") }
    open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
        _icall_Unit_Long_Long(shapeOwnerRemoveShapeMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_clear_shapes") }
    open fun shapeOwnerClearShapes(ownerId: Long) {
        _icall_Unit_Long(shapeOwnerClearShapesMethodBind, this.rawMemory, ownerId)
    }


    private val shapeFindOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_find_owner") }
    open fun shapeFindOwner(shapeIndex: Long): Long {
        return _icall_Long_Long(shapeFindOwnerMethodBind, this.rawMemory, shapeIndex)
    }


}
