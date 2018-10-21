@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CollisionShape2D : Node2D {
    constructor() : super("CollisionShape2D")
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
        infix fun from(other: Node2D): CollisionShape2D = CollisionShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CollisionShape2D = CollisionShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CollisionShape2D = CollisionShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CollisionShape2D = CollisionShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CollisionShape2D = fromVariant(CollisionShape2D(""), other)


        // Constants


    }


    // Properties
    open var shape: Shape2D
        get() = _icall_Shape2D(getShapeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setShapeMethodBind, this.rawMemory, value)


    open var disabled: Boolean
        get() = _icall_Boolean(isDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, value)


    open var oneWayCollision: Boolean
        get() = _icall_Boolean(isOneWayCollisionEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setOneWayCollisionMethodBind, this.rawMemory, value)




    // Methods
    private val setShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape2D", "set_shape") }
    open fun setShape(shape: Shape2D) {
        _icall_Unit_Object(setShapeMethodBind, this.rawMemory, shape)
    }


    private val getShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape2D", "get_shape") }
    open fun getShape(): Shape2D {
        return _icall_Shape2D(getShapeMethodBind, this.rawMemory)
    }


    private val setDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape2D", "set_disabled") }
    open fun setDisabled(disabled: Boolean) {
        _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, disabled)
    }


    private val isDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape2D", "is_disabled") }
    open fun isDisabled(): Boolean {
        return _icall_Boolean(isDisabledMethodBind, this.rawMemory)
    }


    private val setOneWayCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape2D", "set_one_way_collision") }
    open fun setOneWayCollision(enabled: Boolean) {
        _icall_Unit_Boolean(setOneWayCollisionMethodBind, this.rawMemory, enabled)
    }


    private val isOneWayCollisionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionShape2D", "is_one_way_collision_enabled") }
    open fun isOneWayCollisionEnabled(): Boolean {
        return _icall_Boolean(isOneWayCollisionEnabledMethodBind, this.rawMemory)
    }


    open fun _shape_changed() {
    }


}
