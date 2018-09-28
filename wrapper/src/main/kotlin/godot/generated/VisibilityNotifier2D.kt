@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisibilityNotifier2D : Node2D {
    constructor() : super("VisibilityNotifier2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SCREEN_ENTERED: String = "screen_entered"
            const val VIEWPORT_ENTERED: String = "viewport_entered"
            const val SCREEN_EXITED: String = "screen_exited"
            const val VIEWPORT_EXITED: String = "viewport_exited"
        }
    }


    companion object {
        infix fun from(other: Node2D): VisibilityNotifier2D = VisibilityNotifier2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VisibilityNotifier2D = VisibilityNotifier2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VisibilityNotifier2D = VisibilityNotifier2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisibilityNotifier2D = VisibilityNotifier2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisibilityNotifier2D = fromVariant(VisibilityNotifier2D(""), other)


        // Constants


    }


    // Properties
    open var rect: Rect2
        get() = _icall_Rect2(getRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRectMethodBind, this.rawMemory, value)
    open fun rect(shedule: (Rect2) -> Unit): Rect2 = rect.apply {
        shedule(this)
        rect = this
    }




    // Methods
    private val setRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityNotifier2D", "set_rect") }
    open fun setRect(rect: Rect2) {
        _icall_Unit_Rect2(setRectMethodBind, this.rawMemory, rect)
    }


    private val getRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityNotifier2D", "get_rect") }
    open fun getRect(): Rect2 {
        return _icall_Rect2(getRectMethodBind, this.rawMemory)
    }


    private val isOnScreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityNotifier2D", "is_on_screen") }
    open fun isOnScreen(): Boolean {
        return _icall_Boolean(isOnScreenMethodBind, this.rawMemory)
    }


}
