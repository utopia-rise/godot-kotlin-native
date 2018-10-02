@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ConfigFile : Reference {
    constructor() : super("ConfigFile")
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
        infix fun from(other: Reference): ConfigFile = ConfigFile("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ConfigFile = ConfigFile("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ConfigFile = fromVariant(ConfigFile(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val setValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "set_value") }
    open fun setValue(section: String, key: String, value: Variant) {
        _icall_Unit_String_String_Variant(setValueMethodBind, this.rawMemory, section, key, value)
    }


    private val getValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "get_value") }
    open fun getValue(section: String, key: String, default: Variant): Variant {
        return _icall_Variant_String_String_Variant(getValueMethodBind, this.rawMemory, section, key, default)
    }


    private val hasSectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "has_section") }
    open fun hasSection(section: String): Boolean {
        return _icall_Boolean_String(hasSectionMethodBind, this.rawMemory, section)
    }


    private val hasSectionKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "has_section_key") }
    open fun hasSectionKey(section: String, key: String): Boolean {
        return _icall_Boolean_String_String(hasSectionKeyMethodBind, this.rawMemory, section, key)
    }


    private val getSectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "get_sections") }
    open fun getSections(): PoolStringArray {
        return _icall_PoolStringArray(getSectionsMethodBind, this.rawMemory)
    }


    private val getSectionKeysMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "get_section_keys") }
    open fun getSectionKeys(section: String): PoolStringArray {
        return _icall_PoolStringArray_String(getSectionKeysMethodBind, this.rawMemory, section)
    }


    private val eraseSectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "erase_section") }
    open fun eraseSection(section: String) {
        _icall_Unit_String(eraseSectionMethodBind, this.rawMemory, section)
    }


    private val loadMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "load") }
    open fun load(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(loadMethodBind, this.rawMemory, path))
    }


    private val saveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ConfigFile", "save") }
    open fun save(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(saveMethodBind, this.rawMemory, path))
    }


}
