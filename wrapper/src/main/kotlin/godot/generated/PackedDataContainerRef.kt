@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PackedDataContainerRef : Reference {
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


    companion object {
        infix fun from(other: Reference): PackedDataContainerRef = PackedDataContainerRef("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PackedDataContainerRef = PackedDataContainerRef("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PackedDataContainerRef = fromVariant(PackedDataContainerRef(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val sizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedDataContainerRef", "size") }
    open fun size(): Long {
        return _icall_Long(sizeMethodBind, this.rawMemory)
    }


    open fun _iter_init(arg0: GDArray): Variant {
        throw NotImplementedError("_iter_init is not implemented for PackedDataContainerRef")
    }


    open fun _iter_get(arg0: Variant): Variant {
        throw NotImplementedError("_iter_get is not implemented for PackedDataContainerRef")
    }


    open fun _iter_next(arg0: GDArray): Variant {
        throw NotImplementedError("_iter_next is not implemented for PackedDataContainerRef")
    }


    open fun _is_dictionary(): Boolean {
        throw NotImplementedError("_is_dictionary is not implemented for PackedDataContainerRef")
    }


}
