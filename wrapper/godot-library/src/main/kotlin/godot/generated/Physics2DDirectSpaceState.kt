@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DDirectSpaceState : Object {
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
        infix fun from(other: Object): Physics2DDirectSpaceState = Physics2DDirectSpaceState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DDirectSpaceState = fromVariant(Physics2DDirectSpaceState(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val intersectPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectSpaceState", "intersect_point") }
    open fun intersectPoint(point: Vector2, maxResults: Long = 32, exclude: GDArray = GDArray(), collisionLayer: Long = 2147483647): GDArray {
        return _icall_GDArray_Vector2_Long_GDArray_Long(intersectPointMethodBind, this.rawMemory, point, maxResults, exclude, collisionLayer)
    }


    private val intersectRayMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectSpaceState", "intersect_ray") }
    open fun intersectRay(from: Vector2, to: Vector2, exclude: GDArray = GDArray(), collisionLayer: Long = 2147483647): Dictionary {
        return _icall_Dictionary_Vector2_Vector2_GDArray_Long(intersectRayMethodBind, this.rawMemory, from, to, exclude, collisionLayer)
    }


    private val intersectShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectSpaceState", "intersect_shape") }
    open fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32): GDArray {
        return _icall_GDArray_Object_Long(intersectShapeMethodBind, this.rawMemory, shape, maxResults)
    }


    private val castMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectSpaceState", "cast_motion") }
    open fun castMotion(shape: Physics2DShapeQueryParameters): GDArray {
        return _icall_GDArray_Object(castMotionMethodBind, this.rawMemory, shape)
    }


    private val collideShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectSpaceState", "collide_shape") }
    open fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Long = 32): GDArray {
        return _icall_GDArray_Object_Long(collideShapeMethodBind, this.rawMemory, shape, maxResults)
    }


    private val getRestInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DDirectSpaceState", "get_rest_info") }
    open fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary {
        return _icall_Dictionary_Object(getRestInfoMethodBind, this.rawMemory, shape)
    }


}
