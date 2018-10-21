@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class FuncRef : Reference {
    constructor() : super("FuncRef")
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
        infix fun from(other: Reference): FuncRef = FuncRef("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): FuncRef = FuncRef("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): FuncRef = fromVariant(FuncRef(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val callFuncMethodBind: CPointer<godot_method_bind> by lazy { getMB("FuncRef", "call_func") }
    open fun callFunc(vararg __var_args: Any?): Variant {
        return _icall_varargs(callFuncMethodBind, this.rawMemory, arrayOf(*__var_args))
    }


    private val setInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("FuncRef", "set_instance") }
    open fun setInstance(instance: Object) {
        _icall_Unit_Object(setInstanceMethodBind, this.rawMemory, instance)
    }


    private val setFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("FuncRef", "set_function") }
    open fun setFunction(name: String) {
        _icall_Unit_String(setFunctionMethodBind, this.rawMemory, name)
    }


}
