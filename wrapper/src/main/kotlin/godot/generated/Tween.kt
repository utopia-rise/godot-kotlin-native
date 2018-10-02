@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Tween : Node {
    constructor() : super("Tween")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TransitionType(val id: Long) {
        TRANS_LINEAR(0),
        TRANS_SINE(1),
        TRANS_QUINT(2),
        TRANS_QUART(3),
        TRANS_QUAD(4),
        TRANS_EXPO(5),
        TRANS_ELASTIC(6),
        TRANS_CUBIC(7),
        TRANS_CIRC(8),
        TRANS_BOUNCE(9),
        TRANS_BACK(10),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class TweenProcessMode(val id: Long) {
        TWEEN_PROCESS_PHYSICS(0),
        TWEEN_PROCESS_IDLE(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class EaseType(val id: Long) {
        EASE_IN(0),
        EASE_OUT(1),
        EASE_IN_OUT(2),
        EASE_OUT_IN(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val TWEEN_STEP: String = "tween_step"
            const val TWEEN_COMPLETED: String = "tween_completed"
            const val TWEEN_STARTED: String = "tween_started"
        }
    }


    companion object {
        infix fun from(other: Node): Tween = Tween("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Tween = Tween("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Tween = fromVariant(Tween(""), other)


        // Constants
        const val TWEEN_PROCESS_PHYSICS: Long = 0
        const val TWEEN_PROCESS_IDLE: Long = 1
        const val TRANS_LINEAR: Long = 0
        const val TRANS_SINE: Long = 1
        const val TRANS_QUINT: Long = 2
        const val TRANS_QUART: Long = 3
        const val TRANS_QUAD: Long = 4
        const val TRANS_EXPO: Long = 5
        const val TRANS_ELASTIC: Long = 6
        const val TRANS_CUBIC: Long = 7
        const val TRANS_CIRC: Long = 8
        const val TRANS_BOUNCE: Long = 9
        const val TRANS_BACK: Long = 10
        const val EASE_IN: Long = 0
        const val EASE_OUT: Long = 1
        const val EASE_IN_OUT: Long = 2
        const val EASE_OUT_IN: Long = 3


    }


    // Properties
    open var repeat: Boolean
        get() = _icall_Boolean(isRepeatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRepeatMethodBind, this.rawMemory, value)


    open var playbackProcessMode: Long
        get() = _icall_Long(getTweenProcessModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTweenProcessModeMethodBind, this.rawMemory, value)


    open var playbackSpeed: Double
        get() = _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, value)




    // Methods
    private val isActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "is_active") }
    open fun isActive(): Boolean {
        return _icall_Boolean(isActiveMethodBind, this.rawMemory)
    }


    private val setActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "set_active") }
    open fun setActive(active: Boolean) {
        _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, active)
    }


    private val isRepeatMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "is_repeat") }
    open fun isRepeat(): Boolean {
        return _icall_Boolean(isRepeatMethodBind, this.rawMemory)
    }


    private val setRepeatMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "set_repeat") }
    open fun setRepeat(repeat: Boolean) {
        _icall_Unit_Boolean(setRepeatMethodBind, this.rawMemory, repeat)
    }


    private val setSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "set_speed_scale") }
    open fun setSpeedScale(speed: Double) {
        _icall_Unit_Double(setSpeedScaleMethodBind, this.rawMemory, speed)
    }


    private val getSpeedScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "get_speed_scale") }
    open fun getSpeedScale(): Double {
        return _icall_Double(getSpeedScaleMethodBind, this.rawMemory)
    }


    private val setTweenProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "set_tween_process_mode") }
    open fun setTweenProcessMode(mode: Long) {
        _icall_Unit_Long(setTweenProcessModeMethodBind, this.rawMemory, mode)
    }


    private val getTweenProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "get_tween_process_mode") }
    open fun getTweenProcessMode(): Tween.TweenProcessMode {
        return Tween.TweenProcessMode.fromInt(_icall_Long(getTweenProcessModeMethodBind, this.rawMemory))
    }


    private val startMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "start") }
    open fun start(): Boolean {
        return _icall_Boolean(startMethodBind, this.rawMemory)
    }


    private val resetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "reset") }
    open fun reset(_object: Object, key: String = ""): Boolean {
        return _icall_Boolean_Object_String(resetMethodBind, this.rawMemory, _object, key)
    }


    private val resetAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "reset_all") }
    open fun resetAll(): Boolean {
        return _icall_Boolean(resetAllMethodBind, this.rawMemory)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "stop") }
    open fun stop(_object: Object, key: String = ""): Boolean {
        return _icall_Boolean_Object_String(stopMethodBind, this.rawMemory, _object, key)
    }


    private val stopAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "stop_all") }
    open fun stopAll(): Boolean {
        return _icall_Boolean(stopAllMethodBind, this.rawMemory)
    }


    private val isStoppedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "is_stopped") }
    open fun isStopped(): Boolean {
        return _icall_Boolean(isStoppedMethodBind, this.rawMemory)
    }


    private val resumeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "resume") }
    open fun resume(_object: Object, key: String = ""): Boolean {
        return _icall_Boolean_Object_String(resumeMethodBind, this.rawMemory, _object, key)
    }


    private val resumeAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "resume_all") }
    open fun resumeAll(): Boolean {
        return _icall_Boolean(resumeAllMethodBind, this.rawMemory)
    }


    private val removeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "remove") }
    open fun remove(_object: Object, key: String = ""): Boolean {
        return _icall_Boolean_Object_String(removeMethodBind, this.rawMemory, _object, key)
    }


    open fun _remove(_object: Object, key: String, firstOnly: Boolean) {
    }


    private val removeAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "remove_all") }
    open fun removeAll(): Boolean {
        return _icall_Boolean(removeAllMethodBind, this.rawMemory)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "seek") }
    open fun seek(time: Double): Boolean {
        return _icall_Boolean_Double(seekMethodBind, this.rawMemory, time)
    }


    private val tellMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "tell") }
    open fun tell(): Double {
        return _icall_Double(tellMethodBind, this.rawMemory)
    }


    private val getRuntimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "get_runtime") }
    open fun getRuntime(): Double {
        return _icall_Double(getRuntimeMethodBind, this.rawMemory)
    }


    private val interpolatePropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "interpolate_property") }
    open fun interpolateProperty(_object: Object, property: NodePath, initialVal: Variant, finalVal: Variant, duration: Double, transType: Long, easeType: Long, delay: Double = 0.0): Boolean {
        return _icall_Boolean_Object_NodePath_Variant_Variant_Double_Long_Long_Double(interpolatePropertyMethodBind, this.rawMemory, _object, property, initialVal, finalVal, duration, transType, easeType, delay)
    }


    private val interpolateMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "interpolate_method") }
    open fun interpolateMethod(_object: Object, method: String, initialVal: Variant, finalVal: Variant, duration: Double, transType: Long, easeType: Long, delay: Double = 0.0): Boolean {
        return _icall_Boolean_Object_String_Variant_Variant_Double_Long_Long_Double(interpolateMethodMethodBind, this.rawMemory, _object, method, initialVal, finalVal, duration, transType, easeType, delay)
    }


    private val interpolateCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "interpolate_callback") }
    open fun interpolateCallback(_object: Object, duration: Double, callback: String, arg1: Variant, arg2: Variant, arg3: Variant, arg4: Variant, arg5: Variant): Boolean {
        return _icall_Boolean_Object_Double_String_Variant_Variant_Variant_Variant_Variant(interpolateCallbackMethodBind, this.rawMemory, _object, duration, callback, arg1, arg2, arg3, arg4, arg5)
    }


    private val interpolateDeferredCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "interpolate_deferred_callback") }
    open fun interpolateDeferredCallback(_object: Object, duration: Double, callback: String, arg1: Variant, arg2: Variant, arg3: Variant, arg4: Variant, arg5: Variant): Boolean {
        return _icall_Boolean_Object_Double_String_Variant_Variant_Variant_Variant_Variant(interpolateDeferredCallbackMethodBind, this.rawMemory, _object, duration, callback, arg1, arg2, arg3, arg4, arg5)
    }


    private val followPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "follow_property") }
    open fun followProperty(_object: Object, property: NodePath, initialVal: Variant, target: Object, targetProperty: NodePath, duration: Double, transType: Long, easeType: Long, delay: Double = 0.0): Boolean {
        return _icall_Boolean_Object_NodePath_Variant_Object_NodePath_Double_Long_Long_Double(followPropertyMethodBind, this.rawMemory, _object, property, initialVal, target, targetProperty, duration, transType, easeType, delay)
    }


    private val followMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "follow_method") }
    open fun followMethod(_object: Object, method: String, initialVal: Variant, target: Object, targetMethod: String, duration: Double, transType: Long, easeType: Long, delay: Double = 0.0): Boolean {
        return _icall_Boolean_Object_String_Variant_Object_String_Double_Long_Long_Double(followMethodMethodBind, this.rawMemory, _object, method, initialVal, target, targetMethod, duration, transType, easeType, delay)
    }


    private val targetingPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "targeting_property") }
    open fun targetingProperty(_object: Object, property: NodePath, initial: Object, initialVal: NodePath, finalVal: Variant, duration: Double, transType: Long, easeType: Long, delay: Double = 0.0): Boolean {
        return _icall_Boolean_Object_NodePath_Object_NodePath_Variant_Double_Long_Long_Double(targetingPropertyMethodBind, this.rawMemory, _object, property, initial, initialVal, finalVal, duration, transType, easeType, delay)
    }


    private val targetingMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tween", "targeting_method") }
    open fun targetingMethod(_object: Object, method: String, initial: Object, initialMethod: String, finalVal: Variant, duration: Double, transType: Long, easeType: Long, delay: Double = 0.0): Boolean {
        return _icall_Boolean_Object_String_Object_String_Variant_Double_Long_Long_Double(targetingMethodMethodBind, this.rawMemory, _object, method, initial, initialMethod, finalVal, duration, transType, easeType, delay)
    }


}
