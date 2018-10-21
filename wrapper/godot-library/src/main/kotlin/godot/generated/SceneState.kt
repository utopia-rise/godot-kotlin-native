@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SceneState : Reference {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class GenEditState(val id: Long) {
        GEN_EDIT_STATE_DISABLED(0),
        GEN_EDIT_STATE_INSTANCE(1),
        GEN_EDIT_STATE_MAIN(2),
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
        infix fun from(other: Reference): SceneState = SceneState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SceneState = SceneState("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SceneState = fromVariant(SceneState(""), other)


        // Constants
        const val GEN_EDIT_STATE_DISABLED: Long = 0
        const val GEN_EDIT_STATE_INSTANCE: Long = 1
        const val GEN_EDIT_STATE_MAIN: Long = 2


    }


    // Properties


    // Methods
    private val getNodeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_count") }
    open fun getNodeCount(): Long {
        return _icall_Long(getNodeCountMethodBind, this.rawMemory)
    }


    private val getNodeTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_type") }
    open fun getNodeType(idx: Long): String {
        return _icall_String_Long(getNodeTypeMethodBind, this.rawMemory, idx)
    }


    private val getNodeNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_name") }
    open fun getNodeName(idx: Long): String {
        return _icall_String_Long(getNodeNameMethodBind, this.rawMemory, idx)
    }


    private val getNodePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_path") }
    open fun getNodePath(idx: Long, forParent: Boolean = false): NodePath {
        return _icall_NodePath_Long_Boolean(getNodePathMethodBind, this.rawMemory, idx, forParent)
    }


    private val getNodeOwnerPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_owner_path") }
    open fun getNodeOwnerPath(idx: Long): NodePath {
        return _icall_NodePath_Long(getNodeOwnerPathMethodBind, this.rawMemory, idx)
    }


    private val isNodeInstancePlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "is_node_instance_placeholder") }
    open fun isNodeInstancePlaceholder(idx: Long): Boolean {
        return _icall_Boolean_Long(isNodeInstancePlaceholderMethodBind, this.rawMemory, idx)
    }


    private val getNodeInstancePlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_instance_placeholder") }
    open fun getNodeInstancePlaceholder(idx: Long): String {
        return _icall_String_Long(getNodeInstancePlaceholderMethodBind, this.rawMemory, idx)
    }


    private val getNodeInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_instance") }
    open fun getNodeInstance(idx: Long): PackedScene {
        return _icall_PackedScene_Long(getNodeInstanceMethodBind, this.rawMemory, idx)
    }


    private val getNodeGroupsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_groups") }
    open fun getNodeGroups(idx: Long): PoolStringArray {
        return _icall_PoolStringArray_Long(getNodeGroupsMethodBind, this.rawMemory, idx)
    }


    private val getNodeIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_index") }
    open fun getNodeIndex(idx: Long): Long {
        return _icall_Long_Long(getNodeIndexMethodBind, this.rawMemory, idx)
    }


    private val getNodePropertyCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_property_count") }
    open fun getNodePropertyCount(idx: Long): Long {
        return _icall_Long_Long(getNodePropertyCountMethodBind, this.rawMemory, idx)
    }


    private val getNodePropertyNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_property_name") }
    open fun getNodePropertyName(idx: Long, propIdx: Long): String {
        return _icall_String_Long_Long(getNodePropertyNameMethodBind, this.rawMemory, idx, propIdx)
    }


    private val getNodePropertyValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_node_property_value") }
    open fun getNodePropertyValue(idx: Long, propIdx: Long): Variant {
        return _icall_Variant_Long_Long(getNodePropertyValueMethodBind, this.rawMemory, idx, propIdx)
    }


    private val getConnectionCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_count") }
    open fun getConnectionCount(): Long {
        return _icall_Long(getConnectionCountMethodBind, this.rawMemory)
    }


    private val getConnectionSourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_source") }
    open fun getConnectionSource(idx: Long): NodePath {
        return _icall_NodePath_Long(getConnectionSourceMethodBind, this.rawMemory, idx)
    }


    private val getConnectionSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_signal") }
    open fun getConnectionSignal(idx: Long): String {
        return _icall_String_Long(getConnectionSignalMethodBind, this.rawMemory, idx)
    }


    private val getConnectionTargetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_target") }
    open fun getConnectionTarget(idx: Long): NodePath {
        return _icall_NodePath_Long(getConnectionTargetMethodBind, this.rawMemory, idx)
    }


    private val getConnectionMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_method") }
    open fun getConnectionMethod(idx: Long): String {
        return _icall_String_Long(getConnectionMethodMethodBind, this.rawMemory, idx)
    }


    private val getConnectionFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_flags") }
    open fun getConnectionFlags(idx: Long): Long {
        return _icall_Long_Long(getConnectionFlagsMethodBind, this.rawMemory, idx)
    }


    private val getConnectionBindsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneState", "get_connection_binds") }
    open fun getConnectionBinds(idx: Long): GDArray {
        return _icall_GDArray_Long(getConnectionBindsMethodBind, this.rawMemory, idx)
    }


}
