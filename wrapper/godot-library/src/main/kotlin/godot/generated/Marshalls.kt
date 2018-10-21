@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Marshalls : Reference {
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
        infix fun from(other: Reference): Marshalls = Marshalls("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Marshalls = Marshalls("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Marshalls = fromVariant(Marshalls(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("Marshalls", "_Marshalls") }


        // Properties


        // Methods
        private val variantToBase64MethodBind: CPointer<godot_method_bind> by lazy { getMB("_Marshalls", "variant_to_base64") }
        fun variantToBase64(variant: Variant): String {
            return _icall_String_Variant(variantToBase64MethodBind, this.rawMemory, variant)
        }


        private val base64ToVariantMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Marshalls", "base64_to_variant") }
        fun base64ToVariant(base64Str: String): Variant {
            return _icall_Variant_String(base64ToVariantMethodBind, this.rawMemory, base64Str)
        }


        private val rawToBase64MethodBind: CPointer<godot_method_bind> by lazy { getMB("_Marshalls", "raw_to_base64") }
        fun rawToBase64(array: PoolByteArray): String {
            return _icall_String_PoolByteArray(rawToBase64MethodBind, this.rawMemory, array)
        }


        private val base64ToRawMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Marshalls", "base64_to_raw") }
        fun base64ToRaw(base64Str: String): PoolByteArray {
            return _icall_PoolByteArray_String(base64ToRawMethodBind, this.rawMemory, base64Str)
        }


        private val utf8ToBase64MethodBind: CPointer<godot_method_bind> by lazy { getMB("_Marshalls", "utf8_to_base64") }
        fun utf8ToBase64(utf8Str: String): String {
            return _icall_String_String(utf8ToBase64MethodBind, this.rawMemory, utf8Str)
        }


        private val base64ToUtf8MethodBind: CPointer<godot_method_bind> by lazy { getMB("_Marshalls", "base64_to_utf8") }
        fun base64ToUtf8(base64Str: String): String {
            return _icall_String_String(base64ToUtf8MethodBind, this.rawMemory, base64Str)
        }


    }
}
