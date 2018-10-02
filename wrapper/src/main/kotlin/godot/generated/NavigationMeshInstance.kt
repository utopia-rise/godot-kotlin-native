@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NavigationMeshInstance : Spatial {
    constructor() : super("NavigationMeshInstance")
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
        infix fun from(other: Spatial): NavigationMeshInstance = NavigationMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): NavigationMeshInstance = NavigationMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NavigationMeshInstance = NavigationMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NavigationMeshInstance = fromVariant(NavigationMeshInstance(""), other)


        // Constants


    }


    // Properties
    open var navmesh: NavigationMesh
        get() = _icall_NavigationMesh(getNavigationMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNavigationMeshMethodBind, this.rawMemory, value)


    open var enabled: Boolean
        get() = _icall_Boolean(isEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val setNavigationMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMeshInstance", "set_navigation_mesh") }
    open fun setNavigationMesh(navmesh: NavigationMesh) {
        _icall_Unit_Object(setNavigationMeshMethodBind, this.rawMemory, navmesh)
    }


    private val getNavigationMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMeshInstance", "get_navigation_mesh") }
    open fun getNavigationMesh(): NavigationMesh {
        return _icall_NavigationMesh(getNavigationMeshMethodBind, this.rawMemory)
    }


    private val setEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMeshInstance", "set_enabled") }
    open fun setEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationMeshInstance", "is_enabled") }
    open fun isEnabled(): Boolean {
        return _icall_Boolean(isEnabledMethodBind, this.rawMemory)
    }


}
