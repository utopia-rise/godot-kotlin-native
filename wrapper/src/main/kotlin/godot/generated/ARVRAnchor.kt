@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ARVRAnchor : Spatial {
    constructor() : super("ARVRAnchor")
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
        infix fun from(other: Spatial): ARVRAnchor = ARVRAnchor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ARVRAnchor = ARVRAnchor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ARVRAnchor = ARVRAnchor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ARVRAnchor = fromVariant(ARVRAnchor(""), other)


        // Constants


    }


    // Properties
    open var anchorId: Int
        get() = _icall_Int(getAnchorIdMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAnchorIdMethodBind, this.rawMemory, value)




    // Methods
    private val setAnchorIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRAnchor", "set_anchor_id") }
    open fun setAnchorId(anchorId: Int) {
        _icall_Unit_Int(setAnchorIdMethodBind, this.rawMemory, anchorId)
    }


    private val getAnchorIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRAnchor", "get_anchor_id") }
    open fun getAnchorId(): Int {
        return _icall_Int(getAnchorIdMethodBind, this.rawMemory)
    }


    private val getAnchorNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRAnchor", "get_anchor_name") }
    open fun getAnchorName(): String {
        return _icall_String(getAnchorNameMethodBind, this.rawMemory)
    }


    private val getIsActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRAnchor", "get_is_active") }
    open fun getIsActive(): Boolean {
        return _icall_Boolean(getIsActiveMethodBind, this.rawMemory)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRAnchor", "get_size") }
    open fun getSize(): Vector3 {
        return _icall_Vector3(getSizeMethodBind, this.rawMemory)
    }


    private val getPlaneMethodBind: CPointer<godot_method_bind> by lazy { getMB("ARVRAnchor", "get_plane") }
    open fun getPlane(): Plane {
        return _icall_Plane(getPlaneMethodBind, this.rawMemory)
    }


}
