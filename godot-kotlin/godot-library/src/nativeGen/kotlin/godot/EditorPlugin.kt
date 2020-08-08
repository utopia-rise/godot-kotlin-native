package godot

import godot.core.Dictionary
import godot.core.PoolStringArray
import godot.core.Signal1
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_EditorInterface
import godot.icalls._icall_Long
import godot.icalls._icall_ScriptCreateDialog
import godot.icalls._icall_ToolButton_Object_String
import godot.icalls._icall_UndoRedo
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_Object_String_nVariant
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Object_Object
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class EditorPlugin internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val mainScreenChanged: Signal1<String> by signal("screen_name")

  val resourceSaved: Signal1<Resource> by signal("resource")

  val sceneChanged: Signal1<Node> by signal("scene_root")

  val sceneClosed: Signal1<String> by signal("filepath")

  internal constructor() : this(null)

  open fun addAutoloadSingleton(name: String, path: String) {
    val mb = getMethodBind("EditorPlugin","add_autoload_singleton")
    _icall_Unit_String_String( mb, this.ptr, name, path)
  }

  open fun addControlToBottomPanel(control: Control, title: String): ToolButton {
    val mb = getMethodBind("EditorPlugin","add_control_to_bottom_panel")
    return _icall_ToolButton_Object_String( mb, this.ptr, control, title)
  }

  open fun addControlToContainer(container: Long, control: Control) {
    val mb = getMethodBind("EditorPlugin","add_control_to_container")
    _icall_Unit_Long_Object( mb, this.ptr, container, control)
  }

  open fun addControlToDock(slot: Long, control: Control) {
    val mb = getMethodBind("EditorPlugin","add_control_to_dock")
    _icall_Unit_Long_Object( mb, this.ptr, slot, control)
  }

  open fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture
  ) {
    val mb = getMethodBind("EditorPlugin","add_custom_type")
    _icall_Unit_String_String_Object_Object( mb, this.ptr, type, base, script, icon)
  }

  open fun addExportPlugin(plugin: EditorExportPlugin) {
    val mb = getMethodBind("EditorPlugin","add_export_plugin")
    _icall_Unit_Object( mb, this.ptr, plugin)
  }

  open fun addImportPlugin(importer: EditorImportPlugin) {
    val mb = getMethodBind("EditorPlugin","add_import_plugin")
    _icall_Unit_Object( mb, this.ptr, importer)
  }

  open fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    val mb = getMethodBind("EditorPlugin","add_inspector_plugin")
    _icall_Unit_Object( mb, this.ptr, plugin)
  }

  open fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val mb = getMethodBind("EditorPlugin","add_scene_import_plugin")
    _icall_Unit_Object( mb, this.ptr, sceneImporter)
  }

  open fun addSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val mb = getMethodBind("EditorPlugin","add_spatial_gizmo_plugin")
    _icall_Unit_Object( mb, this.ptr, plugin)
  }

  open fun addToolMenuItem(
    name: String,
    handler: Object,
    callback: String,
    ud: Variant? = null
  ) {
    val mb = getMethodBind("EditorPlugin","add_tool_menu_item")
    _icall_Unit_String_Object_String_nVariant( mb, this.ptr, name, handler, callback, ud)
  }

  open fun addToolSubmenuItem(name: String, submenu: Object) {
    val mb = getMethodBind("EditorPlugin","add_tool_submenu_item")
    _icall_Unit_String_Object( mb, this.ptr, name, submenu)
  }

  open fun apply_changes() {
  }

  open fun build(): Boolean {
    throw NotImplementedError("build is not implemented for EditorPlugin")
  }

  open fun clear() {
  }

  open fun disable_plugin() {
  }

  open fun edit(_object: Object) {
  }

  open fun enable_plugin() {
  }

  open fun forward_canvas_draw_over_viewport(overlay: Control) {
  }

  open fun forward_canvas_force_draw_over_viewport(overlay: Control) {
  }

  open fun forward_canvas_gui_input(event: InputEvent): Boolean {
    throw NotImplementedError("forward_canvas_gui_input is not implemented for EditorPlugin")
  }

  open fun forward_spatial_gui_input(camera: Camera, event: InputEvent): Boolean {
    throw NotImplementedError("forward_spatial_gui_input is not implemented for EditorPlugin")
  }

  open fun get_breakpoints(): PoolStringArray {
    throw NotImplementedError("get_breakpoints is not implemented for EditorPlugin")
  }

  open fun getEditorInterface(): EditorInterface {
    val mb = getMethodBind("EditorPlugin","get_editor_interface")
    return _icall_EditorInterface( mb, this.ptr)
  }

  open fun get_plugin_icon(): Texture {
    throw NotImplementedError("get_plugin_icon is not implemented for EditorPlugin")
  }

  open fun get_plugin_name(): String {
    throw NotImplementedError("get_plugin_name is not implemented for EditorPlugin")
  }

  open fun getScriptCreateDialog(): ScriptCreateDialog {
    val mb = getMethodBind("EditorPlugin","get_script_create_dialog")
    return _icall_ScriptCreateDialog( mb, this.ptr)
  }

  open fun get_state(): Dictionary {
    throw NotImplementedError("get_state is not implemented for EditorPlugin")
  }

  open fun getUndoRedo(): UndoRedo {
    val mb = getMethodBind("EditorPlugin","get_undo_redo")
    return _icall_UndoRedo( mb, this.ptr)
  }

  open fun get_window_layout(layout: ConfigFile) {
  }

  open fun handles(_object: Object): Boolean {
    throw NotImplementedError("handles is not implemented for EditorPlugin")
  }

  open fun has_main_screen(): Boolean {
    throw NotImplementedError("has_main_screen is not implemented for EditorPlugin")
  }

  open fun hideBottomPanel() {
    val mb = getMethodBind("EditorPlugin","hide_bottom_panel")
    _icall_Unit( mb, this.ptr)
  }

  open fun makeBottomPanelItemVisible(item: Control) {
    val mb = getMethodBind("EditorPlugin","make_bottom_panel_item_visible")
    _icall_Unit_Object( mb, this.ptr, item)
  }

  open fun make_visible(visible: Boolean) {
  }

  open fun queueSaveLayout() {
    val mb = getMethodBind("EditorPlugin","queue_save_layout")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeAutoloadSingleton(name: String) {
    val mb = getMethodBind("EditorPlugin","remove_autoload_singleton")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun removeControlFromBottomPanel(control: Control) {
    val mb = getMethodBind("EditorPlugin","remove_control_from_bottom_panel")
    _icall_Unit_Object( mb, this.ptr, control)
  }

  open fun removeControlFromContainer(container: Long, control: Control) {
    val mb = getMethodBind("EditorPlugin","remove_control_from_container")
    _icall_Unit_Long_Object( mb, this.ptr, container, control)
  }

  open fun removeControlFromDocks(control: Control) {
    val mb = getMethodBind("EditorPlugin","remove_control_from_docks")
    _icall_Unit_Object( mb, this.ptr, control)
  }

  open fun removeCustomType(type: String) {
    val mb = getMethodBind("EditorPlugin","remove_custom_type")
    _icall_Unit_String( mb, this.ptr, type)
  }

  open fun removeExportPlugin(plugin: EditorExportPlugin) {
    val mb = getMethodBind("EditorPlugin","remove_export_plugin")
    _icall_Unit_Object( mb, this.ptr, plugin)
  }

  open fun removeImportPlugin(importer: EditorImportPlugin) {
    val mb = getMethodBind("EditorPlugin","remove_import_plugin")
    _icall_Unit_Object( mb, this.ptr, importer)
  }

  open fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    val mb = getMethodBind("EditorPlugin","remove_inspector_plugin")
    _icall_Unit_Object( mb, this.ptr, plugin)
  }

  open fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    val mb = getMethodBind("EditorPlugin","remove_scene_import_plugin")
    _icall_Unit_Object( mb, this.ptr, sceneImporter)
  }

  open fun removeSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    val mb = getMethodBind("EditorPlugin","remove_spatial_gizmo_plugin")
    _icall_Unit_Object( mb, this.ptr, plugin)
  }

  open fun removeToolMenuItem(name: String) {
    val mb = getMethodBind("EditorPlugin","remove_tool_menu_item")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun save_external_data() {
  }

  open fun setForceDrawOverForwardingEnabled() {
    val mb = getMethodBind("EditorPlugin","set_force_draw_over_forwarding_enabled")
    _icall_Unit( mb, this.ptr)
  }

  open fun setInputEventForwardingAlwaysEnabled() {
    val mb = getMethodBind("EditorPlugin","set_input_event_forwarding_always_enabled")
    _icall_Unit( mb, this.ptr)
  }

  open fun set_state(state: Dictionary) {
  }

  open fun set_window_layout(layout: ConfigFile) {
  }

  open fun updateOverlays(): Long {
    val mb = getMethodBind("EditorPlugin","update_overlays")
    return _icall_Long( mb, this.ptr)
  }

  enum class DockSlot(
    id: Long
  ) {
    DOCK_SLOT_LEFT_UL(0),

    DOCK_SLOT_LEFT_BL(1),

    DOCK_SLOT_LEFT_UR(2),

    DOCK_SLOT_LEFT_BR(3),

    DOCK_SLOT_RIGHT_UL(4),

    DOCK_SLOT_RIGHT_BL(5),

    DOCK_SLOT_RIGHT_UR(6),

    DOCK_SLOT_RIGHT_BR(7),

    DOCK_SLOT_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CustomControlContainer(
    id: Long
  ) {
    CONTAINER_TOOLBAR(0),

    CONTAINER_SPATIAL_EDITOR_MENU(1),

    CONTAINER_SPATIAL_EDITOR_SIDE_LEFT(2),

    CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT(3),

    CONTAINER_SPATIAL_EDITOR_BOTTOM(4),

    CONTAINER_CANVAS_EDITOR_MENU(5),

    CONTAINER_CANVAS_EDITOR_SIDE_LEFT(6),

    CONTAINER_CANVAS_EDITOR_SIDE_RIGHT(7),

    CONTAINER_CANVAS_EDITOR_BOTTOM(8),

    CONTAINER_PROPERTY_EDITOR_BOTTOM(9),

    CONTAINER_PROJECT_SETTING_TAB_LEFT(10),

    CONTAINER_PROJECT_SETTING_TAB_RIGHT(11);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CONTAINER_CANVAS_EDITOR_BOTTOM: Long = 8

    final const val CONTAINER_CANVAS_EDITOR_MENU: Long = 5

    final const val CONTAINER_CANVAS_EDITOR_SIDE_LEFT: Long = 6

    final const val CONTAINER_CANVAS_EDITOR_SIDE_RIGHT: Long = 7

    final const val CONTAINER_PROJECT_SETTING_TAB_LEFT: Long = 10

    final const val CONTAINER_PROJECT_SETTING_TAB_RIGHT: Long = 11

    final const val CONTAINER_PROPERTY_EDITOR_BOTTOM: Long = 9

    final const val CONTAINER_SPATIAL_EDITOR_BOTTOM: Long = 4

    final const val CONTAINER_SPATIAL_EDITOR_MENU: Long = 1

    final const val CONTAINER_SPATIAL_EDITOR_SIDE_LEFT: Long = 2

    final const val CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT: Long = 3

    final const val CONTAINER_TOOLBAR: Long = 0

    final const val DOCK_SLOT_LEFT_BL: Long = 1

    final const val DOCK_SLOT_LEFT_BR: Long = 3

    final const val DOCK_SLOT_LEFT_UL: Long = 0

    final const val DOCK_SLOT_LEFT_UR: Long = 2

    final const val DOCK_SLOT_MAX: Long = 8

    final const val DOCK_SLOT_RIGHT_BL: Long = 5

    final const val DOCK_SLOT_RIGHT_BR: Long = 7

    final const val DOCK_SLOT_RIGHT_UL: Long = 4

    final const val DOCK_SLOT_RIGHT_UR: Long = 6
  }
}
