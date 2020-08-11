// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.TouchScreenButton
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_BitMap
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Shape2D
import godot.icalls._icall_String
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class TouchScreenButton internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val signalPressed: Signal0 by signal()

  val released: Signal0 by signal()

  open var action: String
    get() {
      val mb = getMethodBind("TouchScreenButton","get_action")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_action")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var bitmask: BitMap
    get() {
      val mb = getMethodBind("TouchScreenButton","get_bitmask")
      return _icall_BitMap(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_bitmask")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var normal: Texture
    get() {
      val mb = getMethodBind("TouchScreenButton","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var passbyPress: Boolean
    get() {
      val mb = getMethodBind("TouchScreenButton","is_passby_press_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_passby_press")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pressed: Texture
    get() {
      val mb = getMethodBind("TouchScreenButton","get_texture_pressed")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_texture_pressed")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var shape: Shape2D
    get() {
      val mb = getMethodBind("TouchScreenButton","get_shape")
      return _icall_Shape2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_shape")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var shapeCentered: Boolean
    get() {
      val mb = getMethodBind("TouchScreenButton","is_shape_centered")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_shape_centered")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shapeVisible: Boolean
    get() {
      val mb = getMethodBind("TouchScreenButton","is_shape_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_shape_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var visibilityMode: Long
    get() {
      val mb = getMethodBind("TouchScreenButton","get_visibility_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TouchScreenButton","set_visibility_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("TouchScreenButton", "TouchScreenButton")
        }

  }

  override fun _input(arg0: InputEvent) {
  }

  open fun getAction(): String {
    val mb = getMethodBind("TouchScreenButton","get_action")
    return _icall_String( mb, this.ptr)
  }

  open fun getBitmask(): BitMap {
    val mb = getMethodBind("TouchScreenButton","get_bitmask")
    return _icall_BitMap( mb, this.ptr)
  }

  open fun getShape(): Shape2D {
    val mb = getMethodBind("TouchScreenButton","get_shape")
    return _icall_Shape2D( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("TouchScreenButton","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTexturePressed(): Texture {
    val mb = getMethodBind("TouchScreenButton","get_texture_pressed")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getVisibilityMode(): TouchScreenButton.VisibilityMode {
    val mb = getMethodBind("TouchScreenButton","get_visibility_mode")
    return TouchScreenButton.VisibilityMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isPassbyPressEnabled(): Boolean {
    val mb = getMethodBind("TouchScreenButton","is_passby_press_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPressed(): Boolean {
    val mb = getMethodBind("TouchScreenButton","is_pressed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShapeCentered(): Boolean {
    val mb = getMethodBind("TouchScreenButton","is_shape_centered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShapeVisible(): Boolean {
    val mb = getMethodBind("TouchScreenButton","is_shape_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAction(action: String) {
    val mb = getMethodBind("TouchScreenButton","set_action")
    _icall_Unit_String( mb, this.ptr, action)
  }

  open fun setBitmask(bitmask: BitMap) {
    val mb = getMethodBind("TouchScreenButton","set_bitmask")
    _icall_Unit_Object( mb, this.ptr, bitmask)
  }

  open fun setPassbyPress(enabled: Boolean) {
    val mb = getMethodBind("TouchScreenButton","set_passby_press")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setShape(shape: Shape2D) {
    val mb = getMethodBind("TouchScreenButton","set_shape")
    _icall_Unit_Object( mb, this.ptr, shape)
  }

  open fun setShapeCentered(bool: Boolean) {
    val mb = getMethodBind("TouchScreenButton","set_shape_centered")
    _icall_Unit_Boolean( mb, this.ptr, bool)
  }

  open fun setShapeVisible(bool: Boolean) {
    val mb = getMethodBind("TouchScreenButton","set_shape_visible")
    _icall_Unit_Boolean( mb, this.ptr, bool)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("TouchScreenButton","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setTexturePressed(texturePressed: Texture) {
    val mb = getMethodBind("TouchScreenButton","set_texture_pressed")
    _icall_Unit_Object( mb, this.ptr, texturePressed)
  }

  open fun setVisibilityMode(mode: Long) {
    val mb = getMethodBind("TouchScreenButton","set_visibility_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class VisibilityMode(
    id: Long
  ) {
    VISIBILITY_ALWAYS(0),

    VISIBILITY_TOUCHSCREEN_ONLY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val VISIBILITY_ALWAYS: Long = 0

    final const val VISIBILITY_TOUCHSCREEN_ONLY: Long = 1
  }
}
