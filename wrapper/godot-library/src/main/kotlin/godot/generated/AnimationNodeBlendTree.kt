@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeBlendTree : AnimationRootNode {
    constructor() : super("AnimationNodeBlendTree")
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
        infix fun from(other: AnimationRootNode): AnimationNodeBlendTree = AnimationNodeBlendTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AnimationNode): AnimationNodeBlendTree = AnimationNodeBlendTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeBlendTree = AnimationNodeBlendTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeBlendTree = AnimationNodeBlendTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeBlendTree = AnimationNodeBlendTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeBlendTree = fromVariant(AnimationNodeBlendTree(""), other)


        // Constants
        const val CONNECTION_OK: Long = 0
        const val CONNECTION_ERROR_NO_INPUT: Long = 1
        const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2
        const val CONNECTION_ERROR_NO_OUTPUT: Long = 3
        const val CONNECTION_ERROR_SAME_NODE: Long = 4
        const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5


    }


    // Properties
    open var graphOffset: Vector2
        get() = _icall_Vector2(getGraphOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setGraphOffsetMethodBind, this.rawMemory, value)
    open fun graphOffset(shedule: (Vector2) -> Unit): Vector2 = graphOffset.apply {
        shedule(this)
        graphOffset = this
    }




    // Methods
    private val addNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "add_node") }
    open fun addNode(name: String, node: AnimationNode) {
        _icall_Unit_String_Object(addNodeMethodBind, this.rawMemory, name, node)
    }


    private val getNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "get_node") }
    open fun getNode(name: String): AnimationNode {
        return _icall_AnimationNode_String(getNodeMethodBind, this.rawMemory, name)
    }


    private val removeNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "remove_node") }
    open fun removeNode(name: String) {
        _icall_Unit_String(removeNodeMethodBind, this.rawMemory, name)
    }


    private val renameNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "rename_node") }
    open fun renameNode(name: String, newName: String) {
        _icall_Unit_String_String(renameNodeMethodBind, this.rawMemory, name, newName)
    }


    private val hasNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "has_node") }
    open fun hasNode(name: String): Boolean {
        return _icall_Boolean_String(hasNodeMethodBind, this.rawMemory, name)
    }


    private val connectNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "connect_node") }
    open fun connectNode(inputNode: String, inputIndex: Long, outputNode: String) {
        _icall_Unit_String_Long_String(connectNodeMethodBind, this.rawMemory, inputNode, inputIndex, outputNode)
    }


    private val disconnectNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "disconnect_node") }
    open fun disconnectNode(inputNode: String, inputIndex: Long) {
        _icall_Unit_String_Long(disconnectNodeMethodBind, this.rawMemory, inputNode, inputIndex)
    }


    private val setGraphOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "set_graph_offset") }
    open fun setGraphOffset(offset: Vector2) {
        _icall_Unit_Vector2(setGraphOffsetMethodBind, this.rawMemory, offset)
    }


    private val getGraphOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendTree", "get_graph_offset") }
    open fun getGraphOffset(): Vector2 {
        return _icall_Vector2(getGraphOffsetMethodBind, this.rawMemory)
    }


}
