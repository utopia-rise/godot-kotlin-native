// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_Color_String_String
import godot.icalls._icall_Font
import godot.icalls._icall_Font_String_String
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_PoolStringArray_String
import godot.icalls._icall_StyleBox_String_String
import godot.icalls._icall_Texture_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Color
import godot.icalls._icall_Unit_String_String_Long
import godot.icalls._icall_Unit_String_String_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class Theme internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var defaultFont: Font
    get() {
      val mb = getMethodBind("Theme","get_default_font")
      return _icall_Font(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Theme","set_default_font")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Theme", "Theme")
        }

  }

  open fun _emit_theme_changed() {
  }

  open fun clear() {
    val mb = getMethodBind("Theme","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearColor(name: String, type: String) {
    val mb = getMethodBind("Theme","clear_color")
    _icall_Unit_String_String( mb, this.ptr, name, type)
  }

  open fun clearConstant(name: String, type: String) {
    val mb = getMethodBind("Theme","clear_constant")
    _icall_Unit_String_String( mb, this.ptr, name, type)
  }

  open fun clearFont(name: String, type: String) {
    val mb = getMethodBind("Theme","clear_font")
    _icall_Unit_String_String( mb, this.ptr, name, type)
  }

  open fun clearIcon(name: String, type: String) {
    val mb = getMethodBind("Theme","clear_icon")
    _icall_Unit_String_String( mb, this.ptr, name, type)
  }

  open fun clearStylebox(name: String, type: String) {
    val mb = getMethodBind("Theme","clear_stylebox")
    _icall_Unit_String_String( mb, this.ptr, name, type)
  }

  open fun copyDefaultTheme() {
    val mb = getMethodBind("Theme","copy_default_theme")
    _icall_Unit( mb, this.ptr)
  }

  open fun copyTheme(other: Theme) {
    val mb = getMethodBind("Theme","copy_theme")
    _icall_Unit_Object( mb, this.ptr, other)
  }

  open fun getColor(name: String, type: String): Color {
    val mb = getMethodBind("Theme","get_color")
    return _icall_Color_String_String( mb, this.ptr, name, type)
  }

  open fun getColorList(type: String): PoolStringArray {
    val mb = getMethodBind("Theme","get_color_list")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  open fun getConstant(name: String, type: String): Long {
    val mb = getMethodBind("Theme","get_constant")
    return _icall_Long_String_String( mb, this.ptr, name, type)
  }

  open fun getConstantList(type: String): PoolStringArray {
    val mb = getMethodBind("Theme","get_constant_list")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  open fun getDefaultFont(): Font {
    val mb = getMethodBind("Theme","get_default_font")
    return _icall_Font( mb, this.ptr)
  }

  open fun getFont(name: String, type: String): Font {
    val mb = getMethodBind("Theme","get_font")
    return _icall_Font_String_String( mb, this.ptr, name, type)
  }

  open fun getFontList(type: String): PoolStringArray {
    val mb = getMethodBind("Theme","get_font_list")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  open fun getIcon(name: String, type: String): Texture {
    val mb = getMethodBind("Theme","get_icon")
    return _icall_Texture_String_String( mb, this.ptr, name, type)
  }

  open fun getIconList(type: String): PoolStringArray {
    val mb = getMethodBind("Theme","get_icon_list")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  open fun getStylebox(name: String, type: String): StyleBox {
    val mb = getMethodBind("Theme","get_stylebox")
    return _icall_StyleBox_String_String( mb, this.ptr, name, type)
  }

  open fun getStyleboxList(type: String): PoolStringArray {
    val mb = getMethodBind("Theme","get_stylebox_list")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  open fun getStyleboxTypes(): PoolStringArray {
    val mb = getMethodBind("Theme","get_stylebox_types")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getTypeList(type: String): PoolStringArray {
    val mb = getMethodBind("Theme","get_type_list")
    return _icall_PoolStringArray_String( mb, this.ptr, type)
  }

  open fun hasColor(name: String, type: String): Boolean {
    val mb = getMethodBind("Theme","has_color")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasConstant(name: String, type: String): Boolean {
    val mb = getMethodBind("Theme","has_constant")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasFont(name: String, type: String): Boolean {
    val mb = getMethodBind("Theme","has_font")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasIcon(name: String, type: String): Boolean {
    val mb = getMethodBind("Theme","has_icon")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasStylebox(name: String, type: String): Boolean {
    val mb = getMethodBind("Theme","has_stylebox")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun setColor(
    name: String,
    type: String,
    color: Color
  ) {
    val mb = getMethodBind("Theme","set_color")
    _icall_Unit_String_String_Color( mb, this.ptr, name, type, color)
  }

  open fun setConstant(
    name: String,
    type: String,
    constant: Long
  ) {
    val mb = getMethodBind("Theme","set_constant")
    _icall_Unit_String_String_Long( mb, this.ptr, name, type, constant)
  }

  open fun setDefaultFont(font: Font) {
    val mb = getMethodBind("Theme","set_default_font")
    _icall_Unit_Object( mb, this.ptr, font)
  }

  open fun setFont(
    name: String,
    type: String,
    font: Font
  ) {
    val mb = getMethodBind("Theme","set_font")
    _icall_Unit_String_String_Object( mb, this.ptr, name, type, font)
  }

  open fun setIcon(
    name: String,
    type: String,
    texture: Texture
  ) {
    val mb = getMethodBind("Theme","set_icon")
    _icall_Unit_String_String_Object( mb, this.ptr, name, type, texture)
  }

  open fun setStylebox(
    name: String,
    type: String,
    texture: StyleBox
  ) {
    val mb = getMethodBind("Theme","set_stylebox")
    _icall_Unit_String_String_Object( mb, this.ptr, name, type, texture)
  }
}
