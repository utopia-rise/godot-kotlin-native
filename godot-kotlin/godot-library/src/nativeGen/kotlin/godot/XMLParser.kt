// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.XMLParser
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_PoolByteArray
import godot.icalls._icall_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class XMLParser internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("XMLParser", "XMLParser")
        }

  }

  open fun getAttributeCount(): Long {
    val mb = getMethodBind("XMLParser","get_attribute_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAttributeName(idx: Long): String {
    val mb = getMethodBind("XMLParser","get_attribute_name")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getAttributeValue(idx: Long): String {
    val mb = getMethodBind("XMLParser","get_attribute_value")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getCurrentLine(): Long {
    val mb = getMethodBind("XMLParser","get_current_line")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNamedAttributeValue(name: String): String {
    val mb = getMethodBind("XMLParser","get_named_attribute_value")
    return _icall_String_String( mb, this.ptr, name)
  }

  open fun getNamedAttributeValueSafe(name: String): String {
    val mb = getMethodBind("XMLParser","get_named_attribute_value_safe")
    return _icall_String_String( mb, this.ptr, name)
  }

  open fun getNodeData(): String {
    val mb = getMethodBind("XMLParser","get_node_data")
    return _icall_String( mb, this.ptr)
  }

  open fun getNodeName(): String {
    val mb = getMethodBind("XMLParser","get_node_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getNodeOffset(): Long {
    val mb = getMethodBind("XMLParser","get_node_offset")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNodeType(): XMLParser.NodeType {
    val mb = getMethodBind("XMLParser","get_node_type")
    return XMLParser.NodeType.from( _icall_Long( mb, this.ptr))
  }

  open fun hasAttribute(name: String): Boolean {
    val mb = getMethodBind("XMLParser","has_attribute")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun isEmpty(): Boolean {
    val mb = getMethodBind("XMLParser","is_empty")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun open(file: String): GodotError {
    val mb = getMethodBind("XMLParser","open")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, file).toUInt())
  }

  open fun openBuffer(buffer: PoolByteArray): GodotError {
    val mb = getMethodBind("XMLParser","open_buffer")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, buffer).toUInt())
  }

  open fun read(): GodotError {
    val mb = getMethodBind("XMLParser","read")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun seek(position: Long): GodotError {
    val mb = getMethodBind("XMLParser","seek")
    return GodotError.byValue( _icall_Long_Long( mb, this.ptr, position).toUInt())
  }

  open fun skipSection() {
    val mb = getMethodBind("XMLParser","skip_section")
    _icall_Unit( mb, this.ptr)
  }

  enum class NodeType(
    id: Long
  ) {
    NODE_NONE(0),

    NODE_ELEMENT(1),

    NODE_ELEMENT_END(2),

    NODE_TEXT(3),

    NODE_COMMENT(4),

    NODE_CDATA(5),

    NODE_UNKNOWN(6);

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
