@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class XMLParser : Reference {
    constructor() : super("XMLParser")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class NodeType(val id: Long) {
        NODE_NONE(0),
        NODE_ELEMENT(1),
        NODE_ELEMENT_END(2),
        NODE_TEXT(3),
        NODE_COMMENT(4),
        NODE_CDATA(5),
        NODE_UNKNOWN(6),
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
        infix fun from(other: Reference): XMLParser = XMLParser("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): XMLParser = XMLParser("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): XMLParser = fromVariant(XMLParser(""), other)


        // Constants
        const val NODE_NONE: Long = 0
        const val NODE_ELEMENT: Long = 1
        const val NODE_ELEMENT_END: Long = 2
        const val NODE_TEXT: Long = 3
        const val NODE_COMMENT: Long = 4
        const val NODE_CDATA: Long = 5
        const val NODE_UNKNOWN: Long = 6


    }


    // Properties


    // Methods
    private val readMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "read") }
    open fun read(): GodotError {
        return GodotError.fromInt(_icall_Long(readMethodBind, this.rawMemory))
    }


    private val getNodeTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_node_type") }
    open fun getNodeType(): XMLParser.NodeType {
        return XMLParser.NodeType.fromInt(_icall_Long(getNodeTypeMethodBind, this.rawMemory))
    }


    private val getNodeNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_node_name") }
    open fun getNodeName(): String {
        return _icall_String(getNodeNameMethodBind, this.rawMemory)
    }


    private val getNodeDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_node_data") }
    open fun getNodeData(): String {
        return _icall_String(getNodeDataMethodBind, this.rawMemory)
    }


    private val getNodeOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_node_offset") }
    open fun getNodeOffset(): Long {
        return _icall_Long(getNodeOffsetMethodBind, this.rawMemory)
    }


    private val getAttributeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_attribute_count") }
    open fun getAttributeCount(): Long {
        return _icall_Long(getAttributeCountMethodBind, this.rawMemory)
    }


    private val getAttributeNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_attribute_name") }
    open fun getAttributeName(idx: Long): String {
        return _icall_String_Long(getAttributeNameMethodBind, this.rawMemory, idx)
    }


    private val getAttributeValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_attribute_value") }
    open fun getAttributeValue(idx: Long): String {
        return _icall_String_Long(getAttributeValueMethodBind, this.rawMemory, idx)
    }


    private val hasAttributeMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "has_attribute") }
    open fun hasAttribute(name: String): Boolean {
        return _icall_Boolean_String(hasAttributeMethodBind, this.rawMemory, name)
    }


    private val getNamedAttributeValueMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_named_attribute_value") }
    open fun getNamedAttributeValue(name: String): String {
        return _icall_String_String(getNamedAttributeValueMethodBind, this.rawMemory, name)
    }


    private val getNamedAttributeValueSafeMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_named_attribute_value_safe") }
    open fun getNamedAttributeValueSafe(name: String): String {
        return _icall_String_String(getNamedAttributeValueSafeMethodBind, this.rawMemory, name)
    }


    private val isEmptyMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "is_empty") }
    open fun isEmpty(): Boolean {
        return _icall_Boolean(isEmptyMethodBind, this.rawMemory)
    }


    private val getCurrentLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "get_current_line") }
    open fun getCurrentLine(): Long {
        return _icall_Long(getCurrentLineMethodBind, this.rawMemory)
    }


    private val skipSectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "skip_section") }
    open fun skipSection() {
        _icall_Unit(skipSectionMethodBind, this.rawMemory)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "seek") }
    open fun seek(position: Long): GodotError {
        return GodotError.fromInt(_icall_Long_Long(seekMethodBind, this.rawMemory, position))
    }


    private val openMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "open") }
    open fun open(file: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(openMethodBind, this.rawMemory, file))
    }


    private val openBufferMethodBind: CPointer<godot_method_bind> by lazy { getMB("XMLParser", "open_buffer") }
    open fun openBuffer(buffer: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Long_PoolByteArray(openBufferMethodBind, this.rawMemory, buffer))
    }


}
