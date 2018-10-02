@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ProjectSettings : Object {
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


    @ThreadLocal    companion object {
        infix fun from(other: Object): ProjectSettings = ProjectSettings("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ProjectSettings = fromVariant(ProjectSettings(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("ProjectSettings", "ProjectSettings") }


        // Properties


        // Methods
        private val hasSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "has_setting") }
        fun hasSetting(name: String): Boolean {
            return _icall_Boolean_String(hasSettingMethodBind, this.rawMemory, name)
        }


        private val setSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "set_setting") }
        fun setSetting(name: String, value: Variant) {
            _icall_Unit_String_Variant(setSettingMethodBind, this.rawMemory, name, value)
        }


        private val getSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "get_setting") }
        fun getSetting(name: String): Variant {
            return _icall_Variant_String(getSettingMethodBind, this.rawMemory, name)
        }


        private val setOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "set_order") }
        fun setOrder(name: String, position: Long) {
            _icall_Unit_String_Long(setOrderMethodBind, this.rawMemory, name, position)
        }


        private val getOrderMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "get_order") }
        fun getOrder(name: String): Long {
            return _icall_Long_String(getOrderMethodBind, this.rawMemory, name)
        }


        private val setInitialValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "set_initial_value") }
        fun setInitialValue(name: String, value: Variant) {
            _icall_Unit_String_Variant(setInitialValueMethodBind, this.rawMemory, name, value)
        }


        private val addPropertyInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "add_property_info") }
        fun addPropertyInfo(hint: Dictionary) {
            _icall_Unit_Dictionary(addPropertyInfoMethodBind, this.rawMemory, hint)
        }


        private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "clear") }
        fun clear(name: String) {
            _icall_Unit_String(clearMethodBind, this.rawMemory, name)
        }


        private val localizePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "localize_path") }
        fun localizePath(path: String): String {
            return _icall_String_String(localizePathMethodBind, this.rawMemory, path)
        }


        private val globalizePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "globalize_path") }
        fun globalizePath(path: String): String {
            return _icall_String_String(globalizePathMethodBind, this.rawMemory, path)
        }


        private val saveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "save") }
        fun save(): GodotError {
            return GodotError.fromInt(_icall_Long(saveMethodBind, this.rawMemory))
        }


        private val loadResourcePackMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "load_resource_pack") }
        fun loadResourcePack(pack: String): Boolean {
            return _icall_Boolean_String(loadResourcePackMethodBind, this.rawMemory, pack)
        }


        private val propertyCanRevertMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "property_can_revert") }
        fun propertyCanRevert(name: String): Boolean {
            return _icall_Boolean_String(propertyCanRevertMethodBind, this.rawMemory, name)
        }


        private val propertyGetRevertMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "property_get_revert") }
        fun propertyGetRevert(name: String): Variant {
            return _icall_Variant_String(propertyGetRevertMethodBind, this.rawMemory, name)
        }


        private val saveCustomMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProjectSettings", "save_custom") }
        fun saveCustom(file: String): GodotError {
            return GodotError.fromInt(_icall_Long_String(saveCustomMethodBind, this.rawMemory, file))
        }


    }
}
