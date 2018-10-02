@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Input : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class MouseMode(val id: Long) {
        MOUSE_MODE_VISIBLE(0),
        MOUSE_MODE_HIDDEN(1),
        MOUSE_MODE_CAPTURED(2),
        MOUSE_MODE_CONFINED(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CursorShape(val id: Long) {
        CURSOR_ARROW(0),
        CURSOR_IBEAM(1),
        CURSOR_POINTING_HAND(2),
        CURSOR_CROSS(3),
        CURSOR_WAIT(4),
        CURSOR_BUSY(5),
        CURSOR_DRAG(6),
        CURSOR_CAN_DROP(7),
        CURSOR_FORBIDDEN(8),
        CURSOR_VSIZE(9),
        CURSOR_HSIZE(10),
        CURSOR_BDIAGSIZE(11),
        CURSOR_FDIAGSIZE(12),
        CURSOR_MOVE(13),
        CURSOR_VSPLIT(14),
        CURSOR_HSPLIT(15),
        CURSOR_HELP(16),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val JOY_CONNECTION_CHANGED: String = "joy_connection_changed"
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): Input = Input("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Input = fromVariant(Input(""), other)


        // Constants
        const val MOUSE_MODE_VISIBLE: Long = 0
        const val MOUSE_MODE_HIDDEN: Long = 1
        const val MOUSE_MODE_CAPTURED: Long = 2
        const val MOUSE_MODE_CONFINED: Long = 3
        const val CURSOR_ARROW: Long = 0
        const val CURSOR_IBEAM: Long = 1
        const val CURSOR_POINTING_HAND: Long = 2
        const val CURSOR_CROSS: Long = 3
        const val CURSOR_WAIT: Long = 4
        const val CURSOR_BUSY: Long = 5
        const val CURSOR_DRAG: Long = 6
        const val CURSOR_CAN_DROP: Long = 7
        const val CURSOR_FORBIDDEN: Long = 8
        const val CURSOR_VSIZE: Long = 9
        const val CURSOR_HSIZE: Long = 10
        const val CURSOR_BDIAGSIZE: Long = 11
        const val CURSOR_FDIAGSIZE: Long = 12
        const val CURSOR_MOVE: Long = 13
        const val CURSOR_VSPLIT: Long = 14
        const val CURSOR_HSPLIT: Long = 15
        const val CURSOR_HELP: Long = 16


        private val rawMemory: COpaquePointer by lazy { getSingleton("Input", "Input") }


        // Properties


        // Methods
        private val isKeyPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_key_pressed") }
        fun isKeyPressed(scancode: Long): Boolean {
            return _icall_Boolean_Long(isKeyPressedMethodBind, this.rawMemory, scancode)
        }


        private val isMouseButtonPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_mouse_button_pressed") }
        fun isMouseButtonPressed(button: Long): Boolean {
            return _icall_Boolean_Long(isMouseButtonPressedMethodBind, this.rawMemory, button)
        }


        private val isJoyButtonPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_joy_button_pressed") }
        fun isJoyButtonPressed(device: Long, button: Long): Boolean {
            return _icall_Boolean_Long_Long(isJoyButtonPressedMethodBind, this.rawMemory, device, button)
        }


        private val isActionPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_action_pressed") }
        fun isActionPressed(action: String): Boolean {
            return _icall_Boolean_String(isActionPressedMethodBind, this.rawMemory, action)
        }


        private val isActionJustPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_action_just_pressed") }
        fun isActionJustPressed(action: String): Boolean {
            return _icall_Boolean_String(isActionJustPressedMethodBind, this.rawMemory, action)
        }


        private val isActionJustReleasedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_action_just_released") }
        fun isActionJustReleased(action: String): Boolean {
            return _icall_Boolean_String(isActionJustReleasedMethodBind, this.rawMemory, action)
        }


        private val getActionStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_action_strength") }
        fun getActionStrength(action: String): Double {
            return _icall_Double_String(getActionStrengthMethodBind, this.rawMemory, action)
        }


        private val addJoyMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "add_joy_mapping") }
        fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
            _icall_Unit_String_Boolean(addJoyMappingMethodBind, this.rawMemory, mapping, updateExisting)
        }


        private val removeJoyMappingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "remove_joy_mapping") }
        fun removeJoyMapping(guid: String) {
            _icall_Unit_String(removeJoyMappingMethodBind, this.rawMemory, guid)
        }


        private val joyConnectionChangedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "joy_connection_changed") }
        fun joyConnectionChanged(device: Long, connected: Boolean, name: String, guid: String) {
            _icall_Unit_Long_Boolean_String_String(joyConnectionChangedMethodBind, this.rawMemory, device, connected, name, guid)
        }


        private val isJoyKnownMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "is_joy_known") }
        fun isJoyKnown(device: Long): Boolean {
            return _icall_Boolean_Long(isJoyKnownMethodBind, this.rawMemory, device)
        }


        private val getJoyAxisMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_axis") }
        fun getJoyAxis(device: Long, axis: Long): Double {
            return _icall_Double_Long_Long(getJoyAxisMethodBind, this.rawMemory, device, axis)
        }


        private val getJoyNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_name") }
        fun getJoyName(device: Long): String {
            return _icall_String_Long(getJoyNameMethodBind, this.rawMemory, device)
        }


        private val getJoyGuidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_guid") }
        fun getJoyGuid(device: Long): String {
            return _icall_String_Long(getJoyGuidMethodBind, this.rawMemory, device)
        }


        private val getConnectedJoypadsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_connected_joypads") }
        fun getConnectedJoypads(): GDArray {
            return _icall_GDArray(getConnectedJoypadsMethodBind, this.rawMemory)
        }


        private val getJoyVibrationStrengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_vibration_strength") }
        fun getJoyVibrationStrength(device: Long): Vector2 {
            return _icall_Vector2_Long(getJoyVibrationStrengthMethodBind, this.rawMemory, device)
        }


        private val getJoyVibrationDurationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_vibration_duration") }
        fun getJoyVibrationDuration(device: Long): Double {
            return _icall_Double_Long(getJoyVibrationDurationMethodBind, this.rawMemory, device)
        }


        private val getJoyButtonStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_button_string") }
        fun getJoyButtonString(buttonIndex: Long): String {
            return _icall_String_Long(getJoyButtonStringMethodBind, this.rawMemory, buttonIndex)
        }


        private val getJoyButtonIndexFromStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_button_index_from_string") }
        fun getJoyButtonIndexFromString(button: String): Long {
            return _icall_Long_String(getJoyButtonIndexFromStringMethodBind, this.rawMemory, button)
        }


        private val getJoyAxisStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_axis_string") }
        fun getJoyAxisString(axisIndex: Long): String {
            return _icall_String_Long(getJoyAxisStringMethodBind, this.rawMemory, axisIndex)
        }


        private val getJoyAxisIndexFromStringMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_joy_axis_index_from_string") }
        fun getJoyAxisIndexFromString(axis: String): Long {
            return _icall_Long_String(getJoyAxisIndexFromStringMethodBind, this.rawMemory, axis)
        }


        private val startJoyVibrationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "start_joy_vibration") }
        fun startJoyVibration(device: Long, weakMagnitude: Double, strongMagnitude: Double, duration: Double = 0.0) {
            _icall_Unit_Long_Double_Double_Double(startJoyVibrationMethodBind, this.rawMemory, device, weakMagnitude, strongMagnitude, duration)
        }


        private val stopJoyVibrationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "stop_joy_vibration") }
        fun stopJoyVibration(device: Long) {
            _icall_Unit_Long(stopJoyVibrationMethodBind, this.rawMemory, device)
        }


        private val getGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_gravity") }
        fun getGravity(): Vector3 {
            return _icall_Vector3(getGravityMethodBind, this.rawMemory)
        }


        private val getAccelerometerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_accelerometer") }
        fun getAccelerometer(): Vector3 {
            return _icall_Vector3(getAccelerometerMethodBind, this.rawMemory)
        }


        private val getMagnetometerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_magnetometer") }
        fun getMagnetometer(): Vector3 {
            return _icall_Vector3(getMagnetometerMethodBind, this.rawMemory)
        }


        private val getGyroscopeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_gyroscope") }
        fun getGyroscope(): Vector3 {
            return _icall_Vector3(getGyroscopeMethodBind, this.rawMemory)
        }


        private val getLastMouseSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_last_mouse_speed") }
        fun getLastMouseSpeed(): Vector2 {
            return _icall_Vector2(getLastMouseSpeedMethodBind, this.rawMemory)
        }


        private val getMouseButtonMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_mouse_button_mask") }
        fun getMouseButtonMask(): Long {
            return _icall_Long(getMouseButtonMaskMethodBind, this.rawMemory)
        }


        private val setMouseModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "set_mouse_mode") }
        fun setMouseMode(mode: Long) {
            _icall_Unit_Long(setMouseModeMethodBind, this.rawMemory, mode)
        }


        private val getMouseModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "get_mouse_mode") }
        fun getMouseMode(): Input.MouseMode {
            return Input.MouseMode.fromInt(_icall_Long(getMouseModeMethodBind, this.rawMemory))
        }


        private val warpMousePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "warp_mouse_position") }
        fun warpMousePosition(to: Vector2) {
            _icall_Unit_Vector2(warpMousePositionMethodBind, this.rawMemory, to)
        }


        private val actionPressMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "action_press") }
        fun actionPress(action: String) {
            _icall_Unit_String(actionPressMethodBind, this.rawMemory, action)
        }


        private val actionReleaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "action_release") }
        fun actionRelease(action: String) {
            _icall_Unit_String(actionReleaseMethodBind, this.rawMemory, action)
        }


        private val setDefaultCursorShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "set_default_cursor_shape") }
        fun setDefaultCursorShape(shape: Long = 0) {
            _icall_Unit_Long(setDefaultCursorShapeMethodBind, this.rawMemory, shape)
        }


        private val setCustomMouseCursorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "set_custom_mouse_cursor") }
        fun setCustomMouseCursor(image: Resource, shape: Long = 0, hotspot: Vector2 = Vector2(0, 0)) {
            _icall_Unit_Object_Long_Vector2(setCustomMouseCursorMethodBind, this.rawMemory, image, shape, hotspot)
        }


        private val parseInputEventMethodBind: CPointer<godot_method_bind> by lazy { getMB("Input", "parse_input_event") }
        fun parseInputEvent(event: InputEvent) {
            _icall_Unit_Object(parseInputEventMethodBind, this.rawMemory, event)
        }


    }
}
