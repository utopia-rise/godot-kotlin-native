@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ViewportContainer : Container {
    constructor() : super("ViewportContainer")
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
        infix fun from(other: Container): ViewportContainer = ViewportContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ViewportContainer = ViewportContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ViewportContainer = ViewportContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ViewportContainer = ViewportContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ViewportContainer = ViewportContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ViewportContainer = fromVariant(ViewportContainer(""), other)


        // Constants


    }


    // Properties
    open var stretch: Boolean
        get() = _icall_Boolean(isStretchEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setStretchMethodBind, this.rawMemory, value)


    open var stretchShrink: Long
        get() = _icall_Long(getStretchShrinkMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setStretchShrinkMethodBind, this.rawMemory, value)




    // Methods
    override fun _input(event: InputEvent) {
    }


    private val setStretchMethodBind: CPointer<godot_method_bind> by lazy { getMB("ViewportContainer", "set_stretch") }
    open fun setStretch(enable: Boolean) {
        _icall_Unit_Boolean(setStretchMethodBind, this.rawMemory, enable)
    }


    private val isStretchEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ViewportContainer", "is_stretch_enabled") }
    open fun isStretchEnabled(): Boolean {
        return _icall_Boolean(isStretchEnabledMethodBind, this.rawMemory)
    }


    private val setStretchShrinkMethodBind: CPointer<godot_method_bind> by lazy { getMB("ViewportContainer", "set_stretch_shrink") }
    open fun setStretchShrink(amount: Long) {
        _icall_Unit_Long(setStretchShrinkMethodBind, this.rawMemory, amount)
    }


    private val getStretchShrinkMethodBind: CPointer<godot_method_bind> by lazy { getMB("ViewportContainer", "get_stretch_shrink") }
    open fun getStretchShrink(): Long {
        return _icall_Long(getStretchShrinkMethodBind, this.rawMemory)
    }


}
