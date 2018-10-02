@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationTree : Node {
    constructor() : super("AnimationTree")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AnimationProcessMode(val id: Long) {
        ANIMATION_PROCESS_PHYSICS(0),
        ANIMATION_PROCESS_IDLE(1),
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
        infix fun from(other: Node): AnimationTree = AnimationTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationTree = AnimationTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationTree = fromVariant(AnimationTree(""), other)


        // Constants
        const val ANIMATION_PROCESS_PHYSICS: Long = 0
        const val ANIMATION_PROCESS_IDLE: Long = 1


    }


    // Properties
    open var treeRoot: AnimationRootNode
        get() = _icall_AnimationRootNode(getTreeRootMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTreeRootMethodBind, this.rawMemory, value)


    open var animPlayer: NodePath
        get() = _icall_NodePath(getAnimationPlayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setAnimationPlayerMethodBind, this.rawMemory, value)


    open var active: Boolean
        get() = _icall_Boolean(isActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, value)


    open var processMode: Long
        get() = _icall_Long(getProcessModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setProcessModeMethodBind, this.rawMemory, value)


    open var rootMotionTrack: NodePath
        get() = _icall_NodePath(getRootMotionTrackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setRootMotionTrackMethodBind, this.rawMemory, value)




    // Methods
    private val setActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "set_active") }
    open fun setActive(active: Boolean) {
        _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, active)
    }


    private val isActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "is_active") }
    open fun isActive(): Boolean {
        return _icall_Boolean(isActiveMethodBind, this.rawMemory)
    }


    private val setTreeRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "set_tree_root") }
    open fun setTreeRoot(root: AnimationNode) {
        _icall_Unit_Object(setTreeRootMethodBind, this.rawMemory, root)
    }


    private val getTreeRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "get_tree_root") }
    open fun getTreeRoot(): AnimationNode {
        return _icall_AnimationNode(getTreeRootMethodBind, this.rawMemory)
    }


    private val setProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "set_process_mode") }
    open fun setProcessMode(mode: Long) {
        _icall_Unit_Long(setProcessModeMethodBind, this.rawMemory, mode)
    }


    private val getProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "get_process_mode") }
    open fun getProcessMode(): AnimationTree.AnimationProcessMode {
        return AnimationTree.AnimationProcessMode.fromInt(_icall_Long(getProcessModeMethodBind, this.rawMemory))
    }


    private val setAnimationPlayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "set_animation_player") }
    open fun setAnimationPlayer(root: NodePath) {
        _icall_Unit_NodePath(setAnimationPlayerMethodBind, this.rawMemory, root)
    }


    private val getAnimationPlayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "get_animation_player") }
    open fun getAnimationPlayer(): NodePath {
        return _icall_NodePath(getAnimationPlayerMethodBind, this.rawMemory)
    }


    private val setRootMotionTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "set_root_motion_track") }
    open fun setRootMotionTrack(path: NodePath) {
        _icall_Unit_NodePath(setRootMotionTrackMethodBind, this.rawMemory, path)
    }


    private val getRootMotionTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "get_root_motion_track") }
    open fun getRootMotionTrack(): NodePath {
        return _icall_NodePath(getRootMotionTrackMethodBind, this.rawMemory)
    }


    private val getRootMotionTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTree", "get_root_motion_transform") }
    open fun getRootMotionTransform(): Transform {
        return _icall_Transform(getRootMotionTransformMethodBind, this.rawMemory)
    }


    open fun _node_removed(arg0: Object) {
    }


}
