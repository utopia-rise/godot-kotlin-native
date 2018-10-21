@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorScript : Reference {
    constructor() : super("EditorScript")
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
        infix fun from(other: Reference): EditorScript = EditorScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorScript = EditorScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorScript = fromVariant(EditorScript(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _run() {
    }


    private val addRootNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorScript", "add_root_node") }
    open fun addRootNode(node: Object) {
        _icall_Unit_Object(addRootNodeMethodBind, this.rawMemory, node)
    }


    private val getSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorScript", "get_scene") }
    open fun getScene(): Node {
        return _icall_Node(getSceneMethodBind, this.rawMemory)
    }


    private val getEditorInterfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorScript", "get_editor_interface") }
    open fun getEditorInterface(): EditorInterface {
        return _icall_EditorInterface(getEditorInterfaceMethodBind, this.rawMemory)
    }


}
