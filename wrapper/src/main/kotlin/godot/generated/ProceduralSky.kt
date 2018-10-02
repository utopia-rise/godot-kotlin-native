@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ProceduralSky : Sky {
    constructor() : super("ProceduralSky")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TextureSize(val id: Long) {
        TEXTURE_SIZE_256(0),
        TEXTURE_SIZE_512(1),
        TEXTURE_SIZE_1024(2),
        TEXTURE_SIZE_2048(3),
        TEXTURE_SIZE_4096(4),
        TEXTURE_SIZE_MAX(5),
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
        infix fun from(other: Sky): ProceduralSky = ProceduralSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ProceduralSky = ProceduralSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ProceduralSky = ProceduralSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ProceduralSky = ProceduralSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ProceduralSky = fromVariant(ProceduralSky(""), other)


        // Constants
        const val TEXTURE_SIZE_256: Long = 0
        const val TEXTURE_SIZE_512: Long = 1
        const val TEXTURE_SIZE_1024: Long = 2
        const val TEXTURE_SIZE_2048: Long = 3
        const val TEXTURE_SIZE_4096: Long = 4
        const val TEXTURE_SIZE_MAX: Long = 5


    }


    // Properties
    open var skyTopColor: Color
        get() = _icall_Color(getSkyTopColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setSkyTopColorMethodBind, this.rawMemory, value)
    open fun skyTopColor(shedule: (Color) -> Unit): Color = skyTopColor.apply {
        shedule(this)
        skyTopColor = this
    }


    open var skyHorizonColor: Color
        get() = _icall_Color(getSkyHorizonColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setSkyHorizonColorMethodBind, this.rawMemory, value)
    open fun skyHorizonColor(shedule: (Color) -> Unit): Color = skyHorizonColor.apply {
        shedule(this)
        skyHorizonColor = this
    }


    open var skyCurve: Double
        get() = _icall_Double(getSkyCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSkyCurveMethodBind, this.rawMemory, value)


    open var skyEnergy: Double
        get() = _icall_Double(getSkyEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSkyEnergyMethodBind, this.rawMemory, value)


    open var groundBottomColor: Color
        get() = _icall_Color(getGroundBottomColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setGroundBottomColorMethodBind, this.rawMemory, value)
    open fun groundBottomColor(shedule: (Color) -> Unit): Color = groundBottomColor.apply {
        shedule(this)
        groundBottomColor = this
    }


    open var groundHorizonColor: Color
        get() = _icall_Color(getGroundHorizonColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setGroundHorizonColorMethodBind, this.rawMemory, value)
    open fun groundHorizonColor(shedule: (Color) -> Unit): Color = groundHorizonColor.apply {
        shedule(this)
        groundHorizonColor = this
    }


    open var groundCurve: Double
        get() = _icall_Double(getGroundCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGroundCurveMethodBind, this.rawMemory, value)


    open var groundEnergy: Double
        get() = _icall_Double(getGroundEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGroundEnergyMethodBind, this.rawMemory, value)


    open var sunColor: Color
        get() = _icall_Color(getSunColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setSunColorMethodBind, this.rawMemory, value)
    open fun sunColor(shedule: (Color) -> Unit): Color = sunColor.apply {
        shedule(this)
        sunColor = this
    }


    open var sunLatitude: Double
        get() = _icall_Double(getSunLatitudeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSunLatitudeMethodBind, this.rawMemory, value)


    open var sunLongitude: Double
        get() = _icall_Double(getSunLongitudeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSunLongitudeMethodBind, this.rawMemory, value)


    open var sunAngleMin: Double
        get() = _icall_Double(getSunAngleMinMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSunAngleMinMethodBind, this.rawMemory, value)


    open var sunAngleMax: Double
        get() = _icall_Double(getSunAngleMaxMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSunAngleMaxMethodBind, this.rawMemory, value)


    open var sunCurve: Double
        get() = _icall_Double(getSunCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSunCurveMethodBind, this.rawMemory, value)


    open var sunEnergy: Double
        get() = _icall_Double(getSunEnergyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSunEnergyMethodBind, this.rawMemory, value)


    open var textureSize: Long
        get() = _icall_Long(getTextureSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTextureSizeMethodBind, this.rawMemory, value)




    // Methods
    open fun _update_sky() {
    }


    private val setSkyTopColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sky_top_color") }
    open fun setSkyTopColor(color: Color) {
        _icall_Unit_Color(setSkyTopColorMethodBind, this.rawMemory, color)
    }


    private val getSkyTopColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sky_top_color") }
    open fun getSkyTopColor(): Color {
        return _icall_Color(getSkyTopColorMethodBind, this.rawMemory)
    }


    private val setSkyHorizonColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sky_horizon_color") }
    open fun setSkyHorizonColor(color: Color) {
        _icall_Unit_Color(setSkyHorizonColorMethodBind, this.rawMemory, color)
    }


    private val getSkyHorizonColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sky_horizon_color") }
    open fun getSkyHorizonColor(): Color {
        return _icall_Color(getSkyHorizonColorMethodBind, this.rawMemory)
    }


    private val setSkyCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sky_curve") }
    open fun setSkyCurve(curve: Double) {
        _icall_Unit_Double(setSkyCurveMethodBind, this.rawMemory, curve)
    }


    private val getSkyCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sky_curve") }
    open fun getSkyCurve(): Double {
        return _icall_Double(getSkyCurveMethodBind, this.rawMemory)
    }


    private val setSkyEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sky_energy") }
    open fun setSkyEnergy(energy: Double) {
        _icall_Unit_Double(setSkyEnergyMethodBind, this.rawMemory, energy)
    }


    private val getSkyEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sky_energy") }
    open fun getSkyEnergy(): Double {
        return _icall_Double(getSkyEnergyMethodBind, this.rawMemory)
    }


    private val setGroundBottomColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_ground_bottom_color") }
    open fun setGroundBottomColor(color: Color) {
        _icall_Unit_Color(setGroundBottomColorMethodBind, this.rawMemory, color)
    }


    private val getGroundBottomColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_ground_bottom_color") }
    open fun getGroundBottomColor(): Color {
        return _icall_Color(getGroundBottomColorMethodBind, this.rawMemory)
    }


    private val setGroundHorizonColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_ground_horizon_color") }
    open fun setGroundHorizonColor(color: Color) {
        _icall_Unit_Color(setGroundHorizonColorMethodBind, this.rawMemory, color)
    }


    private val getGroundHorizonColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_ground_horizon_color") }
    open fun getGroundHorizonColor(): Color {
        return _icall_Color(getGroundHorizonColorMethodBind, this.rawMemory)
    }


    private val setGroundCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_ground_curve") }
    open fun setGroundCurve(curve: Double) {
        _icall_Unit_Double(setGroundCurveMethodBind, this.rawMemory, curve)
    }


    private val getGroundCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_ground_curve") }
    open fun getGroundCurve(): Double {
        return _icall_Double(getGroundCurveMethodBind, this.rawMemory)
    }


    private val setGroundEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_ground_energy") }
    open fun setGroundEnergy(energy: Double) {
        _icall_Unit_Double(setGroundEnergyMethodBind, this.rawMemory, energy)
    }


    private val getGroundEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_ground_energy") }
    open fun getGroundEnergy(): Double {
        return _icall_Double(getGroundEnergyMethodBind, this.rawMemory)
    }


    private val setSunColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_color") }
    open fun setSunColor(color: Color) {
        _icall_Unit_Color(setSunColorMethodBind, this.rawMemory, color)
    }


    private val getSunColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_color") }
    open fun getSunColor(): Color {
        return _icall_Color(getSunColorMethodBind, this.rawMemory)
    }


    private val setSunLatitudeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_latitude") }
    open fun setSunLatitude(degrees: Double) {
        _icall_Unit_Double(setSunLatitudeMethodBind, this.rawMemory, degrees)
    }


    private val getSunLatitudeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_latitude") }
    open fun getSunLatitude(): Double {
        return _icall_Double(getSunLatitudeMethodBind, this.rawMemory)
    }


    private val setSunLongitudeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_longitude") }
    open fun setSunLongitude(degrees: Double) {
        _icall_Unit_Double(setSunLongitudeMethodBind, this.rawMemory, degrees)
    }


    private val getSunLongitudeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_longitude") }
    open fun getSunLongitude(): Double {
        return _icall_Double(getSunLongitudeMethodBind, this.rawMemory)
    }


    private val setSunAngleMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_angle_min") }
    open fun setSunAngleMin(degrees: Double) {
        _icall_Unit_Double(setSunAngleMinMethodBind, this.rawMemory, degrees)
    }


    private val getSunAngleMinMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_angle_min") }
    open fun getSunAngleMin(): Double {
        return _icall_Double(getSunAngleMinMethodBind, this.rawMemory)
    }


    private val setSunAngleMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_angle_max") }
    open fun setSunAngleMax(degrees: Double) {
        _icall_Unit_Double(setSunAngleMaxMethodBind, this.rawMemory, degrees)
    }


    private val getSunAngleMaxMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_angle_max") }
    open fun getSunAngleMax(): Double {
        return _icall_Double(getSunAngleMaxMethodBind, this.rawMemory)
    }


    private val setSunCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_curve") }
    open fun setSunCurve(curve: Double) {
        _icall_Unit_Double(setSunCurveMethodBind, this.rawMemory, curve)
    }


    private val getSunCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_curve") }
    open fun getSunCurve(): Double {
        return _icall_Double(getSunCurveMethodBind, this.rawMemory)
    }


    private val setSunEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_sun_energy") }
    open fun setSunEnergy(energy: Double) {
        _icall_Unit_Double(setSunEnergyMethodBind, this.rawMemory, energy)
    }


    private val getSunEnergyMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_sun_energy") }
    open fun getSunEnergy(): Double {
        return _icall_Double(getSunEnergyMethodBind, this.rawMemory)
    }


    private val setTextureSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "set_texture_size") }
    open fun setTextureSize(size: Long) {
        _icall_Unit_Long(setTextureSizeMethodBind, this.rawMemory, size)
    }


    private val getTextureSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProceduralSky", "get_texture_size") }
    open fun getTextureSize(): ProceduralSky.TextureSize {
        return ProceduralSky.TextureSize.fromInt(_icall_Long(getTextureSizeMethodBind, this.rawMemory))
    }


    open fun _thread_done(image: Image) {
    }


}
