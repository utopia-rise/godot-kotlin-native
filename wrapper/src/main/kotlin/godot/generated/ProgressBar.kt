@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ProgressBar : Range {
    constructor() : super("ProgressBar")
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
        infix fun from(other: Range): ProgressBar = ProgressBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ProgressBar = ProgressBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ProgressBar = ProgressBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ProgressBar = ProgressBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ProgressBar = ProgressBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ProgressBar = fromVariant(ProgressBar(""), other)


        // Constants


    }


    // Properties
    open var percentVisible: Boolean
        get() = _icall_Boolean(isPercentVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPercentVisibleMethodBind, this.rawMemory, value)




    // Methods
    private val setPercentVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProgressBar", "set_percent_visible") }
    open fun setPercentVisible(visible: Boolean) {
        _icall_Unit_Boolean(setPercentVisibleMethodBind, this.rawMemory, visible)
    }


    private val isPercentVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProgressBar", "is_percent_visible") }
    open fun isPercentVisible(): Boolean {
        return _icall_Boolean(isPercentVisibleMethodBind, this.rawMemory)
    }


}
