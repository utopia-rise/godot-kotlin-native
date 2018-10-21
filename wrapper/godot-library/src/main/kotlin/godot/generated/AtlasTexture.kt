@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AtlasTexture : Texture {
    constructor() : super("AtlasTexture")
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
        infix fun from(other: Texture): AtlasTexture = AtlasTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AtlasTexture = AtlasTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AtlasTexture = AtlasTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AtlasTexture = AtlasTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AtlasTexture = fromVariant(AtlasTexture(""), other)


        // Constants


    }


    // Properties
    open var atlas: Texture
        get() = _icall_Texture(getAtlasMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setAtlasMethodBind, this.rawMemory, value)


    open var region: Rect2
        get() = _icall_Rect2(getRegionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setRegionMethodBind, this.rawMemory, value)
    open fun region(shedule: (Rect2) -> Unit): Rect2 = region.apply {
        shedule(this)
        region = this
    }


    open var margin: Rect2
        get() = _icall_Rect2(getMarginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Rect2(setMarginMethodBind, this.rawMemory, value)
    open fun margin(shedule: (Rect2) -> Unit): Rect2 = margin.apply {
        shedule(this)
        margin = this
    }


    open var filterClip: Boolean
        get() = _icall_Boolean(hasFilterClipMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFilterClipMethodBind, this.rawMemory, value)




    // Methods
    private val setAtlasMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "set_atlas") }
    open fun setAtlas(atlas: Texture) {
        _icall_Unit_Object(setAtlasMethodBind, this.rawMemory, atlas)
    }


    private val getAtlasMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "get_atlas") }
    open fun getAtlas(): Texture {
        return _icall_Texture(getAtlasMethodBind, this.rawMemory)
    }


    private val setRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "set_region") }
    open fun setRegion(region: Rect2) {
        _icall_Unit_Rect2(setRegionMethodBind, this.rawMemory, region)
    }


    private val getRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "get_region") }
    open fun getRegion(): Rect2 {
        return _icall_Rect2(getRegionMethodBind, this.rawMemory)
    }


    private val setMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "set_margin") }
    open fun setMargin(margin: Rect2) {
        _icall_Unit_Rect2(setMarginMethodBind, this.rawMemory, margin)
    }


    private val getMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "get_margin") }
    open fun getMargin(): Rect2 {
        return _icall_Rect2(getMarginMethodBind, this.rawMemory)
    }


    private val setFilterClipMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "set_filter_clip") }
    open fun setFilterClip(enable: Boolean) {
        _icall_Unit_Boolean(setFilterClipMethodBind, this.rawMemory, enable)
    }


    private val hasFilterClipMethodBind: CPointer<godot_method_bind> by lazy { getMB("AtlasTexture", "has_filter_clip") }
    open fun hasFilterClip(): Boolean {
        return _icall_Boolean(hasFilterClipMethodBind, this.rawMemory)
    }


}
