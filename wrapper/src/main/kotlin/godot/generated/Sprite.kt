@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Sprite : Node2D {
    constructor() : super("Sprite")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val FRAME_CHANGED: String = "frame_changed"
            const val TEXTURE_CHANGED: String = "texture_changed"
        }
    }


    companion object {
        infix fun from(other: Node2D): Sprite = Sprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Sprite = Sprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Sprite = Sprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Sprite = Sprite("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Sprite = fromVariant(Sprite(""), other)


        // Constants


    }


    // Properties
    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var normalMap: Texture
        get() = _icall_Texture(getNormalMapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, value)


    open var centered: Boolean
        get() = _icall_Boolean(isCenteredMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCenteredMethodBind, this.rawMemory, value)


    open var offset: Vector2
        get() = _icall_Vector2(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var flipH: Boolean
        get() = _icall_Boolean(isFlippedHMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFlipHMethodBind, this.rawMemory, value)


    open var flipV: Boolean
        get() = _icall_Boolean(isFlippedVMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFlipVMethodBind, this.rawMemory, value)


    open var vframes: Int
        get() = _icall_Int(getVframesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setVframesMethodBind, this.rawMemory, value)


    open var hframes: Int
        get() = _icall_Int(getHframesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setHframesMethodBind, this.rawMemory, value)


    open var frame: Int
        get() = _icall_Int(getFrameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFrameMethodBind, this.rawMemory, value)


    open var regionEnabled: Boolean
        get() = _icall_Boolean(isRegionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRegionMethodBind, this.rawMemory, value)


    open var regionRect: Rect2
        get() = _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, value)
    open fun regionRect(shedule: (Rect2) -> Unit): Rect2 = regionRect.apply {
        shedule(this)
        regionRect = this
    }


    open var regionFilterClip: Boolean
        get() = _icall_Boolean(isRegionFilterClipEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRegionFilterClipMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_normal_map") }
    open fun setNormalMap(normalMap: Texture) {
        _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, normalMap)
    }


    private val getNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_normal_map") }
    open fun getNormalMap(): Texture {
        return _icall_Texture(getNormalMapMethodBind, this.rawMemory)
    }


    private val setCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_centered") }
    open fun setCentered(centered: Boolean) {
        _icall_Unit_Boolean(setCenteredMethodBind, this.rawMemory, centered)
    }


    private val isCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "is_centered") }
    open fun isCentered(): Boolean {
        return _icall_Boolean(isCenteredMethodBind, this.rawMemory)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val setFlipHMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_flip_h") }
    open fun setFlipH(flipH: Boolean) {
        _icall_Unit_Boolean(setFlipHMethodBind, this.rawMemory, flipH)
    }


    private val isFlippedHMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "is_flipped_h") }
    open fun isFlippedH(): Boolean {
        return _icall_Boolean(isFlippedHMethodBind, this.rawMemory)
    }


    private val setFlipVMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_flip_v") }
    open fun setFlipV(flipV: Boolean) {
        _icall_Unit_Boolean(setFlipVMethodBind, this.rawMemory, flipV)
    }


    private val isFlippedVMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "is_flipped_v") }
    open fun isFlippedV(): Boolean {
        return _icall_Boolean(isFlippedVMethodBind, this.rawMemory)
    }


    private val setRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_region") }
    open fun setRegion(enabled: Boolean) {
        _icall_Unit_Boolean(setRegionMethodBind, this.rawMemory, enabled)
    }


    private val isRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "is_region") }
    open fun isRegion(): Boolean {
        return _icall_Boolean(isRegionMethodBind, this.rawMemory)
    }


    private val setRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_region_rect") }
    open fun setRegionRect(rect: Rect2) {
        _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, rect)
    }


    private val getRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_region_rect") }
    open fun getRegionRect(): Rect2 {
        return _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
    }


    private val setRegionFilterClipMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_region_filter_clip") }
    open fun setRegionFilterClip(enabled: Boolean) {
        _icall_Unit_Boolean(setRegionFilterClipMethodBind, this.rawMemory, enabled)
    }


    private val isRegionFilterClipEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "is_region_filter_clip_enabled") }
    open fun isRegionFilterClipEnabled(): Boolean {
        return _icall_Boolean(isRegionFilterClipEnabledMethodBind, this.rawMemory)
    }


    private val setFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_frame") }
    open fun setFrame(frame: Int) {
        _icall_Unit_Int(setFrameMethodBind, this.rawMemory, frame)
    }


    private val getFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_frame") }
    open fun getFrame(): Int {
        return _icall_Int(getFrameMethodBind, this.rawMemory)
    }


    private val setVframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_vframes") }
    open fun setVframes(vframes: Int) {
        _icall_Unit_Int(setVframesMethodBind, this.rawMemory, vframes)
    }


    private val getVframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_vframes") }
    open fun getVframes(): Int {
        return _icall_Int(getVframesMethodBind, this.rawMemory)
    }


    private val setHframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "set_hframes") }
    open fun setHframes(hframes: Int) {
        _icall_Unit_Int(setHframesMethodBind, this.rawMemory, hframes)
    }


    private val getHframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_hframes") }
    open fun getHframes(): Int {
        return _icall_Int(getHframesMethodBind, this.rawMemory)
    }


    private val getRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite", "get_rect") }
    open fun getRect(): Rect2 {
        return _icall_Rect2(getRectMethodBind, this.rawMemory)
    }


}
