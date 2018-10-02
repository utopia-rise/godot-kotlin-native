@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeAdd2 : AnimationNode {
    constructor() : super("AnimationNodeAdd2")
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
        infix fun from(other: AnimationNode): AnimationNodeAdd2 = AnimationNodeAdd2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeAdd2 = AnimationNodeAdd2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeAdd2 = AnimationNodeAdd2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeAdd2 = AnimationNodeAdd2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeAdd2 = fromVariant(AnimationNodeAdd2(""), other)


        // Constants


    }


    // Properties
    open var amount: Double
        get() = _icall_Double(getAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAmountMethodBind, this.rawMemory, value)


    open var sync: Boolean
        get() = _icall_Boolean(isUsingSyncMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseSyncMethodBind, this.rawMemory, value)




    // Methods
    private val setAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAdd2", "set_amount") }
    open fun setAmount(amount: Double) {
        _icall_Unit_Double(setAmountMethodBind, this.rawMemory, amount)
    }


    private val getAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAdd2", "get_amount") }
    open fun getAmount(): Double {
        return _icall_Double(getAmountMethodBind, this.rawMemory)
    }


    private val setUseSyncMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAdd2", "set_use_sync") }
    open fun setUseSync(enable: Boolean) {
        _icall_Unit_Boolean(setUseSyncMethodBind, this.rawMemory, enable)
    }


    private val isUsingSyncMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeAdd2", "is_using_sync") }
    open fun isUsingSync(): Boolean {
        return _icall_Boolean(isUsingSyncMethodBind, this.rawMemory)
    }


}
