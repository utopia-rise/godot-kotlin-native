@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InterpolatedCamera : Camera {
    constructor() : super("InterpolatedCamera")
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
        infix fun from(other: Camera): InterpolatedCamera = InterpolatedCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): InterpolatedCamera = InterpolatedCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): InterpolatedCamera = InterpolatedCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InterpolatedCamera = InterpolatedCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InterpolatedCamera = fromVariant(InterpolatedCamera(""), other)


        // Constants


    }


    // Properties
    open var target: NodePath
        get() = _icall_NodePath(getTargetPathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setTargetPathMethodBind, this.rawMemory, value)


    open var speed: Double
        get() = _icall_Double(getSpeedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpeedMethodBind, this.rawMemory, value)


    open var enabled: Boolean
        get() = _icall_Boolean(isInterpolationEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setInterpolationEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val setTargetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "set_target_path") }
    open fun setTargetPath(targetPath: NodePath) {
        _icall_Unit_NodePath(setTargetPathMethodBind, this.rawMemory, targetPath)
    }


    private val getTargetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "get_target_path") }
    open fun getTargetPath(): NodePath {
        return _icall_NodePath(getTargetPathMethodBind, this.rawMemory)
    }


    private val setTargetMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "set_target") }
    open fun setTarget(target: Object) {
        _icall_Unit_Object(setTargetMethodBind, this.rawMemory, target)
    }


    private val setSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "set_speed") }
    open fun setSpeed(speed: Double) {
        _icall_Unit_Double(setSpeedMethodBind, this.rawMemory, speed)
    }


    private val getSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "get_speed") }
    open fun getSpeed(): Double {
        return _icall_Double(getSpeedMethodBind, this.rawMemory)
    }


    private val setInterpolationEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "set_interpolation_enabled") }
    open fun setInterpolationEnabled(targetPath: Boolean) {
        _icall_Unit_Boolean(setInterpolationEnabledMethodBind, this.rawMemory, targetPath)
    }


    private val isInterpolationEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("InterpolatedCamera", "is_interpolation_enabled") }
    open fun isInterpolationEnabled(): Boolean {
        return _icall_Boolean(isInterpolationEnabledMethodBind, this.rawMemory)
    }


}
