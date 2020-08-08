package godot

import godot.core.GodotError
import godot.core.VariantArray
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Control
import godot.icalls._icall_EditorFileSystem
import godot.icalls._icall_EditorInspector
import godot.icalls._icall_EditorResourcePreview
import godot.icalls._icall_EditorSelection
import godot.icalls._icall_EditorSettings
import godot.icalls._icall_FileSystemDock
import godot.icalls._icall_Long
import godot.icalls._icall_Node
import godot.icalls._icall_ScriptEditor
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_VariantArray_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorInterface internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  internal constructor() : this(null)

  open fun editResource(resource: Resource) {
    val mb = getMethodBind("EditorInterface","edit_resource")
    _icall_Unit_Object( mb, this.ptr, resource)
  }

  open fun getBaseControl(): Control {
    val mb = getMethodBind("EditorInterface","get_base_control")
    return _icall_Control( mb, this.ptr)
  }

  open fun getCurrentPath(): String {
    val mb = getMethodBind("EditorInterface","get_current_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getEditedSceneRoot(): Node {
    val mb = getMethodBind("EditorInterface","get_edited_scene_root")
    return _icall_Node( mb, this.ptr)
  }

  open fun getEditorSettings(): EditorSettings {
    val mb = getMethodBind("EditorInterface","get_editor_settings")
    return _icall_EditorSettings( mb, this.ptr)
  }

  open fun getEditorViewport(): Control {
    val mb = getMethodBind("EditorInterface","get_editor_viewport")
    return _icall_Control( mb, this.ptr)
  }

  open fun getFileSystemDock(): FileSystemDock {
    val mb = getMethodBind("EditorInterface","get_file_system_dock")
    return _icall_FileSystemDock( mb, this.ptr)
  }

  open fun getInspector(): EditorInspector {
    val mb = getMethodBind("EditorInterface","get_inspector")
    return _icall_EditorInspector( mb, this.ptr)
  }

  open fun getOpenScenes(): VariantArray {
    val mb = getMethodBind("EditorInterface","get_open_scenes")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getResourceFilesystem(): EditorFileSystem {
    val mb = getMethodBind("EditorInterface","get_resource_filesystem")
    return _icall_EditorFileSystem( mb, this.ptr)
  }

  open fun getResourcePreviewer(): EditorResourcePreview {
    val mb = getMethodBind("EditorInterface","get_resource_previewer")
    return _icall_EditorResourcePreview( mb, this.ptr)
  }

  open fun getScriptEditor(): ScriptEditor {
    val mb = getMethodBind("EditorInterface","get_script_editor")
    return _icall_ScriptEditor( mb, this.ptr)
  }

  open fun getSelectedPath(): String {
    val mb = getMethodBind("EditorInterface","get_selected_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getSelection(): EditorSelection {
    val mb = getMethodBind("EditorInterface","get_selection")
    return _icall_EditorSelection( mb, this.ptr)
  }

  open fun inspectObject(_object: Object, forProperty: String = "") {
    val mb = getMethodBind("EditorInterface","inspect_object")
    _icall_Unit_Object_String( mb, this.ptr, _object, forProperty)
  }

  open fun isPluginEnabled(plugin: String): Boolean {
    val mb = getMethodBind("EditorInterface","is_plugin_enabled")
    return _icall_Boolean_String( mb, this.ptr, plugin)
  }

  open fun makeMeshPreviews(meshes: VariantArray, previewSize: Long): VariantArray {
    val mb = getMethodBind("EditorInterface","make_mesh_previews")
    return _icall_VariantArray_VariantArray_Long( mb, this.ptr, meshes, previewSize)
  }

  open fun openSceneFromPath(sceneFilepath: String) {
    val mb = getMethodBind("EditorInterface","open_scene_from_path")
    _icall_Unit_String( mb, this.ptr, sceneFilepath)
  }

  open fun reloadSceneFromPath(sceneFilepath: String) {
    val mb = getMethodBind("EditorInterface","reload_scene_from_path")
    _icall_Unit_String( mb, this.ptr, sceneFilepath)
  }

  open fun saveScene(): GodotError {
    val mb = getMethodBind("EditorInterface","save_scene")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun saveSceneAs(path: String, withPreview: Boolean = true) {
    val mb = getMethodBind("EditorInterface","save_scene_as")
    _icall_Unit_String_Boolean( mb, this.ptr, path, withPreview)
  }

  open fun selectFile(file: String) {
    val mb = getMethodBind("EditorInterface","select_file")
    _icall_Unit_String( mb, this.ptr, file)
  }

  open fun setDistractionFreeMode(enter: Boolean) {
    val mb = getMethodBind("EditorInterface","set_distraction_free_mode")
    _icall_Unit_Boolean( mb, this.ptr, enter)
  }

  open fun setMainScreenEditor(name: String) {
    val mb = getMethodBind("EditorInterface","set_main_screen_editor")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setPluginEnabled(plugin: String, enabled: Boolean) {
    val mb = getMethodBind("EditorInterface","set_plugin_enabled")
    _icall_Unit_String_Boolean( mb, this.ptr, plugin, enabled)
  }

  companion object
}
