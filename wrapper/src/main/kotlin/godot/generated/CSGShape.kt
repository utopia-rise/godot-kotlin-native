@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGShape : VisualInstance {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Operation(val id: Int) {
        OPERATION_UNION(0),
        OPERATION_INTERSECTION(1),
        OPERATION_SUBTRACTION(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisualInstance): CSGShape = CSGShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGShape = CSGShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGShape = CSGShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGShape = CSGShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGShape = fromVariant(CSGShape(""), other)


        // Constants
        const val OPERATION_UNION: Int = 0
        const val OPERATION_INTERSECTION: Int = 1
        const val OPERATION_SUBTRACTION: Int = 2


    }


    // Properties
    open var operation: Int
        get() = _icall_Int(getOperationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setOperationMethodBind, this.rawMemory, value)


    open var useCollision: Boolean
        get() = _icall_Boolean(isUsingCollisionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseCollisionMethodBind, this.rawMemory, value)


    open var snap: Float
        get() = _icall_Float(getSnapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSnapMethodBind, this.rawMemory, value)




    // Methods
    open fun _update_shape() {
    }


    private val isRootShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "is_root_shape") }
    open fun isRootShape(): Boolean {
        return _icall_Boolean(isRootShapeMethodBind, this.rawMemory)
    }


    private val setOperationMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "set_operation") }
    open fun setOperation(operation: Int) {
        _icall_Unit_Int(setOperationMethodBind, this.rawMemory, operation)
    }


    private val getOperationMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "get_operation") }
    open fun getOperation(): CSGShape.Operation {
        return CSGShape.Operation.fromInt(_icall_Int(getOperationMethodBind, this.rawMemory))
    }


    private val setUseCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "set_use_collision") }
    open fun setUseCollision(operation: Boolean) {
        _icall_Unit_Boolean(setUseCollisionMethodBind, this.rawMemory, operation)
    }


    private val isUsingCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "is_using_collision") }
    open fun isUsingCollision(): Boolean {
        return _icall_Boolean(isUsingCollisionMethodBind, this.rawMemory)
    }


    private val setSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "set_snap") }
    open fun setSnap(snap: Float) {
        _icall_Unit_Float(setSnapMethodBind, this.rawMemory, snap)
    }


    private val getSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGShape", "get_snap") }
    open fun getSnap(): Float {
        return _icall_Float(getSnapMethodBind, this.rawMemory)
    }


}
