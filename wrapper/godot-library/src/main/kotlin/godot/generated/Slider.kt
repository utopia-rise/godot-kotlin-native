@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Slider : Range {
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


    companion object {
        infix fun from(other: Range): Slider = Slider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): Slider = Slider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Slider = Slider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Slider = Slider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Slider = Slider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Slider = fromVariant(Slider(""), other)


        // Constants


    }


    // Properties
    open var editable: Boolean
        get() = _icall_Boolean(isEditableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEditableMethodBind, this.rawMemory, value)


    open var scrollable: Boolean
        get() = _icall_Boolean(isScrollableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setScrollableMethodBind, this.rawMemory, value)


    open var tickCount: Long
        get() = _icall_Long(getTicksMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTicksMethodBind, this.rawMemory, value)


    open var ticksOnBorders: Boolean
        get() = _icall_Boolean(getTicksOnBordersMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTicksOnBordersMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val setTicksMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "set_ticks") }
    open fun setTicks(count: Long) {
        _icall_Unit_Long(setTicksMethodBind, this.rawMemory, count)
    }


    private val getTicksMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "get_ticks") }
    open fun getTicks(): Long {
        return _icall_Long(getTicksMethodBind, this.rawMemory)
    }


    private val getTicksOnBordersMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "get_ticks_on_borders") }
    open fun getTicksOnBorders(): Boolean {
        return _icall_Boolean(getTicksOnBordersMethodBind, this.rawMemory)
    }


    private val setTicksOnBordersMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "set_ticks_on_borders") }
    open fun setTicksOnBorders(ticksOnBorder: Boolean) {
        _icall_Unit_Boolean(setTicksOnBordersMethodBind, this.rawMemory, ticksOnBorder)
    }


    private val setEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "set_editable") }
    open fun setEditable(editable: Boolean) {
        _icall_Unit_Boolean(setEditableMethodBind, this.rawMemory, editable)
    }


    private val isEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "is_editable") }
    open fun isEditable(): Boolean {
        return _icall_Boolean(isEditableMethodBind, this.rawMemory)
    }


    private val setScrollableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "set_scrollable") }
    open fun setScrollable(scrollable: Boolean) {
        _icall_Unit_Boolean(setScrollableMethodBind, this.rawMemory, scrollable)
    }


    private val isScrollableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Slider", "is_scrollable") }
    open fun isScrollable(): Boolean {
        return _icall_Boolean(isScrollableMethodBind, this.rawMemory)
    }


}
