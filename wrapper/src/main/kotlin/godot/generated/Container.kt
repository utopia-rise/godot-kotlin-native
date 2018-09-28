@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Container : Control {
    constructor() : super("Container")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SORT_CHILDREN: String = "sort_children"
        }
    }


    companion object {
        infix fun from(other: Control): Container = Container("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Container = Container("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Container = Container("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Container = Container("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Container = fromVariant(Container(""), other)


        // Constants
        const val NOTIFICATION_SORT_CHILDREN: Int = 50


    }


    // Properties


    // Methods
    open fun _sort_children() {
    }


    open fun _child_minsize_changed() {
    }


    private val queueSortMethodBind: CPointer<godot_method_bind> by lazy { getMB("Container", "queue_sort") }
    open fun queueSort() {
        _icall_Unit(queueSortMethodBind, this.rawMemory)
    }


    private val fitChildInRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Container", "fit_child_in_rect") }
    open fun fitChildInRect(child: Object, rect: Rect2) {
        _icall_Unit_Object_Rect2(fitChildInRectMethodBind, this.rawMemory, child, rect)
    }


}
