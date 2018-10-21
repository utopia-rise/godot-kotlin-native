@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorInterface : Node {
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


    companion object {
        infix fun from(other: Node): EditorInterface = EditorInterface("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorInterface = EditorInterface("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorInterface = fromVariant(EditorInterface(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val inspectObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "inspect_object") }
    open fun inspectObject(_object: Object, forProperty: String = "") {
        _icall_Unit_Object_String(inspectObjectMethodBind, this.rawMemory, _object, forProperty)
    }


    private val getSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_selection") }
    open fun getSelection(): EditorSelection {
        return _icall_EditorSelection(getSelectionMethodBind, this.rawMemory)
    }


    private val getEditorSettingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_editor_settings") }
    open fun getEditorSettings(): EditorSettings {
        return _icall_EditorSettings(getEditorSettingsMethodBind, this.rawMemory)
    }


    private val getScriptEditorMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_script_editor") }
    open fun getScriptEditor(): ScriptEditor {
        return _icall_ScriptEditor(getScriptEditorMethodBind, this.rawMemory)
    }


    private val getBaseControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_base_control") }
    open fun getBaseControl(): Control {
        return _icall_Control(getBaseControlMethodBind, this.rawMemory)
    }


    private val editResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "edit_resource") }
    open fun editResource(resource: Resource) {
        _icall_Unit_Object(editResourceMethodBind, this.rawMemory, resource)
    }


    private val openSceneFromPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "open_scene_from_path") }
    open fun openSceneFromPath(sceneFilepath: String) {
        _icall_Unit_String(openSceneFromPathMethodBind, this.rawMemory, sceneFilepath)
    }


    private val reloadSceneFromPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "reload_scene_from_path") }
    open fun reloadSceneFromPath(sceneFilepath: String) {
        _icall_Unit_String(reloadSceneFromPathMethodBind, this.rawMemory, sceneFilepath)
    }


    private val getOpenScenesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_open_scenes") }
    open fun getOpenScenes(): GDArray {
        return _icall_GDArray(getOpenScenesMethodBind, this.rawMemory)
    }


    private val getEditedSceneRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_edited_scene_root") }
    open fun getEditedSceneRoot(): Node {
        return _icall_Node(getEditedSceneRootMethodBind, this.rawMemory)
    }


    private val getResourcePreviewerMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_resource_previewer") }
    open fun getResourcePreviewer(): EditorResourcePreview {
        return _icall_EditorResourcePreview(getResourcePreviewerMethodBind, this.rawMemory)
    }


    private val getResourceFilesystemMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_resource_filesystem") }
    open fun getResourceFilesystem(): EditorFileSystem {
        return _icall_EditorFileSystem(getResourceFilesystemMethodBind, this.rawMemory)
    }


    private val getEditorViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_editor_viewport") }
    open fun getEditorViewport(): Control {
        return _icall_Control(getEditorViewportMethodBind, this.rawMemory)
    }


    private val makeMeshPreviewsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "make_mesh_previews") }
    open fun makeMeshPreviews(meshes: GDArray, previewSize: Long): GDArray {
        return _icall_GDArray_GDArray_Long(makeMeshPreviewsMethodBind, this.rawMemory, meshes, previewSize)
    }


    private val selectFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "select_file") }
    open fun selectFile(pFile: String) {
        _icall_Unit_String(selectFileMethodBind, this.rawMemory, pFile)
    }


    private val getSelectedPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "get_selected_path") }
    open fun getSelectedPath(): String {
        return _icall_String(getSelectedPathMethodBind, this.rawMemory)
    }


    private val setPluginEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "set_plugin_enabled") }
    open fun setPluginEnabled(plugin: String, enabled: Boolean) {
        _icall_Unit_String_Boolean(setPluginEnabledMethodBind, this.rawMemory, plugin, enabled)
    }


    private val isPluginEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "is_plugin_enabled") }
    open fun isPluginEnabled(plugin: String): Boolean {
        return _icall_Boolean_String(isPluginEnabledMethodBind, this.rawMemory, plugin)
    }


    private val saveSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "save_scene") }
    open fun saveScene(): GodotError {
        return GodotError.fromInt(_icall_Long(saveSceneMethodBind, this.rawMemory))
    }


    private val saveSceneAsMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorInterface", "save_scene_as") }
    open fun saveSceneAs(path: String, withPreview: Boolean = true) {
        _icall_Unit_String_Boolean(saveSceneAsMethodBind, this.rawMemory, path, withPreview)
    }


}
