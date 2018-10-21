@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptSceneTree : VisualScriptNode {
    constructor() : super("VisualScriptSceneTree")
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
        infix fun from(other: VisualScriptNode): VisualScriptSceneTree = VisualScriptSceneTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptSceneTree = VisualScriptSceneTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptSceneTree = VisualScriptSceneTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptSceneTree = VisualScriptSceneTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptSceneTree = fromVariant(VisualScriptSceneTree(""), other)


        // Constants


    }


    // Properties


    // Methods
}
