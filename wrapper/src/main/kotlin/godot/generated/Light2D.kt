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

    enum class ShadowFilter(val id: Long) {
        SHADOW_FILTER_NONE(0),
        SHADOW_FILTER_PCF3(1),
        SHADOW_FILTER_PCF5(2),
        SHADOW_FILTER_PCF7(3),
        SHADOW_FILTER_PCF9(4),
        SHADOW_FILTER_PCF13(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Mode(val id: Long) {
        MODE_ADD(0),
        MODE_SUB(1),
        MODE_MIX(2),
        MODE_MASK(3),
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
        infix fun from(other: Node2D): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Light2D = Light2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Light2D = fromVariant(Light2D(""), other)


        // Constants
        const val MODE_ADD: Long = 0
        const val MODE_SUB: Long = 1
        const val MODE_MIX: Long = 2
        const val MODE_MASK: Long = 3
        const val SHADOW_FILTER_NONE: Long = 0
        const val SHADOW_FILTER_PCF3: Long = 1
        const val SHADOW_FILTER_PCF5: Long = 2
        const val SHADOW_FILTER_PCF7: Long = 3
        const val SHADOW_FILTER_PCF9: Long = 4
        const val SHADOW_FILTER_PCF13: Long = 5


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


    open var textureScale: Double
        get() = _icall_Double(getTextureScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTextureScaleMethodBind, this.rawMemory, value)


    open var color: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }


    open var energy: Double
        get() = _icall_Double(getEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, value)


    open var mode: Long
        get() = _icall_Long(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setModeMethodBind, this.rawMemory, value)


    open var rangeHeight: Double
        get() = _icall_Double(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHeightMethodBind, this.rawMemory, value)


    open var rangeZMin: Long
        get() = _icall_Long(getZRangeMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setZRangeMinMethodBind, this.rawMemory, value)


    open var rangeZMax: Long
        get() = _icall_Long(getZRangeMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setZRangeMaxMethodBind, this.rawMemory, value)


    open var rangeLayerMin: Long
        get() = _icall_Long(getLayerRangeMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLayerRangeMinMethodBind, this.rawMemory, value)


    open var rangeLayerMax: Long
        get() = _icall_Long(getLayerRangeMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLayerRangeMaxMethodBind, this.rawMemory, value)


    open var rangeItemCullMask: Long
        get() = _icall_Long(getItemCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setItemCullMaskMethodBind, this.rawMemory, value)


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


    open var shadowBufferSize: Long
        get() = _icall_Long(getShadowBufferSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setShadowBufferSizeMethodBind, this.rawMemory, value)


    open var shadowGradientLength: Double
        get() = _icall_Double(getShadowGradientLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setShadowGradientLengthMethodBind, this.rawMemory, value)


    open var shadowFilter: Double
        get() = _icall_Double(getShadowFilterMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setShadowFilterMethodBind, this.rawMemory, value)


    open var shadowFilterSmooth: Double
        get() = _icall_Double(getShadowSmoothMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setShadowSmoothMethodBind, this.rawMemory, value)


    open var shadowItemCullMask: Long
        get() = _icall_Long(getItemShadowCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setItemShadowCullMaskMethodBind, this.rawMemory, value)




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
    open fun setHeight(height: Double) {
        _icall_Unit_Double(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_height") }
    open fun getHeight(): Double {
        return _icall_Double(getHeightMethodBind, this.rawMemory)
    }


    private val setEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_energy") }
    open fun setEnergy(energy: Double) {
        _icall_Unit_Double(setEnergyMethodBind, this.rawMemory, energy)
    }


    private val getEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_energy") }
    open fun getEnergy(): Double {
        return _icall_Double(getEnergyMethodBind, this.rawMemory)
    }


    private val setTextureScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_texture_scale") }
    open fun setTextureScale(textureScale: Double) {
        _icall_Unit_Double(setTextureScaleMethodBind, this.rawMemory, textureScale)
    }


    private val getTextureScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_texture_scale") }
    open fun getTextureScale(): Double {
        return _icall_Double(getTextureScaleMethodBind, this.rawMemory)
    }


    private val setZRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_z_range_min") }
    open fun setZRangeMin(z: Long) {
        _icall_Unit_Long(setZRangeMinMethodBind, this.rawMemory, z)
    }


    private val getZRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_z_range_min") }
    open fun getZRangeMin(): Long {
        return _icall_Long(getZRangeMinMethodBind, this.rawMemory)
    }


    private val setZRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_z_range_max") }
    open fun setZRangeMax(z: Long) {
        _icall_Unit_Long(setZRangeMaxMethodBind, this.rawMemory, z)
    }


    private val getZRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_z_range_max") }
    open fun getZRangeMax(): Long {
        return _icall_Long(getZRangeMaxMethodBind, this.rawMemory)
    }


    private val setLayerRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_layer_range_min") }
    open fun setLayerRangeMin(layer: Long) {
        _icall_Unit_Long(setLayerRangeMinMethodBind, this.rawMemory, layer)
    }


    private val getLayerRangeMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_layer_range_min") }
    open fun getLayerRangeMin(): Long {
        return _icall_Long(getLayerRangeMinMethodBind, this.rawMemory)
    }


    private val setLayerRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_layer_range_max") }
    open fun setLayerRangeMax(layer: Long) {
        _icall_Unit_Long(setLayerRangeMaxMethodBind, this.rawMemory, layer)
    }


    private val getLayerRangeMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_layer_range_max") }
    open fun getLayerRangeMax(): Long {
        return _icall_Long(getLayerRangeMaxMethodBind, this.rawMemory)
    }


    private val setItemCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_item_cull_mask") }
    open fun setItemCullMask(itemCullMask: Long) {
        _icall_Unit_Long(setItemCullMaskMethodBind, this.rawMemory, itemCullMask)
    }


    private val getItemCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_item_cull_mask") }
    open fun getItemCullMask(): Long {
        return _icall_Long(getItemCullMaskMethodBind, this.rawMemory)
    }


    private val setItemShadowCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_item_shadow_cull_mask") }
    open fun setItemShadowCullMask(itemShadowCullMask: Long) {
        _icall_Unit_Long(setItemShadowCullMaskMethodBind, this.rawMemory, itemShadowCullMask)
    }


    private val getItemShadowCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_item_shadow_cull_mask") }
    open fun getItemShadowCullMask(): Long {
        return _icall_Long(getItemShadowCullMaskMethodBind, this.rawMemory)
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_mode") }
    open fun setMode(mode: Long) {
        _icall_Unit_Long(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_mode") }
    open fun getMode(): Light2D.Mode {
        return Light2D.Mode.fromInt(_icall_Long(getModeMethodBind, this.rawMemory))
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
    open fun setShadowBufferSize(size: Long) {
        _icall_Unit_Long(setShadowBufferSizeMethodBind, this.rawMemory, size)
    }


    private val getShadowBufferSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_buffer_size") }
    open fun getShadowBufferSize(): Long {
        return _icall_Long(getShadowBufferSizeMethodBind, this.rawMemory)
    }


    private val setShadowSmoothMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_smooth") }
    open fun setShadowSmooth(smooth: Double) {
        _icall_Unit_Double(setShadowSmoothMethodBind, this.rawMemory, smooth)
    }


    private val getShadowSmoothMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_smooth") }
    open fun getShadowSmooth(): Double {
        return _icall_Double(getShadowSmoothMethodBind, this.rawMemory)
    }


    private val setShadowGradientLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_gradient_length") }
    open fun setShadowGradientLength(multiplier: Double) {
        _icall_Unit_Double(setShadowGradientLengthMethodBind, this.rawMemory, multiplier)
    }


    private val getShadowGradientLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_gradient_length") }
    open fun getShadowGradientLength(): Double {
        return _icall_Double(getShadowGradientLengthMethodBind, this.rawMemory)
    }


    private val setShadowFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "set_shadow_filter") }
    open fun setShadowFilter(filter: Long) {
        _icall_Unit_Long(setShadowFilterMethodBind, this.rawMemory, filter)
    }


    private val getShadowFilterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light2D", "get_shadow_filter") }
    open fun getShadowFilter(): Light2D.ShadowFilter {
        return Light2D.ShadowFilter.fromInt(_icall_Long(getShadowFilterMethodBind, this.rawMemory))
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
