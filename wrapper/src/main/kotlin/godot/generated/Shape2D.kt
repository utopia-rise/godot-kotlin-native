@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Shape2D : Resource {
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
        infix fun from(other: Resource): Shape2D = Shape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Shape2D = Shape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Shape2D = Shape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Shape2D = fromVariant(Shape2D(""), other)


        // Constants


    }


    // Properties
    open var customSolverBias: Float
        get() = _icall_Float(getCustomSolverBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setCustomSolverBiasMethodBind, this.rawMemory, value)




    // Methods
    private val setCustomSolverBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shape2D", "set_custom_solver_bias") }
    open fun setCustomSolverBias(bias: Float) {
        _icall_Unit_Float(setCustomSolverBiasMethodBind, this.rawMemory, bias)
    }


    private val getCustomSolverBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shape2D", "get_custom_solver_bias") }
    open fun getCustomSolverBias(): Float {
        return _icall_Float(getCustomSolverBiasMethodBind, this.rawMemory)
    }


    private val collideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shape2D", "collide") }
    open fun collide(localXform: Transform2D, withShape: Shape2D, shapeXform: Transform2D): Boolean {
        return _icall_Boolean_Transform2D_Object_Transform2D(collideMethodBind, this.rawMemory, localXform, withShape, shapeXform)
    }


    private val collideWithMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shape2D", "collide_with_motion") }
    open fun collideWithMotion(localXform: Transform2D, localMotion: Vector2, withShape: Shape2D, shapeXform: Transform2D, shapeMotion: Vector2): Boolean {
        return _icall_Boolean_Transform2D_Vector2_Object_Transform2D_Vector2(collideWithMotionMethodBind, this.rawMemory, localXform, localMotion, withShape, shapeXform, shapeMotion)
    }


    private val collideAndGetContactsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shape2D", "collide_and_get_contacts") }
    open fun collideAndGetContacts(localXform: Transform2D, withShape: Shape2D, shapeXform: Transform2D): Variant {
        return _icall_Variant_Transform2D_Object_Transform2D(collideAndGetContactsMethodBind, this.rawMemory, localXform, withShape, shapeXform)
    }


    private val collideWithMotionAndGetContactsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shape2D", "collide_with_motion_and_get_contacts") }
    open fun collideWithMotionAndGetContacts(localXform: Transform2D, localMotion: Vector2, withShape: Shape2D, shapeXform: Transform2D, shapeMotion: Vector2): Variant {
        return _icall_Variant_Transform2D_Vector2_Object_Transform2D_Vector2(collideWithMotionAndGetContactsMethodBind, this.rawMemory, localXform, localMotion, withShape, shapeXform, shapeMotion)
    }


}
