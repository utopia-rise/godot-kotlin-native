@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Camera : Spatial {
    constructor() : super("Camera")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class KeepAspect(val id: Long) {
        KEEP_WIDTH(0),
        KEEP_HEIGHT(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Projection(val id: Long) {
        PROJECTION_PERSPECTIVE(0),
        PROJECTION_ORTHOGONAL(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DopplerTracking(val id: Long) {
        DOPPLER_TRACKING_DISABLED(0),
        DOPPLER_TRACKING_IDLE_STEP(1),
        DOPPLER_TRACKING_PHYSICS_STEP(2),
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
        infix fun from(other: Spatial): Camera = Camera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Camera = Camera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Camera = Camera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Camera = fromVariant(Camera(""), other)


        // Constants
        const val PROJECTION_PERSPECTIVE: Long = 0
        const val PROJECTION_ORTHOGONAL: Long = 1
        const val KEEP_WIDTH: Long = 0
        const val KEEP_HEIGHT: Long = 1
        const val DOPPLER_TRACKING_DISABLED: Long = 0
        const val DOPPLER_TRACKING_IDLE_STEP: Long = 1
        const val DOPPLER_TRACKING_PHYSICS_STEP: Long = 2


    }


    // Properties
    open var keepAspect: Long
        get() = _icall_Long(getKeepAspectModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setKeepAspectModeMethodBind, this.rawMemory, value)


    open var cullMask: Long
        get() = _icall_Long(getCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCullMaskMethodBind, this.rawMemory, value)


    open var environment: Environment
        get() = _icall_Environment(getEnvironmentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEnvironmentMethodBind, this.rawMemory, value)


    open var hOffset: Double
        get() = _icall_Double(getHOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, value)


    open var vOffset: Double
        get() = _icall_Double(getVOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, value)


    open var dopplerTracking: Long
        get() = _icall_Long(getDopplerTrackingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDopplerTrackingMethodBind, this.rawMemory, value)


    open var projection: Long
        get() = _icall_Long(getProjectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setProjectionMethodBind, this.rawMemory, value)


    open var current: Boolean
        get() = _icall_Boolean(isCurrentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCurrentMethodBind, this.rawMemory, value)


    open var fov: Double
        get() = _icall_Double(getFovMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFovMethodBind, this.rawMemory, value)


    open var size: Double
        get() = _icall_Double(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSizeMethodBind, this.rawMemory, value)


    open var near: Double
        get() = _icall_Double(getZnearMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setZnearMethodBind, this.rawMemory, value)


    open var far: Double
        get() = _icall_Double(getZfarMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setZfarMethodBind, this.rawMemory, value)




    // Methods
    private val projectRayNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "project_ray_normal") }
    open fun projectRayNormal(screenPoint: Vector2): Vector3 {
        return _icall_Vector3_Vector2(projectRayNormalMethodBind, this.rawMemory, screenPoint)
    }


    private val projectLocalRayNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "project_local_ray_normal") }
    open fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
        return _icall_Vector3_Vector2(projectLocalRayNormalMethodBind, this.rawMemory, screenPoint)
    }


    private val projectRayOriginMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "project_ray_origin") }
    open fun projectRayOrigin(screenPoint: Vector2): Vector3 {
        return _icall_Vector3_Vector2(projectRayOriginMethodBind, this.rawMemory, screenPoint)
    }


    private val unprojectPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "unproject_position") }
    open fun unprojectPosition(worldPoint: Vector3): Vector2 {
        return _icall_Vector2_Vector3(unprojectPositionMethodBind, this.rawMemory, worldPoint)
    }


    private val isPositionBehindMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "is_position_behind") }
    open fun isPositionBehind(worldPoint: Vector3): Boolean {
        return _icall_Boolean_Vector3(isPositionBehindMethodBind, this.rawMemory, worldPoint)
    }


    private val projectPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "project_position") }
    open fun projectPosition(screenPoint: Vector2): Vector3 {
        return _icall_Vector3_Vector2(projectPositionMethodBind, this.rawMemory, screenPoint)
    }


    private val setPerspectiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_perspective") }
    open fun setPerspective(fov: Double, zNear: Double, zFar: Double) {
        _icall_Unit_Double_Double_Double(setPerspectiveMethodBind, this.rawMemory, fov, zNear, zFar)
    }


    private val setOrthogonalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_orthogonal") }
    open fun setOrthogonal(size: Double, zNear: Double, zFar: Double) {
        _icall_Unit_Double_Double_Double(setOrthogonalMethodBind, this.rawMemory, size, zNear, zFar)
    }


    private val makeCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "make_current") }
    open fun makeCurrent() {
        _icall_Unit(makeCurrentMethodBind, this.rawMemory)
    }


    private val clearCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "clear_current") }
    open fun clearCurrent(enableNext: Boolean = true) {
        _icall_Unit_Boolean(clearCurrentMethodBind, this.rawMemory, enableNext)
    }


    private val setCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_current") }
    open fun setCurrent(arg0: Boolean) {
        _icall_Unit_Boolean(setCurrentMethodBind, this.rawMemory, arg0)
    }


    private val isCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "is_current") }
    open fun isCurrent(): Boolean {
        return _icall_Boolean(isCurrentMethodBind, this.rawMemory)
    }


    private val getCameraTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_camera_transform") }
    open fun getCameraTransform(): Transform {
        return _icall_Transform(getCameraTransformMethodBind, this.rawMemory)
    }


    private val getFovMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_fov") }
    open fun getFov(): Double {
        return _icall_Double(getFovMethodBind, this.rawMemory)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_size") }
    open fun getSize(): Double {
        return _icall_Double(getSizeMethodBind, this.rawMemory)
    }


    private val getZfarMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_zfar") }
    open fun getZfar(): Double {
        return _icall_Double(getZfarMethodBind, this.rawMemory)
    }


    private val getZnearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_znear") }
    open fun getZnear(): Double {
        return _icall_Double(getZnearMethodBind, this.rawMemory)
    }


    private val setFovMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_fov") }
    open fun setFov(arg0: Double) {
        _icall_Unit_Double(setFovMethodBind, this.rawMemory, arg0)
    }


    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_size") }
    open fun setSize(arg0: Double) {
        _icall_Unit_Double(setSizeMethodBind, this.rawMemory, arg0)
    }


    private val setZfarMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_zfar") }
    open fun setZfar(arg0: Double) {
        _icall_Unit_Double(setZfarMethodBind, this.rawMemory, arg0)
    }


    private val setZnearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_znear") }
    open fun setZnear(arg0: Double) {
        _icall_Unit_Double(setZnearMethodBind, this.rawMemory, arg0)
    }


    private val getProjectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_projection") }
    open fun getProjection(): Camera.Projection {
        return Camera.Projection.fromInt(_icall_Long(getProjectionMethodBind, this.rawMemory))
    }


    private val setProjectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_projection") }
    open fun setProjection(arg0: Long) {
        _icall_Unit_Long(setProjectionMethodBind, this.rawMemory, arg0)
    }


    private val setHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_h_offset") }
    open fun setHOffset(ofs: Double) {
        _icall_Unit_Double(setHOffsetMethodBind, this.rawMemory, ofs)
    }


    private val getHOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_h_offset") }
    open fun getHOffset(): Double {
        return _icall_Double(getHOffsetMethodBind, this.rawMemory)
    }


    private val setVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_v_offset") }
    open fun setVOffset(ofs: Double) {
        _icall_Unit_Double(setVOffsetMethodBind, this.rawMemory, ofs)
    }


    private val getVOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_v_offset") }
    open fun getVOffset(): Double {
        return _icall_Double(getVOffsetMethodBind, this.rawMemory)
    }


    private val setCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_cull_mask") }
    open fun setCullMask(mask: Long) {
        _icall_Unit_Long(setCullMaskMethodBind, this.rawMemory, mask)
    }


    private val getCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_cull_mask") }
    open fun getCullMask(): Long {
        return _icall_Long(getCullMaskMethodBind, this.rawMemory)
    }


    private val setEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_environment") }
    open fun setEnvironment(env: Environment) {
        _icall_Unit_Object(setEnvironmentMethodBind, this.rawMemory, env)
    }


    private val getEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_environment") }
    open fun getEnvironment(): Environment {
        return _icall_Environment(getEnvironmentMethodBind, this.rawMemory)
    }


    private val setKeepAspectModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_keep_aspect_mode") }
    open fun setKeepAspectMode(mode: Long) {
        _icall_Unit_Long(setKeepAspectModeMethodBind, this.rawMemory, mode)
    }


    private val getKeepAspectModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_keep_aspect_mode") }
    open fun getKeepAspectMode(): Camera.KeepAspect {
        return Camera.KeepAspect.fromInt(_icall_Long(getKeepAspectModeMethodBind, this.rawMemory))
    }


    private val setDopplerTrackingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "set_doppler_tracking") }
    open fun setDopplerTracking(mode: Long) {
        _icall_Unit_Long(setDopplerTrackingMethodBind, this.rawMemory, mode)
    }


    private val getDopplerTrackingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Camera", "get_doppler_tracking") }
    open fun getDopplerTracking(): Camera.DopplerTracking {
        return Camera.DopplerTracking.fromInt(_icall_Long(getDopplerTrackingMethodBind, this.rawMemory))
    }


}
