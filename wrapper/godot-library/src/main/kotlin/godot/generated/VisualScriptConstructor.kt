@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptConstructor : VisualScriptNode {
    constructor() : super("VisualScriptConstructor")
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
        infix fun from(other: VisualScriptNode): VisualScriptConstructor = VisualScriptConstructor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptConstructor = VisualScriptConstructor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptConstructor = VisualScriptConstructor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptConstructor = VisualScriptConstructor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptConstructor = fromVariant(VisualScriptConstructor(""), other)


        // Constants


    }


    // Properties
    open var type: Long
        get() = _icall_Long(getConstructorTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setConstructorTypeMethodBind, this.rawMemory, value)


    open var constructor: Dictionary
        get() = _icall_Dictionary(getConstructorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Dictionary(setConstructorMethodBind, this.rawMemory, value)




    // Methods
    private val setConstructorTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstructor", "set_constructor_type") }
    open fun setConstructorType(type: Long) {
        _icall_Unit_Long(setConstructorTypeMethodBind, this.rawMemory, type)
    }


    private val getConstructorTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstructor", "get_constructor_type") }
    open fun getConstructorType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getConstructorTypeMethodBind, this.rawMemory))
    }


    private val setConstructorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstructor", "set_constructor") }
    open fun setConstructor(constructor: Dictionary) {
        _icall_Unit_Dictionary(setConstructorMethodBind, this.rawMemory, constructor)
    }


    private val getConstructorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptConstructor", "get_constructor") }
    open fun getConstructor(): Dictionary {
        return _icall_Dictionary(getConstructorMethodBind, this.rawMemory)
    }


}
