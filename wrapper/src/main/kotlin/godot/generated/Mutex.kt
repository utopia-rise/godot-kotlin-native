@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Mutex : Reference {
    constructor() : super("Mutex")
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
        infix fun from(other: Reference): Mutex = Mutex("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Mutex = Mutex("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Mutex = fromVariant(Mutex(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val lockMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Mutex", "lock") }
    open fun lock() {
        _icall_Unit(lockMethodBind, this.rawMemory)
    }


    private val tryLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Mutex", "try_lock") }
    open fun tryLock(): GodotError {
        return GodotError.fromInt(_icall_Long(tryLockMethodBind, this.rawMemory))
    }


    private val unlockMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Mutex", "unlock") }
    open fun unlock() {
        _icall_Unit(unlockMethodBind, this.rawMemory)
    }


}
