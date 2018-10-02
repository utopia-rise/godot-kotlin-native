@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptSceneNode : VisualScriptNode {
    constructor() : super("VisualScriptSceneNode")
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
        infix fun from(other: VisualScriptNode): VisualScriptSceneNode = VisualScriptSceneNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptSceneNode = VisualScriptSceneNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptSceneNode = VisualScriptSceneNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptSceneNode = VisualScriptSceneNode("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptSceneNode = fromVariant(VisualScriptSceneNode(""), other)


        // Constants


    }


    // Properties
    open var nodePath: NodePath
        get() = _icall_NodePath(getNodePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setNodePathMethodBind, this.rawMemory, value)




    // Methods
    private val setNodePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptSceneNode", "set_node_path") }
    open fun setNodePath(path: NodePath) {
        _icall_Unit_NodePath(setNodePathMethodBind, this.rawMemory, path)
    }


    private val getNodePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptSceneNode", "get_node_path") }
    open fun getNodePath(): NodePath {
        return _icall_NodePath(getNodePathMethodBind, this.rawMemory)
    }


}
