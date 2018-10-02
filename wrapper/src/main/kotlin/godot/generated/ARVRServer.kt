@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ARVRServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class RotationMode(val id: Int) {
        RESET_FULL_ROTATION(0),
        RESET_BUT_KEEP_TILT(1),
        DONT_RESET_ROTATION(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class TrackerType(val id: Int) {
        TRACKER_CONTROLLER(1),
        TRACKER_BASESTATION(2),
        TRACKER_ANCHOR(4),
        TRACKER_ANY_KNOWN(127),
        TRACKER_UNKNOWN(128),
        TRACKER_ANY(255),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val TRACKER_REMOVED: String = "tracker_removed"
            const val TRACKER_ADDED: String = "tracker_added"
            const val INTERFACE_REMOVED: String = "interface_removed"
            const val INTERFACE_ADDED: String = "interface_added"
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): ARVRServer = ARVRServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ARVRServer = fromVariant(ARVRServer(""), other)


        // Constants
        const val TRACKER_CONTROLLER: Int = 1
        const val TRACKER_BASESTATION: Int = 2
        const val TRACKER_ANCHOR: Int = 4
        const val TRACKER_ANY_KNOWN: Int = 127
        const val TRACKER_UNKNOWN: Int = 128
        const val TRACKER_ANY: Int = 255
        const val RESET_FULL_ROTATION: Int = 0
        const val RESET_BUT_KEEP_TILT: Int = 1
        const val DONT_RESET_ROTATION: Int = 2


        private val rawMemory: COpaquePointer by lazy { getSingleton("ARVRServer", "ARVRServer") }


        // Properties
        var worldScale: Float
            get() = _icall_Float(getWorldScaleMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Float(setWorldScaleMethodBind, this.rawMemory, value)


        var primaryInterface: Object
            get() = _icall_Object(getPrimaryInterfaceMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Object(setPrimaryInterfaceMethodBind, this.rawMemory, value)




        // Methods
        private val getWorldScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_world_scale") }
        fun getWorldScale(): Float {
            return _icall_Float(getWorldScaleMethodBind, this.rawMemory)
        }


        private val setWorldScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "set_world_scale") }
        fun setWorldScale(arg0: Float) {
            _icall_Unit_Float(setWorldScaleMethodBind, this.rawMemory, arg0)
        }


        private val getReferenceFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_reference_frame") }
        fun getReferenceFrame(): Transform {
            return _icall_Transform(getReferenceFrameMethodBind, this.rawMemory)
        }


        private val centerOnHmdMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "center_on_hmd") }
        fun centerOnHmd(rotationMode: Int, keepHeight: Boolean) {
            _icall_Unit_Int_Boolean(centerOnHmdMethodBind, this.rawMemory, rotationMode, keepHeight)
        }


        private val getHmdTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_hmd_transform") }
        fun getHmdTransform(): Transform {
            return _icall_Transform(getHmdTransformMethodBind, this.rawMemory)
        }


        private val getInterfaceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_interface_count") }
        fun getInterfaceCount(): Int {
            return _icall_Int(getInterfaceCountMethodBind, this.rawMemory)
        }


        private val getInterfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_interface") }
        fun getInterface(idx: Int): ARVRInterface {
            return _icall_ARVRInterface_Int(getInterfaceMethodBind, this.rawMemory, idx)
        }


        private val getInterfacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_interfaces") }
        fun getInterfaces(): GDArray {
            return _icall_GDArray(getInterfacesMethodBind, this.rawMemory)
        }


        private val findInterfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "find_interface") }
        fun findInterface(name: String): ARVRInterface {
            return _icall_ARVRInterface_String(findInterfaceMethodBind, this.rawMemory, name)
        }


        private val getTrackerCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_tracker_count") }
        fun getTrackerCount(): Int {
            return _icall_Int(getTrackerCountMethodBind, this.rawMemory)
        }


        private val getTrackerMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_tracker") }
        fun getTracker(idx: Int): ARVRPositionalTracker {
            return _icall_ARVRPositionalTracker_Int(getTrackerMethodBind, this.rawMemory, idx)
        }


        private val getPrimaryInterfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_primary_interface") }
        fun getPrimaryInterface(): ARVRInterface {
            return _icall_ARVRInterface(getPrimaryInterfaceMethodBind, this.rawMemory)
        }


        private val setPrimaryInterfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "set_primary_interface") }
        fun setPrimaryInterface(_interface: ARVRInterface) {
            _icall_Unit_Object(setPrimaryInterfaceMethodBind, this.rawMemory, _interface)
        }


        private val getLastProcessUsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_last_process_usec") }
        fun getLastProcessUsec(): Int {
            return _icall_Int(getLastProcessUsecMethodBind, this.rawMemory)
        }


        private val getLastCommitUsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_last_commit_usec") }
        fun getLastCommitUsec(): Int {
            return _icall_Int(getLastCommitUsecMethodBind, this.rawMemory)
        }


        private val getLastFrameUsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRServer", "get_last_frame_usec") }
        fun getLastFrameUsec(): Int {
            return _icall_Int(getLastFrameUsecMethodBind, this.rawMemory)
        }


    }
}
