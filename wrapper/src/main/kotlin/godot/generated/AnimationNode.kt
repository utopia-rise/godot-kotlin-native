@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNode : Resource {
    constructor() : super("AnimationNode")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class FilterAction(val id: Int) {
        FILTER_IGNORE(0),
        FILTER_PASS(1),
        FILTER_STOP(2),
        FILTER_BLEND(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val REMOVED_FROM_GRAPH: String = "removed_from_graph"
        }
    }


    companion object {
        infix fun from(other: Resource): AnimationNode = AnimationNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNode = AnimationNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNode = AnimationNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNode = fromVariant(AnimationNode(""), other)


        // Constants
        const val FILTER_IGNORE: Int = 0
        const val FILTER_PASS: Int = 1
        const val FILTER_STOP: Int = 2
        const val FILTER_BLEND: Int = 3


    }


    // Properties
    open var filterEnabled: Boolean
        get() = _icall_Boolean(isFilterEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFilterEnabledMethodBind, this.rawMemory, value)




    // Methods
    open fun process(time: Float, seek: Boolean) {
    }


    open fun get_caption(): String {
        throw NotImplementedError("get_caption is not implemented for AnimationNode")
    }


    open fun has_filter(): String {
        throw NotImplementedError("has_filter is not implemented for AnimationNode")
    }


    open fun _parent_set(parent: Object) {
    }


    private val getInputCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_input_count") }
    open fun getInputCount(): Int {
        return _icall_Int(getInputCountMethodBind, this.rawMemory)
    }


    private val getInputNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_input_name") }
    open fun getInputName(input: Int): String {
        return _icall_String_Int(getInputNameMethodBind, this.rawMemory, input)
    }


    private val getInputConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_input_connection") }
    open fun getInputConnection(input: Int): String {
        return _icall_String_Int(getInputConnectionMethodBind, this.rawMemory, input)
    }


    private val getInputActivityMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_input_activity") }
    open fun getInputActivity(input: Int): Float {
        return _icall_Float_Int(getInputActivityMethodBind, this.rawMemory, input)
    }


    private val addInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "add_input") }
    open fun addInput(name: String) {
        _icall_Unit_String(addInputMethodBind, this.rawMemory, name)
    }


    private val removeInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "remove_input") }
    open fun removeInput(index: Int) {
        _icall_Unit_Int(removeInputMethodBind, this.rawMemory, index)
    }


    private val setFilterPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "set_filter_path") }
    open fun setFilterPath(path: NodePath, enable: Boolean) {
        _icall_Unit_NodePath_Boolean(setFilterPathMethodBind, this.rawMemory, path, enable)
    }


    private val isPathFilteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "is_path_filtered") }
    open fun isPathFiltered(path: NodePath): Boolean {
        return _icall_Boolean_NodePath(isPathFilteredMethodBind, this.rawMemory, path)
    }


    private val setFilterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "set_filter_enabled") }
    open fun setFilterEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setFilterEnabledMethodBind, this.rawMemory, enable)
    }


    private val isFilterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "is_filter_enabled") }
    open fun isFilterEnabled(): Boolean {
        return _icall_Boolean(isFilterEnabledMethodBind, this.rawMemory)
    }


    private val setPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "set_position") }
    open fun setPosition(position: Vector2) {
        _icall_Unit_Vector2(setPositionMethodBind, this.rawMemory, position)
    }


    private val getPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_position") }
    open fun getPosition(): Vector2 {
        return _icall_Vector2(getPositionMethodBind, this.rawMemory)
    }


    open fun _set_filters(filters: GDArray) {
    }


    open fun _get_filters(): GDArray {
        throw NotImplementedError("_get_filters is not implemented for AnimationNode")
    }


    private val blendAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "blend_animation") }
    open fun blendAnimation(animation: String, time: Float, delta: Float, seeked: Boolean, blend: Float) {
        _icall_Unit_String_Float_Float_Boolean_Float(blendAnimationMethodBind, this.rawMemory, animation, time, delta, seeked, blend)
    }


    private val blendNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "blend_node") }
    open fun blendNode(node: AnimationNode, time: Float, seek: Boolean, blend: Float, filter: Int = 0, optimize: Boolean = true): Float {
        return _icall_Float_Object_Float_Boolean_Float_Int_Boolean(blendNodeMethodBind, this.rawMemory, node, time, seek, blend, filter, optimize)
    }


    private val blendInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "blend_input") }
    open fun blendInput(inputIndex: Int, time: Float, seek: Boolean, blend: Float, filter: Int = 0, optimize: Boolean = true): Float {
        return _icall_Float_Int_Float_Boolean_Float_Int_Boolean(blendInputMethodBind, this.rawMemory, inputIndex, time, seek, blend, filter, optimize)
    }


    private val setParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "set_parent") }
    open fun setParent(parent: Object) {
        _icall_Unit_Object(setParentMethodBind, this.rawMemory, parent)
    }


    private val getParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_parent") }
    open fun getParent(): AnimationNode {
        return _icall_AnimationNode(getParentMethodBind, this.rawMemory)
    }


    private val getTreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNode", "get_tree") }
    open fun getTree(): AnimationTree {
        return _icall_AnimationTree(getTreeMethodBind, this.rawMemory)
    }


}
