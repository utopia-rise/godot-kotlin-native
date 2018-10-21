@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisibilityNotifier : Spatial {
    constructor() : super("VisibilityNotifier")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val CAMERA_EXITED: String = "camera_exited"
            const val SCREEN_ENTERED: String = "screen_entered"
            const val CAMERA_ENTERED: String = "camera_entered"
            const val SCREEN_EXITED: String = "screen_exited"
        }
    }


    companion object {
        infix fun from(other: Spatial): VisibilityNotifier = VisibilityNotifier("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VisibilityNotifier = VisibilityNotifier("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisibilityNotifier = VisibilityNotifier("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisibilityNotifier = fromVariant(VisibilityNotifier(""), other)


        // Constants


    }


    // Properties
    open var aabb: AABB
        get() = _icall_AABB(getAabbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_AABB(setAabbMethodBind, this.rawMemory, value)
    open fun aabb(shedule: (AABB) -> Unit): AABB = aabb.apply {
        shedule(this)
        aabb = this
    }




    // Methods
    private val setAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityNotifier", "set_aabb") }
    open fun setAabb(rect: AABB) {
        _icall_Unit_AABB(setAabbMethodBind, this.rawMemory, rect)
    }


    private val getAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityNotifier", "get_aabb") }
    open fun getAabb(): AABB {
        return _icall_AABB(getAabbMethodBind, this.rawMemory)
    }


    private val isOnScreenMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityNotifier", "is_on_screen") }
    open fun isOnScreen(): Boolean {
        return _icall_Boolean(isOnScreenMethodBind, this.rawMemory)
    }


}
