@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ColorRect : Control {
    constructor() : super("ColorRect")
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
        infix fun from(other: Control): ColorRect = ColorRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ColorRect = ColorRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ColorRect = ColorRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ColorRect = ColorRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ColorRect = fromVariant(ColorRect(""), other)


        // Constants


    }


    // Properties
    open var color: Color
        get() = _icall_Color(getFrameColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setFrameColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }




    // Methods
    private val setFrameColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorRect", "set_frame_color") }
    open fun setFrameColor(color: Color) {
        _icall_Unit_Color(setFrameColorMethodBind, this.rawMemory, color)
    }


    private val getFrameColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorRect", "get_frame_color") }
    open fun getFrameColor(): Color {
        return _icall_Color(getFrameColorMethodBind, this.rawMemory)
    }


}
