@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisibilityEnabler2D : VisibilityNotifier2D {
    constructor() : super("VisibilityEnabler2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Enabler(val id: Long) {
        ENABLER_PAUSE_ANIMATIONS(0),
        ENABLER_FREEZE_BODIES(1),
        ENABLER_PAUSE_PARTICLES(2),
        ENABLER_PARENT_PROCESS(3),
        ENABLER_PARENT_PHYSICS_PROCESS(4),
        ENABLER_PAUSE_ANIMATED_SPRITES(5),
        ENABLER_MAX(6),
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
        infix fun from(other: VisibilityNotifier2D): VisibilityEnabler2D = VisibilityEnabler2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): VisibilityEnabler2D = VisibilityEnabler2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VisibilityEnabler2D = VisibilityEnabler2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VisibilityEnabler2D = VisibilityEnabler2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisibilityEnabler2D = VisibilityEnabler2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisibilityEnabler2D = fromVariant(VisibilityEnabler2D(""), other)


        // Constants
        const val ENABLER_PAUSE_ANIMATIONS: Long = 0
        const val ENABLER_FREEZE_BODIES: Long = 1
        const val ENABLER_PAUSE_PARTICLES: Long = 2
        const val ENABLER_PARENT_PROCESS: Long = 3
        const val ENABLER_PARENT_PHYSICS_PROCESS: Long = 4
        const val ENABLER_PAUSE_ANIMATED_SPRITES: Long = 5
        const val ENABLER_MAX: Long = 6


    }


    // Properties
    open var pauseAnimations: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 0, value)


    open var freezeBodies: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 1, value)


    open var pauseParticles: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 2, value)


    open var pauseAnimatedSprites: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 5, value)


    open var processParent: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 3, value)


    open var physicsProcessParent: Boolean
        get() = _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, 4, value)




    // Methods
    private val setEnablerMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityEnabler2D", "set_enabler") }
    open fun setEnabler(enabler: Long, enabled: Boolean) {
        _icall_Unit_Long_Boolean(setEnablerMethodBind, this.rawMemory, enabler, enabled)
    }


    private val isEnablerEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisibilityEnabler2D", "is_enabler_enabled") }
    open fun isEnablerEnabled(enabler: Long): Boolean {
        return _icall_Boolean_Long(isEnablerEnabledMethodBind, this.rawMemory, enabler)
    }


    open fun _node_removed(arg0: Object) {
    }


}
