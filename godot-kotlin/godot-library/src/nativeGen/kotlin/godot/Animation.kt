package godot

import godot.Animation
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.PoolIntArray
import godot.core.Quat
import godot.core.Signal0
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long_Double
import godot.icalls._icall_Double_Long_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Double_Boolean
import godot.icalls._icall_Long_Long_Double_Double_Vector2_Vector2
import godot.icalls._icall_Long_Long_Double_Object_Double_Double
import godot.icalls._icall_Long_Long_Double_String
import godot.icalls._icall_Long_Long_Double_Vector3_Quat_Vector3
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Long_NodePath
import godot.icalls._icall_NodePath_Long
import godot.icalls._icall_PoolIntArray_Long_Double_Double
import godot.icalls._icall_Resource_Long_Long
import godot.icalls._icall_String_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Double_Variant_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Double
import godot.icalls._icall_Unit_Long_Long_Object
import godot.icalls._icall_Unit_Long_Long_String
import godot.icalls._icall_Unit_Long_Long_Variant
import godot.icalls._icall_Unit_Long_Long_Vector2
import godot.icalls._icall_Unit_Long_NodePath
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_VariantArray_Long_Double
import godot.icalls._icall_VariantArray_Long_Long
import godot.icalls._icall_Variant_Long_Long
import godot.icalls._icall_Vector2_Long_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class Animation internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  val tracksChanged: Signal0 by signal()

  open var length: Double
    get() {
      val mb = getMethodBind("Animation","get_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Animation","set_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var loop: Boolean
    get() {
      val mb = getMethodBind("Animation","has_loop")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Animation","set_loop")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var step: Double
    get() {
      val mb = getMethodBind("Animation","get_step")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Animation","set_step")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Animation", "Animation")
        }

  }

  open fun addTrack(type: Long, atPosition: Long = -1): Long {
    val mb = getMethodBind("Animation","add_track")
    return _icall_Long_Long_Long( mb, this.ptr, type, atPosition)
  }

  open fun animationTrackGetKeyAnimation(trackIdx: Long, keyIdx: Long): String {
    val mb = getMethodBind("Animation","animation_track_get_key_animation")
    return _icall_String_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun animationTrackInsertKey(
    trackIdx: Long,
    time: Double,
    animation: String
  ): Long {
    val mb = getMethodBind("Animation","animation_track_insert_key")
    return _icall_Long_Long_Double_String( mb, this.ptr, trackIdx, time, animation)
  }

  open fun animationTrackSetKeyAnimation(
    trackIdx: Long,
    keyIdx: Long,
    animation: String
  ) {
    val mb = getMethodBind("Animation","animation_track_set_key_animation")
    _icall_Unit_Long_Long_String( mb, this.ptr, trackIdx, keyIdx, animation)
  }

  open fun audioTrackGetKeyEndOffset(trackIdx: Long, keyIdx: Long): Double {
    val mb = getMethodBind("Animation","audio_track_get_key_end_offset")
    return _icall_Double_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun audioTrackGetKeyStartOffset(trackIdx: Long, keyIdx: Long): Double {
    val mb = getMethodBind("Animation","audio_track_get_key_start_offset")
    return _icall_Double_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun audioTrackGetKeyStream(trackIdx: Long, keyIdx: Long): Resource {
    val mb = getMethodBind("Animation","audio_track_get_key_stream")
    return _icall_Resource_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun audioTrackInsertKey(
    trackIdx: Long,
    time: Double,
    stream: Resource,
    startOffset: Double = 0.0,
    endOffset: Double = 0.0
  ): Long {
    val mb = getMethodBind("Animation","audio_track_insert_key")
    return _icall_Long_Long_Double_Object_Double_Double( mb, this.ptr, trackIdx, time, stream,
        startOffset, endOffset)
  }

  open fun audioTrackSetKeyEndOffset(
    trackIdx: Long,
    keyIdx: Long,
    offset: Double
  ) {
    val mb = getMethodBind("Animation","audio_track_set_key_end_offset")
    _icall_Unit_Long_Long_Double( mb, this.ptr, trackIdx, keyIdx, offset)
  }

  open fun audioTrackSetKeyStartOffset(
    trackIdx: Long,
    keyIdx: Long,
    offset: Double
  ) {
    val mb = getMethodBind("Animation","audio_track_set_key_start_offset")
    _icall_Unit_Long_Long_Double( mb, this.ptr, trackIdx, keyIdx, offset)
  }

  open fun audioTrackSetKeyStream(
    trackIdx: Long,
    keyIdx: Long,
    stream: Resource
  ) {
    val mb = getMethodBind("Animation","audio_track_set_key_stream")
    _icall_Unit_Long_Long_Object( mb, this.ptr, trackIdx, keyIdx, stream)
  }

  open fun bezierTrackGetKeyInHandle(trackIdx: Long, keyIdx: Long): Vector2 {
    val mb = getMethodBind("Animation","bezier_track_get_key_in_handle")
    return _icall_Vector2_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun bezierTrackGetKeyOutHandle(trackIdx: Long, keyIdx: Long): Vector2 {
    val mb = getMethodBind("Animation","bezier_track_get_key_out_handle")
    return _icall_Vector2_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun bezierTrackGetKeyValue(trackIdx: Long, keyIdx: Long): Double {
    val mb = getMethodBind("Animation","bezier_track_get_key_value")
    return _icall_Double_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun bezierTrackInsertKey(
    trackIdx: Long,
    time: Double,
    value: Double,
    inHandle: Vector2 = Vector2(0.0, 0.0),
    outHandle: Vector2 = Vector2(0.0, 0.0)
  ): Long {
    val mb = getMethodBind("Animation","bezier_track_insert_key")
    return _icall_Long_Long_Double_Double_Vector2_Vector2( mb, this.ptr, trackIdx, time, value,
        inHandle, outHandle)
  }

  open fun bezierTrackInterpolate(trackIdx: Long, time: Double): Double {
    val mb = getMethodBind("Animation","bezier_track_interpolate")
    return _icall_Double_Long_Double( mb, this.ptr, trackIdx, time)
  }

  open fun bezierTrackSetKeyInHandle(
    trackIdx: Long,
    keyIdx: Long,
    inHandle: Vector2
  ) {
    val mb = getMethodBind("Animation","bezier_track_set_key_in_handle")
    _icall_Unit_Long_Long_Vector2( mb, this.ptr, trackIdx, keyIdx, inHandle)
  }

  open fun bezierTrackSetKeyOutHandle(
    trackIdx: Long,
    keyIdx: Long,
    outHandle: Vector2
  ) {
    val mb = getMethodBind("Animation","bezier_track_set_key_out_handle")
    _icall_Unit_Long_Long_Vector2( mb, this.ptr, trackIdx, keyIdx, outHandle)
  }

  open fun bezierTrackSetKeyValue(
    trackIdx: Long,
    keyIdx: Long,
    value: Double
  ) {
    val mb = getMethodBind("Animation","bezier_track_set_key_value")
    _icall_Unit_Long_Long_Double( mb, this.ptr, trackIdx, keyIdx, value)
  }

  open fun clear() {
    val mb = getMethodBind("Animation","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun copyTrack(trackIdx: Long, toAnimation: Animation) {
    val mb = getMethodBind("Animation","copy_track")
    _icall_Unit_Long_Object( mb, this.ptr, trackIdx, toAnimation)
  }

  open fun findTrack(path: NodePath): Long {
    val mb = getMethodBind("Animation","find_track")
    return _icall_Long_NodePath( mb, this.ptr, path)
  }

  open fun getLength(): Double {
    val mb = getMethodBind("Animation","get_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStep(): Double {
    val mb = getMethodBind("Animation","get_step")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTrackCount(): Long {
    val mb = getMethodBind("Animation","get_track_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun hasLoop(): Boolean {
    val mb = getMethodBind("Animation","has_loop")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun methodTrackGetKeyIndices(
    trackIdx: Long,
    timeSec: Double,
    delta: Double
  ): PoolIntArray {
    val mb = getMethodBind("Animation","method_track_get_key_indices")
    return _icall_PoolIntArray_Long_Double_Double( mb, this.ptr, trackIdx, timeSec, delta)
  }

  open fun methodTrackGetName(trackIdx: Long, keyIdx: Long): String {
    val mb = getMethodBind("Animation","method_track_get_name")
    return _icall_String_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun methodTrackGetParams(trackIdx: Long, keyIdx: Long): VariantArray {
    val mb = getMethodBind("Animation","method_track_get_params")
    return _icall_VariantArray_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun removeTrack(trackIdx: Long) {
    val mb = getMethodBind("Animation","remove_track")
    _icall_Unit_Long( mb, this.ptr, trackIdx)
  }

  open fun setLength(timeSec: Double) {
    val mb = getMethodBind("Animation","set_length")
    _icall_Unit_Double( mb, this.ptr, timeSec)
  }

  open fun setLoop(enabled: Boolean) {
    val mb = getMethodBind("Animation","set_loop")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setStep(sizeSec: Double) {
    val mb = getMethodBind("Animation","set_step")
    _icall_Unit_Double( mb, this.ptr, sizeSec)
  }

  open fun trackFindKey(
    trackIdx: Long,
    time: Double,
    exact: Boolean = false
  ): Long {
    val mb = getMethodBind("Animation","track_find_key")
    return _icall_Long_Long_Double_Boolean( mb, this.ptr, trackIdx, time, exact)
  }

  open fun trackGetInterpolationLoopWrap(trackIdx: Long): Boolean {
    val mb = getMethodBind("Animation","track_get_interpolation_loop_wrap")
    return _icall_Boolean_Long( mb, this.ptr, trackIdx)
  }

  open fun trackGetInterpolationType(trackIdx: Long): Animation.InterpolationType {
    val mb = getMethodBind("Animation","track_get_interpolation_type")
    return Animation.InterpolationType.from( _icall_Long_Long( mb, this.ptr, trackIdx))
  }

  open fun trackGetKeyCount(trackIdx: Long): Long {
    val mb = getMethodBind("Animation","track_get_key_count")
    return _icall_Long_Long( mb, this.ptr, trackIdx)
  }

  open fun trackGetKeyTime(trackIdx: Long, keyIdx: Long): Double {
    val mb = getMethodBind("Animation","track_get_key_time")
    return _icall_Double_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun trackGetKeyTransition(trackIdx: Long, keyIdx: Long): Double {
    val mb = getMethodBind("Animation","track_get_key_transition")
    return _icall_Double_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun trackGetKeyValue(trackIdx: Long, keyIdx: Long): Variant {
    val mb = getMethodBind("Animation","track_get_key_value")
    return _icall_Variant_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun trackGetPath(trackIdx: Long): NodePath {
    val mb = getMethodBind("Animation","track_get_path")
    return _icall_NodePath_Long( mb, this.ptr, trackIdx)
  }

  open fun trackGetType(trackIdx: Long): Animation.TrackType {
    val mb = getMethodBind("Animation","track_get_type")
    return Animation.TrackType.from( _icall_Long_Long( mb, this.ptr, trackIdx))
  }

  open fun trackInsertKey(
    trackIdx: Long,
    time: Double,
    key: Variant,
    transition: Double = 1.0
  ) {
    val mb = getMethodBind("Animation","track_insert_key")
    _icall_Unit_Long_Double_Variant_Double( mb, this.ptr, trackIdx, time, key, transition)
  }

  open fun trackIsEnabled(trackIdx: Long): Boolean {
    val mb = getMethodBind("Animation","track_is_enabled")
    return _icall_Boolean_Long( mb, this.ptr, trackIdx)
  }

  open fun trackIsImported(trackIdx: Long): Boolean {
    val mb = getMethodBind("Animation","track_is_imported")
    return _icall_Boolean_Long( mb, this.ptr, trackIdx)
  }

  open fun trackMoveDown(trackIdx: Long) {
    val mb = getMethodBind("Animation","track_move_down")
    _icall_Unit_Long( mb, this.ptr, trackIdx)
  }

  open fun trackMoveTo(trackIdx: Long, toIdx: Long) {
    val mb = getMethodBind("Animation","track_move_to")
    _icall_Unit_Long_Long( mb, this.ptr, trackIdx, toIdx)
  }

  open fun trackMoveUp(trackIdx: Long) {
    val mb = getMethodBind("Animation","track_move_up")
    _icall_Unit_Long( mb, this.ptr, trackIdx)
  }

  open fun trackRemoveKey(trackIdx: Long, keyIdx: Long) {
    val mb = getMethodBind("Animation","track_remove_key")
    _icall_Unit_Long_Long( mb, this.ptr, trackIdx, keyIdx)
  }

  open fun trackRemoveKeyAtPosition(trackIdx: Long, position: Double) {
    val mb = getMethodBind("Animation","track_remove_key_at_position")
    _icall_Unit_Long_Double( mb, this.ptr, trackIdx, position)
  }

  open fun trackSetEnabled(trackIdx: Long, enabled: Boolean) {
    val mb = getMethodBind("Animation","track_set_enabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, trackIdx, enabled)
  }

  open fun trackSetImported(trackIdx: Long, imported: Boolean) {
    val mb = getMethodBind("Animation","track_set_imported")
    _icall_Unit_Long_Boolean( mb, this.ptr, trackIdx, imported)
  }

  open fun trackSetInterpolationLoopWrap(trackIdx: Long, interpolation: Boolean) {
    val mb = getMethodBind("Animation","track_set_interpolation_loop_wrap")
    _icall_Unit_Long_Boolean( mb, this.ptr, trackIdx, interpolation)
  }

  open fun trackSetInterpolationType(trackIdx: Long, interpolation: Long) {
    val mb = getMethodBind("Animation","track_set_interpolation_type")
    _icall_Unit_Long_Long( mb, this.ptr, trackIdx, interpolation)
  }

  open fun trackSetKeyTime(
    trackIdx: Long,
    keyIdx: Long,
    time: Double
  ) {
    val mb = getMethodBind("Animation","track_set_key_time")
    _icall_Unit_Long_Long_Double( mb, this.ptr, trackIdx, keyIdx, time)
  }

  open fun trackSetKeyTransition(
    trackIdx: Long,
    keyIdx: Long,
    transition: Double
  ) {
    val mb = getMethodBind("Animation","track_set_key_transition")
    _icall_Unit_Long_Long_Double( mb, this.ptr, trackIdx, keyIdx, transition)
  }

  open fun trackSetKeyValue(
    trackIdx: Long,
    key: Long,
    value: Variant
  ) {
    val mb = getMethodBind("Animation","track_set_key_value")
    _icall_Unit_Long_Long_Variant( mb, this.ptr, trackIdx, key, value)
  }

  open fun trackSetPath(trackIdx: Long, path: NodePath) {
    val mb = getMethodBind("Animation","track_set_path")
    _icall_Unit_Long_NodePath( mb, this.ptr, trackIdx, path)
  }

  open fun trackSwap(trackIdx: Long, withIdx: Long) {
    val mb = getMethodBind("Animation","track_swap")
    _icall_Unit_Long_Long( mb, this.ptr, trackIdx, withIdx)
  }

  open fun transformTrackInsertKey(
    trackIdx: Long,
    time: Double,
    location: Vector3,
    rotation: Quat,
    scale: Vector3
  ): Long {
    val mb = getMethodBind("Animation","transform_track_insert_key")
    return _icall_Long_Long_Double_Vector3_Quat_Vector3( mb, this.ptr, trackIdx, time, location,
        rotation, scale)
  }

  open fun transformTrackInterpolate(trackIdx: Long, timeSec: Double): VariantArray {
    val mb = getMethodBind("Animation","transform_track_interpolate")
    return _icall_VariantArray_Long_Double( mb, this.ptr, trackIdx, timeSec)
  }

  open fun valueTrackGetKeyIndices(
    trackIdx: Long,
    timeSec: Double,
    delta: Double
  ): PoolIntArray {
    val mb = getMethodBind("Animation","value_track_get_key_indices")
    return _icall_PoolIntArray_Long_Double_Double( mb, this.ptr, trackIdx, timeSec, delta)
  }

  open fun valueTrackGetUpdateMode(trackIdx: Long): Animation.UpdateMode {
    val mb = getMethodBind("Animation","value_track_get_update_mode")
    return Animation.UpdateMode.from( _icall_Long_Long( mb, this.ptr, trackIdx))
  }

  open fun valueTrackSetUpdateMode(trackIdx: Long, mode: Long) {
    val mb = getMethodBind("Animation","value_track_set_update_mode")
    _icall_Unit_Long_Long( mb, this.ptr, trackIdx, mode)
  }

  enum class TrackType(
    id: Long
  ) {
    TYPE_VALUE(0),

    TYPE_TRANSFORM(1),

    TYPE_METHOD(2),

    TYPE_BEZIER(3),

    TYPE_AUDIO(4),

    TYPE_ANIMATION(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class UpdateMode(
    id: Long
  ) {
    UPDATE_CONTINUOUS(0),

    UPDATE_DISCRETE(1),

    UPDATE_TRIGGER(2),

    UPDATE_CAPTURE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class InterpolationType(
    id: Long
  ) {
    INTERPOLATION_NEAREST(0),

    INTERPOLATION_LINEAR(1),

    INTERPOLATION_CUBIC(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val INTERPOLATION_CUBIC: Long = 2

    final const val INTERPOLATION_LINEAR: Long = 1

    final const val INTERPOLATION_NEAREST: Long = 0

    final const val TYPE_ANIMATION: Long = 5

    final const val TYPE_AUDIO: Long = 4

    final const val TYPE_BEZIER: Long = 3

    final const val TYPE_METHOD: Long = 2

    final const val TYPE_TRANSFORM: Long = 1

    final const val TYPE_VALUE: Long = 0

    final const val UPDATE_CAPTURE: Long = 3

    final const val UPDATE_CONTINUOUS: Long = 0

    final const val UPDATE_DISCRETE: Long = 1

    final const val UPDATE_TRIGGER: Long = 2
  }
}
