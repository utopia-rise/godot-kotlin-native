@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GridContainer : Container {
    constructor() : super("GridContainer")
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
        infix fun from(other: Container): GridContainer = GridContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): GridContainer = GridContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): GridContainer = GridContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GridContainer = GridContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GridContainer = GridContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GridContainer = fromVariant(GridContainer(""), other)


        // Constants


    }


    // Properties
    open var columns: Long
        get() = _icall_Long(getColumnsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setColumnsMethodBind, this.rawMemory, value)




    // Methods
    private val setColumnsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridContainer", "set_columns") }
    open fun setColumns(columns: Long) {
        _icall_Unit_Long(setColumnsMethodBind, this.rawMemory, columns)
    }


    private val getColumnsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridContainer", "get_columns") }
    open fun getColumns(): Long {
        return _icall_Long(getColumnsMethodBind, this.rawMemory)
    }


    private val getChildControlAtCellMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridContainer", "get_child_control_at_cell") }
    open fun getChildControlAtCell(row: Long, column: Long): Control {
        return _icall_Control_Long_Long(getChildControlAtCellMethodBind, this.rawMemory, row, column)
    }


}
