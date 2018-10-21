@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PHashTranslation : Translation {
    constructor() : super("PHashTranslation")
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
        infix fun from(other: Translation): PHashTranslation = PHashTranslation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): PHashTranslation = PHashTranslation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PHashTranslation = PHashTranslation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PHashTranslation = PHashTranslation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PHashTranslation = fromVariant(PHashTranslation(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val generateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PHashTranslation", "generate") }
    open fun generate(from: Translation) {
        _icall_Unit_Object(generateMethodBind, this.rawMemory, from)
    }


}
