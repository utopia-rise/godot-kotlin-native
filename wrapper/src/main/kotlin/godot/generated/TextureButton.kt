@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TextureButton : BaseButton {
    constructor() : super("TextureButton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class StretchMode(val id: Int) {
        STRETCH_SCALE(0),
        STRETCH_TILE(1),
        STRETCH_KEEP(2),
        STRETCH_KEEP_CENTERED(3),
        STRETCH_KEEP_ASPECT(4),
        STRETCH_KEEP_ASPECT_CENTERED(5),
        STRETCH_KEEP_ASPECT_COVERED(6),
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
        infix fun from(other: BaseButton): TextureButton = TextureButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): TextureButton = TextureButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TextureButton = TextureButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TextureButton = TextureButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TextureButton = TextureButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TextureButton = fromVariant(TextureButton(""), other)


        // Constants
        const val STRETCH_SCALE: Int = 0
        const val STRETCH_TILE: Int = 1
        const val STRETCH_KEEP: Int = 2
        const val STRETCH_KEEP_CENTERED: Int = 3
        const val STRETCH_KEEP_ASPECT: Int = 4
        const val STRETCH_KEEP_ASPECT_CENTERED: Int = 5
        const val STRETCH_KEEP_ASPECT_COVERED: Int = 6


    }


    // Properties
    open var textureNormal: Texture
        get() = _icall_Texture(getNormalTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNormalTextureMethodBind, this.rawMemory, value)


    open var texturePressed: Texture
        get() = _icall_Texture(getPressedTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setPressedTextureMethodBind, this.rawMemory, value)


    open var textureHover: Texture
        get() = _icall_Texture(getHoverTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setHoverTextureMethodBind, this.rawMemory, value)


    open var textureDisabled: Texture
        get() = _icall_Texture(getDisabledTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setDisabledTextureMethodBind, this.rawMemory, value)


    open var textureFocused: Texture
        get() = _icall_Texture(getFocusedTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setFocusedTextureMethodBind, this.rawMemory, value)


    open var textureClickMask: BitMap
        get() = _icall_BitMap(getClickMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setClickMaskMethodBind, this.rawMemory, value)


    open var expand: Boolean
        get() = _icall_Boolean(getExpandMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, value)


    open var stretchMode: Int
        get() = _icall_Int(getStretchModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setStretchModeMethodBind, this.rawMemory, value)




    // Methods
    private val setNormalTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_normal_texture") }
    open fun setNormalTexture(texture: Texture) {
        _icall_Unit_Object(setNormalTextureMethodBind, this.rawMemory, texture)
    }


    private val setPressedTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_pressed_texture") }
    open fun setPressedTexture(texture: Texture) {
        _icall_Unit_Object(setPressedTextureMethodBind, this.rawMemory, texture)
    }


    private val setHoverTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_hover_texture") }
    open fun setHoverTexture(texture: Texture) {
        _icall_Unit_Object(setHoverTextureMethodBind, this.rawMemory, texture)
    }


    private val setDisabledTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_disabled_texture") }
    open fun setDisabledTexture(texture: Texture) {
        _icall_Unit_Object(setDisabledTextureMethodBind, this.rawMemory, texture)
    }


    private val setFocusedTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_focused_texture") }
    open fun setFocusedTexture(texture: Texture) {
        _icall_Unit_Object(setFocusedTextureMethodBind, this.rawMemory, texture)
    }


    private val setClickMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_click_mask") }
    open fun setClickMask(mask: BitMap) {
        _icall_Unit_Object(setClickMaskMethodBind, this.rawMemory, mask)
    }


    private val setExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_expand") }
    open fun setExpand(pExpand: Boolean) {
        _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, pExpand)
    }


    private val setStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "set_stretch_mode") }
    open fun setStretchMode(pMode: Int) {
        _icall_Unit_Int(setStretchModeMethodBind, this.rawMemory, pMode)
    }


    private val getNormalTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_normal_texture") }
    open fun getNormalTexture(): Texture {
        return _icall_Texture(getNormalTextureMethodBind, this.rawMemory)
    }


    private val getPressedTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_pressed_texture") }
    open fun getPressedTexture(): Texture {
        return _icall_Texture(getPressedTextureMethodBind, this.rawMemory)
    }


    private val getHoverTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_hover_texture") }
    open fun getHoverTexture(): Texture {
        return _icall_Texture(getHoverTextureMethodBind, this.rawMemory)
    }


    private val getDisabledTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_disabled_texture") }
    open fun getDisabledTexture(): Texture {
        return _icall_Texture(getDisabledTextureMethodBind, this.rawMemory)
    }


    private val getFocusedTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_focused_texture") }
    open fun getFocusedTexture(): Texture {
        return _icall_Texture(getFocusedTextureMethodBind, this.rawMemory)
    }


    private val getClickMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_click_mask") }
    open fun getClickMask(): BitMap {
        return _icall_BitMap(getClickMaskMethodBind, this.rawMemory)
    }


    private val getExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_expand") }
    open fun getExpand(): Boolean {
        return _icall_Boolean(getExpandMethodBind, this.rawMemory)
    }


    private val getStretchModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureButton", "get_stretch_mode") }
    open fun getStretchMode(): TextureButton.StretchMode {
        return TextureButton.StretchMode.fromInt(_icall_Int(getStretchModeMethodBind, this.rawMemory))
    }


}
