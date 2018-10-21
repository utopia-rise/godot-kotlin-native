@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RegEx : Reference {
    constructor() : super("RegEx")
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
        infix fun from(other: Reference): RegEx = RegEx("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RegEx = RegEx("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RegEx = fromVariant(RegEx(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val compileMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "compile") }
    open fun compile(pattern: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(compileMethodBind, this.rawMemory, pattern))
    }


    private val searchMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "search") }
    open fun search(subject: String, offset: Long = 0, end: Long = -1): RegExMatch {
        return _icall_RegExMatch_String_Long_Long(searchMethodBind, this.rawMemory, subject, offset, end)
    }


    private val searchAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "search_all") }
    open fun searchAll(subject: String, offset: Long = 0, end: Long = -1): GDArray {
        return _icall_GDArray_String_Long_Long(searchAllMethodBind, this.rawMemory, subject, offset, end)
    }


    private val subMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "sub") }
    open fun sub(subject: String, replacement: String, all: Boolean = false, offset: Long = 0, end: Long = -1): String {
        return _icall_String_String_String_Boolean_Long_Long(subMethodBind, this.rawMemory, subject, replacement, all, offset, end)
    }


    private val isValidMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "is_valid") }
    open fun isValid(): Boolean {
        return _icall_Boolean(isValidMethodBind, this.rawMemory)
    }


    private val getPatternMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "get_pattern") }
    open fun getPattern(): String {
        return _icall_String(getPatternMethodBind, this.rawMemory)
    }


    private val getGroupCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "get_group_count") }
    open fun getGroupCount(): Long {
        return _icall_Long(getGroupCountMethodBind, this.rawMemory)
    }


    private val getNamesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RegEx", "get_names") }
    open fun getNames(): GDArray {
        return _icall_GDArray(getNamesMethodBind, this.rawMemory)
    }


}
