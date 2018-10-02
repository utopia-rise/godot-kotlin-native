@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PackedDataContainer : Resource {
    constructor() : super("PackedDataContainer")
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
        infix fun from(other: Resource): PackedDataContainer = PackedDataContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PackedDataContainer = PackedDataContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PackedDataContainer = PackedDataContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PackedDataContainer = fromVariant(PackedDataContainer(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _set_data(arg0: PoolByteArray) {
    }


    open fun _get_data(): PoolByteArray {
        throw NotImplementedError("_get_data is not implemented for PackedDataContainer")
    }


    open fun _iter_init(arg0: GDArray): Variant {
        throw NotImplementedError("_iter_init is not implemented for PackedDataContainer")
    }


    open fun _iter_get(arg0: Variant): Variant {
        throw NotImplementedError("_iter_get is not implemented for PackedDataContainer")
    }


    open fun _iter_next(arg0: GDArray): Variant {
        throw NotImplementedError("_iter_next is not implemented for PackedDataContainer")
    }


    private val packMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedDataContainer", "pack") }
    open fun pack(value: Variant): GodotError {
        return GodotError.fromInt(_icall_Long_Variant(packMethodBind, this.rawMemory, value))
    }


    private val sizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedDataContainer", "size") }
    open fun size(): Long {
        return _icall_Long(sizeMethodBind, this.rawMemory)
    }


}
