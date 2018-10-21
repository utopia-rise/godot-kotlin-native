@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TextureRect : Control {
    constructor() : super("TextureRect")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class StretchMode(val id: Long) {
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
            fun fromInt(value: Long) = values().single { it.id == value }
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
        const val STRETCH_SCALE_ON_EXPAND: Long = 0
        const val STRETCH_SCALE: Long = 1
        const val STRETCH_TILE: Long = 2
        const val STRETCH_KEEP: Long = 3
        const val STRETCH_KEEP_CENTERED: Long = 4
        const val STRETCH_KEEP_ASPECT: Long = 5
        const val STRETCH_KEEP_ASPECT_CENTERED: Long = 6
        const val STRETCH_KEEP_ASPECT_COVERED: Long = 7


    }


    // Properties
    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var expand: Boolean
        get() = _icall_Boolean(hasExpandMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, value)


    open var stretchMode: Long
        get() = _icall_Long(getStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setStretchModeMethodBind, this.rawMemory, value)




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
    open fun setStretchMode(stretchMode: Long) {
        _icall_Unit_Long(setStretchModeMethodBind, this.rawMemory, stretchMode)
    }


    private val getStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureRect", "get_stretch_mode") }
    open fun getStretchMode(): TextureRect.StretchMode {
        return TextureRect.StretchMode.fromInt(_icall_Long(getStretchModeMethodBind, this.rawMemory))
    }


}
