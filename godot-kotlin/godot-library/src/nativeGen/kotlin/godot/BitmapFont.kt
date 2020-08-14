// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_BitmapFont
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long_Long_Long
import godot.icalls._icall_Unit_Long_Long_Rect2_Vector2_Double
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Vector2_Long_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.UninitializedPropertyAccessException
import kotlinx.cinterop.COpaquePointer

open class BitmapFont : Font() {
  open var ascent: Double
    get() {
      throw UninitializedPropertyAccessException("Cannot access property ascent: has no getter")
    }
    set(value) {
      val mb = getMethodBind("BitmapFont","set_ascent")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var distanceField: Boolean
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property distanceField: has no getter")
    }
    set(value) {
      val mb = getMethodBind("BitmapFont","set_distance_field_hint")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var fallback: BitmapFont
    get() {
      val mb = getMethodBind("BitmapFont","get_fallback")
      return _icall_BitmapFont(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BitmapFont","set_fallback")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var height: Double
    get() {
      throw UninitializedPropertyAccessException("Cannot access property height: has no getter")
    }
    set(value) {
      val mb = getMethodBind("BitmapFont","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("BitmapFont", "BitmapFont")

  open fun _getChars(): PoolIntArray {
    throw NotImplementedError("_get_chars is not implemented for BitmapFont")
  }

  open fun _getKernings(): PoolIntArray {
    throw NotImplementedError("_get_kernings is not implemented for BitmapFont")
  }

  open fun _getTextures(): VariantArray {
    throw NotImplementedError("_get_textures is not implemented for BitmapFont")
  }

  open fun _setChars(arg0: PoolIntArray) {
  }

  open fun _setKernings(arg0: PoolIntArray) {
  }

  open fun _setTextures(arg0: VariantArray) {
  }

  open fun addChar(
    character: Long,
    texture: Long,
    rect: Rect2,
    align: Vector2 = Vector2(0.0, 0.0),
    advance: Double = -1.0
  ) {
    val mb = getMethodBind("BitmapFont","add_char")
    _icall_Unit_Long_Long_Rect2_Vector2_Double( mb, this.ptr, character, texture, rect, align,
        advance)
  }

  open fun addKerningPair(
    charA: Long,
    charB: Long,
    kerning: Long
  ) {
    val mb = getMethodBind("BitmapFont","add_kerning_pair")
    _icall_Unit_Long_Long_Long( mb, this.ptr, charA, charB, kerning)
  }

  open fun addTexture(texture: Texture) {
    val mb = getMethodBind("BitmapFont","add_texture")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  open fun clear() {
    val mb = getMethodBind("BitmapFont","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun createFromFnt(path: String): GodotError {
    val mb = getMethodBind("BitmapFont","create_from_fnt")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun getCharSize(char: Long, next: Long = 0): Vector2 {
    val mb = getMethodBind("BitmapFont","get_char_size")
    return _icall_Vector2_Long_Long( mb, this.ptr, char, next)
  }

  open fun getFallback(): BitmapFont {
    val mb = getMethodBind("BitmapFont","get_fallback")
    return _icall_BitmapFont( mb, this.ptr)
  }

  open fun getKerningPair(charA: Long, charB: Long): Long {
    val mb = getMethodBind("BitmapFont","get_kerning_pair")
    return _icall_Long_Long_Long( mb, this.ptr, charA, charB)
  }

  open fun getTexture(idx: Long): Texture {
    val mb = getMethodBind("BitmapFont","get_texture")
    return _icall_Texture_Long( mb, this.ptr, idx)
  }

  open fun getTextureCount(): Long {
    val mb = getMethodBind("BitmapFont","get_texture_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun setAscent(px: Double) {
    val mb = getMethodBind("BitmapFont","set_ascent")
    _icall_Unit_Double( mb, this.ptr, px)
  }

  open fun setDistanceFieldHint(enable: Boolean) {
    val mb = getMethodBind("BitmapFont","set_distance_field_hint")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFallback(fallback: BitmapFont) {
    val mb = getMethodBind("BitmapFont","set_fallback")
    _icall_Unit_Object( mb, this.ptr, fallback)
  }

  open fun setHeight(px: Double) {
    val mb = getMethodBind("BitmapFont","set_height")
    _icall_Unit_Double( mb, this.ptr, px)
  }
}
