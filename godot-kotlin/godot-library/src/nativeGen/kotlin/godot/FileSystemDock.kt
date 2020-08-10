// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Variant
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean_Vector2_Variant_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector2_Variant_Object
import godot.icalls._icall_Variant_Vector2_Object
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class FileSystemDock internal constructor(
  _ignore: Any?
) : VBoxContainer(_ignore) {
  val displayModeChanged: Signal0 by signal()

  val fileRemoved: Signal1<String> by signal("file")

  val filesMoved: Signal2<String, String> by signal("old_file", "new_file")

  val folderMoved: Signal2<String, String> by signal("old_folder", "new_file")

  val folderRemoved: Signal1<String> by signal("folder")

  val inherit: Signal1<String> by signal("file")

  val instance: Signal1<PoolStringArray> by signal("files")

  internal constructor() : this(null)

  open fun _bw_history() {
  }

  open fun _duplicate_operation_confirm() {
  }

  open fun _feature_profile_changed() {
  }

  open fun _file_list_activate_file(arg0: Long) {
  }

  open fun _file_list_gui_input(arg0: InputEvent) {
  }

  open fun _file_list_rmb_option(option: Long) {
  }

  open fun _file_list_rmb_pressed(arg0: Vector2) {
  }

  open fun _file_list_rmb_select(arg0: Long, arg1: Vector2) {
  }

  open fun _file_list_thumbnail_done(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Variant
  ) {
  }

  open fun _file_multi_selected(arg0: Long, arg1: Boolean) {
  }

  open fun _file_removed(arg0: String) {
  }

  open fun _folder_removed(arg0: String) {
  }

  open fun _fs_changed() {
  }

  open fun _fw_history() {
  }

  open fun _make_dir_confirm() {
  }

  open fun _make_scene_confirm() {
  }

  open fun _move_operation_confirm(toPath: String, overwrite: Boolean = false) {
  }

  open fun _move_with_overwrite() {
  }

  open fun _navigate_to_path(arg0: String, arg1: Boolean = false) {
  }

  open fun _preview_invalidated(arg0: String) {
  }

  open fun _rename_operation_confirm() {
  }

  open fun _rescan() {
  }

  open fun _resource_created() {
  }

  open fun _search_changed(arg0: String, arg1: Control) {
  }

  open fun _select_file(arg0: String, arg1: Boolean) {
  }

  open fun _toggle_file_display() {
  }

  open fun _toggle_split_mode(arg0: Boolean) {
  }

  open fun _tree_activate_file() {
  }

  open fun _tree_empty_selected() {
  }

  open fun _tree_gui_input(arg0: InputEvent) {
  }

  open fun _tree_multi_selected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ) {
  }

  open fun _tree_rmb_empty(arg0: Vector2) {
  }

  open fun _tree_rmb_option(option: Long) {
  }

  open fun _tree_rmb_select(arg0: Vector2) {
  }

  open fun _tree_thumbnail_done(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Variant
  ) {
  }

  open fun _update_import_dock() {
  }

  open fun _update_tree(
    arg0: PoolStringArray,
    arg1: Boolean,
    arg2: Boolean,
    arg3: Boolean
  ) {
  }

  open fun canDropDataFw(
    arg0: Vector2,
    arg1: Variant,
    arg2: Control
  ): Boolean {
    val mb = getMethodBind("FileSystemDock","can_drop_data_fw")
    return _icall_Boolean_Vector2_Variant_Object( mb, this.ptr, arg0, arg1, arg2)
  }

  open fun dropDataFw(
    arg0: Vector2,
    arg1: Variant,
    arg2: Control
  ) {
    val mb = getMethodBind("FileSystemDock","drop_data_fw")
    _icall_Unit_Vector2_Variant_Object( mb, this.ptr, arg0, arg1, arg2)
  }

  open fun getDragDataFw(arg0: Vector2, arg1: Control): Variant {
    val mb = getMethodBind("FileSystemDock","get_drag_data_fw")
    return _icall_Variant_Vector2_Object( mb, this.ptr, arg0, arg1)
  }

  open fun navigateToPath(arg0: String) {
    val mb = getMethodBind("FileSystemDock","navigate_to_path")
    _icall_Unit_String( mb, this.ptr, arg0)
  }
}
