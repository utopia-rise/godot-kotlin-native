package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_ConfigFile
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class GDNativeLibrary internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var configFile: ConfigFile
    get() {
      val mb = getMethodBind("GDNativeLibrary","get_config_file")
      return _icall_ConfigFile(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GDNativeLibrary","set_config_file")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var loadOnce: Boolean
    get() {
      val mb = getMethodBind("GDNativeLibrary","should_load_once")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GDNativeLibrary","set_load_once")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var reloadable: Boolean
    get() {
      val mb = getMethodBind("GDNativeLibrary","is_reloadable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GDNativeLibrary","set_reloadable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var singleton: Boolean
    get() {
      val mb = getMethodBind("GDNativeLibrary","is_singleton")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GDNativeLibrary","set_singleton")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var symbolPrefix: String
    get() {
      val mb = getMethodBind("GDNativeLibrary","get_symbol_prefix")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GDNativeLibrary","set_symbol_prefix")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GDNativeLibrary", "GDNativeLibrary")
        }

  }

  open fun getConfigFile(): ConfigFile {
    val mb = getMethodBind("GDNativeLibrary","get_config_file")
    return _icall_ConfigFile( mb, this.ptr)
  }

  open fun getCurrentDependencies(): PoolStringArray {
    val mb = getMethodBind("GDNativeLibrary","get_current_dependencies")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getCurrentLibraryPath(): String {
    val mb = getMethodBind("GDNativeLibrary","get_current_library_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getSymbolPrefix(): String {
    val mb = getMethodBind("GDNativeLibrary","get_symbol_prefix")
    return _icall_String( mb, this.ptr)
  }

  open fun isReloadable(): Boolean {
    val mb = getMethodBind("GDNativeLibrary","is_reloadable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSingleton(): Boolean {
    val mb = getMethodBind("GDNativeLibrary","is_singleton")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setConfigFile(configFile: ConfigFile) {
    val mb = getMethodBind("GDNativeLibrary","set_config_file")
    _icall_Unit_Object( mb, this.ptr, configFile)
  }

  open fun setLoadOnce(loadOnce: Boolean) {
    val mb = getMethodBind("GDNativeLibrary","set_load_once")
    _icall_Unit_Boolean( mb, this.ptr, loadOnce)
  }

  open fun setReloadable(reloadable: Boolean) {
    val mb = getMethodBind("GDNativeLibrary","set_reloadable")
    _icall_Unit_Boolean( mb, this.ptr, reloadable)
  }

  open fun setSingleton(singleton: Boolean) {
    val mb = getMethodBind("GDNativeLibrary","set_singleton")
    _icall_Unit_Boolean( mb, this.ptr, singleton)
  }

  open fun setSymbolPrefix(symbolPrefix: String) {
    val mb = getMethodBind("GDNativeLibrary","set_symbol_prefix")
    _icall_Unit_String( mb, this.ptr, symbolPrefix)
  }

  open fun shouldLoadOnce(): Boolean {
    val mb = getMethodBind("GDNativeLibrary","should_load_once")
    return _icall_Boolean( mb, this.ptr)
  }

  companion object
}
