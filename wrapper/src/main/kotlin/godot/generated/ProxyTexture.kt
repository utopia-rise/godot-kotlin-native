@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ProxyTexture : Texture {
    constructor() : super("ProxyTexture")
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
        infix fun from(other: Texture): ProxyTexture = ProxyTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ProxyTexture = ProxyTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ProxyTexture = ProxyTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ProxyTexture = ProxyTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ProxyTexture = fromVariant(ProxyTexture(""), other)


        // Constants


    }


    // Properties
    open var base: Texture
        get() = _icall_Texture(getBaseMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setBaseMethodBind, this.rawMemory, value)




    // Methods
    private val setBaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProxyTexture", "set_base") }
    open fun setBase(base: Texture) {
        _icall_Unit_Object(setBaseMethodBind, this.rawMemory, base)
    }


    private val getBaseMethodBind: CPointer<godot_method_bind> by lazy { getMB("ProxyTexture", "get_base") }
    open fun getBase(): Texture {
        return _icall_Texture(getBaseMethodBind, this.rawMemory)
    }


}
