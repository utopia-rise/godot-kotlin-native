@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WeakRef : Reference {
    constructor() : super("WeakRef")
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
        infix fun from(other: Reference): WeakRef = WeakRef("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WeakRef = WeakRef("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WeakRef = fromVariant(WeakRef(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getRefMethodBind: CPointer<godot_method_bind> by lazy { getMB("WeakRef", "get_ref") }
    open fun getRef(): Variant {
        return _icall_Variant(getRefMethodBind, this.rawMemory)
    }


}
