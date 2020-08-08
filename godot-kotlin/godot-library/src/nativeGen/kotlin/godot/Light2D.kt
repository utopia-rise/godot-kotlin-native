package godot

import godot.Light2D
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Light2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var color: Color
    get() {
      val mb = getMethodBind("Light2D","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var editorOnly: Boolean
    get() {
      val mb = getMethodBind("Light2D","is_editor_only")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_editor_only")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var enabled: Boolean
    get() {
      val mb = getMethodBind("Light2D","is_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var energy: Double
    get() {
      val mb = getMethodBind("Light2D","get_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("Light2D","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("Light2D","get_texture_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_texture_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var rangeHeight: Double
    get() {
      val mb = getMethodBind("Light2D","get_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rangeItemCullMask: Long
    get() {
      val mb = getMethodBind("Light2D","get_item_cull_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_item_cull_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rangeLayerMax: Long
    get() {
      val mb = getMethodBind("Light2D","get_layer_range_max")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_layer_range_max")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rangeLayerMin: Long
    get() {
      val mb = getMethodBind("Light2D","get_layer_range_min")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_layer_range_min")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rangeZMax: Long
    get() {
      val mb = getMethodBind("Light2D","get_z_range_max")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_z_range_max")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rangeZMin: Long
    get() {
      val mb = getMethodBind("Light2D","get_z_range_min")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_z_range_min")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var shadowBufferSize: Long
    get() {
      val mb = getMethodBind("Light2D","get_shadow_buffer_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_shadow_buffer_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var shadowColor: Color
    get() {
      val mb = getMethodBind("Light2D","get_shadow_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_shadow_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var shadowEnabled: Boolean
    get() {
      val mb = getMethodBind("Light2D","is_shadow_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_shadow_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shadowFilter: Long
    get() {
      val mb = getMethodBind("Light2D","get_shadow_filter")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_shadow_filter")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var shadowFilterSmooth: Double
    get() {
      val mb = getMethodBind("Light2D","get_shadow_smooth")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_shadow_smooth")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var shadowGradientLength: Double
    get() {
      val mb = getMethodBind("Light2D","get_shadow_gradient_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_shadow_gradient_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var shadowItemCullMask: Long
    get() {
      val mb = getMethodBind("Light2D","get_item_shadow_cull_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_item_shadow_cull_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("Light2D","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureScale: Double
    get() {
      val mb = getMethodBind("Light2D","get_texture_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Light2D","set_texture_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Light2D", "Light2D")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  open fun getColor(): Color {
    val mb = getMethodBind("Light2D","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getEnergy(): Double {
    val mb = getMethodBind("Light2D","get_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getHeight(): Double {
    val mb = getMethodBind("Light2D","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getItemCullMask(): Long {
    val mb = getMethodBind("Light2D","get_item_cull_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getItemShadowCullMask(): Long {
    val mb = getMethodBind("Light2D","get_item_shadow_cull_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLayerRangeMax(): Long {
    val mb = getMethodBind("Light2D","get_layer_range_max")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLayerRangeMin(): Long {
    val mb = getMethodBind("Light2D","get_layer_range_min")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMode(): Light2D.Mode {
    val mb = getMethodBind("Light2D","get_mode")
    return Light2D.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getShadowBufferSize(): Long {
    val mb = getMethodBind("Light2D","get_shadow_buffer_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getShadowColor(): Color {
    val mb = getMethodBind("Light2D","get_shadow_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getShadowFilter(): Light2D.ShadowFilter {
    val mb = getMethodBind("Light2D","get_shadow_filter")
    return Light2D.ShadowFilter.from( _icall_Long( mb, this.ptr))
  }

  open fun getShadowGradientLength(): Double {
    val mb = getMethodBind("Light2D","get_shadow_gradient_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getShadowSmooth(): Double {
    val mb = getMethodBind("Light2D","get_shadow_smooth")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("Light2D","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTextureOffset(): Vector2 {
    val mb = getMethodBind("Light2D","get_texture_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTextureScale(): Double {
    val mb = getMethodBind("Light2D","get_texture_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getZRangeMax(): Long {
    val mb = getMethodBind("Light2D","get_z_range_max")
    return _icall_Long( mb, this.ptr)
  }

  open fun getZRangeMin(): Long {
    val mb = getMethodBind("Light2D","get_z_range_min")
    return _icall_Long( mb, this.ptr)
  }

  open fun isEditorOnly(): Boolean {
    val mb = getMethodBind("Light2D","is_editor_only")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEnabled(): Boolean {
    val mb = getMethodBind("Light2D","is_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShadowEnabled(): Boolean {
    val mb = getMethodBind("Light2D","is_shadow_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("Light2D","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setEditorOnly(editorOnly: Boolean) {
    val mb = getMethodBind("Light2D","set_editor_only")
    _icall_Unit_Boolean( mb, this.ptr, editorOnly)
  }

  open fun setEnabled(enabled: Boolean) {
    val mb = getMethodBind("Light2D","set_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setEnergy(energy: Double) {
    val mb = getMethodBind("Light2D","set_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setHeight(height: Double) {
    val mb = getMethodBind("Light2D","set_height")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setItemCullMask(itemCullMask: Long) {
    val mb = getMethodBind("Light2D","set_item_cull_mask")
    _icall_Unit_Long( mb, this.ptr, itemCullMask)
  }

  open fun setItemShadowCullMask(itemShadowCullMask: Long) {
    val mb = getMethodBind("Light2D","set_item_shadow_cull_mask")
    _icall_Unit_Long( mb, this.ptr, itemShadowCullMask)
  }

  open fun setLayerRangeMax(layer: Long) {
    val mb = getMethodBind("Light2D","set_layer_range_max")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setLayerRangeMin(layer: Long) {
    val mb = getMethodBind("Light2D","set_layer_range_min")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("Light2D","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setShadowBufferSize(size: Long) {
    val mb = getMethodBind("Light2D","set_shadow_buffer_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun setShadowColor(shadowColor: Color) {
    val mb = getMethodBind("Light2D","set_shadow_color")
    _icall_Unit_Color( mb, this.ptr, shadowColor)
  }

  open fun setShadowEnabled(enabled: Boolean) {
    val mb = getMethodBind("Light2D","set_shadow_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setShadowFilter(filter: Long) {
    val mb = getMethodBind("Light2D","set_shadow_filter")
    _icall_Unit_Long( mb, this.ptr, filter)
  }

  open fun setShadowGradientLength(multiplier: Double) {
    val mb = getMethodBind("Light2D","set_shadow_gradient_length")
    _icall_Unit_Double( mb, this.ptr, multiplier)
  }

  open fun setShadowSmooth(smooth: Double) {
    val mb = getMethodBind("Light2D","set_shadow_smooth")
    _icall_Unit_Double( mb, this.ptr, smooth)
  }

  open fun setTexture(texture: Texture) {
    val mb = getMethodBind("Light2D","set_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun setTextureOffset(textureOffset: Vector2) {
    val mb = getMethodBind("Light2D","set_texture_offset")
    _icall_Unit_Vector2( mb, this.ptr, textureOffset)
  }

  open fun setTextureScale(textureScale: Double) {
    val mb = getMethodBind("Light2D","set_texture_scale")
    _icall_Unit_Double( mb, this.ptr, textureScale)
  }

  open fun setZRangeMax(z: Long) {
    val mb = getMethodBind("Light2D","set_z_range_max")
    _icall_Unit_Long( mb, this.ptr, z)
  }

  open fun setZRangeMin(z: Long) {
    val mb = getMethodBind("Light2D","set_z_range_min")
    _icall_Unit_Long( mb, this.ptr, z)
  }

  enum class ShadowFilter(
    id: Long
  ) {
    SHADOW_FILTER_NONE(0),

    SHADOW_FILTER_PCF3(1),

    SHADOW_FILTER_PCF5(2),

    SHADOW_FILTER_PCF7(3),

    SHADOW_FILTER_PCF9(4),

    SHADOW_FILTER_PCF13(5);

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
    MODE_ADD(0),

    MODE_SUB(1),

    MODE_MIX(2),

    MODE_MASK(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MODE_ADD: Long = 0

    final const val MODE_MASK: Long = 3

    final const val MODE_MIX: Long = 2

    final const val MODE_SUB: Long = 1

    final const val SHADOW_FILTER_NONE: Long = 0

    final const val SHADOW_FILTER_PCF13: Long = 5

    final const val SHADOW_FILTER_PCF3: Long = 1

    final const val SHADOW_FILTER_PCF5: Long = 2

    final const val SHADOW_FILTER_PCF7: Long = 3

    final const val SHADOW_FILTER_PCF9: Long = 4
  }
}
