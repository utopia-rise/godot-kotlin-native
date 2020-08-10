package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.Variant
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_PoolByteArray
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_PoolStringArray_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Variant
import godot.icalls._icall_Variant_String_String_nVariant
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class ConfigFile internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ConfigFile", "ConfigFile")
        }

  }

  open fun eraseSection(section: String) {
    val mb = getMethodBind("ConfigFile","erase_section")
    _icall_Unit_String( mb, this.ptr, section)
  }

  open fun eraseSectionKey(section: String, key: String) {
    val mb = getMethodBind("ConfigFile","erase_section_key")
    _icall_Unit_String_String( mb, this.ptr, section, key)
  }

  open fun getSectionKeys(section: String): PoolStringArray {
    val mb = getMethodBind("ConfigFile","get_section_keys")
    return _icall_PoolStringArray_String( mb, this.ptr, section)
  }

  open fun getSections(): PoolStringArray {
    val mb = getMethodBind("ConfigFile","get_sections")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getValue(
    section: String,
    key: String,
    default: Variant? = null
  ): Variant {
    val mb = getMethodBind("ConfigFile","get_value")
    return _icall_Variant_String_String_nVariant( mb, this.ptr, section, key, default)
  }

  open fun hasSection(section: String): Boolean {
    val mb = getMethodBind("ConfigFile","has_section")
    return _icall_Boolean_String( mb, this.ptr, section)
  }

  open fun hasSectionKey(section: String, key: String): Boolean {
    val mb = getMethodBind("ConfigFile","has_section_key")
    return _icall_Boolean_String_String( mb, this.ptr, section, key)
  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("ConfigFile","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun loadEncrypted(path: String, key: PoolByteArray): GodotError {
    val mb = getMethodBind("ConfigFile","load_encrypted")
    return GodotError.byValue( _icall_Long_String_PoolByteArray( mb, this.ptr, path, key).toUInt())
  }

  open fun loadEncryptedPass(path: String, password: String): GodotError {
    val mb = getMethodBind("ConfigFile","load_encrypted_pass")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, path, password).toUInt())
  }

  open fun parse(data: String): GodotError {
    val mb = getMethodBind("ConfigFile","parse")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, data).toUInt())
  }

  open fun save(path: String): GodotError {
    val mb = getMethodBind("ConfigFile","save")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun saveEncrypted(path: String, key: PoolByteArray): GodotError {
    val mb = getMethodBind("ConfigFile","save_encrypted")
    return GodotError.byValue( _icall_Long_String_PoolByteArray( mb, this.ptr, path, key).toUInt())
  }

  open fun saveEncryptedPass(path: String, password: String): GodotError {
    val mb = getMethodBind("ConfigFile","save_encrypted_pass")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, path, password).toUInt())
  }

  open fun setValue(
    section: String,
    key: String,
    value: Variant
  ) {
    val mb = getMethodBind("ConfigFile","set_value")
    _icall_Unit_String_String_Variant( mb, this.ptr, section, key, value)
  }
}
