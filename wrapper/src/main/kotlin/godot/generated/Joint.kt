@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Joint : Spatial {
    private constructor() : super("")
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
        infix fun from(other: Spatial): Joint = Joint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Joint = Joint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Joint = Joint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Joint = fromVariant(Joint(""), other)


        // Constants


    }


    // Properties
    open var nodes_nodeA: NodePath
        get() = _icall_NodePath(getNodeAMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setNodeAMethodBind, this.rawMemory, value)


    open var nodes_nodeB: NodePath
        get() = _icall_NodePath(getNodeBMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setNodeBMethodBind, this.rawMemory, value)


    open var solver_priority: Int
        get() = _icall_Int(getSolverPriorityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSolverPriorityMethodBind, this.rawMemory, value)


    open var collision_excludeNodes: Boolean
        get() = _icall_Boolean(getExcludeNodesFromCollisionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExcludeNodesFromCollisionMethodBind, this.rawMemory, value)




    // Methods
    private val setNodeAMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "set_node_a") }
    open fun setNodeA(node: NodePath) {
        _icall_Unit_NodePath(setNodeAMethodBind, this.rawMemory, node)
    }


    private val getNodeAMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "get_node_a") }
    open fun getNodeA(): NodePath {
        return _icall_NodePath(getNodeAMethodBind, this.rawMemory)
    }


    private val setNodeBMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "set_node_b") }
    open fun setNodeB(node: NodePath) {
        _icall_Unit_NodePath(setNodeBMethodBind, this.rawMemory, node)
    }


    private val getNodeBMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "get_node_b") }
    open fun getNodeB(): NodePath {
        return _icall_NodePath(getNodeBMethodBind, this.rawMemory)
    }


    private val setSolverPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "set_solver_priority") }
    open fun setSolverPriority(priority: Int) {
        _icall_Unit_Int(setSolverPriorityMethodBind, this.rawMemory, priority)
    }


    private val getSolverPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "get_solver_priority") }
    open fun getSolverPriority(): Int {
        return _icall_Int(getSolverPriorityMethodBind, this.rawMemory)
    }


    private val setExcludeNodesFromCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "set_exclude_nodes_from_collision") }
    open fun setExcludeNodesFromCollision(enable: Boolean) {
        _icall_Unit_Boolean(setExcludeNodesFromCollisionMethodBind, this.rawMemory, enable)
    }


    private val getExcludeNodesFromCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint", "get_exclude_nodes_from_collision") }
    open fun getExcludeNodesFromCollision(): Boolean {
        return _icall_Boolean(getExcludeNodesFromCollisionMethodBind, this.rawMemory)
    }


}
