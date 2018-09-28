@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeBlend2 : AnimationNode {
    constructor() : super("AnimationNodeBlend2")
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
        infix fun from(other: AnimationNode): AnimationNodeBlend2 = AnimationNodeBlend2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeBlend2 = AnimationNodeBlend2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeBlend2 = AnimationNodeBlend2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeBlend2 = AnimationNodeBlend2("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeBlend2 = fromVariant(AnimationNodeBlend2(""), other)


        // Constants


    }


    // Properties
    open var amount: Float
        get() = _icall_Float(getAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAmountMethodBind, this.rawMemory, value)


    open var sync: Boolean
        get() = _icall_Boolean(isUsingSyncMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseSyncMethodBind, this.rawMemory, value)




    // Methods
    private val setAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlend2", "set_amount") }
    open fun setAmount(amount: Float) {
        _icall_Unit_Float(setAmountMethodBind, this.rawMemory, amount)
    }


    private val getAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlend2", "get_amount") }
    open fun getAmount(): Float {
        return _icall_Float(getAmountMethodBind, this.rawMemory)
    }


    private val setUseSyncMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlend2", "set_use_sync") }
    open fun setUseSync(enable: Boolean) {
        _icall_Unit_Boolean(setUseSyncMethodBind, this.rawMemory, enable)
    }


    private val isUsingSyncMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlend2", "is_using_sync") }
    open fun isUsingSync(): Boolean {
        return _icall_Boolean(isUsingSyncMethodBind, this.rawMemory)
    }


}
