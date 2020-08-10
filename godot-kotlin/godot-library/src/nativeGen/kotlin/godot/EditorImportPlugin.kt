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

  open fun get_import_options(preset: Long): VariantArray {
    throw NotImplementedError("get_import_options is not implemented for EditorImportPlugin")
  }

  open fun get_import_order(): Long {
    throw NotImplementedError("get_import_order is not implemented for EditorImportPlugin")
  }

  open fun get_importer_name(): String {
    throw NotImplementedError("get_importer_name is not implemented for EditorImportPlugin")
  }

  open fun get_option_visibility(option: String, options: Dictionary): Boolean {
    throw NotImplementedError("get_option_visibility is not implemented for EditorImportPlugin")
  }

  open fun get_preset_count(): Long {
    throw NotImplementedError("get_preset_count is not implemented for EditorImportPlugin")
  }

  open fun get_preset_name(preset: Long): String {
    throw NotImplementedError("get_preset_name is not implemented for EditorImportPlugin")
  }

  open fun get_priority(): Double {
    throw NotImplementedError("get_priority is not implemented for EditorImportPlugin")
  }

  open fun get_recognized_extensions(): VariantArray {
    throw NotImplementedError("get_recognized_extensions is not implemented for EditorImportPlugin")
  }

  open fun get_resource_type(): String {
    throw NotImplementedError("get_resource_type is not implemented for EditorImportPlugin")
  }

  open fun get_save_extension(): String {
    throw NotImplementedError("get_save_extension is not implemented for EditorImportPlugin")
  }

  open fun get_visible_name(): String {
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
