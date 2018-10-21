@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Animation : Resource {
    constructor() : super("Animation")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TrackType(val id: Long) {
        TYPE_VALUE(0),
        TYPE_TRANSFORM(1),
        TYPE_METHOD(2),
        TYPE_BEZIER(3),
        TYPE_AUDIO(4),
        TYPE_ANIMATION(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class UpdateMode(val id: Long) {
        UPDATE_CONTINUOUS(0),
        UPDATE_DISCRETE(1),
        UPDATE_TRIGGER(2),
        UPDATE_CAPTURE(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class InterpolationType(val id: Long) {
        INTERPOLATION_NEAREST(0),
        INTERPOLATION_LINEAR(1),
        INTERPOLATION_CUBIC(2),
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
        infix fun from(other: Resource): Animation = Animation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Animation = Animation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Animation = Animation("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Animation = fromVariant(Animation(""), other)


        // Constants
        const val TYPE_VALUE: Long = 0
        const val TYPE_TRANSFORM: Long = 1
        const val TYPE_METHOD: Long = 2
        const val TYPE_BEZIER: Long = 3
        const val TYPE_AUDIO: Long = 4
        const val TYPE_ANIMATION: Long = 5
        const val INTERPOLATION_NEAREST: Long = 0
        const val INTERPOLATION_LINEAR: Long = 1
        const val INTERPOLATION_CUBIC: Long = 2
        const val UPDATE_CONTINUOUS: Long = 0
        const val UPDATE_DISCRETE: Long = 1
        const val UPDATE_TRIGGER: Long = 2
        const val UPDATE_CAPTURE: Long = 3


    }


    // Properties
    open var length: Double
        get() = _icall_Double(getLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLengthMethodBind, this.rawMemory, value)


    open var loop: Boolean
        get() = _icall_Boolean(hasLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, value)


    open var step: Double
        get() = _icall_Double(getStepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setStepMethodBind, this.rawMemory, value)




    // Methods
    private val addTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "add_track") }
    open fun addTrack(type: Long, atPosition: Long = -1): Long {
        return _icall_Long_Long_Long(addTrackMethodBind, this.rawMemory, type, atPosition)
    }


    private val removeTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "remove_track") }
    open fun removeTrack(idx: Long) {
        _icall_Unit_Long(removeTrackMethodBind, this.rawMemory, idx)
    }


    private val getTrackCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "get_track_count") }
    open fun getTrackCount(): Long {
        return _icall_Long(getTrackCountMethodBind, this.rawMemory)
    }


    private val trackGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_type") }
    open fun trackGetType(idx: Long): Animation.TrackType {
        return Animation.TrackType.fromInt(_icall_Long_Long(trackGetTypeMethodBind, this.rawMemory, idx))
    }


    private val trackGetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_path") }
    open fun trackGetPath(idx: Long): NodePath {
        return _icall_NodePath_Long(trackGetPathMethodBind, this.rawMemory, idx)
    }


    private val trackSetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_path") }
    open fun trackSetPath(idx: Long, path: NodePath) {
        _icall_Unit_Long_NodePath(trackSetPathMethodBind, this.rawMemory, idx, path)
    }


    private val findTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "find_track") }
    open fun findTrack(path: NodePath): Long {
        return _icall_Long_NodePath(findTrackMethodBind, this.rawMemory, path)
    }


    private val trackMoveUpMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_move_up") }
    open fun trackMoveUp(idx: Long) {
        _icall_Unit_Long(trackMoveUpMethodBind, this.rawMemory, idx)
    }


    private val trackMoveDownMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_move_down") }
    open fun trackMoveDown(idx: Long) {
        _icall_Unit_Long(trackMoveDownMethodBind, this.rawMemory, idx)
    }


    private val trackSwapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_swap") }
    open fun trackSwap(idx: Long, withIdx: Long) {
        _icall_Unit_Long_Long(trackSwapMethodBind, this.rawMemory, idx, withIdx)
    }


    private val trackSetImportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_imported") }
    open fun trackSetImported(idx: Long, imported: Boolean) {
        _icall_Unit_Long_Boolean(trackSetImportedMethodBind, this.rawMemory, idx, imported)
    }


    private val trackIsImportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_is_imported") }
    open fun trackIsImported(idx: Long): Boolean {
        return _icall_Boolean_Long(trackIsImportedMethodBind, this.rawMemory, idx)
    }


    private val trackSetEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_enabled") }
    open fun trackSetEnabled(idx: Long, enabled: Boolean) {
        _icall_Unit_Long_Boolean(trackSetEnabledMethodBind, this.rawMemory, idx, enabled)
    }


    private val trackIsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_is_enabled") }
    open fun trackIsEnabled(idx: Long): Boolean {
        return _icall_Boolean_Long(trackIsEnabledMethodBind, this.rawMemory, idx)
    }


    private val transformTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "transform_track_insert_key") }
    open fun transformTrackInsertKey(idx: Long, time: Double, location: Vector3, rotation: Quat, scale: Vector3): Long {
        return _icall_Long_Long_Double_Vector3_Quat_Vector3(transformTrackInsertKeyMethodBind, this.rawMemory, idx, time, location, rotation, scale)
    }


    private val trackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_insert_key") }
    open fun trackInsertKey(idx: Long, time: Double, key: Variant, transition: Double = 1.0) {
        _icall_Unit_Long_Double_Variant_Double(trackInsertKeyMethodBind, this.rawMemory, idx, time, key, transition)
    }


    private val trackRemoveKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_remove_key") }
    open fun trackRemoveKey(idx: Long, keyIdx: Long) {
        _icall_Unit_Long_Long(trackRemoveKeyMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackRemoveKeyAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_remove_key_at_position") }
    open fun trackRemoveKeyAtPosition(idx: Long, position: Double) {
        _icall_Unit_Long_Double(trackRemoveKeyAtPositionMethodBind, this.rawMemory, idx, position)
    }


    private val trackSetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_key_value") }
    open fun trackSetKeyValue(idx: Long, key: Long, value: Variant) {
        _icall_Unit_Long_Long_Variant(trackSetKeyValueMethodBind, this.rawMemory, idx, key, value)
    }


    private val trackSetKeyTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_key_transition") }
    open fun trackSetKeyTransition(idx: Long, keyIdx: Long, transition: Double) {
        _icall_Unit_Long_Long_Double(trackSetKeyTransitionMethodBind, this.rawMemory, idx, keyIdx, transition)
    }


    private val trackGetKeyTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_transition") }
    open fun trackGetKeyTransition(idx: Long, keyIdx: Long): Double {
        return _icall_Double_Long_Long(trackGetKeyTransitionMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackGetKeyCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_count") }
    open fun trackGetKeyCount(idx: Long): Long {
        return _icall_Long_Long(trackGetKeyCountMethodBind, this.rawMemory, idx)
    }


    private val trackGetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_value") }
    open fun trackGetKeyValue(idx: Long, keyIdx: Long): Variant {
        return _icall_Variant_Long_Long(trackGetKeyValueMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackGetKeyTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_time") }
    open fun trackGetKeyTime(idx: Long, keyIdx: Long): Double {
        return _icall_Double_Long_Long(trackGetKeyTimeMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackFindKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_find_key") }
    open fun trackFindKey(idx: Long, time: Double, exact: Boolean = false): Long {
        return _icall_Long_Long_Double_Boolean(trackFindKeyMethodBind, this.rawMemory, idx, time, exact)
    }


    private val trackSetInterpolationTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_interpolation_type") }
    open fun trackSetInterpolationType(idx: Long, interpolation: Long) {
        _icall_Unit_Long_Long(trackSetInterpolationTypeMethodBind, this.rawMemory, idx, interpolation)
    }


    private val trackGetInterpolationTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_interpolation_type") }
    open fun trackGetInterpolationType(idx: Long): Animation.InterpolationType {
        return Animation.InterpolationType.fromInt(_icall_Long_Long(trackGetInterpolationTypeMethodBind, this.rawMemory, idx))
    }


    private val trackSetInterpolationLoopWrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_interpolation_loop_wrap") }
    open fun trackSetInterpolationLoopWrap(idx: Long, interpolation: Boolean) {
        _icall_Unit_Long_Boolean(trackSetInterpolationLoopWrapMethodBind, this.rawMemory, idx, interpolation)
    }


    private val trackGetInterpolationLoopWrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_interpolation_loop_wrap") }
    open fun trackGetInterpolationLoopWrap(idx: Long): Boolean {
        return _icall_Boolean_Long(trackGetInterpolationLoopWrapMethodBind, this.rawMemory, idx)
    }


    private val transformTrackInterpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "transform_track_interpolate") }
    open fun transformTrackInterpolate(idx: Long, timeSec: Double): GDArray {
        return _icall_GDArray_Long_Double(transformTrackInterpolateMethodBind, this.rawMemory, idx, timeSec)
    }


    private val valueTrackSetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "value_track_set_update_mode") }
    open fun valueTrackSetUpdateMode(idx: Long, mode: Long) {
        _icall_Unit_Long_Long(valueTrackSetUpdateModeMethodBind, this.rawMemory, idx, mode)
    }


    private val valueTrackGetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "value_track_get_update_mode") }
    open fun valueTrackGetUpdateMode(idx: Long): Animation.UpdateMode {
        return Animation.UpdateMode.fromInt(_icall_Long_Long(valueTrackGetUpdateModeMethodBind, this.rawMemory, idx))
    }


    private val valueTrackGetKeyIndicesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "value_track_get_key_indices") }
    open fun valueTrackGetKeyIndices(idx: Long, timeSec: Double, delta: Double): PoolIntArray {
        return _icall_PoolIntArray_Long_Double_Double(valueTrackGetKeyIndicesMethodBind, this.rawMemory, idx, timeSec, delta)
    }


    private val methodTrackGetKeyIndicesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "method_track_get_key_indices") }
    open fun methodTrackGetKeyIndices(idx: Long, timeSec: Double, delta: Double): PoolIntArray {
        return _icall_PoolIntArray_Long_Double_Double(methodTrackGetKeyIndicesMethodBind, this.rawMemory, idx, timeSec, delta)
    }


    private val methodTrackGetNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "method_track_get_name") }
    open fun methodTrackGetName(idx: Long, keyIdx: Long): String {
        return _icall_String_Long_Long(methodTrackGetNameMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val methodTrackGetParamsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "method_track_get_params") }
    open fun methodTrackGetParams(idx: Long, keyIdx: Long): GDArray {
        return _icall_GDArray_Long_Long(methodTrackGetParamsMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_insert_key") }
    open fun bezierTrackInsertKey(track: Long, time: Double, value: Double, inHandle: Vector2 = Vector2(0, 0), outHandle: Vector2 = Vector2(0, 0)): Long {
        return _icall_Long_Long_Double_Double_Vector2_Vector2(bezierTrackInsertKeyMethodBind, this.rawMemory, track, time, value, inHandle, outHandle)
    }


    private val bezierTrackSetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_set_key_value") }
    open fun bezierTrackSetKeyValue(idx: Long, keyIdx: Long, value: Double) {
        _icall_Unit_Long_Long_Double(bezierTrackSetKeyValueMethodBind, this.rawMemory, idx, keyIdx, value)
    }


    private val bezierTrackSetKeyInHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_set_key_in_handle") }
    open fun bezierTrackSetKeyInHandle(idx: Long, keyIdx: Long, inHandle: Vector2) {
        _icall_Unit_Long_Long_Vector2(bezierTrackSetKeyInHandleMethodBind, this.rawMemory, idx, keyIdx, inHandle)
    }


    private val bezierTrackSetKeyOutHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_set_key_out_handle") }
    open fun bezierTrackSetKeyOutHandle(idx: Long, keyIdx: Long, outHandle: Vector2) {
        _icall_Unit_Long_Long_Vector2(bezierTrackSetKeyOutHandleMethodBind, this.rawMemory, idx, keyIdx, outHandle)
    }


    private val bezierTrackGetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_get_key_value") }
    open fun bezierTrackGetKeyValue(idx: Long, keyIdx: Long): Double {
        return _icall_Double_Long_Long(bezierTrackGetKeyValueMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackGetKeyInHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_get_key_in_handle") }
    open fun bezierTrackGetKeyInHandle(idx: Long, keyIdx: Long): Vector2 {
        return _icall_Vector2_Long_Long(bezierTrackGetKeyInHandleMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackGetKeyOutHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_get_key_out_handle") }
    open fun bezierTrackGetKeyOutHandle(idx: Long, keyIdx: Long): Vector2 {
        return _icall_Vector2_Long_Long(bezierTrackGetKeyOutHandleMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackInterpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_interpolate") }
    open fun bezierTrackInterpolate(track: Long, time: Double): Double {
        return _icall_Double_Long_Double(bezierTrackInterpolateMethodBind, this.rawMemory, track, time)
    }


    private val audioTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_insert_key") }
    open fun audioTrackInsertKey(track: Long, time: Double, stream: Resource, startOffset: Double = 0.0, endOffset: Double = 0.0): Long {
        return _icall_Long_Long_Double_Object_Double_Double(audioTrackInsertKeyMethodBind, this.rawMemory, track, time, stream, startOffset, endOffset)
    }


    private val audioTrackSetKeyStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_set_key_stream") }
    open fun audioTrackSetKeyStream(idx: Long, keyIdx: Long, stream: Resource) {
        _icall_Unit_Long_Long_Object(audioTrackSetKeyStreamMethodBind, this.rawMemory, idx, keyIdx, stream)
    }


    private val audioTrackSetKeyStartOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_set_key_start_offset") }
    open fun audioTrackSetKeyStartOffset(idx: Long, keyIdx: Long, offset: Double) {
        _icall_Unit_Long_Long_Double(audioTrackSetKeyStartOffsetMethodBind, this.rawMemory, idx, keyIdx, offset)
    }


    private val audioTrackSetKeyEndOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_set_key_end_offset") }
    open fun audioTrackSetKeyEndOffset(idx: Long, keyIdx: Long, offset: Double) {
        _icall_Unit_Long_Long_Double(audioTrackSetKeyEndOffsetMethodBind, this.rawMemory, idx, keyIdx, offset)
    }


    private val audioTrackGetKeyStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_get_key_stream") }
    open fun audioTrackGetKeyStream(idx: Long, keyIdx: Long): Resource {
        return _icall_Resource_Long_Long(audioTrackGetKeyStreamMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val audioTrackGetKeyStartOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_get_key_start_offset") }
    open fun audioTrackGetKeyStartOffset(idx: Long, keyIdx: Long): Double {
        return _icall_Double_Long_Long(audioTrackGetKeyStartOffsetMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val audioTrackGetKeyEndOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_get_key_end_offset") }
    open fun audioTrackGetKeyEndOffset(idx: Long, keyIdx: Long): Double {
        return _icall_Double_Long_Long(audioTrackGetKeyEndOffsetMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val animationTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "animation_track_insert_key") }
    open fun animationTrackInsertKey(track: Long, time: Double, animation: String): Long {
        return _icall_Long_Long_Double_String(animationTrackInsertKeyMethodBind, this.rawMemory, track, time, animation)
    }


    private val animationTrackSetKeyAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "animation_track_set_key_animation") }
    open fun animationTrackSetKeyAnimation(idx: Long, keyIdx: Long, animation: String) {
        _icall_Unit_Long_Long_String(animationTrackSetKeyAnimationMethodBind, this.rawMemory, idx, keyIdx, animation)
    }


    private val animationTrackGetKeyAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "animation_track_get_key_animation") }
    open fun animationTrackGetKeyAnimation(idx: Long, keyIdx: Long): String {
        return _icall_String_Long_Long(animationTrackGetKeyAnimationMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val setLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "set_length") }
    open fun setLength(timeSec: Double) {
        _icall_Unit_Double(setLengthMethodBind, this.rawMemory, timeSec)
    }


    private val getLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "get_length") }
    open fun getLength(): Double {
        return _icall_Double(getLengthMethodBind, this.rawMemory)
    }


    private val setLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "set_loop") }
    open fun setLoop(enabled: Boolean) {
        _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, enabled)
    }


    private val hasLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "has_loop") }
    open fun hasLoop(): Boolean {
        return _icall_Boolean(hasLoopMethodBind, this.rawMemory)
    }


    private val setStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "set_step") }
    open fun setStep(sizeSec: Double) {
        _icall_Unit_Double(setStepMethodBind, this.rawMemory, sizeSec)
    }


    private val getStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "get_step") }
    open fun getStep(): Double {
        return _icall_Double(getStepMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val copyTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "copy_track") }
    open fun copyTrack(track: Long, toAnimation: Animation) {
        _icall_Unit_Long_Object(copyTrackMethodBind, this.rawMemory, track, toAnimation)
    }


}
