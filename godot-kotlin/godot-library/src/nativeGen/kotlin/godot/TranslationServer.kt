// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.core.VariantArray
import godot.icalls._icall_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VariantArray
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object TranslationServer : Object() {
  override fun __new(): COpaquePointer = memScoped {
      val ptr =
      nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("TranslationServer".cstr.ptr)
      requireNotNull(ptr) { "No instance found for singleton TranslationServer" }
      ptr
  }

  fun addTranslation(translation: Translation) {
    val mb = getMethodBind("TranslationServer","add_translation")
    _icall_Unit_Object( mb, this.ptr, translation)
  }

  fun clear() {
    val mb = getMethodBind("TranslationServer","clear")
    _icall_Unit( mb, this.ptr)
  }

  fun getLoadedLocales(): VariantArray {
    val mb = getMethodBind("TranslationServer","get_loaded_locales")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getLocale(): String {
    val mb = getMethodBind("TranslationServer","get_locale")
    return _icall_String( mb, this.ptr)
  }

  fun getLocaleName(locale: String): String {
    val mb = getMethodBind("TranslationServer","get_locale_name")
    return _icall_String_String( mb, this.ptr, locale)
  }

  fun removeTranslation(translation: Translation) {
    val mb = getMethodBind("TranslationServer","remove_translation")
    _icall_Unit_Object( mb, this.ptr, translation)
  }

  fun setLocale(locale: String) {
    val mb = getMethodBind("TranslationServer","set_locale")
    _icall_Unit_String( mb, this.ptr, locale)
  }

  fun translate(message: String): String {
    val mb = getMethodBind("TranslationServer","translate")
    return _icall_String_String( mb, this.ptr, message)
  }
}
