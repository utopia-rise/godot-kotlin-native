@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Texture : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Flags(val id: Long) {
        FLAG_MIPMAPS(1),
        FLAG_REPEAT(2),
        FLAG_FILTER(4),
        FLAGS_DEFAULT(7),
        FLAG_ANISOTROPIC_FILTER(8),
        FLAG_CONVERT_TO_LINEAR(16),
        FLAG_MIRRORED_REPEAT(32),
        FLAG_VIDEO_SURFACE(4096),
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
        infix fun from(other: Resource): Texture = Texture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Texture = Texture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Texture = Texture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Texture = fromVariant(Texture(""), other)


        // Constants
        const val FLAGS_DEFAULT: Long = 7
        const val FLAG_MIPMAPS: Long = 1
        const val FLAG_REPEAT: Long = 2
        const val FLAG_FILTER: Long = 4
        const val FLAG_ANISOTROPIC_FILTER: Long = 8
        const val FLAG_CONVERT_TO_LINEAR: Long = 16
        const val FLAG_MIRRORED_REPEAT: Long = 32
        const val FLAG_VIDEO_SURFACE: Long = 4096


    }


    // Properties
    open var flags: Long
        get() = _icall_Long(getFlagsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFlagsMethodBind, this.rawMemory, value)




    // Methods
    private val getWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "get_width") }
    open fun getWidth(): Long {
        return _icall_Long(getWidthMethodBind, this.rawMemory)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "get_height") }
    open fun getHeight(): Long {
        return _icall_Long(getHeightMethodBind, this.rawMemory)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


    private val hasAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "has_alpha") }
    open fun hasAlpha(): Boolean {
        return _icall_Boolean(hasAlphaMethodBind, this.rawMemory)
    }


    private val setFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "set_flags") }
    open fun setFlags(flags: Long) {
        _icall_Unit_Long(setFlagsMethodBind, this.rawMemory, flags)
    }


    private val getFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "get_flags") }
    open fun getFlags(): Long {
        return _icall_Long(getFlagsMethodBind, this.rawMemory)
    }


    private val drawMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "draw") }
    open fun draw(canvasItem: RID, position: Vector2, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: Texture) {
        _icall_Unit_RID_Vector2_Color_Boolean_Object(drawMethodBind, this.rawMemory, canvasItem, position, modulate, transpose, normalMap)
    }


    private val drawRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "draw_rect") }
    open fun drawRect(canvasItem: RID, rect: Rect2, tile: Boolean, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: Texture) {
        _icall_Unit_RID_Rect2_Boolean_Color_Boolean_Object(drawRectMethodBind, this.rawMemory, canvasItem, rect, tile, modulate, transpose, normalMap)
    }


    private val drawRectRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "draw_rect_region") }
    open fun drawRectRegion(canvasItem: RID, rect: Rect2, srcRect: Rect2, modulate: Color = Color(1,1,1,1), transpose: Boolean = false, normalMap: Texture, clipUv: Boolean = true) {
        _icall_Unit_RID_Rect2_Rect2_Color_Boolean_Object_Boolean(drawRectRegionMethodBind, this.rawMemory, canvasItem, rect, srcRect, modulate, transpose, normalMap, clipUv)
    }


    private val getDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Texture", "get_data") }
    open fun getData(): Image {
        return _icall_Image(getDataMethodBind, this.rawMemory)
    }


}
