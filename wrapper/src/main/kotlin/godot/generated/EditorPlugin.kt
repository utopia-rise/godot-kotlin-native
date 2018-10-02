@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorPlugin : Node {
    constructor() : super("EditorPlugin")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DockSlot(val id: Int) {
        DOCK_SLOT_LEFT_UL(0),
        DOCK_SLOT_LEFT_BL(1),
        DOCK_SLOT_LEFT_UR(2),
        DOCK_SLOT_LEFT_BR(3),
        DOCK_SLOT_RIGHT_UL(4),
        DOCK_SLOT_RIGHT_BL(5),
        DOCK_SLOT_RIGHT_UR(6),
        DOCK_SLOT_RIGHT_BR(7),
        DOCK_SLOT_MAX(8),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class CustomControlContainer(val id: Int) {
        CONTAINER_TOOLBAR(0),
        CONTAINER_SPATIAL_EDITOR_MENU(1),
        CONTAINER_SPATIAL_EDITOR_SIDE(2),
        CONTAINER_SPATIAL_EDITOR_BOTTOM(3),
        CONTAINER_CANVAS_EDITOR_MENU(4),
        CONTAINER_CANVAS_EDITOR_SIDE(5),
        CONTAINER_CANVAS_EDITOR_BOTTOM(6),
        CONTAINER_PROPERTY_EDITOR_BOTTOM(7),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val MAIN_SCREEN_CHANGED: String = "main_screen_changed"
            const val SCENE_CLOSED: String = "scene_closed"
            const val SCENE_CHANGED: String = "scene_changed"
            const val RESOURCE_SAVED: String = "resource_saved"
        }
    }


    companion object {
        infix fun from(other: Node): EditorPlugin = EditorPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorPlugin = EditorPlugin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorPlugin = fromVariant(EditorPlugin(""), other)


        // Constants
        const val CONTAINER_TOOLBAR: Int = 0
        const val CONTAINER_SPATIAL_EDITOR_MENU: Int = 1
        const val CONTAINER_SPATIAL_EDITOR_SIDE: Int = 2
        const val CONTAINER_SPATIAL_EDITOR_BOTTOM: Int = 3
        const val CONTAINER_CANVAS_EDITOR_MENU: Int = 4
        const val CONTAINER_CANVAS_EDITOR_SIDE: Int = 5
        const val CONTAINER_CANVAS_EDITOR_BOTTOM: Int = 6
        const val CONTAINER_PROPERTY_EDITOR_BOTTOM: Int = 7
        const val DOCK_SLOT_LEFT_UL: Int = 0
        const val DOCK_SLOT_LEFT_BL: Int = 1
        const val DOCK_SLOT_LEFT_UR: Int = 2
        const val DOCK_SLOT_LEFT_BR: Int = 3
        const val DOCK_SLOT_RIGHT_UL: Int = 4
        const val DOCK_SLOT_RIGHT_BL: Int = 5
        const val DOCK_SLOT_RIGHT_UR: Int = 6
        const val DOCK_SLOT_RIGHT_BR: Int = 7
        const val DOCK_SLOT_MAX: Int = 8


    }


    // Properties


    // Methods
    open fun forward_canvas_gui_input(event: InputEvent): Boolean {
        throw NotImplementedError("forward_canvas_gui_input is not implemented for EditorPlugin")
    }


    open fun forward_draw_over_viewport(overlay: Control) {
    }


    open fun forward_force_draw_over_viewport(overlay: Control) {
    }


    open fun forward_spatial_gui_input(camera: Camera, event: InputEvent): Boolean {
        throw NotImplementedError("forward_spatial_gui_input is not implemented for EditorPlugin")
    }


    open fun create_spatial_gizmo(forSpatial: Spatial): EditorSpatialGizmo {
        throw NotImplementedError("create_spatial_gizmo is not implemented for EditorPlugin")
    }


    open fun get_plugin_name(): String {
        throw NotImplementedError("get_plugin_name is not implemented for EditorPlugin")
    }


    open fun get_plugin_icon(): Object {
        throw NotImplementedError("get_plugin_icon is not implemented for EditorPlugin")
    }


    open fun has_main_screen(): Boolean {
        throw NotImplementedError("has_main_screen is not implemented for EditorPlugin")
    }


    open fun make_visible(visible: Boolean) {
    }


    open fun edit(_object: Object) {
    }


    open fun handles(_object: Object): Boolean {
        throw NotImplementedError("handles is not implemented for EditorPlugin")
    }


    open fun get_state(): Dictionary {
        throw NotImplementedError("get_state is not implemented for EditorPlugin")
    }


    open fun set_state(state: Dictionary) {
    }


    open fun clear() {
    }


    open fun save_external_data() {
    }


    open fun apply_changes() {
    }


    open fun get_breakpoints(): PoolStringArray {
        throw NotImplementedError("get_breakpoints is not implemented for EditorPlugin")
    }


    open fun set_window_layout(layout: ConfigFile) {
    }


    open fun get_window_layout(layout: ConfigFile) {
    }


    open fun build(): Boolean {
        throw NotImplementedError("build is not implemented for EditorPlugin")
    }


    private val addControlToContainerMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_control_to_container") }
    open fun addControlToContainer(container: Int, control: Object) {
        _icall_Unit_Int_Object(addControlToContainerMethodBind, this.rawMemory, container, control)
    }


    private val addControlToBottomPanelMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_control_to_bottom_panel") }
    open fun addControlToBottomPanel(control: Object, title: String): ToolButton {
        return _icall_ToolButton_Object_String(addControlToBottomPanelMethodBind, this.rawMemory, control, title)
    }


    private val addControlToDockMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_control_to_dock") }
    open fun addControlToDock(slot: Int, control: Object) {
        _icall_Unit_Int_Object(addControlToDockMethodBind, this.rawMemory, slot, control)
    }


    private val removeControlFromDocksMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_control_from_docks") }
    open fun removeControlFromDocks(control: Object) {
        _icall_Unit_Object(removeControlFromDocksMethodBind, this.rawMemory, control)
    }


    private val removeControlFromBottomPanelMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_control_from_bottom_panel") }
    open fun removeControlFromBottomPanel(control: Object) {
        _icall_Unit_Object(removeControlFromBottomPanelMethodBind, this.rawMemory, control)
    }


    private val removeControlFromContainerMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_control_from_container") }
    open fun removeControlFromContainer(container: Int, control: Object) {
        _icall_Unit_Int_Object(removeControlFromContainerMethodBind, this.rawMemory, container, control)
    }


    private val addToolMenuItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_tool_menu_item") }
    open fun addToolMenuItem(name: String, handler: Object, callback: String, ud: Variant) {
        _icall_Unit_String_Object_String_Variant(addToolMenuItemMethodBind, this.rawMemory, name, handler, callback, ud)
    }


    private val addToolSubmenuItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_tool_submenu_item") }
    open fun addToolSubmenuItem(name: String, submenu: Object) {
        _icall_Unit_String_Object(addToolSubmenuItemMethodBind, this.rawMemory, name, submenu)
    }


    private val removeToolMenuItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_tool_menu_item") }
    open fun removeToolMenuItem(name: String) {
        _icall_Unit_String(removeToolMenuItemMethodBind, this.rawMemory, name)
    }


    private val addCustomTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_custom_type") }
    open fun addCustomType(type: String, base: String, script: Script, icon: Texture) {
        _icall_Unit_String_String_Object_Object(addCustomTypeMethodBind, this.rawMemory, type, base, script, icon)
    }


    private val removeCustomTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_custom_type") }
    open fun removeCustomType(type: String) {
        _icall_Unit_String(removeCustomTypeMethodBind, this.rawMemory, type)
    }


    private val addAutoloadSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_autoload_singleton") }
    open fun addAutoloadSingleton(name: String, path: String) {
        _icall_Unit_String_String(addAutoloadSingletonMethodBind, this.rawMemory, name, path)
    }


    private val removeAutoloadSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_autoload_singleton") }
    open fun removeAutoloadSingleton(name: String) {
        _icall_Unit_String(removeAutoloadSingletonMethodBind, this.rawMemory, name)
    }


    private val updateOverlaysMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "update_overlays") }
    open fun updateOverlays(): Int {
        return _icall_Int(updateOverlaysMethodBind, this.rawMemory)
    }


    private val makeBottomPanelItemVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "make_bottom_panel_item_visible") }
    open fun makeBottomPanelItemVisible(item: Object) {
        _icall_Unit_Object(makeBottomPanelItemVisibleMethodBind, this.rawMemory, item)
    }


    private val hideBottomPanelMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "hide_bottom_panel") }
    open fun hideBottomPanel() {
        _icall_Unit(hideBottomPanelMethodBind, this.rawMemory)
    }


    private val getUndoRedoMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "get_undo_redo") }
    open fun getUndoRedo(): UndoRedo {
        return _icall_UndoRedo(getUndoRedoMethodBind, this.rawMemory)
    }


    private val queueSaveLayoutMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "queue_save_layout") }
    open fun queueSaveLayout() {
        _icall_Unit(queueSaveLayoutMethodBind, this.rawMemory)
    }


    private val addImportPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_import_plugin") }
    open fun addImportPlugin(importer: EditorImportPlugin) {
        _icall_Unit_Object(addImportPluginMethodBind, this.rawMemory, importer)
    }


    private val removeImportPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_import_plugin") }
    open fun removeImportPlugin(importer: EditorImportPlugin) {
        _icall_Unit_Object(removeImportPluginMethodBind, this.rawMemory, importer)
    }


    private val addSceneImportPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_scene_import_plugin") }
    open fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
        _icall_Unit_Object(addSceneImportPluginMethodBind, this.rawMemory, sceneImporter)
    }


    private val removeSceneImportPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_scene_import_plugin") }
    open fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
        _icall_Unit_Object(removeSceneImportPluginMethodBind, this.rawMemory, sceneImporter)
    }


    private val addExportPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_export_plugin") }
    open fun addExportPlugin(plugin: EditorExportPlugin) {
        _icall_Unit_Object(addExportPluginMethodBind, this.rawMemory, plugin)
    }


    private val removeExportPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_export_plugin") }
    open fun removeExportPlugin(plugin: EditorExportPlugin) {
        _icall_Unit_Object(removeExportPluginMethodBind, this.rawMemory, plugin)
    }


    private val addInspectorPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "add_inspector_plugin") }
    open fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
        _icall_Unit_Object(addInspectorPluginMethodBind, this.rawMemory, plugin)
    }


    private val removeInspectorPluginMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "remove_inspector_plugin") }
    open fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
        _icall_Unit_Object(removeInspectorPluginMethodBind, this.rawMemory, plugin)
    }


    private val setInputEventForwardingAlwaysEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "set_input_event_forwarding_always_enabled") }
    open fun setInputEventForwardingAlwaysEnabled() {
        _icall_Unit(setInputEventForwardingAlwaysEnabledMethodBind, this.rawMemory)
    }


    private val setForceDrawOverForwardingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "set_force_draw_over_forwarding_enabled") }
    open fun setForceDrawOverForwardingEnabled() {
        _icall_Unit(setForceDrawOverForwardingEnabledMethodBind, this.rawMemory)
    }


    private val getEditorInterfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "get_editor_interface") }
    open fun getEditorInterface(): EditorInterface {
        return _icall_EditorInterface(getEditorInterfaceMethodBind, this.rawMemory)
    }


    private val getScriptCreateDialogMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorPlugin", "get_script_create_dialog") }
    open fun getScriptCreateDialog(): ScriptCreateDialog {
        return _icall_ScriptCreateDialog(getScriptCreateDialogMethodBind, this.rawMemory)
    }


}
