@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Node2D : CanvasItem {
    constructor() : super("Node2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: CanvasItem): Node2D = Node2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Node2D = Node2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Node2D = Node2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Node2D = fromVariant(Node2D(""), other)


        // Constants


    }


    // Properties
    open var position: Vector2
        get() = _icall_Vector2(getPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, value)
    open fun position(shedule: (Vector2) -> Unit): Vector2 = position.apply {
        shedule(this)
        position = this
    }


    open var rotation: Double
        get() = _icall_Double(getRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRotationMethodBind, this.rawMemory, value)


    open var rotationDegrees: Double
        get() = _icall_Double(getRotationDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRotationDegreesMethodBind, this.rawMemory, value)


    open var scale: Vector2
        get() = _icall_Vector2(getScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScaleMethodBind, this.rawMemory, value)
    open fun scale(shedule: (Vector2) -> Unit): Vector2 = scale.apply {
        shedule(this)
        scale = this
    }


    open var transform: Transform2D
        get() = throw UninitializedPropertyAccessException("Cannot access property transform: has no getter")
        set(value) = _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, value)
    open fun transform(shedule: (Transform2D) -> Unit): Transform2D = transform.apply {
        shedule(this)
        transform = this
    }


    open var globalPosition: Vector2
        get() = _icall_Vector2(getGlobalPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setGlobalPositionMethodBind, this.rawMemory, value)
    open fun globalPosition(shedule: (Vector2) -> Unit): Vector2 = globalPosition.apply {
        shedule(this)
        globalPosition = this
    }


    open var globalRotation: Double
        get() = _icall_Double(getGlobalRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlobalRotationMethodBind, this.rawMemory, value)


    open var globalRotationDegrees: Double
        get() = _icall_Double(getGlobalRotationDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGlobalRotationDegreesMethodBind, this.rawMemory, value)


    open var globalScale: Vector2
        get() = _icall_Vector2(getGlobalScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setGlobalScaleMethodBind, this.rawMemory, value)
    open fun globalScale(shedule: (Vector2) -> Unit): Vector2 = globalScale.apply {
        shedule(this)
        globalScale = this
    }


    open var globalTransform: Transform2D
        get() = throw UninitializedPropertyAccessException("Cannot access property globalTransform: has no getter")
        set(value) = _icall_Unit_Transform2D(setGlobalTransformMethodBind, this.rawMemory, value)
    open fun globalTransform(shedule: (Transform2D) -> Unit): Transform2D = globalTransform.apply {
        shedule(this)
        globalTransform = this
    }


    open var zIndex: Long
        get() = _icall_Long(getZIndexMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setZIndexMethodBind, this.rawMemory, value)


    open var zAsRelative: Boolean
        get() = _icall_Boolean(isZRelativeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setZAsRelativeMethodBind, this.rawMemory, value)




    // Methods
    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val setRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_rotation") }
    open fun setRotation(radians: Double) {
        _icall_Unit_Double(setRotationMethodBind, this.rawMemory, radians)
    }


    private val setRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_rotation_degrees") }
    open fun setRotationDegrees(degrees: Double) {
        _icall_Unit_Double(setRotationDegreesMethodBind, this.rawMemory, degrees)
    }


    private val setScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_scale") }
    open fun setScale(scale: Vector2) {
        _icall_Unit_Vector2(setScaleMethodBind, this.rawMemory, scale)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    private val getRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_rotation") }
    open fun getRotation(): Double {
        return _icall_Double(getRotationMethodBind, this.rawMemory)
    }


    private val getRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_rotation_degrees") }
    open fun getRotationDegrees(): Double {
        return _icall_Double(getRotationDegreesMethodBind, this.rawMemory)
    }


    private val getScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_scale") }
    open fun getScale(): Vector2 {
        return _icall_Vector2(getScaleMethodBind, this.rawMemory)
    }


    private val rotateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "rotate") }
    open fun rotate(radians: Double) {
        _icall_Unit_Double(rotateMethodBind, this.rawMemory, radians)
    }


    private val moveLocalXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "move_local_x") }
    open fun moveLocalX(delta: Double, scaled: Boolean = false) {
        _icall_Unit_Double_Boolean(moveLocalXMethodBind, this.rawMemory, delta, scaled)
    }


    private val moveLocalYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "move_local_y") }
    open fun moveLocalY(delta: Double, scaled: Boolean = false) {
        _icall_Unit_Double_Boolean(moveLocalYMethodBind, this.rawMemory, delta, scaled)
    }


    private val translateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "translate") }
    open fun translate(offset: Vector2) {
        _icall_Unit_Vector2(translateMethodBind, this.rawMemory, offset)
    }


    private val globalTranslateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "global_translate") }
    open fun globalTranslate(offset: Vector2) {
        _icall_Unit_Vector2(globalTranslateMethodBind, this.rawMemory, offset)
    }


    private val applyScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "apply_scale") }
    open fun applyScale(ratio: Vector2) {
        _icall_Unit_Vector2(applyScaleMethodBind, this.rawMemory, ratio)
    }


    private val setGlobalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_global_position") }
    open fun setGlobalPosition(position: Vector2) {
        _icall_Unit_Vector2(setGlobalPositionMethodBind, this.rawMemory, position)
    }


    private val getGlobalPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_global_position") }
    open fun getGlobalPosition(): Vector2 {
        return _icall_Vector2(getGlobalPositionMethodBind, this.rawMemory)
    }


    private val setGlobalRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_global_rotation") }
    open fun setGlobalRotation(radians: Double) {
        _icall_Unit_Double(setGlobalRotationMethodBind, this.rawMemory, radians)
    }


    private val getGlobalRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_global_rotation") }
    open fun getGlobalRotation(): Double {
        return _icall_Double(getGlobalRotationMethodBind, this.rawMemory)
    }


    private val setGlobalRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_global_rotation_degrees") }
    open fun setGlobalRotationDegrees(degrees: Double) {
        _icall_Unit_Double(setGlobalRotationDegreesMethodBind, this.rawMemory, degrees)
    }


    private val getGlobalRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_global_rotation_degrees") }
    open fun getGlobalRotationDegrees(): Double {
        return _icall_Double(getGlobalRotationDegreesMethodBind, this.rawMemory)
    }


    private val setGlobalScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_global_scale") }
    open fun setGlobalScale(scale: Vector2) {
        _icall_Unit_Vector2(setGlobalScaleMethodBind, this.rawMemory, scale)
    }


    private val getGlobalScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_global_scale") }
    open fun getGlobalScale(): Vector2 {
        return _icall_Vector2(getGlobalScaleMethodBind, this.rawMemory)
    }


    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_transform") }
    open fun setTransform(xform: Transform2D) {
        _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, xform)
    }


    private val setGlobalTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_global_transform") }
    open fun setGlobalTransform(xform: Transform2D) {
        _icall_Unit_Transform2D(setGlobalTransformMethodBind, this.rawMemory, xform)
    }


    private val lookAtMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "look_at") }
    open fun lookAt(point: Vector2) {
        _icall_Unit_Vector2(lookAtMethodBind, this.rawMemory, point)
    }


    private val getAngleToMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_angle_to") }
    open fun getAngleTo(point: Vector2): Double {
        return _icall_Double_Vector2(getAngleToMethodBind, this.rawMemory, point)
    }


    private val toLocalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "to_local") }
    open fun toLocal(globalPoint: Vector2): Vector2 {
        return _icall_Vector2_Vector2(toLocalMethodBind, this.rawMemory, globalPoint)
    }


    private val toGlobalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "to_global") }
    open fun toGlobal(localPoint: Vector2): Vector2 {
        return _icall_Vector2_Vector2(toGlobalMethodBind, this.rawMemory, localPoint)
    }


    private val setZIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_z_index") }
    open fun setZIndex(zIndex: Long) {
        _icall_Unit_Long(setZIndexMethodBind, this.rawMemory, zIndex)
    }


    private val getZIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_z_index") }
    open fun getZIndex(): Long {
        return _icall_Long(getZIndexMethodBind, this.rawMemory)
    }


    private val setZAsRelativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "set_z_as_relative") }
    open fun setZAsRelative(enable: Boolean) {
        _icall_Unit_Boolean(setZAsRelativeMethodBind, this.rawMemory, enable)
    }


    private val isZRelativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "is_z_relative") }
    open fun isZRelative(): Boolean {
        return _icall_Boolean(isZRelativeMethodBind, this.rawMemory)
    }


    private val getRelativeTransformToParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node2D", "get_relative_transform_to_parent") }
    open fun getRelativeTransformToParent(parent: Object): Transform2D {
        return _icall_Transform2D_Object(getRelativeTransformToParentMethodBind, this.rawMemory, parent)
    }


}
