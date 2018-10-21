@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PrimitiveMesh : Mesh {
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
        infix fun from(other: Mesh): PrimitiveMesh = PrimitiveMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): PrimitiveMesh = PrimitiveMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PrimitiveMesh = PrimitiveMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PrimitiveMesh = PrimitiveMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PrimitiveMesh = fromVariant(PrimitiveMesh(""), other)


        // Constants


    }


    // Properties
    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)


    open var customAabb: AABB
        get() = _icall_AABB(getCustomAabbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_AABB(setCustomAabbMethodBind, this.rawMemory, value)
    open fun customAabb(shedule: (AABB) -> Unit): AABB = customAabb.apply {
        shedule(this)
        customAabb = this
    }


    open var flipFaces: Boolean
        get() = _icall_Boolean(getFlipFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFlipFacesMethodBind, this.rawMemory, value)




    // Methods
    open fun _update() {
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


    private val getMeshArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "get_mesh_arrays") }
    open fun getMeshArrays(): GDArray {
        return _icall_GDArray(getMeshArraysMethodBind, this.rawMemory)
    }


    private val setCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "set_custom_aabb") }
    open fun setCustomAabb(aabb: AABB) {
        _icall_Unit_AABB(setCustomAabbMethodBind, this.rawMemory, aabb)
    }


    private val getCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "get_custom_aabb") }
    open fun getCustomAabb(): AABB {
        return _icall_AABB(getCustomAabbMethodBind, this.rawMemory)
    }


    private val setFlipFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "set_flip_faces") }
    open fun setFlipFaces(flipFaces: Boolean) {
        _icall_Unit_Boolean(setFlipFacesMethodBind, this.rawMemory, flipFaces)
    }


    private val getFlipFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PrimitiveMesh", "get_flip_faces") }
    open fun getFlipFaces(): Boolean {
        return _icall_Boolean(getFlipFacesMethodBind, this.rawMemory)
    }


}
