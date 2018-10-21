@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisibilityEnabler : VisibilityNotifier {
    constructor() : super("VisibilityEnabler")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Enabler(val id: Long) {
        ENABLER_PAUSE_ANIMATIONS(0),
        ENABLER_FREEZE_BODIES(1),
        ENABLER_MAX(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisibilityNotifier): VisibilityEnabler = VisibilityEnabler("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): VisibilityEnabler = VisibilityEnabler("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VisibilityEnabler = VisibilityEnabler("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisibilityEnabler = VisibilityEnabler("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisibilityEnabler = fromVariant(VisibilityEnabler(""), other)


        // Constants
        const val ENABLER_PAUSE_ANIMATIONS: Long = 0
        const val ENABLER_FREEZE_BODIES: Long = 1
        const val ENABLER_MAX: Long = 2


    }


    // Properties
    open var pauseAnimations: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 0, value)


    open var freezeBodies: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 1, value)




    // Methods
    private val setEnablerMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityEnabler", "set_enabler") }
    open fun setEnabler(enabler: Long, enabled: Boolean) {
        _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, enabler, enabled)
    }


    private val isEnablerEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityEnabler", "is_enabler_enabled") }
    open fun isEnablerEnabled(enabler: Long): Boolean {
        return _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, enabler)
    }


    open fun _node_removed(arg0: Object) {
    }


}
