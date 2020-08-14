// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Dictionary
import godot.icalls._icall_Unit_PoolStringArray
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_String_Variant
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Unit_String_Variant_Boolean
import godot.icalls._icall_Variant_String
import godot.icalls._icall_Variant_String_String_nVariant
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorSettings internal constructor() : Resource() {
  val settingsChanged: Signal0 by signal()

  open fun addPropertyInfo(info: Dictionary) {
    val mb = getMethodBind("EditorSettings","add_property_info")
    _icall_Unit_Dictionary( mb, this.ptr, info)
  }

  open fun erase(property: String) {
    val mb = getMethodBind("EditorSettings","erase")
    _icall_Unit_String( mb, this.ptr, property)
  }

  open fun getFavorites(): PoolStringArray {
    val mb = getMethodBind("EditorSettings","get_favorites")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getProjectMetadata(
    section: String,
    key: String,
    default: Variant? = null
  ): Variant {
    val mb = getMethodBind("EditorSettings","get_project_metadata")
    return _icall_Variant_String_String_nVariant( mb, this.ptr, section, key, default)
  }

  open fun getProjectSettingsDir(): String {
    val mb = getMethodBind("EditorSettings","get_project_settings_dir")
    return _icall_String( mb, this.ptr)
  }

  open fun getRecentDirs(): PoolStringArray {
    val mb = getMethodBind("EditorSettings","get_recent_dirs")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getSetting(name: String): Variant {
    val mb = getMethodBind("EditorSettings","get_setting")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  open fun getSettingsDir(): String {
    val mb = getMethodBind("EditorSettings","get_settings_dir")
    return _icall_String( mb, this.ptr)
  }

  open fun hasSetting(name: String): Boolean {
    val mb = getMethodBind("EditorSettings","has_setting")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun propertyCanRevert(name: String): Boolean {
    val mb = getMethodBind("EditorSettings","property_can_revert")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun propertyGetRevert(name: String): Variant {
    val mb = getMethodBind("EditorSettings","property_get_revert")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  open fun setFavorites(dirs: PoolStringArray) {
    val mb = getMethodBind("EditorSettings","set_favorites")
    _icall_Unit_PoolStringArray( mb, this.ptr, dirs)
  }

  open fun setInitialValue(
    name: String,
    value: Variant,
    updateCurrent: Boolean
  ) {
    val mb = getMethodBind("EditorSettings","set_initial_value")
    _icall_Unit_String_Variant_Boolean( mb, this.ptr, name, value, updateCurrent)
  }

  open fun setProjectMetadata(
    section: String,
    key: String,
    data: Variant
  ) {
    val mb = getMethodBind("EditorSettings","set_project_metadata")
    _icall_Unit_String_String_Variant( mb, this.ptr, section, key, data)
  }

  open fun setRecentDirs(dirs: PoolStringArray) {
    val mb = getMethodBind("EditorSettings","set_recent_dirs")
    _icall_Unit_PoolStringArray( mb, this.ptr, dirs)
  }

  open fun setSetting(name: String, value: Variant) {
    val mb = getMethodBind("EditorSettings","set_setting")
    _icall_Unit_String_Variant( mb, this.ptr, name, value)
  }

  companion object {
    final const val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Long = 10000
  }
}
