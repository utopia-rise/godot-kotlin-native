@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptYieldSignal : VisualScriptNode {
    constructor() : super("VisualScriptYieldSignal")
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
        infix fun from(other: VisualScriptNode): VisualScriptYieldSignal = VisualScriptYieldSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptYieldSignal = VisualScriptYieldSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptYieldSignal = VisualScriptYieldSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptYieldSignal = VisualScriptYieldSignal("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptYieldSignal = fromVariant(VisualScriptYieldSignal(""), other)


        // Constants
        const val CALL_MODE_SELF: Long = 0
        const val CALL_MODE_NODE_PATH: Long = 1
        const val CALL_MODE_INSTANCE: Long = 2


    }


    // Properties
    open var callMode: Long
        get() = _icall_Long(getCallModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCallModeMethodBind, this.rawMemory, value)


    open var baseType: String
        get() = _icall_String(getBaseTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, value)


    open var nodePath: NodePath
        get() = _icall_NodePath(getBasePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, value)


    open var signal: String
        get() = _icall_String(getSignalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSignalMethodBind, this.rawMemory, value)




    // Methods
    private val setBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "set_base_type") }
    open fun setBaseType(baseType: String) {
        _icall_Unit_String(setBaseTypeMethodBind, this.rawMemory, baseType)
    }


    private val getBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "get_base_type") }
    open fun getBaseType(): String {
        return _icall_String(getBaseTypeMethodBind, this.rawMemory)
    }


    private val setSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "set_signal") }
    open fun setSignal(signal: String) {
        _icall_Unit_String(setSignalMethodBind, this.rawMemory, signal)
    }


    private val getSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "get_signal") }
    open fun getSignal(): String {
        return _icall_String(getSignalMethodBind, this.rawMemory)
    }


    private val setCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "set_call_mode") }
    open fun setCallMode(mode: Long) {
        _icall_Unit_Long(setCallModeMethodBind, this.rawMemory, mode)
    }


    private val getCallModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "get_call_mode") }
    open fun getCallMode(): VisualScriptYieldSignal.CallMode {
        return VisualScriptYieldSignal.CallMode.fromInt(_icall_Long(getCallModeMethodBind, this.rawMemory))
    }


    private val setBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "set_base_path") }
    open fun setBasePath(basePath: NodePath) {
        _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, basePath)
    }


    private val getBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptYieldSignal", "get_base_path") }
    open fun getBasePath(): NodePath {
        return _icall_NodePath(getBasePathMethodBind, this.rawMemory)
    }


}
