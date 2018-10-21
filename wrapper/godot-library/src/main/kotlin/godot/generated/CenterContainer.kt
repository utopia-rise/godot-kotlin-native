@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CenterContainer : Container {
    constructor() : super("CenterContainer")
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
        infix fun from(other: Container): CenterContainer = CenterContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): CenterContainer = CenterContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CenterContainer = CenterContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CenterContainer = CenterContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CenterContainer = CenterContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CenterContainer = fromVariant(CenterContainer(""), other)


        // Constants


    }


    // Properties
    open var useTopLeft: Boolean
        get() = _icall_Boolean(isUsingTopLeftMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseTopLeftMethodBind, this.rawMemory, value)




    // Methods
    private val setUseTopLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("CenterContainer", "set_use_top_left") }
    open fun setUseTopLeft(enable: Boolean) {
        _icall_Unit_Boolean(setUseTopLeftMethodBind, this.rawMemory, enable)
    }


    private val isUsingTopLeftMethodBind: CPointer<godot_method_bind> by lazy { getMB("CenterContainer", "is_using_top_left") }
    open fun isUsingTopLeft(): Boolean {
        return _icall_Boolean(isUsingTopLeftMethodBind, this.rawMemory)
    }


}
