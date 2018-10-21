@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Shader : Resource {
    constructor() : super("Shader")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Long) {
        MODE_SPATIAL(0),
        MODE_CANVAS_ITEM(1),
        MODE_PARTICLES(2),
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
        infix fun from(other: Resource): Shader = Shader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Shader = Shader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Shader = Shader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Shader = fromVariant(Shader(""), other)


        // Constants
        const val MODE_SPATIAL: Long = 0
        const val MODE_CANVAS_ITEM: Long = 1
        const val MODE_PARTICLES: Long = 2


    }


    // Properties
    open var code: String
        get() = _icall_String(getCodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setCodeMethodBind, this.rawMemory, value)




    // Methods
    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shader", "get_mode") }
    open fun getMode(): Shader.Mode {
        return Shader.Mode.fromInt(_icall_Long(getModeMethodBind, this.rawMemory))
    }


    private val setCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shader", "set_code") }
    open fun setCode(code: String) {
        _icall_Unit_String(setCodeMethodBind, this.rawMemory, code)
    }


    private val getCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shader", "get_code") }
    open fun getCode(): String {
        return _icall_String(getCodeMethodBind, this.rawMemory)
    }


    private val setDefaultTextureParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shader", "set_default_texture_param") }
    open fun setDefaultTextureParam(param: String, texture: Texture) {
        _icall_Unit_String_Object(setDefaultTextureParamMethodBind, this.rawMemory, param, texture)
    }


    private val getDefaultTextureParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shader", "get_default_texture_param") }
    open fun getDefaultTextureParam(param: String): Texture {
        return _icall_Texture_String(getDefaultTextureParamMethodBind, this.rawMemory, param)
    }


    private val hasParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Shader", "has_param") }
    open fun hasParam(name: String): Boolean {
        return _icall_Boolean_String(hasParamMethodBind, this.rawMemory, name)
    }


}
