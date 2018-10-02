@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PCKPacker : Reference {
    constructor() : super("PCKPacker")
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
        infix fun from(other: Reference): PCKPacker = PCKPacker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PCKPacker = PCKPacker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PCKPacker = fromVariant(PCKPacker(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val pckStartMethodBind: CPointer<godot_method_bind> by lazy { getMB("PCKPacker", "pck_start") }
    open fun pckStart(pckName: String, alignment: Int): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int(pckStartMethodBind, this.rawMemory, pckName, alignment))
    }


    private val addFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("PCKPacker", "add_file") }
    open fun addFile(pckPath: String, sourcePath: String): GodotError {
        return GodotError.fromInt(_icall_Int_String_String(addFileMethodBind, this.rawMemory, pckPath, sourcePath))
    }


    private val flushMethodBind: CPointer<godot_method_bind> by lazy { getMB("PCKPacker", "flush") }
    open fun flush(verbose: Boolean): GodotError {
        return GodotError.fromInt(_icall_Int_Boolean(flushMethodBind, this.rawMemory, verbose))
    }


}
