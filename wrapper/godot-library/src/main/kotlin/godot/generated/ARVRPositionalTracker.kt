@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ARVRPositionalTracker : Object {
    constructor() : super("ARVRPositionalTracker")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TrackerHand(val id: Long) {
        TRACKER_HAND_UNKNOWN(0),
        TRACKER_LEFT_HAND(1),
        TRACKER_RIGHT_HAND(2),
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
        infix fun from(other: Object): ARVRPositionalTracker = ARVRPositionalTracker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ARVRPositionalTracker = fromVariant(ARVRPositionalTracker(""), other)


        // Constants
        const val TRACKER_HAND_UNKNOWN: Long = 0
        const val TRACKER_LEFT_HAND: Long = 1
        const val TRACKER_RIGHT_HAND: Long = 2


    }


    // Properties
    open var rumble: Double
        get() = _icall_Double(getRumbleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRumbleMethodBind, this.rawMemory, value)




    // Methods
    private val getTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_type") }
    open fun getType(): ARVRServer.TrackerType {
        return ARVRServer.TrackerType.fromInt(_icall_Long(getTypeMethodBind, this.rawMemory))
    }


    private val getNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_name") }
    open fun getName(): String {
        return _icall_String(getNameMethodBind, this.rawMemory)
    }


    private val getJoyIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_joy_id") }
    open fun getJoyId(): Long {
        return _icall_Long(getJoyIdMethodBind, this.rawMemory)
    }


    private val getTracksOrientationMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_tracks_orientation") }
    open fun getTracksOrientation(): Boolean {
        return _icall_Boolean(getTracksOrientationMethodBind, this.rawMemory)
    }


    private val getOrientationMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_orientation") }
    open fun getOrientation(): Basis {
        return _icall_Basis(getOrientationMethodBind, this.rawMemory)
    }


    private val getTracksPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_tracks_position") }
    open fun getTracksPosition(): Boolean {
        return _icall_Boolean(getTracksPositionMethodBind, this.rawMemory)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_position") }
    open fun getPosition(): Vector3 {
        return _icall_Vector3(getPositionMethodBind, this.rawMemory)
    }


    private val getHandMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_hand") }
    open fun getHand(): ARVRPositionalTracker.TrackerHand {
        return ARVRPositionalTracker.TrackerHand.fromInt(_icall_Long(getHandMethodBind, this.rawMemory))
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_transform") }
    open fun getTransform(adjustByReferenceFrame: Boolean): Transform {
        return _icall_Transform_Boolean(getTransformMethodBind, this.rawMemory, adjustByReferenceFrame)
    }


    open fun _set_type(type: Long) {
    }


    open fun _set_name(name: String) {
    }


    open fun _set_joy_id(joyId: Long) {
    }


    open fun _set_orientation(orientation: Basis) {
    }


    open fun _set_rw_position(rwPosition: Vector3) {
    }


    private val getRumbleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "get_rumble") }
    open fun getRumble(): Double {
        return _icall_Double(getRumbleMethodBind, this.rawMemory)
    }


    private val setRumbleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRPositionalTracker", "set_rumble") }
    open fun setRumble(rumble: Double) {
        _icall_Unit_Double(setRumbleMethodBind, this.rawMemory, rumble)
    }


}
