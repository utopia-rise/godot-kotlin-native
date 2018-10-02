@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GeometryInstance : VisualInstance {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Flags(val id: Long) {
        FLAG_USE_BAKED_LIGHT(0),
        FLAG_MAX(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShadowCastingSetting(val id: Long) {
        SHADOW_CASTING_SETTING_OFF(0),
        SHADOW_CASTING_SETTING_ON(1),
        SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
        SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
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
        infix fun from(other: VisualInstance): GeometryInstance = GeometryInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): GeometryInstance = GeometryInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GeometryInstance = GeometryInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GeometryInstance = GeometryInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GeometryInstance = fromVariant(GeometryInstance(""), other)


        // Constants
        const val SHADOW_CASTING_SETTING_OFF: Long = 0
        const val SHADOW_CASTING_SETTING_ON: Long = 1
        const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2
        const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3
        const val FLAG_USE_BAKED_LIGHT: Long = 0
        const val FLAG_MAX: Long = 1


    }


    // Properties
    open var materialOverride: Material
        get() = _icall_Material(getMaterialOverrideMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialOverrideMethodBind, this.rawMemory, value)


    open var castShadow: Long
        get() = _icall_Long(getCastShadowsSettingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCastShadowsSettingMethodBind, this.rawMemory, value)


    open var extraCullMargin: Double
        get() = _icall_Double(getExtraCullMarginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setExtraCullMarginMethodBind, this.rawMemory, value)


    open var useInBakedLight: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 0, value)


    open var lodMinDistance: Long
        get() = _icall_Long(getLodMinDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLodMinDistanceMethodBind, this.rawMemory, value)


    open var lodMinHysteresis: Long
        get() = _icall_Long(getLodMinHysteresisMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLodMinHysteresisMethodBind, this.rawMemory, value)


    open var lodMaxDistance: Long
        get() = _icall_Long(getLodMaxDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLodMaxDistanceMethodBind, this.rawMemory, value)


    open var lodMaxHysteresis: Long
        get() = _icall_Long(getLodMaxHysteresisMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLodMaxHysteresisMethodBind, this.rawMemory, value)




    // Methods
    private val setMaterialOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_material_override") }
    open fun setMaterialOverride(material: Material) {
        _icall_Unit_Object(setMaterialOverrideMethodBind, this.rawMemory, material)
    }


    private val getMaterialOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_material_override") }
    open fun getMaterialOverride(): Material {
        return _icall_Material(getMaterialOverrideMethodBind, this.rawMemory)
    }


    private val setFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_flag") }
    open fun setFlag(flag: Long, value: Boolean) {
        _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, flag, value)
    }


    private val getFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_flag") }
    open fun getFlag(flag: Long): Boolean {
        return _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, flag)
    }


    private val setCastShadowsSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_cast_shadows_setting") }
    open fun setCastShadowsSetting(shadowCastingSetting: Long) {
        _icall_Unit_Long(setCastShadowsSettingMethodBind, this.rawMemory, shadowCastingSetting)
    }


    private val getCastShadowsSettingMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_cast_shadows_setting") }
    open fun getCastShadowsSetting(): GeometryInstance.ShadowCastingSetting {
        return GeometryInstance.ShadowCastingSetting.fromInt(_icall_Long(getCastShadowsSettingMethodBind, this.rawMemory))
    }


    private val setLodMaxHysteresisMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_lod_max_hysteresis") }
    open fun setLodMaxHysteresis(mode: Double) {
        _icall_Unit_Double(setLodMaxHysteresisMethodBind, this.rawMemory, mode)
    }


    private val getLodMaxHysteresisMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_lod_max_hysteresis") }
    open fun getLodMaxHysteresis(): Double {
        return _icall_Double(getLodMaxHysteresisMethodBind, this.rawMemory)
    }


    private val setLodMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_lod_max_distance") }
    open fun setLodMaxDistance(mode: Double) {
        _icall_Unit_Double(setLodMaxDistanceMethodBind, this.rawMemory, mode)
    }


    private val getLodMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_lod_max_distance") }
    open fun getLodMaxDistance(): Double {
        return _icall_Double(getLodMaxDistanceMethodBind, this.rawMemory)
    }


    private val setLodMinHysteresisMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_lod_min_hysteresis") }
    open fun setLodMinHysteresis(mode: Double) {
        _icall_Unit_Double(setLodMinHysteresisMethodBind, this.rawMemory, mode)
    }


    private val getLodMinHysteresisMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_lod_min_hysteresis") }
    open fun getLodMinHysteresis(): Double {
        return _icall_Double(getLodMinHysteresisMethodBind, this.rawMemory)
    }


    private val setLodMinDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_lod_min_distance") }
    open fun setLodMinDistance(mode: Double) {
        _icall_Unit_Double(setLodMinDistanceMethodBind, this.rawMemory, mode)
    }


    private val getLodMinDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_lod_min_distance") }
    open fun getLodMinDistance(): Double {
        return _icall_Double(getLodMinDistanceMethodBind, this.rawMemory)
    }


    private val setExtraCullMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "set_extra_cull_margin") }
    open fun setExtraCullMargin(margin: Double) {
        _icall_Unit_Double(setExtraCullMarginMethodBind, this.rawMemory, margin)
    }


    private val getExtraCullMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("GeometryInstance", "get_extra_cull_margin") }
    open fun getExtraCullMargin(): Double {
        return _icall_Double(getExtraCullMarginMethodBind, this.rawMemory)
    }


}
