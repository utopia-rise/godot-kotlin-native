@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ScriptEditor : PanelContainer {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val EDITOR_SCRIPT_CHANGED: String = "editor_script_changed"
            const val SCRIPT_CLOSE: String = "script_close"
        }
    }


    companion object {
        infix fun from(other: PanelContainer): ScriptEditor = ScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Container): ScriptEditor = ScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ScriptEditor = ScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ScriptEditor = ScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ScriptEditor = ScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ScriptEditor = ScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ScriptEditor = fromVariant(ScriptEditor(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _file_dialog_action(arg0: String) {
    }


    open fun _tab_changed(arg0: Long) {
    }


    open fun _menu_option(arg0: Long) {
    }


    open fun _close_current_tab() {
    }


    open fun _close_discard_current_tab(arg0: String) {
    }


    open fun _close_docs_tab() {
    }


    open fun _close_all_tabs() {
    }


    open fun _close_other_tabs() {
    }


    open fun _open_recent_script(arg0: Long) {
    }


    open fun _theme_option(arg0: Long) {
    }


    open fun _editor_play() {
    }


    open fun _editor_pause() {
    }


    open fun _editor_stop() {
    }


    open fun _add_callback(arg0: Object, arg1: String, arg2: PoolStringArray) {
    }


    open fun _reload_scripts() {
    }


    open fun _resave_scripts(arg0: String) {
    }


    open fun _res_saved_callback(arg0: Resource) {
    }


    open fun _goto_script_line(arg0: Reference, arg1: Long) {
    }


    open fun _goto_script_line2(arg0: Long) {
    }


    open fun _help_search(arg0: String) {
    }


    open fun _help_index(arg0: String) {
    }


    open fun _save_history() {
    }


    open fun _copy_script_path() {
    }


    open fun _breaked(arg0: Boolean, arg1: Boolean) {
    }


    open fun _show_debugger(arg0: Boolean) {
    }


    open fun _get_debug_tooltip(arg0: String, arg1: Object): String {
        throw NotImplementedError("_get_debug_tooltip is not implemented for ScriptEditor")
    }


    open fun _autosave_scripts() {
    }


    open fun _editor_settings_changed() {
    }


    open fun _update_script_names() {
    }


    open fun _tree_changed() {
    }


    open fun _members_overview_selected(arg0: Long) {
    }


    open fun _help_overview_selected(arg0: Long) {
    }


    open fun _script_selected(arg0: Long) {
    }


    open fun _script_created(arg0: Script) {
    }


    open fun _script_split_dragged(arg0: Double) {
    }


    open fun _help_class_open(arg0: String) {
    }


    open fun _help_class_goto(arg0: String) {
    }


    open fun _request_help(arg0: String) {
    }


    open fun _history_forward() {
    }


    open fun _history_back() {
    }


    open fun _live_auto_reload_running_scripts() {
    }


    override fun _unhandled_input(arg0: InputEvent) {
    }


    open fun _script_list_gui_input(arg0: InputEvent) {
    }


    open fun _toggle_members_overview_alpha_sort(arg0: Boolean) {
    }


    open fun _update_members_overview() {
    }


    open fun _script_changed() {
    }


    open fun _update_recent_scripts() {
    }


    open fun _on_find_in_files_requested(arg0: String) {
    }


    open fun _start_find_in_files(arg0: Boolean) {
    }


    open fun _on_find_in_files_result_selected(arg0: String, arg1: Long, arg2: Long, arg3: Long) {
    }


    open fun _on_find_in_files_modified_files(arg0: PoolStringArray) {
    }


    private val getDragDataFwMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptEditor", "get_drag_data_fw") }
    open fun getDragDataFw(point: Vector2, from: Object): Variant {
        return _icall_Variant_Vector2_Object(getDragDataFwMethodBind, this.rawMemory, point, from)
    }


    private val canDropDataFwMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptEditor", "can_drop_data_fw") }
    open fun canDropDataFw(point: Vector2, data: Variant, from: Object): Boolean {
        return _icall_Boolean_Vector2_Variant_Object(canDropDataFwMethodBind, this.rawMemory, point, data, from)
    }


    private val dropDataFwMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptEditor", "drop_data_fw") }
    open fun dropDataFw(point: Vector2, data: Variant, from: Object) {
        _icall_Unit_Vector2_Variant_Object(dropDataFwMethodBind, this.rawMemory, point, data, from)
    }


    private val getCurrentScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptEditor", "get_current_script") }
    open fun getCurrentScript(): Script {
        return _icall_Script(getCurrentScriptMethodBind, this.rawMemory)
    }


    private val getOpenScriptsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptEditor", "get_open_scripts") }
    open fun getOpenScripts(): GDArray {
        return _icall_GDArray(getOpenScriptsMethodBind, this.rawMemory)
    }


    private val openScriptCreateDialogMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScriptEditor", "open_script_create_dialog") }
    open fun openScriptCreateDialog(baseName: String, basePath: String) {
        _icall_Unit_String_String(openScriptCreateDialogMethodBind, this.rawMemory, baseName, basePath)
    }


}
