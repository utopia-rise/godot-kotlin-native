@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CanvasModulate : Node2D {
    constructor() : super("CanvasModulate")
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
        infix fun from(other: Node2D): CanvasModulate = CanvasModulate("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CanvasModulate = CanvasModulate("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CanvasModulate = CanvasModulate("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CanvasModulate = CanvasModulate("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CanvasModulate = fromVariant(CanvasModulate(""), other)


        // Constants


    }


    // Properties
    open var color: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }




    // Methods
    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasModulate", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasModulate", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


}
