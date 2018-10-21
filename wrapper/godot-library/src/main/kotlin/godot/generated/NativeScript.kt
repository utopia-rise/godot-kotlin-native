@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class NativeScript : Script {
    constructor() : super("NativeScript")
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
        infix fun from(other: Script): NativeScript = NativeScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): NativeScript = NativeScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): NativeScript = NativeScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): NativeScript = NativeScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): NativeScript = fromVariant(NativeScript(""), other)


        // Constants


    }


    // Properties
    open var className: String
        get() = _icall_String(getClassNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setClassNameMethodBind, this.rawMemory, value)


    open var library: GDNativeLibrary
        get() = _icall_GDNativeLibrary(getLibraryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setLibraryMethodBind, this.rawMemory, value)




    // Methods
    private val setClassNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "set_class_name") }
    open fun setClassName(className: String) {
        _icall_Unit_String(setClassNameMethodBind, this.rawMemory, className)
    }


    private val getClassNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "get_class_name") }
    open fun getClassName(): String {
        return _icall_String(getClassNameMethodBind, this.rawMemory)
    }


    private val setLibraryMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "set_library") }
    open fun setLibrary(library: GDNativeLibrary) {
        _icall_Unit_Object(setLibraryMethodBind, this.rawMemory, library)
    }


    private val getLibraryMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "get_library") }
    open fun getLibrary(): GDNativeLibrary {
        return _icall_GDNativeLibrary(getLibraryMethodBind, this.rawMemory)
    }


    private val getClassDocumentationMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "get_class_documentation") }
    open fun getClassDocumentation(): String {
        return _icall_String(getClassDocumentationMethodBind, this.rawMemory)
    }


    private val getMethodDocumentationMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "get_method_documentation") }
    open fun getMethodDocumentation(method: String): String {
        return _icall_String_String(getMethodDocumentationMethodBind, this.rawMemory, method)
    }


    private val getSignalDocumentationMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "get_signal_documentation") }
    open fun getSignalDocumentation(signalName: String): String {
        return _icall_String_String(getSignalDocumentationMethodBind, this.rawMemory, signalName)
    }


    private val getPropertyDocumentationMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "get_property_documentation") }
    open fun getPropertyDocumentation(path: String): String {
        return _icall_String_String(getPropertyDocumentationMethodBind, this.rawMemory, path)
    }


    private val newMethodBind: CPointer<godot_method_bind> by lazy { getMB("NativeScript", "new") }
    open fun new(vararg __var_args: Any?): Object {
        return Object from _icall_varargs(newMethodBind, this.rawMemory, arrayOf(*__var_args))
    }


}
