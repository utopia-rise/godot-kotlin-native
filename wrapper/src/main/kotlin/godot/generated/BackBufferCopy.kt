@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BackBufferCopy : Node2D {
    constructor() : super("BackBufferCopy")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class CopyMode(val id: Int) {
        COPY_MODE_DISABLED(0),
        COPY_MODE_RECT(1),
        COPY_MODE_VIEWPORT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Node2D): BackBufferCopy = BackBufferCopy("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): BackBufferCopy = BackBufferCopy("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): BackBufferCopy = BackBufferCopy("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BackBufferCopy = BackBufferCopy("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BackBufferCopy = fromVariant(BackBufferCopy(""), other)


        // Constants
        const val COPY_MODE_DISABLED: Int = 0
        const val COPY_MODE_RECT: Int = 1
        const val COPY_MODE_VIEWPORT: Int = 2


    }


    // Properties
    open var copyMode: Int
        get() = _icall_Int(getCopyModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCopyModeMethodBind, this.rawMemory, value)


    open var rect: Rect2
        get() = _icall_Rect2(getRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRectMethodBind, this.rawMemory, value)
    open fun rect(shedule: (Rect2) -> Unit): Rect2 = rect.apply {
        shedule(this)
        rect = this
    }




    // Methods
    private val setRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("BackBufferCopy", "set_rect") }
    open fun setRect(rect: Rect2) {
        _icall_Unit_Rect2(setRectMethodBind, this.rawMemory, rect)
    }


    private val getRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("BackBufferCopy", "get_rect") }
    open fun getRect(): Rect2 {
        return _icall_Rect2(getRectMethodBind, this.rawMemory)
    }


    private val setCopyModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BackBufferCopy", "set_copy_mode") }
    open fun setCopyMode(copyMode: Int) {
        _icall_Unit_Int(setCopyModeMethodBind, this.rawMemory, copyMode)
    }


    private val getCopyModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BackBufferCopy", "get_copy_mode") }
    open fun getCopyMode(): BackBufferCopy.CopyMode {
        return BackBufferCopy.CopyMode.fromInt(_icall_Int(getCopyModeMethodBind, this.rawMemory))
    }


}
