@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Line2D : Node2D {
    constructor() : super("Line2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class LineTextureMode(val id: Int) {
        LINE_TEXTURE_NONE(0),
        LINE_TEXTURE_TILE(1),
        LINE_TEXTURE_STRETCH(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LineCapMode(val id: Int) {
        LINE_CAP_NONE(0),
        LINE_CAP_BOX(1),
        LINE_CAP_ROUND(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class LineJointMode(val id: Int) {
        LINE_JOINT_SHARP(0),
        LINE_JOINT_BEVEL(1),
        LINE_JOINT_ROUND(2),
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
        infix fun from(other: Node2D): Line2D = Line2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Line2D = Line2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Line2D = Line2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Line2D = Line2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Line2D = fromVariant(Line2D(""), other)


        // Constants
        const val LINE_JOINT_SHARP: Int = 0
        const val LINE_JOINT_BEVEL: Int = 1
        const val LINE_JOINT_ROUND: Int = 2
        const val LINE_CAP_NONE: Int = 0
        const val LINE_CAP_BOX: Int = 1
        const val LINE_CAP_ROUND: Int = 2
        const val LINE_TEXTURE_NONE: Int = 0
        const val LINE_TEXTURE_TILE: Int = 1
        const val LINE_TEXTURE_STRETCH: Int = 2


    }


    // Properties
    open var points: PoolVector2Array
        get() = _icall_PoolVector2Array(getPointsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPointsMethodBind, this.rawMemory, value)


    open var width: Float
        get() = _icall_Float(getWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setWidthMethodBind, this.rawMemory, value)


    open var defaultColor: Color
        get() = _icall_Color(getDefaultColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setDefaultColorMethodBind, this.rawMemory, value)
    open fun defaultColor(shedule: (Color) -> Unit): Color = defaultColor.apply {
        shedule(this)
        defaultColor = this
    }


    open var gradient: Gradient
        get() = _icall_Gradient(getGradientMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setGradientMethodBind, this.rawMemory, value)


    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var textureMode: Int
        get() = _icall_Int(getTextureModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTextureModeMethodBind, this.rawMemory, value)


    open var jointMode: Int
        get() = _icall_Int(getJointModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setJointModeMethodBind, this.rawMemory, value)


    open var beginCapMode: Int
        get() = _icall_Int(getBeginCapModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBeginCapModeMethodBind, this.rawMemory, value)


    open var endCapMode: Int
        get() = _icall_Int(getEndCapModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setEndCapModeMethodBind, this.rawMemory, value)


    open var sharpLimit: Float
        get() = _icall_Float(getSharpLimitMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSharpLimitMethodBind, this.rawMemory, value)


    open var roundPrecision: Int
        get() = _icall_Int(getRoundPrecisionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRoundPrecisionMethodBind, this.rawMemory, value)




    // Methods
    private val setPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_points") }
    open fun setPoints(points: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPointsMethodBind, this.rawMemory, points)
    }


    private val getPointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_points") }
    open fun getPoints(): PoolVector2Array {
        return _icall_PoolVector2Array(getPointsMethodBind, this.rawMemory)
    }


    private val setPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_point_position") }
    open fun setPointPosition(i: Int, position: Vector2) {
        _icall_Unit_Int_Vector2(setPointPositionMethodBind, this.rawMemory, i, position)
    }


    private val getPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_point_position") }
    open fun getPointPosition(i: Int): Vector2 {
        return _icall_Vector2_Int(getPointPositionMethodBind, this.rawMemory, i)
    }


    private val getPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_point_count") }
    open fun getPointCount(): Int {
        return _icall_Int(getPointCountMethodBind, this.rawMemory)
    }


    private val addPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "add_point") }
    open fun addPoint(position: Vector2) {
        _icall_Unit_Vector2(addPointMethodBind, this.rawMemory, position)
    }


    private val removePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "remove_point") }
    open fun removePoint(i: Int) {
        _icall_Unit_Int(removePointMethodBind, this.rawMemory, i)
    }


    private val setWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_width") }
    open fun setWidth(width: Float) {
        _icall_Unit_Float(setWidthMethodBind, this.rawMemory, width)
    }


    private val getWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_width") }
    open fun getWidth(): Float {
        return _icall_Float(getWidthMethodBind, this.rawMemory)
    }


    private val setDefaultColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_default_color") }
    open fun setDefaultColor(color: Color) {
        _icall_Unit_Color(setDefaultColorMethodBind, this.rawMemory, color)
    }


    private val getDefaultColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_default_color") }
    open fun getDefaultColor(): Color {
        return _icall_Color(getDefaultColorMethodBind, this.rawMemory)
    }


    private val setGradientMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_gradient") }
    open fun setGradient(color: Gradient) {
        _icall_Unit_Object(setGradientMethodBind, this.rawMemory, color)
    }


    private val getGradientMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_gradient") }
    open fun getGradient(): Gradient {
        return _icall_Gradient(getGradientMethodBind, this.rawMemory)
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setTextureModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_texture_mode") }
    open fun setTextureMode(mode: Int) {
        _icall_Unit_Int(setTextureModeMethodBind, this.rawMemory, mode)
    }


    private val getTextureModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_texture_mode") }
    open fun getTextureMode(): Line2D.LineTextureMode {
        return Line2D.LineTextureMode.fromInt(_icall_Int(getTextureModeMethodBind, this.rawMemory))
    }


    private val setJointModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_joint_mode") }
    open fun setJointMode(mode: Int) {
        _icall_Unit_Int(setJointModeMethodBind, this.rawMemory, mode)
    }


    private val getJointModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_joint_mode") }
    open fun getJointMode(): Line2D.LineJointMode {
        return Line2D.LineJointMode.fromInt(_icall_Int(getJointModeMethodBind, this.rawMemory))
    }


    private val setBeginCapModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_begin_cap_mode") }
    open fun setBeginCapMode(mode: Int) {
        _icall_Unit_Int(setBeginCapModeMethodBind, this.rawMemory, mode)
    }


    private val getBeginCapModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_begin_cap_mode") }
    open fun getBeginCapMode(): Line2D.LineCapMode {
        return Line2D.LineCapMode.fromInt(_icall_Int(getBeginCapModeMethodBind, this.rawMemory))
    }


    private val setEndCapModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_end_cap_mode") }
    open fun setEndCapMode(mode: Int) {
        _icall_Unit_Int(setEndCapModeMethodBind, this.rawMemory, mode)
    }


    private val getEndCapModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_end_cap_mode") }
    open fun getEndCapMode(): Line2D.LineCapMode {
        return Line2D.LineCapMode.fromInt(_icall_Int(getEndCapModeMethodBind, this.rawMemory))
    }


    private val setSharpLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_sharp_limit") }
    open fun setSharpLimit(limit: Float) {
        _icall_Unit_Float(setSharpLimitMethodBind, this.rawMemory, limit)
    }


    private val getSharpLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_sharp_limit") }
    open fun getSharpLimit(): Float {
        return _icall_Float(getSharpLimitMethodBind, this.rawMemory)
    }


    private val setRoundPrecisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "set_round_precision") }
    open fun setRoundPrecision(precision: Int) {
        _icall_Unit_Int(setRoundPrecisionMethodBind, this.rawMemory, precision)
    }


    private val getRoundPrecisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Line2D", "get_round_precision") }
    open fun getRoundPrecision(): Int {
        return _icall_Int(getRoundPrecisionMethodBind, this.rawMemory)
    }


    open fun _gradient_changed() {
    }


}
