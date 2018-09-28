@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTexture : VisualShaderNode {
    constructor() : super("VisualShaderNodeTexture")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TextureType(val id: Int) {
        TYPE_DATA(0),
        TYPE_COLOR(1),
        TYPE_NORMALMAP(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Source(val id: Int) {
        SOURCE_TEXTURE(0),
        SOURCE_SCREEN(1),
        SOURCE_2D_TEXTURE(2),
        SOURCE_2D_NORMAL(3),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeTexture = VisualShaderNodeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeTexture = VisualShaderNodeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeTexture = VisualShaderNodeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeTexture = VisualShaderNodeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeTexture = fromVariant(VisualShaderNodeTexture(""), other)


        // Constants
        const val SOURCE_TEXTURE: Int = 0
        const val SOURCE_SCREEN: Int = 1
        const val SOURCE_2D_TEXTURE: Int = 2
        const val SOURCE_2D_NORMAL: Int = 3
        const val TYPE_DATA: Int = 0
        const val TYPE_COLOR: Int = 1
        const val TYPE_NORMALMAP: Int = 2


    }


    // Properties
    open var source: Int
        get() = _icall_Int(getSourceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSourceMethodBind, this.rawMemory, value)


    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var textureType: Int
        get() = _icall_Int(getTextureTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTextureTypeMethodBind, this.rawMemory, value)




    // Methods
    private val setSourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTexture", "set_source") }
    open fun setSource(value: Int) {
        _icall_Unit_Int(setSourceMethodBind, this.rawMemory, value)
    }


    private val getSourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTexture", "get_source") }
    open fun getSource(): VisualShaderNodeTexture.Source {
        return VisualShaderNodeTexture.Source.fromInt(_icall_Int(getSourceMethodBind, this.rawMemory))
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTexture", "set_texture") }
    open fun setTexture(value: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTexture", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTexture", "set_texture_type") }
    open fun setTextureType(value: Int) {
        _icall_Unit_Int(setTextureTypeMethodBind, this.rawMemory, value)
    }


    private val getTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTexture", "get_texture_type") }
    open fun getTextureType(): VisualShaderNodeTexture.TextureType {
        return VisualShaderNodeTexture.TextureType.fromInt(_icall_Int(getTextureTypeMethodBind, this.rawMemory))
    }


}
