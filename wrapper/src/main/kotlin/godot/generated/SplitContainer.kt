@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SplitContainer : Container {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DraggerVisibility(val id: Long) {
        DRAGGER_VISIBLE(0),
        DRAGGER_HIDDEN(1),
        DRAGGER_HIDDEN_COLLAPSED(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val DRAGGED: String = "dragged"
        }
    }


    companion object {
        infix fun from(other: Container): SplitContainer = SplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): SplitContainer = SplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): SplitContainer = SplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): SplitContainer = SplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SplitContainer = SplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SplitContainer = fromVariant(SplitContainer(""), other)


        // Constants
        const val DRAGGER_VISIBLE: Long = 0
        const val DRAGGER_HIDDEN: Long = 1
        const val DRAGGER_HIDDEN_COLLAPSED: Long = 2


    }


    // Properties
    open var splitOffset: Long
        get() = _icall_Long(getSplitOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSplitOffsetMethodBind, this.rawMemory, value)


    open var collapsed: Boolean
        get() = _icall_Boolean(isCollapsedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCollapsedMethodBind, this.rawMemory, value)


    open var draggerVisibility: Long
        get() = _icall_Long(getDraggerVisibilityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDraggerVisibilityMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val setSplitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SplitContainer", "set_split_offset") }
    open fun setSplitOffset(offset: Long) {
        _icall_Unit_Long(setSplitOffsetMethodBind, this.rawMemory, offset)
    }


    private val getSplitOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SplitContainer", "get_split_offset") }
    open fun getSplitOffset(): Long {
        return _icall_Long(getSplitOffsetMethodBind, this.rawMemory)
    }


    private val setCollapsedMethodBind: CPointer<godot_method_bind> by lazy { getMB("SplitContainer", "set_collapsed") }
    open fun setCollapsed(collapsed: Boolean) {
        _icall_Unit_Boolean(setCollapsedMethodBind, this.rawMemory, collapsed)
    }


    private val isCollapsedMethodBind: CPointer<godot_method_bind> by lazy { getMB("SplitContainer", "is_collapsed") }
    open fun isCollapsed(): Boolean {
        return _icall_Boolean(isCollapsedMethodBind, this.rawMemory)
    }


    private val setDraggerVisibilityMethodBind: CPointer<godot_method_bind> by lazy { getMB("SplitContainer", "set_dragger_visibility") }
    open fun setDraggerVisibility(mode: Long) {
        _icall_Unit_Long(setDraggerVisibilityMethodBind, this.rawMemory, mode)
    }


    private val getDraggerVisibilityMethodBind: CPointer<godot_method_bind> by lazy { getMB("SplitContainer", "get_dragger_visibility") }
    open fun getDraggerVisibility(): SplitContainer.DraggerVisibility {
        return SplitContainer.DraggerVisibility.fromInt(_icall_Long(getDraggerVisibilityMethodBind, this.rawMemory))
    }


}
