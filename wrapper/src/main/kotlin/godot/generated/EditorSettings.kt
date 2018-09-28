@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorSettings : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SETTINGS_CHANGED: String = "settings_changed"
        }
    }


    companion object {
        infix fun from(other: Resource): EditorSettings = EditorSettings("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): EditorSettings = EditorSettings("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorSettings = EditorSettings("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorSettings = fromVariant(EditorSettings(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val hasSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "has_setting") }
    open fun hasSetting(name: String): Boolean {
        return _icall_Boolean_String(hasSettingMethodBind, this.rawMemory, name)
    }


    private val setSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "set_setting") }
    open fun setSetting(name: String, value: Variant) {
        _icall_Unit_String_Variant(setSettingMethodBind, this.rawMemory, name, value)
    }


    private val getSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "get_setting") }
    open fun getSetting(name: String): Variant {
        return _icall_Variant_String(getSettingMethodBind, this.rawMemory, name)
    }


    private val eraseMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "erase") }
    open fun erase(property: String) {
        _icall_Unit_String(eraseMethodBind, this.rawMemory, property)
    }


    private val setInitialValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "set_initial_value") }
    open fun setInitialValue(name: String, value: Variant, updateCurrent: Boolean) {
        _icall_Unit_String_Variant_Boolean(setInitialValueMethodBind, this.rawMemory, name, value, updateCurrent)
    }


    private val propertyCanRevertMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "property_can_revert") }
    open fun propertyCanRevert(name: String): Boolean {
        return _icall_Boolean_String(propertyCanRevertMethodBind, this.rawMemory, name)
    }


    private val propertyGetRevertMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "property_get_revert") }
    open fun propertyGetRevert(name: String): Variant {
        return _icall_Variant_String(propertyGetRevertMethodBind, this.rawMemory, name)
    }


    private val addPropertyInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "add_property_info") }
    open fun addPropertyInfo(info: Dictionary) {
        _icall_Unit_Dictionary(addPropertyInfoMethodBind, this.rawMemory, info)
    }


    private val getSettingsDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "get_settings_dir") }
    open fun getSettingsDir(): String {
        return _icall_String(getSettingsDirMethodBind, this.rawMemory)
    }


    private val getProjectSettingsDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "get_project_settings_dir") }
    open fun getProjectSettingsDir(): String {
        return _icall_String(getProjectSettingsDirMethodBind, this.rawMemory)
    }


    private val setProjectMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "set_project_metadata") }
    open fun setProjectMetadata(section: String, key: String, data: Variant) {
        _icall_Unit_String_String_Variant(setProjectMetadataMethodBind, this.rawMemory, section, key, data)
    }


    private val getProjectMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "get_project_metadata") }
    open fun getProjectMetadata(section: String, key: String, default: Variant): Variant {
        return _icall_Variant_String_String_Variant(getProjectMetadataMethodBind, this.rawMemory, section, key, default)
    }


    private val setFavoriteDirsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "set_favorite_dirs") }
    open fun setFavoriteDirs(dirs: PoolStringArray) {
        _icall_Unit_PoolStringArray(setFavoriteDirsMethodBind, this.rawMemory, dirs)
    }


    private val getFavoriteDirsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "get_favorite_dirs") }
    open fun getFavoriteDirs(): PoolStringArray {
        return _icall_PoolStringArray(getFavoriteDirsMethodBind, this.rawMemory)
    }


    private val setRecentDirsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "set_recent_dirs") }
    open fun setRecentDirs(dirs: PoolStringArray) {
        _icall_Unit_PoolStringArray(setRecentDirsMethodBind, this.rawMemory, dirs)
    }


    private val getRecentDirsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSettings", "get_recent_dirs") }
    open fun getRecentDirs(): PoolStringArray {
        return _icall_PoolStringArray(getRecentDirsMethodBind, this.rawMemory)
    }


}
