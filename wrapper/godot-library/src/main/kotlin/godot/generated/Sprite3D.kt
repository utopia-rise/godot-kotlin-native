@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Sprite3D : SpriteBase3D {
    constructor() : super("Sprite3D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val FRAME_CHANGED: String = "frame_changed"
        }
    }


    companion object {
        infix fun from(other: SpriteBase3D): Sprite3D = Sprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: GeometryInstance): Sprite3D = Sprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): Sprite3D = Sprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): Sprite3D = Sprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Sprite3D = Sprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Sprite3D = Sprite3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Sprite3D = fromVariant(Sprite3D(""), other)


        // Constants


    }


    // Properties
    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var vframes: Long
        get() = _icall_Long(getVframesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVframesMethodBind, this.rawMemory, value)


    open var hframes: Long
        get() = _icall_Long(getHframesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHframesMethodBind, this.rawMemory, value)


    open var frame: Long
        get() = _icall_Long(getFrameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFrameMethodBind, this.rawMemory, value)


    open var regionEnabled: Boolean
        get() = _icall_Boolean(isRegionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRegionMethodBind, this.rawMemory, value)


    open var regionRect: Rect2
        get() = _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, value)
    open fun regionRect(shedule: (Rect2) -> Unit): Rect2 = regionRect.apply {
        shedule(this)
        regionRect = this
    }




    // Methods
    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "set_region") }
    open fun setRegion(enabled: Boolean) {
        _icall_Unit_Boolean(setRegionMethodBind, this.rawMemory, enabled)
    }


    private val isRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "is_region") }
    open fun isRegion(): Boolean {
        return _icall_Boolean(isRegionMethodBind, this.rawMemory)
    }


    private val setRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "set_region_rect") }
    open fun setRegionRect(rect: Rect2) {
        _icall_Unit_Rect2(setRegionRectMethodBind, this.rawMemory, rect)
    }


    private val getRegionRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "get_region_rect") }
    open fun getRegionRect(): Rect2 {
        return _icall_Rect2(getRegionRectMethodBind, this.rawMemory)
    }


    private val setFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "set_frame") }
    open fun setFrame(frame: Long) {
        _icall_Unit_Long(setFrameMethodBind, this.rawMemory, frame)
    }


    private val getFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "get_frame") }
    open fun getFrame(): Long {
        return _icall_Long(getFrameMethodBind, this.rawMemory)
    }


    private val setVframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "set_vframes") }
    open fun setVframes(vframes: Long) {
        _icall_Unit_Long(setVframesMethodBind, this.rawMemory, vframes)
    }


    private val getVframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "get_vframes") }
    open fun getVframes(): Long {
        return _icall_Long(getVframesMethodBind, this.rawMemory)
    }


    private val setHframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "set_hframes") }
    open fun setHframes(hframes: Long) {
        _icall_Unit_Long(setHframesMethodBind, this.rawMemory, hframes)
    }


    private val getHframesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sprite3D", "get_hframes") }
    open fun getHframes(): Long {
        return _icall_Long(getHframesMethodBind, this.rawMemory)
    }


}
