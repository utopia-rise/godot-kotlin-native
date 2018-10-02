@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptFunctionCall : VisualScriptNode {
    constructor() : super("VisualScriptFunctionCall")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class RPCCallMode(val id: Long) {
        RPC_DISABLED(0),
        RPC_RELIABLE(1),
        RPC_UNRELIABLE(2),
        RPC_RELIABLE_TO_ID(3),
        RPC_UNRELIABLE_TO_ID(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CallMode(val id: Long) {
        CALL_MODE_SELF(0),
        CALL_MODE_NODE_PATH(1),
        CALL_MODE_INSTANCE(2),
        CALL_MODE_BASIC_TYPE(3),
        CALL_MODE_SINGLETON(4),
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
        infix fun from(other: VisualScriptNode): VisualScriptFunctionCall = VisualScriptFunctionCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptFunctionCall = VisualScriptFunctionCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptFunctionCall = VisualScriptFunctionCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptFunctionCall = VisualScriptFunctionCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptFunctionCall = fromVariant(VisualScriptFunctionCall(""), other)


        // Constants
        const val CALL_MODE_SELF: Long = 0
        const val CALL_MODE_NODE_PATH: Long = 1
        const val CALL_MODE_INSTANCE: Long = 2
        const val CALL_MODE_BASIC_TYPE: Long = 3
        const val CALL_MODE_SINGLETON: Long = 4
        const val RPC_DISABLED: Long = 0
        const val RPC_RELIABLE: Long = 1
        const val RPC_UNRELIABLE: Long = 2
        const val RPC_RELIABLE_TO_ID: Long = 3
        const val RPC_UNRELIABLE_TO_ID: Long = 4


    }


    // Properties
    open var callMode: Long
        get() = _icall_Long(getCallModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCallModeMethodBind, this.rawMemory, value)


    open var baseType: String
        get() = _icall_String(getBaseTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, value)


    open var baseScript: String
        get() = _icall_String(getBaseScriptMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, value)


    open var singleton: String
        get() = _icall_String(getSingletonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSingletonMethodBind, this.rawMemory, value)


    open var basicType: Long
        get() = _icall_Long(getBasicTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBasicTypeMethodBind, this.rawMemory, value)


    open var nodePath: NodePath
        get() = _icall_NodePath(getBasePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, value)


    open var function: String
        get() = _icall_String(getFunctionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setFunctionMethodBind, this.rawMemory, value)


    open var useDefaultArgs: Long
        get() = _icall_Long(getUseDefaultArgsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setUseDefaultArgsMethodBind, this.rawMemory, value)


    open var validate: Boolean
        get() = _icall_Boolean(getValidateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setValidateMethodBind, this.rawMemory, value)


    open var rpcCallMode: Long
        get() = _icall_Long(getRpcCallModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRpcCallModeMethodBind, this.rawMemory, value)




    // Methods
    private val setBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_base_type") }
    open fun setBaseType(baseType: String) {
        _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, baseType)
    }


    private val getBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_base_type") }
    open fun getBaseType(): String {
        return _icall_String(getBaseTypeMethodBind, this.rawMemory)
    }


    private val setBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_base_script") }
    open fun setBaseScript(baseScript: String) {
        _icall_Unit_String(setBaseScriptMethodBind, this.rawMemory, baseScript)
    }


    private val getBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_base_script") }
    open fun getBaseScript(): String {
        return _icall_String(getBaseScriptMethodBind, this.rawMemory)
    }


    private val setBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_basic_type") }
    open fun setBasicType(basicType: Long) {
        _icall_Unit_Long(setBasicTypeMethodBind, this.rawMemory, basicType)
    }


    private val getBasicTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_basic_type") }
    open fun getBasicType(): Variant.Type {
        return Variant.Type.fromInt(_icall_Long(getBasicTypeMethodBind, this.rawMemory))
    }


    private val setSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_singleton") }
    open fun setSingleton(singleton: String) {
        _icall_Unit_String(setSingletonMethodBind, this.rawMemory, singleton)
    }


    private val getSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_singleton") }
    open fun getSingleton(): String {
        return _icall_String(getSingletonMethodBind, this.rawMemory)
    }


    private val setFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_function") }
    open fun setFunction(function: String) {
        _icall_Unit_String(setFunctionMethodBind, this.rawMemory, function)
    }


    private val getFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_function") }
    open fun getFunction(): String {
        return _icall_String(getFunctionMethodBind, this.rawMemory)
    }


    private val setCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_call_mode") }
    open fun setCallMode(mode: Long) {
        _icall_Unit_Long(setCallModeMethodBind, this.rawMemory, mode)
    }


    private val getCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_call_mode") }
    open fun getCallMode(): VisualScriptFunctionCall.CallMode {
        return VisualScriptFunctionCall.CallMode.fromInt(_icall_Long(getCallModeMethodBind, this.rawMemory))
    }


    private val setBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_base_path") }
    open fun setBasePath(basePath: NodePath) {
        _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, basePath)
    }


    private val getBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_base_path") }
    open fun getBasePath(): NodePath {
        return _icall_NodePath(getBasePathMethodBind, this.rawMemory)
    }


    private val setUseDefaultArgsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_use_default_args") }
    open fun setUseDefaultArgs(amount: Long) {
        _icall_Unit_Long(setUseDefaultArgsMethodBind, this.rawMemory, amount)
    }


    private val getUseDefaultArgsMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_use_default_args") }
    open fun getUseDefaultArgs(): Long {
        return _icall_Long(getUseDefaultArgsMethodBind, this.rawMemory)
    }


    open fun _set_argument_cache(argumentCache: Dictionary) {
    }


    open fun _get_argument_cache(): Dictionary {
        throw NotImplementedError("_get_argument_cache is not implemented for VisualScriptFunctionCall")
    }


    private val setRpcCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_rpc_call_mode") }
    open fun setRpcCallMode(mode: Long) {
        _icall_Unit_Long(setRpcCallModeMethodBind, this.rawMemory, mode)
    }


    private val getRpcCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_rpc_call_mode") }
    open fun getRpcCallMode(): VisualScriptFunctionCall.RPCCallMode {
        return VisualScriptFunctionCall.RPCCallMode.fromInt(_icall_Long(getRpcCallModeMethodBind, this.rawMemory))
    }


    private val setValidateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "set_validate") }
    open fun setValidate(enable: Boolean) {
        _icall_Unit_Boolean(setValidateMethodBind, this.rawMemory, enable)
    }


    private val getValidateMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptFunctionCall", "get_validate") }
    open fun getValidate(): Boolean {
        return _icall_Boolean(getValidateMethodBind, this.rawMemory)
    }


}
