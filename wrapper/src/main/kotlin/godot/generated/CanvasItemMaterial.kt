@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CanvasItemMaterial : Material {
    constructor() : super("CanvasItemMaterial")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class LightMode(val id: Int) {
        LIGHT_MODE_NORMAL(0),
        LIGHT_MODE_UNSHADED(1),
        LIGHT_MODE_LIGHT_ONLY(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class BlendMode(val id: Int) {
        BLEND_MODE_MIX(0),
        BLEND_MODE_ADD(1),
        BLEND_MODE_SUB(2),
        BLEND_MODE_MUL(3),
        BLEND_MODE_PREMULT_ALPHA(4),
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
        infix fun from(other: Material): CanvasItemMaterial = CanvasItemMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CanvasItemMaterial = CanvasItemMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CanvasItemMaterial = CanvasItemMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CanvasItemMaterial = CanvasItemMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CanvasItemMaterial = fromVariant(CanvasItemMaterial(""), other)


        // Constants
        const val BLEND_MODE_MIX: Int = 0
        const val BLEND_MODE_ADD: Int = 1
        const val BLEND_MODE_SUB: Int = 2
        const val BLEND_MODE_MUL: Int = 3
        const val BLEND_MODE_PREMULT_ALPHA: Int = 4
        const val LIGHT_MODE_NORMAL: Int = 0
        const val LIGHT_MODE_UNSHADED: Int = 1
        const val LIGHT_MODE_LIGHT_ONLY: Int = 2


    }


    // Properties
    open var blendMode: Int
        get() = _icall_Int(getBlendModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBlendModeMethodBind, this.rawMemory, value)


    open var lightMode: Int
        get() = _icall_Int(getLightModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLightModeMethodBind, this.rawMemory, value)




    // Methods
    private val setBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItemMaterial", "set_blend_mode") }
    open fun setBlendMode(blendMode: Int) {
        _icall_Unit_Int(setBlendModeMethodBind, this.rawMemory, blendMode)
    }


    private val getBlendModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItemMaterial", "get_blend_mode") }
    open fun getBlendMode(): CanvasItemMaterial.BlendMode {
        return CanvasItemMaterial.BlendMode.fromInt(_icall_Int(getBlendModeMethodBind, this.rawMemory))
    }


    private val setLightModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItemMaterial", "set_light_mode") }
    open fun setLightMode(lightMode: Int) {
        _icall_Unit_Int(setLightModeMethodBind, this.rawMemory, lightMode)
    }


    private val getLightModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CanvasItemMaterial", "get_light_mode") }
    open fun getLightMode(): CanvasItemMaterial.LightMode {
        return CanvasItemMaterial.LightMode.fromInt(_icall_Int(getLightModeMethodBind, this.rawMemory))
    }


}
