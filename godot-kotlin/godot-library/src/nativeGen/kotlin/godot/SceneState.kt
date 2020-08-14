// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_NodePath_Long
import godot.icalls._icall_NodePath_Long_Boolean
import godot.icalls._icall_PackedScene_Long
import godot.icalls._icall_PoolStringArray_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_String_Long_Long
import godot.icalls._icall_VariantArray_Long
import godot.icalls._icall_Variant_Long_Long
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class SceneState internal constructor() : Reference() {
  open fun getConnectionBinds(idx: Long): VariantArray {
    val mb = getMethodBind("SceneState","get_connection_binds")
    return _icall_VariantArray_Long( mb, this.ptr, idx)
  }

  open fun getConnectionCount(): Long {
    val mb = getMethodBind("SceneState","get_connection_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getConnectionFlags(idx: Long): Long {
    val mb = getMethodBind("SceneState","get_connection_flags")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getConnectionMethod(idx: Long): String {
    val mb = getMethodBind("SceneState","get_connection_method")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getConnectionSignal(idx: Long): String {
    val mb = getMethodBind("SceneState","get_connection_signal")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getConnectionSource(idx: Long): NodePath {
    val mb = getMethodBind("SceneState","get_connection_source")
    return _icall_NodePath_Long( mb, this.ptr, idx)
  }

  open fun getConnectionTarget(idx: Long): NodePath {
    val mb = getMethodBind("SceneState","get_connection_target")
    return _icall_NodePath_Long( mb, this.ptr, idx)
  }

  open fun getNodeCount(): Long {
    val mb = getMethodBind("SceneState","get_node_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNodeGroups(idx: Long): PoolStringArray {
    val mb = getMethodBind("SceneState","get_node_groups")
    return _icall_PoolStringArray_Long( mb, this.ptr, idx)
  }

  open fun getNodeIndex(idx: Long): Long {
    val mb = getMethodBind("SceneState","get_node_index")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getNodeInstance(idx: Long): PackedScene {
    val mb = getMethodBind("SceneState","get_node_instance")
    return _icall_PackedScene_Long( mb, this.ptr, idx)
  }

  open fun getNodeInstancePlaceholder(idx: Long): String {
    val mb = getMethodBind("SceneState","get_node_instance_placeholder")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getNodeName(idx: Long): String {
    val mb = getMethodBind("SceneState","get_node_name")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getNodeOwnerPath(idx: Long): NodePath {
    val mb = getMethodBind("SceneState","get_node_owner_path")
    return _icall_NodePath_Long( mb, this.ptr, idx)
  }

  open fun getNodePath(idx: Long, forParent: Boolean = false): NodePath {
    val mb = getMethodBind("SceneState","get_node_path")
    return _icall_NodePath_Long_Boolean( mb, this.ptr, idx, forParent)
  }

  open fun getNodePropertyCount(idx: Long): Long {
    val mb = getMethodBind("SceneState","get_node_property_count")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getNodePropertyName(idx: Long, propIdx: Long): String {
    val mb = getMethodBind("SceneState","get_node_property_name")
    return _icall_String_Long_Long( mb, this.ptr, idx, propIdx)
  }

  open fun getNodePropertyValue(idx: Long, propIdx: Long): Variant {
    val mb = getMethodBind("SceneState","get_node_property_value")
    return _icall_Variant_Long_Long( mb, this.ptr, idx, propIdx)
  }

  open fun getNodeType(idx: Long): String {
    val mb = getMethodBind("SceneState","get_node_type")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun isNodeInstancePlaceholder(idx: Long): Boolean {
    val mb = getMethodBind("SceneState","is_node_instance_placeholder")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  enum class GenEditState(
    id: Long
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
