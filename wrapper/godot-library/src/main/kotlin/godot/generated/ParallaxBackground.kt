@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ParallaxBackground : CanvasLayer {
    constructor() : super("ParallaxBackground")
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
        infix fun from(other: CanvasLayer): ParallaxBackground = ParallaxBackground("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ParallaxBackground = ParallaxBackground("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ParallaxBackground = ParallaxBackground("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ParallaxBackground = fromVariant(ParallaxBackground(""), other)


        // Constants


    }


    // Properties
    open var scrollOffset: Vector2
        get() = _icall_Vector2(getScrollOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScrollOffsetMethodBind, this.rawMemory, value)
    open fun scrollOffset(shedule: (Vector2) -> Unit): Vector2 = scrollOffset.apply {
        shedule(this)
        scrollOffset = this
    }


    open var scrollBaseOffset: Vector2
        get() = _icall_Vector2(getScrollBaseOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScrollBaseOffsetMethodBind, this.rawMemory, value)
    open fun scrollBaseOffset(shedule: (Vector2) -> Unit): Vector2 = scrollBaseOffset.apply {
        shedule(this)
        scrollBaseOffset = this
    }


    open var scrollBaseScale: Vector2
        get() = _icall_Vector2(getScrollBaseScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScrollBaseScaleMethodBind, this.rawMemory, value)
    open fun scrollBaseScale(shedule: (Vector2) -> Unit): Vector2 = scrollBaseScale.apply {
        shedule(this)
        scrollBaseScale = this
    }


    open var scrollLimitBegin: Vector2
        get() = _icall_Vector2(getLimitBeginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setLimitBeginMethodBind, this.rawMemory, value)
    open fun scrollLimitBegin(shedule: (Vector2) -> Unit): Vector2 = scrollLimitBegin.apply {
        shedule(this)
        scrollLimitBegin = this
    }


    open var scrollLimitEnd: Vector2
        get() = _icall_Vector2(getLimitEndMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setLimitEndMethodBind, this.rawMemory, value)
    open fun scrollLimitEnd(shedule: (Vector2) -> Unit): Vector2 = scrollLimitEnd.apply {
        shedule(this)
        scrollLimitEnd = this
    }


    open var scrollIgnoreCameraZoom: Boolean
        get() = _icall_Boolean(isIgnoreCameraZoomMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setIgnoreCameraZoomMethodBind, this.rawMemory, value)




    // Methods
    open fun _camera_moved(arg0: Transform2D, arg1: Vector2) {
    }


    private val setScrollOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "set_scroll_offset") }
    open fun setScrollOffset(ofs: Vector2) {
        _icall_Unit_Vector2(setScrollOffsetMethodBind, this.rawMemory, ofs)
    }


    private val getScrollOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "get_scroll_offset") }
    open fun getScrollOffset(): Vector2 {
        return _icall_Vector2(getScrollOffsetMethodBind, this.rawMemory)
    }


    private val setScrollBaseOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "set_scroll_base_offset") }
    open fun setScrollBaseOffset(ofs: Vector2) {
        _icall_Unit_Vector2(setScrollBaseOffsetMethodBind, this.rawMemory, ofs)
    }


    private val getScrollBaseOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "get_scroll_base_offset") }
    open fun getScrollBaseOffset(): Vector2 {
        return _icall_Vector2(getScrollBaseOffsetMethodBind, this.rawMemory)
    }


    private val setScrollBaseScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "set_scroll_base_scale") }
    open fun setScrollBaseScale(scale: Vector2) {
        _icall_Unit_Vector2(setScrollBaseScaleMethodBind, this.rawMemory, scale)
    }


    private val getScrollBaseScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "get_scroll_base_scale") }
    open fun getScrollBaseScale(): Vector2 {
        return _icall_Vector2(getScrollBaseScaleMethodBind, this.rawMemory)
    }


    private val setLimitBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "set_limit_begin") }
    open fun setLimitBegin(ofs: Vector2) {
        _icall_Unit_Vector2(setLimitBeginMethodBind, this.rawMemory, ofs)
    }


    private val getLimitBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "get_limit_begin") }
    open fun getLimitBegin(): Vector2 {
        return _icall_Vector2(getLimitBeginMethodBind, this.rawMemory)
    }


    private val setLimitEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "set_limit_end") }
    open fun setLimitEnd(ofs: Vector2) {
        _icall_Unit_Vector2(setLimitEndMethodBind, this.rawMemory, ofs)
    }


    private val getLimitEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "get_limit_end") }
    open fun getLimitEnd(): Vector2 {
        return _icall_Vector2(getLimitEndMethodBind, this.rawMemory)
    }


    private val setIgnoreCameraZoomMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "set_ignore_camera_zoom") }
    open fun setIgnoreCameraZoom(ignore: Boolean) {
        _icall_Unit_Boolean(setIgnoreCameraZoomMethodBind, this.rawMemory, ignore)
    }


    private val isIgnoreCameraZoomMethodBind: CPointer<godot_method_bind> by lazy { getMB("ParallaxBackground", "is_ignore_camera_zoom") }
    open fun isIgnoreCameraZoom(): Boolean {
        return _icall_Boolean(isIgnoreCameraZoomMethodBind, this.rawMemory)
    }


}
