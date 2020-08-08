package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.icalls._icall_GDNativeLibrary
import godot.icalls._icall_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_varargs
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class NativeScript internal constructor(
  _ignore: Any?
) : Script(_ignore) {
  open var className: String
    get() {
      val mb = getMethodBind("NativeScript","get_class_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NativeScript","set_class_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var library: GDNativeLibrary
    get() {
      val mb = getMethodBind("NativeScript","get_library")
      return _icall_GDNativeLibrary(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NativeScript","set_library")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var scriptClassIconPath: String
    get() {
      val mb = getMethodBind("NativeScript","get_script_class_icon_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NativeScript","set_script_class_icon_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var scriptClassName: String
    get() {
      val mb = getMethodBind("NativeScript","get_script_class_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("NativeScript","set_script_class_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("NativeScript", "NativeScript")
        }

  }

  open fun getClassDocumentation(): String {
    val mb = getMethodBind("NativeScript","get_class_documentation")
    return _icall_String( mb, this.ptr)
  }

  open fun getClassName(): String {
    val mb = getMethodBind("NativeScript","get_class_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getLibrary(): GDNativeLibrary {
    val mb = getMethodBind("NativeScript","get_library")
    return _icall_GDNativeLibrary( mb, this.ptr)
  }

  open fun getMethodDocumentation(method: String): String {
    val mb = getMethodBind("NativeScript","get_method_documentation")
    return _icall_String_String( mb, this.ptr, method)
  }

  open fun getPropertyDocumentation(path: String): String {
    val mb = getMethodBind("NativeScript","get_property_documentation")
    return _icall_String_String( mb, this.ptr, path)
  }

  open fun getScriptClassIconPath(): String {
    val mb = getMethodBind("NativeScript","get_script_class_icon_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getScriptClassName(): String {
    val mb = getMethodBind("NativeScript","get_script_class_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getSignalDocumentation(signalName: String): String {
    val mb = getMethodBind("NativeScript","get_signal_documentation")
    return _icall_String_String( mb, this.ptr, signalName)
  }

  open fun new(vararg __var_args: Any?): Variant {
    val mb = getMethodBind("NativeScript","new")
    return _icall_varargs( mb, this.ptr, __var_args)
  }

  open fun setClassName(className: String) {
    val mb = getMethodBind("NativeScript","set_class_name")
    _icall_Unit_String( mb, this.ptr, className)
  }

  open fun setLibrary(library: GDNativeLibrary) {
    val mb = getMethodBind("NativeScript","set_library")
    _icall_Unit_Object( mb, this.ptr, library)
  }

  open fun setScriptClassIconPath(iconPath: String) {
    val mb = getMethodBind("NativeScript","set_script_class_icon_path")
    _icall_Unit_String( mb, this.ptr, iconPath)
  }

  open fun setScriptClassName(className: String) {
    val mb = getMethodBind("NativeScript","set_script_class_name")
    _icall_Unit_String( mb, this.ptr, className)
  }

  companion object
}
