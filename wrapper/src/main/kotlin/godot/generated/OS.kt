@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class OS : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SystemDir(val id: Long) {
        SYSTEM_DIR_DESKTOP(0),
        SYSTEM_DIR_DCIM(1),
        SYSTEM_DIR_DOCUMENTS(2),
        SYSTEM_DIR_DOWNLOADS(3),
        SYSTEM_DIR_MOVIES(4),
        SYSTEM_DIR_MUSIC(5),
        SYSTEM_DIR_PICTURES(6),
        SYSTEM_DIR_RINGTONES(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ScreenOrientation(val id: Long) {
        SCREEN_ORIENTATION_LANDSCAPE(0),
        SCREEN_ORIENTATION_PORTRAIT(1),
        SCREEN_ORIENTATION_REVERSE_LANDSCAPE(2),
        SCREEN_ORIENTATION_REVERSE_PORTRAIT(3),
        SCREEN_ORIENTATION_SENSOR_LANDSCAPE(4),
        SCREEN_ORIENTATION_SENSOR_PORTRAIT(5),
        SCREEN_ORIENTATION_SENSOR(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class PowerState(val id: Long) {
        POWERSTATE_UNKNOWN(0),
        POWERSTATE_ON_BATTERY(1),
        POWERSTATE_NO_BATTERY(2),
        POWERSTATE_CHARGING(3),
        POWERSTATE_CHARGED(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Month(val id: Long) {
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
        MONTH_DECEMBER(12),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Weekday(val id: Long) {
        DAY_SUNDAY(0),
        DAY_MONDAY(1),
        DAY_TUESDAY(2),
        DAY_WEDNESDAY(3),
        DAY_THURSDAY(4),
        DAY_FRIDAY(5),
        DAY_SATURDAY(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): OS = OS("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): OS = fromVariant(OS(""), other)


        // Constants
        const val DAY_SUNDAY: Long = 0
        const val DAY_MONDAY: Long = 1
        const val DAY_TUESDAY: Long = 2
        const val DAY_WEDNESDAY: Long = 3
        const val DAY_THURSDAY: Long = 4
        const val DAY_FRIDAY: Long = 5
        const val DAY_SATURDAY: Long = 6
        const val MONTH_JANUARY: Long = 1
        const val MONTH_FEBRUARY: Long = 2
        const val MONTH_MARCH: Long = 3
        const val MONTH_APRIL: Long = 4
        const val MONTH_MAY: Long = 5
        const val MONTH_JUNE: Long = 6
        const val MONTH_JULY: Long = 7
        const val MONTH_AUGUST: Long = 8
        const val MONTH_SEPTEMBER: Long = 9
        const val MONTH_OCTOBER: Long = 10
        const val MONTH_NOVEMBER: Long = 11
        const val MONTH_DECEMBER: Long = 12
        const val SCREEN_ORIENTATION_LANDSCAPE: Long = 0
        const val SCREEN_ORIENTATION_PORTRAIT: Long = 1
        const val SCREEN_ORIENTATION_REVERSE_LANDSCAPE: Long = 2
        const val SCREEN_ORIENTATION_REVERSE_PORTRAIT: Long = 3
        const val SCREEN_ORIENTATION_SENSOR_LANDSCAPE: Long = 4
        const val SCREEN_ORIENTATION_SENSOR_PORTRAIT: Long = 5
        const val SCREEN_ORIENTATION_SENSOR: Long = 6
        const val SYSTEM_DIR_DESKTOP: Long = 0
        const val SYSTEM_DIR_DCIM: Long = 1
        const val SYSTEM_DIR_DOCUMENTS: Long = 2
        const val SYSTEM_DIR_DOWNLOADS: Long = 3
        const val SYSTEM_DIR_MOVIES: Long = 4
        const val SYSTEM_DIR_MUSIC: Long = 5
        const val SYSTEM_DIR_PICTURES: Long = 6
        const val SYSTEM_DIR_RINGTONES: Long = 7
        const val POWERSTATE_UNKNOWN: Long = 0
        const val POWERSTATE_ON_BATTERY: Long = 1
        const val POWERSTATE_NO_BATTERY: Long = 2
        const val POWERSTATE_CHARGING: Long = 3
        const val POWERSTATE_CHARGED: Long = 4


        private val rawMemory: COpaquePointer by lazy { getSingleton("OS", "_OS") }


        // Properties
        var clipboard: String
            get() = _icall_String(getClipboardMethodBind, this.rawMemory)
            set(value) = _icall_Unit_String(setClipboardMethodBind, this.rawMemory, value)


        var currentScreen: Long
            get() = _icall_Long(getCurrentScreenMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Long(setCurrentScreenMethodBind, this.rawMemory, value)


        var exitCode: Long
            get() = _icall_Long(getExitCodeMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Long(setExitCodeMethodBind, this.rawMemory, value)


        var vsyncEnabled: Boolean
            get() = _icall_Boolean(isVsyncEnabledMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setUseVsyncMethodBind, this.rawMemory, value)


        var lowProcessorUsageMode: Boolean
            get() = _icall_Boolean(isInLowProcessorUsageModeMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setLowProcessorUsageModeMethodBind, this.rawMemory, value)


        var keepScreenOn: Boolean
            get() = _icall_Boolean(isKeepScreenOnMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setKeepScreenOnMethodBind, this.rawMemory, value)


        var screenOrientation: Long
            get() = _icall_Long(getScreenOrientationMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Long(setScreenOrientationMethodBind, this.rawMemory, value)


        var windowBorderless: Boolean
            get() = _icall_Boolean(getBorderlessWindowMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setBorderlessWindowMethodBind, this.rawMemory, value)


        var windowPerPixelTransparencyEnabled: Boolean
            get() = _icall_Boolean(getWindowPerPixelTransparencyEnabledMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setWindowPerPixelTransparencyEnabledMethodBind, this.rawMemory, value)


        var windowFullscreen: Boolean
            get() = _icall_Boolean(isWindowFullscreenMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setWindowFullscreenMethodBind, this.rawMemory, value)


        var windowMaximized: Boolean
            get() = _icall_Boolean(isWindowMaximizedMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setWindowMaximizedMethodBind, this.rawMemory, value)


        var windowMinimized: Boolean
            get() = _icall_Boolean(isWindowMinimizedMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setWindowMinimizedMethodBind, this.rawMemory, value)


        var windowResizable: Boolean
            get() = _icall_Boolean(isWindowResizableMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setWindowResizableMethodBind, this.rawMemory, value)


        var windowPosition: Vector2
            get() = _icall_Vector2(getWindowPositionMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Vector2(setWindowPositionMethodBind, this.rawMemory, value)
        fun windowPosition(shedule: (Vector2) -> Unit): Vector2 = windowPosition.apply {
            shedule(this)
            windowPosition = this
        }


        var windowSize: Vector2
            get() = _icall_Vector2(getWindowSizeMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Vector2(setWindowSizeMethodBind, this.rawMemory, value)
        fun windowSize(shedule: (Vector2) -> Unit): Vector2 = windowSize.apply {
            shedule(this)
            windowSize = this
        }




        // Methods
        private val setClipboardMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_clipboard") }
        fun setClipboard(clipboard: String) {
            _icall_Unit_String(setClipboardMethodBind, this.rawMemory, clipboard)
        }


        private val getClipboardMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_clipboard") }
        fun getClipboard(): String {
            return _icall_String(getClipboardMethodBind, this.rawMemory)
        }


        private val getVideoDriverCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_video_driver_count") }
        fun getVideoDriverCount(): Long {
            return _icall_Long(getVideoDriverCountMethodBind, this.rawMemory)
        }


        private val getVideoDriverNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_video_driver_name") }
        fun getVideoDriverName(driver: Long): String {
            return _icall_String_Long(getVideoDriverNameMethodBind, this.rawMemory, driver)
        }


        private val getAudioDriverCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_audio_driver_count") }
        fun getAudioDriverCount(): Long {
            return _icall_Long(getAudioDriverCountMethodBind, this.rawMemory)
        }


        private val getAudioDriverNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_audio_driver_name") }
        fun getAudioDriverName(driver: Long): String {
            return _icall_String_Long(getAudioDriverNameMethodBind, this.rawMemory, driver)
        }


        private val getScreenCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_screen_count") }
        fun getScreenCount(): Long {
            return _icall_Long(getScreenCountMethodBind, this.rawMemory)
        }


        private val getCurrentScreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_current_screen") }
        fun getCurrentScreen(): Long {
            return _icall_Long(getCurrentScreenMethodBind, this.rawMemory)
        }


        private val setCurrentScreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_current_screen") }
        fun setCurrentScreen(screen: Long) {
            _icall_Unit_Long(setCurrentScreenMethodBind, this.rawMemory, screen)
        }


        private val getScreenPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_screen_position") }
        fun getScreenPosition(screen: Long = -1): Vector2 {
            return _icall_Vector2_Long(getScreenPositionMethodBind, this.rawMemory, screen)
        }


        private val getScreenSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_screen_size") }
        fun getScreenSize(screen: Long = -1): Vector2 {
            return _icall_Vector2_Long(getScreenSizeMethodBind, this.rawMemory, screen)
        }


        private val getScreenDpiMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_screen_dpi") }
        fun getScreenDpi(screen: Long = -1): Long {
            return _icall_Long_Long(getScreenDpiMethodBind, this.rawMemory, screen)
        }


        private val getWindowPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_window_position") }
        fun getWindowPosition(): Vector2 {
            return _icall_Vector2(getWindowPositionMethodBind, this.rawMemory)
        }


        private val setWindowPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_position") }
        fun setWindowPosition(position: Vector2) {
            _icall_Unit_Vector2(setWindowPositionMethodBind, this.rawMemory, position)
        }


        private val getWindowSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_window_size") }
        fun getWindowSize(): Vector2 {
            return _icall_Vector2(getWindowSizeMethodBind, this.rawMemory)
        }


        private val setWindowSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_size") }
        fun setWindowSize(size: Vector2) {
            _icall_Unit_Vector2(setWindowSizeMethodBind, this.rawMemory, size)
        }


        private val getWindowSafeAreaMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_window_safe_area") }
        fun getWindowSafeArea(): Rect2 {
            return _icall_Rect2(getWindowSafeAreaMethodBind, this.rawMemory)
        }


        private val setWindowFullscreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_fullscreen") }
        fun setWindowFullscreen(enabled: Boolean) {
            _icall_Unit_Boolean(setWindowFullscreenMethodBind, this.rawMemory, enabled)
        }


        private val isWindowFullscreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_window_fullscreen") }
        fun isWindowFullscreen(): Boolean {
            return _icall_Boolean(isWindowFullscreenMethodBind, this.rawMemory)
        }


        private val setWindowResizableMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_resizable") }
        fun setWindowResizable(enabled: Boolean) {
            _icall_Unit_Boolean(setWindowResizableMethodBind, this.rawMemory, enabled)
        }


        private val isWindowResizableMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_window_resizable") }
        fun isWindowResizable(): Boolean {
            return _icall_Boolean(isWindowResizableMethodBind, this.rawMemory)
        }


        private val setWindowMinimizedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_minimized") }
        fun setWindowMinimized(enabled: Boolean) {
            _icall_Unit_Boolean(setWindowMinimizedMethodBind, this.rawMemory, enabled)
        }


        private val isWindowMinimizedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_window_minimized") }
        fun isWindowMinimized(): Boolean {
            return _icall_Boolean(isWindowMinimizedMethodBind, this.rawMemory)
        }


        private val setWindowMaximizedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_maximized") }
        fun setWindowMaximized(enabled: Boolean) {
            _icall_Unit_Boolean(setWindowMaximizedMethodBind, this.rawMemory, enabled)
        }


        private val isWindowMaximizedMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_window_maximized") }
        fun isWindowMaximized(): Boolean {
            return _icall_Boolean(isWindowMaximizedMethodBind, this.rawMemory)
        }


        private val setWindowAlwaysOnTopMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_always_on_top") }
        fun setWindowAlwaysOnTop(enabled: Boolean) {
            _icall_Unit_Boolean(setWindowAlwaysOnTopMethodBind, this.rawMemory, enabled)
        }


        private val isWindowAlwaysOnTopMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_window_always_on_top") }
        fun isWindowAlwaysOnTop(): Boolean {
            return _icall_Boolean(isWindowAlwaysOnTopMethodBind, this.rawMemory)
        }


        private val requestAttentionMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "request_attention") }
        fun requestAttention() {
            _icall_Unit(requestAttentionMethodBind, this.rawMemory)
        }


        private val getRealWindowSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_real_window_size") }
        fun getRealWindowSize(): Vector2 {
            return _icall_Vector2(getRealWindowSizeMethodBind, this.rawMemory)
        }


        private val centerWindowMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "center_window") }
        fun centerWindow() {
            _icall_Unit(centerWindowMethodBind, this.rawMemory)
        }


        private val setBorderlessWindowMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_borderless_window") }
        fun setBorderlessWindow(borderless: Boolean) {
            _icall_Unit_Boolean(setBorderlessWindowMethodBind, this.rawMemory, borderless)
        }


        private val getBorderlessWindowMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_borderless_window") }
        fun getBorderlessWindow(): Boolean {
            return _icall_Boolean(getBorderlessWindowMethodBind, this.rawMemory)
        }


        private val getWindowPerPixelTransparencyEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_window_per_pixel_transparency_enabled") }
        fun getWindowPerPixelTransparencyEnabled(): Boolean {
            return _icall_Boolean(getWindowPerPixelTransparencyEnabledMethodBind, this.rawMemory)
        }


        private val setWindowPerPixelTransparencyEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_per_pixel_transparency_enabled") }
        fun setWindowPerPixelTransparencyEnabled(enabled: Boolean) {
            _icall_Unit_Boolean(setWindowPerPixelTransparencyEnabledMethodBind, this.rawMemory, enabled)
        }


        private val setImePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_ime_position") }
        fun setImePosition(position: Vector2) {
            _icall_Unit_Vector2(setImePositionMethodBind, this.rawMemory, position)
        }


        private val setScreenOrientationMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_screen_orientation") }
        fun setScreenOrientation(orientation: Long) {
            _icall_Unit_Long(setScreenOrientationMethodBind, this.rawMemory, orientation)
        }


        private val getScreenOrientationMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_screen_orientation") }
        fun getScreenOrientation(): OS.ScreenOrientation {
            return OS.ScreenOrientation.fromInt(_icall_Long(getScreenOrientationMethodBind, this.rawMemory))
        }


        private val setKeepScreenOnMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_keep_screen_on") }
        fun setKeepScreenOn(enabled: Boolean) {
            _icall_Unit_Boolean(setKeepScreenOnMethodBind, this.rawMemory, enabled)
        }


        private val isKeepScreenOnMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_keep_screen_on") }
        fun isKeepScreenOn(): Boolean {
            return _icall_Boolean(isKeepScreenOnMethodBind, this.rawMemory)
        }


        private val hasTouchscreenUiHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "has_touchscreen_ui_hint") }
        fun hasTouchscreenUiHint(): Boolean {
            return _icall_Boolean(hasTouchscreenUiHintMethodBind, this.rawMemory)
        }


        private val setWindowTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_window_title") }
        fun setWindowTitle(title: String) {
            _icall_Unit_String(setWindowTitleMethodBind, this.rawMemory, title)
        }


        private val setLowProcessorUsageModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_low_processor_usage_mode") }
        fun setLowProcessorUsageMode(enable: Boolean) {
            _icall_Unit_Boolean(setLowProcessorUsageModeMethodBind, this.rawMemory, enable)
        }


        private val isInLowProcessorUsageModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_in_low_processor_usage_mode") }
        fun isInLowProcessorUsageMode(): Boolean {
            return _icall_Boolean(isInLowProcessorUsageModeMethodBind, this.rawMemory)
        }


        private val getProcessorCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_processor_count") }
        fun getProcessorCount(): Long {
            return _icall_Long(getProcessorCountMethodBind, this.rawMemory)
        }


        private val getExecutablePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_executable_path") }
        fun getExecutablePath(): String {
            return _icall_String(getExecutablePathMethodBind, this.rawMemory)
        }


        private val executeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "execute") }
        fun execute(path: String, arguments: PoolStringArray, blocking: Boolean, output: GDArray = GDArray()): Long {
            return _icall_Long_String_PoolStringArray_Boolean_GDArray(executeMethodBind, this.rawMemory, path, arguments, blocking, output)
        }


        private val killMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "kill") }
        fun kill(pid: Long): GodotError {
            return GodotError.fromInt(_icall_Long_Long(killMethodBind, this.rawMemory, pid))
        }


        private val shellOpenMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "shell_open") }
        fun shellOpen(uri: String): GodotError {
            return GodotError.fromInt(_icall_Long_String(shellOpenMethodBind, this.rawMemory, uri))
        }


        private val getProcessIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_process_id") }
        fun getProcessId(): Long {
            return _icall_Long(getProcessIdMethodBind, this.rawMemory)
        }


        private val getEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_environment") }
        fun getEnvironment(environment: String): String {
            return _icall_String_String(getEnvironmentMethodBind, this.rawMemory, environment)
        }


        private val hasEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "has_environment") }
        fun hasEnvironment(environment: String): Boolean {
            return _icall_Boolean_String(hasEnvironmentMethodBind, this.rawMemory, environment)
        }


        private val getNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_name") }
        fun getName(): String {
            return _icall_String(getNameMethodBind, this.rawMemory)
        }


        private val getCmdlineArgsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_cmdline_args") }
        fun getCmdlineArgs(): PoolStringArray {
            return _icall_PoolStringArray(getCmdlineArgsMethodBind, this.rawMemory)
        }


        private val getDatetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_datetime") }
        fun getDatetime(utc: Boolean = false): Dictionary {
            return _icall_Dictionary_Boolean(getDatetimeMethodBind, this.rawMemory, utc)
        }


        private val getDateMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_date") }
        fun getDate(utc: Boolean = false): Dictionary {
            return _icall_Dictionary_Boolean(getDateMethodBind, this.rawMemory, utc)
        }


        private val getTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_time") }
        fun getTime(utc: Boolean = false): Dictionary {
            return _icall_Dictionary_Boolean(getTimeMethodBind, this.rawMemory, utc)
        }


        private val getTimeZoneInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_time_zone_info") }
        fun getTimeZoneInfo(): Dictionary {
            return _icall_Dictionary(getTimeZoneInfoMethodBind, this.rawMemory)
        }


        private val getUnixTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_unix_time") }
        fun getUnixTime(): Long {
            return _icall_Long(getUnixTimeMethodBind, this.rawMemory)
        }


        private val getDatetimeFromUnixTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_datetime_from_unix_time") }
        fun getDatetimeFromUnixTime(unixTimeVal: Long): Dictionary {
            return _icall_Dictionary_Long(getDatetimeFromUnixTimeMethodBind, this.rawMemory, unixTimeVal)
        }


        private val getUnixTimeFromDatetimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_unix_time_from_datetime") }
        fun getUnixTimeFromDatetime(datetime: Dictionary): Long {
            return _icall_Long_Dictionary(getUnixTimeFromDatetimeMethodBind, this.rawMemory, datetime)
        }


        private val getSystemTimeSecsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_system_time_secs") }
        fun getSystemTimeSecs(): Long {
            return _icall_Long(getSystemTimeSecsMethodBind, this.rawMemory)
        }


        private val setIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_icon") }
        fun setIcon(icon: Image) {
            _icall_Unit_Object(setIconMethodBind, this.rawMemory, icon)
        }


        private val getExitCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_exit_code") }
        fun getExitCode(): Long {
            return _icall_Long(getExitCodeMethodBind, this.rawMemory)
        }


        private val setExitCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_exit_code") }
        fun setExitCode(code: Long) {
            _icall_Unit_Long(setExitCodeMethodBind, this.rawMemory, code)
        }


        private val delayUsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "delay_usec") }
        fun delayUsec(usec: Long) {
            _icall_Unit_Long(delayUsecMethodBind, this.rawMemory, usec)
        }


        private val delayMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "delay_msec") }
        fun delayMsec(msec: Long) {
            _icall_Unit_Long(delayMsecMethodBind, this.rawMemory, msec)
        }


        private val getTicksMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_ticks_msec") }
        fun getTicksMsec(): Long {
            return _icall_Long(getTicksMsecMethodBind, this.rawMemory)
        }


        private val getTicksUsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_ticks_usec") }
        fun getTicksUsec(): Long {
            return _icall_Long(getTicksUsecMethodBind, this.rawMemory)
        }


        private val getSplashTickMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_splash_tick_msec") }
        fun getSplashTickMsec(): Long {
            return _icall_Long(getSplashTickMsecMethodBind, this.rawMemory)
        }


        private val getLocaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_locale") }
        fun getLocale(): String {
            return _icall_String(getLocaleMethodBind, this.rawMemory)
        }


        private val getLatinKeyboardVariantMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_latin_keyboard_variant") }
        fun getLatinKeyboardVariant(): String {
            return _icall_String(getLatinKeyboardVariantMethodBind, this.rawMemory)
        }


        private val getModelNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_model_name") }
        fun getModelName(): String {
            return _icall_String(getModelNameMethodBind, this.rawMemory)
        }


        private val canDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "can_draw") }
        fun canDraw(): Boolean {
            return _icall_Boolean(canDrawMethodBind, this.rawMemory)
        }


        private val isUserfsPersistentMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_userfs_persistent") }
        fun isUserfsPersistent(): Boolean {
            return _icall_Boolean(isUserfsPersistentMethodBind, this.rawMemory)
        }


        private val isStdoutVerboseMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_stdout_verbose") }
        fun isStdoutVerbose(): Boolean {
            return _icall_Boolean(isStdoutVerboseMethodBind, this.rawMemory)
        }


        private val canUseThreadsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "can_use_threads") }
        fun canUseThreads(): Boolean {
            return _icall_Boolean(canUseThreadsMethodBind, this.rawMemory)
        }


        private val isDebugBuildMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_debug_build") }
        fun isDebugBuild(): Boolean {
            return _icall_Boolean(isDebugBuildMethodBind, this.rawMemory)
        }


        private val dumpMemoryToFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "dump_memory_to_file") }
        fun dumpMemoryToFile(file: String) {
            _icall_Unit_String(dumpMemoryToFileMethodBind, this.rawMemory, file)
        }


        private val dumpResourcesToFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "dump_resources_to_file") }
        fun dumpResourcesToFile(file: String) {
            _icall_Unit_String(dumpResourcesToFileMethodBind, this.rawMemory, file)
        }


        private val hasVirtualKeyboardMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "has_virtual_keyboard") }
        fun hasVirtualKeyboard(): Boolean {
            return _icall_Boolean(hasVirtualKeyboardMethodBind, this.rawMemory)
        }


        private val showVirtualKeyboardMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "show_virtual_keyboard") }
        fun showVirtualKeyboard(existingText: String = "") {
            _icall_Unit_String(showVirtualKeyboardMethodBind, this.rawMemory, existingText)
        }


        private val hideVirtualKeyboardMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "hide_virtual_keyboard") }
        fun hideVirtualKeyboard() {
            _icall_Unit(hideVirtualKeyboardMethodBind, this.rawMemory)
        }


        private val getVirtualKeyboardHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_virtual_keyboard_height") }
        fun getVirtualKeyboardHeight(): Long {
            return _icall_Long(getVirtualKeyboardHeightMethodBind, this.rawMemory)
        }


        private val printResourcesInUseMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "print_resources_in_use") }
        fun printResourcesInUse(short: Boolean = false) {
            _icall_Unit_Boolean(printResourcesInUseMethodBind, this.rawMemory, short)
        }


        private val printAllResourcesMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "print_all_resources") }
        fun printAllResources(tofile: String = "") {
            _icall_Unit_String(printAllResourcesMethodBind, this.rawMemory, tofile)
        }


        private val getStaticMemoryUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_static_memory_usage") }
        fun getStaticMemoryUsage(): Long {
            return _icall_Long(getStaticMemoryUsageMethodBind, this.rawMemory)
        }


        private val getStaticMemoryPeakUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_static_memory_peak_usage") }
        fun getStaticMemoryPeakUsage(): Long {
            return _icall_Long(getStaticMemoryPeakUsageMethodBind, this.rawMemory)
        }


        private val getDynamicMemoryUsageMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_dynamic_memory_usage") }
        fun getDynamicMemoryUsage(): Long {
            return _icall_Long(getDynamicMemoryUsageMethodBind, this.rawMemory)
        }


        private val getUserDataDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_user_data_dir") }
        fun getUserDataDir(): String {
            return _icall_String(getUserDataDirMethodBind, this.rawMemory)
        }


        private val getSystemDirMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_system_dir") }
        fun getSystemDir(dir: Long): String {
            return _icall_String_Long(getSystemDirMethodBind, this.rawMemory, dir)
        }


        private val getUniqueIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_unique_id") }
        fun getUniqueId(): String {
            return _icall_String(getUniqueIdMethodBind, this.rawMemory)
        }


        private val isOkLeftAndCancelRightMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_ok_left_and_cancel_right") }
        fun isOkLeftAndCancelRight(): Boolean {
            return _icall_Boolean(isOkLeftAndCancelRightMethodBind, this.rawMemory)
        }


        private val printAllTexturesBySizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "print_all_textures_by_size") }
        fun printAllTexturesBySize() {
            _icall_Unit(printAllTexturesBySizeMethodBind, this.rawMemory)
        }


        private val printResourcesByTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "print_resources_by_type") }
        fun printResourcesByType(types: PoolStringArray) {
            _icall_Unit_PoolStringArray(printResourcesByTypeMethodBind, this.rawMemory, types)
        }


        private val nativeVideoPlayMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "native_video_play") }
        fun nativeVideoPlay(path: String, volume: Double, audioTrack: String, subtitleTrack: String): GodotError {
            return GodotError.fromInt(_icall_Long_String_Double_String_String(nativeVideoPlayMethodBind, this.rawMemory, path, volume, audioTrack, subtitleTrack))
        }


        private val nativeVideoIsPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "native_video_is_playing") }
        fun nativeVideoIsPlaying(): Boolean {
            return _icall_Boolean(nativeVideoIsPlayingMethodBind, this.rawMemory)
        }


        private val nativeVideoStopMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "native_video_stop") }
        fun nativeVideoStop() {
            _icall_Unit(nativeVideoStopMethodBind, this.rawMemory)
        }


        private val nativeVideoPauseMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "native_video_pause") }
        fun nativeVideoPause() {
            _icall_Unit(nativeVideoPauseMethodBind, this.rawMemory)
        }


        private val nativeVideoUnpauseMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "native_video_unpause") }
        fun nativeVideoUnpause() {
            _icall_Unit(nativeVideoUnpauseMethodBind, this.rawMemory)
        }


        private val getScancodeStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_scancode_string") }
        fun getScancodeString(code: Long): String {
            return _icall_String_Long(getScancodeStringMethodBind, this.rawMemory, code)
        }


        private val isScancodeUnicodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_scancode_unicode") }
        fun isScancodeUnicode(code: Long): Boolean {
            return _icall_Boolean_Long(isScancodeUnicodeMethodBind, this.rawMemory, code)
        }


        private val findScancodeFromStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "find_scancode_from_string") }
        fun findScancodeFromString(string: String): Long {
            return _icall_Long_String(findScancodeFromStringMethodBind, this.rawMemory, string)
        }


        private val setUseFileAccessSaveAndSwapMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_use_file_access_save_and_swap") }
        fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
            _icall_Unit_Boolean(setUseFileAccessSaveAndSwapMethodBind, this.rawMemory, enabled)
        }


        private val alertMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "alert") }
        fun alert(text: String, title: String = "Alert!") {
            _icall_Unit_String_String(alertMethodBind, this.rawMemory, text, title)
        }


        private val setThreadNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_thread_name") }
        fun setThreadName(name: String): GodotError {
            return GodotError.fromInt(_icall_Long_String(setThreadNameMethodBind, this.rawMemory, name))
        }


        private val setUseVsyncMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "set_use_vsync") }
        fun setUseVsync(enable: Boolean) {
            _icall_Unit_Boolean(setUseVsyncMethodBind, this.rawMemory, enable)
        }


        private val isVsyncEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "is_vsync_enabled") }
        fun isVsyncEnabled(): Boolean {
            return _icall_Boolean(isVsyncEnabledMethodBind, this.rawMemory)
        }


        private val hasFeatureMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "has_feature") }
        fun hasFeature(tagName: String): Boolean {
            return _icall_Boolean_String(hasFeatureMethodBind, this.rawMemory, tagName)
        }


        private val getPowerStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_power_state") }
        fun getPowerState(): OS.PowerState {
            return OS.PowerState.fromInt(_icall_Long(getPowerStateMethodBind, this.rawMemory))
        }


        private val getPowerSecondsLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_power_seconds_left") }
        fun getPowerSecondsLeft(): Long {
            return _icall_Long(getPowerSecondsLeftMethodBind, this.rawMemory)
        }


        private val getPowerPercentLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("_OS", "get_power_percent_left") }
        fun getPowerPercentLeft(): Long {
            return _icall_Long(getPowerPercentLeftMethodBind, this.rawMemory)
        }


    }
}
