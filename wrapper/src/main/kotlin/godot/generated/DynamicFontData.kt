@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class DynamicFontData : Resource {
    constructor() : super("DynamicFontData")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Hinting(val id: Int) {
        HINTING_NONE(0),
        HINTING_LIGHT(1),
        HINTING_NORMAL(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): DynamicFontData = DynamicFontData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): DynamicFontData = DynamicFontData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): DynamicFontData = DynamicFontData("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): DynamicFontData = fromVariant(DynamicFontData(""), other)


        // Constants
        const val HINTING_NONE: Int = 0
        const val HINTING_LIGHT: Int = 1
        const val HINTING_NORMAL: Int = 2


    }


    // Properties
    open var hinting: Int
        get() = _icall_Int(getHintingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setHintingMethodBind, this.rawMemory, value)


    open var fontPath: String
        get() = _icall_String(getFontPathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setFontPathMethodBind, this.rawMemory, value)




    // Methods
    private val setFontPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFontData", "set_font_path") }
    open fun setFontPath(path: String) {
        _icall_Unit_String(setFontPathMethodBind, this.rawMemory, path)
    }


    private val getFontPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFontData", "get_font_path") }
    open fun getFontPath(): String {
        return _icall_String(getFontPathMethodBind, this.rawMemory)
    }


    private val setHintingMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFontData", "set_hinting") }
    open fun setHinting(mode: Int) {
        _icall_Unit_Int(setHintingMethodBind, this.rawMemory, mode)
    }


    private val getHintingMethodBind: CPointer<godot_method_bind> by lazy { getMB("DynamicFontData", "get_hinting") }
    open fun getHinting(): DynamicFontData.Hinting {
        return DynamicFontData.Hinting.fromInt(_icall_Int(getHintingMethodBind, this.rawMemory))
    }


}
