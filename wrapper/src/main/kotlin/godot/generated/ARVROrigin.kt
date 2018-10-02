@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ARVROrigin : Spatial {
    constructor() : super("ARVROrigin")
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
        infix fun from(other: Spatial): ARVROrigin = ARVROrigin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ARVROrigin = ARVROrigin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ARVROrigin = ARVROrigin("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ARVROrigin = fromVariant(ARVROrigin(""), other)


        // Constants


    }


    // Properties
    open var worldScale: Float
        get() = _icall_Float(getWorldScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setWorldScaleMethodBind, this.rawMemory, value)




    // Methods
    private val setWorldScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVROrigin", "set_world_scale") }
    open fun setWorldScale(worldScale: Float) {
        _icall_Unit_Float(setWorldScaleMethodBind, this.rawMemory, worldScale)
    }


    private val getWorldScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVROrigin", "get_world_scale") }
    open fun getWorldScale(): Float {
        return _icall_Float(getWorldScaleMethodBind, this.rawMemory)
    }


}
