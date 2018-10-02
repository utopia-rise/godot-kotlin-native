@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ShortCut : Resource {
    constructor() : super("ShortCut")
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
        infix fun from(other: Resource): ShortCut = ShortCut("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ShortCut = ShortCut("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ShortCut = ShortCut("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ShortCut = fromVariant(ShortCut(""), other)


        // Constants


    }


    // Properties
    open var shortcut: InputEvent
        get() = _icall_InputEvent(getShortcutMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setShortcutMethodBind, this.rawMemory, value)




    // Methods
    private val setShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShortCut", "set_shortcut") }
    open fun setShortcut(event: InputEvent) {
        _icall_Unit_Object(setShortcutMethodBind, this.rawMemory, event)
    }


    private val getShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShortCut", "get_shortcut") }
    open fun getShortcut(): InputEvent {
        return _icall_InputEvent(getShortcutMethodBind, this.rawMemory)
    }


    private val isValidMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShortCut", "is_valid") }
    open fun isValid(): Boolean {
        return _icall_Boolean(isValidMethodBind, this.rawMemory)
    }


    private val isShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShortCut", "is_shortcut") }
    open fun isShortcut(event: InputEvent): Boolean {
        return _icall_Boolean_Object(isShortcutMethodBind, this.rawMemory, event)
    }


    private val getAsTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShortCut", "get_as_text") }
    open fun getAsText(): String {
        return _icall_String(getAsTextMethodBind, this.rawMemory)
    }


}
