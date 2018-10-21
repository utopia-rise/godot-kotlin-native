@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ScrollBar : Range {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SCROLLING: String = "scrolling"
        }
    }


    companion object {
        infix fun from(other: Range): ScrollBar = ScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ScrollBar = ScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ScrollBar = ScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ScrollBar = ScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ScrollBar = ScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ScrollBar = fromVariant(ScrollBar(""), other)


        // Constants


    }


    // Properties
    open var customStep: Double
        get() = _icall_Double(getCustomStepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCustomStepMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val setCustomStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollBar", "set_custom_step") }
    open fun setCustomStep(step: Double) {
        _icall_Unit_Double(setCustomStepMethodBind, this.rawMemory, step)
    }


    private val getCustomStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("ScrollBar", "get_custom_step") }
    open fun getCustomStep(): Double {
        return _icall_Double(getCustomStepMethodBind, this.rawMemory)
    }


    open fun _drag_slave_input(arg0: InputEvent) {
    }


    open fun _drag_slave_exit() {
    }


}
