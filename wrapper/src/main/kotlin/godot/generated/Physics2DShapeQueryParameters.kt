@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DShapeQueryParameters : Reference {
    constructor() : super("Physics2DShapeQueryParameters")
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
        infix fun from(other: Reference): Physics2DShapeQueryParameters = Physics2DShapeQueryParameters("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Physics2DShapeQueryParameters = Physics2DShapeQueryParameters("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DShapeQueryParameters = fromVariant(Physics2DShapeQueryParameters(""), other)


        // Constants


    }


    // Properties
    open var collisionLayer: Int
        get() = _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, value)


    open var exclude: GDArray
        get() = _icall_GDArray(getExcludeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_GDArray(setExcludeMethodBind, this.rawMemory, value)


    open var margin: Float
        get() = _icall_Float(getMarginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMarginMethodBind, this.rawMemory, value)


    open var motion: Vector2
        get() = _icall_Vector2(getMotionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setMotionMethodBind, this.rawMemory, value)
    open fun motion(shedule: (Vector2) -> Unit): Vector2 = motion.apply {
        shedule(this)
        motion = this
    }


    open var shapeRid: RID
        get() = _icall_RID(getShapeRidMethodBind, this.rawMemory)
        set(value) = _icall_Unit_RID(setShapeRidMethodBind, this.rawMemory, value)


    open var transform: Transform2D
        get() = _icall_Transform2D(getTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, value)
    open fun transform(shedule: (Transform2D) -> Unit): Transform2D = transform.apply {
        shedule(this)
        transform = this
    }




    // Methods
    private val setShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_shape") }
    open fun setShape(shape: Resource) {
        _icall_Unit_Object(setShapeMethodBind, this.rawMemory, shape)
    }


    private val setShapeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_shape_rid") }
    open fun setShapeRid(shape: RID) {
        _icall_Unit_RID(setShapeRidMethodBind, this.rawMemory, shape)
    }


    private val getShapeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "get_shape_rid") }
    open fun getShapeRid(): RID {
        return _icall_RID(getShapeRidMethodBind, this.rawMemory)
    }


    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_transform") }
    open fun setTransform(transform: Transform2D) {
        _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, transform)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "get_transform") }
    open fun getTransform(): Transform2D {
        return _icall_Transform2D(getTransformMethodBind, this.rawMemory)
    }


    private val setMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_motion") }
    open fun setMotion(motion: Vector2) {
        _icall_Unit_Vector2(setMotionMethodBind, this.rawMemory, motion)
    }


    private val getMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "get_motion") }
    open fun getMotion(): Vector2 {
        return _icall_Vector2(getMotionMethodBind, this.rawMemory)
    }


    private val setMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_margin") }
    open fun setMargin(margin: Float) {
        _icall_Unit_Float(setMarginMethodBind, this.rawMemory, margin)
    }


    private val getMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "get_margin") }
    open fun getMargin(): Float {
        return _icall_Float(getMarginMethodBind, this.rawMemory)
    }


    private val setCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_collision_layer") }
    open fun setCollisionLayer(collisionLayer: Int) {
        _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, collisionLayer)
    }


    private val getCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "get_collision_layer") }
    open fun getCollisionLayer(): Int {
        return _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
    }


    private val setExcludeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "set_exclude") }
    open fun setExclude(exclude: GDArray) {
        _icall_Unit_GDArray(setExcludeMethodBind, this.rawMemory, exclude)
    }


    private val getExcludeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryParameters", "get_exclude") }
    open fun getExclude(): GDArray {
        return _icall_GDArray(getExcludeMethodBind, this.rawMemory)
    }


}
