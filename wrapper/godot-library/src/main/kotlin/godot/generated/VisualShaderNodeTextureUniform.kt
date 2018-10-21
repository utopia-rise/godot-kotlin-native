@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTextureUniform : VisualShaderNodeUniform {
    constructor() : super("VisualShaderNodeTextureUniform")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TextureType(val id: Long) {
        TYPE_DATA(0),
        TYPE_COLOR(1),
        TYPE_NORMALMAP(2),
        TYPE_ANISO(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ColorDefault(val id: Long) {
        COLOR_DEFAULT_WHITE(0),
        COLOR_DEFAULT_BLACK(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisualShaderNodeUniform): VisualShaderNodeTextureUniform = VisualShaderNodeTextureUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualShaderNode): VisualShaderNodeTextureUniform = VisualShaderNodeTextureUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeTextureUniform = VisualShaderNodeTextureUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeTextureUniform = VisualShaderNodeTextureUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeTextureUniform = VisualShaderNodeTextureUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeTextureUniform = fromVariant(VisualShaderNodeTextureUniform(""), other)


        // Constants
        const val TYPE_DATA: Long = 0
        const val TYPE_COLOR: Long = 1
        const val TYPE_NORMALMAP: Long = 2
        const val TYPE_ANISO: Long = 3
        const val COLOR_DEFAULT_WHITE: Long = 0
        const val COLOR_DEFAULT_BLACK: Long = 1


    }


    // Properties
    open var textureType: Long
        get() = _icall_Long(getTextureTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTextureTypeMethodBind, this.rawMemory, value)


    open var colorDefault: Long
        get() = _icall_Long(getColorDefaultMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setColorDefaultMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "set_texture_type") }
    open fun setTextureType(type: Long) {
        _icall_Unit_Long(setTextureTypeMethodBind, this.rawMemory, type)
    }


    private val getTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "get_texture_type") }
    open fun getTextureType(): VisualShaderNodeTextureUniform.TextureType {
        return VisualShaderNodeTextureUniform.TextureType.fromInt(_icall_Long(getTextureTypeMethodBind, this.rawMemory))
    }


    private val setColorDefaultMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "set_color_default") }
    open fun setColorDefault(type: Long) {
        _icall_Unit_Long(setColorDefaultMethodBind, this.rawMemory, type)
    }


    private val getColorDefaultMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "get_color_default") }
    open fun getColorDefault(): VisualShaderNodeTextureUniform.ColorDefault {
        return VisualShaderNodeTextureUniform.ColorDefault.fromInt(_icall_Long(getColorDefaultMethodBind, this.rawMemory))
    }


}
