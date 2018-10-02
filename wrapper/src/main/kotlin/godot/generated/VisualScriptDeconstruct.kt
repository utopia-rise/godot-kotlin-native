@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptDeconstruct : VisualScriptNode {
    constructor() : super("VisualScriptDeconstruct")
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
        infix fun from(other: VisualScriptNode): VisualScriptDeconstruct = VisualScriptDeconstruct("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptDeconstruct = VisualScriptDeconstruct("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptDeconstruct = VisualScriptDeconstruct("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptDeconstruct = VisualScriptDeconstruct("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptDeconstruct = fromVariant(VisualScriptDeconstruct(""), other)


        // Constants


    }


    // Properties
    open var type: Long
        get() = _icall_Long(getDeconstructTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDeconstructTypeMethodBind, this.rawMemory, value)




    // Methods
    private val setDeconstructTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptDeconstruct", "set_deconstruct_type") }
    open fun setDeconstructType(type: Long) {
        _icall_Unit_Long(setDeconstructTypeMethodBind, this.rawMemory, type)
    }


    private val getDeconstructTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptDeconstruct", "get_deconstruct_type") }
    open fun getDeconstructType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getDeconstructTypeMethodBind, this.rawMemory))
    }


    open fun _set_elem_cache(_cache: GDArray) {
    }


    open fun _get_elem_cache(): GDArray {
        throw NotImplementedError("_get_elem_cache is not implemented for VisualScriptDeconstruct")
    }


}
