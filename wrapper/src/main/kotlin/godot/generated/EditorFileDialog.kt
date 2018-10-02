@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorFileDialog : ConfirmationDialog {
    constructor() : super("EditorFileDialog")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DisplayMode(val id: Int) {
        DISPLAY_THUMBNAILS(0),
        DISPLAY_LIST(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Mode(val id: Int) {
        MODE_OPEN_FILE(0),
        MODE_OPEN_FILES(1),
        MODE_OPEN_DIR(2),
        MODE_OPEN_ANY(3),
        MODE_SAVE_FILE(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Access(val id: Int) {
        ACCESS_RESOURCES(0),
        ACCESS_USERDATA(1),
        ACCESS_FILESYSTEM(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val FILES_SELECTED: String = "files_selected"
            const val DIR_SELECTED: String = "dir_selected"
            const val FILE_SELECTED: String = "file_selected"
        }
    }


    companion object {
        infix fun from(other: ConfirmationDialog): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AcceptDialog): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: WindowDialog): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Popup): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorFileDialog = EditorFileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorFileDialog = fromVariant(EditorFileDialog(""), other)


        // Constants
        const val MODE_OPEN_FILE: Int = 0
        const val MODE_OPEN_FILES: Int = 1
        const val MODE_OPEN_DIR: Int = 2
        const val MODE_OPEN_ANY: Int = 3
        const val MODE_SAVE_FILE: Int = 4
        const val ACCESS_RESOURCES: Int = 0
        const val ACCESS_USERDATA: Int = 1
        const val ACCESS_FILESYSTEM: Int = 2
        const val DISPLAY_THUMBNAILS: Int = 0
        const val DISPLAY_LIST: Int = 1


    }


    // Properties
    open var access: Int
        get() = _icall_Int(getAccessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAccessMethodBind, this.rawMemory, value)


    open var displayMode: Int
        get() = _icall_Int(getDisplayModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDisplayModeMethodBind, this.rawMemory, value)


    open var mode: Int
        get() = _icall_Int(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setModeMethodBind, this.rawMemory, value)


    open var currentDir: String
        get() = _icall_String(getCurrentDirMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentDirMethodBind, this.rawMemory, value)


    open var currentFile: String
        get() = _icall_String(getCurrentFileMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentFileMethodBind, this.rawMemory, value)


    open var currentPath: String
        get() = _icall_String(getCurrentPathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentPathMethodBind, this.rawMemory, value)


    open var showHiddenFiles: Boolean
        get() = _icall_Boolean(isShowingHiddenFilesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShowHiddenFilesMethodBind, this.rawMemory, value)


    open var disableOverwriteWarning: Boolean
        get() = _icall_Boolean(isOverwriteWarningDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisableOverwriteWarningMethodBind, this.rawMemory, value)




    // Methods
    override fun _unhandled_input(arg0: InputEvent) {
    }


    open fun _item_selected(arg0: Int) {
    }


    open fun _multi_selected(arg0: Int, arg1: Boolean) {
    }


    open fun _items_clear_selection() {
    }


    open fun _item_list_item_rmb_selected(arg0: Int, arg1: Vector2) {
    }


    open fun _item_list_rmb_clicked(arg0: Vector2) {
    }


    open fun _item_menu_id_pressed(arg0: Int) {
    }


    open fun _item_db_selected(arg0: Int) {
    }


    open fun _dir_entered(arg0: String) {
    }


    open fun _file_entered(arg0: String) {
    }


    open fun _action_pressed() {
    }


    open fun _cancel_pressed() {
    }


    open fun _filter_selected(arg0: Int) {
    }


    open fun _save_confirm_pressed() {
    }


    private val clearFiltersMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "clear_filters") }
    open fun clearFilters() {
        _icall_Unit(clearFiltersMethodBind, this.rawMemory)
    }


    private val addFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "add_filter") }
    open fun addFilter(filter: String) {
        _icall_Unit_String(addFilterMethodBind, this.rawMemory, filter)
    }


    private val getCurrentDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_current_dir") }
    open fun getCurrentDir(): String {
        return _icall_String(getCurrentDirMethodBind, this.rawMemory)
    }


    private val getCurrentFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_current_file") }
    open fun getCurrentFile(): String {
        return _icall_String(getCurrentFileMethodBind, this.rawMemory)
    }


    private val getCurrentPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_current_path") }
    open fun getCurrentPath(): String {
        return _icall_String(getCurrentPathMethodBind, this.rawMemory)
    }


    private val setCurrentDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_current_dir") }
    open fun setCurrentDir(dir: String) {
        _icall_Unit_String(setCurrentDirMethodBind, this.rawMemory, dir)
    }


    private val setCurrentFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_current_file") }
    open fun setCurrentFile(file: String) {
        _icall_Unit_String(setCurrentFileMethodBind, this.rawMemory, file)
    }


    private val setCurrentPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_current_path") }
    open fun setCurrentPath(path: String) {
        _icall_Unit_String(setCurrentPathMethodBind, this.rawMemory, path)
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_mode") }
    open fun getMode(): EditorFileDialog.Mode {
        return EditorFileDialog.Mode.fromInt(_icall_Int(getModeMethodBind, this.rawMemory))
    }


    private val getVboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_vbox") }
    open fun getVbox(): VBoxContainer {
        return _icall_VBoxContainer(getVboxMethodBind, this.rawMemory)
    }


    private val setAccessMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_access") }
    open fun setAccess(access: Int) {
        _icall_Unit_Int(setAccessMethodBind, this.rawMemory, access)
    }


    private val getAccessMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_access") }
    open fun getAccess(): EditorFileDialog.Access {
        return EditorFileDialog.Access.fromInt(_icall_Int(getAccessMethodBind, this.rawMemory))
    }


    private val setShowHiddenFilesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_show_hidden_files") }
    open fun setShowHiddenFiles(show: Boolean) {
        _icall_Unit_Boolean(setShowHiddenFilesMethodBind, this.rawMemory, show)
    }


    private val isShowingHiddenFilesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "is_showing_hidden_files") }
    open fun isShowingHiddenFiles(): Boolean {
        return _icall_Boolean(isShowingHiddenFilesMethodBind, this.rawMemory)
    }


    open fun _select_drive(arg0: Int) {
    }


    open fun _make_dir() {
    }


    open fun _make_dir_confirm() {
    }


    open fun _update_file_list() {
    }


    open fun _update_dir() {
    }


    open fun _thumbnail_done(arg0: String, arg1: Texture, arg2: Variant) {
    }


    private val setDisplayModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_display_mode") }
    open fun setDisplayMode(mode: Int) {
        _icall_Unit_Int(setDisplayModeMethodBind, this.rawMemory, mode)
    }


    private val getDisplayModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "get_display_mode") }
    open fun getDisplayMode(): EditorFileDialog.DisplayMode {
        return EditorFileDialog.DisplayMode.fromInt(_icall_Int(getDisplayModeMethodBind, this.rawMemory))
    }


    open fun _thumbnail_result(arg0: String, arg1: Texture, arg2: Variant) {
    }


    private val setDisableOverwriteWarningMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "set_disable_overwrite_warning") }
    open fun setDisableOverwriteWarning(disable: Boolean) {
        _icall_Unit_Boolean(setDisableOverwriteWarningMethodBind, this.rawMemory, disable)
    }


    private val isOverwriteWarningDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "is_overwrite_warning_disabled") }
    open fun isOverwriteWarningDisabled(): Boolean {
        return _icall_Boolean(isOverwriteWarningDisabledMethodBind, this.rawMemory)
    }


    open fun _recent_selected(arg0: Int) {
    }


    open fun _go_back() {
    }


    open fun _go_forward() {
    }


    open fun _go_up() {
    }


    open fun _favorite_toggled(arg0: Boolean) {
    }


    open fun _favorite_selected(arg0: Int) {
    }


    open fun _favorite_move_up() {
    }


    open fun _favorite_move_down() {
    }


    private val invalidateMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorFileDialog", "invalidate") }
    open fun invalidate() {
        _icall_Unit(invalidateMethodBind, this.rawMemory)
    }


}
