@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class World : Resource {
    constructor() : super("World")
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
        infix fun from(other: Resource): World = World("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): World = World("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): World = World("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): World = fromVariant(World(""), other)


        // Constants


    }


    // Properties
    open var environment: Environment
        get() = _icall_Environment(getEnvironmentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEnvironmentMethodBind, this.rawMemory, value)


    open var fallbackEnvironment: Environment
        get() = _icall_Environment(getFallbackEnvironmentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setFallbackEnvironmentMethodBind, this.rawMemory, value)


    open val space: RID
        get() = _icall_RID(getSpaceMethodBind, this.rawMemory)


    open val scenario: RID
        get() = _icall_RID(getScenarioMethodBind, this.rawMemory)


    open val directSpaceState: PhysicsDirectSpaceState
        get() = _icall_PhysicsDirectSpaceState(getDirectSpaceStateMethodBind, this.rawMemory)




    // Methods
    private val getSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "get_space") }
    open fun getSpace(): RID {
        return _icall_RID(getSpaceMethodBind, this.rawMemory)
    }


    private val getScenarioMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "get_scenario") }
    open fun getScenario(): RID {
        return _icall_RID(getScenarioMethodBind, this.rawMemory)
    }


    private val setEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "set_environment") }
    open fun setEnvironment(env: Environment) {
        _icall_Unit_Object(setEnvironmentMethodBind, this.rawMemory, env)
    }


    private val getEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "get_environment") }
    open fun getEnvironment(): Environment {
        return _icall_Environment(getEnvironmentMethodBind, this.rawMemory)
    }


    private val setFallbackEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "set_fallback_environment") }
    open fun setFallbackEnvironment(env: Environment) {
        _icall_Unit_Object(setFallbackEnvironmentMethodBind, this.rawMemory, env)
    }


    private val getFallbackEnvironmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "get_fallback_environment") }
    open fun getFallbackEnvironment(): Environment {
        return _icall_Environment(getFallbackEnvironmentMethodBind, this.rawMemory)
    }


    private val getDirectSpaceStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("World", "get_direct_space_state") }
    open fun getDirectSpaceState(): PhysicsDirectSpaceState {
        return _icall_PhysicsDirectSpaceState(getDirectSpaceStateMethodBind, this.rawMemory)
    }


}
