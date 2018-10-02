@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Semaphore : Reference {
    constructor() : super("Semaphore")
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
        infix fun from(other: Reference): Semaphore = Semaphore("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Semaphore = Semaphore("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Semaphore = fromVariant(Semaphore(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val waitMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Semaphore", "wait") }
    open fun wait(): GodotError {
        return GodotError.fromInt(_icall_Int(waitMethodBind, this.rawMemory))
    }


    private val postMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Semaphore", "post") }
    open fun post(): GodotError {
        return GodotError.fromInt(_icall_Int(postMethodBind, this.rawMemory))
    }


}
