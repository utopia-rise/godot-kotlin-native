@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MultiMesh : Resource {
    constructor() : super("MultiMesh")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TransformFormat(val id: Long) {
        TRANSFORM_2D(0),
        TRANSFORM_3D(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ColorFormat(val id: Long) {
        COLOR_NONE(0),
        COLOR_8BIT(1),
        COLOR_FLOAT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): MultiMesh = MultiMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): MultiMesh = MultiMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MultiMesh = MultiMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MultiMesh = fromVariant(MultiMesh(""), other)


        // Constants
        const val TRANSFORM_2D: Long = 0
        const val TRANSFORM_3D: Long = 1
        const val COLOR_NONE: Long = 0
        const val COLOR_8BIT: Long = 1
        const val COLOR_FLOAT: Long = 2


    }


    // Properties
    open var colorFormat: Long
        get() = _icall_Long(getColorFormatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setColorFormatMethodBind, this.rawMemory, value)


    open var transformFormat: Long
        get() = _icall_Long(getTransformFormatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTransformFormatMethodBind, this.rawMemory, value)


    open var instanceCount: Long
        get() = _icall_Long(getInstanceCountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setInstanceCountMethodBind, this.rawMemory, value)


    open var mesh: Mesh
        get() = _icall_Mesh(getMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMeshMethodBind, this.rawMemory, value)




    // Methods
    private val setMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "set_mesh") }
    open fun setMesh(mesh: Mesh) {
        _icall_Unit_Object(setMeshMethodBind, this.rawMemory, mesh)
    }


    private val getMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_mesh") }
    open fun getMesh(): Mesh {
        return _icall_Mesh(getMeshMethodBind, this.rawMemory)
    }


    private val setColorFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "set_color_format") }
    open fun setColorFormat(format: Long) {
        _icall_Unit_Long(setColorFormatMethodBind, this.rawMemory, format)
    }


    private val getColorFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_color_format") }
    open fun getColorFormat(): MultiMesh.ColorFormat {
        return MultiMesh.ColorFormat.fromInt(_icall_Long(getColorFormatMethodBind, this.rawMemory))
    }


    private val setTransformFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "set_transform_format") }
    open fun setTransformFormat(format: Long) {
        _icall_Unit_Long(setTransformFormatMethodBind, this.rawMemory, format)
    }


    private val getTransformFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_transform_format") }
    open fun getTransformFormat(): MultiMesh.TransformFormat {
        return MultiMesh.TransformFormat.fromInt(_icall_Long(getTransformFormatMethodBind, this.rawMemory))
    }


    private val setInstanceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "set_instance_count") }
    open fun setInstanceCount(count: Long) {
        _icall_Unit_Long(setInstanceCountMethodBind, this.rawMemory, count)
    }


    private val getInstanceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_instance_count") }
    open fun getInstanceCount(): Long {
        return _icall_Long(getInstanceCountMethodBind, this.rawMemory)
    }


    private val setInstanceTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "set_instance_transform") }
    open fun setInstanceTransform(instance: Long, transform: Transform) {
        _icall_Unit_Long_Transform(setInstanceTransformMethodBind, this.rawMemory, instance, transform)
    }


    private val getInstanceTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_instance_transform") }
    open fun getInstanceTransform(instance: Long): Transform {
        return _icall_Transform_Long(getInstanceTransformMethodBind, this.rawMemory, instance)
    }


    private val setInstanceColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "set_instance_color") }
    open fun setInstanceColor(instance: Long, color: Color) {
        _icall_Unit_Long_Color(setInstanceColorMethodBind, this.rawMemory, instance, color)
    }


    private val getInstanceColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_instance_color") }
    open fun getInstanceColor(instance: Long): Color {
        return _icall_Color_Long(getInstanceColorMethodBind, this.rawMemory, instance)
    }


    private val getAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMesh", "get_aabb") }
    open fun getAabb(): AABB {
        return _icall_AABB(getAabbMethodBind, this.rawMemory)
    }


    open fun _set_transform_array(arg0: PoolVector3Array) {
    }


    open fun _get_transform_array(): PoolVector3Array {
        throw NotImplementedError("_get_transform_array is not implemented for MultiMesh")
    }


    open fun _set_color_array(arg0: PoolColorArray) {
    }


    open fun _get_color_array(): PoolColorArray {
        throw NotImplementedError("_get_color_array is not implemented for MultiMesh")
    }


}
