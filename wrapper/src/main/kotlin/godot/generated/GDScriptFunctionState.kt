@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GDScriptFunctionState : Reference {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val COMPLETED: String = "completed"
        }
    }


    companion object {
        infix fun from(other: Reference): GDScriptFunctionState = GDScriptFunctionState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GDScriptFunctionState = GDScriptFunctionState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GDScriptFunctionState = fromVariant(GDScriptFunctionState(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val resumeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDScriptFunctionState", "resume") }
    open fun resume(arg: Variant): Variant {
        return _icall_Variant_Variant(resumeMethodBind, this.rawMemory, arg)
    }


    private val isValidMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDScriptFunctionState", "is_valid") }
    open fun isValid(extendedCheck: Boolean = false): Boolean {
        return _icall_Boolean_Boolean(isValidMethodBind, this.rawMemory, extendedCheck)
    }


    open fun _signal_callback(vararg __var_args: Any?): Variant {
        throw NotImplementedError("_signal_callback is not implemented for GDScriptFunctionState")
    }


}
