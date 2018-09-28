@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GDNative : Reference {
    constructor() : super("GDNative")
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
        infix fun from(other: Reference): GDNative = GDNative("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GDNative = GDNative("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GDNative = fromVariant(GDNative(""), other)


        // Constants


    }


    // Properties
    open var library: GDNativeLibrary
        get() = _icall_GDNativeLibrary(getLibraryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setLibraryMethodBind, this.rawMemory, value)




    // Methods
    private val setLibraryMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNative", "set_library") }
    open fun setLibrary(library: GDNativeLibrary) {
        _icall_Unit_Object(setLibraryMethodBind, this.rawMemory, library)
    }


    private val getLibraryMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNative", "get_library") }
    open fun getLibrary(): GDNativeLibrary {
        return _icall_GDNativeLibrary(getLibraryMethodBind, this.rawMemory)
    }


    private val initializeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNative", "initialize") }
    open fun initialize(): Boolean {
        return _icall_Boolean(initializeMethodBind, this.rawMemory)
    }


    private val terminateMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNative", "terminate") }
    open fun terminate(): Boolean {
        return _icall_Boolean(terminateMethodBind, this.rawMemory)
    }


    private val callNativeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNative", "call_native") }
    open fun callNative(callingType: String, procedureName: String, arguments: GDArray): Variant {
        return _icall_Variant_String_String_GDArray(callNativeMethodBind, this.rawMemory, callingType, procedureName, arguments)
    }


}
