@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptResourcePath : VisualScriptNode {
    constructor() : super("VisualScriptResourcePath")
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
        infix fun from(other: VisualScriptNode): VisualScriptResourcePath = VisualScriptResourcePath("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptResourcePath = VisualScriptResourcePath("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptResourcePath = VisualScriptResourcePath("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptResourcePath = VisualScriptResourcePath("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptResourcePath = fromVariant(VisualScriptResourcePath(""), other)


        // Constants


    }


    // Properties
    open var path: String
        get() = _icall_String(getResourcePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setResourcePathMethodBind, this.rawMemory, value)




    // Methods
    private val setResourcePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptResourcePath", "set_resource_path") }
    open fun setResourcePath(path: String) {
        _icall_Unit_String(setResourcePathMethodBind, this.rawMemory, path)
    }


    private val getResourcePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptResourcePath", "get_resource_path") }
    open fun getResourcePath(): String {
        return _icall_String(getResourcePathMethodBind, this.rawMemory)
    }


}
