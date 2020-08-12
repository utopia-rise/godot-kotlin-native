// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.core.Signal2
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_Boolean_Double
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class MainLoop internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  val onRequestPermissionsResult: Signal2<String, Boolean> by signal("permission", "granted")

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MainLoop", "MainLoop")
        }

  }

  open fun _dropFiles(files: PoolStringArray, fromScreen: Long) {
  }

  open fun _finalize() {
  }

  open fun _globalMenuAction(id: Variant, meta: Variant) {
  }

  open fun _idle(delta: Double): Boolean {
    throw NotImplementedError("_idle is not implemented for MainLoop")
  }

  open fun _initialize() {
  }

  open fun _inputEvent(event: InputEvent) {
  }

  open fun _inputText(text: String) {
  }

  open fun _iteration(delta: Double): Boolean {
    throw NotImplementedError("_iteration is not implemented for MainLoop")
  }

  open fun finish() {
    val mb = getMethodBind("MainLoop","finish")
    _icall_Unit( mb, this.ptr)
  }

  open fun idle(delta: Double): Boolean {
    val mb = getMethodBind("MainLoop","idle")
    return _icall_Boolean_Double( mb, this.ptr, delta)
  }

  open fun init() {
    val mb = getMethodBind("MainLoop","init")
    _icall_Unit( mb, this.ptr)
  }

  open fun inputEvent(event: InputEvent) {
    val mb = getMethodBind("MainLoop","input_event")
    _icall_Unit_Object( mb, this.ptr, event)
  }

  open fun inputText(text: String) {
    val mb = getMethodBind("MainLoop","input_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun iteration(delta: Double): Boolean {
    val mb = getMethodBind("MainLoop","iteration")
    return _icall_Boolean_Double( mb, this.ptr, delta)
  }

  companion object {
    final const val NOTIFICATION_APP_PAUSED: Long = 1015

    final const val NOTIFICATION_APP_RESUMED: Long = 1014

    final const val NOTIFICATION_CRASH: Long = 1012

    final const val NOTIFICATION_OS_IME_UPDATE: Long = 1013

    final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 1009

    final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 1010

    final const val NOTIFICATION_WM_ABOUT: Long = 1011

    final const val NOTIFICATION_WM_FOCUS_IN: Long = 1004

    final const val NOTIFICATION_WM_FOCUS_OUT: Long = 1005

    final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    final const val NOTIFICATION_WM_QUIT_REQUEST: Long = 1006

    final const val NOTIFICATION_WM_UNFOCUS_REQUEST: Long = 1008
  }
}
