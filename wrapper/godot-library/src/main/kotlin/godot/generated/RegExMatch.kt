@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RegExMatch : Reference {
    constructor() : super("RegExMatch")
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
        infix fun from(other: Reference): RegExMatch = RegExMatch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RegExMatch = RegExMatch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RegExMatch = fromVariant(RegExMatch(""), other)


        // Constants


    }


    // Properties
    open val subject: String
        get() = _icall_String(getSubjectMethodBind, this.rawMemory)


    open val names: Dictionary
        get() = _icall_Dictionary(getNamesMethodBind, this.rawMemory)


    open val strings: GDArray
        get() = _icall_GDArray(getStringsMethodBind, this.rawMemory)




    // Methods
    private val getSubjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_subject") }
    open fun getSubject(): String {
        return _icall_String(getSubjectMethodBind, this.rawMemory)
    }


    private val getGroupCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_group_count") }
    open fun getGroupCount(): Long {
        return _icall_Long(getGroupCountMethodBind, this.rawMemory)
    }


    private val getNamesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_names") }
    open fun getNames(): Dictionary {
        return _icall_Dictionary(getNamesMethodBind, this.rawMemory)
    }


    private val getStringsMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_strings") }
    open fun getStrings(): GDArray {
        return _icall_GDArray(getStringsMethodBind, this.rawMemory)
    }


    private val getStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_string") }
    open fun getString(name: Variant = Variant(0)): String {
        return _icall_String_Variant(getStringMethodBind, this.rawMemory, name)
    }


    private val getStartMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_start") }
    open fun getStart(name: Variant = Variant(0)): Long {
        return _icall_Long_Variant(getStartMethodBind, this.rawMemory, name)
    }


    private val getEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegExMatch", "get_end") }
    open fun getEnd(name: Variant = Variant(0)): Long {
        return _icall_Long_Variant(getEndMethodBind, this.rawMemory, name)
    }


}
