@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Reference : Object {
    constructor() : super("Reference")
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
        infix fun from(other: Object): Reference = Reference("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Reference = fromVariant(Reference(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val initRefMethodBind: CPointer<godot_method_bind> by lazy { getMB("Reference", "init_ref") }
    open fun initRef(): Boolean {
        return _icall_Boolean(initRefMethodBind, this.rawMemory)
    }


    private val referenceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Reference", "reference") }
    open fun reference(): Boolean {
        return _icall_Boolean(referenceMethodBind, this.rawMemory)
    }


    private val unreferenceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Reference", "unreference") }
    open fun unreference(): Boolean {
        return _icall_Boolean(unreferenceMethodBind, this.rawMemory)
    }


}
