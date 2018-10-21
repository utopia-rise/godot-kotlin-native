@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class FileDialog : ConfirmationDialog {
    constructor() : super("FileDialog")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Long) {
        MODE_OPEN_FILE(0),
        MODE_OPEN_FILES(1),
        MODE_OPEN_DIR(2),
        MODE_OPEN_ANY(3),
        MODE_SAVE_FILE(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Access(val id: Long) {
        ACCESS_RESOURCES(0),
        ACCESS_USERDATA(1),
        ACCESS_FILESYSTEM(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
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
        infix fun from(other: ConfirmationDialog): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AcceptDialog): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: WindowDialog): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Popup): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): FileDialog = FileDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): FileDialog = fromVariant(FileDialog(""), other)


        // Constants
        const val MODE_OPEN_FILE: Long = 0
        const val MODE_OPEN_FILES: Long = 1
        const val MODE_OPEN_DIR: Long = 2
        const val MODE_OPEN_ANY: Long = 3
        const val MODE_SAVE_FILE: Long = 4
        const val ACCESS_RESOURCES: Long = 0
        const val ACCESS_USERDATA: Long = 1
        const val ACCESS_FILESYSTEM: Long = 2


    }


    // Properties
    open var modeOverridesTitle: Boolean
        get() = _icall_Boolean(isModeOverridingTitleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setModeOverridesTitleMethodBind, this.rawMemory, value)


    open var mode: Long
        get() = _icall_Long(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setModeMethodBind, this.rawMemory, value)


    open var access: Long
        get() = _icall_Long(getAccessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setAccessMethodBind, this.rawMemory, value)


    open var filters: PoolStringArray
        get() = _icall_PoolStringArray(getFiltersMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolStringArray(setFiltersMethodBind, this.rawMemory, value)


    open var showHiddenFiles: Boolean
        get() = _icall_Boolean(isShowingHiddenFilesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShowHiddenFilesMethodBind, this.rawMemory, value)


    open var currentDir: String
        get() = _icall_String(getCurrentDirMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentDirMethodBind, this.rawMemory, value)


    open var currentFile: String
        get() = _icall_String(getCurrentFileMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentFileMethodBind, this.rawMemory, value)


    open var currentPath: String
        get() = _icall_String(getCurrentPathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCurrentPathMethodBind, this.rawMemory, value)




    // Methods
    override fun _unhandled_input(arg0: InputEvent) {
    }


    open fun _tree_selected() {
    }


    open fun _tree_item_activated() {
    }


    open fun _dir_entered(arg0: String) {
    }


    open fun _file_entered(arg0: String) {
    }


    open fun _action_pressed() {
    }


    open fun _cancel_pressed() {
    }


    open fun _filter_selected(arg0: Long) {
    }


    open fun _save_confirm_pressed() {
    }


    private val clearFiltersMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "clear_filters") }
    open fun clearFilters() {
        _icall_Unit(clearFiltersMethodBind, this.rawMemory)
    }


    private val addFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "add_filter") }
    open fun addFilter(filter: String) {
        _icall_Unit_String(addFilterMethodBind, this.rawMemory, filter)
    }


    private val setFiltersMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_filters") }
    open fun setFilters(filters: PoolStringArray) {
        _icall_Unit_PoolStringArray(setFiltersMethodBind, this.rawMemory, filters)
    }


    private val getFiltersMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_filters") }
    open fun getFilters(): PoolStringArray {
        return _icall_PoolStringArray(getFiltersMethodBind, this.rawMemory)
    }


    private val getCurrentDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_current_dir") }
    open fun getCurrentDir(): String {
        return _icall_String(getCurrentDirMethodBind, this.rawMemory)
    }


    private val getCurrentFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_current_file") }
    open fun getCurrentFile(): String {
        return _icall_String(getCurrentFileMethodBind, this.rawMemory)
    }


    private val getCurrentPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_current_path") }
    open fun getCurrentPath(): String {
        return _icall_String(getCurrentPathMethodBind, this.rawMemory)
    }


    private val setCurrentDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_current_dir") }
    open fun setCurrentDir(dir: String) {
        _icall_Unit_String(setCurrentDirMethodBind, this.rawMemory, dir)
    }


    private val setCurrentFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_current_file") }
    open fun setCurrentFile(file: String) {
        _icall_Unit_String(setCurrentFileMethodBind, this.rawMemory, file)
    }


    private val setCurrentPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_current_path") }
    open fun setCurrentPath(path: String) {
        _icall_Unit_String(setCurrentPathMethodBind, this.rawMemory, path)
    }


    private val setModeOverridesTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_mode_overrides_title") }
    open fun setModeOverridesTitle(override: Boolean) {
        _icall_Unit_Boolean(setModeOverridesTitleMethodBind, this.rawMemory, override)
    }


    private val isModeOverridingTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "is_mode_overriding_title") }
    open fun isModeOverridingTitle(): Boolean {
        return _icall_Boolean(isModeOverridingTitleMethodBind, this.rawMemory)
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_mode") }
    open fun setMode(mode: Long) {
        _icall_Unit_Long(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_mode") }
    open fun getMode(): FileDialog.Mode {
        return FileDialog.Mode.fromInt(_icall_Long(getModeMethodBind, this.rawMemory))
    }


    private val getVboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_vbox") }
    open fun getVbox(): VBoxContainer {
        return _icall_VBoxContainer(getVboxMethodBind, this.rawMemory)
    }


    private val getLineEditMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_line_edit") }
    open fun getLineEdit(): LineEdit {
        return _icall_LineEdit(getLineEditMethodBind, this.rawMemory)
    }


    private val setAccessMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_access") }
    open fun setAccess(access: Long) {
        _icall_Unit_Long(setAccessMethodBind, this.rawMemory, access)
    }


    private val getAccessMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "get_access") }
    open fun getAccess(): FileDialog.Access {
        return FileDialog.Access.fromInt(_icall_Long(getAccessMethodBind, this.rawMemory))
    }


    private val setShowHiddenFilesMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "set_show_hidden_files") }
    open fun setShowHiddenFiles(show: Boolean) {
        _icall_Unit_Boolean(setShowHiddenFilesMethodBind, this.rawMemory, show)
    }


    private val isShowingHiddenFilesMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "is_showing_hidden_files") }
    open fun isShowingHiddenFiles(): Boolean {
        return _icall_Boolean(isShowingHiddenFilesMethodBind, this.rawMemory)
    }


    open fun _select_drive(arg0: Long) {
    }


    open fun _make_dir() {
    }


    open fun _make_dir_confirm() {
    }


    open fun _update_file_list() {
    }


    open fun _update_dir() {
    }


    open fun _go_up() {
    }


    private val deselectItemsMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "deselect_items") }
    open fun deselectItems() {
        _icall_Unit(deselectItemsMethodBind, this.rawMemory)
    }


    private val invalidateMethodBind: CPointer<godot_method_bind> by lazy { getMB("FileDialog", "invalidate") }
    open fun invalidate() {
        _icall_Unit(invalidateMethodBind, this.rawMemory)
    }


}
