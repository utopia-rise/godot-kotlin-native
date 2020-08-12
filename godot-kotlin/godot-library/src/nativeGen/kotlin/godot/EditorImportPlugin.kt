// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class EditorImportPlugin internal constructor(
  _ignore: Any?
) : ResourceImporter(_ignore) {
  internal constructor() : this(null)

  open fun getImportOptions(preset: Long): VariantArray {
    throw NotImplementedError("get_import_options is not implemented for EditorImportPlugin")
  }

  open fun getImportOrder(): Long {
    throw NotImplementedError("get_import_order is not implemented for EditorImportPlugin")
  }

  open fun getImporterName(): String {
    throw NotImplementedError("get_importer_name is not implemented for EditorImportPlugin")
  }

  open fun getOptionVisibility(option: String, options: Dictionary): Boolean {
    throw NotImplementedError("get_option_visibility is not implemented for EditorImportPlugin")
  }

  open fun getPresetCount(): Long {
    throw NotImplementedError("get_preset_count is not implemented for EditorImportPlugin")
  }

  open fun getPresetName(preset: Long): String {
    throw NotImplementedError("get_preset_name is not implemented for EditorImportPlugin")
  }

  open fun getPriority(): Double {
    throw NotImplementedError("get_priority is not implemented for EditorImportPlugin")
  }

  open fun getRecognizedExtensions(): VariantArray {
    throw NotImplementedError("get_recognized_extensions is not implemented for EditorImportPlugin")
  }

  open fun getResourceType(): String {
    throw NotImplementedError("get_resource_type is not implemented for EditorImportPlugin")
  }

  open fun getSaveExtension(): String {
    throw NotImplementedError("get_save_extension is not implemented for EditorImportPlugin")
  }

  open fun getVisibleName(): String {
    throw NotImplementedError("get_visible_name is not implemented for EditorImportPlugin")
  }

  open fun import(
    sourceFile: String,
    savePath: String,
    options: Dictionary,
    platformVariants: VariantArray,
    genFiles: VariantArray
  ): Long {
    throw NotImplementedError("import is not implemented for EditorImportPlugin")
  }
}
