// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_Long_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_String_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorFeatureProfile internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun getFeatureName(feature: Long): String {
    val mb = getMethodBind("EditorFeatureProfile","get_feature_name")
    return _icall_String_Long( mb, this.ptr, feature)
  }

  open fun isClassDisabled(className: String): Boolean {
    val mb = getMethodBind("EditorFeatureProfile","is_class_disabled")
    return _icall_Boolean_String( mb, this.ptr, className)
  }

  open fun isClassEditorDisabled(className: String): Boolean {
    val mb = getMethodBind("EditorFeatureProfile","is_class_editor_disabled")
    return _icall_Boolean_String( mb, this.ptr, className)
  }

  open fun isClassPropertyDisabled(className: String, property: String): Boolean {
    val mb = getMethodBind("EditorFeatureProfile","is_class_property_disabled")
    return _icall_Boolean_String_String( mb, this.ptr, className, property)
  }

  open fun isFeatureDisabled(feature: Long): Boolean {
    val mb = getMethodBind("EditorFeatureProfile","is_feature_disabled")
    return _icall_Boolean_Long( mb, this.ptr, feature)
  }

  open fun loadFromFile(path: String): GodotError {
    val mb = getMethodBind("EditorFeatureProfile","load_from_file")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun saveToFile(path: String): GodotError {
    val mb = getMethodBind("EditorFeatureProfile","save_to_file")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun setDisableClass(className: String, disable: Boolean) {
    val mb = getMethodBind("EditorFeatureProfile","set_disable_class")
    _icall_Unit_String_Boolean( mb, this.ptr, className, disable)
  }

  open fun setDisableClassEditor(className: String, disable: Boolean) {
    val mb = getMethodBind("EditorFeatureProfile","set_disable_class_editor")
    _icall_Unit_String_Boolean( mb, this.ptr, className, disable)
  }

  open fun setDisableClassProperty(
    className: String,
    property: String,
    disable: Boolean
  ) {
    val mb = getMethodBind("EditorFeatureProfile","set_disable_class_property")
    _icall_Unit_String_String_Boolean( mb, this.ptr, className, property, disable)
  }

  open fun setDisableFeature(feature: Long, disable: Boolean) {
    val mb = getMethodBind("EditorFeatureProfile","set_disable_feature")
    _icall_Unit_Long_Boolean( mb, this.ptr, feature, disable)
  }

  enum class Feature(
    id: Long
  ) {
    FEATURE_3D(0),

    FEATURE_SCRIPT(1),

    FEATURE_ASSET_LIB(2),

    FEATURE_SCENE_TREE(3),

    FEATURE_IMPORT_DOCK(4),

    FEATURE_NODE_DOCK(5),

    FEATURE_FILESYSTEM_DOCK(6),

    FEATURE_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
