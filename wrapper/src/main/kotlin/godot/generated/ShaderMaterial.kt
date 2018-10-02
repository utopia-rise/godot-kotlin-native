@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ShaderMaterial : Material {
    constructor() : super("ShaderMaterial")
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
        infix fun from(other: Material): ShaderMaterial = ShaderMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ShaderMaterial = ShaderMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ShaderMaterial = ShaderMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ShaderMaterial = ShaderMaterial("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ShaderMaterial = fromVariant(ShaderMaterial(""), other)


        // Constants


    }


    // Properties
    open var shader: Shader
        get() = _icall_Shader(getShaderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setShaderMethodBind, this.rawMemory, value)




    // Methods
    private val setShaderMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShaderMaterial", "set_shader") }
    open fun setShader(shader: Shader) {
        _icall_Unit_Object(setShaderMethodBind, this.rawMemory, shader)
    }


    private val getShaderMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShaderMaterial", "get_shader") }
    open fun getShader(): Shader {
        return _icall_Shader(getShaderMethodBind, this.rawMemory)
    }


    private val setShaderParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShaderMaterial", "set_shader_param") }
    open fun setShaderParam(param: String, value: Variant) {
        _icall_Unit_String_Variant(setShaderParamMethodBind, this.rawMemory, param, value)
    }


    private val getShaderParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("ShaderMaterial", "get_shader_param") }
    open fun getShaderParam(param: String): Variant {
        return _icall_Variant_String(getShaderParamMethodBind, this.rawMemory, param)
    }


    open fun _shader_changed() {
    }


}
