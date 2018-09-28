@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TextureRect : Control {
    constructor() : super("TextureRect")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class StretchMode(val id: Int) {
        STRETCH_SCALE_ON_EXPAND(0),
        STRETCH_SCALE(1),
        STRETCH_TILE(2),
        STRETCH_KEEP(3),
        STRETCH_KEEP_CENTERED(4),
        STRETCH_KEEP_ASPECT(5),
        STRETCH_KEEP_ASPECT_CENTERED(6),
        STRETCH_KEEP_ASPECT_COVERED(7),
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
        infix fun from(other: Control): TextureRect = TextureRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TextureRect = TextureRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TextureRect = TextureRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TextureRect = TextureRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TextureRect = fromVariant(TextureRect(""), other)


        // Constants
        const val STRETCH_SCALE_ON_EXPAND: Int = 0
        const val STRETCH_SCALE: Int = 1
        const val STRETCH_TILE: Int = 2
        const val STRETCH_KEEP: Int = 3
        const val STRETCH_KEEP_CENTERED: Int = 4
        const val STRETCH_KEEP_ASPECT: Int = 5
        const val STRETCH_KEEP_ASPECT_CENTERED: Int = 6
        const val STRETCH_KEEP_ASPECT_COVERED: Int = 7


    }


    // Properties
    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var expand: Boolean
        get() = _icall_Boolean(hasExpandMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, value)


    open var stretchMode: Int
        get() = _icall_Int(getStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setStretchModeMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "set_expand") }
    open fun setExpand(enable: Boolean) {
        _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, enable)
    }


    private val hasExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "has_expand") }
    open fun hasExpand(): Boolean {
        return _icall_Boolean(hasExpandMethodBind, this.rawMemory)
    }


    private val setStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "set_stretch_mode") }
    open fun setStretchMode(stretchMode: Int) {
        _icall_Unit_Int(setStretchModeMethodBind, this.rawMemory, stretchMode)
    }


    private val getStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "get_stretch_mode") }
    open fun getStretchMode(): TextureRect.StretchMode {
        return TextureRect.StretchMode.fromInt(_icall_Int(getStretchModeMethodBind, this.rawMemory))
    }


}
