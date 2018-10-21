@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsShapeQueryParameters : Reference {
    constructor() : super("PhysicsShapeQueryParameters")
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
        infix fun from(other: Reference): PhysicsShapeQueryParameters = PhysicsShapeQueryParameters("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PhysicsShapeQueryParameters = PhysicsShapeQueryParameters("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicsShapeQueryParameters = fromVariant(PhysicsShapeQueryParameters(""), other)


        // Constants


    }


    // Properties
    open var collisionMask: Long
        get() = _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, value)


    open var exclude: GDArray
        get() = _icall_GDArray(getExcludeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_GDArray(setExcludeMethodBind, this.rawMemory, value)


    open var margin: Double
        get() = _icall_Double(getMarginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMarginMethodBind, this.rawMemory, value)


    open var shapeRid: RID
        get() = _icall_RID(getShapeRidMethodBind, this.rawMemory)
        set(value) = _icall_Unit_RID(setShapeRidMethodBind, this.rawMemory, value)


    open var transform: Transform
        get() = _icall_Transform(getTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setTransformMethodBind, this.rawMemory, value)
    open fun transform(shedule: (Transform) -> Unit): Transform = transform.apply {
        shedule(this)
        transform = this
    }




    // Methods
    private val setShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "set_shape") }
    open fun setShape(shape: Resource) {
        _icall_Unit_Object(setShapeMethodBind, this.rawMemory, shape)
    }


    private val setShapeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "set_shape_rid") }
    open fun setShapeRid(shape: RID) {
        _icall_Unit_RID(setShapeRidMethodBind, this.rawMemory, shape)
    }


    private val getShapeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "get_shape_rid") }
    open fun getShapeRid(): RID {
        return _icall_RID(getShapeRidMethodBind, this.rawMemory)
    }


    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "set_transform") }
    open fun setTransform(transform: Transform) {
        _icall_Unit_Transform(setTransformMethodBind, this.rawMemory, transform)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "get_transform") }
    open fun getTransform(): Transform {
        return _icall_Transform(getTransformMethodBind, this.rawMemory)
    }


    private val setMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "set_margin") }
    open fun setMargin(margin: Double) {
        _icall_Unit_Double(setMarginMethodBind, this.rawMemory, margin)
    }


    private val getMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "get_margin") }
    open fun getMargin(): Double {
        return _icall_Double(getMarginMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "set_collision_mask") }
    open fun setCollisionMask(collisionMask: Long) {
        _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, collisionMask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "get_collision_mask") }
    open fun getCollisionMask(): Long {
        return _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setExcludeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "set_exclude") }
    open fun setExclude(exclude: GDArray) {
        _icall_Unit_GDArray(setExcludeMethodBind, this.rawMemory, exclude)
    }


    private val getExcludeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryParameters", "get_exclude") }
    open fun getExclude(): GDArray {
        return _icall_GDArray(getExcludeMethodBind, this.rawMemory)
    }


}
