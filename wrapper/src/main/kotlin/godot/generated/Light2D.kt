@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Light2D : Node2D {
    constructor() : super("Light2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ShadowFilter(val id: Int) {
        SHADOW_FILTER_NONE(0),
        SHADOW_FILTER_PCF3(1),
        SHADOW_FILTER_PCF5(2),
        SHADOW_FILTER_PCF7(3),
        SHADOW_FILTER_PCF9(4),
        SHADOW_FILTER_PCF13(5),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Mode(val id: Int) {
        MODE_ADD(0),
        MODE_SUB(1),
        MODE_MIX(2),
        MODE_MASK(3),
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
        infix fun from(other: Node2D): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Light2D = fromVariant(Light2D(""), other)


        // Constants
        const val MODE_ADD: Int = 0
        const val MODE_SUB: Int = 1
        const val MODE_MIX: Int = 2
        const val MODE_MASK: Int = 3
        const val SHADOW_FILTER_NONE: Int = 0
        const val SHADOW_FILTER_PCF3: Int = 1
        const val SHADOW_FILTER_PCF5: Int = 2
        const val SHADOW_FILTER_PCF7: Int = 3
        const val SHADOW_FILTER_PCF9: Int = 4
        const val SHADOW_FILTER_PCF13: Int = 5


    }


    // Properties
    open var enabled: Boolean
        get() = _icall_Boolean(isEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, value)


    open var editorOnly: Boolean
        get() = _icall_Boolean(isEditorOnlyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEditorOnlyMethodBind, this.rawMemory, value)


    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var offset: Vector2
        get() = _icall_Vector2(getTextureOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setTextureOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var textureScale: Float
        get() = _icall_Float(getTextureScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTextureScaleMethodBind, this.rawMemory, value)


    open var color: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }


    open var energy: Float
        get() = _icall_Float(getEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setEnergyMethodBind, this.rawMemory, value)


    open var mode: Int
        get() = _icall_Int(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setModeMethodBind, this.rawMemory, value)


    open var rangeHeight: Float
        get() = _icall_Float(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHeightMethodBind, this.rawMemory, value)


    open var rangeZMin: Int
        get() = _icall_Int(getZRangeMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setZRangeMinMethodBind, this.rawMemory, value)


    open var rangeZMax: Int
        get() = _icall_Int(getZRangeMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setZRangeMaxMethodBind, this.rawMemory, value)


    open var rangeLayerMin: Int
        get() = _icall_Int(getLayerRangeMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLayerRangeMinMethodBind, this.rawMemory, value)


    open var rangeLayerMax: Int
        get() = _icall_Int(getLayerRangeMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLayerRangeMaxMethodBind, this.rawMemory, value)


    open var rangeItemCullMask: Int
        get() = _icall_Int(getItemCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setItemCullMaskMethodBind, this.rawMemory, value)


    open var shadowEnabled: Boolean
        get() = _icall_Boolean(isShadowEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShadowEnabledMethodBind, this.rawMemory, value)


    open var shadowColor: Color
        get() = _icall_Color(getShadowColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setShadowColorMethodBind, this.rawMemory, value)
    open fun shadowColor(shedule: (Color) -> Unit): Color = shadowColor.apply {
        shedule(this)
        shadowColor = this
    }


    open var shadowBufferSize: Int
        get() = _icall_Int(getShadowBufferSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setShadowBufferSizeMethodBind, this.rawMemory, value)


    open var shadowGradientLength: Float
        get() = _icall_Float(getShadowGradientLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setShadowGradientLengthMethodBind, this.rawMemory, value)


    open var shadowFilter: Float
        get() = _icall_Float(getShadowFilterMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setShadowFilterMethodBind, this.rawMemory, value)


    open var shadowFilterSmooth: Float
        get() = _icall_Float(getShadowSmoothMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setShadowSmoothMethodBind, this.rawMemory, value)


    open var shadowItemCullMask: Int
        get() = _icall_Int(getItemShadowCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setItemShadowCullMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_enabled") }
    open fun setEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "is_enabled") }
    open fun isEnabled(): Boolean {
        return _icall_Boolean(isEnabledMethodBind, this.rawMemory)
    }


    private val setEditorOnlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_editor_only") }
    open fun setEditorOnly(editorOnly: Boolean) {
        _icall_Unit_Boolean(setEditorOnlyMethodBind, this.rawMemory, editorOnly)
    }


    private val isEditorOnlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "is_editor_only") }
    open fun isEditorOnly(): Boolean {
        return _icall_Boolean(isEditorOnlyMethodBind, this.rawMemory)
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_texture_offset") }
    open fun setTextureOffset(textureOffset: Vector2) {
        _icall_Unit_Vector2(setTextureOffsetMethodBind, this.rawMemory, textureOffset)
    }


    private val getTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_texture_offset") }
    open fun getTextureOffset(): Vector2 {
        return _icall_Vector2(getTextureOffsetMethodBind, this.rawMemory)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_height") }
    open fun setHeight(height: Float) {
        _icall_Unit_Float(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_height") }
    open fun getHeight(): Float {
        return _icall_Float(getHeightMethodBind, this.rawMemory)
    }


    private val setEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_energy") }
    open fun setEnergy(energy: Float) {
        _icall_Unit_Float(setEnergyMethodBind, this.rawMemory, energy)
    }


    private val getEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_energy") }
    open fun getEnergy(): Float {
        return _icall_Float(getEnergyMethodBind, this.rawMemory)
    }


    private val setTextureScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_texture_scale") }
    open fun setTextureScale(textureScale: Float) {
        _icall_Unit_Float(setTextureScaleMethodBind, this.rawMemory, textureScale)
    }


    private val getTextureScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_texture_scale") }
    open fun getTextureScale(): Float {
        return _icall_Float(getTextureScaleMethodBind, this.rawMemory)
    }


    private val setZRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_z_range_min") }
    open fun setZRangeMin(z: Int) {
        _icall_Unit_Int(setZRangeMinMethodBind, this.rawMemory, z)
    }


    private val getZRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_z_range_min") }
    open fun getZRangeMin(): Int {
        return _icall_Int(getZRangeMinMethodBind, this.rawMemory)
    }


    private val setZRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_z_range_max") }
    open fun setZRangeMax(z: Int) {
        _icall_Unit_Int(setZRangeMaxMethodBind, this.rawMemory, z)
    }


    private val getZRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_z_range_max") }
    open fun getZRangeMax(): Int {
        return _icall_Int(getZRangeMaxMethodBind, this.rawMemory)
    }


    private val setLayerRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_layer_range_min") }
    open fun setLayerRangeMin(layer: Int) {
        _icall_Unit_Int(setLayerRangeMinMethodBind, this.rawMemory, layer)
    }


    private val getLayerRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_layer_range_min") }
    open fun getLayerRangeMin(): Int {
        return _icall_Int(getLayerRangeMinMethodBind, this.rawMemory)
    }


    private val setLayerRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_layer_range_max") }
    open fun setLayerRangeMax(layer: Int) {
        _icall_Unit_Int(setLayerRangeMaxMethodBind, this.rawMemory, layer)
    }


    private val getLayerRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_layer_range_max") }
    open fun getLayerRangeMax(): Int {
        return _icall_Int(getLayerRangeMaxMethodBind, this.rawMemory)
    }


    private val setItemCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_item_cull_mask") }
    open fun setItemCullMask(itemCullMask: Int) {
        _icall_Unit_Int(setItemCullMaskMethodBind, this.rawMemory, itemCullMask)
    }


    private val getItemCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_item_cull_mask") }
    open fun getItemCullMask(): Int {
        return _icall_Int(getItemCullMaskMethodBind, this.rawMemory)
    }


    private val setItemShadowCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_item_shadow_cull_mask") }
    open fun setItemShadowCullMask(itemShadowCullMask: Int) {
        _icall_Unit_Int(setItemShadowCullMaskMethodBind, this.rawMemory, itemShadowCullMask)
    }


    private val getItemShadowCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_item_shadow_cull_mask") }
    open fun getItemShadowCullMask(): Int {
        return _icall_Int(getItemShadowCullMaskMethodBind, this.rawMemory)
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_mode") }
    open fun getMode(): Light2D.Mode {
        return Light2D.Mode.fromInt(_icall_Int(getModeMethodBind, this.rawMemory))
    }


    private val setShadowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_enabled") }
    open fun setShadowEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setShadowEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isShadowEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "is_shadow_enabled") }
    open fun isShadowEnabled(): Boolean {
        return _icall_Boolean(isShadowEnabledMethodBind, this.rawMemory)
    }


    private val setShadowBufferSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_buffer_size") }
    open fun setShadowBufferSize(size: Int) {
        _icall_Unit_Int(setShadowBufferSizeMethodBind, this.rawMemory, size)
    }


    private val getShadowBufferSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_buffer_size") }
    open fun getShadowBufferSize(): Int {
        return _icall_Int(getShadowBufferSizeMethodBind, this.rawMemory)
    }


    private val setShadowSmoothMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_smooth") }
    open fun setShadowSmooth(smooth: Float) {
        _icall_Unit_Float(setShadowSmoothMethodBind, this.rawMemory, smooth)
    }


    private val getShadowSmoothMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_smooth") }
    open fun getShadowSmooth(): Float {
        return _icall_Float(getShadowSmoothMethodBind, this.rawMemory)
    }


    private val setShadowGradientLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_gradient_length") }
    open fun setShadowGradientLength(multiplier: Float) {
        _icall_Unit_Float(setShadowGradientLengthMethodBind, this.rawMemory, multiplier)
    }


    private val getShadowGradientLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_gradient_length") }
    open fun getShadowGradientLength(): Float {
        return _icall_Float(getShadowGradientLengthMethodBind, this.rawMemory)
    }


    private val setShadowFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_filter") }
    open fun setShadowFilter(filter: Int) {
        _icall_Unit_Int(setShadowFilterMethodBind, this.rawMemory, filter)
    }


    private val getShadowFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_filter") }
    open fun getShadowFilter(): Light2D.ShadowFilter {
        return Light2D.ShadowFilter.fromInt(_icall_Int(getShadowFilterMethodBind, this.rawMemory))
    }


    private val setShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_color") }
    open fun setShadowColor(shadowColor: Color) {
        _icall_Unit_Color(setShadowColorMethodBind, this.rawMemory, shadowColor)
    }


    private val getShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_color") }
    open fun getShadowColor(): Color {
        return _icall_Color(getShadowColorMethodBind, this.rawMemory)
    }


}
