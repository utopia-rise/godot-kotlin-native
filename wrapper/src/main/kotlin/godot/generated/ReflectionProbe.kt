@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ReflectionProbe : VisualInstance {
    constructor() : super("ReflectionProbe")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class UpdateMode(val id: Int) {
        UPDATE_ONCE(0),
        UPDATE_ALWAYS(1),
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
        infix fun from(other: VisualInstance): ReflectionProbe = ReflectionProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): ReflectionProbe = ReflectionProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ReflectionProbe = ReflectionProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ReflectionProbe = ReflectionProbe("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ReflectionProbe = fromVariant(ReflectionProbe(""), other)


        // Constants
        const val UPDATE_ONCE: Int = 0
        const val UPDATE_ALWAYS: Int = 1


    }


    // Properties
    open var updateMode: Int
        get() = _icall_Int(getUpdateModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setUpdateModeMethodBind, this.rawMemory, value)


    open var intensity: Float
        get() = _icall_Float(getIntensityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setIntensityMethodBind, this.rawMemory, value)


    open var maxDistance: Float
        get() = _icall_Float(getMaxDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMaxDistanceMethodBind, this.rawMemory, value)


    open var extents: Vector3
        get() = _icall_Vector3(getExtentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, value)
    open fun extents(shedule: (Vector3) -> Unit): Vector3 = extents.apply {
        shedule(this)
        extents = this
    }


    open var originOffset: Vector3
        get() = _icall_Vector3(getOriginOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setOriginOffsetMethodBind, this.rawMemory, value)
    open fun originOffset(shedule: (Vector3) -> Unit): Vector3 = originOffset.apply {
        shedule(this)
        originOffset = this
    }


    open var boxProjection: Boolean
        get() = _icall_Boolean(isBoxProjectionEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnableBoxProjectionMethodBind, this.rawMemory, value)


    open var enableShadows: Boolean
        get() = _icall_Boolean(areShadowsEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEnableShadowsMethodBind, this.rawMemory, value)


    open var cullMask: Int
        get() = _icall_Int(getCullMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCullMaskMethodBind, this.rawMemory, value)


    open var interiorEnable: Boolean
        get() = _icall_Boolean(isSetAsInteriorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAsInteriorMethodBind, this.rawMemory, value)


    open var interiorAmbientColor: Color
        get() = _icall_Color(getInteriorAmbientMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setInteriorAmbientMethodBind, this.rawMemory, value)
    open fun interiorAmbientColor(shedule: (Color) -> Unit): Color = interiorAmbientColor.apply {
        shedule(this)
        interiorAmbientColor = this
    }


    open var interiorAmbientEnergy: Float
        get() = _icall_Float(getInteriorAmbientEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setInteriorAmbientEnergyMethodBind, this.rawMemory, value)


    open var interiorAmbientContrib: Float
        get() = _icall_Float(getInteriorAmbientProbeContributionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setInteriorAmbientProbeContributionMethodBind, this.rawMemory, value)




    // Methods
    private val setIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_intensity") }
    open fun setIntensity(intensity: Float) {
        _icall_Unit_Float(setIntensityMethodBind, this.rawMemory, intensity)
    }


    private val getIntensityMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_intensity") }
    open fun getIntensity(): Float {
        return _icall_Float(getIntensityMethodBind, this.rawMemory)
    }


    private val setInteriorAmbientMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_interior_ambient") }
    open fun setInteriorAmbient(ambient: Color) {
        _icall_Unit_Color(setInteriorAmbientMethodBind, this.rawMemory, ambient)
    }


    private val getInteriorAmbientMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_interior_ambient") }
    open fun getInteriorAmbient(): Color {
        return _icall_Color(getInteriorAmbientMethodBind, this.rawMemory)
    }


    private val setInteriorAmbientEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_interior_ambient_energy") }
    open fun setInteriorAmbientEnergy(ambientEnergy: Float) {
        _icall_Unit_Float(setInteriorAmbientEnergyMethodBind, this.rawMemory, ambientEnergy)
    }


    private val getInteriorAmbientEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_interior_ambient_energy") }
    open fun getInteriorAmbientEnergy(): Float {
        return _icall_Float(getInteriorAmbientEnergyMethodBind, this.rawMemory)
    }


    private val setInteriorAmbientProbeContributionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_interior_ambient_probe_contribution") }
    open fun setInteriorAmbientProbeContribution(ambientProbeContribution: Float) {
        _icall_Unit_Float(setInteriorAmbientProbeContributionMethodBind, this.rawMemory, ambientProbeContribution)
    }


    private val getInteriorAmbientProbeContributionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_interior_ambient_probe_contribution") }
    open fun getInteriorAmbientProbeContribution(): Float {
        return _icall_Float(getInteriorAmbientProbeContributionMethodBind, this.rawMemory)
    }


    private val setMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_max_distance") }
    open fun setMaxDistance(maxDistance: Float) {
        _icall_Unit_Float(setMaxDistanceMethodBind, this.rawMemory, maxDistance)
    }


    private val getMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_max_distance") }
    open fun getMaxDistance(): Float {
        return _icall_Float(getMaxDistanceMethodBind, this.rawMemory)
    }


    private val setExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_extents") }
    open fun setExtents(extents: Vector3) {
        _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, extents)
    }


    private val getExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_extents") }
    open fun getExtents(): Vector3 {
        return _icall_Vector3(getExtentsMethodBind, this.rawMemory)
    }


    private val setOriginOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_origin_offset") }
    open fun setOriginOffset(originOffset: Vector3) {
        _icall_Unit_Vector3(setOriginOffsetMethodBind, this.rawMemory, originOffset)
    }


    private val getOriginOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_origin_offset") }
    open fun getOriginOffset(): Vector3 {
        return _icall_Vector3(getOriginOffsetMethodBind, this.rawMemory)
    }


    private val setAsInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_as_interior") }
    open fun setAsInterior(enable: Boolean) {
        _icall_Unit_Boolean(setAsInteriorMethodBind, this.rawMemory, enable)
    }


    private val isSetAsInteriorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "is_set_as_interior") }
    open fun isSetAsInterior(): Boolean {
        return _icall_Boolean(isSetAsInteriorMethodBind, this.rawMemory)
    }


    private val setEnableBoxProjectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_enable_box_projection") }
    open fun setEnableBoxProjection(enable: Boolean) {
        _icall_Unit_Boolean(setEnableBoxProjectionMethodBind, this.rawMemory, enable)
    }


    private val isBoxProjectionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "is_box_projection_enabled") }
    open fun isBoxProjectionEnabled(): Boolean {
        return _icall_Boolean(isBoxProjectionEnabledMethodBind, this.rawMemory)
    }


    private val setEnableShadowsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_enable_shadows") }
    open fun setEnableShadows(enable: Boolean) {
        _icall_Unit_Boolean(setEnableShadowsMethodBind, this.rawMemory, enable)
    }


    private val areShadowsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "are_shadows_enabled") }
    open fun areShadowsEnabled(): Boolean {
        return _icall_Boolean(areShadowsEnabledMethodBind, this.rawMemory)
    }


    private val setCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_cull_mask") }
    open fun setCullMask(layers: Int) {
        _icall_Unit_Int(setCullMaskMethodBind, this.rawMemory, layers)
    }


    private val getCullMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_cull_mask") }
    open fun getCullMask(): Int {
        return _icall_Int(getCullMaskMethodBind, this.rawMemory)
    }


    private val setUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "set_update_mode") }
    open fun setUpdateMode(mode: Int) {
        _icall_Unit_Int(setUpdateModeMethodBind, this.rawMemory, mode)
    }


    private val getUpdateModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ReflectionProbe", "get_update_mode") }
    open fun getUpdateMode(): ReflectionProbe.UpdateMode {
        return ReflectionProbe.UpdateMode.fromInt(_icall_Int(getUpdateModeMethodBind, this.rawMemory))
    }


}
