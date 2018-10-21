@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsDirectSpaceState : Object {
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
        infix fun from(other: Object): PhysicsDirectSpaceState = PhysicsDirectSpaceState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicsDirectSpaceState = fromVariant(PhysicsDirectSpaceState(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val intersectRayMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectSpaceState", "intersect_ray") }
    open fun intersectRay(from: Vector3, to: Vector3, exclude: GDArray = GDArray(), collisionLayer: Long = 2147483647): Dictionary {
        return _icall_Dictionary_Vector3_Vector3_GDArray_Long(intersectRayMethodBind, this.rawMemory, from, to, exclude, collisionLayer)
    }


    private val intersectShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectSpaceState", "intersect_shape") }
    open fun intersectShape(shape: PhysicsShapeQueryParameters, maxResults: Long = 32): GDArray {
        return _icall_GDArray_Object_Long(intersectShapeMethodBind, this.rawMemory, shape, maxResults)
    }


    private val castMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectSpaceState", "cast_motion") }
    open fun castMotion(shape: PhysicsShapeQueryParameters, motion: Vector3): GDArray {
        return _icall_GDArray_Object_Vector3(castMotionMethodBind, this.rawMemory, shape, motion)
    }


    private val collideShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectSpaceState", "collide_shape") }
    open fun collideShape(shape: PhysicsShapeQueryParameters, maxResults: Long = 32): GDArray {
        return _icall_GDArray_Object_Long(collideShapeMethodBind, this.rawMemory, shape, maxResults)
    }


    private val getRestInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsDirectSpaceState", "get_rest_info") }
    open fun getRestInfo(shape: PhysicsShapeQueryParameters): Dictionary {
        return _icall_Dictionary_Object(getRestInfoMethodBind, this.rawMemory, shape)
    }


}
