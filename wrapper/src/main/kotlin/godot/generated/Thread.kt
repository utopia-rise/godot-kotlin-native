@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Thread : Reference {
    constructor() : super("Thread")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Priority(val id: Long) {
        PRIORITY_LOW(0),
        PRIORITY_NORMAL(1),
        PRIORITY_HIGH(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Reference): Thread = Thread("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Thread = Thread("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Thread = fromVariant(Thread(""), other)


        // Constants
        const val PRIORITY_LOW: Long = 0
        const val PRIORITY_NORMAL: Long = 1
        const val PRIORITY_HIGH: Long = 2


    }


    // Properties


    // Methods
    private val startMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Thread", "start") }
    open fun start(instance: Object, method: String, userdata: Variant, priority: Long = 1): GodotError {
        return GodotError.fromInt(_icall_Long_Object_String_Variant_Long(startMethodBind, this.rawMemory, instance, method, userdata, priority))
    }


    private val getIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Thread", "get_id") }
    open fun getId(): String {
        return _icall_String(getIdMethodBind, this.rawMemory)
    }


    private val isActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Thread", "is_active") }
    open fun isActive(): Boolean {
        return _icall_Boolean(isActiveMethodBind, this.rawMemory)
    }


    private val waitToFinishMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Thread", "wait_to_finish") }
    open fun waitToFinish(): Variant {
        return _icall_Variant(waitToFinishMethodBind, this.rawMemory)
    }


}
