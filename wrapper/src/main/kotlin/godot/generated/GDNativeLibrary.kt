@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GDNativeLibrary : Resource {
    constructor() : super("GDNativeLibrary")
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
        infix fun from(other: Resource): GDNativeLibrary = GDNativeLibrary("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): GDNativeLibrary = GDNativeLibrary("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GDNativeLibrary = GDNativeLibrary("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GDNativeLibrary = fromVariant(GDNativeLibrary(""), other)


        // Constants


    }


    // Properties
    open var configFile: ConfigFile
        get() = _icall_ConfigFile(getConfigFileMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setConfigFileMethodBind, this.rawMemory, value)


    open var loadOnce: Boolean
        get() = _icall_Boolean(shouldLoadOnceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setLoadOnceMethodBind, this.rawMemory, value)


    open var singleton: Boolean
        get() = _icall_Boolean(isSingletonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSingletonMethodBind, this.rawMemory, value)


    open var symbolPrefix: String
        get() = _icall_String(getSymbolPrefixMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSymbolPrefixMethodBind, this.rawMemory, value)


    open var reloadable: Boolean
        get() = _icall_Boolean(isReloadableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setReloadableMethodBind, this.rawMemory, value)




    // Methods
    private val getConfigFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "get_config_file") }
    open fun getConfigFile(): ConfigFile {
        return _icall_ConfigFile(getConfigFileMethodBind, this.rawMemory)
    }


    private val setConfigFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "set_config_file") }
    open fun setConfigFile(configFile: ConfigFile) {
        _icall_Unit_Object(setConfigFileMethodBind, this.rawMemory, configFile)
    }


    private val getCurrentLibraryPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "get_current_library_path") }
    open fun getCurrentLibraryPath(): String {
        return _icall_String(getCurrentLibraryPathMethodBind, this.rawMemory)
    }


    private val getCurrentDependenciesMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "get_current_dependencies") }
    open fun getCurrentDependencies(): PoolStringArray {
        return _icall_PoolStringArray(getCurrentDependenciesMethodBind, this.rawMemory)
    }


    private val shouldLoadOnceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "should_load_once") }
    open fun shouldLoadOnce(): Boolean {
        return _icall_Boolean(shouldLoadOnceMethodBind, this.rawMemory)
    }


    private val isSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "is_singleton") }
    open fun isSingleton(): Boolean {
        return _icall_Boolean(isSingletonMethodBind, this.rawMemory)
    }


    private val getSymbolPrefixMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "get_symbol_prefix") }
    open fun getSymbolPrefix(): String {
        return _icall_String(getSymbolPrefixMethodBind, this.rawMemory)
    }


    private val isReloadableMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "is_reloadable") }
    open fun isReloadable(): Boolean {
        return _icall_Boolean(isReloadableMethodBind, this.rawMemory)
    }


    private val setLoadOnceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "set_load_once") }
    open fun setLoadOnce(loadOnce: Boolean) {
        _icall_Unit_Boolean(setLoadOnceMethodBind, this.rawMemory, loadOnce)
    }


    private val setSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "set_singleton") }
    open fun setSingleton(singleton: Boolean) {
        _icall_Unit_Boolean(setSingletonMethodBind, this.rawMemory, singleton)
    }


    private val setSymbolPrefixMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "set_symbol_prefix") }
    open fun setSymbolPrefix(symbolPrefix: String) {
        _icall_Unit_String(setSymbolPrefixMethodBind, this.rawMemory, symbolPrefix)
    }


    private val setReloadableMethodBind: CPointer<godot_method_bind> by lazy { getMB("GDNativeLibrary", "set_reloadable") }
    open fun setReloadable(reloadable: Boolean) {
        _icall_Unit_Boolean(setReloadableMethodBind, this.rawMemory, reloadable)
    }


}
