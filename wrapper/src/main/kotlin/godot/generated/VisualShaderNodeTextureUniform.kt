@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTextureUniform : VisualShaderNodeUniform {
    constructor() : super("VisualShaderNodeTextureUniform")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TextureType(val id: Int) {
        TYPE_DATA(0),
        TYPE_COLOR(1),
        TYPE_NORMALMAP(2),
        TYPE_ANISO(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ColorDefault(val id: Int) {
        COLOR_DEFAULT_WHITE(0),
        COLOR_DEFAULT_BLACK(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val TYPE_DATA: Int = 0
        const val TYPE_COLOR: Int = 1
        const val TYPE_NORMALMAP: Int = 2
        const val TYPE_ANISO: Int = 3
        const val COLOR_DEFAULT_WHITE: Int = 0
        const val COLOR_DEFAULT_BLACK: Int = 1


    }


    // Properties
    open var textureType: Int
        get() = _icall_Int(getTextureTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTextureTypeMethodBind, this.rawMemory, value)


    open var colorDefault: Int
        get() = _icall_Int(getColorDefaultMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setColorDefaultMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "set_texture_type") }
    open fun setTextureType(type: Int) {
        _icall_Unit_Int(setTextureTypeMethodBind, this.rawMemory, type)
    }


    private val getTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "get_texture_type") }
    open fun getTextureType(): VisualShaderNodeTextureUniform.TextureType {
        return VisualShaderNodeTextureUniform.TextureType.fromInt(_icall_Int(getTextureTypeMethodBind, this.rawMemory))
    }


    private val setColorDefaultMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "set_color_default") }
    open fun setColorDefault(type: Int) {
        _icall_Unit_Int(setColorDefaultMethodBind, this.rawMemory, type)
    }


    private val getColorDefaultMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTextureUniform", "get_color_default") }
    open fun getColorDefault(): VisualShaderNodeTextureUniform.ColorDefault {
        return VisualShaderNodeTextureUniform.ColorDefault.fromInt(_icall_Int(getColorDefaultMethodBind, this.rawMemory))
    }


}
