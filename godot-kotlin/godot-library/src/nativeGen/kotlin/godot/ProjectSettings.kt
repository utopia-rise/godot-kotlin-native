// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot
import godot.core.GodotError
import godot.core.Variant
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit_Dictionary
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Variant_String
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object ProjectSettings : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("ProjectSettings".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton ProjectSettings" }
        this@ProjectSettings.ptr = ptr
    }
  }

  fun addPropertyInfo(hint: Dictionary) {
    val mb = getMethodBind("ProjectSettings","add_property_info")
    _icall_Unit_Dictionary( mb, this.ptr, hint)
  }

  fun clear(name: String) {
    val mb = getMethodBind("ProjectSettings","clear")
    _icall_Unit_String( mb, this.ptr, name)
  }

  fun getOrder(name: String): Long {
    val mb = getMethodBind("ProjectSettings","get_order")
    return _icall_Long_String( mb, this.ptr, name)
  }

  fun getSetting(name: String): Variant {
    val mb = getMethodBind("ProjectSettings","get_setting")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  fun globalizePath(path: String): String {
    val mb = getMethodBind("ProjectSettings","globalize_path")
    return _icall_String_String( mb, this.ptr, path)
  }

  fun hasSetting(name: String): Boolean {
    val mb = getMethodBind("ProjectSettings","has_setting")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  fun loadResourcePack(pack: String, replaceFiles: Boolean = true): Boolean {
    val mb = getMethodBind("ProjectSettings","load_resource_pack")
    return _icall_Boolean_String_Boolean( mb, this.ptr, pack, replaceFiles)
  }

  fun localizePath(path: String): String {
    val mb = getMethodBind("ProjectSettings","localize_path")
    return _icall_String_String( mb, this.ptr, path)
  }

  fun propertyCanRevert(name: String): Boolean {
    val mb = getMethodBind("ProjectSettings","property_can_revert")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  fun propertyGetRevert(name: String): Variant {
    val mb = getMethodBind("ProjectSettings","property_get_revert")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  fun save(): GodotError {
    val mb = getMethodBind("ProjectSettings","save")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  fun saveCustom(file: String): GodotError {
    val mb = getMethodBind("ProjectSettings","save_custom")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, file).toUInt())
  }

  fun setInitialValue(name: String, value: Variant) {
    val mb = getMethodBind("ProjectSettings","set_initial_value")
    _icall_Unit_String_Variant( mb, this.ptr, name, value)
  }

  fun setOrder(name: String, position: Long) {
    val mb = getMethodBind("ProjectSettings","set_order")
    _icall_Unit_String_Long( mb, this.ptr, name, position)
  }

  fun setSetting(name: String, value: Variant) {
    val mb = getMethodBind("ProjectSettings","set_setting")
    _icall_Unit_String_Variant( mb, this.ptr, name, value)
  }
}
