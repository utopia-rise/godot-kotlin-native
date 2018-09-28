@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TextureProgress : Range {
    constructor() : super("TextureProgress")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class FillMode(val id: Int) {
        FILL_LEFT_TO_RIGHT(0),
        FILL_RIGHT_TO_LEFT(1),
        FILL_TOP_TO_BOTTOM(2),
        FILL_BOTTOM_TO_TOP(3),
        FILL_CLOCKWISE(4),
        FILL_COUNTER_CLOCKWISE(5),
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
        infix fun from(other: Range): TextureProgress = TextureProgress("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): TextureProgress = TextureProgress("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TextureProgress = TextureProgress("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TextureProgress = TextureProgress("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TextureProgress = TextureProgress("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TextureProgress = fromVariant(TextureProgress(""), other)


        // Constants
        const val FILL_LEFT_TO_RIGHT: Int = 0
        const val FILL_RIGHT_TO_LEFT: Int = 1
        const val FILL_TOP_TO_BOTTOM: Int = 2
        const val FILL_BOTTOM_TO_TOP: Int = 3
        const val FILL_CLOCKWISE: Int = 4
        const val FILL_COUNTER_CLOCKWISE: Int = 5


    }


    // Properties
    open var textureUnder: Texture
        get() = _icall_Texture(getUnderTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setUnderTextureMethodBind, this.rawMemory, value)


    open var textureOver: Texture
        get() = _icall_Texture(getOverTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setOverTextureMethodBind, this.rawMemory, value)


    open var textureProgress: Texture
        get() = _icall_Texture(getProgressTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setProgressTextureMethodBind, this.rawMemory, value)


    open var fillMode: Int
        get() = _icall_Int(getFillModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFillModeMethodBind, this.rawMemory, value)


    open var tintUnder: Color
        get() = _icall_Color(getTintUnderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setTintUnderMethodBind, this.rawMemory, value)
    open fun tintUnder(shedule: (Color) -> Unit): Color = tintUnder.apply {
        shedule(this)
        tintUnder = this
    }


    open var tintOver: Color
        get() = _icall_Color(getTintOverMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setTintOverMethodBind, this.rawMemory, value)
    open fun tintOver(shedule: (Color) -> Unit): Color = tintOver.apply {
        shedule(this)
        tintOver = this
    }


    open var tintProgress: Color
        get() = _icall_Color(getTintProgressMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setTintProgressMethodBind, this.rawMemory, value)
    open fun tintProgress(shedule: (Color) -> Unit): Color = tintProgress.apply {
        shedule(this)
        tintProgress = this
    }


    open var radialInitialAngle: Float
        get() = _icall_Float(getRadialInitialAngleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRadialInitialAngleMethodBind, this.rawMemory, value)


    open var radialFillDegrees: Float
        get() = _icall_Float(getFillDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFillDegreesMethodBind, this.rawMemory, value)


    open var radialCenterOffset: Vector2
        get() = _icall_Vector2(getRadialCenterOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setRadialCenterOffsetMethodBind, this.rawMemory, value)
    open fun radialCenterOffset(shedule: (Vector2) -> Unit): Vector2 = radialCenterOffset.apply {
        shedule(this)
        radialCenterOffset = this
    }


    open var ninePatchStretch: Boolean
        get() = _icall_Boolean(getNinePatchStretchMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setNinePatchStretchMethodBind, this.rawMemory, value)


    open var stretchMarginLeft: Int
        get() = _icall_Int_Int(getStretchMarginMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Int(setStretchMarginMethodBind, this.rawMemory, 0, value)


    open var stretchMarginTop: Int
        get() = _icall_Int_Int(getStretchMarginMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Int(setStretchMarginMethodBind, this.rawMemory, 1, value)


    open var stretchMarginRight: Int
        get() = _icall_Int_Int(getStretchMarginMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Int(setStretchMarginMethodBind, this.rawMemory, 2, value)


    open var stretchMarginBottom: Int
        get() = _icall_Int_Int(getStretchMarginMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Int(setStretchMarginMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setUnderTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_under_texture") }
    open fun setUnderTexture(tex: Texture) {
        _icall_Unit_Object(setUnderTextureMethodBind, this.rawMemory, tex)
    }


    private val getUnderTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_under_texture") }
    open fun getUnderTexture(): Texture {
        return _icall_Texture(getUnderTextureMethodBind, this.rawMemory)
    }


    private val setProgressTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_progress_texture") }
    open fun setProgressTexture(tex: Texture) {
        _icall_Unit_Object(setProgressTextureMethodBind, this.rawMemory, tex)
    }


    private val getProgressTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_progress_texture") }
    open fun getProgressTexture(): Texture {
        return _icall_Texture(getProgressTextureMethodBind, this.rawMemory)
    }


    private val setOverTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_over_texture") }
    open fun setOverTexture(tex: Texture) {
        _icall_Unit_Object(setOverTextureMethodBind, this.rawMemory, tex)
    }


    private val getOverTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_over_texture") }
    open fun getOverTexture(): Texture {
        return _icall_Texture(getOverTextureMethodBind, this.rawMemory)
    }


    private val setFillModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_fill_mode") }
    open fun setFillMode(mode: Int) {
        _icall_Unit_Int(setFillModeMethodBind, this.rawMemory, mode)
    }


    private val getFillModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_fill_mode") }
    open fun getFillMode(): Int {
        return _icall_Int(getFillModeMethodBind, this.rawMemory)
    }


    private val setTintUnderMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_tint_under") }
    open fun setTintUnder(tint: Color) {
        _icall_Unit_Color(setTintUnderMethodBind, this.rawMemory, tint)
    }


    private val getTintUnderMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_tint_under") }
    open fun getTintUnder(): Color {
        return _icall_Color(getTintUnderMethodBind, this.rawMemory)
    }


    private val setTintProgressMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_tint_progress") }
    open fun setTintProgress(tint: Color) {
        _icall_Unit_Color(setTintProgressMethodBind, this.rawMemory, tint)
    }


    private val getTintProgressMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_tint_progress") }
    open fun getTintProgress(): Color {
        return _icall_Color(getTintProgressMethodBind, this.rawMemory)
    }


    private val setTintOverMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_tint_over") }
    open fun setTintOver(tint: Color) {
        _icall_Unit_Color(setTintOverMethodBind, this.rawMemory, tint)
    }


    private val getTintOverMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_tint_over") }
    open fun getTintOver(): Color {
        return _icall_Color(getTintOverMethodBind, this.rawMemory)
    }


    private val setRadialInitialAngleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_radial_initial_angle") }
    open fun setRadialInitialAngle(mode: Float) {
        _icall_Unit_Float(setRadialInitialAngleMethodBind, this.rawMemory, mode)
    }


    private val getRadialInitialAngleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_radial_initial_angle") }
    open fun getRadialInitialAngle(): Float {
        return _icall_Float(getRadialInitialAngleMethodBind, this.rawMemory)
    }


    private val setRadialCenterOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_radial_center_offset") }
    open fun setRadialCenterOffset(mode: Vector2) {
        _icall_Unit_Vector2(setRadialCenterOffsetMethodBind, this.rawMemory, mode)
    }


    private val getRadialCenterOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_radial_center_offset") }
    open fun getRadialCenterOffset(): Vector2 {
        return _icall_Vector2(getRadialCenterOffsetMethodBind, this.rawMemory)
    }


    private val setFillDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_fill_degrees") }
    open fun setFillDegrees(mode: Float) {
        _icall_Unit_Float(setFillDegreesMethodBind, this.rawMemory, mode)
    }


    private val getFillDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_fill_degrees") }
    open fun getFillDegrees(): Float {
        return _icall_Float(getFillDegreesMethodBind, this.rawMemory)
    }


    private val setStretchMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_stretch_margin") }
    open fun setStretchMargin(margin: Int, value: Int) {
        _icall_Unit_Int_Int(setStretchMarginMethodBind, this.rawMemory, margin, value)
    }


    private val getStretchMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_stretch_margin") }
    open fun getStretchMargin(margin: Int): Int {
        return _icall_Int_Int(getStretchMarginMethodBind, this.rawMemory, margin)
    }


    private val setNinePatchStretchMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "set_nine_patch_stretch") }
    open fun setNinePatchStretch(stretch: Boolean) {
        _icall_Unit_Boolean(setNinePatchStretchMethodBind, this.rawMemory, stretch)
    }


    private val getNinePatchStretchMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextureProgress", "get_nine_patch_stretch") }
    open fun getNinePatchStretch(): Boolean {
        return _icall_Boolean(getNinePatchStretchMethodBind, this.rawMemory)
    }


}
