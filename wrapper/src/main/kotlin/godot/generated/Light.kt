@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Light : VisualInstance {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BakeMode(val id: Int) {
        BAKE_DISABLED(0),
        BAKE_INDIRECT(1),
        BAKE_ALL(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Param(val id: Int) {
        PARAM_ENERGY(0),
        PARAM_INDIRECT_ENERGY(1),
        PARAM_SPECULAR(2),
        PARAM_RANGE(3),
        PARAM_ATTENUATION(4),
        PARAM_SPOT_ANGLE(5),
        PARAM_SPOT_ATTENUATION(6),
        PARAM_CONTACT_SHADOW_SIZE(7),
        PARAM_SHADOW_MAX_DISTANCE(8),
        PARAM_SHADOW_SPLIT_1_OFFSET(9),
        PARAM_SHADOW_SPLIT_2_OFFSET(10),
        PARAM_SHADOW_SPLIT_3_OFFSET(11),
        PARAM_SHADOW_NORMAL_BIAS(12),
        PARAM_SHADOW_BIAS(13),
        PARAM_SHADOW_BIAS_SPLIT_SCALE(14),
        PARAM_MAX(15),
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
        infix fun from(other: VisualInstance): Light = Light("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): Light = Light("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Light = Light("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Light = Light("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Light = fromVariant(Light(""), other)


        // Constants
        const val PARAM_ENERGY: Int = 0
        const val PARAM_INDIRECT_ENERGY: Int = 1
        const val PARAM_SPECULAR: Int = 2
        const val PARAM_RANGE: Int = 3
        const val PARAM_ATTENUATION: Int = 4
        const val PARAM_SPOT_ANGLE: Int = 5
        const val PARAM_SPOT_ATTENUATION: Int = 6
        const val PARAM_CONTACT_SHADOW_SIZE: Int = 7
        const val PARAM_SHADOW_MAX_DISTANCE: Int = 8
        const val PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9
        const val PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10
        const val PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11
        const val PARAM_SHADOW_NORMAL_BIAS: Int = 12
        const val PARAM_SHADOW_BIAS: Int = 13
        const val PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14
        const val PARAM_MAX: Int = 15
        const val BAKE_DISABLED: Int = 0
        const val BAKE_INDIRECT: Int = 1
        const val BAKE_ALL: Int = 2


    }


    // Properties
    open var lightColor: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun lightColor(shedule: (Color) -> Unit): Color = lightColor.apply {
        shedule(this)
        lightColor = this
    }


    open var lightEnergy: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 0, value)


    open var lightIndirectEnergy: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 1, value)


    open var lightNegative: Boolean
        get() = _icall_Boolean(isNegativeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setNegativeMethodBind, this.rawMemory, value)


    open var lightSpecular: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 2, value)


    open var lightBakeMode: Int
        get() = _icall_Int(getBakeModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBakeModeMethodBind, this.rawMemory, value)


    open var lightCullMask: Int
        get() = _icall_Int(getCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCullMaskMethodBind, this.rawMemory, value)


    open var shadowEnabled: Boolean
        get() = _icall_Boolean(hasShadowMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShadowMethodBind, this.rawMemory, value)


    open var shadowColor: Color
        get() = _icall_Color(getShadowColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setShadowColorMethodBind, this.rawMemory, value)
    open fun shadowColor(shedule: (Color) -> Unit): Color = shadowColor.apply {
        shedule(this)
        shadowColor = this
    }


    open var shadowBias: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 13, value)


    open var shadowContact: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 7, value)


    open var shadowReverseCullFace: Boolean
        get() = _icall_Boolean(getShadowReverseCullFaceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShadowReverseCullFaceMethodBind, this.rawMemory, value)


    open var editorOnly: Boolean
        get() = _icall_Boolean(isEditorOnlyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEditorOnlyMethodBind, this.rawMemory, value)




    // Methods
    private val setEditorOnlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_editor_only") }
    open fun setEditorOnly(editorOnly: Boolean) {
        _icall_Unit_Boolean(setEditorOnlyMethodBind, this.rawMemory, editorOnly)
    }


    private val isEditorOnlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "is_editor_only") }
    open fun isEditorOnly(): Boolean {
        return _icall_Boolean(isEditorOnlyMethodBind, this.rawMemory)
    }


    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_param") }
    open fun setParam(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "get_param") }
    open fun getParam(param: Int): Float {
        return _icall_Float_Int(getParamMethodBind, this.rawMemory, param)
    }


    private val setShadowMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_shadow") }
    open fun setShadow(enabled: Boolean) {
        _icall_Unit_Boolean(setShadowMethodBind, this.rawMemory, enabled)
    }


    private val hasShadowMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "has_shadow") }
    open fun hasShadow(): Boolean {
        return _icall_Boolean(hasShadowMethodBind, this.rawMemory)
    }


    private val setNegativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_negative") }
    open fun setNegative(enabled: Boolean) {
        _icall_Unit_Boolean(setNegativeMethodBind, this.rawMemory, enabled)
    }


    private val isNegativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "is_negative") }
    open fun isNegative(): Boolean {
        return _icall_Boolean(isNegativeMethodBind, this.rawMemory)
    }


    private val setCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_cull_mask") }
    open fun setCullMask(cullMask: Int) {
        _icall_Unit_Int(setCullMaskMethodBind, this.rawMemory, cullMask)
    }


    private val getCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "get_cull_mask") }
    open fun getCullMask(): Int {
        return _icall_Int(getCullMaskMethodBind, this.rawMemory)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


    private val setShadowReverseCullFaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_shadow_reverse_cull_face") }
    open fun setShadowReverseCullFace(enable: Boolean) {
        _icall_Unit_Boolean(setShadowReverseCullFaceMethodBind, this.rawMemory, enable)
    }


    private val getShadowReverseCullFaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "get_shadow_reverse_cull_face") }
    open fun getShadowReverseCullFace(): Boolean {
        return _icall_Boolean(getShadowReverseCullFaceMethodBind, this.rawMemory)
    }


    private val setShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_shadow_color") }
    open fun setShadowColor(shadowColor: Color) {
        _icall_Unit_Color(setShadowColorMethodBind, this.rawMemory, shadowColor)
    }


    private val getShadowColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "get_shadow_color") }
    open fun getShadowColor(): Color {
        return _icall_Color(getShadowColorMethodBind, this.rawMemory)
    }


    private val setBakeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "set_bake_mode") }
    open fun setBakeMode(bakeMode: Int) {
        _icall_Unit_Int(setBakeModeMethodBind, this.rawMemory, bakeMode)
    }


    private val getBakeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Light", "get_bake_mode") }
    open fun getBakeMode(): Light.BakeMode {
        return Light.BakeMode.fromInt(_icall_Int(getBakeModeMethodBind, this.rawMemory))
    }


}
