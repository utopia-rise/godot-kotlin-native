@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptEditor : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val CUSTOM_NODES_UPDATED: String = "custom_nodes_updated"
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): VisualScriptEditor = VisualScriptEditor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptEditor = fromVariant(VisualScriptEditor(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("VisualScriptEditor", "_VisualScriptEditor") }


        // Properties


        // Methods
        private val addCustomNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_VisualScriptEditor", "add_custom_node") }
        fun addCustomNode(name: String, category: String, script: Script) {
            _icall_Unit_String_String_Object(addCustomNodeMethodBind, this.rawMemory, name, category, script)
        }


        private val removeCustomNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("_VisualScriptEditor", "remove_custom_node") }
        fun removeCustomNode(name: String, category: String) {
            _icall_Unit_String_String(removeCustomNodeMethodBind, this.rawMemory, name, category)
        }


    }
}
