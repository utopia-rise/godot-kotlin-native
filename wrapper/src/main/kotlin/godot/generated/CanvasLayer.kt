@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CanvasLayer : Node {
    constructor() : super("CanvasLayer")
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
        infix fun from(other: Node): CanvasLayer = CanvasLayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CanvasLayer = CanvasLayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CanvasLayer = fromVariant(CanvasLayer(""), other)


        // Constants


    }


    // Properties
    open var layer: Int
        get() = _icall_Int(getLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLayerMethodBind, this.rawMemory, value)


    open var offset: Vector2
        get() = _icall_Vector2(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var rotationDegrees: Float
        get() = _icall_Float(getRotationDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRotationDegreesMethodBind, this.rawMemory, value)


    open var rotation: Float
        get() = _icall_Float(getRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRotationMethodBind, this.rawMemory, value)


    open var scale: Vector2
        get() = _icall_Vector2(getScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScaleMethodBind, this.rawMemory, value)
    open fun scale(shedule: (Vector2) -> Unit): Vector2 = scale.apply {
        shedule(this)
        scale = this
    }


    open var transform: Transform2D
        get() = _icall_Transform2D(getTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, value)
    open fun transform(shedule: (Transform2D) -> Unit): Transform2D = transform.apply {
        shedule(this)
        transform = this
    }


    open var customViewport: Viewport
        get() = _icall_Viewport(getCustomViewportMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCustomViewportMethodBind, this.rawMemory, value)




    // Methods
    private val setLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_layer") }
    open fun setLayer(layer: Int) {
        _icall_Unit_Int(setLayerMethodBind, this.rawMemory, layer)
    }


    private val getLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_layer") }
    open fun getLayer(): Int {
        return _icall_Int(getLayerMethodBind, this.rawMemory)
    }


    private val setTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_transform") }
    open fun setTransform(transform: Transform2D) {
        _icall_Unit_Transform2D(setTransformMethodBind, this.rawMemory, transform)
    }


    private val getTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_transform") }
    open fun getTransform(): Transform2D {
        return _icall_Transform2D(getTransformMethodBind, this.rawMemory)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val setRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_rotation") }
    open fun setRotation(radians: Float) {
        _icall_Unit_Float(setRotationMethodBind, this.rawMemory, radians)
    }


    private val getRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_rotation") }
    open fun getRotation(): Float {
        return _icall_Float(getRotationMethodBind, this.rawMemory)
    }


    private val setRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_rotation_degrees") }
    open fun setRotationDegrees(degrees: Float) {
        _icall_Unit_Float(setRotationDegreesMethodBind, this.rawMemory, degrees)
    }


    private val getRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_rotation_degrees") }
    open fun getRotationDegrees(): Float {
        return _icall_Float(getRotationDegreesMethodBind, this.rawMemory)
    }


    private val setScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_scale") }
    open fun setScale(scale: Vector2) {
        _icall_Unit_Vector2(setScaleMethodBind, this.rawMemory, scale)
    }


    private val getScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_scale") }
    open fun getScale(): Vector2 {
        return _icall_Vector2(getScaleMethodBind, this.rawMemory)
    }


    private val setCustomViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "set_custom_viewport") }
    open fun setCustomViewport(viewport: Object) {
        _icall_Unit_Object(setCustomViewportMethodBind, this.rawMemory, viewport)
    }


    private val getCustomViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_custom_viewport") }
    open fun getCustomViewport(): Node {
        return _icall_Node(getCustomViewportMethodBind, this.rawMemory)
    }


    private val getCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasLayer", "get_canvas") }
    open fun getCanvas(): RID {
        return _icall_RID(getCanvasMethodBind, this.rawMemory)
    }


}
