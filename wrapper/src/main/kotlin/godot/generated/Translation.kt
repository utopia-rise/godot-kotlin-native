@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Translation : Resource {
    constructor() : super("Translation")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): Translation = Translation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Translation = Translation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Translation = Translation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Translation = fromVariant(Translation(""), other)


        // Constants


    }


    // Properties
    open var locale: String
        get() = _icall_String(getLocaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setLocaleMethodBind, this.rawMemory, value)




    // Methods
    private val setLocaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "set_locale") }
    open fun setLocale(locale: String) {
        _icall_Unit_String(setLocaleMethodBind, this.rawMemory, locale)
    }


    private val getLocaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "get_locale") }
    open fun getLocale(): String {
        return _icall_String(getLocaleMethodBind, this.rawMemory)
    }


    private val addMessageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "add_message") }
    open fun addMessage(srcMessage: String, xlatedMessage: String) {
        _icall_Unit_String_String(addMessageMethodBind, this.rawMemory, srcMessage, xlatedMessage)
    }


    private val getMessageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "get_message") }
    open fun getMessage(srcMessage: String): String {
        return _icall_String_String(getMessageMethodBind, this.rawMemory, srcMessage)
    }


    private val eraseMessageMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "erase_message") }
    open fun eraseMessage(srcMessage: String) {
        _icall_Unit_String(eraseMessageMethodBind, this.rawMemory, srcMessage)
    }


    private val getMessageListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "get_message_list") }
    open fun getMessageList(): PoolStringArray {
        return _icall_PoolStringArray(getMessageListMethodBind, this.rawMemory)
    }


    private val getMessageCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Translation", "get_message_count") }
    open fun getMessageCount(): Int {
        return _icall_Int(getMessageCountMethodBind, this.rawMemory)
    }


    open fun _set_messages(arg0: PoolStringArray) {
    }


    open fun _get_messages(): PoolStringArray {
        throw NotImplementedError("_get_messages is not implemented for Translation")
    }


}
