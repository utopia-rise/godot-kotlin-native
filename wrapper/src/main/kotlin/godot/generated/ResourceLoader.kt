@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ResourceLoader : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): ResourceLoader = ResourceLoader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ResourceLoader = fromVariant(ResourceLoader(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("ResourceLoader", "_ResourceLoader") }


        // Properties


        // Methods
        private val loadInteractiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceLoader", "load_interactive") }
        fun loadInteractive(path: String, typeHint: String = ""): ResourceInteractiveLoader {
            return _icall_ResourceInteractiveLoader_String_String(loadInteractiveMethodBind, this.rawMemory, path, typeHint)
        }


        private val loadMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceLoader", "load") }
        fun load(path: String, typeHint: String = "", pNoCache: Boolean = false): Resource {
            return _icall_Resource_String_String_Boolean(loadMethodBind, this.rawMemory, path, typeHint, pNoCache)
        }


        private val getRecognizedExtensionsForTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceLoader", "get_recognized_extensions_for_type") }
        fun getRecognizedExtensionsForType(type: String): PoolStringArray {
            return _icall_PoolStringArray_String(getRecognizedExtensionsForTypeMethodBind, this.rawMemory, type)
        }


        private val setAbortOnMissingResourcesMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceLoader", "set_abort_on_missing_resources") }
        fun setAbortOnMissingResources(abort: Boolean) {
            _icall_Unit_Boolean(setAbortOnMissingResourcesMethodBind, this.rawMemory, abort)
        }


        private val getDependenciesMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceLoader", "get_dependencies") }
        fun getDependencies(path: String): PoolStringArray {
            return _icall_PoolStringArray_String(getDependenciesMethodBind, this.rawMemory, path)
        }


        private val hasMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceLoader", "has") }
        fun has(path: String): Boolean {
            return _icall_Boolean_String(hasMethodBind, this.rawMemory, path)
        }


    }
}
