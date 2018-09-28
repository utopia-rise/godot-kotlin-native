@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeStateMachine : AnimationRootNode {
    constructor() : super("AnimationNodeStateMachine")
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
        infix fun from(other: AnimationRootNode): AnimationNodeStateMachine = AnimationNodeStateMachine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AnimationNode): AnimationNodeStateMachine = AnimationNodeStateMachine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeStateMachine = AnimationNodeStateMachine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeStateMachine = AnimationNodeStateMachine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeStateMachine = AnimationNodeStateMachine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeStateMachine = fromVariant(AnimationNodeStateMachine(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val addNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "add_node") }
    open fun addNode(name: String, node: AnimationNode) {
        _icall_Unit_String_Object(addNodeMethodBind, this.rawMemory, name, node)
    }


    private val getNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_node") }
    open fun getNode(name: String): AnimationNode {
        return _icall_AnimationNode_String(getNodeMethodBind, this.rawMemory, name)
    }


    private val removeNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "remove_node") }
    open fun removeNode(name: String) {
        _icall_Unit_String(removeNodeMethodBind, this.rawMemory, name)
    }


    private val renameNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "rename_node") }
    open fun renameNode(name: String, newName: String) {
        _icall_Unit_String_String(renameNodeMethodBind, this.rawMemory, name, newName)
    }


    private val hasNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "has_node") }
    open fun hasNode(name: String): Boolean {
        return _icall_Boolean_String(hasNodeMethodBind, this.rawMemory, name)
    }


    private val getNodeNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_node_name") }
    open fun getNodeName(node: AnimationNode): String {
        return _icall_String_Object(getNodeNameMethodBind, this.rawMemory, node)
    }


    private val hasTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "has_transition") }
    open fun hasTransition(from: String, to: String, arg2: AnimationNodeStateMachineTransition) {
        _icall_Unit_String_String_Object(hasTransitionMethodBind, this.rawMemory, from, to, arg2)
    }


    private val addTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "add_transition") }
    open fun addTransition(from: String, to: String, transition: AnimationNodeStateMachineTransition) {
        _icall_Unit_String_String_Object(addTransitionMethodBind, this.rawMemory, from, to, transition)
    }


    private val getTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_transition") }
    open fun getTransition(idx: Int): AnimationNodeStateMachineTransition {
        return _icall_AnimationNodeStateMachineTransition_Int(getTransitionMethodBind, this.rawMemory, idx)
    }


    private val getTransitionFromMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_transition_from") }
    open fun getTransitionFrom(idx: Int): String {
        return _icall_String_Int(getTransitionFromMethodBind, this.rawMemory, idx)
    }


    private val getTransitionToMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_transition_to") }
    open fun getTransitionTo(idx: Int): String {
        return _icall_String_Int(getTransitionToMethodBind, this.rawMemory, idx)
    }


    private val getTransitionCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_transition_count") }
    open fun getTransitionCount(): Int {
        return _icall_Int(getTransitionCountMethodBind, this.rawMemory)
    }


    private val removeTransitionByIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "remove_transition_by_index") }
    open fun removeTransitionByIndex(idx: Int) {
        _icall_Unit_Int(removeTransitionByIndexMethodBind, this.rawMemory, idx)
    }


    private val removeTransitionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "remove_transition") }
    open fun removeTransition(from: String, to: String) {
        _icall_Unit_String_String(removeTransitionMethodBind, this.rawMemory, from, to)
    }


    private val setStartNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "set_start_node") }
    open fun setStartNode(name: String) {
        _icall_Unit_String(setStartNodeMethodBind, this.rawMemory, name)
    }


    private val getStartNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_start_node") }
    open fun getStartNode(): String {
        return _icall_String(getStartNodeMethodBind, this.rawMemory)
    }


    private val setEndNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "set_end_node") }
    open fun setEndNode(name: String) {
        _icall_Unit_String(setEndNodeMethodBind, this.rawMemory, name)
    }


    private val getEndNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_end_node") }
    open fun getEndNode(): String {
        return _icall_String(getEndNodeMethodBind, this.rawMemory)
    }


    private val setGraphOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "set_graph_offset") }
    open fun setGraphOffset(name: Vector2) {
        _icall_Unit_Vector2(setGraphOffsetMethodBind, this.rawMemory, name)
    }


    private val getGraphOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_graph_offset") }
    open fun getGraphOffset(): Vector2 {
        return _icall_Vector2(getGraphOffsetMethodBind, this.rawMemory)
    }


    private val travelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "travel") }
    open fun travel(toNode: String): Boolean {
        return _icall_Boolean_String(travelMethodBind, this.rawMemory, toNode)
    }


    private val startMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "start") }
    open fun start(node: String) {
        _icall_Unit_String(startMethodBind, this.rawMemory, node)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val getCurrentNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_current_node") }
    open fun getCurrentNode(): String {
        return _icall_String(getCurrentNodeMethodBind, this.rawMemory)
    }


    private val getTravelPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeStateMachine", "get_travel_path") }
    open fun getTravelPath(): PoolStringArray {
        return _icall_PoolStringArray(getTravelPathMethodBind, this.rawMemory)
    }


}
