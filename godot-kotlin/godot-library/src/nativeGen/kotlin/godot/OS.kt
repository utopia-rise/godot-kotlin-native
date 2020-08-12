// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.OS
import godot.core.Dictionary
import godot.core.Godot
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Dictionary_Boolean
import godot.icalls._icall_Dictionary_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Dictionary
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_Double_String_String
import godot.icalls._icall_Long_String_PoolStringArray_Boolean_VariantArray_Boolean
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_Rect2
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolStringArray
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Variant_Variant
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.requireNotNull
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object OS : Object() {
  var clipboard: String
    get() {
      val mb = getMethodBind("_OS","get_clipboard")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_clipboard")
      _icall_Unit_String(mb, this.ptr, value)
    }

  var currentScreen: Long
    get() {
      val mb = getMethodBind("_OS","get_current_screen")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_current_screen")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var exitCode: Long
    get() {
      val mb = getMethodBind("_OS","get_exit_code")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_exit_code")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var keepScreenOn: Boolean
    get() {
      val mb = getMethodBind("_OS","is_keep_screen_on")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_keep_screen_on")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var lowProcessorUsageMode: Boolean
    get() {
      val mb = getMethodBind("_OS","is_in_low_processor_usage_mode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_low_processor_usage_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var lowProcessorUsageModeSleepUsec: Long
    get() {
      val mb = getMethodBind("_OS","get_low_processor_usage_mode_sleep_usec")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_low_processor_usage_mode_sleep_usec")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var maxWindowSize: Vector2
    get() {
      val mb = getMethodBind("_OS","get_max_window_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_max_window_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  var minWindowSize: Vector2
    get() {
      val mb = getMethodBind("_OS","get_min_window_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_min_window_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  var screenOrientation: Long
    get() {
      val mb = getMethodBind("_OS","get_screen_orientation")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_screen_orientation")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var tabletDriver: String
    get() {
      val mb = getMethodBind("_OS","get_current_tablet_driver")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_current_tablet_driver")
      _icall_Unit_String(mb, this.ptr, value)
    }

  var vsyncEnabled: Boolean
    get() {
      val mb = getMethodBind("_OS","is_vsync_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_use_vsync")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var vsyncViaCompositor: Boolean
    get() {
      val mb = getMethodBind("_OS","is_vsync_via_compositor_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_vsync_via_compositor")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowBorderless: Boolean
    get() {
      val mb = getMethodBind("_OS","get_borderless_window")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_borderless_window")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowFullscreen: Boolean
    get() {
      val mb = getMethodBind("_OS","is_window_fullscreen")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_fullscreen")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowMaximized: Boolean
    get() {
      val mb = getMethodBind("_OS","is_window_maximized")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_maximized")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowMinimized: Boolean
    get() {
      val mb = getMethodBind("_OS","is_window_minimized")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_minimized")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowPerPixelTransparencyEnabled: Boolean
    get() {
      val mb = getMethodBind("_OS","get_window_per_pixel_transparency_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_per_pixel_transparency_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowPosition: Vector2
    get() {
      val mb = getMethodBind("_OS","get_window_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  var windowResizable: Boolean
    get() {
      val mb = getMethodBind("_OS","is_window_resizable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_resizable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var windowSize: Vector2
    get() {
      val mb = getMethodBind("_OS","get_window_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_OS","set_window_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = memScoped {
      val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("OS".cstr.ptr)
      requireNotNull(ptr) { "No instance found for singleton OS" }
      ptr
  }

  fun maxWindowSize(schedule: Vector2.() -> Unit): Vector2 = maxWindowSize.apply{
      schedule(this)
      maxWindowSize = this
  }


  fun minWindowSize(schedule: Vector2.() -> Unit): Vector2 = minWindowSize.apply{
      schedule(this)
      minWindowSize = this
  }


  fun windowPosition(schedule: Vector2.() -> Unit): Vector2 = windowPosition.apply{
      schedule(this)
      windowPosition = this
  }


  fun windowSize(schedule: Vector2.() -> Unit): Vector2 = windowSize.apply{
      schedule(this)
      windowSize = this
  }


  fun alert(text: String, title: String = "Alert!") {
    val mb = getMethodBind("_OS","alert")
    _icall_Unit_String_String( mb, this.ptr, text, title)
  }

  fun canDraw(): Boolean {
    val mb = getMethodBind("_OS","can_draw")
    return _icall_Boolean( mb, this.ptr)
  }

  fun canUseThreads(): Boolean {
    val mb = getMethodBind("_OS","can_use_threads")
    return _icall_Boolean( mb, this.ptr)
  }

  fun centerWindow() {
    val mb = getMethodBind("_OS","center_window")
    _icall_Unit( mb, this.ptr)
  }

  fun closeMidiInputs() {
    val mb = getMethodBind("_OS","close_midi_inputs")
    _icall_Unit( mb, this.ptr)
  }

  fun delayMsec(msec: Long) {
    val mb = getMethodBind("_OS","delay_msec")
    _icall_Unit_Long( mb, this.ptr, msec)
  }

  fun delayUsec(usec: Long) {
    val mb = getMethodBind("_OS","delay_usec")
    _icall_Unit_Long( mb, this.ptr, usec)
  }

  fun dumpMemoryToFile(file: String) {
    val mb = getMethodBind("_OS","dump_memory_to_file")
    _icall_Unit_String( mb, this.ptr, file)
  }

  fun dumpResourcesToFile(file: String) {
    val mb = getMethodBind("_OS","dump_resources_to_file")
    _icall_Unit_String( mb, this.ptr, file)
  }

  fun execute(
    path: String,
    arguments: PoolStringArray,
    blocking: Boolean = true,
    output: VariantArray = VariantArray(),
    readStderr: Boolean = false
  ): Long {
    val mb = getMethodBind("_OS","execute")
    return _icall_Long_String_PoolStringArray_Boolean_VariantArray_Boolean( mb, this.ptr, path,
        arguments, blocking, output, readStderr)
  }

  fun findScancodeFromString(string: String): Long {
    val mb = getMethodBind("_OS","find_scancode_from_string")
    return _icall_Long_String( mb, this.ptr, string)
  }

  fun getAudioDriverCount(): Long {
    val mb = getMethodBind("_OS","get_audio_driver_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getAudioDriverName(driver: Long): String {
    val mb = getMethodBind("_OS","get_audio_driver_name")
    return _icall_String_Long( mb, this.ptr, driver)
  }

  fun getBorderlessWindow(): Boolean {
    val mb = getMethodBind("_OS","get_borderless_window")
    return _icall_Boolean( mb, this.ptr)
  }

  fun getClipboard(): String {
    val mb = getMethodBind("_OS","get_clipboard")
    return _icall_String( mb, this.ptr)
  }

  fun getCmdlineArgs(): PoolStringArray {
    val mb = getMethodBind("_OS","get_cmdline_args")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  fun getConnectedMidiInputs(): PoolStringArray {
    val mb = getMethodBind("_OS","get_connected_midi_inputs")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  fun getCurrentScreen(): Long {
    val mb = getMethodBind("_OS","get_current_screen")
    return _icall_Long( mb, this.ptr)
  }

  fun getCurrentTabletDriver(): String {
    val mb = getMethodBind("_OS","get_current_tablet_driver")
    return _icall_String( mb, this.ptr)
  }

  fun getCurrentVideoDriver(): OS.VideoDriver {
    val mb = getMethodBind("_OS","get_current_video_driver")
    return OS.VideoDriver.from( _icall_Long( mb, this.ptr))
  }

  fun getDate(utc: Boolean = false): Dictionary {
    val mb = getMethodBind("_OS","get_date")
    return _icall_Dictionary_Boolean( mb, this.ptr, utc)
  }

  fun getDatetime(utc: Boolean = false): Dictionary {
    val mb = getMethodBind("_OS","get_datetime")
    return _icall_Dictionary_Boolean( mb, this.ptr, utc)
  }

  fun getDatetimeFromUnixTime(unixTimeVal: Long): Dictionary {
    val mb = getMethodBind("_OS","get_datetime_from_unix_time")
    return _icall_Dictionary_Long( mb, this.ptr, unixTimeVal)
  }

  fun getDynamicMemoryUsage(): Long {
    val mb = getMethodBind("_OS","get_dynamic_memory_usage")
    return _icall_Long( mb, this.ptr)
  }

  fun getEnvironment(environment: String): String {
    val mb = getMethodBind("_OS","get_environment")
    return _icall_String_String( mb, this.ptr, environment)
  }

  fun getExecutablePath(): String {
    val mb = getMethodBind("_OS","get_executable_path")
    return _icall_String( mb, this.ptr)
  }

  fun getExitCode(): Long {
    val mb = getMethodBind("_OS","get_exit_code")
    return _icall_Long( mb, this.ptr)
  }

  fun getGrantedPermissions(): PoolStringArray {
    val mb = getMethodBind("_OS","get_granted_permissions")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  fun getImeSelection(): Vector2 {
    val mb = getMethodBind("_OS","get_ime_selection")
    return _icall_Vector2( mb, this.ptr)
  }

  fun getImeText(): String {
    val mb = getMethodBind("_OS","get_ime_text")
    return _icall_String( mb, this.ptr)
  }

  fun getLatinKeyboardVariant(): String {
    val mb = getMethodBind("_OS","get_latin_keyboard_variant")
    return _icall_String( mb, this.ptr)
  }

  fun getLocale(): String {
    val mb = getMethodBind("_OS","get_locale")
    return _icall_String( mb, this.ptr)
  }

  fun getLowProcessorUsageModeSleepUsec(): Long {
    val mb = getMethodBind("_OS","get_low_processor_usage_mode_sleep_usec")
    return _icall_Long( mb, this.ptr)
  }

  fun getMaxWindowSize(): Vector2 {
    val mb = getMethodBind("_OS","get_max_window_size")
    return _icall_Vector2( mb, this.ptr)
  }

  fun getMinWindowSize(): Vector2 {
    val mb = getMethodBind("_OS","get_min_window_size")
    return _icall_Vector2( mb, this.ptr)
  }

  fun getModelName(): String {
    val mb = getMethodBind("_OS","get_model_name")
    return _icall_String( mb, this.ptr)
  }

  fun getName(): String {
    val mb = getMethodBind("_OS","get_name")
    return _icall_String( mb, this.ptr)
  }

  fun getPowerPercentLeft(): Long {
    val mb = getMethodBind("_OS","get_power_percent_left")
    return _icall_Long( mb, this.ptr)
  }

  fun getPowerSecondsLeft(): Long {
    val mb = getMethodBind("_OS","get_power_seconds_left")
    return _icall_Long( mb, this.ptr)
  }

  fun getPowerState(): OS.PowerState {
    val mb = getMethodBind("_OS","get_power_state")
    return OS.PowerState.from( _icall_Long( mb, this.ptr))
  }

  fun getProcessId(): Long {
    val mb = getMethodBind("_OS","get_process_id")
    return _icall_Long( mb, this.ptr)
  }

  fun getProcessorCount(): Long {
    val mb = getMethodBind("_OS","get_processor_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getRealWindowSize(): Vector2 {
    val mb = getMethodBind("_OS","get_real_window_size")
    return _icall_Vector2( mb, this.ptr)
  }

  fun getScancodeString(code: Long): String {
    val mb = getMethodBind("_OS","get_scancode_string")
    return _icall_String_Long( mb, this.ptr, code)
  }

  fun getScreenCount(): Long {
    val mb = getMethodBind("_OS","get_screen_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getScreenDpi(screen: Long = -1): Long {
    val mb = getMethodBind("_OS","get_screen_dpi")
    return _icall_Long_Long( mb, this.ptr, screen)
  }

  fun getScreenOrientation(): OS.ScreenOrientation {
    val mb = getMethodBind("_OS","get_screen_orientation")
    return OS.ScreenOrientation.from( _icall_Long( mb, this.ptr))
  }

  fun getScreenPosition(screen: Long = -1): Vector2 {
    val mb = getMethodBind("_OS","get_screen_position")
    return _icall_Vector2_Long( mb, this.ptr, screen)
  }

  fun getScreenSize(screen: Long = -1): Vector2 {
    val mb = getMethodBind("_OS","get_screen_size")
    return _icall_Vector2_Long( mb, this.ptr, screen)
  }

  fun getSplashTickMsec(): Long {
    val mb = getMethodBind("_OS","get_splash_tick_msec")
    return _icall_Long( mb, this.ptr)
  }

  fun getStaticMemoryPeakUsage(): Long {
    val mb = getMethodBind("_OS","get_static_memory_peak_usage")
    return _icall_Long( mb, this.ptr)
  }

  fun getStaticMemoryUsage(): Long {
    val mb = getMethodBind("_OS","get_static_memory_usage")
    return _icall_Long( mb, this.ptr)
  }

  fun getSystemDir(dir: Long): String {
    val mb = getMethodBind("_OS","get_system_dir")
    return _icall_String_Long( mb, this.ptr, dir)
  }

  fun getSystemTimeMsecs(): Long {
    val mb = getMethodBind("_OS","get_system_time_msecs")
    return _icall_Long( mb, this.ptr)
  }

  fun getSystemTimeSecs(): Long {
    val mb = getMethodBind("_OS","get_system_time_secs")
    return _icall_Long( mb, this.ptr)
  }

  fun getTabletDriverCount(): Long {
    val mb = getMethodBind("_OS","get_tablet_driver_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getTabletDriverName(idx: Long): String {
    val mb = getMethodBind("_OS","get_tablet_driver_name")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  fun getTicksMsec(): Long {
    val mb = getMethodBind("_OS","get_ticks_msec")
    return _icall_Long( mb, this.ptr)
  }

  fun getTicksUsec(): Long {
    val mb = getMethodBind("_OS","get_ticks_usec")
    return _icall_Long( mb, this.ptr)
  }

  fun getTime(utc: Boolean = false): Dictionary {
    val mb = getMethodBind("_OS","get_time")
    return _icall_Dictionary_Boolean( mb, this.ptr, utc)
  }

  fun getTimeZoneInfo(): Dictionary {
    val mb = getMethodBind("_OS","get_time_zone_info")
    return _icall_Dictionary( mb, this.ptr)
  }

  fun getUniqueId(): String {
    val mb = getMethodBind("_OS","get_unique_id")
    return _icall_String( mb, this.ptr)
  }

  fun getUnixTime(): Long {
    val mb = getMethodBind("_OS","get_unix_time")
    return _icall_Long( mb, this.ptr)
  }

  fun getUnixTimeFromDatetime(datetime: Dictionary): Long {
    val mb = getMethodBind("_OS","get_unix_time_from_datetime")
    return _icall_Long_Dictionary( mb, this.ptr, datetime)
  }

  fun getUserDataDir(): String {
    val mb = getMethodBind("_OS","get_user_data_dir")
    return _icall_String( mb, this.ptr)
  }

  fun getVideoDriverCount(): Long {
    val mb = getMethodBind("_OS","get_video_driver_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getVideoDriverName(driver: Long): String {
    val mb = getMethodBind("_OS","get_video_driver_name")
    return _icall_String_Long( mb, this.ptr, driver)
  }

  fun getVirtualKeyboardHeight(): Long {
    val mb = getMethodBind("_OS","get_virtual_keyboard_height")
    return _icall_Long( mb, this.ptr)
  }

  fun getWindowPerPixelTransparencyEnabled(): Boolean {
    val mb = getMethodBind("_OS","get_window_per_pixel_transparency_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  fun getWindowPosition(): Vector2 {
    val mb = getMethodBind("_OS","get_window_position")
    return _icall_Vector2( mb, this.ptr)
  }

  fun getWindowSafeArea(): Rect2 {
    val mb = getMethodBind("_OS","get_window_safe_area")
    return _icall_Rect2( mb, this.ptr)
  }

  fun getWindowSize(): Vector2 {
    val mb = getMethodBind("_OS","get_window_size")
    return _icall_Vector2( mb, this.ptr)
  }

  fun globalMenuAddItem(
    menu: String,
    label: String,
    id: Variant,
    meta: Variant
  ) {
    val mb = getMethodBind("_OS","global_menu_add_item")
    _icall_Unit_String_String_Variant_Variant( mb, this.ptr, menu, label, id, meta)
  }

  fun globalMenuAddSeparator(menu: String) {
    val mb = getMethodBind("_OS","global_menu_add_separator")
    _icall_Unit_String( mb, this.ptr, menu)
  }

  fun globalMenuClear(menu: String) {
    val mb = getMethodBind("_OS","global_menu_clear")
    _icall_Unit_String( mb, this.ptr, menu)
  }

  fun globalMenuRemoveItem(menu: String, idx: Long) {
    val mb = getMethodBind("_OS","global_menu_remove_item")
    _icall_Unit_String_Long( mb, this.ptr, menu, idx)
  }

  fun hasEnvironment(environment: String): Boolean {
    val mb = getMethodBind("_OS","has_environment")
    return _icall_Boolean_String( mb, this.ptr, environment)
  }

  fun hasFeature(tagName: String): Boolean {
    val mb = getMethodBind("_OS","has_feature")
    return _icall_Boolean_String( mb, this.ptr, tagName)
  }

  fun hasTouchscreenUiHint(): Boolean {
    val mb = getMethodBind("_OS","has_touchscreen_ui_hint")
    return _icall_Boolean( mb, this.ptr)
  }

  fun hasVirtualKeyboard(): Boolean {
    val mb = getMethodBind("_OS","has_virtual_keyboard")
    return _icall_Boolean( mb, this.ptr)
  }

  fun hideVirtualKeyboard() {
    val mb = getMethodBind("_OS","hide_virtual_keyboard")
    _icall_Unit( mb, this.ptr)
  }

  fun isDebugBuild(): Boolean {
    val mb = getMethodBind("_OS","is_debug_build")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isInLowProcessorUsageMode(): Boolean {
    val mb = getMethodBind("_OS","is_in_low_processor_usage_mode")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isKeepScreenOn(): Boolean {
    val mb = getMethodBind("_OS","is_keep_screen_on")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isOkLeftAndCancelRight(): Boolean {
    val mb = getMethodBind("_OS","is_ok_left_and_cancel_right")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isScancodeUnicode(code: Long): Boolean {
    val mb = getMethodBind("_OS","is_scancode_unicode")
    return _icall_Boolean_Long( mb, this.ptr, code)
  }

  fun isStdoutVerbose(): Boolean {
    val mb = getMethodBind("_OS","is_stdout_verbose")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isUserfsPersistent(): Boolean {
    val mb = getMethodBind("_OS","is_userfs_persistent")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isVsyncEnabled(): Boolean {
    val mb = getMethodBind("_OS","is_vsync_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isVsyncViaCompositorEnabled(): Boolean {
    val mb = getMethodBind("_OS","is_vsync_via_compositor_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isWindowAlwaysOnTop(): Boolean {
    val mb = getMethodBind("_OS","is_window_always_on_top")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isWindowFocused(): Boolean {
    val mb = getMethodBind("_OS","is_window_focused")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isWindowFullscreen(): Boolean {
    val mb = getMethodBind("_OS","is_window_fullscreen")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isWindowMaximized(): Boolean {
    val mb = getMethodBind("_OS","is_window_maximized")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isWindowMinimized(): Boolean {
    val mb = getMethodBind("_OS","is_window_minimized")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isWindowResizable(): Boolean {
    val mb = getMethodBind("_OS","is_window_resizable")
    return _icall_Boolean( mb, this.ptr)
  }

  fun kill(pid: Long): GodotError {
    val mb = getMethodBind("_OS","kill")
    return GodotError.byValue( _icall_Long_Long( mb, this.ptr, pid).toUInt())
  }

  fun moveWindowToForeground() {
    val mb = getMethodBind("_OS","move_window_to_foreground")
    _icall_Unit( mb, this.ptr)
  }

  fun nativeVideoIsPlaying(): Boolean {
    val mb = getMethodBind("_OS","native_video_is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  fun nativeVideoPause() {
    val mb = getMethodBind("_OS","native_video_pause")
    _icall_Unit( mb, this.ptr)
  }

  fun nativeVideoPlay(
    path: String,
    volume: Double,
    audioTrack: String,
    subtitleTrack: String
  ): GodotError {
    val mb = getMethodBind("_OS","native_video_play")
    return GodotError.byValue( _icall_Long_String_Double_String_String( mb, this.ptr, path, volume,
        audioTrack, subtitleTrack).toUInt())
  }

  fun nativeVideoStop() {
    val mb = getMethodBind("_OS","native_video_stop")
    _icall_Unit( mb, this.ptr)
  }

  fun nativeVideoUnpause() {
    val mb = getMethodBind("_OS","native_video_unpause")
    _icall_Unit( mb, this.ptr)
  }

  fun openMidiInputs() {
    val mb = getMethodBind("_OS","open_midi_inputs")
    _icall_Unit( mb, this.ptr)
  }

  fun printAllResources(tofile: String = "") {
    val mb = getMethodBind("_OS","print_all_resources")
    _icall_Unit_String( mb, this.ptr, tofile)
  }

  fun printAllTexturesBySize() {
    val mb = getMethodBind("_OS","print_all_textures_by_size")
    _icall_Unit( mb, this.ptr)
  }

  fun printResourcesByType(types: PoolStringArray) {
    val mb = getMethodBind("_OS","print_resources_by_type")
    _icall_Unit_PoolStringArray( mb, this.ptr, types)
  }

  fun printResourcesInUse(short: Boolean = false) {
    val mb = getMethodBind("_OS","print_resources_in_use")
    _icall_Unit_Boolean( mb, this.ptr, short)
  }

  fun requestAttention() {
    val mb = getMethodBind("_OS","request_attention")
    _icall_Unit( mb, this.ptr)
  }

  fun requestPermission(name: String): Boolean {
    val mb = getMethodBind("_OS","request_permission")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  fun requestPermissions(): Boolean {
    val mb = getMethodBind("_OS","request_permissions")
    return _icall_Boolean( mb, this.ptr)
  }

  fun setBorderlessWindow(borderless: Boolean) {
    val mb = getMethodBind("_OS","set_borderless_window")
    _icall_Unit_Boolean( mb, this.ptr, borderless)
  }

  fun setClipboard(clipboard: String) {
    val mb = getMethodBind("_OS","set_clipboard")
    _icall_Unit_String( mb, this.ptr, clipboard)
  }

  fun setCurrentScreen(screen: Long) {
    val mb = getMethodBind("_OS","set_current_screen")
    _icall_Unit_Long( mb, this.ptr, screen)
  }

  fun setCurrentTabletDriver(name: String) {
    val mb = getMethodBind("_OS","set_current_tablet_driver")
    _icall_Unit_String( mb, this.ptr, name)
  }

  fun setExitCode(code: Long) {
    val mb = getMethodBind("_OS","set_exit_code")
    _icall_Unit_Long( mb, this.ptr, code)
  }

  fun setIcon(icon: Image) {
    val mb = getMethodBind("_OS","set_icon")
    _icall_Unit_Object( mb, this.ptr, icon)
  }

  fun setImeActive(active: Boolean) {
    val mb = getMethodBind("_OS","set_ime_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  fun setImePosition(position: Vector2) {
    val mb = getMethodBind("_OS","set_ime_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  fun setKeepScreenOn(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_keep_screen_on")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setLowProcessorUsageMode(enable: Boolean) {
    val mb = getMethodBind("_OS","set_low_processor_usage_mode")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  fun setLowProcessorUsageModeSleepUsec(usec: Long) {
    val mb = getMethodBind("_OS","set_low_processor_usage_mode_sleep_usec")
    _icall_Unit_Long( mb, this.ptr, usec)
  }

  fun setMaxWindowSize(size: Vector2) {
    val mb = getMethodBind("_OS","set_max_window_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  fun setMinWindowSize(size: Vector2) {
    val mb = getMethodBind("_OS","set_min_window_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  fun setNativeIcon(filename: String) {
    val mb = getMethodBind("_OS","set_native_icon")
    _icall_Unit_String( mb, this.ptr, filename)
  }

  fun setScreenOrientation(orientation: Long) {
    val mb = getMethodBind("_OS","set_screen_orientation")
    _icall_Unit_Long( mb, this.ptr, orientation)
  }

  fun setThreadName(name: String): GodotError {
    val mb = getMethodBind("_OS","set_thread_name")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, name).toUInt())
  }

  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_use_file_access_save_and_swap")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setUseVsync(enable: Boolean) {
    val mb = getMethodBind("_OS","set_use_vsync")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  fun setVsyncViaCompositor(enable: Boolean) {
    val mb = getMethodBind("_OS","set_vsync_via_compositor")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  fun setWindowAlwaysOnTop(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_window_always_on_top")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setWindowFullscreen(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_window_fullscreen")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setWindowMaximized(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_window_maximized")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setWindowMinimized(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_window_minimized")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setWindowPerPixelTransparencyEnabled(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_window_per_pixel_transparency_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setWindowPosition(position: Vector2) {
    val mb = getMethodBind("_OS","set_window_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  fun setWindowResizable(enabled: Boolean) {
    val mb = getMethodBind("_OS","set_window_resizable")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setWindowSize(size: Vector2) {
    val mb = getMethodBind("_OS","set_window_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  fun setWindowTitle(title: String) {
    val mb = getMethodBind("_OS","set_window_title")
    _icall_Unit_String( mb, this.ptr, title)
  }

  fun shellOpen(uri: String): GodotError {
    val mb = getMethodBind("_OS","shell_open")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, uri).toUInt())
  }

  fun showVirtualKeyboard(existingText: String = "") {
    val mb = getMethodBind("_OS","show_virtual_keyboard")
    _icall_Unit_String( mb, this.ptr, existingText)
  }

  enum class VideoDriver(
    id: Long
  ) {
    VIDEO_DRIVER_GLES3(0),

    VIDEO_DRIVER_GLES2(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SystemDir(
    id: Long
  ) {
    SYSTEM_DIR_DESKTOP(0),

    SYSTEM_DIR_DCIM(1),

    SYSTEM_DIR_DOCUMENTS(2),

    SYSTEM_DIR_DOWNLOADS(3),

    SYSTEM_DIR_MOVIES(4),

    SYSTEM_DIR_MUSIC(5),

    SYSTEM_DIR_PICTURES(6),

    SYSTEM_DIR_RINGTONES(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ScreenOrientation(
    id: Long
  ) {
    SCREEN_ORIENTATION_LANDSCAPE(0),

    SCREEN_ORIENTATION_PORTRAIT(1),

    SCREEN_ORIENTATION_REVERSE_LANDSCAPE(2),

    SCREEN_ORIENTATION_REVERSE_PORTRAIT(3),

    SCREEN_ORIENTATION_SENSOR_LANDSCAPE(4),

    SCREEN_ORIENTATION_SENSOR_PORTRAIT(5),

    SCREEN_ORIENTATION_SENSOR(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PowerState(
    id: Long
  ) {
    POWERSTATE_UNKNOWN(0),

    POWERSTATE_ON_BATTERY(1),

    POWERSTATE_NO_BATTERY(2),

    POWERSTATE_CHARGING(3),

    POWERSTATE_CHARGED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Month(
    id: Long
  ) {
    MONTH_JANUARY(1),

    MONTH_FEBRUARY(2),

    MONTH_MARCH(3),

    MONTH_APRIL(4),

    MONTH_MAY(5),

    MONTH_JUNE(6),

    MONTH_JULY(7),

    MONTH_AUGUST(8),

    MONTH_SEPTEMBER(9),

    MONTH_OCTOBER(10),

    MONTH_NOVEMBER(11),

    MONTH_DECEMBER(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Weekday(
    id: Long
  ) {
    DAY_SUNDAY(0),

    DAY_MONDAY(1),

    DAY_TUESDAY(2),

    DAY_WEDNESDAY(3),

    DAY_THURSDAY(4),

    DAY_FRIDAY(5),

    DAY_SATURDAY(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
