@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TranslationServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): TranslationServer = TranslationServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TranslationServer = fromVariant(TranslationServer(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("TranslationServer", "TranslationServer") }


        // Properties


        // Methods
        private val setLocaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "set_locale") }
        fun setLocale(locale: String) {
            _icall_Unit_String(setLocaleMethodBind, this.rawMemory, locale)
        }


        private val getLocaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "get_locale") }
        fun getLocale(): String {
            return _icall_String(getLocaleMethodBind, this.rawMemory)
        }


        private val getLocaleNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "get_locale_name") }
        fun getLocaleName(locale: String): String {
            return _icall_String_String(getLocaleNameMethodBind, this.rawMemory, locale)
        }


        private val translateMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "translate") }
        fun translate(message: String): String {
            return _icall_String_String(translateMethodBind, this.rawMemory, message)
        }


        private val addTranslationMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "add_translation") }
        fun addTranslation(translation: Translation) {
            _icall_Unit_Object(addTranslationMethodBind, this.rawMemory, translation)
        }


        private val removeTranslationMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "remove_translation") }
        fun removeTranslation(translation: Translation) {
            _icall_Unit_Object(removeTranslationMethodBind, this.rawMemory, translation)
        }


        private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("TranslationServer", "clear") }
        fun clear() {
            _icall_Unit(clearMethodBind, this.rawMemory)
        }


    }
}
