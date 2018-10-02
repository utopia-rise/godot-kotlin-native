@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptGlobalConstant : VisualScriptNode {
    constructor() : super("VisualScriptGlobalConstant")
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
        infix fun from(other: VisualScriptNode): VisualScriptGlobalConstant = VisualScriptGlobalConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptGlobalConstant = VisualScriptGlobalConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptGlobalConstant = VisualScriptGlobalConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptGlobalConstant = VisualScriptGlobalConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptGlobalConstant = fromVariant(VisualScriptGlobalConstant(""), other)


        // Constants


    }


    // Properties
    open var constant: Long
        get() = _icall_Long(getGlobalConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setGlobalConstantMethodBind, this.rawMemory, value)




    // Methods
    private val setGlobalConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptGlobalConstant", "set_global_constant") }
    open fun setGlobalConstant(index: Long) {
        _icall_Unit_Long(setGlobalConstantMethodBind, this.rawMemory, index)
    }


    private val getGlobalConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptGlobalConstant", "get_global_constant") }
    open fun getGlobalConstant(): Long {
        return _icall_Long(getGlobalConstantMethodBind, this.rawMemory)
    }


}
