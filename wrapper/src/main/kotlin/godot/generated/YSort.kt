@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class YSort : Node2D {
    constructor() : super("YSort")
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
        infix fun from(other: Node2D): YSort = YSort("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): YSort = YSort("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): YSort = YSort("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): YSort = YSort("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): YSort = fromVariant(YSort(""), other)


        // Constants


    }


    // Properties
    open var sortEnabled: Boolean
        get() = _icall_Boolean(isSortEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSortEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val setSortEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("YSort", "set_sort_enabled") }
    open fun setSortEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setSortEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isSortEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("YSort", "is_sort_enabled") }
    open fun isSortEnabled(): Boolean {
        return _icall_Boolean(isSortEnabledMethodBind, this.rawMemory)
    }


}
