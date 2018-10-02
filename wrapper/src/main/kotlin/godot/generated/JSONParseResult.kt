@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class JSONParseResult : Reference {
    constructor() : super("JSONParseResult")
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
        infix fun from(other: Reference): JSONParseResult = JSONParseResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): JSONParseResult = JSONParseResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): JSONParseResult = fromVariant(JSONParseResult(""), other)


        // Constants


    }


    // Properties
    open var error: Object
        get() = _icall_Object(getErrorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setErrorMethodBind, this.rawMemory, value)


    open var errorString: String
        get() = _icall_String(getErrorStringMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setErrorStringMethodBind, this.rawMemory, value)


    open var errorLine: Int
        get() = _icall_Int(getErrorLineMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setErrorLineMethodBind, this.rawMemory, value)


    open var result: Variant
        get() = _icall_Variant(getResultMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Variant(setResultMethodBind, this.rawMemory, value)




    // Methods
    private val getErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "get_error") }
    open fun getError(): GodotError {
        return GodotError.fromInt(_icall_Int(getErrorMethodBind, this.rawMemory))
    }


    private val getErrorStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "get_error_string") }
    open fun getErrorString(): String {
        return _icall_String(getErrorStringMethodBind, this.rawMemory)
    }


    private val getErrorLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "get_error_line") }
    open fun getErrorLine(): Int {
        return _icall_Int(getErrorLineMethodBind, this.rawMemory)
    }


    private val getResultMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "get_result") }
    open fun getResult(): Variant {
        return _icall_Variant(getResultMethodBind, this.rawMemory)
    }


    private val setErrorMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "set_error") }
    open fun setError(error: Int) {
        _icall_Unit_Int(setErrorMethodBind, this.rawMemory, error)
    }


    private val setErrorStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "set_error_string") }
    open fun setErrorString(errorString: String) {
        _icall_Unit_String(setErrorStringMethodBind, this.rawMemory, errorString)
    }


    private val setErrorLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "set_error_line") }
    open fun setErrorLine(errorLine: Int) {
        _icall_Unit_Int(setErrorLineMethodBind, this.rawMemory, errorLine)
    }


    private val setResultMethodBind: CPointer<godot_method_bind> by lazy { getMB("JSONParseResult", "set_result") }
    open fun setResult(result: Variant) {
        _icall_Unit_Variant(setResultMethodBind, this.rawMemory, result)
    }


}
