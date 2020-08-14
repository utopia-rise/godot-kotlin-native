// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.EditorFileDialog
import godot.core.PoolStringArray
import godot.core.Signal1
import godot.core.Variant
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VBoxContainer
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class EditorFileDialog internal constructor() : ConfirmationDialog() {
  val dirSelected: Signal1<String> by signal("dir")

  val fileSelected: Signal1<String> by signal("path")

  val filesSelected: Signal1<PoolStringArray> by signal("paths")

  open var access: Long
    get() {
      val mb = getMethodBind("EditorFileDialog","get_access")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_access")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var currentDir: String
    get() {
      val mb = getMethodBind("EditorFileDialog","get_current_dir")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_current_dir")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var currentFile: String
    get() {
      val mb = getMethodBind("EditorFileDialog","get_current_file")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_current_file")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var currentPath: String
    get() {
      val mb = getMethodBind("EditorFileDialog","get_current_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_current_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var disableOverwriteWarning: Boolean
    get() {
      val mb = getMethodBind("EditorFileDialog","is_overwrite_warning_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_disable_overwrite_warning")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var displayMode: Long
    get() {
      val mb = getMethodBind("EditorFileDialog","get_display_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_display_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("EditorFileDialog","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var showHiddenFiles: Boolean
    get() {
      val mb = getMethodBind("EditorFileDialog","is_showing_hidden_files")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorFileDialog","set_show_hidden_files")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open fun _actionPressed() {
  }

  open fun _cancelPressed() {
  }

  open fun _dirEntered(arg0: String) {
  }

  open fun _favoriteMoveDown() {
  }

  open fun _favoriteMoveUp() {
  }

  open fun _favoritePressed() {
  }

  open fun _favoriteSelected(arg0: Long) {
  }

  open fun _fileEntered(arg0: String) {
  }

  open fun _filterSelected(arg0: Long) {
  }

  open fun _goBack() {
  }

  open fun _goForward() {
  }

  open fun _goUp() {
  }

  open fun _itemDbSelected(arg0: Long) {
  }

  open fun _itemListItemRmbSelected(arg0: Long, arg1: Vector2) {
  }

  open fun _itemListRmbClicked(arg0: Vector2) {
  }

  open fun _itemMenuIdPressed(arg0: Long) {
  }

  open fun _itemSelected(arg0: Long) {
  }

  open fun _itemsClearSelection() {
  }

  open fun _makeDir() {
  }

  open fun _makeDirConfirm() {
  }

  open fun _multiSelected(arg0: Long, arg1: Boolean) {
  }

  open fun _recentSelected(arg0: Long) {
  }

  open fun _saveConfirmPressed() {
  }

  open fun _selectDrive(arg0: Long) {
  }

  open fun _thumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Variant
  ) {
  }

  open fun _thumbnailResult(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Variant
  ) {
  }

  override fun _unhandledInput(arg0: InputEvent) {
  }

  open fun _updateDir() {
  }

  open fun _updateFileList() {
  }

  open fun _updateFileName() {
  }

  open fun addFilter(filter: String) {
    val mb = getMethodBind("EditorFileDialog","add_filter")
    _icall_Unit_String( mb, this.ptr, filter)
  }

  open fun clearFilters() {
    val mb = getMethodBind("EditorFileDialog","clear_filters")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAccess(): EditorFileDialog.Access {
    val mb = getMethodBind("EditorFileDialog","get_access")
    return EditorFileDialog.Access.from( _icall_Long( mb, this.ptr))
  }

  open fun getCurrentDir(): String {
    val mb = getMethodBind("EditorFileDialog","get_current_dir")
    return _icall_String( mb, this.ptr)
  }

  open fun getCurrentFile(): String {
    val mb = getMethodBind("EditorFileDialog","get_current_file")
    return _icall_String( mb, this.ptr)
  }

  open fun getCurrentPath(): String {
    val mb = getMethodBind("EditorFileDialog","get_current_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getDisplayMode(): EditorFileDialog.DisplayMode {
    val mb = getMethodBind("EditorFileDialog","get_display_mode")
    return EditorFileDialog.DisplayMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getMode(): EditorFileDialog.Mode {
    val mb = getMethodBind("EditorFileDialog","get_mode")
    return EditorFileDialog.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getVbox(): VBoxContainer {
    val mb = getMethodBind("EditorFileDialog","get_vbox")
    return _icall_VBoxContainer( mb, this.ptr)
  }

  open fun invalidate() {
    val mb = getMethodBind("EditorFileDialog","invalidate")
    _icall_Unit( mb, this.ptr)
  }

  open fun isOverwriteWarningDisabled(): Boolean {
    val mb = getMethodBind("EditorFileDialog","is_overwrite_warning_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShowingHiddenFiles(): Boolean {
    val mb = getMethodBind("EditorFileDialog","is_showing_hidden_files")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAccess(access: Long) {
    val mb = getMethodBind("EditorFileDialog","set_access")
    _icall_Unit_Long( mb, this.ptr, access)
  }

  open fun setCurrentDir(dir: String) {
    val mb = getMethodBind("EditorFileDialog","set_current_dir")
    _icall_Unit_String( mb, this.ptr, dir)
  }

  open fun setCurrentFile(file: String) {
    val mb = getMethodBind("EditorFileDialog","set_current_file")
    _icall_Unit_String( mb, this.ptr, file)
  }

  open fun setCurrentPath(path: String) {
    val mb = getMethodBind("EditorFileDialog","set_current_path")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun setDisableOverwriteWarning(disable: Boolean) {
    val mb = getMethodBind("EditorFileDialog","set_disable_overwrite_warning")
    _icall_Unit_Boolean( mb, this.ptr, disable)
  }

  open fun setDisplayMode(mode: Long) {
    val mb = getMethodBind("EditorFileDialog","set_display_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("EditorFileDialog","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setShowHiddenFiles(show: Boolean) {
    val mb = getMethodBind("EditorFileDialog","set_show_hidden_files")
    _icall_Unit_Boolean( mb, this.ptr, show)
  }

  enum class DisplayMode(
    id: Long
  ) {
    DISPLAY_THUMBNAILS(0),

    DISPLAY_LIST(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Mode(
    id: Long
  ) {
    MODE_OPEN_FILE(0),

    MODE_OPEN_FILES(1),

    MODE_OPEN_DIR(2),

    MODE_OPEN_ANY(3),

    MODE_SAVE_FILE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Access(
    id: Long
  ) {
    ACCESS_RESOURCES(0),

    ACCESS_USERDATA(1),

    ACCESS_FILESYSTEM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
