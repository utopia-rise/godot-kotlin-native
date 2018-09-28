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
    open fun _input_event(camera: Object, event: InputEvent, clickPosition: Vector3, clickNormal: Vector3, shapeIdx: Int) {
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
    open fun createShapeOwner(owner: Object): Int {
        return _icall_Int_Object(createShapeOwnerMethodBind, this.rawMemory, owner)
    }


    private val removeShapeOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "remove_shape_owner") }
    open fun removeShapeOwner(ownerId: Int) {
        _icall_Unit_Int(removeShapeOwnerMethodBind, this.rawMemory, ownerId)
    }


    private val getShapeOwnersMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "get_shape_owners") }
    open fun getShapeOwners(): GDArray {
        return _icall_GDArray(getShapeOwnersMethodBind, this.rawMemory)
    }


    private val shapeOwnerSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_set_transform") }
    open fun shapeOwnerSetTransform(ownerId: Int, transform: Transform) {
        _icall_Unit_Int_Transform(shapeOwnerSetTransformMethodBind, this.rawMemory, ownerId, transform)
    }


    private val shapeOwnerGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_transform") }
    open fun shapeOwnerGetTransform(ownerId: Int): Transform {
        return _icall_Transform_Int(shapeOwnerGetTransformMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerGetOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_owner") }
    open fun shapeOwnerGetOwner(ownerId: Int): Object {
        return _icall_Object_Int(shapeOwnerGetOwnerMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerSetDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_set_disabled") }
    open fun shapeOwnerSetDisabled(ownerId: Int, disabled: Boolean) {
        _icall_Unit_Int_Boolean(shapeOwnerSetDisabledMethodBind, this.rawMemory, ownerId, disabled)
    }


    private val isShapeOwnerDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "is_shape_owner_disabled") }
    open fun isShapeOwnerDisabled(ownerId: Int): Boolean {
        return _icall_Boolean_Int(isShapeOwnerDisabledMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_add_shape") }
    open fun shapeOwnerAddShape(ownerId: Int, shape: Shape) {
        _icall_Unit_Int_Object(shapeOwnerAddShapeMethodBind, this.rawMemory, ownerId, shape)
    }


    private val shapeOwnerGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_shape_count") }
    open fun shapeOwnerGetShapeCount(ownerId: Int): Int {
        return _icall_Int_Int(shapeOwnerGetShapeCountMethodBind, this.rawMemory, ownerId)
    }


    private val shapeOwnerGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_shape") }
    open fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape {
        return _icall_Shape_Int_Int(shapeOwnerGetShapeMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerGetShapeIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_get_shape_index") }
    open fun shapeOwnerGetShapeIndex(ownerId: Int, shapeId: Int): Int {
        return _icall_Int_Int_Int(shapeOwnerGetShapeIndexMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_remove_shape") }
    open fun shapeOwnerRemoveShape(ownerId: Int, shapeId: Int) {
        _icall_Unit_Int_Int(shapeOwnerRemoveShapeMethodBind, this.rawMemory, ownerId, shapeId)
    }


    private val shapeOwnerClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_owner_clear_shapes") }
    open fun shapeOwnerClearShapes(ownerId: Int) {
        _icall_Unit_Int(shapeOwnerClearShapesMethodBind, this.rawMemory, ownerId)
    }


    private val shapeFindOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionObject", "shape_find_owner") }
    open fun shapeFindOwner(shapeIndex: Int): Int {
        return _icall_Int_Int(shapeFindOwnerMethodBind, this.rawMemory, shapeIndex)
    }


}
