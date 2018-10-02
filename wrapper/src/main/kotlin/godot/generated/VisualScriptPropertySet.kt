@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptPropertySet : VisualScriptNode {
    constructor() : super("VisualScriptPropertySet")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AssignOp(val id: Int) {
        ASSIGN_OP_NONE(0),
        ASSIGN_OP_ADD(1),
        ASSIGN_OP_SUB(2),
        ASSIGN_OP_MUL(3),
        ASSIGN_OP_DIV(4),
        ASSIGN_OP_MOD(5),
        ASSIGN_OP_SHIFT_LEFT(6),
        ASSIGN_OP_SHIFT_RIGHT(7),
        ASSIGN_OP_BIT_AND(8),
        ASSIGN_OP_BIT_OR(9),
        ASSIGN_OP_BIT_XOR(10),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class CallMode(val id: Int) {
        CALL_MODE_SELF(0),
        CALL_MODE_NODE_PATH(1),
        CALL_MODE_INSTANCE(2),
        CALL_MODE_BASIC_TYPE(3),
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
        infix fun from(other: VisualScriptNode): VisualScriptPropertySet = VisualScriptPropertySet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptPropertySet = VisualScriptPropertySet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptPropertySet = VisualScriptPropertySet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptPropertySet = VisualScriptPropertySet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptPropertySet = fromVariant(VisualScriptPropertySet(""), other)


        // Constants
        const val CALL_MODE_SELF: Int = 0
        const val CALL_MODE_NODE_PATH: Int = 1
        const val CALL_MODE_INSTANCE: Int = 2
        const val CALL_MODE_BASIC_TYPE: Int = 3
        const val ASSIGN_OP_NONE: Int = 0
        const val ASSIGN_OP_ADD: Int = 1
        const val ASSIGN_OP_SUB: Int = 2
        const val ASSIGN_OP_MUL: Int = 3
        const val ASSIGN_OP_DIV: Int = 4
        const val ASSIGN_OP_MOD: Int = 5
        const val ASSIGN_OP_SHIFT_LEFT: Int = 6
        const val ASSIGN_OP_SHIFT_RIGHT: Int = 7
        const val ASSIGN_OP_BIT_AND: Int = 8
        const val ASSIGN_OP_BIT_OR: Int = 9
        const val ASSIGN_OP_BIT_XOR: Int = 10


    }


    // Properties
    open var setMode: Int
        get() = _icall_Int(getCallModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCallModeMethodBind, this.rawMemory, value)


    open var baseType: String
        get() = _icall_String(getBaseTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, value)


    open var baseScript: String
        get() = _icall_String(getBaseScriptMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, value)


    open var basicType: Int
        get() = _icall_Int(getBasicTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBasicTypeMethodBind, this.rawMemory, value)


    open var nodePath: NodePath
        get() = _icall_NodePath(getBasePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, value)


    open var property: String
        get() = _icall_String(getPropertyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setPropertyMethodBind, this.rawMemory, value)


    open var index: String
        get() = _icall_String(getIndexMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setIndexMethodBind, this.rawMemory, value)


    open var assignOp: Int
        get() = _icall_Int(getAssignOpMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAssignOpMethodBind, this.rawMemory, value)




    // Methods
    private val setBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_base_type") }
    open fun setBaseType(baseType: String) {
        _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, baseType)
    }


    private val getBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_base_type") }
    open fun getBaseType(): String {
        return _icall_String(getBaseTypeMethodBind, this.rawMemory)
    }


    private val setBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_base_script") }
    open fun setBaseScript(baseScript: String) {
        _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, baseScript)
    }


    private val getBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_base_script") }
    open fun getBaseScript(): String {
        return _icall_String(getBaseScriptMethodBind, this.rawMemory)
    }


    private val setBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_basic_type") }
    open fun setBasicType(basicType: Int) {
        _icall_Unit_Int(setBasicTypeMethodBind, this.rawMemory, basicType)
    }


    private val getBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_basic_type") }
    open fun getBasicType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Int(getBasicTypeMethodBind, this.rawMemory))
    }


    open fun _set_type_cache(typeCache: Dictionary) {
    }


    open fun _get_type_cache(): Dictionary {
        throw NotImplementedError("_get_type_cache is not implemented for VisualScriptPropertySet")
    }


    private val setPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_property") }
    open fun setProperty(property: String) {
        _icall_Unit_String(setPropertyMethodBind, this.rawMemory, property)
    }


    private val getPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_property") }
    open fun getProperty(): String {
        return _icall_String(getPropertyMethodBind, this.rawMemory)
    }


    private val setCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_call_mode") }
    open fun setCallMode(mode: Int) {
        _icall_Unit_Int(setCallModeMethodBind, this.rawMemory, mode)
    }


    private val getCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_call_mode") }
    open fun getCallMode(): VisualScriptPropertySet.CallMode {
        return VisualScriptPropertySet.CallMode.fromInt(_icall_Int(getCallModeMethodBind, this.rawMemory))
    }


    private val setBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_base_path") }
    open fun setBasePath(basePath: NodePath) {
        _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, basePath)
    }


    private val getBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_base_path") }
    open fun getBasePath(): NodePath {
        return _icall_NodePath(getBasePathMethodBind, this.rawMemory)
    }


    private val setIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_index") }
    open fun setIndex(index: String) {
        _icall_Unit_String(setIndexMethodBind, this.rawMemory, index)
    }


    private val getIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_index") }
    open fun getIndex(): String {
        return _icall_String(getIndexMethodBind, this.rawMemory)
    }


    private val setAssignOpMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "set_assign_op") }
    open fun setAssignOp(assignOp: Int) {
        _icall_Unit_Int(setAssignOpMethodBind, this.rawMemory, assignOp)
    }


    private val getAssignOpMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertySet", "get_assign_op") }
    open fun getAssignOp(): VisualScriptPropertySet.AssignOp {
        return VisualScriptPropertySet.AssignOp.fromInt(_icall_Int(getAssignOpMethodBind, this.rawMemory))
    }


}
