@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpriteBase3D : GeometryInstance {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class DrawFlags(val id: Int) {
        FLAG_TRANSPARENT(0),
        FLAG_SHADED(1),
        FLAG_DOUBLE_SIDED(2),
        FLAG_MAX(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class AlphaCutMode(val id: Int) {
        ALPHA_CUT_DISABLED(0),
        ALPHA_CUT_DISCARD(1),
        ALPHA_CUT_OPAQUE_PREPASS(2),
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
        infix fun from(other: GeometryInstance): SpriteBase3D = SpriteBase3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): SpriteBase3D = SpriteBase3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): SpriteBase3D = SpriteBase3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): SpriteBase3D = SpriteBase3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpriteBase3D = SpriteBase3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpriteBase3D = fromVariant(SpriteBase3D(""), other)


        // Constants
        const val FLAG_TRANSPARENT: Int = 0
        const val FLAG_SHADED: Int = 1
        const val FLAG_DOUBLE_SIDED: Int = 2
        const val FLAG_MAX: Int = 3
        const val ALPHA_CUT_DISABLED: Int = 0
        const val ALPHA_CUT_DISCARD: Int = 1
        const val ALPHA_CUT_OPAQUE_PREPASS: Int = 2


    }


    // Properties
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


    open var modulate: Color
        get() = _icall_Color(getModulateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setModulateMethodBind, this.rawMemory, value)
    open fun modulate(shedule: (Color) -> Unit): Color = modulate.apply {
        shedule(this)
        modulate = this
    }


    open var opacity: Float
        get() = _icall_Float(getOpacityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setOpacityMethodBind, this.rawMemory, value)


    open var pixelSize: Float
        get() = _icall_Float(getPixelSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPixelSizeMethodBind, this.rawMemory, value)


    open var axis: Int
        get() = _icall_Int(getAxisMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAxisMethodBind, this.rawMemory, value)


    open var transparent: Boolean
        get() = _icall_Boolean_Int(getDrawFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setDrawFlagMethodBind, this.rawMemory, 0, value)


    open var shaded: Boolean
        get() = _icall_Boolean_Int(getDrawFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setDrawFlagMethodBind, this.rawMemory, 1, value)


    open var doubleSided: Boolean
        get() = _icall_Boolean_Int(getDrawFlagMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setDrawFlagMethodBind, this.rawMemory, 2, value)


    open var alphaCut: Int
        get() = _icall_Int(getAlphaCutModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAlphaCutModeMethodBind, this.rawMemory, value)




    // Methods
    private val setCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_centered") }
    open fun setCentered(centered: Boolean) {
        _icall_Unit_Boolean(setCenteredMethodBind, this.rawMemory, centered)
    }


    private val isCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "is_centered") }
    open fun isCentered(): Boolean {
        return _icall_Boolean(isCenteredMethodBind, this.rawMemory)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val setFlipHMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_flip_h") }
    open fun setFlipH(flipH: Boolean) {
        _icall_Unit_Boolean(setFlipHMethodBind, this.rawMemory, flipH)
    }


    private val isFlippedHMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "is_flipped_h") }
    open fun isFlippedH(): Boolean {
        return _icall_Boolean(isFlippedHMethodBind, this.rawMemory)
    }


    private val setFlipVMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_flip_v") }
    open fun setFlipV(flipV: Boolean) {
        _icall_Unit_Boolean(setFlipVMethodBind, this.rawMemory, flipV)
    }


    private val isFlippedVMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "is_flipped_v") }
    open fun isFlippedV(): Boolean {
        return _icall_Boolean(isFlippedVMethodBind, this.rawMemory)
    }


    private val setModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_modulate") }
    open fun setModulate(modulate: Color) {
        _icall_Unit_Color(setModulateMethodBind, this.rawMemory, modulate)
    }


    private val getModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_modulate") }
    open fun getModulate(): Color {
        return _icall_Color(getModulateMethodBind, this.rawMemory)
    }


    private val setOpacityMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_opacity") }
    open fun setOpacity(opacity: Float) {
        _icall_Unit_Float(setOpacityMethodBind, this.rawMemory, opacity)
    }


    private val getOpacityMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_opacity") }
    open fun getOpacity(): Float {
        return _icall_Float(getOpacityMethodBind, this.rawMemory)
    }


    private val setPixelSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_pixel_size") }
    open fun setPixelSize(pixelSize: Float) {
        _icall_Unit_Float(setPixelSizeMethodBind, this.rawMemory, pixelSize)
    }


    private val getPixelSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_pixel_size") }
    open fun getPixelSize(): Float {
        return _icall_Float(getPixelSizeMethodBind, this.rawMemory)
    }


    private val setAxisMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_axis") }
    open fun setAxis(axis: Int) {
        _icall_Unit_Int(setAxisMethodBind, this.rawMemory, axis)
    }


    private val getAxisMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_axis") }
    open fun getAxis(): Vector3.Axis {
        return Vector3.Axis.fromInt(_icall_Int(getAxisMethodBind, this.rawMemory))
    }


    private val setDrawFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_draw_flag") }
    open fun setDrawFlag(flag: Int, enabled: Boolean) {
        _icall_Unit_Int_Boolean(setDrawFlagMethodBind, this.rawMemory, flag, enabled)
    }


    private val getDrawFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_draw_flag") }
    open fun getDrawFlag(flag: Int): Boolean {
        return _icall_Boolean_Int(getDrawFlagMethodBind, this.rawMemory, flag)
    }


    private val setAlphaCutModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "set_alpha_cut_mode") }
    open fun setAlphaCutMode(mode: Int) {
        _icall_Unit_Int(setAlphaCutModeMethodBind, this.rawMemory, mode)
    }


    private val getAlphaCutModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_alpha_cut_mode") }
    open fun getAlphaCutMode(): SpriteBase3D.AlphaCutMode {
        return SpriteBase3D.AlphaCutMode.fromInt(_icall_Int(getAlphaCutModeMethodBind, this.rawMemory))
    }


    private val getItemRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "get_item_rect") }
    open fun getItemRect(): Rect2 {
        return _icall_Rect2(getItemRectMethodBind, this.rawMemory)
    }


    private val generateTriangleMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("SpriteBase3D", "generate_triangle_mesh") }
    open fun generateTriangleMesh(): TriangleMesh {
        return _icall_TriangleMesh(generateTriangleMeshMethodBind, this.rawMemory)
    }


    open fun _queue_update() {
    }


    open fun _im_update() {
    }


}
