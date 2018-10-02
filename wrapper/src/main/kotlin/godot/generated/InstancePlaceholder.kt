@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InstancePlaceholder : Node {
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


    companion object {
        infix fun from(other: Node): InstancePlaceholder = InstancePlaceholder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InstancePlaceholder = InstancePlaceholder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InstancePlaceholder = fromVariant(InstancePlaceholder(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getStoredValuesMethodBind: CPointer<godot_method_bind> by lazy { getMB("InstancePlaceholder", "get_stored_values") }
    open fun getStoredValues(withOrder: Boolean = false): Dictionary {
        return _icall_Dictionary_Boolean(getStoredValuesMethodBind, this.rawMemory, withOrder)
    }


    private val createInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("InstancePlaceholder", "create_instance") }
    open fun createInstance(replace: Boolean = false, customScene: PackedScene): Node {
        return _icall_Node_Boolean_Object(createInstanceMethodBind, this.rawMemory, replace, customScene)
    }


    private val replaceByInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("InstancePlaceholder", "replace_by_instance") }
    open fun replaceByInstance(customScene: PackedScene) {
        _icall_Unit_Object(replaceByInstanceMethodBind, this.rawMemory, customScene)
    }


    private val getInstancePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("InstancePlaceholder", "get_instance_path") }
    open fun getInstancePath(): String {
        return _icall_String(getInstancePathMethodBind, this.rawMemory)
    }


}
