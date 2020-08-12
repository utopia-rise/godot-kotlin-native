// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class ScriptEditor internal constructor() : PanelContainer() {
  val editorScriptChanged: Signal1<Script> by signal("script")

  val scriptClose: Signal1<Script> by signal("script")

  open fun _addCallback(
    arg0: Object,
    arg1: String,
    arg2: PoolStringArray
  ) {
  }

  open fun _autosaveScripts() {
  }

  open fun _breaked(arg0: Boolean, arg1: Boolean) {
  }

  open fun _clearExecution(arg0: Reference) {
  }

  open fun _closeAllTabs() {
  }

  open fun _closeCurrentTab() {
  }

  open fun _closeDiscardCurrentTab(arg0: String) {
  }

  open fun _closeDocsTab() {
  }

  open fun _closeOtherTabs() {
  }

  open fun _copyScriptPath() {
  }

  open fun _editorPause() {
  }

  open fun _editorPlay() {
  }

  open fun _editorSettingsChanged() {
  }

  open fun _editorStop() {
  }

  open fun _fileDialogAction(arg0: String) {
  }

  open fun _filterMethodsTextChanged(arg0: String) {
  }

  open fun _filterScriptsTextChanged(arg0: String) {
  }

  open fun _getDebugTooltip(arg0: String, arg1: Node): String {
    throw NotImplementedError("_get_debug_tooltip is not implemented for ScriptEditor")
  }

  open fun _gotoScriptLine(arg0: Reference, arg1: Long) {
  }

  open fun _gotoScriptLine2(arg0: Long) {
  }

  open fun _helpClassGoto(arg0: String) {
  }

  open fun _helpClassOpen(arg0: String) {
  }

  open fun _helpOverviewSelected(arg0: Long) {
  }

  open fun _helpSearch(arg0: String) {
  }

  open fun _historyBack() {
  }

  open fun _historyForward() {
  }

  open fun _liveAutoReloadRunningScripts() {
  }

  open fun _membersOverviewSelected(arg0: Long) {
  }

  open fun _menuOption(arg0: Long) {
  }

  open fun _onFindInFilesModifiedFiles(arg0: PoolStringArray) {
  }

  open fun _onFindInFilesRequested(arg0: String) {
  }

  open fun _onFindInFilesResultSelected(
    arg0: String,
    arg1: Long,
    arg2: Long,
    arg3: Long
  ) {
  }

  open fun _openRecentScript(arg0: Long) {
  }

  open fun _reloadScripts() {
  }

  open fun _requestHelp(arg0: String) {
  }

  open fun _resSavedCallback(arg0: Resource) {
  }

  open fun _resaveScripts(arg0: String) {
  }

  open fun _saveHistory() {
  }

  open fun _scriptChanged() {
  }

  open fun _scriptCreated(arg0: Script) {
  }

  open fun _scriptListGuiInput(arg0: InputEvent) {
  }

  open fun _scriptSelected(arg0: Long) {
  }

  open fun _scriptSplitDragged(arg0: Double) {
  }

  open fun _setExecution(arg0: Reference, arg1: Long) {
  }

  open fun _showDebugger(arg0: Boolean) {
  }

  open fun _startFindInFiles(arg0: Boolean) {
  }

  open fun _tabChanged(arg0: Long) {
  }

  open fun _themeOption(arg0: Long) {
  }

  open fun _toggleMembersOverviewAlphaSort(arg0: Boolean) {
  }

  open fun _treeChanged() {
  }

  override fun _unhandledInput(arg0: InputEvent) {
  }

  open fun _updateAutosaveTimer() {
  }

  open fun _updateMembersOverview() {
  }

  open fun _updateRecentScripts() {
  }

  open fun _updateScriptConnections() {
  }

  open fun _updateScriptNames() {
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
}
