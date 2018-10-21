@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Joint2D : Node2D {
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
        infix fun from(other: Node2D): Joint2D = Joint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Joint2D = Joint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Joint2D = Joint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Joint2D = Joint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Joint2D = fromVariant(Joint2D(""), other)


        // Constants


    }


    // Properties
    open var nodeA: NodePath
        get() = _icall_NodePath(getNodeAMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setNodeAMethodBind, this.rawMemory, value)


    open var nodeB: NodePath
        get() = _icall_NodePath(getNodeBMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setNodeBMethodBind, this.rawMemory, value)


    open var bias: Double
        get() = _icall_Double(getBiasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBiasMethodBind, this.rawMemory, value)


    open var disableCollision: Boolean
        get() = _icall_Boolean(getExcludeNodesFromCollisionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExcludeNodesFromCollisionMethodBind, this.rawMemory, value)




    // Methods
    private val setNodeAMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "set_node_a") }
    open fun setNodeA(node: NodePath) {
        _icall_Unit_NodePath(setNodeAMethodBind, this.rawMemory, node)
    }


    private val getNodeAMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "get_node_a") }
    open fun getNodeA(): NodePath {
        return _icall_NodePath(getNodeAMethodBind, this.rawMemory)
    }


    private val setNodeBMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "set_node_b") }
    open fun setNodeB(node: NodePath) {
        _icall_Unit_NodePath(setNodeBMethodBind, this.rawMemory, node)
    }


    private val getNodeBMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "get_node_b") }
    open fun getNodeB(): NodePath {
        return _icall_NodePath(getNodeBMethodBind, this.rawMemory)
    }


    private val setBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "set_bias") }
    open fun setBias(bias: Double) {
        _icall_Unit_Double(setBiasMethodBind, this.rawMemory, bias)
    }


    private val getBiasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "get_bias") }
    open fun getBias(): Double {
        return _icall_Double(getBiasMethodBind, this.rawMemory)
    }


    private val setExcludeNodesFromCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "set_exclude_nodes_from_collision") }
    open fun setExcludeNodesFromCollision(enable: Boolean) {
        _icall_Unit_Boolean(setExcludeNodesFromCollisionMethodBind, this.rawMemory, enable)
    }


    private val getExcludeNodesFromCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Joint2D", "get_exclude_nodes_from_collision") }
    open fun getExcludeNodesFromCollision(): Boolean {
        return _icall_Boolean(getExcludeNodesFromCollisionMethodBind, this.rawMemory)
    }


}
