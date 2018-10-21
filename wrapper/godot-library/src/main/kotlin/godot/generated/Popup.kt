@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Popup : Control {
    constructor() : super("Popup")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val POPUP_HIDE: String = "popup_hide"
            const val ABOUT_TO_SHOW: String = "about_to_show"
        }
    }


    companion object {
        infix fun from(other: Control): Popup = Popup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Popup = Popup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Popup = Popup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Popup = Popup("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Popup = fromVariant(Popup(""), other)


        // Constants
        const val NOTIFICATION_POST_POPUP: Long = 80
        const val NOTIFICATION_POPUP_HIDE: Long = 81


    }


    // Properties
    open var popupExclusive: Boolean
        get() = _icall_Boolean(isExclusiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExclusiveMethodBind, this.rawMemory, value)




    // Methods
    private val popupCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("Popup", "popup_centered") }
    open fun popupCentered(size: Vector2 = Vector2(0, 0)) {
        _icall_Unit_Vector2(popupCenteredMethodBind, this.rawMemory, size)
    }


    private val popupCenteredRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("Popup", "popup_centered_ratio") }
    open fun popupCenteredRatio(ratio: Double = 0.75) {
        _icall_Unit_Double(popupCenteredRatioMethodBind, this.rawMemory, ratio)
    }


    private val popupCenteredMinsizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Popup", "popup_centered_minsize") }
    open fun popupCenteredMinsize(minsize: Vector2 = Vector2(0, 0)) {
        _icall_Unit_Vector2(popupCenteredMinsizeMethodBind, this.rawMemory, minsize)
    }


    private val popupMethodBind: CPointer<godot_method_bind> by lazy { getMB("Popup", "popup") }
    open fun popup(bounds: Rect2 = Rect2(0, 0, 0, 0)) {
        _icall_Unit_Rect2(popupMethodBind, this.rawMemory, bounds)
    }


    private val setExclusiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Popup", "set_exclusive") }
    open fun setExclusive(enable: Boolean) {
        _icall_Unit_Boolean(setExclusiveMethodBind, this.rawMemory, enable)
    }


    private val isExclusiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Popup", "is_exclusive") }
    open fun isExclusive(): Boolean {
        return _icall_Boolean(isExclusiveMethodBind, this.rawMemory)
    }


}
