@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class WorldEnvironment : Node {
    constructor() : super("WorldEnvironment")
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
        infix fun from(other: Node): WorldEnvironment = WorldEnvironment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): WorldEnvironment = WorldEnvironment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): WorldEnvironment = fromVariant(WorldEnvironment(""), other)


        // Constants


    }


    // Properties
    open var environment: Environment
        get() = _icall_Environment(getEnvironmentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEnvironmentMethodBind, this.rawMemory, value)




    // Methods
    private val setEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("WorldEnvironment", "set_environment") }
    open fun setEnvironment(env: Environment) {
        _icall_Unit_Object(setEnvironmentMethodBind, this.rawMemory, env)
    }


    private val getEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("WorldEnvironment", "get_environment") }
    open fun getEnvironment(): Environment {
        return _icall_Environment(getEnvironmentMethodBind, this.rawMemory)
    }


}
