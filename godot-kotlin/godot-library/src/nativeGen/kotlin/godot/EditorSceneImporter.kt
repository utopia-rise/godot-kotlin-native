// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.VariantArray
import godot.icalls._icall_Animation_String_Long_Long
import godot.icalls._icall_Node_String_Long_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class EditorSceneImporter internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  internal constructor() : this(null)

  open fun _getExtensions(): VariantArray {
    throw NotImplementedError("_get_extensions is not implemented for EditorSceneImporter")
  }

  open fun _getImportFlags(): Long {
    throw NotImplementedError("_get_import_flags is not implemented for EditorSceneImporter")
  }

  open fun _importAnimation(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Animation {
    throw NotImplementedError("_import_animation is not implemented for EditorSceneImporter")
  }

  open fun _importScene(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Node {
    throw NotImplementedError("_import_scene is not implemented for EditorSceneImporter")
  }

  open fun importAnimationFromOtherImporter(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Animation {
    val mb = getMethodBind("EditorSceneImporter","import_animation_from_other_importer")
    return _icall_Animation_String_Long_Long( mb, this.ptr, path, flags, bakeFps)
  }

  open fun importSceneFromOtherImporter(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Node {
    val mb = getMethodBind("EditorSceneImporter","import_scene_from_other_importer")
    return _icall_Node_String_Long_Long( mb, this.ptr, path, flags, bakeFps)
  }

  companion object {
    final const val IMPORT_ANIMATION: Long = 2

    final const val IMPORT_ANIMATION_DETECT_LOOP: Long = 4

    final const val IMPORT_ANIMATION_FORCE_ALL_TRACKS_IN_ALL_CLIPS: Long = 16

    final const val IMPORT_ANIMATION_KEEP_VALUE_TRACKS: Long = 32

    final const val IMPORT_ANIMATION_OPTIMIZE: Long = 8

    final const val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Long = 512

    final const val IMPORT_GENERATE_TANGENT_ARRAYS: Long = 256

    final const val IMPORT_MATERIALS_IN_INSTANCES: Long = 1024

    final const val IMPORT_SCENE: Long = 1

    final const val IMPORT_USE_COMPRESSION: Long = 2048
  }
}
