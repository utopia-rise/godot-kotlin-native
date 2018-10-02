@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Animation : Resource {
    constructor() : super("Animation")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TrackType(val id: Int) {
        TYPE_VALUE(0),
        TYPE_TRANSFORM(1),
        TYPE_METHOD(2),
        TYPE_BEZIER(3),
        TYPE_AUDIO(4),
        TYPE_ANIMATION(5),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class UpdateMode(val id: Int) {
        UPDATE_CONTINUOUS(0),
        UPDATE_DISCRETE(1),
        UPDATE_TRIGGER(2),
        UPDATE_CAPTURE(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class InterpolationType(val id: Int) {
        INTERPOLATION_NEAREST(0),
        INTERPOLATION_LINEAR(1),
        INTERPOLATION_CUBIC(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val TYPE_VALUE: Int = 0
        const val TYPE_TRANSFORM: Int = 1
        const val TYPE_METHOD: Int = 2
        const val TYPE_BEZIER: Int = 3
        const val TYPE_AUDIO: Int = 4
        const val TYPE_ANIMATION: Int = 5
        const val INTERPOLATION_NEAREST: Int = 0
        const val INTERPOLATION_LINEAR: Int = 1
        const val INTERPOLATION_CUBIC: Int = 2
        const val UPDATE_CONTINUOUS: Int = 0
        const val UPDATE_DISCRETE: Int = 1
        const val UPDATE_TRIGGER: Int = 2
        const val UPDATE_CAPTURE: Int = 3


    }


    // Properties
    open var length: Float
        get() = _icall_Float(getLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setLengthMethodBind, this.rawMemory, value)


    open var loop: Boolean
        get() = _icall_Boolean(hasLoopMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoopMethodBind, this.rawMemory, value)


    open var step: Float
        get() = _icall_Float(getStepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setStepMethodBind, this.rawMemory, value)




    // Methods
    private val addTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "add_track") }
    open fun addTrack(type: Int, atPosition: Int = -1): Int {
        return _icall_Int_Int_Int(addTrackMethodBind, this.rawMemory, type, atPosition)
    }


    private val removeTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "remove_track") }
    open fun removeTrack(idx: Int) {
        _icall_Unit_Int(removeTrackMethodBind, this.rawMemory, idx)
    }


    private val getTrackCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "get_track_count") }
    open fun getTrackCount(): Int {
        return _icall_Int(getTrackCountMethodBind, this.rawMemory)
    }


    private val trackGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_type") }
    open fun trackGetType(idx: Int): Animation.TrackType {
        return Animation.TrackType.fromInt(_icall_Int_Int(trackGetTypeMethodBind, this.rawMemory, idx))
    }


    private val trackGetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_path") }
    open fun trackGetPath(idx: Int): NodePath {
        return _icall_NodePath_Int(trackGetPathMethodBind, this.rawMemory, idx)
    }


    private val trackSetPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_path") }
    open fun trackSetPath(idx: Int, path: NodePath) {
        _icall_Unit_Int_NodePath(trackSetPathMethodBind, this.rawMemory, idx, path)
    }


    private val findTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "find_track") }
    open fun findTrack(path: NodePath): Int {
        return _icall_Int_NodePath(findTrackMethodBind, this.rawMemory, path)
    }


    private val trackMoveUpMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_move_up") }
    open fun trackMoveUp(idx: Int) {
        _icall_Unit_Int(trackMoveUpMethodBind, this.rawMemory, idx)
    }


    private val trackMoveDownMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_move_down") }
    open fun trackMoveDown(idx: Int) {
        _icall_Unit_Int(trackMoveDownMethodBind, this.rawMemory, idx)
    }


    private val trackSwapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_swap") }
    open fun trackSwap(idx: Int, withIdx: Int) {
        _icall_Unit_Int_Int(trackSwapMethodBind, this.rawMemory, idx, withIdx)
    }


    private val trackSetImportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_imported") }
    open fun trackSetImported(idx: Int, imported: Boolean) {
        _icall_Unit_Int_Boolean(trackSetImportedMethodBind, this.rawMemory, idx, imported)
    }


    private val trackIsImportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_is_imported") }
    open fun trackIsImported(idx: Int): Boolean {
        return _icall_Boolean_Int(trackIsImportedMethodBind, this.rawMemory, idx)
    }


    private val trackSetEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_enabled") }
    open fun trackSetEnabled(idx: Int, enabled: Boolean) {
        _icall_Unit_Int_Boolean(trackSetEnabledMethodBind, this.rawMemory, idx, enabled)
    }


    private val trackIsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_is_enabled") }
    open fun trackIsEnabled(idx: Int): Boolean {
        return _icall_Boolean_Int(trackIsEnabledMethodBind, this.rawMemory, idx)
    }


    private val transformTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "transform_track_insert_key") }
    open fun transformTrackInsertKey(idx: Int, time: Float, location: Vector3, rotation: Quat, scale: Vector3): Int {
        return _icall_Int_Int_Float_Vector3_Quat_Vector3(transformTrackInsertKeyMethodBind, this.rawMemory, idx, time, location, rotation, scale)
    }


    private val trackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_insert_key") }
    open fun trackInsertKey(idx: Int, time: Float, key: Variant, transition: Float = 1f) {
        _icall_Unit_Int_Float_Variant_Float(trackInsertKeyMethodBind, this.rawMemory, idx, time, key, transition)
    }


    private val trackRemoveKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_remove_key") }
    open fun trackRemoveKey(idx: Int, keyIdx: Int) {
        _icall_Unit_Int_Int(trackRemoveKeyMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackRemoveKeyAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_remove_key_at_position") }
    open fun trackRemoveKeyAtPosition(idx: Int, position: Float) {
        _icall_Unit_Int_Float(trackRemoveKeyAtPositionMethodBind, this.rawMemory, idx, position)
    }


    private val trackSetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_key_value") }
    open fun trackSetKeyValue(idx: Int, key: Int, value: Variant) {
        _icall_Unit_Int_Int_Variant(trackSetKeyValueMethodBind, this.rawMemory, idx, key, value)
    }


    private val trackSetKeyTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_key_transition") }
    open fun trackSetKeyTransition(idx: Int, keyIdx: Int, transition: Float) {
        _icall_Unit_Int_Int_Float(trackSetKeyTransitionMethodBind, this.rawMemory, idx, keyIdx, transition)
    }


    private val trackGetKeyTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_transition") }
    open fun trackGetKeyTransition(idx: Int, keyIdx: Int): Float {
        return _icall_Float_Int_Int(trackGetKeyTransitionMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackGetKeyCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_count") }
    open fun trackGetKeyCount(idx: Int): Int {
        return _icall_Int_Int(trackGetKeyCountMethodBind, this.rawMemory, idx)
    }


    private val trackGetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_value") }
    open fun trackGetKeyValue(idx: Int, keyIdx: Int): Variant {
        return _icall_Variant_Int_Int(trackGetKeyValueMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackGetKeyTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_key_time") }
    open fun trackGetKeyTime(idx: Int, keyIdx: Int): Float {
        return _icall_Float_Int_Int(trackGetKeyTimeMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val trackFindKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_find_key") }
    open fun trackFindKey(idx: Int, time: Float, exact: Boolean = false): Int {
        return _icall_Int_Int_Float_Boolean(trackFindKeyMethodBind, this.rawMemory, idx, time, exact)
    }


    private val trackSetInterpolationTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_interpolation_type") }
    open fun trackSetInterpolationType(idx: Int, interpolation: Int) {
        _icall_Unit_Int_Int(trackSetInterpolationTypeMethodBind, this.rawMemory, idx, interpolation)
    }


    private val trackGetInterpolationTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_interpolation_type") }
    open fun trackGetInterpolationType(idx: Int): Animation.InterpolationType {
        return Animation.InterpolationType.fromInt(_icall_Int_Int(trackGetInterpolationTypeMethodBind, this.rawMemory, idx))
    }


    private val trackSetInterpolationLoopWrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_set_interpolation_loop_wrap") }
    open fun trackSetInterpolationLoopWrap(idx: Int, interpolation: Boolean) {
        _icall_Unit_Int_Boolean(trackSetInterpolationLoopWrapMethodBind, this.rawMemory, idx, interpolation)
    }


    private val trackGetInterpolationLoopWrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "track_get_interpolation_loop_wrap") }
    open fun trackGetInterpolationLoopWrap(idx: Int): Boolean {
        return _icall_Boolean_Int(trackGetInterpolationLoopWrapMethodBind, this.rawMemory, idx)
    }


    private val transformTrackInterpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "transform_track_interpolate") }
    open fun transformTrackInterpolate(idx: Int, timeSec: Float): GDArray {
        return _icall_GDArray_Int_Float(transformTrackInterpolateMethodBind, this.rawMemory, idx, timeSec)
    }


    private val valueTrackSetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "value_track_set_update_mode") }
    open fun valueTrackSetUpdateMode(idx: Int, mode: Int) {
        _icall_Unit_Int_Int(valueTrackSetUpdateModeMethodBind, this.rawMemory, idx, mode)
    }


    private val valueTrackGetUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "value_track_get_update_mode") }
    open fun valueTrackGetUpdateMode(idx: Int): Animation.UpdateMode {
        return Animation.UpdateMode.fromInt(_icall_Int_Int(valueTrackGetUpdateModeMethodBind, this.rawMemory, idx))
    }


    private val valueTrackGetKeyIndicesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "value_track_get_key_indices") }
    open fun valueTrackGetKeyIndices(idx: Int, timeSec: Float, delta: Float): PoolIntArray {
        return _icall_PoolIntArray_Int_Float_Float(valueTrackGetKeyIndicesMethodBind, this.rawMemory, idx, timeSec, delta)
    }


    private val methodTrackGetKeyIndicesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "method_track_get_key_indices") }
    open fun methodTrackGetKeyIndices(idx: Int, timeSec: Float, delta: Float): PoolIntArray {
        return _icall_PoolIntArray_Int_Float_Float(methodTrackGetKeyIndicesMethodBind, this.rawMemory, idx, timeSec, delta)
    }


    private val methodTrackGetNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "method_track_get_name") }
    open fun methodTrackGetName(idx: Int, keyIdx: Int): String {
        return _icall_String_Int_Int(methodTrackGetNameMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val methodTrackGetParamsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "method_track_get_params") }
    open fun methodTrackGetParams(idx: Int, keyIdx: Int): GDArray {
        return _icall_GDArray_Int_Int(methodTrackGetParamsMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_insert_key") }
    open fun bezierTrackInsertKey(track: Int, time: Float, value: Float, inHandle: Vector2 = Vector2(0, 0), outHandle: Vector2 = Vector2(0, 0)): Int {
        return _icall_Int_Int_Float_Float_Vector2_Vector2(bezierTrackInsertKeyMethodBind, this.rawMemory, track, time, value, inHandle, outHandle)
    }


    private val bezierTrackSetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_set_key_value") }
    open fun bezierTrackSetKeyValue(idx: Int, keyIdx: Int, value: Float) {
        _icall_Unit_Int_Int_Float(bezierTrackSetKeyValueMethodBind, this.rawMemory, idx, keyIdx, value)
    }


    private val bezierTrackSetKeyInHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_set_key_in_handle") }
    open fun bezierTrackSetKeyInHandle(idx: Int, keyIdx: Int, inHandle: Vector2) {
        _icall_Unit_Int_Int_Vector2(bezierTrackSetKeyInHandleMethodBind, this.rawMemory, idx, keyIdx, inHandle)
    }


    private val bezierTrackSetKeyOutHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_set_key_out_handle") }
    open fun bezierTrackSetKeyOutHandle(idx: Int, keyIdx: Int, outHandle: Vector2) {
        _icall_Unit_Int_Int_Vector2(bezierTrackSetKeyOutHandleMethodBind, this.rawMemory, idx, keyIdx, outHandle)
    }


    private val bezierTrackGetKeyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_get_key_value") }
    open fun bezierTrackGetKeyValue(idx: Int, keyIdx: Int): Float {
        return _icall_Float_Int_Int(bezierTrackGetKeyValueMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackGetKeyInHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_get_key_in_handle") }
    open fun bezierTrackGetKeyInHandle(idx: Int, keyIdx: Int): Vector2 {
        return _icall_Vector2_Int_Int(bezierTrackGetKeyInHandleMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackGetKeyOutHandleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_get_key_out_handle") }
    open fun bezierTrackGetKeyOutHandle(idx: Int, keyIdx: Int): Vector2 {
        return _icall_Vector2_Int_Int(bezierTrackGetKeyOutHandleMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val bezierTrackInterpolateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "bezier_track_interpolate") }
    open fun bezierTrackInterpolate(track: Int, time: Float): Float {
        return _icall_Float_Int_Float(bezierTrackInterpolateMethodBind, this.rawMemory, track, time)
    }


    private val audioTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_insert_key") }
    open fun audioTrackInsertKey(track: Int, time: Float, stream: Resource, startOffset: Float = 0f, endOffset: Float = 0f): Int {
        return _icall_Int_Int_Float_Object_Float_Float(audioTrackInsertKeyMethodBind, this.rawMemory, track, time, stream, startOffset, endOffset)
    }


    private val audioTrackSetKeyStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_set_key_stream") }
    open fun audioTrackSetKeyStream(idx: Int, keyIdx: Int, stream: Resource) {
        _icall_Unit_Int_Int_Object(audioTrackSetKeyStreamMethodBind, this.rawMemory, idx, keyIdx, stream)
    }


    private val audioTrackSetKeyStartOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_set_key_start_offset") }
    open fun audioTrackSetKeyStartOffset(idx: Int, keyIdx: Int, offset: Float) {
        _icall_Unit_Int_Int_Float(audioTrackSetKeyStartOffsetMethodBind, this.rawMemory, idx, keyIdx, offset)
    }


    private val audioTrackSetKeyEndOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_set_key_end_offset") }
    open fun audioTrackSetKeyEndOffset(idx: Int, keyIdx: Int, offset: Float) {
        _icall_Unit_Int_Int_Float(audioTrackSetKeyEndOffsetMethodBind, this.rawMemory, idx, keyIdx, offset)
    }


    private val audioTrackGetKeyStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_get_key_stream") }
    open fun audioTrackGetKeyStream(idx: Int, keyIdx: Int): Resource {
        return _icall_Resource_Int_Int(audioTrackGetKeyStreamMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val audioTrackGetKeyStartOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_get_key_start_offset") }
    open fun audioTrackGetKeyStartOffset(idx: Int, keyIdx: Int): Float {
        return _icall_Float_Int_Int(audioTrackGetKeyStartOffsetMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val audioTrackGetKeyEndOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "audio_track_get_key_end_offset") }
    open fun audioTrackGetKeyEndOffset(idx: Int, keyIdx: Int): Float {
        return _icall_Float_Int_Int(audioTrackGetKeyEndOffsetMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val animationTrackInsertKeyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "animation_track_insert_key") }
    open fun animationTrackInsertKey(track: Int, time: Float, animation: String): Int {
        return _icall_Int_Int_Float_String(animationTrackInsertKeyMethodBind, this.rawMemory, track, time, animation)
    }


    private val animationTrackSetKeyAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "animation_track_set_key_animation") }
    open fun animationTrackSetKeyAnimation(idx: Int, keyIdx: Int, animation: String) {
        _icall_Unit_Int_Int_String(animationTrackSetKeyAnimationMethodBind, this.rawMemory, idx, keyIdx, animation)
    }


    private val animationTrackGetKeyAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "animation_track_get_key_animation") }
    open fun animationTrackGetKeyAnimation(idx: Int, keyIdx: Int): String {
        return _icall_String_Int_Int(animationTrackGetKeyAnimationMethodBind, this.rawMemory, idx, keyIdx)
    }


    private val setLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "set_length") }
    open fun setLength(timeSec: Float) {
        _icall_Unit_Float(setLengthMethodBind, this.rawMemory, timeSec)
    }


    private val getLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "get_length") }
    open fun getLength(): Float {
        return _icall_Float(getLengthMethodBind, this.rawMemory)
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
    open fun setStep(sizeSec: Float) {
        _icall_Unit_Float(setStepMethodBind, this.rawMemory, sizeSec)
    }


    private val getStepMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "get_step") }
    open fun getStep(): Float {
        return _icall_Float(getStepMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val copyTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Animation", "copy_track") }
    open fun copyTrack(track: Int, toAnimation: Animation) {
        _icall_Unit_Int_Object(copyTrackMethodBind, this.rawMemory, track, toAnimation)
    }


}
