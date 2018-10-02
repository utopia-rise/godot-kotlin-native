@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptPropertyGet : VisualScriptNode {
    constructor() : super("VisualScriptPropertyGet")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class CallMode(val id: Long) {
        CALL_MODE_SELF(0),
        CALL_MODE_NODE_PATH(1),
        CALL_MODE_INSTANCE(2),
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
        infix fun from(other: VisualScriptNode): VisualScriptPropertyGet = VisualScriptPropertyGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptPropertyGet = VisualScriptPropertyGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptPropertyGet = VisualScriptPropertyGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptPropertyGet = VisualScriptPropertyGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptPropertyGet = fromVariant(VisualScriptPropertyGet(""), other)


        // Constants
        const val CALL_MODE_SELF: Long = 0
        const val CALL_MODE_NODE_PATH: Long = 1
        const val CALL_MODE_INSTANCE: Long = 2


    }


    // Properties
    open var setMode: Long
        get() = _icall_Long(getCallModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCallModeMethodBind, this.rawMemory, value)


    open var baseType: String
        get() = _icall_String(getBaseTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, value)


    open var baseScript: String
        get() = _icall_String(getBaseScriptMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, value)


    open var basicType: Long
        get() = _icall_Long(getBasicTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBasicTypeMethodBind, this.rawMemory, value)


    open var nodePath: NodePath
        get() = _icall_NodePath(getBasePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, value)


    open var property: String
        get() = _icall_String(getPropertyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setPropertyMethodBind, this.rawMemory, value)


    open var index: String
        get() = _icall_String(getIndexMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setIndexMethodBind, this.rawMemory, value)




    // Methods
    private val setBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_base_type") }
    open fun setBaseType(baseType: String) {
        _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, baseType)
    }


    private val getBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_base_type") }
    open fun getBaseType(): String {
        return _icall_String(getBaseTypeMethodBind, this.rawMemory)
    }


    private val setBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_base_script") }
    open fun setBaseScript(baseScript: String) {
        _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, baseScript)
    }


    private val getBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_base_script") }
    open fun getBaseScript(): String {
        return _icall_String(getBaseScriptMethodBind, this.rawMemory)
    }


    private val setBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_basic_type") }
    open fun setBasicType(basicType: Long) {
        _icall_Unit_Long(setBasicTypeMethodBind, this.rawMemory, basicType)
    }


    private val getBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_basic_type") }
    open fun getBasicType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getBasicTypeMethodBind, this.rawMemory))
    }


    open fun _set_type_cache(typeCache: Long) {
    }


    open fun _get_type_cache(): Variant.Type {
        throw NotImplementedError("_get_type_cache is not implemented for VisualScriptPropertyGet")
    }


    private val setPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_property") }
    open fun setProperty(property: String) {
        _icall_Unit_String(setPropertyMethodBind, this.rawMemory, property)
    }


    private val getPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_property") }
    open fun getProperty(): String {
        return _icall_String(getPropertyMethodBind, this.rawMemory)
    }


    private val setCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_call_mode") }
    open fun setCallMode(mode: Long) {
        _icall_Unit_Long(setCallModeMethodBind, this.rawMemory, mode)
    }


    private val getCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_call_mode") }
    open fun getCallMode(): VisualScriptPropertyGet.CallMode {
        return VisualScriptPropertyGet.CallMode.fromInt(_icall_Long(getCallModeMethodBind, this.rawMemory))
    }


    private val setBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_base_path") }
    open fun setBasePath(basePath: NodePath) {
        _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, basePath)
    }


    private val getBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_base_path") }
    open fun getBasePath(): NodePath {
        return _icall_NodePath(getBasePathMethodBind, this.rawMemory)
    }


    private val setIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "set_index") }
    open fun setIndex(index: String) {
        _icall_Unit_String(setIndexMethodBind, this.rawMemory, index)
    }


    private val getIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptPropertyGet", "get_index") }
    open fun getIndex(): String {
        return _icall_String(getIndexMethodBind, this.rawMemory)
    }


}
