@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Listener : Spatial {
    constructor() : super("Listener")
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
        infix fun from(other: Spatial): Listener = Listener("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Listener = Listener("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Listener = Listener("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Listener = fromVariant(Listener(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val makeCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Listener", "make_current") }
    open fun makeCurrent() {
        _icall_Unit(makeCurrentMethodBind, this.rawMemory)
    }


    private val clearCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Listener", "clear_current") }
    open fun clearCurrent() {
        _icall_Unit(clearCurrentMethodBind, this.rawMemory)
    }


    private val isCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Listener", "is_current") }
    open fun isCurrent(): Boolean {
        return _icall_Boolean(isCurrentMethodBind, this.rawMemory)
    }


    private val getListenerTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Listener", "get_listener_transform") }
    open fun getListenerTransform(): Transform {
        return _icall_Transform(getListenerTransformMethodBind, this.rawMemory)
    }


}
