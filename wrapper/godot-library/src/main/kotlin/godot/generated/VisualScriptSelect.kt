@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptSelect : VisualScriptNode {
    constructor() : super("VisualScriptSelect")
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
        infix fun from(other: VisualScriptNode): VisualScriptSelect = VisualScriptSelect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptSelect = VisualScriptSelect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptSelect = VisualScriptSelect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptSelect = VisualScriptSelect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptSelect = fromVariant(VisualScriptSelect(""), other)


        // Constants


    }


    // Properties
    open var type: Long
        get() = _icall_Long(getTypedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTypedMethodBind, this.rawMemory, value)




    // Methods
    private val setTypedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptSelect", "set_typed") }
    open fun setTyped(type: Long) {
        _icall_Unit_Long(setTypedMethodBind, this.rawMemory, type)
    }


    private val getTypedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptSelect", "get_typed") }
    open fun getTyped(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getTypedMethodBind, this.rawMemory))
    }


}
