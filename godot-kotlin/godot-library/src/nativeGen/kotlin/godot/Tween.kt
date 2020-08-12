// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Tween
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Signal0
import godot.core.Signal2
import godot.core.Signal4
import godot.core.Variant
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Double
import godot.icalls._icall_Boolean_Object_Double_String_nVariant_nVariant_nVariant_nVariant_nVariant
import godot.icalls._icall_Boolean_Object_NodePath_Object_NodePath_Variant_Double_Long_Long_Double
import godot.icalls._icall_Boolean_Object_NodePath_Variant_Object_NodePath_Double_Long_Long_Double
import godot.icalls._icall_Boolean_Object_NodePath_Variant_Variant_Double_Long_Long_Double
import godot.icalls._icall_Boolean_Object_String
import godot.icalls._icall_Boolean_Object_String_Object_String_Variant_Double_Long_Long_Double
import godot.icalls._icall_Boolean_Object_String_Variant_Object_String_Double_Long_Long_Double
import godot.icalls._icall_Boolean_Object_String_Variant_Variant_Double_Long_Long_Double
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class Tween internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val tweenAllCompleted: Signal0 by signal()

  val tweenCompleted: Signal2<Object, NodePath> by signal("object", "key")

  val tweenStarted: Signal2<Object, NodePath> by signal("object", "key")

  val tweenStep: Signal4<Object, NodePath, Double, Object> by signal("object", "key", "elapsed",
      "value")

  open var playbackProcessMode: Long
    get() {
      val mb = getMethodBind("Tween","get_tween_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tween","set_tween_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var playbackSpeed: Double
    get() {
      val mb = getMethodBind("Tween","get_speed_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tween","set_speed_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var repeat: Boolean
    get() {
      val mb = getMethodBind("Tween","is_repeat")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tween","set_repeat")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Tween", "Tween")
        }

  }

  open fun _removeByUid(uid: Long) {
  }

  open fun followMethod(
    _object: Object,
    method: String,
    initialVal: Variant,
    target: Object,
    targetMethod: String,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    val mb = getMethodBind("Tween","follow_method")
    return _icall_Boolean_Object_String_Variant_Object_String_Double_Long_Long_Double( mb, this.ptr,
        _object, method, initialVal, target, targetMethod, duration, transType, easeType, delay)
  }

  open fun followProperty(
    _object: Object,
    property: NodePath,
    initialVal: Variant,
    target: Object,
    targetProperty: NodePath,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    val mb = getMethodBind("Tween","follow_property")
    return _icall_Boolean_Object_NodePath_Variant_Object_NodePath_Double_Long_Long_Double( mb,
        this.ptr, _object, property, initialVal, target, targetProperty, duration, transType,
        easeType, delay)
  }

  open fun getRuntime(): Double {
    val mb = getMethodBind("Tween","get_runtime")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpeedScale(): Double {
    val mb = getMethodBind("Tween","get_speed_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTweenProcessMode(): Tween.TweenProcessMode {
    val mb = getMethodBind("Tween","get_tween_process_mode")
    return Tween.TweenProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun interpolateCallback(
    _object: Object,
    duration: Double,
    callback: String,
    arg1: Variant? = null,
    arg2: Variant? = null,
    arg3: Variant? = null,
    arg4: Variant? = null,
    arg5: Variant? = null
  ): Boolean {
    val mb = getMethodBind("Tween","interpolate_callback")
    return _icall_Boolean_Object_Double_String_nVariant_nVariant_nVariant_nVariant_nVariant( mb,
        this.ptr, _object, duration, callback, arg1, arg2, arg3, arg4, arg5)
  }

  open fun interpolateDeferredCallback(
    _object: Object,
    duration: Double,
    callback: String,
    arg1: Variant? = null,
    arg2: Variant? = null,
    arg3: Variant? = null,
    arg4: Variant? = null,
    arg5: Variant? = null
  ): Boolean {
    val mb = getMethodBind("Tween","interpolate_deferred_callback")
    return _icall_Boolean_Object_Double_String_nVariant_nVariant_nVariant_nVariant_nVariant( mb,
        this.ptr, _object, duration, callback, arg1, arg2, arg3, arg4, arg5)
  }

  open fun interpolateMethod(
    _object: Object,
    method: String,
    initialVal: Variant,
    finalVal: Variant,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    val mb = getMethodBind("Tween","interpolate_method")
    return _icall_Boolean_Object_String_Variant_Variant_Double_Long_Long_Double( mb, this.ptr,
        _object, method, initialVal, finalVal, duration, transType, easeType, delay)
  }

  open fun interpolateProperty(
    _object: Object,
    property: NodePath,
    initialVal: Variant,
    finalVal: Variant,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    val mb = getMethodBind("Tween","interpolate_property")
    return _icall_Boolean_Object_NodePath_Variant_Variant_Double_Long_Long_Double( mb, this.ptr,
        _object, property, initialVal, finalVal, duration, transType, easeType, delay)
  }

  open fun isActive(): Boolean {
    val mb = getMethodBind("Tween","is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRepeat(): Boolean {
    val mb = getMethodBind("Tween","is_repeat")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun remove(_object: Object, key: String = ""): Boolean {
    val mb = getMethodBind("Tween","remove")
    return _icall_Boolean_Object_String( mb, this.ptr, _object, key)
  }

  open fun removeAll(): Boolean {
    val mb = getMethodBind("Tween","remove_all")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun reset(_object: Object, key: String = ""): Boolean {
    val mb = getMethodBind("Tween","reset")
    return _icall_Boolean_Object_String( mb, this.ptr, _object, key)
  }

  open fun resetAll(): Boolean {
    val mb = getMethodBind("Tween","reset_all")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun resume(_object: Object, key: String = ""): Boolean {
    val mb = getMethodBind("Tween","resume")
    return _icall_Boolean_Object_String( mb, this.ptr, _object, key)
  }

  open fun resumeAll(): Boolean {
    val mb = getMethodBind("Tween","resume_all")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun seek(time: Double): Boolean {
    val mb = getMethodBind("Tween","seek")
    return _icall_Boolean_Double( mb, this.ptr, time)
  }

  open fun setActive(active: Boolean) {
    val mb = getMethodBind("Tween","set_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  open fun setRepeat(repeat: Boolean) {
    val mb = getMethodBind("Tween","set_repeat")
    _icall_Unit_Boolean( mb, this.ptr, repeat)
  }

  open fun setSpeedScale(speed: Double) {
    val mb = getMethodBind("Tween","set_speed_scale")
    _icall_Unit_Double( mb, this.ptr, speed)
  }

  open fun setTweenProcessMode(mode: Long) {
    val mb = getMethodBind("Tween","set_tween_process_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun start(): Boolean {
    val mb = getMethodBind("Tween","start")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun stop(_object: Object, key: String = ""): Boolean {
    val mb = getMethodBind("Tween","stop")
    return _icall_Boolean_Object_String( mb, this.ptr, _object, key)
  }

  open fun stopAll(): Boolean {
    val mb = getMethodBind("Tween","stop_all")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun targetingMethod(
    _object: Object,
    method: String,
    initial: Object,
    initialMethod: String,
    finalVal: Variant,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    val mb = getMethodBind("Tween","targeting_method")
    return _icall_Boolean_Object_String_Object_String_Variant_Double_Long_Long_Double( mb, this.ptr,
        _object, method, initial, initialMethod, finalVal, duration, transType, easeType, delay)
  }

  open fun targetingProperty(
    _object: Object,
    property: NodePath,
    initial: Object,
    initialVal: NodePath,
    finalVal: Variant,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    val mb = getMethodBind("Tween","targeting_property")
    return _icall_Boolean_Object_NodePath_Object_NodePath_Variant_Double_Long_Long_Double( mb,
        this.ptr, _object, property, initial, initialVal, finalVal, duration, transType, easeType,
        delay)
  }

  open fun tell(): Double {
    val mb = getMethodBind("Tween","tell")
    return _icall_Double( mb, this.ptr)
  }

  enum class TransitionType(
    id: Long
  ) {
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

    TRANS_BACK(10);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TweenProcessMode(
    id: Long
  ) {
    TWEEN_PROCESS_PHYSICS(0),

    TWEEN_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EaseType(
    id: Long
  ) {
    EASE_IN(0),

    EASE_OUT(1),

    EASE_IN_OUT(2),

    EASE_OUT_IN(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
