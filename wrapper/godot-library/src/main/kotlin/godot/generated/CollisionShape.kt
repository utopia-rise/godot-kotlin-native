@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CollisionShape : Spatial {
    constructor() : super("CollisionShape")
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
        infix fun from(other: Spatial): CollisionShape = CollisionShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CollisionShape = CollisionShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CollisionShape = CollisionShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CollisionShape = fromVariant(CollisionShape(""), other)


        // Constants


    }


    // Properties
    open var shape: Shape
        get() = _icall_Shape(getShapeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setShapeMethodBind, this.rawMemory, value)


    open var disabled: Boolean
        get() = _icall_Boolean(isDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, value)




    // Methods
    private val resourceChangedMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape", "resource_changed") }
    open fun resourceChanged(resource: Resource) {
        _icall_Unit_Object(resourceChangedMethodBind, this.rawMemory, resource)
    }


    private val setShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape", "set_shape") }
    open fun setShape(shape: Shape) {
        _icall_Unit_Object(setShapeMethodBind, this.rawMemory, shape)
    }


    private val getShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape", "get_shape") }
    open fun getShape(): Shape {
        return _icall_Shape(getShapeMethodBind, this.rawMemory)
    }


    private val setDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape", "set_disabled") }
    open fun setDisabled(enable: Boolean) {
        _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, enable)
    }


    private val isDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape", "is_disabled") }
    open fun isDisabled(): Boolean {
        return _icall_Boolean(isDisabledMethodBind, this.rawMemory)
    }


    private val makeConvexFromBrothersMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape", "make_convex_from_brothers") }
    open fun makeConvexFromBrothers() {
        _icall_Unit(makeConvexFromBrothersMethodBind, this.rawMemory)
    }


}
