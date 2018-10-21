@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BitmapFont : Font {
    constructor() : super("BitmapFont")
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
        infix fun from(other: Font): BitmapFont = BitmapFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): BitmapFont = BitmapFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): BitmapFont = BitmapFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BitmapFont = BitmapFont("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BitmapFont = fromVariant(BitmapFont(""), other)


        // Constants


    }


    // Properties
    open var height: Double
        get() = throw UninitializedPropertyAccessException("Cannot access property height: has no getter")
        set(value) = _icall_Unit_Double(setHeightMethodBind, this.rawMemory, value)


    open var ascent: Double
        get() = throw UninitializedPropertyAccessException("Cannot access property ascent: has no getter")
        set(value) = _icall_Unit_Double(setAscentMethodBind, this.rawMemory, value)


    open var distanceField: Boolean
        get() = throw UninitializedPropertyAccessException("Cannot access property distanceField: has no getter")
        set(value) = _icall_Unit_Boolean(setDistanceFieldHintMethodBind, this.rawMemory, value)


    open var fallback: BitmapFont
        get() = _icall_BitmapFont(getFallbackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setFallbackMethodBind, this.rawMemory, value)




    // Methods
    private val createFromFntMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "create_from_fnt") }
    open fun createFromFnt(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(createFromFntMethodBind, this.rawMemory, path))
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "set_height") }
    open fun setHeight(px: Double) {
        _icall_Unit_Double(setHeightMethodBind, this.rawMemory, px)
    }


    private val setAscentMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "set_ascent") }
    open fun setAscent(px: Double) {
        _icall_Unit_Double(setAscentMethodBind, this.rawMemory, px)
    }


    private val addKerningPairMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "add_kerning_pair") }
    open fun addKerningPair(charA: Long, charB: Long, kerning: Long) {
        _icall_Unit_Long_Long_Long(addKerningPairMethodBind, this.rawMemory, charA, charB, kerning)
    }


    private val getKerningPairMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "get_kerning_pair") }
    open fun getKerningPair(charA: Long, charB: Long): Long {
        return _icall_Long_Long_Long(getKerningPairMethodBind, this.rawMemory, charA, charB)
    }


    private val addTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "add_texture") }
    open fun addTexture(texture: Texture) {
        _icall_Unit_Object(addTextureMethodBind, this.rawMemory, texture)
    }


    private val addCharMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "add_char") }
    open fun addChar(character: Long, texture: Long, rect: Rect2, align: Vector2 = Vector2(0, 0), advance: Double = -1.0) {
        _icall_Unit_Long_Long_Rect2_Vector2_Double(addCharMethodBind, this.rawMemory, character, texture, rect, align, advance)
    }


    private val getTextureCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "get_texture_count") }
    open fun getTextureCount(): Long {
        return _icall_Long(getTextureCountMethodBind, this.rawMemory)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "get_texture") }
    open fun getTexture(idx: Long): Texture {
        return _icall_Texture_Long(getTextureMethodBind, this.rawMemory, idx)
    }


    private val getCharSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "get_char_size") }
    open fun getCharSize(char: Long, next: Long = 0): Vector2 {
        return _icall_Vector2_Long_Long(getCharSizeMethodBind, this.rawMemory, char, next)
    }


    private val setDistanceFieldHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "set_distance_field_hint") }
    open fun setDistanceFieldHint(enable: Boolean) {
        _icall_Unit_Boolean(setDistanceFieldHintMethodBind, this.rawMemory, enable)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    open fun _set_chars(arg0: PoolIntArray) {
    }


    open fun _get_chars(): PoolIntArray {
        throw NotImplementedError("_get_chars is not implemented for BitmapFont")
    }


    open fun _set_kernings(arg0: PoolIntArray) {
    }


    open fun _get_kernings(): PoolIntArray {
        throw NotImplementedError("_get_kernings is not implemented for BitmapFont")
    }


    open fun _set_textures(arg0: GDArray) {
    }


    open fun _get_textures(): GDArray {
        throw NotImplementedError("_get_textures is not implemented for BitmapFont")
    }


    private val setFallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "set_fallback") }
    open fun setFallback(fallback: BitmapFont) {
        _icall_Unit_Object(setFallbackMethodBind, this.rawMemory, fallback)
    }


    private val getFallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("BitmapFont", "get_fallback") }
    open fun getFallback(): BitmapFont {
        return _icall_BitmapFont(getFallbackMethodBind, this.rawMemory)
    }


}
