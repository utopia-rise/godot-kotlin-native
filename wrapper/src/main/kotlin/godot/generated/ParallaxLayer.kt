@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ParallaxLayer : Node2D {
    constructor() : super("ParallaxLayer")
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
        infix fun from(other: Node2D): ParallaxLayer = ParallaxLayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ParallaxLayer = ParallaxLayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ParallaxLayer = ParallaxLayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ParallaxLayer = ParallaxLayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ParallaxLayer = fromVariant(ParallaxLayer(""), other)


        // Constants


    }


    // Properties
    open var motionScale: Vector2
        get() = _icall_Vector2(getMotionScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setMotionScaleMethodBind, this.rawMemory, value)
    open fun motionScale(shedule: (Vector2) -> Unit): Vector2 = motionScale.apply {
        shedule(this)
        motionScale = this
    }


    open var motionOffset: Vector2
        get() = _icall_Vector2(getMotionOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setMotionOffsetMethodBind, this.rawMemory, value)
    open fun motionOffset(shedule: (Vector2) -> Unit): Vector2 = motionOffset.apply {
        shedule(this)
        motionOffset = this
    }


    open var motionMirroring: Vector2
        get() = _icall_Vector2(getMirroringMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setMirroringMethodBind, this.rawMemory, value)
    open fun motionMirroring(shedule: (Vector2) -> Unit): Vector2 = motionMirroring.apply {
        shedule(this)
        motionMirroring = this
    }




    // Methods
    private val setMotionScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxLayer", "set_motion_scale") }
    open fun setMotionScale(scale: Vector2) {
        _icall_Unit_Vector2(setMotionScaleMethodBind, this.rawMemory, scale)
    }


    private val getMotionScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxLayer", "get_motion_scale") }
    open fun getMotionScale(): Vector2 {
        return _icall_Vector2(getMotionScaleMethodBind, this.rawMemory)
    }


    private val setMotionOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxLayer", "set_motion_offset") }
    open fun setMotionOffset(offset: Vector2) {
        _icall_Unit_Vector2(setMotionOffsetMethodBind, this.rawMemory, offset)
    }


    private val getMotionOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxLayer", "get_motion_offset") }
    open fun getMotionOffset(): Vector2 {
        return _icall_Vector2(getMotionOffsetMethodBind, this.rawMemory)
    }


    private val setMirroringMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxLayer", "set_mirroring") }
    open fun setMirroring(mirror: Vector2) {
        _icall_Unit_Vector2(setMirroringMethodBind, this.rawMemory, mirror)
    }


    private val getMirroringMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxLayer", "get_mirroring") }
    open fun getMirroring(): Vector2 {
        return _icall_Vector2(getMirroringMethodBind, this.rawMemory)
    }


}
