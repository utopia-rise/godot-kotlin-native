@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualInstance : Spatial {
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
        infix fun from(other: Spatial): VisualInstance = VisualInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VisualInstance = VisualInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualInstance = VisualInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualInstance = fromVariant(VisualInstance(""), other)


        // Constants


    }


    // Properties
    open var layers: Long
        get() = _icall_Long(getLayerMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLayerMaskMethodBind, this.rawMemory, value)




    // Methods
    open fun _get_visual_instance_rid(): RID {
        throw NotImplementedError("_get_visual_instance_rid is not implemented for VisualInstance")
    }


    private val setBaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualInstance", "set_base") }
    open fun setBase(base: RID) {
        _icall_Unit_RID(setBaseMethodBind, this.rawMemory, base)
    }


    private val setLayerMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualInstance", "set_layer_mask") }
    open fun setLayerMask(mask: Long) {
        _icall_Unit_Long(setLayerMaskMethodBind, this.rawMemory, mask)
    }


    private val getLayerMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualInstance", "get_layer_mask") }
    open fun getLayerMask(): Long {
        return _icall_Long(getLayerMaskMethodBind, this.rawMemory)
    }


    private val getTransformedAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualInstance", "get_transformed_aabb") }
    open fun getTransformedAabb(): AABB {
        return _icall_AABB(getTransformedAabbMethodBind, this.rawMemory)
    }


    private val getAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualInstance", "get_aabb") }
    open fun getAabb(): AABB {
        return _icall_AABB(getAabbMethodBind, this.rawMemory)
    }


}
