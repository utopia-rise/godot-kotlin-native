@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class OmniLight : Light {
    constructor() : super("OmniLight")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ShadowMode(val id: Int) {
        SHADOW_DUAL_PARABOLOID(0),
        SHADOW_CUBE(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ShadowDetail(val id: Int) {
        SHADOW_DETAIL_VERTICAL(0),
        SHADOW_DETAIL_HORIZONTAL(1),
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
        infix fun from(other: Light): OmniLight = OmniLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): OmniLight = OmniLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): OmniLight = OmniLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): OmniLight = OmniLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): OmniLight = OmniLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): OmniLight = fromVariant(OmniLight(""), other)


        // Constants
        const val SHADOW_DUAL_PARABOLOID: Int = 0
        const val SHADOW_CUBE: Int = 1
        const val SHADOW_DETAIL_VERTICAL: Int = 0
        const val SHADOW_DETAIL_HORIZONTAL: Int = 1


    }


    // Properties
    open var omniShadowMode: Int
        get() = _icall_Int(getShadowModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setShadowModeMethodBind, this.rawMemory, value)


    open var omniShadowDetail: Int
        get() = _icall_Int(getShadowDetailMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setShadowDetailMethodBind, this.rawMemory, value)




    // Methods
    private val setShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("OmniLight", "set_shadow_mode") }
    open fun setShadowMode(mode: Int) {
        _icall_Unit_Int(setShadowModeMethodBind, this.rawMemory, mode)
    }


    private val getShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("OmniLight", "get_shadow_mode") }
    open fun getShadowMode(): OmniLight.ShadowMode {
        return OmniLight.ShadowMode.fromInt(_icall_Int(getShadowModeMethodBind, this.rawMemory))
    }


    private val setShadowDetailMethodBind: CPointer<godot_method_bind> by lazy { getMB("OmniLight", "set_shadow_detail") }
    open fun setShadowDetail(detail: Int) {
        _icall_Unit_Int(setShadowDetailMethodBind, this.rawMemory, detail)
    }


    private val getShadowDetailMethodBind: CPointer<godot_method_bind> by lazy { getMB("OmniLight", "get_shadow_detail") }
    open fun getShadowDetail(): OmniLight.ShadowDetail {
        return OmniLight.ShadowDetail.fromInt(_icall_Int(getShadowDetailMethodBind, this.rawMemory))
    }


}
