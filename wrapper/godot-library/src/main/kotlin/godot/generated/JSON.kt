@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class JSON : Object {
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


    @ThreadLocal    companion object {
        infix fun from(other: Object): JSON = JSON("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): JSON = fromVariant(JSON(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("JSON", "_JSON") }


        // Properties


        // Methods
        private val printMethodBind: CPointer<godot_method_bind> by lazy { getMB("_JSON", "print") }
        fun print(value: Variant, indent: String = "", sortKeys: Boolean = false): String {
            return _icall_String_Variant_String_Boolean(printMethodBind, this.rawMemory, value, indent, sortKeys)
        }


        private val parseMethodBind: CPointer<godot_method_bind> by lazy { getMB("_JSON", "parse") }
        fun parse(json: String): JSONParseResult {
            return _icall_JSONParseResult_String(parseMethodBind, this.rawMemory, json)
        }


    }
}
