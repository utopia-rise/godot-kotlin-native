@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorSelection : Object {
    constructor() : super("EditorSelection")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val SELECTION_CHANGED: String = "selection_changed"
        }
    }


    companion object {
        infix fun from(other: Object): EditorSelection = EditorSelection("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorSelection = fromVariant(EditorSelection(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _node_removed(arg0: Object) {
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSelection", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val addNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSelection", "add_node") }
    open fun addNode(node: Object) {
        _icall_Unit_Object(addNodeMethodBind, this.rawMemory, node)
    }


    private val removeNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSelection", "remove_node") }
    open fun removeNode(node: Object) {
        _icall_Unit_Object(removeNodeMethodBind, this.rawMemory, node)
    }


    private val getSelectedNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSelection", "get_selected_nodes") }
    open fun getSelectedNodes(): GDArray {
        return _icall_GDArray(getSelectedNodesMethodBind, this.rawMemory)
    }


    private val getTransformableSelectedNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorSelection", "get_transformable_selected_nodes") }
    open fun getTransformableSelectedNodes(): GDArray {
        return _icall_GDArray(getTransformableSelectedNodesMethodBind, this.rawMemory)
    }


    open fun _emit_change() {
    }


}
