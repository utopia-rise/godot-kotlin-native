@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SceneState : Reference {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class GenEditState(val id: Int) {
        GEN_EDIT_STATE_DISABLED(0),
        GEN_EDIT_STATE_INSTANCE(1),
        GEN_EDIT_STATE_MAIN(2),
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
        infix fun from(other: Reference): SceneState = SceneState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SceneState = SceneState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SceneState = fromVariant(SceneState(""), other)


        // Constants
        const val GEN_EDIT_STATE_DISABLED: Int = 0
        const val GEN_EDIT_STATE_INSTANCE: Int = 1
        const val GEN_EDIT_STATE_MAIN: Int = 2


    }


    // Properties


    // Methods
    private val getNodeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_count") }
    open fun getNodeCount(): Int {
        return _icall_Int(getNodeCountMethodBind, this.rawMemory)
    }


    private val getNodeTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_type") }
    open fun getNodeType(idx: Int): String {
        return _icall_String_Int(getNodeTypeMethodBind, this.rawMemory, idx)
    }


    private val getNodeNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_name") }
    open fun getNodeName(idx: Int): String {
        return _icall_String_Int(getNodeNameMethodBind, this.rawMemory, idx)
    }


    private val getNodePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_path") }
    open fun getNodePath(idx: Int, forParent: Boolean = false): NodePath {
        return _icall_NodePath_Int_Boolean(getNodePathMethodBind, this.rawMemory, idx, forParent)
    }


    private val getNodeOwnerPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_owner_path") }
    open fun getNodeOwnerPath(idx: Int): NodePath {
        return _icall_NodePath_Int(getNodeOwnerPathMethodBind, this.rawMemory, idx)
    }


    private val isNodeInstancePlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "is_node_instance_placeholder") }
    open fun isNodeInstancePlaceholder(idx: Int): Boolean {
        return _icall_Boolean_Int(isNodeInstancePlaceholderMethodBind, this.rawMemory, idx)
    }


    private val getNodeInstancePlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_instance_placeholder") }
    open fun getNodeInstancePlaceholder(idx: Int): String {
        return _icall_String_Int(getNodeInstancePlaceholderMethodBind, this.rawMemory, idx)
    }


    private val getNodeInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_instance") }
    open fun getNodeInstance(idx: Int): PackedScene {
        return _icall_PackedScene_Int(getNodeInstanceMethodBind, this.rawMemory, idx)
    }


    private val getNodeGroupsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_groups") }
    open fun getNodeGroups(idx: Int): PoolStringArray {
        return _icall_PoolStringArray_Int(getNodeGroupsMethodBind, this.rawMemory, idx)
    }


    private val getNodeIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_index") }
    open fun getNodeIndex(idx: Int): Int {
        return _icall_Int_Int(getNodeIndexMethodBind, this.rawMemory, idx)
    }


    private val getNodePropertyCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_property_count") }
    open fun getNodePropertyCount(idx: Int): Int {
        return _icall_Int_Int(getNodePropertyCountMethodBind, this.rawMemory, idx)
    }


    private val getNodePropertyNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_property_name") }
    open fun getNodePropertyName(idx: Int, propIdx: Int): String {
        return _icall_String_Int_Int(getNodePropertyNameMethodBind, this.rawMemory, idx, propIdx)
    }


    private val getNodePropertyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_property_value") }
    open fun getNodePropertyValue(idx: Int, propIdx: Int): Variant {
        return _icall_Variant_Int_Int(getNodePropertyValueMethodBind, this.rawMemory, idx, propIdx)
    }


    private val getConnectionCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_count") }
    open fun getConnectionCount(): Int {
        return _icall_Int(getConnectionCountMethodBind, this.rawMemory)
    }


    private val getConnectionSourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_source") }
    open fun getConnectionSource(idx: Int): NodePath {
        return _icall_NodePath_Int(getConnectionSourceMethodBind, this.rawMemory, idx)
    }


    private val getConnectionSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_signal") }
    open fun getConnectionSignal(idx: Int): String {
        return _icall_String_Int(getConnectionSignalMethodBind, this.rawMemory, idx)
    }


    private val getConnectionTargetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_target") }
    open fun getConnectionTarget(idx: Int): NodePath {
        return _icall_NodePath_Int(getConnectionTargetMethodBind, this.rawMemory, idx)
    }


    private val getConnectionMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_method") }
    open fun getConnectionMethod(idx: Int): String {
        return _icall_String_Int(getConnectionMethodMethodBind, this.rawMemory, idx)
    }


    private val getConnectionFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_flags") }
    open fun getConnectionFlags(idx: Int): Int {
        return _icall_Int_Int(getConnectionFlagsMethodBind, this.rawMemory, idx)
    }


    private val getConnectionBindsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_binds") }
    open fun getConnectionBinds(idx: Int): GDArray {
        return _icall_GDArray_Int(getConnectionBindsMethodBind, this.rawMemory, idx)
    }


}
