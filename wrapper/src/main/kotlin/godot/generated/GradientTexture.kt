@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GradientTexture : Texture {
    constructor() : super("GradientTexture")
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
        infix fun from(other: Texture): GradientTexture = GradientTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): GradientTexture = GradientTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): GradientTexture = GradientTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GradientTexture = GradientTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GradientTexture = fromVariant(GradientTexture(""), other)


        // Constants


    }


    // Properties
    open var gradient: Gradient
        get() = _icall_Gradient(getGradientMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setGradientMethodBind, this.rawMemory, value)


    open var width: Long
        get() = throw UninitializedPropertyAccessException("Cannot access property width: has no getter")
        set(value) = _icall_Unit_Long(setWidthMethodBind, this.rawMemory, value)




    // Methods
    private val setGradientMethodBind: CPointer<godot_method_bind> by lazy { getMB("GradientTexture", "set_gradient") }
    open fun setGradient(gradient: Gradient) {
        _icall_Unit_Object(setGradientMethodBind, this.rawMemory, gradient)
    }


    private val getGradientMethodBind: CPointer<godot_method_bind> by lazy { getMB("GradientTexture", "get_gradient") }
    open fun getGradient(): Gradient {
        return _icall_Gradient(getGradientMethodBind, this.rawMemory)
    }


    private val setWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("GradientTexture", "set_width") }
    open fun setWidth(width: Long) {
        _icall_Unit_Long(setWidthMethodBind, this.rawMemory, width)
    }


    open fun _update() {
    }


}
