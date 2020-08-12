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

  open fun _bwHistory() {
  }

  open fun _duplicateOperationConfirm() {
  }

  open fun _featureProfileChanged() {
  }

  open fun _fileListActivateFile(arg0: Long) {
  }

  open fun _fileListGuiInput(arg0: InputEvent) {
  }

  open fun _fileListRmbOption(option: Long) {
  }

  open fun _fileListRmbPressed(arg0: Vector2) {
  }

  open fun _fileListRmbSelect(arg0: Long, arg1: Vector2) {
  }

  open fun _fileListThumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Variant
  ) {
  }

  open fun _fileMultiSelected(arg0: Long, arg1: Boolean) {
  }

  open fun _fileRemoved(arg0: String) {
  }

  open fun _folderRemoved(arg0: String) {
  }

  open fun _fsChanged() {
  }

  open fun _fwHistory() {
  }

  open fun _makeDirConfirm() {
  }

  open fun _makeSceneConfirm() {
  }

  open fun _moveOperationConfirm(toPath: String, overwrite: Boolean = false) {
  }

  open fun _moveWithOverwrite() {
  }

  open fun _navigateToPath(arg0: String, arg1: Boolean = false) {
  }

  open fun _previewInvalidated(arg0: String) {
  }

  open fun _renameOperationConfirm() {
  }

  open fun _rescan() {
  }

  open fun _resourceCreated() {
  }

  open fun _searchChanged(arg0: String, arg1: Control) {
  }

  open fun _selectFile(arg0: String, arg1: Boolean) {
  }

  open fun _toggleFileDisplay() {
  }

  open fun _toggleSplitMode(arg0: Boolean) {
  }

  open fun _treeActivateFile() {
  }

  open fun _treeEmptySelected() {
  }

  open fun _treeGuiInput(arg0: InputEvent) {
  }

  open fun _treeMultiSelected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ) {
  }

  open fun _treeRmbEmpty(arg0: Vector2) {
  }

  open fun _treeRmbOption(option: Long) {
  }

  open fun _treeRmbSelect(arg0: Vector2) {
  }

  open fun _treeThumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Variant
  ) {
  }

  open fun _updateImportDock() {
  }

  open fun _updateTree(
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
