@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Skeleton2D : Node2D {
    constructor() : super("Skeleton2D")
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
        infix fun from(other: Node2D): Skeleton2D = Skeleton2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Skeleton2D = Skeleton2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Skeleton2D = Skeleton2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Skeleton2D = Skeleton2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Skeleton2D = fromVariant(Skeleton2D(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _update_bone_setup() {
    }


    open fun _update_transform() {
    }


    private val getBoneCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton2D", "get_bone_count") }
    open fun getBoneCount(): Int {
        return _icall_Int(getBoneCountMethodBind, this.rawMemory)
    }


    private val getBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton2D", "get_bone") }
    open fun getBone(arg0: Int): Bone2D {
        return _icall_Bone2D_Int(getBoneMethodBind, this.rawMemory, arg0)
    }


    private val getSkeletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Skeleton2D", "get_skeleton") }
    open fun getSkeleton(): RID {
        return _icall_RID(getSkeletonMethodBind, this.rawMemory)
    }


}
