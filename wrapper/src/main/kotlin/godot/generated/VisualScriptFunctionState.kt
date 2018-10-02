@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptFunctionState : Reference {
    constructor() : super("VisualScriptFunctionState")
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
        infix fun from(other: Reference): VisualScriptFunctionState = VisualScriptFunctionState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptFunctionState = VisualScriptFunctionState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptFunctionState = fromVariant(VisualScriptFunctionState(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val connectToSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionState", "connect_to_signal") }
    open fun connectToSignal(obj: Object, signals: String, args: GDArray) {
        _icall_Unit_Object_String_GDArray(connectToSignalMethodBind, this.rawMemory, obj, signals, args)
    }


    private val resumeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionState", "resume") }
    open fun resume(args: GDArray): Variant {
        return _icall_Variant_GDArray(resumeMethodBind, this.rawMemory, args)
    }


    private val isValidMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionState", "is_valid") }
    open fun isValid(): Boolean {
        return _icall_Boolean(isValidMethodBind, this.rawMemory)
    }


    open fun _signal_callback(vararg __var_args: Any?): Variant {
        throw NotImplementedError("_signal_callback is not implemented for VisualScriptFunctionState")
    }


}
