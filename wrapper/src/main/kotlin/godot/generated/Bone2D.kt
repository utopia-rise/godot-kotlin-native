@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Bone2D : Node2D {
    constructor() : super("Bone2D")
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
        infix fun from(other: Node2D): Bone2D = Bone2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Bone2D = Bone2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Bone2D = Bone2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Bone2D = Bone2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Bone2D = fromVariant(Bone2D(""), other)


        // Constants


    }


    // Properties
    open var rest: Transform2D
        get() = _icall_Transform2D(getRestMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setRestMethodBind, this.rawMemory, value)
    open fun rest(shedule: (Transform2D) -> Unit): Transform2D = rest.apply {
        shedule(this)
        rest = this
    }


    open var defaultLength: Double
        get() = _icall_Double(getDefaultLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDefaultLengthMethodBind, this.rawMemory, value)




    // Methods
    private val setRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "set_rest") }
    open fun setRest(rest: Transform2D) {
        _icall_Unit_Transform2D(setRestMethodBind, this.rawMemory, rest)
    }


    private val getRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "get_rest") }
    open fun getRest(): Transform2D {
        return _icall_Transform2D(getRestMethodBind, this.rawMemory)
    }


    private val applyRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "apply_rest") }
    open fun applyRest() {
        _icall_Unit(applyRestMethodBind, this.rawMemory)
    }


    private val getSkeletonRestMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "get_skeleton_rest") }
    open fun getSkeletonRest(): Transform2D {
        return _icall_Transform2D(getSkeletonRestMethodBind, this.rawMemory)
    }


    private val getIndexInSkeletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "get_index_in_skeleton") }
    open fun getIndexInSkeleton(): Long {
        return _icall_Long(getIndexInSkeletonMethodBind, this.rawMemory)
    }


    private val setDefaultLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "set_default_length") }
    open fun setDefaultLength(defaultLength: Double) {
        _icall_Unit_Double(setDefaultLengthMethodBind, this.rawMemory, defaultLength)
    }


    private val getDefaultLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Bone2D", "get_default_length") }
    open fun getDefaultLength(): Double {
        return _icall_Double(getDefaultLengthMethodBind, this.rawMemory)
    }


}
