@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NavigationPolygonInstance : Node2D {
    constructor() : super("NavigationPolygonInstance")
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
        infix fun from(other: Node2D): NavigationPolygonInstance = NavigationPolygonInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): NavigationPolygonInstance = NavigationPolygonInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): NavigationPolygonInstance = NavigationPolygonInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NavigationPolygonInstance = NavigationPolygonInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NavigationPolygonInstance = fromVariant(NavigationPolygonInstance(""), other)


        // Constants


    }


    // Properties
    open var navpoly: NavigationPolygon
        get() = _icall_NavigationPolygon(getNavigationPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNavigationPolygonMethodBind, this.rawMemory, value)


    open var enabled: Boolean
        get() = _icall_Boolean(isEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val setNavigationPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygonInstance", "set_navigation_polygon") }
    open fun setNavigationPolygon(navpoly: NavigationPolygon) {
        _icall_Unit_Object(setNavigationPolygonMethodBind, this.rawMemory, navpoly)
    }


    private val getNavigationPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygonInstance", "get_navigation_polygon") }
    open fun getNavigationPolygon(): NavigationPolygon {
        return _icall_NavigationPolygon(getNavigationPolygonMethodBind, this.rawMemory)
    }


    private val setEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygonInstance", "set_enabled") }
    open fun setEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("NavigationPolygonInstance", "is_enabled") }
    open fun isEnabled(): Boolean {
        return _icall_Boolean(isEnabledMethodBind, this.rawMemory)
    }


    open fun _navpoly_changed() {
    }


}
