package godot

import godot.core.PoolStringArray
import godot.core.Signal1
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean_Vector2_Variant_Object
import godot.icalls._icall_Script
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_Vector2_Variant_Object
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Variant_Vector2_Object
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class ScriptEditor internal constructor(
  _ignore: Any?
) : PanelContainer(_ignore) {
  val editorScriptChanged: Signal1<Script> by signal("script")

  val scriptClose: Signal1<Script> by signal("script")

  internal constructor() : this(null)

  open fun _add_callback(
    arg0: Object,
    arg1: String,
    arg2: PoolStringArray
  ) {
  }

  open fun _autosave_scripts() {
  }

  open fun _breaked(arg0: Boolean, arg1: Boolean) {
  }

  open fun _clear_execution(arg0: Reference) {
  }

  open fun _close_all_tabs() {
  }

  open fun _close_current_tab() {
  }

  open fun _close_discard_current_tab(arg0: String) {
  }

  open fun _close_docs_tab() {
  }

  open fun _close_other_tabs() {
  }

  open fun _copy_script_path() {
  }

  open fun _editor_pause() {
  }

  open fun _editor_play() {
  }

  open fun _editor_settings_changed() {
  }

  open fun _editor_stop() {
  }

  open fun _file_dialog_action(arg0: String) {
  }

  open fun _filter_methods_text_changed(arg0: String) {
  }

  open fun _filter_scripts_text_changed(arg0: String) {
  }

  open fun _get_debug_tooltip(arg0: String, arg1: Node): String {
    throw NotImplementedError("_get_debug_tooltip is not implemented for ScriptEditor")
  }

  open fun _goto_script_line(arg0: Reference, arg1: Long) {
  }

  open fun _goto_script_line2(arg0: Long) {
  }

  open fun _help_class_goto(arg0: String) {
  }

  open fun _help_class_open(arg0: String) {
  }

  open fun _help_overview_selected(arg0: Long) {
  }

  open fun _help_search(arg0: String) {
  }

  open fun _history_back() {
  }

  open fun _history_forward() {
  }

  open fun _live_auto_reload_running_scripts() {
  }

  open fun _members_overview_selected(arg0: Long) {
  }

  open fun _menu_option(arg0: Long) {
  }

  open fun _on_find_in_files_modified_files(arg0: PoolStringArray) {
  }

  open fun _on_find_in_files_requested(arg0: String) {
  }

  open fun _on_find_in_files_result_selected(
    arg0: String,
    arg1: Long,
    arg2: Long,
    arg3: Long
  ) {
  }

  open fun _open_recent_script(arg0: Long) {
  }

  open fun _reload_scripts() {
  }

  open fun _request_help(arg0: String) {
  }

  open fun _res_saved_callback(arg0: Resource) {
  }

  open fun _resave_scripts(arg0: String) {
  }

  open fun _save_history() {
  }

  open fun _script_changed() {
  }

  open fun _script_created(arg0: Script) {
  }

  open fun _script_list_gui_input(arg0: InputEvent) {
  }

  open fun _script_selected(arg0: Long) {
  }

  open fun _script_split_dragged(arg0: Double) {
  }

  open fun _set_execution(arg0: Reference, arg1: Long) {
  }

  open fun _show_debugger(arg0: Boolean) {
  }

  open fun _start_find_in_files(arg0: Boolean) {
  }

  open fun _tab_changed(arg0: Long) {
  }

  open fun _theme_option(arg0: Long) {
  }

  open fun _toggle_members_overview_alpha_sort(arg0: Boolean) {
  }

  open fun _tree_changed() {
  }

  override fun _unhandled_input(arg0: InputEvent) {
  }

  open fun _update_autosave_timer() {
  }

  open fun _update_members_overview() {
  }

  open fun _update_recent_scripts() {
  }

  open fun _update_script_connections() {
  }

  open fun _update_script_names() {
  }

  open fun canDropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ): Boolean {
    val mb = getMethodBind("ScriptEditor","can_drop_data_fw")
    return _icall_Boolean_Vector2_Variant_Object( mb, this.ptr, point, data, from)
  }

  open fun dropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ) {
    val mb = getMethodBind("ScriptEditor","drop_data_fw")
    _icall_Unit_Vector2_Variant_Object( mb, this.ptr, point, data, from)
  }

  open fun getCurrentScript(): Script {
    val mb = getMethodBind("ScriptEditor","get_current_script")
    return _icall_Script( mb, this.ptr)
  }

  open fun getDragDataFw(point: Vector2, from: Control): Variant {
    val mb = getMethodBind("ScriptEditor","get_drag_data_fw")
    return _icall_Variant_Vector2_Object( mb, this.ptr, point, from)
  }

  open fun getOpenScripts(): VariantArray {
    val mb = getMethodBind("ScriptEditor","get_open_scripts")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun gotoLine(lineNumber: Long) {
    val mb = getMethodBind("ScriptEditor","goto_line")
    _icall_Unit_Long( mb, this.ptr, lineNumber)
  }

  open fun openScriptCreateDialog(baseName: String, basePath: String) {
    val mb = getMethodBind("ScriptEditor","open_script_create_dialog")
    _icall_Unit_String_String( mb, this.ptr, baseName, basePath)
  }

  companion object
}
