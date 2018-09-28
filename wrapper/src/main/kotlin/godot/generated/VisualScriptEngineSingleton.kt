@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptEngineSingleton : VisualScriptNode {
    constructor() : super("VisualScriptEngineSingleton")
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
        infix fun from(other: VisualScriptNode): VisualScriptEngineSingleton = VisualScriptEngineSingleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptEngineSingleton = VisualScriptEngineSingleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptEngineSingleton = VisualScriptEngineSingleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptEngineSingleton = VisualScriptEngineSingleton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptEngineSingleton = fromVariant(VisualScriptEngineSingleton(""), other)


        // Constants


    }


    // Properties
    open var constant: String
        get() = _icall_String(getSingletonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSingletonMethodBind, this.rawMemory, value)




    // Methods
    private val setSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptEngineSingleton", "set_singleton") }
    open fun setSingleton(name: String) {
        _icall_Unit_String(setSingletonMethodBind, this.rawMemory, name)
    }


    private val getSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptEngineSingleton", "get_singleton") }
    open fun getSingleton(): String {
        return _icall_String(getSingletonMethodBind, this.rawMemory)
    }


}
