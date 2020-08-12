// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Input
import godot.core.Godot
import godot.core.Signal2
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Double_Long_Long
import godot.icalls._icall_Double_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean_String_String
import godot.icalls._icall_Unit_Long_Double_Double_Double
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Long_Vector2
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_Double
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long
import godot.icalls._icall_Vector3
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object Input : Object() {
  val joyConnectionChanged: Signal2<Long, Boolean> by signal("device", "connected")

  override fun __new(): COpaquePointer = memScoped {
      val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("Input".cstr.ptr)
      requireNotNull(ptr) { "No instance found for singleton Input" }
      ptr
  }

  fun actionPress(action: String, strength: Double = 1.0) {
    val mb = getMethodBind("Input","action_press")
    _icall_Unit_String_Double( mb, this.ptr, action, strength)
  }

  fun actionRelease(action: String) {
    val mb = getMethodBind("Input","action_release")
    _icall_Unit_String( mb, this.ptr, action)
  }

  fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
    val mb = getMethodBind("Input","add_joy_mapping")
    _icall_Unit_String_Boolean( mb, this.ptr, mapping, updateExisting)
  }

  fun getAccelerometer(): Vector3 {
    val mb = getMethodBind("Input","get_accelerometer")
    return _icall_Vector3( mb, this.ptr)
  }

  fun getActionStrength(action: String): Double {
    val mb = getMethodBind("Input","get_action_strength")
    return _icall_Double_String( mb, this.ptr, action)
  }

  fun getConnectedJoypads(): VariantArray {
    val mb = getMethodBind("Input","get_connected_joypads")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getCurrentCursorShape(): Input.CursorShape {
    val mb = getMethodBind("Input","get_current_cursor_shape")
    return Input.CursorShape.from( _icall_Long( mb, this.ptr))
  }

  fun getGravity(): Vector3 {
    val mb = getMethodBind("Input","get_gravity")
    return _icall_Vector3( mb, this.ptr)
  }

  fun getGyroscope(): Vector3 {
    val mb = getMethodBind("Input","get_gyroscope")
    return _icall_Vector3( mb, this.ptr)
  }

  fun getJoyAxis(device: Long, axis: Long): Double {
    val mb = getMethodBind("Input","get_joy_axis")
    return _icall_Double_Long_Long( mb, this.ptr, device, axis)
  }

  fun getJoyAxisIndexFromString(axis: String): Long {
    val mb = getMethodBind("Input","get_joy_axis_index_from_string")
    return _icall_Long_String( mb, this.ptr, axis)
  }

  fun getJoyAxisString(axisIndex: Long): String {
    val mb = getMethodBind("Input","get_joy_axis_string")
    return _icall_String_Long( mb, this.ptr, axisIndex)
  }

  fun getJoyButtonIndexFromString(button: String): Long {
    val mb = getMethodBind("Input","get_joy_button_index_from_string")
    return _icall_Long_String( mb, this.ptr, button)
  }

  fun getJoyButtonString(buttonIndex: Long): String {
    val mb = getMethodBind("Input","get_joy_button_string")
    return _icall_String_Long( mb, this.ptr, buttonIndex)
  }

  fun getJoyGuid(device: Long): String {
    val mb = getMethodBind("Input","get_joy_guid")
    return _icall_String_Long( mb, this.ptr, device)
  }

  fun getJoyName(device: Long): String {
    val mb = getMethodBind("Input","get_joy_name")
    return _icall_String_Long( mb, this.ptr, device)
  }

  fun getJoyVibrationDuration(device: Long): Double {
    val mb = getMethodBind("Input","get_joy_vibration_duration")
    return _icall_Double_Long( mb, this.ptr, device)
  }

  fun getJoyVibrationStrength(device: Long): Vector2 {
    val mb = getMethodBind("Input","get_joy_vibration_strength")
    return _icall_Vector2_Long( mb, this.ptr, device)
  }

  fun getLastMouseSpeed(): Vector2 {
    val mb = getMethodBind("Input","get_last_mouse_speed")
    return _icall_Vector2( mb, this.ptr)
  }

  fun getMagnetometer(): Vector3 {
    val mb = getMethodBind("Input","get_magnetometer")
    return _icall_Vector3( mb, this.ptr)
  }

  fun getMouseButtonMask(): Long {
    val mb = getMethodBind("Input","get_mouse_button_mask")
    return _icall_Long( mb, this.ptr)
  }

  fun getMouseMode(): Input.MouseMode {
    val mb = getMethodBind("Input","get_mouse_mode")
    return Input.MouseMode.from( _icall_Long( mb, this.ptr))
  }

  fun isActionJustPressed(action: String): Boolean {
    val mb = getMethodBind("Input","is_action_just_pressed")
    return _icall_Boolean_String( mb, this.ptr, action)
  }

  fun isActionJustReleased(action: String): Boolean {
    val mb = getMethodBind("Input","is_action_just_released")
    return _icall_Boolean_String( mb, this.ptr, action)
  }

  fun isActionPressed(action: String): Boolean {
    val mb = getMethodBind("Input","is_action_pressed")
    return _icall_Boolean_String( mb, this.ptr, action)
  }

  fun isJoyButtonPressed(device: Long, button: Long): Boolean {
    val mb = getMethodBind("Input","is_joy_button_pressed")
    return _icall_Boolean_Long_Long( mb, this.ptr, device, button)
  }

  fun isJoyKnown(device: Long): Boolean {
    val mb = getMethodBind("Input","is_joy_known")
    return _icall_Boolean_Long( mb, this.ptr, device)
  }

  fun isKeyPressed(scancode: Long): Boolean {
    val mb = getMethodBind("Input","is_key_pressed")
    return _icall_Boolean_Long( mb, this.ptr, scancode)
  }

  fun isMouseButtonPressed(button: Long): Boolean {
    val mb = getMethodBind("Input","is_mouse_button_pressed")
    return _icall_Boolean_Long( mb, this.ptr, button)
  }

  fun joyConnectionChanged(
    device: Long,
    connected: Boolean,
    name: String,
    guid: String
  ) {
    val mb = getMethodBind("Input","joy_connection_changed")
    _icall_Unit_Long_Boolean_String_String( mb, this.ptr, device, connected, name, guid)
  }

  fun parseInputEvent(event: InputEvent) {
    val mb = getMethodBind("Input","parse_input_event")
    _icall_Unit_Object( mb, this.ptr, event)
  }

  fun removeJoyMapping(guid: String) {
    val mb = getMethodBind("Input","remove_joy_mapping")
    _icall_Unit_String( mb, this.ptr, guid)
  }

  fun setCustomMouseCursor(
    image: Resource,
    shape: Long = 0,
    hotspot: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("Input","set_custom_mouse_cursor")
    _icall_Unit_Object_Long_Vector2( mb, this.ptr, image, shape, hotspot)
  }

  fun setDefaultCursorShape(shape: Long = 0) {
    val mb = getMethodBind("Input","set_default_cursor_shape")
    _icall_Unit_Long( mb, this.ptr, shape)
  }

  fun setMouseMode(mode: Long) {
    val mb = getMethodBind("Input","set_mouse_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  fun setUseAccumulatedInput(enable: Boolean) {
    val mb = getMethodBind("Input","set_use_accumulated_input")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  fun startJoyVibration(
    device: Long,
    weakMagnitude: Double,
    strongMagnitude: Double,
    duration: Double = 0.0
  ) {
    val mb = getMethodBind("Input","start_joy_vibration")
    _icall_Unit_Long_Double_Double_Double( mb, this.ptr, device, weakMagnitude, strongMagnitude,
        duration)
  }

  fun stopJoyVibration(device: Long) {
    val mb = getMethodBind("Input","stop_joy_vibration")
    _icall_Unit_Long( mb, this.ptr, device)
  }

  fun vibrateHandheld(durationMs: Long = 500) {
    val mb = getMethodBind("Input","vibrate_handheld")
    _icall_Unit_Long( mb, this.ptr, durationMs)
  }

  fun warpMousePosition(to: Vector2) {
    val mb = getMethodBind("Input","warp_mouse_position")
    _icall_Unit_Vector2( mb, this.ptr, to)
  }

  enum class MouseMode(
    id: Long
  ) {
    MOUSE_MODE_VISIBLE(0),

    MOUSE_MODE_HIDDEN(1),

    MOUSE_MODE_CAPTURED(2),

    MOUSE_MODE_CONFINED(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CursorShape(
    id: Long
  ) {
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

    CURSOR_HELP(16);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
