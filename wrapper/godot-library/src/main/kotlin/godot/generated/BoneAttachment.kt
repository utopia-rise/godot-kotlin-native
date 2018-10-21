@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BoneAttachment : Spatial {
    constructor() : super("BoneAttachment")
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
        infix fun from(other: Spatial): BoneAttachment = BoneAttachment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): BoneAttachment = BoneAttachment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BoneAttachment = BoneAttachment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BoneAttachment = fromVariant(BoneAttachment(""), other)


        // Constants


    }


    // Properties
    open var boneName: String
        get() = _icall_String(getBoneNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBoneNameMethodBind, this.rawMemory, value)




    // Methods
    private val setBoneNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoneAttachment", "set_bone_name") }
    open fun setBoneName(boneName: String) {
        _icall_Unit_String(setBoneNameMethodBind, this.rawMemory, boneName)
    }


    private val getBoneNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoneAttachment", "get_bone_name") }
    open fun getBoneName(): String {
        return _icall_String(getBoneNameMethodBind, this.rawMemory)
    }


}
