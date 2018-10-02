@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Script : Resource {
    private constructor() : super("")
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
        infix fun from(other: Resource): Script = Script("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Script = Script("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Script = Script("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Script = fromVariant(Script(""), other)


        // Constants


    }


    // Properties
    open var sourceCode: String
        get() = _icall_String(getSourceCodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSourceCodeMethodBind, this.rawMemory, value)




    // Methods
    private val canInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "can_instance") }
    open fun canInstance(): Boolean {
        return _icall_Boolean(canInstanceMethodBind, this.rawMemory)
    }


    private val instanceHasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "instance_has") }
    open fun instanceHas(baseObject: Object): Boolean {
        return _icall_Boolean_Object(instanceHasMethodBind, this.rawMemory, baseObject)
    }


    private val hasSourceCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "has_source_code") }
    open fun hasSourceCode(): Boolean {
        return _icall_Boolean(hasSourceCodeMethodBind, this.rawMemory)
    }


    private val getSourceCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "get_source_code") }
    open fun getSourceCode(): String {
        return _icall_String(getSourceCodeMethodBind, this.rawMemory)
    }


    private val setSourceCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "set_source_code") }
    open fun setSourceCode(source: String) {
        _icall_Unit_String(setSourceCodeMethodBind, this.rawMemory, source)
    }


    private val reloadMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "reload") }
    open fun reload(keepState: Boolean = false): GodotError {
        return GodotError.fromInt(_icall_Long_Boolean(reloadMethodBind, this.rawMemory, keepState))
    }


    private val getBaseScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "get_base_script") }
    open fun getBaseScript(): Script {
        return _icall_Script(getBaseScriptMethodBind, this.rawMemory)
    }


    private val getInstanceBaseTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "get_instance_base_type") }
    open fun getInstanceBaseType(): String {
        return _icall_String(getInstanceBaseTypeMethodBind, this.rawMemory)
    }


    private val hasScriptSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "has_script_signal") }
    open fun hasScriptSignal(signalName: String): Boolean {
        return _icall_Boolean_String(hasScriptSignalMethodBind, this.rawMemory, signalName)
    }


    private val isToolMethodBind: CPointer<godot_method_bind> by lazy { getMB("Script", "is_tool") }
    open fun isTool(): Boolean {
        return _icall_Boolean(isToolMethodBind, this.rawMemory)
    }


}
