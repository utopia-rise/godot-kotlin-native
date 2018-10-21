@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ResourceInteractiveLoader : Reference {
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
        infix fun from(other: Reference): ResourceInteractiveLoader = ResourceInteractiveLoader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ResourceInteractiveLoader = ResourceInteractiveLoader("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ResourceInteractiveLoader = fromVariant(ResourceInteractiveLoader(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourceInteractiveLoader", "get_resource") }
    open fun getResource(): Resource {
        return _icall_Resource(getResourceMethodBind, this.rawMemory)
    }


    private val pollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourceInteractiveLoader", "poll") }
    open fun poll(): GodotError {
        return GodotError.fromInt(_icall_Long(pollMethodBind, this.rawMemory))
    }


    private val waitMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourceInteractiveLoader", "wait") }
    open fun wait(): GodotError {
        return GodotError.fromInt(_icall_Long(waitMethodBind, this.rawMemory))
    }


    private val getStageMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourceInteractiveLoader", "get_stage") }
    open fun getStage(): Long {
        return _icall_Long(getStageMethodBind, this.rawMemory)
    }


    private val getStageCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ResourceInteractiveLoader", "get_stage_count") }
    open fun getStageCount(): Long {
        return _icall_Long(getStageCountMethodBind, this.rawMemory)
    }


}
