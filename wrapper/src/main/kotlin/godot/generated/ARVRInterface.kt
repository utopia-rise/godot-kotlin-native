@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ARVRInterface : Reference {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Tracking_status(val id: Int) {
        ARVR_NORMAL_TRACKING(0),
        ARVR_EXCESSIVE_MOTION(1),
        ARVR_INSUFFICIENT_FEATURES(2),
        ARVR_UNKNOWN_TRACKING(3),
        ARVR_NOT_TRACKING(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Eyes(val id: Int) {
        EYE_MONO(0),
        EYE_LEFT(1),
        EYE_RIGHT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Capabilities(val id: Int) {
        ARVR_NONE(0),
        ARVR_MONO(1),
        ARVR_STEREO(2),
        ARVR_AR(4),
        ARVR_EXTERNAL(8),
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
        infix fun from(other: Reference): ARVRInterface = ARVRInterface("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ARVRInterface = ARVRInterface("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ARVRInterface = fromVariant(ARVRInterface(""), other)


        // Constants
        const val ARVR_NONE: Int = 0
        const val ARVR_MONO: Int = 1
        const val ARVR_STEREO: Int = 2
        const val ARVR_AR: Int = 4
        const val ARVR_EXTERNAL: Int = 8
        const val EYE_MONO: Int = 0
        const val EYE_LEFT: Int = 1
        const val EYE_RIGHT: Int = 2
        const val ARVR_NORMAL_TRACKING: Int = 0
        const val ARVR_EXCESSIVE_MOTION: Int = 1
        const val ARVR_INSUFFICIENT_FEATURES: Int = 2
        const val ARVR_UNKNOWN_TRACKING: Int = 3
        const val ARVR_NOT_TRACKING: Int = 4


    }


    // Properties
    open var interfaceIsPrimary: Boolean
        get() = _icall_Boolean(isPrimaryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setIsPrimaryMethodBind, this.rawMemory, value)


    open var interfaceIsInitialized: Boolean
        get() = _icall_Boolean(isInitializedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setIsInitializedMethodBind, this.rawMemory, value)


    open var arIsAnchorDetectionEnabled: Boolean
        get() = _icall_Boolean(getAnchorDetectionIsEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAnchorDetectionIsEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val getNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "get_name") }
    open fun getName(): String {
        return _icall_String(getNameMethodBind, this.rawMemory)
    }


    private val getCapabilitiesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "get_capabilities") }
    open fun getCapabilities(): Int {
        return _icall_Int(getCapabilitiesMethodBind, this.rawMemory)
    }


    private val isPrimaryMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "is_primary") }
    open fun isPrimary(): Boolean {
        return _icall_Boolean(isPrimaryMethodBind, this.rawMemory)
    }


    private val setIsPrimaryMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "set_is_primary") }
    open fun setIsPrimary(enable: Boolean) {
        _icall_Unit_Boolean(setIsPrimaryMethodBind, this.rawMemory, enable)
    }


    private val isInitializedMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "is_initialized") }
    open fun isInitialized(): Boolean {
        return _icall_Boolean(isInitializedMethodBind, this.rawMemory)
    }


    private val setIsInitializedMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "set_is_initialized") }
    open fun setIsInitialized(initialized: Boolean) {
        _icall_Unit_Boolean(setIsInitializedMethodBind, this.rawMemory, initialized)
    }


    private val initializeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "initialize") }
    open fun initialize(): Boolean {
        return _icall_Boolean(initializeMethodBind, this.rawMemory)
    }


    private val uninitializeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "uninitialize") }
    open fun uninitialize() {
        _icall_Unit(uninitializeMethodBind, this.rawMemory)
    }


    private val getTrackingStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "get_tracking_status") }
    open fun getTrackingStatus(): ARVRInterface.Tracking_status {
        return ARVRInterface.Tracking_status.fromInt(_icall_Int(getTrackingStatusMethodBind, this.rawMemory))
    }


    private val getRenderTargetsizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "get_render_targetsize") }
    open fun getRenderTargetsize(): Vector2 {
        return _icall_Vector2(getRenderTargetsizeMethodBind, this.rawMemory)
    }


    private val isStereoMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "is_stereo") }
    open fun isStereo(): Boolean {
        return _icall_Boolean(isStereoMethodBind, this.rawMemory)
    }


    private val getAnchorDetectionIsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "get_anchor_detection_is_enabled") }
    open fun getAnchorDetectionIsEnabled(): Boolean {
        return _icall_Boolean(getAnchorDetectionIsEnabledMethodBind, this.rawMemory)
    }


    private val setAnchorDetectionIsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRInterface", "set_anchor_detection_is_enabled") }
    open fun setAnchorDetectionIsEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setAnchorDetectionIsEnabledMethodBind, this.rawMemory, enable)
    }


}
