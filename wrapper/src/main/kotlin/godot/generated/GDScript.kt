@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GDScript : Script {
    constructor() : super("GDScript")
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
        infix fun from(other: Script): GDScript = GDScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): GDScript = GDScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): GDScript = GDScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GDScript = GDScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GDScript = fromVariant(GDScript(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val newMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDScript", "new") }
    open fun new(vararg __var_args: Any?): Object {
        return Object from _icall_varargs(newMethodBind, this.rawMemory, arrayOf(*__var_args))
    }


    private val getAsByteCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDScript", "get_as_byte_code") }
    open fun getAsByteCode(): PoolByteArray {
        return _icall_PoolByteArray(getAsByteCodeMethodBind, this.rawMemory)
    }


}
