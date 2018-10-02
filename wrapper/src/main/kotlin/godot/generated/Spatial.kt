@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Spatial : Node {
    constructor() : super("Spatial")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val VISIBILITY_CHANGED: String = "visibility_changed"
        }
    }


    companion object {
        infix fun from(other: Node): Spatial = Spatial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Spatial = Spatial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Spatial = fromVariant(Spatial(""), other)


        // Constants
        const val NOTIFICATION_TRANSFORM_CHANGED: Long = 29
        const val NOTIFICATION_ENTER_WORLD: Long = 41
        const val NOTIFICATION_EXIT_WORLD: Long = 42
        const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43


    }


    // Properties
    open var transform: Transform
        get() = _icall_Transform(getTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setTransformMethodBind, this.rawMemory, value)
    open fun transform(shedule: (Transform) -> Unit): Transform = transform.apply {
        shedule(this)
        transform = this
    }


    open var globalTransform: Transform
        get() = _icall_Transform(getGlobalTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setGlobalTransformMethodBind, this.rawMemory, value)
    open fun globalTransform(shedule: (Transform) -> Unit): Transform = globalTransform.apply {
        shedule(this)
        globalTransform = this
    }


    open var translation: Vector3
        get() = _icall_Vector3(getTranslationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setTranslationMethodBind, this.rawMemory, value)
    open fun translation(shedule: (Vector3) -> Unit): Vector3 = translation.apply {
        shedule(this)
        translation = this
    }


    open var rotationDegrees: Vector3
        get() = _icall_Vector3(getRotationDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setRotationDegreesMethodBind, this.rawMemory, value)
    open fun rotationDegrees(shedule: (Vector3) -> Unit): Vector3 = rotationDegrees.apply {
        shedule(this)
        rotationDegrees = this
    }


    open var rotation: Vector3
        get() = _icall_Vector3(getRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setRotationMethodBind, this.rawMemory, value)
    open fun rotation(shedule: (Vector3) -> Unit): Vector3 = rotation.apply {
        shedule(this)
        rotation = this
    }


    open var scale: Vector3
        get() = _icall_Vector3(getScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setScaleMethodBind, this.rawMemory, value)
    open fun scale(shedule: (Vector3) -> Unit): Vector3 = scale.apply {
        shedule(this)
        scale = this
    }


    open var visible: Boolean
        get() = _icall_Boolean(isVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setVisibleMethodBind, this.rawMemory, value)


    open var gizmo: SpatialGizmo
        get() = _icall_SpatialGizmo(getGizmoMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setGizmoMethodBind, this.rawMemory, value)




    // Methods
    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_transform") }
    open fun setTransform(local: Transform) {
        _icall_Unit_Transform(setTransformMethodBind, this.rawMemory, local)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_transform") }
    open fun getTransform(): Transform {
        return _icall_Transform(getTransformMethodBind, this.rawMemory)
    }


    private val setTranslationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_translation") }
    open fun setTranslation(translation: Vector3) {
        _icall_Unit_Vector3(setTranslationMethodBind, this.rawMemory, translation)
    }


    private val getTranslationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_translation") }
    open fun getTranslation(): Vector3 {
        return _icall_Vector3(getTranslationMethodBind, this.rawMemory)
    }


    private val setRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_rotation") }
    open fun setRotation(euler: Vector3) {
        _icall_Unit_Vector3(setRotationMethodBind, this.rawMemory, euler)
    }


    private val getRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_rotation") }
    open fun getRotation(): Vector3 {
        return _icall_Vector3(getRotationMethodBind, this.rawMemory)
    }


    private val setRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_rotation_degrees") }
    open fun setRotationDegrees(eulerDegrees: Vector3) {
        _icall_Unit_Vector3(setRotationDegreesMethodBind, this.rawMemory, eulerDegrees)
    }


    private val getRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_rotation_degrees") }
    open fun getRotationDegrees(): Vector3 {
        return _icall_Vector3(getRotationDegreesMethodBind, this.rawMemory)
    }


    private val setScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_scale") }
    open fun setScale(scale: Vector3) {
        _icall_Unit_Vector3(setScaleMethodBind, this.rawMemory, scale)
    }


    private val getScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_scale") }
    open fun getScale(): Vector3 {
        return _icall_Vector3(getScaleMethodBind, this.rawMemory)
    }


    private val setGlobalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_global_transform") }
    open fun setGlobalTransform(global: Transform) {
        _icall_Unit_Transform(setGlobalTransformMethodBind, this.rawMemory, global)
    }


    private val getGlobalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_global_transform") }
    open fun getGlobalTransform(): Transform {
        return _icall_Transform(getGlobalTransformMethodBind, this.rawMemory)
    }


    private val getParentSpatialMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_parent_spatial") }
    open fun getParentSpatial(): Spatial {
        return _icall_Spatial(getParentSpatialMethodBind, this.rawMemory)
    }


    private val setIgnoreTransformNotificationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_ignore_transform_notification") }
    open fun setIgnoreTransformNotification(enabled: Boolean) {
        _icall_Unit_Boolean(setIgnoreTransformNotificationMethodBind, this.rawMemory, enabled)
    }


    private val setAsToplevelMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_as_toplevel") }
    open fun setAsToplevel(enable: Boolean) {
        _icall_Unit_Boolean(setAsToplevelMethodBind, this.rawMemory, enable)
    }


    private val isSetAsToplevelMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "is_set_as_toplevel") }
    open fun isSetAsToplevel(): Boolean {
        return _icall_Boolean(isSetAsToplevelMethodBind, this.rawMemory)
    }


    private val getWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_world") }
    open fun getWorld(): World {
        return _icall_World(getWorldMethodBind, this.rawMemory)
    }


    open fun _update_gizmo() {
    }


    private val updateGizmoMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "update_gizmo") }
    open fun updateGizmo() {
        _icall_Unit(updateGizmoMethodBind, this.rawMemory)
    }


    private val setGizmoMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_gizmo") }
    open fun setGizmo(gizmo: SpatialGizmo) {
        _icall_Unit_Object(setGizmoMethodBind, this.rawMemory, gizmo)
    }


    private val getGizmoMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "get_gizmo") }
    open fun getGizmo(): SpatialGizmo {
        return _icall_SpatialGizmo(getGizmoMethodBind, this.rawMemory)
    }


    private val setVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_visible") }
    open fun setVisible(visible: Boolean) {
        _icall_Unit_Boolean(setVisibleMethodBind, this.rawMemory, visible)
    }


    private val isVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "is_visible") }
    open fun isVisible(): Boolean {
        return _icall_Boolean(isVisibleMethodBind, this.rawMemory)
    }


    private val isVisibleInTreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "is_visible_in_tree") }
    open fun isVisibleInTree(): Boolean {
        return _icall_Boolean(isVisibleInTreeMethodBind, this.rawMemory)
    }


    private val showMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "show") }
    open fun show() {
        _icall_Unit(showMethodBind, this.rawMemory)
    }


    private val hideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "hide") }
    open fun hide() {
        _icall_Unit(hideMethodBind, this.rawMemory)
    }


    private val setNotifyLocalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_notify_local_transform") }
    open fun setNotifyLocalTransform(enable: Boolean) {
        _icall_Unit_Boolean(setNotifyLocalTransformMethodBind, this.rawMemory, enable)
    }


    private val isLocalTransformNotificationEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "is_local_transform_notification_enabled") }
    open fun isLocalTransformNotificationEnabled(): Boolean {
        return _icall_Boolean(isLocalTransformNotificationEnabledMethodBind, this.rawMemory)
    }


    private val setNotifyTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_notify_transform") }
    open fun setNotifyTransform(enable: Boolean) {
        _icall_Unit_Boolean(setNotifyTransformMethodBind, this.rawMemory, enable)
    }


    private val isTransformNotificationEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "is_transform_notification_enabled") }
    open fun isTransformNotificationEnabled(): Boolean {
        return _icall_Boolean(isTransformNotificationEnabledMethodBind, this.rawMemory)
    }


    private val rotateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "rotate") }
    open fun rotate(axis: Vector3, angle: Double) {
        _icall_Unit_Vector3_Double(rotateMethodBind, this.rawMemory, axis, angle)
    }


    private val globalRotateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "global_rotate") }
    open fun globalRotate(axis: Vector3, angle: Double) {
        _icall_Unit_Vector3_Double(globalRotateMethodBind, this.rawMemory, axis, angle)
    }


    private val globalScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "global_scale") }
    open fun globalScale(scale: Vector3) {
        _icall_Unit_Vector3(globalScaleMethodBind, this.rawMemory, scale)
    }


    private val globalTranslateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "global_translate") }
    open fun globalTranslate(offset: Vector3) {
        _icall_Unit_Vector3(globalTranslateMethodBind, this.rawMemory, offset)
    }


    private val rotateObjectLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "rotate_object_local") }
    open fun rotateObjectLocal(axis: Vector3, angle: Double) {
        _icall_Unit_Vector3_Double(rotateObjectLocalMethodBind, this.rawMemory, axis, angle)
    }


    private val scaleObjectLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "scale_object_local") }
    open fun scaleObjectLocal(scale: Vector3) {
        _icall_Unit_Vector3(scaleObjectLocalMethodBind, this.rawMemory, scale)
    }


    private val translateObjectLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "translate_object_local") }
    open fun translateObjectLocal(offset: Vector3) {
        _icall_Unit_Vector3(translateObjectLocalMethodBind, this.rawMemory, offset)
    }


    private val rotateXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "rotate_x") }
    open fun rotateX(angle: Double) {
        _icall_Unit_Double(rotateXMethodBind, this.rawMemory, angle)
    }


    private val rotateYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "rotate_y") }
    open fun rotateY(angle: Double) {
        _icall_Unit_Double(rotateYMethodBind, this.rawMemory, angle)
    }


    private val rotateZMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "rotate_z") }
    open fun rotateZ(angle: Double) {
        _icall_Unit_Double(rotateZMethodBind, this.rawMemory, angle)
    }


    private val translateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "translate") }
    open fun translate(offset: Vector3) {
        _icall_Unit_Vector3(translateMethodBind, this.rawMemory, offset)
    }


    private val orthonormalizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "orthonormalize") }
    open fun orthonormalize() {
        _icall_Unit(orthonormalizeMethodBind, this.rawMemory)
    }


    private val setIdentityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "set_identity") }
    open fun setIdentity() {
        _icall_Unit(setIdentityMethodBind, this.rawMemory)
    }


    private val lookAtMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "look_at") }
    open fun lookAt(target: Vector3, up: Vector3) {
        _icall_Unit_Vector3_Vector3(lookAtMethodBind, this.rawMemory, target, up)
    }


    private val lookAtFromPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "look_at_from_position") }
    open fun lookAtFromPosition(position: Vector3, target: Vector3, up: Vector3) {
        _icall_Unit_Vector3_Vector3_Vector3(lookAtFromPositionMethodBind, this.rawMemory, position, target, up)
    }


    private val toLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "to_local") }
    open fun toLocal(globalPoint: Vector3): Vector3 {
        return _icall_Vector3_Vector3(toLocalMethodBind, this.rawMemory, globalPoint)
    }


    private val toGlobalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Spatial", "to_global") }
    open fun toGlobal(localPoint: Vector3): Vector3 {
        return _icall_Vector3_Vector3(toGlobalMethodBind, this.rawMemory, localPoint)
    }


}
